/********************************************************************************
 ** Form generated from reading ui file 'Cat3FuelSearch.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.jdbc.ResultSetMetaData;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Cat3FuelSearch implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton imgviewButton;
    public QLineEdit displayEdit;
    public QLineEdit partEdit;
    public QLabel label_2;
    public QLabel label_3;
    public QTreeWidget setFueltreeWidget;
    public QPushButton mMenuButton;
    public QPushButton cMenuButton;
    public QLabel label_4;
    public QLabel label_5;
    public QComboBox comboBox;
    public QLabel preview;
    
    private QWidget widget;
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String menuButton = "QPushButton {image: url(classpath:images/menu_empty.png)};";
	final String homemenuButton = "QPushButton {image: url(classpath:images/home.png)};";
	final String checkSytle  = "QCheckBox {background: transparent}";
	final String combStyle = "QComboBox {background:white; color:blue;}";
	final String editStyle = "QLineEdit {background:white; color:blue;}";
	final String treeSytle = "QTreeWidget {background:transparent; color: white; font-family: arial; font-size:16px;}";
	final String treeHeaderSytle = "background:gray; color: black; font-family: arial; font-size:16px;";
    
    public Cat3FuelSearch(QWidget wid) { super(); setupUi(wid);}

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
        label.setGeometry(new QRect(280, 90, 601, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        imgviewButton = new QPushButton(Form);
        imgviewButton.setObjectName("imgviewButton");
        imgviewButton.setGeometry(new QRect(1020, 950, 180, 45));
        imgviewButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        imgviewButton.setFont(font);
        
        displayEdit = new QLineEdit(Form);
        displayEdit.setObjectName("displayEdit");
        displayEdit.setGeometry(new QRect(270, 320, 810, 40));
        displayEdit.setStyleSheet(editStyle);
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        displayEdit.setFont(font);
        
        partEdit = new QLineEdit(Form);
        partEdit.setObjectName("partEdit");
        partEdit.setGeometry(new QRect(270, 260, 810, 40));
        partEdit.setStyleSheet(editStyle);
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        partEdit.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(150, 260, 101, 31));
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(false);
        font.setWeight(50);
        font.setKerning(false);
        label_2.setFont(font);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(210, 330, 41, 31));
        label_3.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(false);
        font.setWeight(50);
        font.setKerning(false);
        label_3.setFont(font);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        setFueltreeWidget = new QTreeWidget(Form);
        setFueltreeWidget.setObjectName("setFueltreeWidget");
        setFueltreeWidget.setGeometry(new QRect(150, 430, 611, 501));
        setFueltreeWidget.setStyleSheet(treeSytle);
        setFueltreeWidget.header().setStyleSheet(treeHeaderSytle);
        
        QFont font6 = new QFont();
        font6.setPointSize(12);
        setFueltreeWidget.setFont(font6);
        
        mMenuButton = new QPushButton(Form);
        mMenuButton.setObjectName("mMenuButton");
        mMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mMenuButton.setStyleSheet(homemenuButton);
        
        cMenuButton = new QPushButton(Form);
        cMenuButton.setObjectName("cMenuButton");
        cMenuButton.setGeometry(new QRect(91, 0, 90, 60));
        cMenuButton.setStyleSheet(menuButton);
        font.setPointSize(10);
        font.setBold(true);
        font.setWeight(75);
        cMenuButton.setFont(font);

        label_4 = new QLabel(Form);
        label_4.setObjectName("label_4");
        label_4.setGeometry(new QRect(150, 200, 111, 31));
        label_4.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(false);
        font.setWeight(50);
        font.setKerning(false);
        label_4.setFont(font);
        label_4.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
       
        label_5 = new QLabel(Form);
        label_5.setObjectName("label_5");
        label_5.setGeometry(new QRect(780, 390, 101, 31));
        label_5.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(false);
        font.setWeight(50);
        font.setKerning(false);
        label_5.setFont(font);
        label_5.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
  
        comboBox = new QComboBox(Form);
        comboBox.setObjectName("comboBox");
        comboBox.setGeometry(new QRect(270, 200, 201, 41));
        comboBox.setStyleSheet(combStyle);
        font.setPointSize(16);
        font.setBold(true);
        comboBox.setFont(font);
        
        preview = new QLabel(Form);
        preview.setObjectName("preview");
        preview.setGeometry(new QRect(780, 430, 481, 501));
        preview.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        
        retranslateUi(Form);
        connectSignalSlot();
        
        centerWidget();
        Tablelist();
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
    void Tablelist()
    {
    	Connection con = null;
    	java.sql.Statement st = null;
   		ResultSet rs = null;
   		comboBox.clear();
   		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();

			DatabaseMetaData md = con.getMetaData();
			rs = md.getTables(null, null, "setid_%", null);
			comboBox.addItem("Set ID");
			while (rs.next()) {
			  //System.out.println(rs.getString(3));
			  comboBox.addItem(rs.getString(3));
			}
			rs.close();			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    void connectSignalSlot()
    {
    	//comboBox.currentStringChanged.connect(this, "SetIDName(String)");
    	comboBox.currentIndexChanged.connect(this, "SetID(Integer)");
        setFueltreeWidget.itemDoubleClicked.connect(partEdit, "repaint()");
        imgviewButton.pressed.connect(this, "ImageView()");
        mMenuButton.pressed.connect(this, "Home()");
        cMenuButton.pressed.connect(this,"Cat3Search()");
    }
    
    void Home()
    {
    	ViewDB view = new ViewDB(new QWidget());
    	widget.close();
    }
    
    void Cat3Search()
    {
    	Cat3Search catsearch = new Cat3Search(new QWidget());
    	widget.close();
    }
    
    void SetID(Integer setid)
    {
    	Connection con = null;
    	java.sql.Statement st = null;
   		ResultSet rs = null;
   		
   		int id = setid.intValue();
   		
   		if (id <= 0)  return;

   		System.out.println("SetID : " + setid + ", SetIDName: " + comboBox.itemText(id));
   		
   		String strsql = "select * from " + comboBox.itemText(id);
   		
   		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			rs = st.executeQuery(strsql);
			String partID = "";
			String imageName = "";
		    while(rs.next()){
		         //Retrieve by column name
		    	 partID = rs.getString(2);
		         imageName = rs.getString(3);
		         System.out.println("Part: " + partID + ", Inamge: " + imageName);
		      }
		    partEdit.setText(partID);
	        displayEdit.setText(imageName);
	        
	        Preview(imageName);
	     
			rs.close();			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
   		
    }
    
    void Preview(String fileName)
    {
    	QPixmap pix = new QPixmap();
    	pix.load(fileName);
    	preview.setPixmap(pix.scaled(preview.size()));
	}
     
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category III Fuel  Assembly", null));
        imgviewButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Image View", null));
        displayEdit.setText("");
        partEdit.setText("");
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Part \uba85", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ub3c4\uba74", null));
        setFueltreeWidget.headerItem().setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc5f0\ub8cc \uc9d1\ud569\uccb4", null));
        setFueltreeWidget.clear();

        QTreeWidgetItem __item = new QTreeWidgetItem(setFueltreeWidget);
        __item.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc0c1\ubd80\uc9c0\uc9c0\uccb4", null));

        QTreeWidgetItem __item1 = new QTreeWidgetItem(__item);
        __item1.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 1", null));

        QTreeWidgetItem __item2 = new QTreeWidgetItem(__item1);
        __item2.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 2", null));

        QTreeWidgetItem __item3 = new QTreeWidgetItem(__item2);
        __item3.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 3", null));

        QTreeWidgetItem __item4 = new QTreeWidgetItem(__item);
        __item4.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 1-1", null));

        QTreeWidgetItem __item5 = new QTreeWidgetItem(__item4);
        __item5.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 2-1", null));

        QTreeWidgetItem __item6 = new QTreeWidgetItem(__item5);
        __item6.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 3-1", null));

        QTreeWidgetItem __item7 = new QTreeWidgetItem(setFueltreeWidget);
        __item7.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc911\uac04\uc9c0\uc9c0\uccb4", null));

        QTreeWidgetItem __item8 = new QTreeWidgetItem(__item7);
        __item8.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 1", null));

        QTreeWidgetItem __item9 = new QTreeWidgetItem(__item8);
        __item9.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 2", null));

        QTreeWidgetItem __item10 = new QTreeWidgetItem(__item9);
        __item10.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 3", null));

        QTreeWidgetItem __item11 = new QTreeWidgetItem(__item7);
        __item11.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 1-1", null));

        QTreeWidgetItem __item12 = new QTreeWidgetItem(__item11);
        __item12.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 2-1", null));

        QTreeWidgetItem __item13 = new QTreeWidgetItem(__item12);
        __item13.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 3-1", null));

        QTreeWidgetItem __item14 = new QTreeWidgetItem(setFueltreeWidget);
        __item14.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "\ud558\ubd80\uc9c0\uc9c0\uccb4", null));

        QTreeWidgetItem __item15 = new QTreeWidgetItem(__item14);
        __item15.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 1", null));

        QTreeWidgetItem __item16 = new QTreeWidgetItem(__item15);
        __item16.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 2", null));

        QTreeWidgetItem __item17 = new QTreeWidgetItem(__item16);
        __item17.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 3", null));

        QTreeWidgetItem __item18 = new QTreeWidgetItem(__item14);
        __item18.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 1-1", null));

        QTreeWidgetItem __item19 = new QTreeWidgetItem(__item18);
        __item19.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 2-1", null));

        QTreeWidgetItem __item20 = new QTreeWidgetItem(__item19);
        __item20.setText(0, com.trolltech.qt.core.QCoreApplication.translate("Form", "Level 3-1", null));

        cMenuButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category 3\nMenu", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc9d1\ud569\uccb4 ID", null));
        comboBox.clear();
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "ID", null));
        preview.setText("");
    } // retranslateUi

    void ImageView()
    {
    	String filename = displayEdit.text();
    	File f = new File(filename);

    	// 파일 존재 여부 판단
    	if (f.isFile()) 
    	{
        	Cat3FuelImage img = new Cat3FuelImage(new QWidget());
        	img.ImageView(filename);
    	}
    	 else 
    	 {
    	      System.out.println("File not found: " + filename);
    	 }
    	
    }
}

