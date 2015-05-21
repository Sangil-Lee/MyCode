import com.trolltech.qt.core.QRect;
import com.trolltech.qt.core.QSize;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QBrush;
import com.trolltech.qt.gui.QColor;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QPalette;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class AddDB implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton cat2Button;
    public QPushButton cat3Button;
    public QPushButton nuclearButton;
    public QPushButton cliManageButton;
    private QWidget widget;
    private int nmode = 0;

    public AddDB(QWidget wid) { super(); setupUi(wid);}
    
    public AddDB(final int mode, QWidget wid) { super(); nmode = mode; setupUi(wid);}
    
    public void setupUi(QWidget Form)
    {
        widget = Form;
    	Form.setObjectName("Form");
        Form.setMinimumSize(1200, 800);
    	Form.setMaximumSize(1200, 800);
    	
        //Form.resize(new QSize(1280, 1024).expandedTo(Form.minimumSizeHint()));
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
        
        cat2Button = new QPushButton(Form);
        cat2Button.setObjectName("cat2Button");
        cat2Button.setGeometry(new QRect(500, 340, 180, 45));
        
        cat2Button.setAutoFillBackground(true);
        cat2Button.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        
        cat3Button = new QPushButton(Form);
        cat3Button.setObjectName("cat3Button");
        cat3Button.setGeometry(new QRect(500, 400, 180, 45));
        cat3Button.setAutoFillBackground(true);
        cat3Button.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        nuclearButton = new QPushButton(Form);
        nuclearButton.setObjectName("nuclearButton");
        nuclearButton.setGeometry(new QRect(500, 460, 180, 45));
        nuclearButton.setAutoFillBackground(true);
        nuclearButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        cliManageButton = new QPushButton(Form);
        cliManageButton.setObjectName("cliManageButton");
        cliManageButton.setGeometry(new QRect(500, 520, 180, 45));
        cliManageButton.setAutoFillBackground(true);
        cliManageButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        //cliManageButton.setGeometry(new QRect(0, 0, 90, 60));
        //cliManageButton.setStyleSheet("QPushButton {image: url(classpath:images/menu_empty.png);}");
        
        if(nmode == 0) 
         cliManageButton.hide();
        
        centerWidget();
        Form.show();
        
        retranslateUi(Form);
        connectSignalSlot();
        Form.connectSlotsByName();
    } // setupUi
    
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, y);
    }

    void connectSignalSlot()
    {
    	cat2Button.pressed.connect(this, "Cat2Panel()");
    	cat3Button.pressed.connect(this, "Cat3Panel()");
    	nuclearButton.pressed.connect(this, "NuclearPanel()");
    	
    	cliManageButton.pressed.connect(this, "CliMgrPanel()");
    }
    
    void Cat2Panel()
    {
    	Cat2 cat2 = new Cat2(new QWidget());
    	widget.close();
    }
    
    void Cat3Panel()
    {
    	Cat3 cat3 = new Cat3(new QWidget());
    	widget.close();
    }
    
    void NuclearPanel()
    {
    	//EtcNuclear nuclear = new EtcNuclear(new QWidget());
    	EtcNuclearMulti nuclear = new EtcNuclearMulti(new QWidget());
    	
    	widget.close();
    }
    
    void CliMgrPanel()
    {
    	System.out.println("Client Manager..");
    	ClientMgr mgr = new ClientMgr(new QWidget());
    	widget.close();
    }

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Add Database", null));
        cat2Button.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category II", null));
        cat3Button.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category III", null));
        nuclearButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uae30\ud0c0 \ud575\ubb3c\uc9c8", null));
        cliManageButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Client Manage", null));
    } // retranslateUi

}
