/********************************************************************************
 ** Form generated from reading ui file 'Cat2.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.apache.commons.io.IOUtils;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Cat2 implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton scaleExeButton;
    public QPushButton outputLoadButton;
    public QPushButton dbSaveButton;
    public QPushButton mainMenuButton;
    public QPushButton cat2MultiButton;
    public QLineEdit idEdit;
    public QLabel label_2;
    public QComboBox plantCBBox;
    public QLabel label_4;
    public QComboBox hogiCBBox;
    public QLabel label_5;
    public QLabel label_6;
    public QLabel label_7;
    public QLabel label_8;
    public QLabel label_9;
    public QLabel label_10;
    public QComboBox typeCBBox;
    public QComboBox kindCBBox;
    public QLabel label_11;
    public QLabel label_12;
    public QLabel label_13;
    public QPushButton confirmButton;
    public QLabel yearLabel;
    public QLabel label_14;
    public QLabel scaleOutLabel;
    public QLineEdit jugiEdit;
    public QSpinBox fuelNoSBox;
    public QSpinBox fuelNoSBox_2;
    public QDoubleSpinBox fuelDSBox;
    public QDoubleSpinBox totalUDSBox;
    public QDoubleSpinBox compDSBox;
    public QSpinBox coolingSBox;
    public QPushButton makeIDButton;
    private QWidget widget;
    
    public Map <String, Double> map = new HashMap<String, Double> ();
	
	public Cat2(QWidget wid) { super(); setupUi(wid);}

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.setMinimumSize(1280, 1024);
    	Form.setMaximumSize(1280, 1024);
        Form.setAutoFillBackground(true);
        Form.setStyleSheet("background-image:url(classpath:images/login_back.png); color:white;");
        Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(330, 70, 540, 60));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
  
        scaleExeButton = new QPushButton(Form);
        scaleExeButton.setObjectName("scaleExeButton");
        scaleExeButton.setGeometry(new QRect(680, 930, 180, 45));
        scaleExeButton.setStyleSheet("QPushButton {image: url(classpath:images/exec.png); border-width: 1px; border-radius: 10px; border-color: beige; color:white; padding: 0px; };");
        
        font.setPointSize(10);
        //font.setBold(true);
        font.setWeight(75);
        scaleExeButton.setFont(font);
       
        outputLoadButton = new QPushButton(Form);
        outputLoadButton.setObjectName("outputLoadButton");
        outputLoadButton.setGeometry(new QRect(870, 930, 180, 45));
        outputLoadButton.setStyleSheet("QPushButton {image: url(classpath:images/login_btn.png);border-width: 1px; border-radius: 10px; border-color: beige; color:white; padding: 0px;};");
        outputLoadButton.setFont(font);
        
        dbSaveButton = new QPushButton(Form);
        dbSaveButton.setObjectName("dbSaveButton");
        dbSaveButton.setGeometry(new QRect(1060, 930, 180, 45));
        dbSaveButton.setStyleSheet("QPushButton {image: url(classpath:images/login_btn.png);border-width: 1px; border-radius: 10px; border-color: beige; color:white; padding: 0px; };");
        dbSaveButton.setFont(font);
        
        mainMenuButton = new QPushButton(Form);
        mainMenuButton.setObjectName("mainMenuButton");
        mainMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mainMenuButton.setStyleSheet("QPushButton {image: url(classpath:images/home.png)};");
        
        cat2MultiButton = new QPushButton(Form);
        cat2MultiButton.setObjectName("cat2MultiButton");
        cat2MultiButton.setGeometry(new QRect(91, 0, 90, 60));
        cat2MultiButton.setStyleSheet("QPushButton {image: url(classpath:images/multi.png)};");
        
        idEdit = new QLineEdit(Form);
        idEdit.setObjectName("idEdit");
        idEdit.setGeometry(new QRect(810, 210, 211, 41));
        idEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        
        QFont font6 = new QFont();
        font6.setPointSize(16);
        font6.setBold(true);
        font6.setWeight(75);
        idEdit.setFont(font6);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(140, 220, 131, 31));
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont labelfont = new QFont();
        labelfont.setFamily("Courier");
        labelfont.setPointSize(16);
        labelfont.setBold(true);
        labelfont.setWeight(75);
        labelfont.setKerning(false);
        label_2.setFont(labelfont);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        plantCBBox = new QComboBox(Form);
        plantCBBox.setObjectName("plantCBBox");
        plantCBBox.setGeometry(new QRect(310, 210, 120, 40));
        plantCBBox.setStyleSheet("QComboBox {background:white; color:blue;}");
        font.setFamily("Courier");
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        plantCBBox.setFont(font);
        plantCBBox.setEditable(false);
        plantCBBox.setFrame(true);
        
        label_4 = new QLabel(Form);
        label_4.setObjectName("label_4");
        label_4.setGeometry(new QRect(140, 310, 131, 31));
        label_4.setFont(labelfont);
        label_4.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_4.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
       
        hogiCBBox = new QComboBox(Form);
        hogiCBBox.setObjectName("hogiCBBox");
        hogiCBBox.setGeometry(new QRect(440, 210, 120, 40));
        hogiCBBox.setStyleSheet("QComboBox {background:white; color:blue;}");
        font.setFamily("Courier");
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        hogiCBBox.setFont(font);
        hogiCBBox.setEditable(false);
        hogiCBBox.setFrame(true);
        
        label_5 = new QLabel(Form);
        label_5.setObjectName("label_5");
        label_5.setGeometry(new QRect(450, 310, 131, 31));
        label_5.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_5.setFont(labelfont);
        label_5.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        label_6 = new QLabel(Form);
        label_6.setObjectName("label_6");
        label_6.setGeometry(new QRect(140, 390, 131, 31));
        label_6.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_6.setFont(labelfont);
        label_6.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        label_7 = new QLabel(Form);
        label_7.setObjectName("label_7");
        label_7.setGeometry(new QRect(140, 475, 131, 31));
        label_7.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_7.setFont(labelfont);
        label_7.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        label_8 = new QLabel(Form);
        label_8.setObjectName("label_8");
        label_8.setGeometry(new QRect(140, 560, 131, 31));
        label_8.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_8.setFont(labelfont);
        label_8.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        label_9 = new QLabel(Form);
        label_9.setObjectName("label_9");
        label_9.setGeometry(new QRect(140, 650, 151, 31));
        label_9.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_9.setFont(labelfont);
        label_9.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
   
        label_10 = new QLabel(Form);
        label_10.setObjectName("label_10");
        label_10.setGeometry(new QRect(140, 730, 341, 31));
        label_10.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_10.setFont(labelfont);
        label_10.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
   
        typeCBBox = new QComboBox(Form);
        typeCBBox.setObjectName("typeCBBox");
        typeCBBox.setGeometry(new QRect(310, 390, 121, 41));
        typeCBBox.setStyleSheet("QComboBox {background:white; color:blue;}");
        font.setFamily("Courier");
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        typeCBBox.setFont(font);
        typeCBBox.setFrame(true);
        
        kindCBBox = new QComboBox(Form);
        kindCBBox.setObjectName("kindCBBox");
        kindCBBox.setGeometry(new QRect(440, 390, 121, 41));
        kindCBBox.setStyleSheet("QComboBox {background:white; color:blue;}");
        font.setFamily("Courier");
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        kindCBBox.setFont(font);
        kindCBBox.setFrame(true);
        
        
        label_11 = new QLabel(Form);
        label_11.setObjectName("label_11");
        label_11.setGeometry(new QRect(430, 480, 61, 31));
        label_11.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_11.setFont(labelfont);
        label_11.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        label_12 = new QLabel(Form);
        label_12.setObjectName("label_12");
        label_12.setGeometry(new QRect(460, 560, 61, 31));
        label_12.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_12.setFont(labelfont);
        label_12.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
   
        label_13 = new QLabel(Form);
        label_13.setObjectName("label_13");
        label_13.setGeometry(new QRect(460, 650, 61, 31));
        label_13.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_13.setFont(labelfont);
        label_13.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
   
        confirmButton = new QPushButton(Form);
        confirmButton.setObjectName("confirmButton");
        confirmButton.setGeometry(new QRect(520, 640, 180, 45));
        confirmButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        yearLabel = new QLabel(Form);
        yearLabel.setObjectName("yearLabel");
        yearLabel.setGeometry(new QRect(580, 470, 151, 41));
        yearLabel.setStyleSheet("QLabel {background:white; color:black;}");
        
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        yearLabel.setFont(font);
        yearLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        
        label_14 = new QLabel(Form);
        label_14.setObjectName("label_14");
        label_14.setGeometry(new QRect(740, 480, 61, 31));
        label_14.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        label_14.setFont(labelfont);
        label_14.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
   
        scaleOutLabel = new QLabel(Form);
        scaleOutLabel.setObjectName("scaleOutLabel");
        scaleOutLabel.setGeometry(new QRect(480, 720, 550, 41));
        scaleOutLabel.setStyleSheet("QLabel {background:white; color:black;}");
        
        QFont font25 = new QFont();
        font25.setPointSize(12);
        font25.setBold(true);
        font25.setWeight(75);
        scaleOutLabel.setFont(font25);
        scaleOutLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
           
        jugiEdit = new QLineEdit(Form);
        jugiEdit.setObjectName("jugiEdit");
        jugiEdit.setGeometry(new QRect(570, 210, 100, 41));
        jugiEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        
        QFont jugiFont = new QFont();
        jugiFont.setPointSize(16);
        jugiFont.setBold(true);
        jugiFont.setWeight(75);
        jugiEdit.setFont(jugiFont);
        jugiEdit.setMaxLength(2);
        jugiEdit.setEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode.Normal);

        fuelNoSBox = new QSpinBox(Form);
        fuelNoSBox.setObjectName("fuelNoSBox");
        fuelNoSBox.setGeometry(new QRect(680, 210, 100, 40));
        fuelNoSBox.setStyleSheet("QSpinBox {background:white; color:blue;}");
        font.setFamily("Courier");
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        fuelNoSBox.setFont(font);
        
        fuelNoSBox_2 = new QSpinBox(Form);
        fuelNoSBox_2.setObjectName("fuelNoSBox_2");
        fuelNoSBox_2.setGeometry(new QRect(570, 390, 100, 40));
        fuelNoSBox_2.setStyleSheet("QSpinBox {background:white; color:blue;}");
        fuelNoSBox_2.setFont(font);
        
        fuelDSBox = new QDoubleSpinBox(Form);
        fuelDSBox.setObjectName("fuelDSBox");
        fuelDSBox.setGeometry(new QRect(310, 300, 100, 40));
        fuelDSBox.setStyleSheet("QDoubleSpinBox {background:white; color:blue;}");
        fuelDSBox.setFont(font);
        fuelDSBox.setDecimals(1);
        fuelDSBox.setMaximum(99999.9);
        fuelDSBox.setSingleStep(0.1);
        
        totalUDSBox = new QDoubleSpinBox(Form);
        totalUDSBox.setObjectName("totalUDSBox");
        totalUDSBox.setGeometry(new QRect(310, 550, 100, 40));
        totalUDSBox.setStyleSheet("QDoubleSpinBox {background:white; color:blue;}");
        totalUDSBox.setFont(font);
        totalUDSBox.setDecimals(1);
        totalUDSBox.setMaximum(99999.9);
        totalUDSBox.setSingleStep(0.1);
        
        compDSBox = new QDoubleSpinBox(Form);
        compDSBox.setObjectName("compDSBox");
        compDSBox.setGeometry(new QRect(310, 640, 100, 40));
        compDSBox.setStyleSheet("QDoubleSpinBox {background:white; color:blue;}");
        compDSBox.setFont(font);
        compDSBox.setDecimals(2);
        compDSBox.setMaximum(99.99);
        compDSBox.setSingleStep(0.01);
        
        coolingSBox = new QSpinBox(Form);
        coolingSBox.setObjectName("coolingSBox");
        coolingSBox.setGeometry(new QRect(310, 470, 100, 40));
        coolingSBox.setStyleSheet("QSpinBox {background:white; color:blue;}");
        coolingSBox.setFont(font);
        coolingSBox.setMinimum(1);
        coolingSBox.setMaximum(36500);
        
        makeIDButton = new QPushButton(Form);
        makeIDButton.setObjectName("makeIDButton");
        makeIDButton.setGeometry(new QRect(1030, 210, 180, 45));
        makeIDButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        retranslateUi(Form);

        centerWidget();
        Form.show();
        
        connectSignalSlot();
        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category II", null));
        scaleExeButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Scale Execute", null));
        outputLoadButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Output Load", null));
        dbSaveButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Database Save", null));
        idEdit.setText("");
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "1. \uc5f0\ub8ccID", null));
        plantCBBox.clear();
        plantCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "BW", null));
        plantCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "PW", null));
        plantCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "HW", null));
        plantCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "PH", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "2. \uc5f0\uc18c\ub3c4", null));
        hogiCBBox.clear();
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "1 \ud638\uae30", null));
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "2 \ud638\uae30", null));
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "3 \ud638\uae30", null));
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "4 \ud638\uae30", null));
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "5 \ud638\uae30", null));
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "6 \ud638\uae30", null));
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "7 \ud638\uae30", null));
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "8 \ud638\uae30", null));
        hogiCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "9 \ud638\uae30", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "MW/MTU", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "3. \uc6d0\uc790\ub85c\ud615", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "4. \ub0c9\uac01\uae30\uac04", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "5. U \ucd1d\ub7c9", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "6. \ucd08\uae30\ub18d\ucd95\ub3c4", null));
        label_10.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "7. Scale Output Data Load", null));
        typeCBBox.clear();
        typeCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "PWR", null));
        typeCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "HWR", null));
        typeCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "HANARO", null));
        kindCBBox.clear();
        kindCBBox.addItem("ce14x14");
        kindCBBox.addItem("ce16x16");
        kindCBBox.addItem("w14x14");
        kindCBBox.addItem("s14x14");
        kindCBBox.addItem("w15x15");
        kindCBBox.addItem("w17x17");
        kindCBBox.addItem("w17x17_ofa");
        kindCBBox.addItem("ge7x7-0");
        kindCBBox.addItem("ge8x8-4");
        kindCBBox.addItem("abb8x8-1");
        kindCBBox.addItem("ge9x9-7");
        kindCBBox.addItem("ge10x10-8");
        kindCBBox.addItem("atrium9-9");
        kindCBBox.addItem("atrium10-9");
        kindCBBox.addItem("svea64-1");
        kindCBBox.addItem("svea100-0");
        kindCBBox.addItem("vver440(3.6)");
        kindCBBox.addItem("vver440(3.82)");
        kindCBBox.addItem("vver440(4.25)");
        kindCBBox.addItem("vver440(4.38)");
        kindCBBox.addItem("vver1000");
        kindCBBox.addItem("agr");
        kindCBBox.addItem("magnox");
        kindCBBox.addItem("candu37");
        kindCBBox.addItem("candu28");
        kindCBBox.addItem("mox14x14");
        kindCBBox.addItem("mox15x15");
        kindCBBox.addItem("mox6x16");
        kindCBBox.addItem("mox17x17");
        kindCBBox.addItem("mox18x18");
        kindCBBox.addItem("mox8x8");
        kindCBBox.addItem("mox9x9-1");
        kindCBBox.addItem("mox9x9-9");
        kindCBBox.addItem("mox10x10");
                
        label_11.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Day", null));
        label_12.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "g", null));
        label_13.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "%", null));
        confirmButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Confirm", null));
        yearLabel.setText("");
        label_14.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Year", null));
        scaleOutLabel.setText("");
        makeIDButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Make ID", null));
    } // retranslateUi

    void connectSignalSlot()
    {
    	makeIDButton.pressed.connect(this,"makeID()");
    	coolingSBox.valueChanged.connect(this, "DaytoYear(int)");
    	scaleExeButton.pressed.connect(this, "ScaleExecute()");
    	outputLoadButton.pressed.connect(this,"OutputLoad()");
    	dbSaveButton.pressed.connect(this, "SaveDB()");
    	cat2MultiButton.pressed.connect(this,"Cat2MultiData()");
    	jugiEdit.textChanged.connect(this, "UpperCase(String)");
    	mainMenuButton.pressed.connect(this,"MainDB()");
    }
    
    void MainDB()
    {
    	AddDB adddb = new AddDB(1, new QWidget());
    	widget.close();
    }
    
    void UpperCase(String str)
    {
    	jugiEdit.setText(jugiEdit.text().toUpperCase());
    }
    
    void Cat2MultiData()
    {
    	Cat2MultiData multidata = new Cat2MultiData(new QWidget());
    	widget.close();
    }
    
    void OutputLoad() throws IOException
    {
    	QFileDialog.Filter filter = new QFileDialog.Filter("OUT (*.out);;");
    	String fileName = QFileDialog.getOpenFileName(widget, "Open File", QDir.currentPath(), filter);
    	
    	//String fileName = QFileDialog.getOpenFileName(this, tr("Open File"));
    	
    	if(fileName.isEmpty() == true) return;
    	
       	ScaleOut scale = new ScaleOut(fileName, new QWidget());
    	scale.SetParent(this);
   
     	scaleOutLabel.setText(fileName);
 /*   	try {
    	FileParse parse = new FileParse(fileName);
    	System.out.println("Line Number: " + parse.FileScanning("  nuclide   "));
    	
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    }
    
    
    void SaveDB()
    {
    	Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String strsql = "";
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();

			strsql = "insert into category2 (fuelID, plant, hogi, jugi, fuelnum, burnup, type, fuelkind, perday, peryear, u_tot, enrich, u238, u235, pu239, u236, pu240, ce140, "
					+ "cs137, ce142, mo100, nd143, mo98, mo97, sr90, nd148, u234, sm147, eu153, ba137, pm147, ba134, ag109, gd156, zr90, cs134, ru106, te125, "
					+ "gd154, sm149, sb125, in115, sn115, cd113, er166, tc98, ge72, pm146, in113, cd108, ba132, nb93, rh102) "
	    			+ "values (?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,? )";
			
			ps = con.prepareStatement(strsql);
			ps.setString(1, idEdit.text());
			ps.setString(2, plantCBBox.currentText());
			ps.setInt(3, hogiCBBox.currentIndex());
			
			ps.setString(4, jugiEdit.text());
			ps.setInt(5, fuelNoSBox.value());
			ps.setFloat(6, (float)fuelDSBox.value());
			ps.setString(7, typeCBBox.currentText());
			ps.setString(8, kindCBBox.currentText());
			ps.setInt(9, coolingSBox.value());
			ps.setFloat(10, (float)Float.valueOf(yearLabel.text()));
			ps.setFloat(11, (float)totalUDSBox.value());
			ps.setFloat(12, (float)compDSBox.value());
			ps.setDouble(13, map.get("u238"));
			ps.setDouble(14, map.get("u235"));
			ps.setDouble(15, map.get("pu239"));
			ps.setDouble(16, map.get("u236"));
			ps.setDouble(17, map.get("pu240"));
			ps.setDouble(18, map.get("ce140"));
			ps.setDouble(19, map.get("cs137"));
			ps.setDouble(20, map.get("ce142"));
			ps.setDouble(21, map.get("mo100"));
			ps.setDouble(22, map.get("nd143"));
			ps.setDouble(23, map.get("mo98"));
			ps.setDouble(24, map.get("mo97"));
			ps.setDouble(25, map.get("sr90"));
			ps.setDouble(26, map.get("nd148"));
			ps.setDouble(27, map.get("u234"));
			ps.setDouble(28, map.get("sm147"));
			ps.setDouble(29, map.get("eu153"));
			ps.setDouble(30, map.get("ba137"));
			ps.setDouble(31, map.get("pm147"));
			ps.setDouble(32, map.get("ba134"));
			ps.setDouble(33, map.get("ag109"));
			ps.setDouble(34, map.get("gd156"));
			ps.setDouble(35, map.get("zr90"));
			ps.setDouble(36, map.get("cs134"));
			ps.setDouble(37, map.get("ru106"));
			ps.setDouble(38, map.get("te125"));
			ps.setDouble(39, map.get("gd154"));
			ps.setDouble(40, map.get("sm149"));
			ps.setDouble(41, map.get("sb125"));
			ps.setDouble(42, map.get("in115"));
			ps.setDouble(43, map.get("sn115"));
			ps.setDouble(44, map.get("cd113"));
			ps.setDouble(45, map.get("er166"));
			ps.setDouble(46, map.get("tc98"));
			ps.setDouble(47, map.get("ge72"));
			ps.setDouble(48, map.get("pm146"));
			ps.setDouble(49, map.get("in113"));
			ps.setDouble(50, map.get("cd108"));
			ps.setDouble(51, map.get("ba132"));
			ps.setDouble(52, map.get("nb93"));
			ps.setDouble(53, map.get("rh102"));
			
			ps.executeUpdate();
		    ps.close();
				
		    map.clear();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
    }
    
    void ScaleExecute() throws IOException, InterruptedException
    {
    	System.out.println("Scale Executing...");
    	String file = "c:/scale6/OrigenArp/input";
		
    	File check = new File(file);
		if(check.exists()) check.delete();
		
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
    	
    	String inputline = "Title\tfuel type\tBurn-up\tUranium\tEnrichment(%)\tCooling time(yr)\tcycles\tAverage Power\tLibraries";
    	out.write(inputline);out.newLine();
    	
    	//fuelID, fueltype, Burn-up, U-tot, Enrich, Cooling time(yr), cycles, AvgPower(burnup/1000), library(=1)
    	String avgPower = String.valueOf(fuelDSBox.value()/1000);
    	String cycle = "1";
		
    	//Generation Input data
		inputline = idEdit.text()+"\t"+kindCBBox.currentText()+"\t"+fuelDSBox.text()+"\t"+totalUDSBox.text()+"\t" +
				compDSBox.text()+"\t"+yearLabel.text()+"\t"+cycle+"\t"+avgPower+"\t"+"1";
	    out.write(inputline);out.newLine();
		out.close();
	
		try {
			KinacInputGen gen = new	KinacInputGen(file);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    void DaytoYear(int day)
    {
    	float year = (float)day/365;
    	yearLabel.setText(String.valueOf(year));
    }
    
    void makeID()
    {
    	String strid = plantCBBox.currentText() + hogiCBBox.currentIndex() + jugiEdit.text() + String.valueOf(fuelNoSBox.value());
    	idEdit.setText(strid);
    }
    
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, 0);
    }
}

