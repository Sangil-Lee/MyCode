/********************************************************************************
 ** Form generated from reading ui file 'Cat3UF6.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.Map.Entry;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Cat3UF6 extends QWidget
{
    public QLabel label;
    public QPushButton okButton;
    public QPushButton cancelButton;
    public QLabel label_2;
    public QTableWidget uo2TableWidget;
    public QLabel fileNameLabel;
    public QLabel lotLabel;
    public QLabel label_3;

    public Cat3UF6() { super(); setupUi(this); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(1280, 1024).expandedTo(Form.minimumSizeHint()));
        QPalette palette= new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(84, 84, 84));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Highlight, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(84, 84, 84));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Highlight, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(100, 100, 100));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(84, 84, 84));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(84, 84, 84));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Highlight, new QColor(51, 153, 255));
        Form.setPalette(palette);
        Form.setAutoFillBackground(true);
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(330, 20, 541, 61));
        QPalette palette1= new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(120, 120, 120));
        label.setPalette(palette1);
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        okButton = new QPushButton(Form);
        okButton.setObjectName("okButton");
        okButton.setGeometry(new QRect(890, 970, 181, 41));
        QFont font1 = new QFont();
        font1.setPointSize(12);
        font1.setBold(true);
        font1.setWeight(75);
        okButton.setFont(font1);
        cancelButton = new QPushButton(Form);
        cancelButton.setObjectName("cancelButton");
        cancelButton.setGeometry(new QRect(1080, 970, 181, 41));
        QFont font2 = new QFont();
        font2.setPointSize(12);
        font2.setBold(true);
        font2.setWeight(75);
        cancelButton.setFont(font2);
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(10, 110, 91, 31));
        QPalette palette2= new QPalette();
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(120, 120, 120));
        label_2.setPalette(palette2);
        QFont font3 = new QFont();
        font3.setFamily("Courier");
        font3.setPointSize(16);
        font3.setBold(true);
        font3.setWeight(75);
        font3.setKerning(false);
        label_2.setFont(font3);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        uo2TableWidget = new QTableWidget(Form);
        uo2TableWidget.setObjectName("uo2TableWidget");
        uo2TableWidget.setGeometry(new QRect(10, 160, 1251, 791));
        QFont tablefont = new QFont();
        tablefont.setFamily("Courier");
        tablefont.setPointSize(12);
        uo2TableWidget.setFont(tablefont);
        fileNameLabel = new QLabel(Form);
        fileNameLabel.setObjectName("fileNameLabel");
        fileNameLabel.setGeometry(new QRect(100, 110, 550, 31));
        QPalette palette3= new QPalette();
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(120, 120, 120));
        fileNameLabel.setPalette(palette3);
        QFont font4 = new QFont();
        font4.setFamily("Courier");
        font4.setPointSize(16);
        font4.setBold(true);
        font4.setWeight(75);
        font4.setKerning(false);
        fileNameLabel.setFont(font4);
        fileNameLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        fileNameLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        lotLabel = new QLabel(Form);
        lotLabel.setObjectName("lotLabel");
        lotLabel.setGeometry(new QRect(980, 110, 281, 31));
        QPalette palette4= new QPalette();
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(120, 120, 120));
        lotLabel.setPalette(palette4);
        QFont font5 = new QFont();
        font5.setFamily("Courier");
        font5.setPointSize(16);
        font5.setBold(true);
        font5.setWeight(75);
        font5.setKerning(false);
        lotLabel.setFont(font5);
        lotLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        lotLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(860, 110, 111, 31));
        QPalette palette5= new QPalette();
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(120, 120, 120));
        label_3.setPalette(palette5);
        QFont font6 = new QFont();
        font6.setFamily("Courier");
        font6.setPointSize(16);
        font6.setBold(true);
        font6.setWeight(75);
        font6.setKerning(false);
        label_3.setFont(font6);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        retranslateUi(Form);

        connectSignalSlot();
        Form.connectSlotsByName();
    } // setupUi
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category III UF6", null));
        okButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Save DB", null));
        cancelButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Cancel", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ud30c\uc77c\uba85:", null));
        uo2TableWidget.clear();
        uo2TableWidget.setColumnCount(0);
        uo2TableWidget.setRowCount(0);
        fileNameLabel.setText("");
        lotLabel.setText("");
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "LOT No.:", null));
    } // retranslateUi
    
    void connectSignalSlot()
    {
    	okButton.pressed.connect(this, "SaveDB()");
    	cancelButton.pressed.connect(this, "Cancel()");
    	
    }
    
    void SaveDB()
    {
    	
    	close();
    }
    
    void Cancel()
    {
    	fileNameLabel.setText("");
    	close();
    }
    
    public void SetFileLabel(String fileName)
    {
    	fileNameLabel.setText(fileName);
    }
    
    public void Show() { show();}
    
    public void SetHeader(Vector header)
    {
    	int headercount = header.size();
    	uo2TableWidget.setColumnCount(headercount);
    	
    	
    	Iterator headeritr = header.iterator();
		int col = 0;
		while(headeritr.hasNext())
		{
			QTableWidgetItem colItem = new QTableWidgetItem();
			colItem.setText(headeritr.next().toString());
			uo2TableWidget.setHorizontalHeaderItem(col++, colItem);
		};
    }
    
    public void SetContents(HashMap <Integer, Vector<String>> contents)
    {
    	int rowcount = contents.size();
    	uo2TableWidget.setRowCount(rowcount);
    	
    	int row = 0, col = 0;
		for( Entry<Integer, Vector<String>> entry : contents.entrySet() ) {
		    Integer key = entry.getKey();
		    Vector <String> value = entry.getValue();
		    		    
		    col = 0;
		    Iterator valueitr = value.iterator();
			while(valueitr.hasNext())
			{
				QTableWidgetItem colItem = new QTableWidgetItem();
				colItem.setText(valueitr.next().toString());
				uo2TableWidget.setItem(row, col++, colItem);
			};
			row++;
	    };
    };


}
