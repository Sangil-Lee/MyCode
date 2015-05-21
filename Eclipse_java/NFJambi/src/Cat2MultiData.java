/********************************************************************************
 ** Form generated from reading ui file 'Cat2MultiData.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Map.Entry;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;


public class Cat2MultiData implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton scaleExeButton;
    public QPushButton loadFileButton;
    public QPushButton dbSaveButton;
    public QLabel label_2;
    public QTableWidget scaleOutTableWidget;
    public QLabel fileNameLabel;
    public QPushButton cat2SingleButton;
    public QPushButton mainMenuButton;
    
	private Vector headerlist = new Vector();
	private HashMap <Integer, Vector<String>> contentmap = new HashMap <Integer, Vector<String>> ();
    
    private Map <String, Double> map = new HashMap<String, Double> ();
	
    private QWidget widget;
	final String strStyle = "background-image:url(classpath:images/login_back.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String menuButton = "QPushButton {image: url(classpath:images/menu_empty.png)};";
	final String homemenuButton = "QPushButton {image: url(classpath:images/home.png)};";
	final String scaleButton = "QPushButton {image: url(classpath:images/exec.png); border-width: 1px; border-radius: 10px; border-color: beige; color:white; padding: 0px; };";
	final String buttonStyle = "QPushButton {image: url(classpath:images/login_btn.png);border-width: 1px; border-radius: 10px; border-color: beige; color:white; padding: 0px;};";
	final String checkSytle  = "QCheckBox {background: transparent}";
	final String editStyle = "QLineEdit {background:white; color:blue;}";
	final String tableStyle = "QTableWidget {background:transparent;};";
	final String tableHeaderStyle = "QHeaderView::section {background-color:lightblue; color: black; font-family: arial; font-size:12px;}";
	final int nuclideCount = 41;
	
    public Cat2MultiData(QWidget wid) { super(); setupUi(wid);}

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.setMinimumSize(1280, 1024);
    	Form.setMaximumSize(1280, 1024);
        Form.setAutoFillBackground(true);
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
     
        scaleExeButton = new QPushButton(Form);
        scaleExeButton.setObjectName("scaleExeButton");
        scaleExeButton.setGeometry(new QRect(680, 960, 180, 45));
        scaleExeButton.setStyleSheet(scaleButton);
        font.setPointSize(10);
        font.setWeight(75);
        scaleExeButton.setFont(font);
        
        loadFileButton = new QPushButton(Form);
        loadFileButton.setObjectName("loadFileButton");
        loadFileButton.setGeometry(new QRect(870, 960, 180, 45));
        loadFileButton.setStyleSheet(buttonStyle);
        loadFileButton.setFont(font);
        
        dbSaveButton = new QPushButton(Form);
        dbSaveButton.setObjectName("dbSaveButton");
        dbSaveButton.setGeometry(new QRect(1060, 960, 180, 45));
        dbSaveButton.setStyleSheet(buttonStyle);
        dbSaveButton.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(50, 160, 90, 30));
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
        scaleOutTableWidget.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.SingleSelection);
        scaleOutTableWidget.horizontalHeader().setStyleSheet(tableHeaderStyle);
        scaleOutTableWidget.verticalHeader().setStyleSheet(tableHeaderStyle);
        scaleOutTableWidget.setStyleSheet(tableStyle);
        
        fileNameLabel = new QLabel(Form);
        fileNameLabel.setObjectName("fileNameLabel");
        fileNameLabel.setGeometry(new QRect(130, 160, 650, 35));
        fileNameLabel.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        fileNameLabel.setFont(font);
        fileNameLabel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        fileNameLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        cat2SingleButton = new QPushButton(Form);
        cat2SingleButton.setObjectName("cat2SingleButton");
        cat2SingleButton.setGeometry(new QRect(91, 0, 90, 60));
        cat2SingleButton.setStyleSheet(menuButton);
        
        mainMenuButton = new QPushButton(Form);
        mainMenuButton.setObjectName("mainMenuButton");
        mainMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mainMenuButton.setStyleSheet(homemenuButton);
        
        retranslateUi(Form);
        
        connectSignalSlot();
        centerWidget();
        Form.show();

        Form.connectSlotsByName();
    } // setupUi
    
    void connectSignalSlot()
    {
    	mainMenuButton.pressed.connect(this, "Home()");
    	cat2SingleButton.pressed.connect(this, "Cat2()");
    	scaleExeButton.pressed.connect(this, "MultiScaleExecute()");
    	loadFileButton.pressed.connect(this, "LoadFile()");
    	dbSaveButton.pressed.connect(this, "MuliScaleSaveDB()");
    }
    
    void Home()
    {
    	AddDB add = new AddDB(1, new QWidget());
    	widget.close();
    }
    
    void Cat2()
    {
    	Cat2 cat = new Cat2(new QWidget());
    	widget.close();
    }
    
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
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category II", null));
        scaleExeButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "SCALE Execute", null));
        loadFileButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Load File", null));
        dbSaveButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Database Save", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ud30c\uc77c\uba85:", null));
        cat2SingleButton.setText("Cat 2\nSingle");
        scaleOutTableWidget.clear();
                
    } // retranslateUi
    
	void LoadFile()
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

	void MultiScaleExecute() throws IOException
	{
		int rowcnt = scaleOutTableWidget.rowCount();
		int colcnt = scaleOutTableWidget.columnCount();
		
		String file = "c:/scale6/OrigenArp/input";
		
		Vector <String> vecTable = new Vector<String>();
		
		File check = new File(file);
		if(check.exists()) check.delete();
		
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
    	InputData input = new InputData();
    	String inputline = "Title\tfuel type\tBurn-up\tUranium\tEnrichment(%)\tCooling time(yr)\tcycles\tAverage Power\tLibraries";
    	out.write(inputline);
	    out.newLine();
    	for(int row = 0; row < rowcnt; row++)
		{
			int dbindex = 0;

			for(int col = 0; col < colcnt; col++ )
			{
				QTableWidgetItem item = scaleOutTableWidget.item(row, col);
				if(item == null)
				{
					item = new QTableWidgetItem();
					item.setText("");
				};
				
				switch (dbindex)
				{
					case 0:
						input.setTitle(item.text());
						vecTable.add(item.text());
						break;
					case 5:
						input.setBurnup(item.text());
						input.setAvgpower(item.text());
						break;
					case 7:
						input.setFueltype(item.text());
						break;
					case 9:
						input.setCooltime(item.text());
						break;
					case 10:
						input.setUraninum(item.text());
						break;
					case 11:
						input.setEnrich(item.text());
						break;
					default:
						break;
				};
		
				dbindex++;
			};
			
			//Generation Input data
			inputline = input.getTitle()+"\t"+input.getFueltype()+"\t"+input.getBurnup()+"\t"+input.getUraninum()+"\t" +
					input.getEnrich()+"\t"+input.getCooltime()+"\t"+input.getCycle()+"\t"+input.getAvgpower()+"\t"+input.getLibraries();
		    out.write(inputline);
		    out.newLine();
		};
		out.close();
	
		try {
			KinacInputGen gen = new	KinacInputGen(file);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int colCount = scaleOutTableWidget.columnCount();
		scaleOutTableWidget.setColumnCount(colCount+nuclideCount);
		
		//ADD Table,...
		for(int i = 0; i < vecTable.size();i++)
		{
			FileResult(vecTable.elementAt(i), "  nuclide   ", i, colCount);
		}
	}

	public int FileResult(String loadfile, final String matchStr, int row, int colCount) throws IOException
	{
		BufferedReader input;
		String strline = "";
		int linenumber = 1;

		loadfile = "C:/scale6/OrigenArp/Output/out/"+loadfile+".out";
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
			int column = 0;
			
			//row = scaleOutTableWidget.rowCount();
			
			for ( numRead = 0; numRead < nuclideCount; numRead++)
	        {
	        	String strdata = input.readLine();
	        	
	        	StringTokenizer tokenstr = new StringTokenizer(strdata);
	            column = 0;
	            String strelement = "";
	    		while (tokenstr.hasMoreElements()) {
	    			//System.out.println(tokenstr.nextElement());
	    			strelement = tokenstr.nextElement().toString();
	    			if(row == 0 && column == 0)
	    			{
	    				System.out.println("Nuclid: " + strelement);
	    				scaleOutTableWidget.setItem(0, colCount+numRead, new QTableWidgetItem(strelement));
	    				QTableWidgetItem colItem = new QTableWidgetItem();
	    				colItem.setText(strelement);
	    				scaleOutTableWidget.setHorizontalHeaderItem(colCount+numRead, colItem);
	    			}
	    			column++;
	    		}
	    		scaleOutTableWidget.setItem(row, colCount+numRead, new QTableWidgetItem(strelement));
	    		
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
	
	void MuliScaleSaveDB()
	{
		//Add Database
    	Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String strsql = "";
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();

			strsql = "insert into category2 (fuelID, plant, hogi, jugi, fuelnum, burnup, type, fuelkind, perday, peryear, u_tot, enrich, u238, u235, pu239, u236, pu240, ce140, "
					+ "cs137, ce142, mo100, nd143, mo98, mo97, sr90, nd148, u234, sm147, eu153, ba137, pm147, ba134, ag109, gd156, zr90, cs134, ru106, te125, "
					+ "gd154, sm149, sb125, in115, sn115, cd113, er166, tc98, ge72, pm146, in113, cd108, ba132, nb93, rh102) "
	    			+ "values (?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,?,?,?,?,?,?,?,?,"
	    			+         "?,?,? )";
			
			int rowcount  = scaleOutTableWidget.rowCount();
			int colcount  = scaleOutTableWidget.colorCount();
			
			for (int row = 0; row < rowcount; row++)
			{
				ps = con.prepareStatement(strsql);
				ps.clearParameters();
				
				String sdata = scaleOutTableWidget.item(row, 0).text();
				ps.setString(1, sdata);
				
				sdata = scaleOutTableWidget.item(row, 1).text();
				ps.setString(2, sdata);
				
				sdata = scaleOutTableWidget.item(row, 2).text();
				ps.setInt(3, Integer.valueOf(sdata));
				
				sdata = scaleOutTableWidget.item(row, 3).text();
				ps.setString(4, sdata);
				
				sdata = scaleOutTableWidget.item(row, 4).text();
				ps.setInt(5, Integer.valueOf(sdata));
				
				sdata = scaleOutTableWidget.item(row, 5).text();
				ps.setFloat(6, Float.valueOf(sdata));
				
				sdata = scaleOutTableWidget.item(row, 6).text();
				ps.setString(7, sdata);
				
				sdata = scaleOutTableWidget.item(row, 7).text();
				ps.setString(8, sdata);
				
				sdata = scaleOutTableWidget.item(row, 8).text();
				ps.setInt(9, Integer.valueOf(sdata));
				
				sdata = scaleOutTableWidget.item(row, 9).text();
				ps.setFloat(10, Float.valueOf(sdata));
				
				sdata = scaleOutTableWidget.item(row, 10).text();
				ps.setFloat(11, Float.valueOf(sdata));
				
				sdata = scaleOutTableWidget.item(row, 11).text();
				ps.setFloat(12, Float.valueOf(sdata));
			
				MapSet(row);
			
				ps.setDouble(13, map.get("u238"));
				ps.setDouble(14, map.get("u235"));
				ps.setDouble(15, map.get("pu239"));
				ps.setDouble(16, map.get("u236"));
				ps.setDouble(17, map.get("pu240"));
				ps.setDouble(18, map.get("ce140"));
				ps.setDouble(19, map.get("cs137"));
				ps.setDouble(20, map.get("ce142"));
				ps.setDouble(21, map.get("mo100"));
				ps.setDouble(22, map.get("nd143"));
				ps.setDouble(23, map.get("mo98"));
				ps.setDouble(24, map.get("mo97"));
				ps.setDouble(25, map.get("sr90"));
				ps.setDouble(26, map.get("nd148"));
				ps.setDouble(27, map.get("u234"));
				ps.setDouble(28, map.get("sm147"));
				ps.setDouble(29, map.get("eu153"));
				ps.setDouble(30, map.get("ba137"));
				ps.setDouble(31, map.get("pm147"));
				ps.setDouble(32, map.get("ba134"));
				ps.setDouble(33, map.get("ag109"));
				ps.setDouble(34, map.get("gd156"));
				ps.setDouble(35, map.get("zr90"));
				ps.setDouble(36, map.get("cs134"));
				ps.setDouble(37, map.get("ru106"));
				ps.setDouble(38, map.get("te125"));
				ps.setDouble(39, map.get("gd154"));
				ps.setDouble(40, map.get("sm149"));
				ps.setDouble(41, map.get("sb125"));
				ps.setDouble(42, map.get("in115"));
				ps.setDouble(43, map.get("sn115"));
				ps.setDouble(44, map.get("cd113"));
				ps.setDouble(45, map.get("er166"));
				ps.setDouble(46, map.get("tc98"));
				ps.setDouble(47, map.get("ge72"));
				ps.setDouble(48, map.get("pm146"));
				ps.setDouble(49, map.get("in113"));
				ps.setDouble(50, map.get("cd108"));
				ps.setDouble(51, map.get("ba132"));
				ps.setDouble(52, map.get("nb93"));
				ps.setDouble(53, map.get("rh102"));
			
				ps.executeUpdate();
			}
		    ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	void MapSet(int row)
	{
	    String keystr = "", valuestr = "";
	    map.clear();
	    for (int col = 12; col < scaleOutTableWidget.columnCount(); col++)
	    {
	    	keystr = scaleOutTableWidget.horizontalHeaderItem(col).text();
	    	valuestr = scaleOutTableWidget.item(row, col).text();
	    	System.out.println ("Key: " + keystr +", Value: " + valuestr);
	    	map.put(keystr, Double.valueOf(valuestr));
	    };
	   
	    
	};

}

