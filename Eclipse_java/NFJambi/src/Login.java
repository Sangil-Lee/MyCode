

/********************************************************************************
 ** Form generated from reading ui file 'test.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.gui.QPalette.ColorRole;
import com.trolltech.qt.designer.*;



//public class Login extends QWidget
public class Login implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QLineEdit idEdit;
    public QLineEdit passEdit;
    public QPushButton adminButton;
    public QPushButton clientButton;
    
    private QWidget widget;
    
    private int nmode;

    public Login(QWidget wid) { super(); setupUi(wid);}

    public void setupUi(QWidget Form)
    {
        widget = Form;
    	Form.setObjectName("Form");
    	Form.setMinimumSize(1200, 800);
    	Form.setMaximumSize(1200, 800);
        //Form.resize(new QSize(1200, 800).expandedTo(Form.minimumSizeHint()));
        Form.setAutoFillBackground(true);
        Form.setStyleSheet("background-image:url(classpath:images/login_back.png);");
        QFont font = new QFont();
        QColor color = new QColor(255,255,255,255);
        QBrush brush = new QBrush(color);
    	brush.setStyle(Qt.BrushStyle.SolidPattern);
    	QPalette pal = new QPalette();

        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(330, 80, 600, 60));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        pal.setBrush(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, brush);
        pal.setBrush(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, brush);
    	label.setPalette(pal);
    	
        font.setPointSize(36);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        
        idEdit = new QLineEdit(Form);
        idEdit.setObjectName("idEdit");
        idEdit.setGeometry(new QRect(470, 250, 230, 50));
        idEdit.setAutoFillBackground(true);
        idEdit.setStyleSheet("QLineEdit {background:white;}");
        
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        idEdit.setFont(font);
        
        passEdit = new QLineEdit(Form);
        passEdit.setObjectName("passEdit");
        passEdit.setEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode.Password);
        passEdit.setGeometry(new QRect(470, 320, 230, 50));
        passEdit.setStyleSheet("QLineEdit {background:white;}");
        passEdit.setFont(font);
        
        adminButton = new QPushButton(Form);
        adminButton.setObjectName("adminButton");
        adminButton.setGeometry(new QRect(500, 410, 180, 45));
        adminButton.setAutoFillBackground(true);
        adminButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        //adminButton.setStyleSheet("QPushButton {image: url(classpath:images/login_btn.png);border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige;}");
        
        clientButton = new QPushButton(Form);
        clientButton.setObjectName("clientButton");
        clientButton.setGeometry(new QRect(500, 470, 180, 45));
        clientButton.setStyleSheet("QPushButton {background: #0a5abe; border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");

        retranslateUi(Form);
        Form.show();

        this.centerWidget();
        connectSignalSlot();
        Form.connectSlotsByName();
        
    } // setupUi

    void connectSignalSlot()
    {
    	adminButton.pressed.connect(this, "AdminLogin()");
    	clientButton.pressed.connect(this, "ClientLogin()");
    }
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Nuclear Forensics Library", null));
        idEdit.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "", null));
        passEdit.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "", null));
        adminButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Admin", null));
        clientButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Client", null));
    } // retranslateUi

    void AdminLogin()
    {
		Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
		int loginok = 0;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			
	    	String strsql = "select id, password from admin";
			rs = st.executeQuery(strsql);
			
			String id = "";
			String password = "";
			
			while(rs.next())
			{
		         //Retrieve by column name
		        id  = rs.getString("id");
		        password = rs.getString("password");
		        
		        if(id.compareTo(idEdit.text()) == 0 && password.compareTo(passEdit.text()) == 0 )
		        {
		        	loginok = 1;
		        	break;
		        }
		        
		    }
		   rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Admin Login OK ?: " + String.valueOf(loginok));
		//Admin New Page
		if(loginok == 1)
		{	
			AddDB adddb = new AddDB(1, new QWidget());
			widget.close();
		}
		
    }
    void ClientLogin()
    {
    	Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
		int loginok = 0;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();
			
	    	String strsql = "select id, password from client";
			rs = st.executeQuery(strsql);
			
			String id = "";
			String password = "";
			
			while(rs.next())
			{
		         //Retrieve by column name
		        id  = rs.getString("id");
		        password = rs.getString("password");
		        
		        if(id.compareTo(idEdit.text()) == 0 && password.compareTo(passEdit.text()) == 0 )
		        {
		        	loginok = 1;
		        	break;
		        }
		    }
		   rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Client Login OK ?: " + String.valueOf(loginok));
		
		if(loginok == 1)
		{
			// New Page.
			ViewDB viewdb = new ViewDB(new QWidget());
			widget.close();
		}
    }
 
   public void showUI(String filename)
    {
	   QWidget wid = null;
	   //String filePath = "C:/qtjambi-4.7.1/workspace/" + filename;
	 //  String filePath = filename;
	   
	  // if(!QFile.exists(filePath)) return;
	   String fileName = QFileDialog.getOpenFileName(widget);
	   System.out.println(fileName);
	   

    	try {
    		QFile file = new QFile(fileName);
    		if (!file.open(new QFile.OpenMode(QFile.OpenModeFlag.ReadOnly))) return;
   			
    		wid = QUiLoader.load(file, widget);
    		//wid = QUiLoader.load(file);
    		
    		
   			wid.show();

		} catch (QUiLoaderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    };
    
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, y);
        
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		QApplication.initialize(args);
	
		Login login = new Login(new QWidget());
		//AddDB adddb = new AddDB();
		//ClientMgr clientmgr = new ClientMgr();
		//Cat2 cat2 = new Cat2();
		//Cat3Fuel cat3 = new Cat3Fuel();
		//ImageView view = new ImageView();
		//TrendItem item = new TrendItem();
		QApplication.exec();
		QApplication.exit();
	}
}
