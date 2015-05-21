/********************************************************************************
 ** Form generated from reading ui file 'EtcNuclearMulti.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Map.Entry;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class EtcNuclearMulti implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton loadFileButton;
    public QPushButton dbSaveButton;
    public QLabel label_2;
    public QTableWidget scaleOutTableWidget;
    public QLabel fileNameLabel;
    //public QPushButton nucSingleButton;
    public QPushButton mainMenuButton;
    
    private QWidget widget;
	private Vector headerlist = new Vector();
	private HashMap <Integer, Vector<String>> contentmap = new HashMap <Integer, Vector<String>> ();
	
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String menuButton = "QPushButton {image: url(classpath:images/menu_empty.png)};";
	final String homemenuButton = "QPushButton {image: url(classpath:images/home.png)};";
	final String tableSytle = "QTableWidget {background:transparent;};"; 
	final String tableHeaderSytle = "QHeaderView::section {background-color:lightblue; color: black; font-family: arial; font-size:12px;}"; 
	
    public EtcNuclearMulti(QWidget wid) { super(); setupUi(wid);}

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.setMinimumSize(1280, 1024);
    	Form.setMaximumSize(1280, 1024);
    	Form.setStyleSheet(strStyle);
        Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
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
   
        loadFileButton = new QPushButton(Form);
        loadFileButton.setObjectName("loadFileButton");
        loadFileButton.setGeometry(new QRect(870, 960, 180, 45));
        loadFileButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        loadFileButton.setFont(font);
        
        dbSaveButton = new QPushButton(Form);
        dbSaveButton.setObjectName("dbSaveButton");
        dbSaveButton.setGeometry(new QRect(1060, 960, 180, 45));
        dbSaveButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        dbSaveButton.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(20, 160, 91, 31));
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
        scaleOutTableWidget.setGeometry(new QRect(20, 210, 1251, 721));
        scaleOutTableWidget.horizontalHeader().setStyleSheet(tableHeaderSytle);
        scaleOutTableWidget.verticalHeader().setStyleSheet(tableHeaderSytle);
        scaleOutTableWidget.setStyleSheet(tableSytle);
        scaleOutTableWidget.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.SingleSelection);
        
        fileNameLabel = new QLabel(Form);
        fileNameLabel.setObjectName("fileNameLabel");
        fileNameLabel.setGeometry(new QRect(110, 160, 650, 31));
        font.setFamily("Courier");
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        font.setKerning(false);
        fileNameLabel.setFont(font);
        fileNameLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        fileNameLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        mainMenuButton = new QPushButton(Form);
        mainMenuButton.setObjectName("mainMenuButton");
        mainMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mainMenuButton.setStyleSheet(homemenuButton);

        retranslateUi(Form);
        connectSignalSlot();
        centerWidget();
        widget.show();
        Form.connectSlotsByName();
    } // setupUi
    
    void centerWidget()
    {
        QRect screenGeometry = QApplication.desktop().screenGeometry();
        int x = (screenGeometry.width() - widget.width()) / 2;
        widget.move(x, 0);
        
    }
    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uae30\ud0c0 \ud575\ubb3c\uc9c8", null));
        loadFileButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Load File", null));
        dbSaveButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Database Save", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ud30c\uc77c\uba85:", null));
        scaleOutTableWidget.clear();
        
    } // retranslateUi
    
    void connectSignalSlot()
    {
    	mainMenuButton.pressed.connect(this, "Home()");
    	dbSaveButton.pressed.connect(this, "SaveDB()");
    	loadFileButton.pressed.connect(this, "FileLoad()");
    }
    
    void Home()
    {
    	AddDB add = new AddDB(1, new QWidget());
    	widget.close();
    }
    
    void NucSingle()
    {
    	EtcNuclear etcnuclear = new EtcNuclear(new QWidget());
    	widget.close();
    }
    
    void FileLoad()
    {
    	QFileDialog.Filter filter = new QFileDialog.Filter("CSV (*.csv);;");
    	String fileName = QFileDialog.getOpenFileName(widget, "Open File", QDir.currentPath(), filter);
    	
    	if(fileName.isEmpty() == true) return;
    	
        try {
			FileScanning(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		};
		
    	SetHeader(headerlist);
    	SetContents(contentmap);
    	fileNameLabel.setText(fileName);
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
						if(strelement.compareToIgnoreCase("null") == 0) strelement = "";
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
			
			System.out.println("Size: " + contentmap.size());
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
    public void SetHeader(Vector header)
    {
    	int headercount = header.size();
    	scaleOutTableWidget.setColumnCount(headercount);
    	
    	
    	Iterator headeritr = header.iterator();
		int col = 0;
		while(headeritr.hasNext())
		{
			QTableWidgetItem colItem = new QTableWidgetItem();
			colItem.setText(headeritr.next().toString());
			scaleOutTableWidget.setHorizontalHeaderItem(col++, colItem);
		};
    }
    
    public void SetContents(HashMap <Integer, Vector<String>> contents)
    {
    	int rowcount = contents.size();
    	scaleOutTableWidget.setRowCount(rowcount);
    	
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
				scaleOutTableWidget.setItem(row, col++, colItem);
			};
			row++;
	    };
    };
    
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

			strsql = "insert into etcnucl (mba, kmp, batch, items, md, e, woe, unit, wofi, isotopcode, orign) "
					+ "values (?,?,?,?,?,?,?,?,?, ?,?)";
								
			ps = con.prepareStatement(strsql);
			
			int rowcnt = scaleOutTableWidget.rowCount();
			int colcnt = scaleOutTableWidget.columnCount();
			
			for(int row = 0; row < rowcnt; row++)
			{
				int dbindex = 1;
				ps.clearParameters();
			
				for(int col = 0; col < colcnt; col++ )
				{
					QTableWidgetItem item = scaleOutTableWidget.item(row, col);
					if(item == null)
					{
						item = new QTableWidgetItem();
						item.setText("0");
					};
					String strval = item.text();
					switch(dbindex)
					{
						case 4:
						case 7:
						case 9:
							if(strval.compareToIgnoreCase("null") == 0 || strval.isEmpty() == true) strval = "0"; 
							ps.setFloat(dbindex, Float.valueOf(strval));
							break;
						default:
							if(strval.compareToIgnoreCase("null") == 0 ) strval = ""; 
							ps.setString(dbindex, strval);
							break;
					}	
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
		
    	//widget.close();
    }
}

