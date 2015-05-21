/********************************************************************************
 ** Form generated from reading ui file 'ScaleOut.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.BufferedReader;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class ScaleOut implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton okButton;
    public QPushButton cancelButton;
    public QLabel label_2;
    public QTableWidget scaleOutTableWidget;
    public QLabel fileNameLabel;
    
    private String loadfile;
    
    private Map <String, Double> map = new HashMap<String, Double> ();
    
    private Cat2 category2;
    
    private QWidget widget;
    
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String editStyle = "QLineEdit {background:white; color:blue;}";
	final String tableSytle = "QTableWidget {background:transparent;color: white; font-family: arial; font: bold 16px;};"; 
	final String tableHeaderSytle = "QHeaderView::section {background-color:lightblue; color: black; font-family: arial; font-size:14px;}"; 
 
    public ScaleOut(QWidget wid) { super(); setupUi(wid); }
    
    public ScaleOut(String fileName, QWidget wid) { 
    	super(); 
    	loadfile = fileName;
    	setupUi(wid);
    };

    public void SetParent(Cat2 cat2)
    {
    	category2 = cat2;
    }
   
    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.resize(new QSize(1280, 1024).expandedTo(Form.minimumSizeHint()));
        Form.setMinimumSize(1280, 1024);
     	Form.setMaximumSize(1280, 1024);
     	Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        Form.setAutoFillBackground(true);
        Form.setStyleSheet(strStyle);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(330, 70, 541, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        okButton = new QPushButton(Form);
        okButton.setObjectName("okButton");
        okButton.setGeometry(new QRect(870, 960, 180, 45));
        okButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        okButton.setFont(font);
        
        cancelButton = new QPushButton(Form);
        cancelButton.setObjectName("cancelButton");
        cancelButton.setGeometry(new QRect(1060, 960, 180, 45));
        cancelButton.setStyleSheet(styleButton);
        cancelButton.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(140, 160, 91, 31));
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
        scaleOutTableWidget.setGeometry(new QRect(140, 210, 1101, 721));
        scaleOutTableWidget.horizontalHeader().setStyleSheet(tableHeaderSytle);
        scaleOutTableWidget.verticalHeader().setStyleSheet(tableHeaderSytle);
        scaleOutTableWidget.setStyleSheet(tableSytle);
        scaleOutTableWidget.setFont(font);
        
        fileNameLabel = new QLabel(Form);
        fileNameLabel.setObjectName("fileNameLabel");
        fileNameLabel.setGeometry(new QRect(230, 160, 550, 31));
        font.setFamily("Courier");
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        font.setKerning(false);
        fileNameLabel.setFont(font);
        fileNameLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        fileNameLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
      
        retranslateUi(Form);
        connectSignalSlot();
        
        try {
			FileScanning("  nuclide   ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		fileNameLabel.setText(loadfile);
        
		centerWidget();
        widget.show();

        Form.connectSlotsByName();
    } // setupUi
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, 0);
        
    }
    void connectSignalSlot()
    {
    	cancelButton.pressed.connect(this, "Close()");
    	okButton.pressed.connect(this, "OK()");
    }
    
    private void Close()
    {
    	category2.scaleOutLabel.setText("");
    	widget.close();
    }
    
    private void OK()
    {
    	int colcount = scaleOutTableWidget.columnCount();
    	int rowcount = scaleOutTableWidget.rowCount();
    	
    	   	
    	//scaleOutTableWidget.horizontalHeader().setResizeMode(1, QHeaderView.ResizeMode.Stretch);
    	
        String keystr = "", valuestr = "";
    	for(int row = 0; row < rowcount; row++)
    	{
    		for (int col = 0; col < colcount; col++)
    		{
    			
    			if (col == 0)
    				keystr = scaleOutTableWidget.item(row, col).text();
    			else if (col == 1)
    				valuestr = scaleOutTableWidget.item(row, col).text();
    		};
    		System.out.println ("Key: " + keystr +", Value: " + valuestr);
    		map.put(keystr, Double.valueOf(valuestr));
    	};
    	
    	category2.map = map;
    	
    	widget.close();
    }

	public int FileScanning(final String matchStr) throws IOException
	{
		BufferedReader input;
		String strline = "";
		int linenumber = 1;

		try {
			input = new BufferedReader(new FileReader(loadfile));

			while((strline = input.readLine()) != null) {
				if(strline.contains(matchStr) == true) {
					System.out.println("Nuclide: " + strline);
					input.readLine();
					linenumber++;
					break;
				};
				linenumber++;
			};
			int numRead = 0;
			int row = 0, column = 0;
			
			scaleOutTableWidget.setRowCount(41);
			scaleOutTableWidget.setColumnCount(2);
			for ( numRead = 0; numRead < 41; numRead++)
	        {
	        	String strdata = input.readLine();
	        	//System.out.println(strdata);
	        	
	        	StringTokenizer tokenstr = new StringTokenizer(strdata);
	            column = 0;
	            String strelement = "";
	    		while (tokenstr.hasMoreElements()) {
	    			//System.out.println(tokenstr.nextElement());
	    			strelement = tokenstr.nextElement().toString();
	    			if(column == 0)
	    				scaleOutTableWidget.setItem(row, column, new QTableWidgetItem(strelement));
	    			column++;
	    		}
	    		scaleOutTableWidget.setItem(row, 1, new QTableWidgetItem(strelement));
	    		row++;
	        }
			linenumber += numRead;
			input.close();
	        return linenumber;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	};
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "SCALE Output", null));
        okButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "O.K", null));
        cancelButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Cancel", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ud30c\uc77c\uba85:", null));
        scaleOutTableWidget.clear();
        
        scaleOutTableWidget.horizontalHeader().setResizeMode(QHeaderView.ResizeMode.Stretch);
        scaleOutTableWidget.setColumnWidth(1, 400);
        scaleOutTableWidget.setColumnWidth(2, 400);
        
        scaleOutTableWidget.setColumnCount(2);
        
         QTableWidgetItem __colItem = new QTableWidgetItem();
        __colItem.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Nuclide", null));
        scaleOutTableWidget.setHorizontalHeaderItem(0, __colItem);

        QTableWidgetItem __colItem1 = new QTableWidgetItem();
        __colItem1.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Result", null));
        scaleOutTableWidget.setHorizontalHeaderItem(1, __colItem1);
        scaleOutTableWidget.setRowCount(3);

        QTableWidgetItem __rowItem = new QTableWidgetItem();
        __rowItem.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "1", null));
        scaleOutTableWidget.setVerticalHeaderItem(0, __rowItem);

        QTableWidgetItem __rowItem1 = new QTableWidgetItem();
        __rowItem1.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "2", null));
        scaleOutTableWidget.setVerticalHeaderItem(1, __rowItem1);

        QTableWidgetItem __rowItem2 = new QTableWidgetItem();
        __rowItem2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "3", null));
        scaleOutTableWidget.setVerticalHeaderItem(2, __rowItem2);
        fileNameLabel.setText("");
    } // retranslateUi

}

