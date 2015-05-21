/********************************************************************************
 ** Form generated from reading ui file 'Cat3.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.*;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Cat3 implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton uf6SearchButton;
    public QLineEdit uf6Edit;
    public QLabel label_3;
    public QPushButton mMenuButton;
    public QPushButton fuelAButton;
    public QLabel label_4;
    public QPushButton uo2SearchButton;
    public QLineEdit uo2Edit;
    public QLabel label_5;
    public QPushButton gdSearchButton;
    public QLineEdit gdEdit;
    public QPushButton sogulSearchButton;
    public QLabel label_6;
    public QLineEdit sogulEdit;
    public QLabel label_7;
    public QFrame line;
    public QFrame line_2;
    public QFrame line_3;
    public QFrame line_4;
    public QComboBox fuelCBBox;
    
    private QWidget widget;

	private Vector headerlist = new Vector();
	private HashMap <Integer, Vector<String>> contentmap = new HashMap <Integer, Vector<String>> ();
    
	public Cat3(QWidget wid) { super(); setupUi(wid); }

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
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        uf6SearchButton = new QPushButton(Form);
        uf6SearchButton.setObjectName("uf6SearchButton");
        uf6SearchButton.setGeometry(new QRect(810, 380, 181, 51));
        uf6SearchButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        
        font.setPointSize(12);
        font.setBold(true);
        uf6SearchButton.setFont(font);
        uf6Edit = new QLineEdit(Form);
        uf6Edit.setObjectName("uf6Edit");
        uf6Edit.setGeometry(new QRect(440, 380, 331, 51));
        uf6Edit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        uf6Edit.setFont(font);

        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(220, 390, 111, 31));
        label_3.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(18);
        font.setBold(true);
        label_3.setFont(font);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        mMenuButton = new QPushButton(Form);
        mMenuButton.setObjectName("mMenuButton");
        mMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mMenuButton.setStyleSheet("QPushButton {image: url(classpath:images/home.png)};");

        fuelAButton = new QPushButton(Form);
        fuelAButton.setObjectName("fuelAButton");
        fuelAButton.setGeometry(new QRect(91, 0, 90, 60));
        fuelAButton.setStyleSheet("QPushButton {image: url(classpath:images/menu_empty.png)};");
        font.setPointSize(10);
        fuelAButton.setFont(font);

        label_4 = new QLabel(Form);
        label_4.setObjectName("label_4");
        label_4.setGeometry(new QRect(80, 240, 241, 31));
        label_4.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(18);
        font.setBold(true);
        label_4.setFont(font);
        label_4.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        uo2SearchButton = new QPushButton(Form);
        uo2SearchButton.setObjectName("uo2SearchButton");
        uo2SearchButton.setGeometry(new QRect(810, 500, 181, 51));
        uo2SearchButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        font.setPointSize(12);
        font.setBold(true);
        uo2SearchButton.setFont(font);
        uo2Edit = new QLineEdit(Form);
        uo2Edit.setObjectName("uo2Edit");
        uo2Edit.setGeometry(new QRect(440, 500, 331, 51));
        uo2Edit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        uo2Edit.setFont(font);
        
        label_5 = new QLabel(Form);
        label_5.setObjectName("label_5");
        label_5.setGeometry(new QRect(220, 510, 201, 31));
        label_5.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(18);
        font.setBold(true);
        label_5.setFont(font);
        label_5.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        gdSearchButton = new QPushButton(Form);
        gdSearchButton.setObjectName("gdSearchButton");
        gdSearchButton.setGeometry(new QRect(810, 630, 180, 45));
        gdSearchButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        gdSearchButton.setFont(font);
        gdEdit = new QLineEdit(Form);
        gdEdit.setObjectName("gdEdit");
        gdEdit.setGeometry(new QRect(440, 630, 331, 51));
        gdEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        gdEdit.setFont(font);
        
        sogulSearchButton = new QPushButton(Form);
        sogulSearchButton.setObjectName("sogulSearchButton");
        sogulSearchButton.setGeometry(new QRect(810, 760, 181, 51));
        sogulSearchButton.setStyleSheet("QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}");
        font.setPointSize(12);
        font.setBold(true);
        sogulSearchButton.setFont(font);
        label_6 = new QLabel(Form);
        label_6.setObjectName("label_6");
        label_6.setGeometry(new QRect(220, 640, 201, 31));
        label_6.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(18);
        font.setBold(true);
        label_6.setFont(font);
        label_6.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        sogulEdit = new QLineEdit(Form);
        sogulEdit.setObjectName("sogulEdit");
        sogulEdit.setGeometry(new QRect(440, 760, 331, 51));
        sogulEdit.setStyleSheet("QLineEdit {background:white; color:black;}");
        font.setPointSize(16);
        font.setBold(true);
        sogulEdit.setFont(font);
        
        label_7 = new QLabel(Form);
        label_7.setObjectName("label_7");
        label_7.setGeometry(new QRect(220, 770, 201, 31));
        label_7.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(18);
        font.setBold(true);
        label_7.setFont(font);
        label_7.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        line = new QFrame(Form);
        line.setObjectName("line");
        line.setGeometry(new QRect(220, 460, 781, 16));
        line.setStyleSheet("QFrame {background:transparent;}");
        line.setFrameShape(QFrame.Shape.HLine);
        line_2 = new QFrame(Form);
        line_2.setObjectName("line_2");
        line_2.setGeometry(new QRect(220, 580, 781, 16));
        line_2.setStyleSheet("QFrame {background:transparent;}");
        line_2.setFrameShape(QFrame.Shape.HLine);
        line_3 = new QFrame(Form);
        line_3.setObjectName("line_3");
        line_3.setGeometry(new QRect(220, 710, 781, 16));
        line_3.setStyleSheet("QFrame {background:transparent;}");
        line_3.setFrameShape(QFrame.Shape.HLine);
        line_4 = new QFrame(Form);
        line_4.setObjectName("line_4");
        line_4.setGeometry(new QRect(220, 340, 781, 16));
        line_4.setStyleSheet("QFrame {background:transparent;}");
        line_4.setFrameShape(QFrame.Shape.HLine);
        fuelCBBox = new QComboBox(Form);
        fuelCBBox.setObjectName("fuelCBBox");
        fuelCBBox.setGeometry(new QRect(330, 230, 131, 51));
        fuelCBBox.setStyleSheet("QComboBox {background:white; color:blue;}");
        font.setFamily("Arial");
        font.setPointSize(18);
        fuelCBBox.setFont(font);
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
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category III", null));
        uf6SearchButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80 \uc0c9", null));
        uf6Edit.setText("");
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "1. UF6", null));
        fuelAButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Fuel\nAssembly", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Fuel Production", null));
        uo2SearchButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80 \uc0c9", null));
        uo2Edit.setText("");
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "2. UO2 Powder", null));
        gdSearchButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80 \uc0c9", null));
        gdEdit.setText("");
        sogulSearchButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80 \uc0c9", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "3. Gd \uc18c\uacb0\uccb4", null));
        sogulEdit.setText("");
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "4. \uc18c\uacb0\uccb4", null));
        fuelCBBox.clear();
        fuelCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "KNF", null));
        fuelCBBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "HANARO", null));
    } // retranslateUi
    
    void connectSignalSlot()
    {
    	fuelAButton.pressed.connect(this, "FuelAssembly()");
    	uf6SearchButton.pressed.connect(this,"UF6Search()");
    	uo2SearchButton.pressed.connect(this, "UO2Search()");
    	gdSearchButton.pressed.connect(this, "GDSearch()");
    	sogulSearchButton.pressed.connect(this, "SogulSearch()");
    	mMenuButton.pressed.connect(this, "Home()");
    }
    
    void Home()
    {
    	AddDB add = new AddDB(1, new QWidget());
    	widget.close();
    }
    
    void SogulSearch()
    {
    	QFileDialog.Filter filter = new QFileDialog.Filter("CSV (*.csv);;");
    	String fileName = QFileDialog.getOpenFileName(widget, "Open File", QDir.currentPath(), filter);
    	
    	if(fileName.isEmpty() == true) return;
    	
        try {
			FileScanning(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
    	sogulEdit.setText(fileName);
    	Cat3Sogul sogul = new Cat3Sogul(new QWidget());
    	sogul.SetHeader(headerlist);
    	sogul.SetContents(contentmap);
    	sogul.SetFileLabel(fileName);
    	sogul.Show();
    	
    }
    
    void GDSearch()
    {
    	QFileDialog.Filter filter = new QFileDialog.Filter("CSV (*.csv);;");
    	String fileName = QFileDialog.getOpenFileName(widget, "Open File", QDir.currentPath(), filter);
    	
    	if(fileName.isEmpty() == true) return;
    	
        try {
			FileScanning(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		gdEdit.setText(fileName);
    	Cat3GD gd = new Cat3GD(new QWidget());
    	gd.SetHeader(headerlist);
    	gd.SetContents(contentmap);
    	gd.SetFileLabel(fileName);
    	
    	gd.Show();
    }
    
    void UF6Search()
    {
    	QFileDialog.Filter filter = new QFileDialog.Filter("CSV (*.csv);;");
    	String fileName = QFileDialog.getOpenFileName(widget, "Open File", QDir.currentPath(), filter);
    	
    	if(fileName.isEmpty() == true) return;
    	
        try {
			FileScanning(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		uf6Edit.setText(fileName);
    	Cat3UF6 uf6 = new Cat3UF6();
    	uf6.SetHeader(headerlist);
    	uf6.SetContents(contentmap);
    	uf6.SetFileLabel(fileName);
    	uf6.Show();
    }
    
    void UO2Search()
    {
    	QFileDialog.Filter filter = new QFileDialog.Filter("CSV (*.csv;)");
    	String fileName = QFileDialog.getOpenFileName(widget, "Open File", QDir.currentPath(), filter);
    	
    	if(fileName.isEmpty() == true) return;
    	
        try {
			FileScanning(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		uo2Edit.setText(fileName);
    	Cat3UO2 uo2 = new Cat3UO2(new QWidget());
    	uo2.SetHeader(headerlist);
    	uo2.SetContents(contentmap);
    	uo2.SetFileLabel(fileName);
    	uo2.Show();
    }
    
    void FuelAssembly()
    {
    	Cat3Fuel fuel = new Cat3Fuel(new QWidget());
    	
    	widget.close();
    }

    public int FileScanning(String loadfile) throws IOException
	{
		BufferedReader input;
		String strline = "";
		int linenumber = 1;
		
		headerlist.clear();
		contentmap.clear();

		try {
			input = new BufferedReader(new FileReader(loadfile));

			int row = 0, column = 0;
			while((strline = input.readLine()) != null) {
				StringTokenizer tokenstr = new StringTokenizer(strline,",");
				String strelement = "";
	    		column = 0;
	    		//contentrow.clear();
	    		Vector contentrow = new Vector();

	    		while (tokenstr.hasMoreElements()) {
	    			strelement = tokenstr.nextElement().toString();
					//System.out.print("["+row + "]" +"[" +column +"]:" + strelement + ",");
					if( row == 0) {
						//Header.
						headerlist.add(strelement);
					} else	{
						//Contents.
						contentrow.add(strelement);
					};
					column++;
	    		}
				//System.out.println();
				
	    		if(row>0) {
					contentmap.put(row, contentrow);
	    		};
				row++;
			}
			input.close();
			
			/*Iterator headeritr = headerlist.iterator();
			while(headeritr.hasNext())
			{
				System.out.print(headeritr.next() + ", ");
			};
			System.out.println();*/
			System.out.println("Size: " + contentmap.size());
			
			/*for( Entry<Integer, Vector<String>> entry : contentmap.entrySet() ) {
			    Integer key = entry.getKey();
			    Vector <String> value = entry.getValue();
			    System.out.println("Key:" + key + ", Value: " + value);
			    
			    Iterator valueitr = value.iterator();
				while(valueitr.hasNext())
				{
					System.out.print(valueitr.next() + ", ");
				};

		    }*/
			/* more simple */
			Iterator it = contentmap.values().iterator();
			while (it.hasNext()) {
			    System.out.println(it.next());
			}
			
			return linenumber;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	};
}

