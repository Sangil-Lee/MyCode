/********************************************************************************
 ** Form generated from reading ui file 'TrendItem.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TrendItem implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton okButton;
    public QPushButton cancelButton;
    public QCheckBox checkBox_1;
    public QCheckBox checkBox_2;
    public QCheckBox checkBox_3;
    public QCheckBox checkBox_4;
    public QCheckBox checkBox_5;
    public QCheckBox checkBox_6;
    public QCheckBox checkBox_7;
    public QCheckBox checkBox_8;
    public QCheckBox checkBox_9;
    public QCheckBox checkBox_10;
    public QCheckBox checkBox_11;
    public QCheckBox checkBox_12;
    public QCheckBox checkBox_13;
    public QCheckBox checkBox_14;
    public QCheckBox checkBox_15;
    public QCheckBox checkBox_16;
    public QCheckBox checkBox_17;
    public QCheckBox checkBox_18;
    public QCheckBox checkBox_19;
    public QCheckBox checkBox_20;
    public QCheckBox checkBox_21;
    public QCheckBox checkBox_22;
    public QCheckBox checkBox_23;
    public QCheckBox checkBox_24;
    public QCheckBox checkBox_25;
    public QCheckBox checkBox_26;
    public QCheckBox checkBox_27;
    public QCheckBox checkBox_28;
    public QCheckBox checkBox_29;
    public QCheckBox checkBox_30;
    public QCheckBox checkBox_31;
    public QCheckBox checkBox_32;
    public QCheckBox checkBox_33;
    public QCheckBox checkBox_34;
    public QCheckBox checkBox_35;
    public QCheckBox checkBox_36;
    public QCheckBox checkBox_37;
    public QCheckBox checkBox_38;
    public QCheckBox checkBox_39;
    public QCheckBox checkBox_40;
    public QCheckBox checkBox_41;
    
    private QWidget widget;
    private Cat2Search cat2search;

    public TrendItem(QWidget wid) { super(); setupUi(wid);}
    public TrendItem(Cat2Search parent, QWidget wid) { super(); cat2search=parent; setupUi(wid);};
	
    final String strStyle    = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String checkSytle  = "QCheckBox {background: transparent}";

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        
        Form.setMinimumSize(1200, 850);
    	Form.setMaximumSize(1200, 850);
    	
        Form.setAutoFillBackground(true);
        Form.setStyleSheet(strStyle);
        Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(330, 30, 541, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        okButton = new QPushButton(Form);
        okButton.setObjectName("okButton");
        okButton.setGeometry(new QRect(750, 760, 180, 45));
        okButton.setStyleSheet(styleButton);
        
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        okButton.setFont(font);
        
        cancelButton = new QPushButton(Form);
        cancelButton.setObjectName("cancelButton");
        cancelButton.setGeometry(new QRect(940, 760, 180, 45));
        cancelButton.setStyleSheet(styleButton);
        cancelButton.setFont(font);
        
        checkBox_1 = new QCheckBox(Form);
        checkBox_1.setObjectName("checkBox_1");
        checkBox_1.setGeometry(new QRect(190, 140, 121, 51));
        checkBox_1.setStyleSheet(checkSytle);
        
        font.setPointSize(15);
        font.setBold(true);
        font.setWeight(75);
        checkBox_1.setFont(font);
        checkBox_1.setIconSize(new QSize(16, 16));
        
        checkBox_2 = new QCheckBox(Form);
        checkBox_2.setObjectName("checkBox_2");
        checkBox_2.setGeometry(new QRect(390, 140, 121, 51));
        checkBox_2.setStyleSheet(checkSytle);
        checkBox_2.setFont(font);
        checkBox_2.setIconSize(new QSize(16, 16));
       
        checkBox_3 = new QCheckBox(Form);
        checkBox_3.setObjectName("checkBox_3");
        checkBox_3.setGeometry(new QRect(830, 140, 121, 51));
        checkBox_3.setStyleSheet(checkSytle);
        checkBox_3.setFont(font);
        checkBox_3.setIconSize(new QSize(16, 16));
        
        checkBox_4 = new QCheckBox(Form);
        checkBox_4.setObjectName("checkBox_4");
        checkBox_4.setGeometry(new QRect(600, 140, 121, 51));
        checkBox_4.setStyleSheet(checkSytle);
        checkBox_4.setFont(font);
        checkBox_4.setIconSize(new QSize(16, 16));
        
        checkBox_5 = new QCheckBox(Form);
        checkBox_5.setObjectName("checkBox_5");
        checkBox_5.setGeometry(new QRect(830, 200, 121, 51));
        checkBox_5.setStyleSheet(checkSytle);
        checkBox_5.setFont(font);
        checkBox_5.setIconSize(new QSize(16, 16));

        checkBox_6 = new QCheckBox(Form);
        checkBox_6.setObjectName("checkBox_6");
        checkBox_6.setGeometry(new QRect(390, 200, 121, 51));
        checkBox_6.setStyleSheet(checkSytle);
        checkBox_6.setFont(font);
        checkBox_6.setIconSize(new QSize(16, 16));
        
        checkBox_7 = new QCheckBox(Form);
        checkBox_7.setObjectName("checkBox_7");
        checkBox_7.setGeometry(new QRect(190, 200, 121, 51));
        checkBox_7.setStyleSheet(checkSytle);
        checkBox_7.setFont(font);
        checkBox_7.setIconSize(new QSize(16, 16));
        
        checkBox_8 = new QCheckBox(Form);
        checkBox_8.setObjectName("checkBox_8");
        checkBox_8.setGeometry(new QRect(600, 200, 121, 51));
        checkBox_8.setStyleSheet(checkSytle);
        checkBox_8.setFont(font);
        checkBox_8.setIconSize(new QSize(16, 16));
        
        checkBox_9 = new QCheckBox(Form);
        checkBox_9.setObjectName("checkBox_9");
        checkBox_9.setGeometry(new QRect(190, 260, 121, 51));
        checkBox_9.setStyleSheet(checkSytle);
        checkBox_9.setFont(font);
        checkBox_9.setIconSize(new QSize(16, 16));
        
        checkBox_10 = new QCheckBox(Form);
        checkBox_10.setObjectName("checkBox_10");
        checkBox_10.setGeometry(new QRect(390, 260, 121, 51));
        checkBox_10.setStyleSheet(checkSytle);
        checkBox_10.setFont(font);
        checkBox_10.setIconSize(new QSize(16, 16));
        
        checkBox_11 = new QCheckBox(Form);
        checkBox_11.setObjectName("checkBox_11");
        checkBox_11.setGeometry(new QRect(830, 260, 121, 51));
        checkBox_11.setStyleSheet(checkSytle);
        checkBox_11.setFont(font);
        checkBox_11.setIconSize(new QSize(16, 16));
        
        checkBox_12 = new QCheckBox(Form);
        checkBox_12.setObjectName("checkBox_12");
        checkBox_12.setGeometry(new QRect(600, 260, 121, 51));
        checkBox_12.setStyleSheet(checkSytle);
        checkBox_12.setFont(font);
        checkBox_12.setIconSize(new QSize(16, 16));
        
        checkBox_13 = new QCheckBox(Form);
        checkBox_13.setObjectName("checkBox_13");
        checkBox_13.setGeometry(new QRect(190, 320, 121, 51));
        checkBox_13.setStyleSheet(checkSytle);
        checkBox_13.setFont(font);
        checkBox_13.setIconSize(new QSize(16, 16));
        
        checkBox_14 = new QCheckBox(Form);
        checkBox_14.setObjectName("checkBox_14");
        checkBox_14.setGeometry(new QRect(600, 320, 121, 51));
        checkBox_14.setStyleSheet(checkSytle);
        checkBox_14.setFont(font);
        checkBox_14.setIconSize(new QSize(16, 16));
        
        checkBox_15 = new QCheckBox(Form);
        checkBox_15.setObjectName("checkBox_15");
        checkBox_15.setGeometry(new QRect(390, 320, 121, 51));
        checkBox_15.setStyleSheet(checkSytle);
        checkBox_15.setFont(font);
        checkBox_15.setIconSize(new QSize(16, 16));

        checkBox_16 = new QCheckBox(Form);
        checkBox_16.setObjectName("checkBox_16");
        checkBox_16.setGeometry(new QRect(830, 320, 121, 51));
        checkBox_16.setStyleSheet(checkSytle);
        checkBox_16.setFont(font);
        checkBox_16.setIconSize(new QSize(16, 16));

        checkBox_17 = new QCheckBox(Form);
        checkBox_17.setObjectName("checkBox_17");
        checkBox_17.setGeometry(new QRect(190, 380, 121, 51));
        checkBox_17.setStyleSheet(checkSytle);
        checkBox_17.setFont(font);
        checkBox_17.setIconSize(new QSize(16, 16));

        checkBox_18 = new QCheckBox(Form);
        checkBox_18.setObjectName("checkBox_18");
        checkBox_18.setGeometry(new QRect(830, 380, 121, 51));
        checkBox_18.setStyleSheet(checkSytle);
        checkBox_18.setFont(font);
        checkBox_18.setIconSize(new QSize(16, 16));

        checkBox_19 = new QCheckBox(Form);
        checkBox_19.setObjectName("checkBox_19");
        checkBox_19.setGeometry(new QRect(600, 380, 121, 51));
        checkBox_19.setStyleSheet(checkSytle);
        checkBox_19.setFont(font);
        checkBox_19.setIconSize(new QSize(16, 16));

        checkBox_20 = new QCheckBox(Form);
        checkBox_20.setObjectName("checkBox_20");
        checkBox_20.setGeometry(new QRect(390, 380, 121, 51));
        checkBox_20.setStyleSheet(checkSytle);
        checkBox_20.setFont(font);
        checkBox_20.setIconSize(new QSize(16, 16));

        checkBox_21 = new QCheckBox(Form);
        checkBox_21.setObjectName("checkBox_21");
        checkBox_21.setGeometry(new QRect(390, 440, 121, 51));
        checkBox_21.setStyleSheet(checkSytle);
        checkBox_21.setFont(font);
        checkBox_21.setIconSize(new QSize(16, 16));

        checkBox_22 = new QCheckBox(Form);
        checkBox_22.setObjectName("checkBox_22");
        checkBox_22.setGeometry(new QRect(600, 440, 121, 51));
        checkBox_22.setStyleSheet(checkSytle);
        checkBox_22.setFont(font);
        checkBox_22.setIconSize(new QSize(16, 16));

        checkBox_23 = new QCheckBox(Form);
        checkBox_23.setObjectName("checkBox_23");
        checkBox_23.setGeometry(new QRect(190, 440, 121, 51));
        checkBox_23.setStyleSheet(checkSytle);
        checkBox_23.setFont(font);
        checkBox_23.setIconSize(new QSize(16, 16));

        checkBox_24 = new QCheckBox(Form);
        checkBox_24.setObjectName("checkBox_24");
        checkBox_24.setGeometry(new QRect(830, 440, 121, 51));
        checkBox_24.setStyleSheet(checkSytle);
        checkBox_24.setFont(font);
        checkBox_24.setIconSize(new QSize(16, 16));

        checkBox_25 = new QCheckBox(Form);
        checkBox_25.setObjectName("checkBox_25");
        checkBox_25.setGeometry(new QRect(390, 500, 121, 51));
        checkBox_25.setStyleSheet(checkSytle);
        checkBox_25.setFont(font);
        checkBox_25.setIconSize(new QSize(16, 16));

        checkBox_26 = new QCheckBox(Form);
        checkBox_26.setObjectName("checkBox_26");
        checkBox_26.setGeometry(new QRect(600, 500, 121, 51));
        checkBox_26.setStyleSheet(checkSytle);
        checkBox_26.setFont(font);
        checkBox_26.setIconSize(new QSize(16, 16));

        checkBox_27 = new QCheckBox(Form);
        checkBox_27.setObjectName("checkBox_27");
        checkBox_27.setGeometry(new QRect(190, 500, 121, 51));
        checkBox_27.setStyleSheet(checkSytle);
        checkBox_27.setFont(font);
        checkBox_27.setIconSize(new QSize(16, 16));

        checkBox_28 = new QCheckBox(Form);
        checkBox_28.setObjectName("checkBox_28");
        checkBox_28.setGeometry(new QRect(830, 500, 121, 51));
        checkBox_28.setStyleSheet(checkSytle);
        checkBox_28.setFont(font);
        checkBox_28.setIconSize(new QSize(16, 16));

        checkBox_29 = new QCheckBox(Form);
        checkBox_29.setObjectName("checkBox_29");
        checkBox_29.setGeometry(new QRect(390, 560, 121, 51));
        checkBox_29.setStyleSheet(checkSytle);
        checkBox_29.setFont(font);
        checkBox_29.setIconSize(new QSize(16, 16));

        checkBox_30 = new QCheckBox(Form);
        checkBox_30.setObjectName("checkBox_30");
        checkBox_30.setGeometry(new QRect(600, 560, 121, 51));
        checkBox_30.setStyleSheet(checkSytle);
        checkBox_30.setFont(font);
        checkBox_30.setIconSize(new QSize(16, 16));

        checkBox_31 = new QCheckBox(Form);
        checkBox_31.setObjectName("checkBox_31");
        checkBox_31.setGeometry(new QRect(190, 560, 121, 51));
        checkBox_31.setStyleSheet(checkSytle);
        checkBox_31.setFont(font);
        checkBox_31.setIconSize(new QSize(16, 16));

        checkBox_32 = new QCheckBox(Form);
        checkBox_32.setObjectName("checkBox_32");
        checkBox_32.setGeometry(new QRect(830, 560, 121, 51));
        checkBox_32.setStyleSheet(checkSytle);
        checkBox_32.setFont(font);
        checkBox_32.setIconSize(new QSize(16, 16));

        checkBox_33 = new QCheckBox(Form);
        checkBox_33.setObjectName("checkBox_33");
        checkBox_33.setGeometry(new QRect(190, 620, 121, 51));
        checkBox_33.setStyleSheet(checkSytle);
        checkBox_33.setFont(font);
        checkBox_33.setIconSize(new QSize(16, 16));

        checkBox_34 = new QCheckBox(Form);
        checkBox_34.setObjectName("checkBox_34");
        checkBox_34.setGeometry(new QRect(190, 680, 121, 51));
        checkBox_34.setStyleSheet(checkSytle);
        checkBox_34.setFont(font);
        checkBox_34.setIconSize(new QSize(16, 16));

        checkBox_35 = new QCheckBox(Form);
        checkBox_35.setObjectName("checkBox_35");
        checkBox_35.setGeometry(new QRect(390, 620, 121, 51));
        checkBox_35.setStyleSheet(checkSytle);
        checkBox_35.setFont(font);
        checkBox_35.setIconSize(new QSize(16, 16));

        checkBox_36 = new QCheckBox(Form);
        checkBox_36.setObjectName("checkBox_36");
        checkBox_36.setGeometry(new QRect(390, 680, 121, 51));
        checkBox_36.setStyleSheet(checkSytle);
        checkBox_36.setFont(font);
        checkBox_36.setIconSize(new QSize(16, 16));

        checkBox_37 = new QCheckBox(Form);
        checkBox_37.setObjectName("checkBox_37");
        checkBox_37.setGeometry(new QRect(600, 680, 121, 51));
        checkBox_37.setStyleSheet(checkSytle);
        checkBox_37.setFont(font);
        checkBox_37.setIconSize(new QSize(16, 16));

        checkBox_38 = new QCheckBox(Form);
        checkBox_38.setObjectName("checkBox_38");
        checkBox_38.setGeometry(new QRect(600, 620, 121, 51));
        checkBox_38.setStyleSheet(checkSytle);
        checkBox_38.setFont(font);
        checkBox_38.setIconSize(new QSize(16, 16));

        checkBox_39 = new QCheckBox(Form);
        checkBox_39.setObjectName("checkBox_39");
        checkBox_39.setGeometry(new QRect(830, 620, 121, 51));
        checkBox_39.setStyleSheet(checkSytle);
        checkBox_39.setFont(font);
        checkBox_39.setIconSize(new QSize(16, 16));

        checkBox_40 = new QCheckBox(Form);
        checkBox_40.setObjectName("checkBox_40");
        checkBox_40.setGeometry(new QRect(830, 680, 121, 51));
        checkBox_40.setStyleSheet(checkSytle);
        checkBox_40.setFont(font);
        checkBox_40.setIconSize(new QSize(16, 16));

        checkBox_41 = new QCheckBox(Form);
        checkBox_41.setObjectName("checkBox_41");
        checkBox_41.setGeometry(new QRect(970, 140, 121, 51));
        checkBox_41.setStyleSheet(checkSytle);
        checkBox_41.setFont(font);
        checkBox_41.setIconSize(new QSize(16, 16));

        retranslateUi(Form);
        connectSignalSlot();
        disableItemAll();
        centerWidget();
        widget.show();
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
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Trend Item Select", null));
        okButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "O.K", null));
        cancelButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Cancel", null));
        checkBox_1.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "u238", null));
        checkBox_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "mo98", null));
        checkBox_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "sn115", null));
        checkBox_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ag109", null));
        checkBox_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "cd113", null));
        checkBox_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "mo97", null));
        checkBox_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "u235", null));
        checkBox_8.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "gd156", null));
        checkBox_9.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "pu239", null));
        checkBox_10.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "sr90", null));
        checkBox_11.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "er166", null));
        checkBox_12.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "zr90", null));
        checkBox_13.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "u236", null));
        checkBox_14.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "cs134", null));
        checkBox_15.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "nd148", null));
        checkBox_16.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "tc98", null));
        checkBox_17.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "pu240", null));
        checkBox_18.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ge72", null));
        checkBox_19.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ru106", null));
        checkBox_20.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "u234", null));
        checkBox_21.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "sm147", null));
        checkBox_22.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "te125", null));
        checkBox_23.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ce140", null));
        checkBox_24.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "pm146", null));
        checkBox_25.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "eu153", null));
        checkBox_26.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "gd154", null));
        checkBox_27.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "cs137", null));
        checkBox_28.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "in113", null));
        checkBox_29.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ba137", null));
        checkBox_30.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "sm149", null));
        checkBox_31.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ce142", null));
        checkBox_32.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "cd108", null));
        checkBox_33.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "mo100", null));
        checkBox_34.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "nd143", null));
        checkBox_35.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "pm147", null));
        checkBox_36.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ba134", null));
        checkBox_37.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "in115", null));
        checkBox_38.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "sb125", null));
        checkBox_39.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "ba132", null));
        checkBox_40.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "nb93", null));
        checkBox_41.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "rh102", null));
    } // retranslateUi
    
    void connectSignalSlot()
    {
    	okButton.pressed.connect(this, "Trend()");
    	cancelButton.pressed.connect(this, "Close()");
    }
    
    void Close()
    {
    	widget.close();
    }
    
    void disableItemAll()
    {
    	List <QObject> objs = widget.children();
    	Iterator objitr = objs.iterator();
    	
    	while (objitr.hasNext())
    	{
    		QObject obj = (QObject)objitr.next();
    		if(obj.objectName().contains("checkBox_") != true) continue;
    		
    		QCheckBox cbObj = (QCheckBox)obj;
    		cbObj.setEnabled(false);
    	}
     }
    
    void Trend()
    {
    	List <QObject> objs = widget.children();
    	Iterator objitr = objs.iterator();
    	
    	cat2search.RemoveItemsAll();
    	while (objitr.hasNext())
    	{
    		QObject obj = (QObject)objitr.next();
    		if(obj.objectName().contains("checkBox_") != true) continue;
    		
    		QCheckBox cbObj = (QCheckBox)obj;
    		if(cbObj.isChecked() == true)
    		{
    			System.out.println(obj.objectName()+"," + cbObj.text());
    			cat2search.AddItem(cbObj.text());
    		}
    	}
    	cat2search.Trend();
    	widget.close();
    }
    
    void SetItem(String item)
    {
    	List <QObject> objs = widget.children();
    	Iterator objitr = objs.iterator();
    	
    	while (objitr.hasNext())
    	{
    		QObject obj = (QObject)objitr.next();
    		if(obj.objectName().contains("checkBox_") != true) continue;
    		
    		QCheckBox cbObj = (QCheckBox)obj;
    		if (cbObj.text().compareTo(item) == 0)
    			cbObj.setEnabled(true);
    		
    	};
    }
   
}
