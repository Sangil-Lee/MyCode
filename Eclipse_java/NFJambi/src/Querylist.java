/********************************************************************************
 ** Form generated from reading ui file 'Querylist.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Querylist implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel qryLabel;
    public QListWidget listWidget;
    public QPushButton closeButton;
    
    private QWidget widget;
	final String strStyle = "QWidget#Form {background-image:url(classpath:images/search.png); color:white;}";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String labelStyle = "QLabel {color:white;};";
	private EtcNuclearMultiSearch multisearch;
	private String sqlString = "";
	
	private String fileName = ""; 
	
    public Querylist(QWidget wid, String filename) { super(); fileName = filename; setupUi(wid); }

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.setMinimumSize(1235, 850);
    	Form.setMaximumSize(1200, 850);
    	
        Form.setAutoFillBackground(true);
        Form.setStyleSheet(strStyle);
        Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
        qryLabel = new QLabel(Form);
        qryLabel.setObjectName("qryLabel");
        qryLabel.setGeometry(new QRect(330, 20, 541, 61));
        qryLabel.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        qryLabel.setStyleSheet(labelStyle);
        
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        qryLabel.setFont(font);
        qryLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
      
        listWidget = new QListWidget(Form);
        listWidget.setObjectName("listWidget");
        listWidget.setGeometry(new QRect(200, 130, 891, 581));
        font.setPointSize(16);
        listWidget.setFont(font);
        closeButton = new QPushButton(Form);
        closeButton.setObjectName("closeButton");
        closeButton.setGeometry(new QRect(1010, 770, 171, 41));
        closeButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        closeButton.setFont(font);
        
        retranslateUi(Form);

        connectSignalSlot();
        AddItem();
        
        widget.show();
        
        centerWidget();
        Form.connectSlotsByName();
    } // setupUi

    void SetParent(EtcNuclearMultiSearch parent)
    {
    	multisearch = parent;
    }
    void AddItem()
    {
    	String sql = "select * from etcnucl;";
    	listWidget.addItem(sql);

    }
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, y);
    }
    
    void connectSignalSlot()
    {
    	//listWidget.doubleClicked.connect(this, "CurrentSQL(QModelIndex)");
    	listWidget.currentTextChanged.connect(this, "CurrentSQL(String)");
    	closeButton.pressed.connect(this, "Close()");
    }
    
    void CurrentSQL(String sql)
    {
    	if(sql.isEmpty() == true || multisearch == null) return;
    	System.out.println("Current SQL: " + sql);
    	sqlString = sql;
    }
    
     void Close()
    {
    	multisearch.sqlEdit.setText(listWidget.currentItem().text());
    	widget.close();
    }
    
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        qryLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Query List", null));
        closeButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Close", null));
    } // retranslateUi

}

