
import com.trolltech.qt.core.*;
import com.trolltech.qt.core.Qt.AspectRatioMode;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.gui.QFileDialog.Filter;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class ImageView implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton fileimgButton;
    public QWidget gridLayoutWidget;
    public QGridLayout srcLayout;
    public QWidget gridLayoutWidget_2;
    public QGridLayout orgLayout;
	
    public QPushButton prevButton;
    public QPushButton nextButton;
    public QLabel label_2;
    public QLabel label_3;
    public QPushButton closeButton;
    
    private QWidget widget;
    private String filename;
    private int    fileindex;
    private Vector<String> vecImgList = new Vector<String> ();
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; padding: 6px;}";

    
    public ImageView(final String file, QWidget wid) { super(); filename = file; setupUi(wid);}

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.resize(new QSize(1280, 1024).expandedTo(Form.minimumSizeHint()));
        Form.setMinimumSize(1280, 1024);
     	Form.setMaximumSize(1280, 1024);
     	Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        Form.setAutoFillBackground(true);
        Form.setStyleSheet(strStyle);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(300, 0, 601, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        fileimgButton = new QPushButton(Form);
        fileimgButton.setObjectName("fileimgButton");
        fileimgButton.setGeometry(new QRect(180, 950, 180, 45));
        fileimgButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        fileimgButton.setFont(font);
        
        gridLayoutWidget = new QWidget(Form);
        gridLayoutWidget.setObjectName("gridLayoutWidget");
        gridLayoutWidget.setGeometry(new QRect(10, 130, 541, 801));
        srcLayout = new QGridLayout(gridLayoutWidget);
        srcLayout.setObjectName("srcLayout");
        srcLayout.setContentsMargins(0, -1, -1, -1);
        gridLayoutWidget_2 = new QWidget(Form);
        gridLayoutWidget_2.setObjectName("gridLayoutWidget_2");
        gridLayoutWidget_2.setGeometry(new QRect(560, 130, 581, 801));
        orgLayout = new QGridLayout(gridLayoutWidget_2);
        orgLayout.setObjectName("orgLayout");
        orgLayout.setContentsMargins(0, -1, -1, -1);
        
        prevButton = new QPushButton(Form);
        prevButton.setObjectName("prevButton");
        prevButton.setGeometry(new QRect(1150, 220, 100, 45));
        prevButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        prevButton.setFont(font);
        
        nextButton = new QPushButton(Form);
        nextButton.setObjectName("nextButton");
        nextButton.setGeometry(new QRect(1150, 280, 100, 45));
        nextButton.setStyleSheet(styleButton);
        nextButton.setFont(font);
       
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(710, 90, 291, 31));
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
       
        QFont lblFont = new QFont();
        lblFont.setPointSize(20);
        lblFont.setBold(true);
        lblFont.setWeight(75);
        label_2.setFont(lblFont);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(140, 90, 291, 31));
        label_3.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_3.setFont(lblFont);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
    
        closeButton = new QPushButton(Form);
        closeButton.setObjectName("closeButton");
        closeButton.setGeometry(new QRect(1090, 950, 180, 45));
        closeButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        closeButton.setFont(font);
        
        retranslateUi(Form);
        dbImage();
        
        centerWidget();
        Form.show();

        connectSignalSlot();
        Form.connectSlotsByName();
    } // setupUi

    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, 0);
        
    }
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Image View", null));
        fileimgButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "File Image", null));
        prevButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "<< Prev", null));
        nextButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Next >>", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Database Image", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "New Image", null));
        closeButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Close", null));
    } // retranslateUi

    void connectSignalSlot()
    {
    	fileimgButton.pressed.connect(this, "fileImage()");
    	prevButton.pressed.connect(this, "prevImage()");
    	nextButton.pressed.connect(this, "nextImage()");
    	closeButton.pressed.connect(this,"Close()");
    }
    void Close()
    {
    	widget.close();
    }
    void fileImage()
    {
    	QFileDialog.Filter filter = new QFileDialog.Filter("JPEG (*.jpg *.jpeg);; PNG (*.png)");
    	String fileName = QFileDialog.getOpenFileName(widget, "Open File", QDir.currentPath(), filter);

    	QPixmap pix = new QPixmap();
    	pix.load(fileName);
    	
		QLabel label = new QLabel();
		//label.setPixmap(pix);
		label.setPixmap(pix.scaled(label.size()));
		srcLayout.addWidget(label);
    }
    
    void SetImageList (Vector <String> itemlist, final int index)
    {
    	vecImgList = itemlist; 
    	fileindex = index;
    	for(int i = 0; i < vecImgList.size();i++)
    		System.out.println("Image List" + vecImgList.elementAt(i));
    }
    
    void prevImage()
    {
       	fileindex--;
    	if(fileindex < 0)
    	{
    		fileindex++;
    		return;
    	}
    	
    	String item = vecImgList.elementAt(fileindex);
    	filename = item;
    	dbImage();
    }
    
    void nextImage()
    {
    	fileindex++;

    	if(fileindex >= vecImgList.size() ) 
    	{
    		fileindex--;
    		return;
    	}
    	
    	String item = vecImgList.elementAt(fileindex);
    	filename = item;
    	dbImage();
   	 }
    
    void dbImage()
    {
    	QPixmap pix = new QPixmap();
    	pix.load(filename);
	    
		QLabel label = new QLabel();
		label.setPixmap(pix.scaled(label.size()));
		if(orgLayout.isEmpty() == false)
			orgLayout.removeItem(orgLayout.itemAt(0));
		orgLayout.addWidget(label);
    }
    
    void dbImg()
    {
		Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			
	    	String strsql = "select id, name, photo from mypictures where id = 1";
			rs = st.executeQuery(strsql);
			
			while(rs.next())
			{
		         //Retrieve by column name
		        int id  = rs.getInt("id");
		        String name = rs.getString("name");
		        InputStream img = rs.getBinaryStream("photo");
		         		              
		        QPixmap pix = new QPixmap();
		        byte[] bytes;
				try {
					bytes = IOUtils.toByteArray(img);
					pix.loadFromData(bytes);
									
					//pix.scaled(100, 200,Qt.AspectRatioMode.KeepAspectRatioByExpanding);	
										
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
				QLabel label = new QLabel();
				label.setPixmap(pix);
				orgLayout.addWidget(label);
								
		    }
		   rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
    }
}

