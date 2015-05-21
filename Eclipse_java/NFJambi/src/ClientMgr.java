/********************************************************************************
 ** Form generated from reading ui file 'ClientMgr.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class ClientMgr implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton addButton;
    public QPushButton changeButton;
    public QPushButton deleteButton;
    public QPushButton addDBButton;
    public QLineEdit passEdit;
    public QLineEdit idEdit;
    public QListWidget clientListWidget;
    public QLabel label_2;
    public QLabel label_3;
    private QWidget widget;

    public ClientMgr(QWidget wid) { super(); setupUi(wid); }

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.setMinimumSize(1200, 800);
    	Form.setMaximumSize(1200, 800);
        Form.setAutoFillBackground(true);
        Form.setStyleSheet("background-image:url(classpath:images/login_back.png); color:white;");
        Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(330, 130, 541, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont font = new QFont();
        QColor color = new QColor(255,255,255,255);
        QBrush brush = new QBrush(color);
    	brush.setStyle(Qt.BrushStyle.SolidPattern);
    	QPalette pal = new QPalette();

        pal.setBrush(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, brush);
        pal.setBrush(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, brush);
    	label.setPalette(pal);

    	font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        addButton = new QPushButton(Form);
        addButton.setObjectName("addButton");
        addButton.setGeometry(new QRect(740, 430, 180, 45));
        addButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        changeButton = new QPushButton(Form);
        changeButton.setObjectName("changeButton");
        changeButton.setGeometry(new QRect(740, 490, 180, 45));
        changeButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
                
        deleteButton = new QPushButton(Form);
        deleteButton.setObjectName("deleteButton");
        deleteButton.setGeometry(new QRect(740, 550, 180, 45));
        deleteButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        addDBButton = new QPushButton(Form);
        addDBButton.setObjectName("addDBButton");
        addDBButton.setGeometry(new QRect(0, 0, 90, 60));
        addDBButton.setStyleSheet("QPushButton {image: url(classpath:images/home.png)};");
       
        passEdit = new QLineEdit(Form);
        passEdit.setObjectName("passEdit");
        passEdit.setGeometry(new QRect(720, 360, 231, 51));
        passEdit.setEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode.Password);
        passEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        passEdit.setFont(font);
        
        idEdit = new QLineEdit(Form);
        idEdit.setObjectName("idEdit");
        idEdit.setGeometry(new QRect(720, 290, 231, 51));
        idEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        idEdit.setFont(font);
        
        clientListWidget = new QListWidget(Form);
        clientListWidget.setObjectName("clientListWidget");
        clientListWidget.setGeometry(new QRect(170, 280, 361, 341));
        clientListWidget.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(620, 300, 81, 31));
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(50);
        font.setKerning(false);
        label_2.setFont(font);
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        
        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(590, 370, 111, 31));
        label_3.setFont(font);
        label_3.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        connectSignalSlot();

        centerWidget();
        Form.show();
        retranslateUi(Form);
        Form.connectSlotsByName();
        
        showClientList();
    } // setupUi
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, y);
        
    }
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Client Manager", null));
        addButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Add", null));
        changeButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Change", null));
        deleteButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Delete", null));
        //addDBButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Add Database", null));
        clientListWidget.clear();

        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ID", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Password", null));
    } // retranslateUi

    void connectSignalSlot()
    {
    	addButton.pressed.connect(this, "AddClient()");
    	changeButton.pressed.connect(this, "ChangeClient()");
    	deleteButton.pressed.connect(this, "DeleteClient()");
    	clientListWidget.itemDoubleClicked.connect(this, "ItemDClicked()");
    	addDBButton.pressed.connect(this, "Home()");
    }
    
    void Home()
    {
    	AddDB add = new AddDB(1, new QWidget());
    	widget.close();
    }
    
    void ItemDClicked()
    {
    	System.out.println("Item double clicked...");
		Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
        
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			
	    	String strsql = "select id, password from client where id = '" + clientListWidget.currentItem().text() + "'";
	    	
	    	System.out.println(strsql);
			rs = st.executeQuery(strsql);
			
			String id = null;
			String passwd = null;
			while(rs.next())
			{
		         //Retrieve by column name
		       id = rs.getString("id");
		       passwd = rs.getString("password");
		    }
			
			idEdit.setText(id);
			passEdit.setText(passwd);
		   rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    }
    void AddClient() throws SQLException
    {
		Connection con = null;
		String strsql;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			strsql = "insert into client (id, password) values (?, ?)";
			//System.out.println("SQL-> " + strsql);
			
		    con.setAutoCommit(false);
		    ps = con.prepareStatement(strsql);
		    ps.setString(1, idEdit.text());
		      
		    //filename
		    ps.setString(2, passEdit.text());
		    ps.executeUpdate();
		    con.commit();
		    
		}catch(SQLException sqex){
				System.out.println("SQLException: " + sqex.getMessage());
				System.out.println("SQLState: " + sqex.getSQLState());
				ps.close();
			} 
		ps.close();
		showClientList();
    }
    
    void ChangeClient()
    {
    	
		Connection con = null;
		java.sql.Statement st = null;
		    	
		String strsql = "update client set id = '" + idEdit.text() + "', password= '" +passEdit.text() + "' where id = '" + clientListWidget.currentItem().text() +"'";
		System.out.println(strsql);
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			st.executeUpdate(strsql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		showClientList();
    }
    
    void DeleteClient()
    {
		Connection con = null;
		java.sql.Statement st = null;
		    	
		String strsql = "delete from client where id = '" + clientListWidget.currentItem().text() +"'";
		System.out.println(strsql);
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			st.executeUpdate(strsql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		showClientList();
    }
    void showClientList ()
    {
		Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
        clientListWidget.clear();	
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			
	    	String strsql = "select id from client";
			rs = st.executeQuery(strsql);
			
			while(rs.next())
			{
		         //Retrieve by column name
		       String id = rs.getString("id");
		       clientListWidget.addItem(id);
		    }
		   rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
    }
    
}

