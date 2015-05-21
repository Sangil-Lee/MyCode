/********************************************************************************
 ** Form generated from reading ui file 'Cat3FuelImage.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Cat3FuelImage implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton imgviewButton;
    public QLabel preview;
    
    private QWidget widget;
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; padding: 6px;}";

    public Cat3FuelImage(QWidget wid) { super(); setupUi(wid);}

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
        label.setGeometry(new QRect(280, 30, 601, 61));
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
        imgviewButton.pressed.connect(this, "Close()");
        
        preview = new QLabel(Form);
        preview.setObjectName("preview");
        preview.setGeometry(new QRect(60, 120, 1161, 801));
        preview.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        
        retranslateUi(Form);
        
        centerWidget();
 
        Form.connectSlotsByName();
    } // setupUi
   
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, 0);
    }
    void Close()
    {
    	widget.close();
    }
    
    void ImageView (String fileName)
    {
    	if(fileName.isEmpty() == true) return;
    	QPixmap pix = new QPixmap();
    	pix.load(fileName);
    	preview.setPixmap(pix.scaled(preview.size()));
        widget.show();
    }
    
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category III Fuel Image", null));
        imgviewButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Close", null));
        preview.setText("");
    } // retranslateUi

}

