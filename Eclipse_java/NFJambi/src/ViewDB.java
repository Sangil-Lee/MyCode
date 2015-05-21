/********************************************************************************
 ** Form generated from reading ui file 'ViewDB.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class ViewDB implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton cat2ViewButton;
    public QPushButton cat3ViewButton;
    public QPushButton etcViewButton;
    public Cat2Search cat2search;

    private QWidget widget;
   
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	
    public ViewDB (QWidget wid) { super(); setupUi(wid);}

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.setMinimumSize(1200, 800);
    	Form.setMaximumSize(1200, 800);
    	
        Form.setAutoFillBackground(true);
        Form.setStyleSheet(strStyle);
        Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(330, 130, 541, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        cat2ViewButton = new QPushButton(Form);
        cat2ViewButton.setObjectName("cat2ViewButton");
        cat2ViewButton.setGeometry(new QRect(500, 340, 181, 41));
        cat2ViewButton.setStyleSheet(styleButton);
        QFont btnFont = new QFont();
        btnFont.setPointSize(12);
        btnFont.setBold(true);
        btnFont.setWeight(75);
        cat2ViewButton.setFont(btnFont);
        
        cat3ViewButton = new QPushButton(Form);
        cat3ViewButton.setObjectName("cat3ViewButton");
        cat3ViewButton.setGeometry(new QRect(500, 400, 181, 41));
        cat3ViewButton.setStyleSheet(styleButton);
        cat3ViewButton.setFont(btnFont);
        
        etcViewButton = new QPushButton(Form);
        etcViewButton.setObjectName("etcViewButton");
        etcViewButton.setGeometry(new QRect(500, 460, 181, 41));
        etcViewButton.setStyleSheet(styleButton);
        etcViewButton.setFont(btnFont);
       
        retranslateUi(Form);

        connectSignalSlot();
        
        Form.show();
        
        centerWidget();
        Form.connectSlotsByName();
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
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "View Database", null));
        cat2ViewButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category II", null));
        cat3ViewButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category III", null));
        etcViewButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uae30\ud0c0 \ud575\ubb3c\uc9c8", null));
    } // retranslateUi
    
    void connectSignalSlot()
    {
    	cat2ViewButton.pressed.connect(this, "Cat2View()");
    	cat3ViewButton.pressed.connect(this, "Cat3View()");
    	etcViewButton.pressed.connect(this, "EtcView()");
    }
    
    void Cat2View()
    {
    	if (cat2search == null)
    		cat2search = new Cat2Search(new QWidget());
    	
    	widget.close();
    }
    
    void Cat3View()
    {
    	//if(cat3search == null)
    	Cat3Search cat3search = new Cat3Search (new QWidget());
    	
    	widget.close();
    }
    
    void EtcView()
    {
    	EtcNuclearMultiSearch search = new EtcNuclearMultiSearch(new QWidget());
    	
    	widget.close();
    }
   
}

