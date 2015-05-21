/********************************************************************************
 ** Form generated from reading ui file 'Cat3Sogul.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;


public class Cat3Sogul implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton okButton;
    public QPushButton cancelButton;
    public QLabel label_2;
    public QTableWidget uo2TableWidget;
    public QLabel fileNameLabel;
    public QLabel lotLabel;
    public QLabel label_3;
    
    private QWidget widget;
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String tableSytle = "QTableWidget {background:transparent;};"; 
	final String tableHeaderSytle = "QHeaderView::section {background-color:lightblue; color: black; font-family: arial; font-size:12px;}"; 
	
    public Cat3Sogul(QWidget wid) { super(); setupUi(wid); }

    public void setupUi(QWidget Form)
    {
    	widget = Form;
    	widget = Form;
        Form.resize(new QSize(1280, 1024).expandedTo(Form.minimumSizeHint()));
        Form.setMinimumSize(1280, 1024);
     	Form.setMaximumSize(1280, 1024);
     	Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        Form.setAutoFillBackground(true);
        Form.setStyleSheet(strStyle);
        
        label = new QLabel(Form);
        label.setObjectName("label");
        label.setGeometry(new QRect(330, 20, 541, 61));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);

        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        okButton = new QPushButton(Form);
        okButton.setObjectName("okButton");
        okButton.setGeometry(new QRect(890, 970, 180, 45));
        okButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        okButton.setFont(font);
        
        cancelButton = new QPushButton(Form);
        cancelButton.setObjectName("cancelButton");
        cancelButton.setGeometry(new QRect(1080, 970, 180, 45));
        cancelButton.setStyleSheet(styleButton);
        cancelButton.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(10, 110, 91, 31));
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        font.setKerning(false);
        label_2.setFont(font);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        uo2TableWidget = new QTableWidget(Form);
        uo2TableWidget.setObjectName("uo2TableWidget");
        uo2TableWidget.setGeometry(new QRect(10, 160, 1251, 791));
        uo2TableWidget.horizontalHeader().setStyleSheet(tableHeaderSytle);
        uo2TableWidget.verticalHeader().setStyleSheet(tableHeaderSytle);
        uo2TableWidget.setStyleSheet(tableSytle);
        
        fileNameLabel = new QLabel(Form);
        fileNameLabel.setObjectName("fileNameLabel");
        fileNameLabel.setGeometry(new QRect(100, 110, 550, 31));
        font.setFamily("Courier");
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        font.setKerning(false);
        fileNameLabel.setFont(font);
        fileNameLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        fileNameLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        lotLabel = new QLabel(Form);
        lotLabel.setObjectName("lotLabel");
        lotLabel.setGeometry(new QRect(980, 110, 281, 31));
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        font.setKerning(false);
        lotLabel.setFont(font);
        lotLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        lotLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(860, 110, 111, 31));
        label_3.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        font.setKerning(false);
        label_3.setFont(font);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        retranslateUi(Form);
        
        connectSignalSlot();
        
        Form.connectSlotsByName();
    } // setupUi
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        int y = (screenGeometry.height() - widget.height()) / 2;
        widget.move(x, 0);
        
    }
    public void Show()
    {
    	centerWidget();
    	widget.show();
    }

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category III \uc18c\uacb0\uccb4", null));
        okButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Save DB", null));
        cancelButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Cancel", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ud30c\uc77c\uba85:", null));
        uo2TableWidget.clear();
        
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
    	Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String strsql = "";
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();

			strsql = "insert into cat3sogul ( productID, fuelID, gdlotno, productdate, u235_1, u235_2, ucont_1, "
					+ "ucont_2, ourate_1, ourate_2, boroncont, c, f, n, simgmntialca, b, bi, cd, co, cu, iin, pb, sn, v, zn, cr, "
					+ "crmofeniw, 10times, 400times ) "
					+ "values ( "
					+ "?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,? )";

			ps = con.prepareStatement(strsql);

			int rowcnt = uo2TableWidget.rowCount();
			int colcnt = uo2TableWidget.columnCount();
			
			for(int row = 0; row < rowcnt; row++)
			{
				int dbindex = 3;
				ps.clearParameters();
				ps.setString(1, "KNF");
				ps.setString(2, "K-Lot");
					
				for(int col = 0; col < colcnt; col++ )
				{
					QTableWidgetItem item = uo2TableWidget.item(row, col);
					if(item == null)
					{
						item = new QTableWidgetItem();
						item.setText("");
					};
					
					switch (dbindex)
					{
						case 3:
						case 15:
						case 27:
						case 28:
						case 29:
							ps.setString(dbindex, item.text());
							break;
						
						case 4:
							ps.setDate(dbindex, Date.valueOf(item.text()));
							break;
							
						default:
							ps.setFloat(dbindex, Float.valueOf(item.text()));
							break;
					};
					//System.out.println("["+row+"]"+"["+col+"]"+item.text());
					System.out.println("DBIndex[" + dbindex + "]-> " + item.text());
					
					dbindex++;
					
				};
				ps.executeUpdate();
			
			};
			
		    ps.close();
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
    	widget.close();
    }
    
    void Cancel()
    {
    	fileNameLabel.setText("");
    	
    	widget.close();
    }
    
    public void SetFileLabel(String fileName)
    {
    	fileNameLabel.setText(fileName);
    }
    
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

