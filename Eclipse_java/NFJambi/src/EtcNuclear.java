/********************************************************************************
 ** Form generated from reading ui file 'EtcNuclear.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class EtcNuclear implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton dbsaveButton;
    public QLineEdit fuelIDEdit;
    public QLabel label_2;
    public QPushButton mMenuButton;
    public QPushButton etcNucButton;
    public QPushButton multiDataSaveButton;
    public QLineEdit positionEdit;
    public QLabel label_3;
    public QLineEdit volumeEdit;
    public QLabel label_4;
    public QLabel label_5;
    public QLineEdit weightEdit;
    public QLineEdit materialEdit;
    public QLabel label_6;
    public QLabel label_7;
    public QLineEdit josungEdit;
    public QLabel label_8;
    public QLineEdit etcEdit;
    public QFrame line;
    public QFrame line_2;
    public QFrame line_3;
    public QFrame line_4;
    public QFrame line_5;
    public QFrame line_6;
    private QWidget widget;
    
    public EtcNuclear(QWidget wid) { super(); setupUi(wid);}

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.setMinimumSize(1280, 1024);
    	Form.setMaximumSize(1280, 1024);
    	Form.setStyleSheet("background-image:url(classpath:images/login_back.png); color:white;");
        Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(280, 90, 601, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        dbsaveButton = new QPushButton(Form);
        dbsaveButton.setObjectName("dbsaveButton");
        dbsaveButton.setGeometry(new QRect(1050, 950, 180, 45));
        dbsaveButton.setStyleSheet("QPushButton {image: url(classpath:images/login_btn.png);border-width: 1px; border-radius: 10px; border-color: beige; color:white; padding: 0px;};");
        font.setPointSize(10);
        font.setBold(true);

        dbsaveButton.setFont(font);
        
        fuelIDEdit = new QLineEdit(Form);
        fuelIDEdit.setObjectName("fuelIDEdit");
        fuelIDEdit.setGeometry(new QRect(320, 190, 321, 51));
        fuelIDEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        fuelIDEdit.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(130, 200, 171, 31));
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        label_2.setFont(font);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        mMenuButton = new QPushButton(Form);
        mMenuButton.setObjectName("mMenuButton");
        mMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mMenuButton.setStyleSheet("QPushButton {image: url(classpath:images/home.png)};");
        font.setPointSize(14);
        font.setBold(true);
        mMenuButton.setFont(font);
        
        etcNucButton = new QPushButton(Form);
        etcNucButton.setObjectName("etcNucButton");
        etcNucButton.setGeometry(new QRect(91, 0, 90, 60));
        etcNucButton.setStyleSheet("QPushButton {image: url(classpath:images/multi.png)};");
        
        multiDataSaveButton = new QPushButton(Form);
        multiDataSaveButton.setObjectName("multiDataSaveButton");
        multiDataSaveButton.setGeometry(new QRect(850, 950, 180, 45));
        multiDataSaveButton.setStyleSheet("QPushButton {image: url(classpath:images/login_btn.png);border-width: 1px; border-radius: 10px; border-color: beige; color:white; padding: 0px;};");
        font.setPointSize(10);
        font.setBold(true);
        multiDataSaveButton.setFont(font);
        
        positionEdit = new QLineEdit(Form);
        positionEdit.setObjectName("positionEdit");
        positionEdit.setGeometry(new QRect(320, 290, 321, 51));
        positionEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        positionEdit.setFont(font);
        
        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(130, 300, 171, 31));
        label_3.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        label_3.setFont(font);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
       
        volumeEdit = new QLineEdit(Form);
        volumeEdit.setObjectName("volumeEdit");
        volumeEdit.setGeometry(new QRect(320, 390, 321, 51));
        volumeEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        volumeEdit.setFont(font);
        
        label_4 = new QLabel(Form);
        label_4.setObjectName("label_4");
        label_4.setGeometry(new QRect(130, 400, 171, 31));
        label_4.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        label_4.setFont(font);
        label_4.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        label_5 = new QLabel(Form);
        label_5.setObjectName("label_5");
        label_5.setGeometry(new QRect(130, 500, 171, 31));
        label_5.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        label_5.setFont(font);
        label_5.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        weightEdit = new QLineEdit(Form);
        weightEdit.setObjectName("weightEdit");
        weightEdit.setGeometry(new QRect(320, 490, 321, 51));
        weightEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        weightEdit.setFont(font);
        materialEdit = new QLineEdit(Form);
        materialEdit.setObjectName("materialEdit");
        materialEdit.setGeometry(new QRect(320, 590, 321, 51));
        materialEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        materialEdit.setFont(font);
        
        label_6 = new QLabel(Form);
        label_6.setObjectName("label_6");
        label_6.setGeometry(new QRect(130, 600, 171, 31));
        label_6.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        label_6.setFont(font);
        label_6.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        label_7 = new QLabel(Form);
        label_7.setObjectName("label_7");
        label_7.setGeometry(new QRect(130, 700, 171, 31));
        label_7.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        label_7.setFont(font);
        label_7.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        josungEdit = new QLineEdit(Form);
        josungEdit.setObjectName("josungEdit");
        josungEdit.setGeometry(new QRect(320, 690, 321, 51));
        josungEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        josungEdit.setFont(font);
        
        label_8 = new QLabel(Form);
        label_8.setObjectName("label_8");
        label_8.setGeometry(new QRect(130, 800, 171, 31));
        label_8.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        label_8.setFont(font);
        label_8.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        etcEdit = new QLineEdit(Form);
        etcEdit.setObjectName("etcEdit");
        etcEdit.setGeometry(new QRect(320, 790, 811, 51));
        etcEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        etcEdit.setFont(font);
        
        line = new QFrame(Form);
        line.setObjectName("line");
        line.setGeometry(new QRect(140, 260, 1001, 16));
        line.setFrameShape(QFrame.Shape.HLine);
        line.setStyleSheet("QFrame {background:transparent;}");
        
        line_2 = new QFrame(Form);
        line_2.setObjectName("line_2");
        line_2.setGeometry(new QRect(140, 360, 1001, 16));
        line_2.setFrameShape(QFrame.Shape.HLine);
        line_2.setStyleSheet("QFrame {background:transparent;}");
        
        line_3 = new QFrame(Form);
        line_3.setObjectName("line_3");
        line_3.setGeometry(new QRect(140, 460, 1001, 16));
        line_3.setFrameShape(QFrame.Shape.HLine);
        line_3.setStyleSheet("QFrame {background:transparent;}");
        
        line_4 = new QFrame(Form);
        line_4.setObjectName("line_4");
        line_4.setGeometry(new QRect(140, 560, 1001, 16));
        line_4.setFrameShape(QFrame.Shape.HLine);
        line_4.setStyleSheet("QFrame {background:transparent;}");
        
        line_5 = new QFrame(Form);
        line_5.setObjectName("line_5");
        line_5.setGeometry(new QRect(140, 660, 1001, 16));
        line_5.setFrameShape(QFrame.Shape.HLine);
        line_5.setStyleSheet("QFrame {background:transparent;}");
        
        line_6 = new QFrame(Form);
        line_6.setObjectName("line_6");
        line_6.setGeometry(new QRect(140, 760, 1001, 16));
        line_6.setFrameShape(QFrame.Shape.HLine);
        line_6.setStyleSheet("QFrame {background:transparent;}");
        
        
        retranslateUi(Form);
        connectSignalSlot();
     
        centerWidget();
        Form.show();
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
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uae30\ud0c0 \ud575\ubb3c\uc9c8", null));
        dbsaveButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Database Save", null));
        fuelIDEdit.setText("");
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "1. \uc5f0\ub8ccID", null));
        multiDataSaveButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Multi Data Save", null));
        positionEdit.setText("");
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "2. \uc2dc\uc124\uc704\uce58", null));
        volumeEdit.setText("");
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "3. \uc218\ub7c9", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "4. \ubb34\uac8c", null));
        weightEdit.setText("");
        materialEdit.setText("");
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "5. \ubb3c\uc9c8\uc0c1\ud0dc", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "6. \uc870\uc131", null));
        josungEdit.setText("");
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "7. \uae30\ud0c0\uc785\ub825", null));
        etcEdit.setText("");
    } // retranslateUi
    
    void connectSignalSlot()
    {
    	etcNucButton.pressed.connect(this, "EtcNuclearMulti()");
    	dbsaveButton.pressed.connect(this, "DBSave()");
    	multiDataSaveButton.pressed.connect(this, "EtcNuclearMulti()");
    	mMenuButton.pressed.connect(this, "Home()");
    }
    
    void DBSave()
    {
    	
    }
    
    void Home()
    {
    	AddDB add = new AddDB(1, new QWidget());
    	widget.close();
    }
    
    void EtcNuclearMulti()
    {
    	EtcNuclearMulti multi = new EtcNuclearMulti(new QWidget());
    	widget.close();
    }

}

