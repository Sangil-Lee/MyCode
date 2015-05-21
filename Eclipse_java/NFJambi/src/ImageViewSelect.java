/********************************************************************************
 ** Form generated from reading ui file 'ImageViewSelect.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Vector;

import com.mysql.jdbc.ResultSetMetaData;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class ImageViewSelect implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton okButton;
    public QPushButton cancelButton;
    public QCheckBox time10;
    public QCheckBox time400;
    public QCheckBox sogul1;
    public QCheckBox sogul2;
    public QCheckBox sogul3;
    public QCheckBox sogul4;
    public QLabel preview;
    public QListWidget imgList;
    public QLabel label_3;
    public QFrame frame;
    public QButtonGroup selImage;
    
    private int gid;
    private int id;
    private int fileindex;
    private List <QTableWidgetItem> itemlist;
    private String gfilename;
    private QWidget widget;
    
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String menuButton = "QPushButton {image: url(classpath:images/menu_empty.png)};";
	final String homemenuButton = "QPushButton {image: url(classpath:images/home.png)};";
	final String checkSytle  = "QCheckBox {background: transparent}";
	final String editStyle = "QLineEdit {background:white; color:blue;}";
	final String tableSytle = "QHeaderView::section {background-color:lightblue; color: black; font-family: arial; font-size:12px;}";
	final String labelStyle = "QLabel {background:transparent}";
	
    public ImageViewSelect(QWidget wid) { super(); setupUi(wid);}
    public ImageViewSelect(int grpid, QWidget wid) { super(); gid=grpid; setupUi(wid);}

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
        
        frame = new QFrame(Form);
        frame.setObjectName("frame");
        frame.setGeometry(new QRect(60, 100, 891, 91));
        frame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Plain);
        
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
        
        okButton = new QPushButton(Form);
        okButton.setObjectName("okButton");
        okButton.setGeometry(new QRect(890, 950, 180, 45));
        okButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        okButton.setFont(font);
        
        cancelButton = new QPushButton(Form);
        cancelButton.setObjectName("cancelButton");
        cancelButton.setGeometry(new QRect(1080, 950, 180, 45));
        cancelButton.setStyleSheet(styleButton);
        cancelButton.setFont(font);
        
        time10 = new QCheckBox(Form);
        selImage = new QButtonGroup(Form);
        selImage.addButton(time10);
        time10.setObjectName("time10");
        time10.setGeometry(new QRect(80, 110, 121, 31));
        time10.setStyleSheet(checkSytle);
        font.setPointSize(15);
        font.setBold(true);
        font.setWeight(75);
        time10.setFont(font);
        time10.setIconSize(new QSize(16, 16));
        
        time400 = new QCheckBox(Form);
        selImage.addButton(time400);
        time400.setObjectName("time400");
        time400.setGeometry(new QRect(290, 110, 121, 31));
        time400.setStyleSheet(checkSytle);
        time400.setFont(font);
        time400.setIconSize(new QSize(16, 16));
        
        sogul1 = new QCheckBox(Form);
        selImage.addButton(sogul1);
        sogul1.setObjectName("sogul1");
        sogul1.setGeometry(new QRect(500, 110, 201, 31));
        sogul1.setStyleSheet(checkSytle);
        sogul1.setFont(font);
        sogul1.setIconSize(new QSize(16, 16));
        
        sogul2 = new QCheckBox(Form);
        selImage.addButton(sogul2);
        sogul2.setObjectName("sogul2");
        sogul2.setGeometry(new QRect(80, 150, 191, 31));
        sogul2.setStyleSheet(checkSytle);
        sogul2.setFont(font);
        sogul2.setIconSize(new QSize(16, 16));
        
        sogul3 = new QCheckBox(Form);
        selImage.addButton(sogul3);
        sogul3.setObjectName("sogul3");
        sogul3.setGeometry(new QRect(290, 150, 201, 31));
        sogul3.setStyleSheet(checkSytle);
        sogul3.setFont(font);
        sogul3.setIconSize(new QSize(16, 16));
        
        sogul4 = new QCheckBox(Form);
        selImage.addButton(sogul4);
        sogul4.setObjectName("sogul4");
        sogul4.setGeometry(new QRect(500, 150, 201, 31));
        sogul4.setStyleSheet(checkSytle);
        sogul4.setFont(font);
        sogul4.setIconSize(new QSize(16, 16));
  
        preview = new QLabel(Form);
        preview.setObjectName("preview");
        preview.setGeometry(new QRect(740, 300, 520, 610));
        preview.setAutoFillBackground(false);
        preview.setStyleSheet(labelStyle);
        preview.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
       
        imgList = new QListWidget(Form);
        imgList.setObjectName("imgList");
        imgList.setGeometry(new QRect(60, 260, 651, 651));
        imgList.setAutoFillBackground(true);
        imgList.setViewMode(com.trolltech.qt.gui.QListView.ViewMode.ListMode);
        font.setPointSize(16);
        imgList.setFont(font);
      
        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(860, 260, 251, 31));
        label_3.setStyleSheet(labelStyle);
        label_3.setFont(font);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        retranslateUi(Form);
        connectSignalSlot();
        setEnableCheckBox();
        
        centerWidget();
        widget.show();
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
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Image View Select", null));
        okButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "O K", null));
        cancelButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Cancel", null));
        time10.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "10 \ubc30\uc728", null));
        time400.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "400 \ubc30\uc728", null));
        sogul1.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc18c\uacb0\uccb4 \uade0\uc9c8\ub3c4 #1", null));
        sogul2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc18c\uacb0\uccb4 \uade0\uc9c8\ub3c4 #2", null));
        sogul3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc18c\uacb0\uccb4 \uade0\uc9c8\ub3c4 #3", null));
        sogul4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc18c\uacb0\uccb4 \uade0\uc9c8\ub3c4 #4", null));
        preview.setText("");
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Preview", null));
    } // retranslateUi

    void connectSignalSlot()
    {
    	okButton.pressed.connect(this, "Image()");
    	cancelButton.pressed.connect(this, "Close()");
    	//selImage.buttonClicked.connect(this, "SelectImage(QAbstractButton)");
    	selImage.buttonIdClicked.connect(this, "SelectImageID(Integer)");
    	imgList.currentTextChanged.connect(this, "ChangedItem(String)");
    	imgList.currentRowChanged.connect(this, "ChangedItem(Integer)");
    }
    void Close()
    {
    	widget.close();
    }
    void ChangedItem(Integer index)
    {
    	fileindex = index;
    	System.out.println("Index: " + index);
    }
    
    void ChangedItem(String item)
    {
    	System.out.println(item);
    	item.replaceAll("\\\\", "/");
    	gfilename = item;
    	//String file = "C:/imgdata/sogul/10times/c.png";
    	QPixmap pix = new QPixmap();
    	pix.load(item);
    	//pix.load(file);
		preview.setPixmap(pix.scaled(preview.size()));
    }
    
    void setEnableCheckBox()
    {
    	System.out.println("GroupID: " + gid);
    	if(gid == 5 )
    	{
    		sogul1.hide();
    		sogul2.hide();
    		sogul3.hide();
    		sogul4.hide();
    	}
    	else
    	{
    		sogul1.show();
    		sogul2.show();
    		sogul3.show();
    		sogul4.show();
    	}
    }
 
    void SelectImageID(Integer sel)
    {
    	id = Math.abs(sel);
    	imgList.clear();
    	for(int i=0; i < itemlist.size(); i++)
    	{
    		String filename = itemlist.get(i).text();
    		if(filename.isEmpty() == true) continue;
    		
    		switch(id)
    		{
    			case 2:
    				if(filename.contains("10times") == true)
    				{
    					imgList.addItem(filename);
    					continue;
    				};
    			    break;
    			case 3:
    				if(filename.contains("100times") == true || filename.contains("400times") == true)
    				{
    					imgList.addItem(filename);
    					continue;
    				}
    				break;
    			case 4:
    				if(filename.contains("sogul_1") == true)
    				{
    					imgList.addItem(filename);
    					continue;
    				}
    				break;
    			case 5:
    				if(filename.contains("sogul_2") == true)
    				{
    					imgList.addItem(filename);
    					continue;
    				}
    				break;
    			case 6:
    				if(filename.contains("sogul_3") == true)
    				{
    					imgList.addItem(filename);
    					continue;
    				}
    				break;
    			case 7:
    				if(filename.contains("sogul_4") == true)
    				{
    					imgList.addItem(filename);
    					continue;
    				}
    				break;
    			default:
    				break;
    		}
    	}
    }
    
    void SelectedImage()
    {
    	
    
    }
    
    void Select ()
    {
    	Connection con = null;
    	java.sql.Statement st = null;
   		ResultSet rs = null;
   		
   		String table = "";
   		if(gid == 5) table = "cat3sogul";
   		else table = "cat3gdpellet";
   		
   		int id = Math.abs(selImage.checkedId());
   		
   		String strsql = "select from " + table;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			rs = st.executeQuery(strsql);
			
			while(rs.next())
			{
		        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();

		        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		           
		            String fieldName = rsmd.getColumnName(i);
		            if (fieldName.compareToIgnoreCase("iin") == 0) fieldName = "in";
		        
		            int type = rsmd.getColumnType(i);
		            String strresult = "";
		            
		            switch(type)
		            {
		            	case Types.DOUBLE:
		            		Double dvalue = rs.getDouble(i);
			                strresult = String.valueOf(dvalue);
		            		break;
		            	default:
		            		strresult = rs.getString(i);
		            		break;
		            }
		            		        
		            QTableWidgetItem colItem = new QTableWidgetItem();
					colItem.setText(strresult);
			    };
			};
			rs.close();			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    void Image()
    {
    	final ImageView imgview = new ImageView(gfilename, new QWidget());
    	Vector <String> vecList = new Vector<String>();
    	
    	for ( int i = 0; i < imgList.count(); i++)
    	{
    		String strlist = imgList.item(i).text();
    		vecList.add(strlist);
    	}
    	
    	imgview.SetImageList (vecList, fileindex);
    }
    
    void SetImageList(List<QTableWidgetItem> items)
    {
    	itemlist = items;
    	
    	for(int i=0; i < itemlist.size(); i++)
    	{
    		String filename = itemlist.get(i).text();
    		if(filename.isEmpty() == true) continue;
    		imgList.addItem(filename);
    		
    		//System.out.println("SelectedItem: " + itemlist.get(i).text());
    		
    	}
    }
}

