/********************************************************************************
 ** Form generated from reading ui file 'EtcNuclearMultiSearch.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.jdbc.ResultSetMetaData;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class EtcNuclearMultiSearch implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton closeButton;
    public QLabel label_2;
    public QTableWidget scaleOutTableWidget;
    public QPushButton mainMenuButton;
    public QLineEdit sqlEdit;
    public QPushButton searchButton;
    public QPushButton queryEx;
    
    private QWidget widget;
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String menuButton = "QPushButton {image: url(classpath:images/menu_empty.png)};";
	final String homemenuButton = "QPushButton {image: url(classpath:images/home.png)};";
	final String checkSytle  = "QCheckBox {background: transparent}";
	final String editStyle = "QLineEdit {background:white; color:blue;}";
	final String tableStyle = "QTableWidget {background:transparent;};";
	final String tableHeaderStyle = "QHeaderView::section {background-color:lightblue; color: black; font-family: arial; font-size:12px;}";
	
    public EtcNuclearMultiSearch(QWidget wid) { super(); setupUi(wid);}

    public void setupUi(QWidget Form)
    {
    	widget = Form;
    	Form.setObjectName("Form");
        
        Form.setMinimumSize(1280, 1024);
    	Form.setMaximumSize(1280, 1024);
    	
        Form.setAutoFillBackground(true);
        Form.setStyleSheet(strStyle);
        Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(380, 40, 491, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        closeButton = new QPushButton(Form);
        closeButton.setObjectName("closeButton");
        closeButton.setGeometry(new QRect(1080, 960, 180, 45));
        closeButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        closeButton.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(20, 156, 81, 31));
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        font.setKerning(false);
        label_2.setFont(font);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        scaleOutTableWidget = new QTableWidget(Form);
        scaleOutTableWidget.setObjectName("scaleOutTableWidget");
        scaleOutTableWidget.setGeometry(new QRect(20, 210, 1251, 721));
        scaleOutTableWidget.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.SingleSelection);
        scaleOutTableWidget.horizontalHeader().setStyleSheet(tableHeaderStyle);
        scaleOutTableWidget.verticalHeader().setStyleSheet(tableHeaderStyle);
        scaleOutTableWidget.setStatusTip(tableStyle);
        
        
        mainMenuButton = new QPushButton(Form);
        mainMenuButton.setObjectName("mainMenuButton");
        mainMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mainMenuButton.setStyleSheet(homemenuButton);
        
        sqlEdit = new QLineEdit(Form);
        sqlEdit.setObjectName("sqlEdit");
        sqlEdit.setGeometry(new QRect(110, 150, 911, 41));
        sqlEdit.setStyleSheet(editStyle);
        font.setPointSize(16);
        sqlEdit.setFont(font);
        
        searchButton = new QPushButton(Form);
        searchButton.setObjectName("searchButton");
        searchButton.setGeometry(new QRect(1070, 148, 180, 45));
        searchButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        searchButton.setFont(font);
        
        queryEx = new QPushButton(Form);
        queryEx.setObjectName("queryEx");
        queryEx.setGeometry(new QRect(1070, 94, 181, 41));
        queryEx.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        queryEx.setFont(font);
        
        retranslateUi(Form);
        connectSignalSlot();
        widget.show();
        centerWidget();
        Form.connectSlotsByName();
    } // setupUi
    
    void connectSignalSlot()
    {
    	mainMenuButton.pressed.connect(this, "Home()");
    	searchButton.pressed.connect(this, "SearchDB()");
    	closeButton.pressed.connect(this, "Close()");
    	queryEx.pressed.connect(this, "QueryHistroy()");
    	
    }
    void Close()
    {
    	widget.close();
    }
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, 0);
        
    }
    
    void Home()
    {
    	ViewDB view = new ViewDB(new QWidget());
    	widget.close();
    }
    
    void SearchDB ()
    {
       	Connection con = null;
    	java.sql.Statement st = null;
   		ResultSet rs = null;

   		String strsql = sqlEdit.text();
   		scaleOutTableWidget.setRowCount(0);
   		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();

			rs = st.executeQuery(strsql);
		
			int first = 0;
			int row = 0;
		
			while(rs.next())
			{
		        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
		        scaleOutTableWidget.setRowCount(scaleOutTableWidget.rowCount()+1);
		        if(first == 0)
		        {
		        	first++;
		        	scaleOutTableWidget.setColumnCount(rsmd.getColumnCount());
		        }
		        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		           
		            String fieldName = rsmd.getColumnName(i);
		            scaleOutTableWidget.setHorizontalHeaderItem(i-1, new QTableWidgetItem(fieldName));
		            

		            int type = rsmd.getColumnType(i);
		            String strresult = "";
		            if (type == Types.VARCHAR || type == Types.CHAR) {
		                strresult = rs.getString(i);
		            } else {
		                //System.out.print(rs.getDouble(i));
		                Float fvalue = rs.getFloat(i);
		                strresult = String.valueOf(fvalue);
		            }
		        
		            QTableWidgetItem colItem = new QTableWidgetItem();
					colItem.setText(strresult);
					scaleOutTableWidget.setItem(row, i-1, colItem);
			    };

			    row++;
		       // System.out.println();
			};
			rs.close();		
			
			Historyfile();
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    void QueryHistroy()
    {
    	Querylist list = new Querylist(new QWidget(), "./.etcnuclear");
    	list.SetParent(this);
    	
    	
    }
    
    void Historyfile() throws IOException
    {
    	File outFile = new File("./.etcnuclear");
    	FileOutputStream fout = new FileOutputStream (outFile);
    	boolean result = false;
		
		try {
			
			if(outFile.exists()==false)
				result = outFile.createNewFile();
			
			//DataOutputStream output = new DataOutputStream(new BufferedOutputStream(fout));
			
			//PrintWriter out = new PrintWriter(fout);
			FileWriter fw = new FileWriter(outFile.getName(),true);
			BufferedWriter bufferWritter = new BufferedWriter(fw);
			bufferWritter.write(sqlEdit.text());
			bufferWritter.close();
			
			System.out.println(sqlEdit.text());
		
			//out.println(sqlEdit.text());
			
			//out.close();
			fw.close();
			fout.close();
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    }
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uae30\ud0c0 \ud575\ubb3c\uc9c8 \uac80\uc0c9", null));
        closeButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Close", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ud30c\uc77c\uba85:", null));
        scaleOutTableWidget.clear();
        
        searchButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80 \uc0c9", null));
        queryEx.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80\uc0c9\ubb38", null));
    } // retranslateUi

}

