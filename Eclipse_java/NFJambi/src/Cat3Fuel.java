
/********************************************************************************
 ** Form generated from reading ui file 'Cat3Fuel.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

public class Cat3Fuel implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton searchButton;
    public QPushButton dbsaveButton;
    public QLineEdit displayEdit;
    public QLineEdit partEdit;
    public QLineEdit setPartIDEdit;
    public QLabel label_2;
    public QLabel label_3;
    public QTreeWidget setFueltreeWidget;
    public QPushButton mMenuButton;
    public QPushButton cMenuButton;
    public QLabel label_4;
    public QPushButton checkDBButton;

	private Connection con = null;
	private java.sql.Statement st = null;
	private ResultSet rs = null;

	private QWidget widget;
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String menuButton = "QPushButton {image: url(classpath:images/menu_empty.png)};";
	final String homemenuButton = "QPushButton {image: url(classpath:images/home.png)};";
	final String checkSytle  = "QCheckBox {background: transparent}";
	final String editStyle = "QLineEdit {background:white; color:blue;}";
	final String treeSytle = "QTreeWidget {background:transparent; color: white; font-family: arial; font-size:16px;}";
	final String treeHeaderSytle = "background:gray; color: black; font-family: arial; font-size:16px;";
	
    public Cat3Fuel(QWidget wid) { super(); setupUi(wid); }
    
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
        
        searchButton = new QPushButton(Form);
        searchButton.setObjectName("searchButton");
        searchButton.setGeometry(new QRect(560, 890, 180, 45));
        searchButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        searchButton.setFont(font);
        
        dbsaveButton = new QPushButton(Form);
        dbsaveButton.setObjectName("dbsaveButton");
        dbsaveButton.setGeometry(new QRect(1020, 950, 180, 45));
        dbsaveButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        dbsaveButton.setFont(font);
        
        displayEdit = new QLineEdit(Form);
        displayEdit.setObjectName("displayEdit");
        displayEdit.setGeometry(new QRect(320, 890, 231, 51));
        displayEdit.setStyleSheet(editStyle);
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        displayEdit.setFont(font);
        
        partEdit = new QLineEdit(Form);
        partEdit.setObjectName("partEdit");
        partEdit.setGeometry(new QRect(320, 820, 231, 51));
        partEdit.setStyleSheet(editStyle);
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        partEdit.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(200, 830, 101, 31));
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
        label_3.setGeometry(new QRect(190, 900, 111, 31));
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
        setFueltreeWidget.setGeometry(new QRect(210, 250, 811, 511));
        setFueltreeWidget.setStyleSheet(treeSytle);
        setFueltreeWidget.header().setStyleSheet(treeHeaderSytle);
        font.setPointSize(12);
        setFueltreeWidget.setFont(font);
        
        mMenuButton = new QPushButton(Form);
        mMenuButton.setObjectName("mMenuButton");
        mMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mMenuButton.setStyleSheet(homemenuButton);
        
        cMenuButton = new QPushButton(Form);
        cMenuButton.setObjectName("cMenuButton");
        cMenuButton.setGeometry(new QRect(91, 0, 90, 60));
        cMenuButton.setStyleSheet(menuButton);
        
        setPartIDEdit = new QLineEdit(Form);
        setPartIDEdit.setObjectName("setPartIDEdit");
        setPartIDEdit.setGeometry(new QRect(340, 190, 231, 51));
        setPartIDEdit.setStyleSheet(editStyle);
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        setPartIDEdit.setFont(font);
        
        label_4 = new QLabel(Form);
        label_4.setObjectName("label_4");
        label_4.setGeometry(new QRect(210, 200, 111, 31));
        label_4.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(false);
        font.setWeight(50);
        font.setKerning(false);
        label_4.setFont(font);
        label_4.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
       
        checkDBButton = new QPushButton(Form);
        checkDBButton.setObjectName("checkDBButton");
        checkDBButton.setGeometry(new QRect(580, 190, 180, 45));
        checkDBButton.setStyleSheet(styleButton);
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        checkDBButton.setFont(font);
        
        connectSignalSlot();
        retranslateUi(Form);
        
        centerWidget();
        widget.show();
        
        
        Form.connectSlotsByName();
        
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    } // setupUi
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, 0);
    }
    void connectSignalSlot()
    {
    	searchButton.pressed.connect(this, "searchDB()");
    	setFueltreeWidget.itemDoubleClicked.connect(this, "setPartName(QTreeWidgetItem, int)");
    	checkDBButton.pressed.connect(this, "checkDB()");
    	dbsaveButton.pressed.connect(this, "saveDB()");
    	mMenuButton.pressed.connect(this, "Home()");
    	cMenuButton.pressed.connect(this, "Cat3()");
    }
    
    void Home()
    {
    	AddDB add = new AddDB(new QWidget());
    	widget.close();
    }
    
    void Cat3()
    {
    	Cat3 cat3 = new Cat3(new QWidget());
    	widget.close();
    }
    
    void searchDB()
    {
    	QFileDialog.Filter filter = new QFileDialog.Filter("JPEG (*.jpg *.jpeg);; PNG (*.png)");
    	String fileName = QFileDialog.getOpenFileName(widget, "Open File", QDir.currentPath(), filter);
    	displayEdit.setText(fileName);
    	
    }
    
    void saveDB() throws SQLException
    {
		String strsql = "create TABLE " + setPartIDEdit.text();
		//strsql += " (idx mediumint not null auto_increment, partname VARCHAR(64) not null, filename VARCHAR(64), PRIMARY KEY (idx) )";
		strsql += " (set_id VARCHAR(12) not null, partname VARCHAR(64) not null, filename VARCHAR(64), PRIMARY KEY (set_id) )";
		
		System.out.println("SQL-> " + strsql);
		
		try {
			st.executeUpdate(strsql);
			strsql = "";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		strsql = "insert into " + setPartIDEdit.text();
		strsql += " (set_id, partname, filename) values (?, ?, ?)";
		System.out.println("SQL-> " + strsql);

		PreparedStatement ps = null;
	    try {
	      con.setAutoCommit(false);
	      ps = con.prepareStatement(strsql);
	 
	    //table id
	      ps.setString(1, setPartIDEdit.text());
	      
	      //partname
	      ps.setString(2, partEdit.text());
	      
	      //filename
	      ps.setString(3, displayEdit.text());
	      ps.executeUpdate();
	      con.commit();
	    }catch(SQLException sqex){
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
			ps.close();
		} 
   
    }
    
    void checkDB()
    {
		
		String setTableID = setPartIDEdit.text();
		try {

		    //Show tables;
			rs=st.executeQuery("SHOW tables");
			
			if(st.execute("SHOW tables")) {
				rs = st.getResultSet();
			}
			
			while(rs.next()) {
				String str = rs.getNString(1);
				if(str.compareTo(setTableID)==0)
				{
					String msgstr = "Already there setID Table " + setTableID; 
					QMessageBox.information(widget, "Hello!!", msgstr);
					System.out.println("Already there setID Table: " + setTableID);	
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
    }
    
    void setPartName(QTreeWidgetItem item, int column)
    {
      	QTreeWidgetItem pitem = item;
       	
       	String partname="";
       	while(pitem != null)
       	{
       		//System.out.println("Parent: " + pitem.text(0));
       		partname += pitem.text(0);
       		if(pitem.parent()!=null)
       			partname += ":";
       		pitem = pitem.parent();
       	};
       	partEdit.setText(partname);
    }

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category III Fuel  Assembly", null));
        searchButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80 \uc0c9", null));
        dbsaveButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Database Save", null));
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
        //label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc9d1\ud569\uccb4 ID", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ÁýÇÕÃ¼ ID", null));
        checkDBButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Check ", null));
    } // retranslateUi

}

