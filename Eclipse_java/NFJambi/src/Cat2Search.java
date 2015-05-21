/********************************************************************************
 ** Form generated from reading ui file 'Cat2Search.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

import com.mysql.jdbc.ResultSetMetaData;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Cat2Search implements com.trolltech.qt.QUiForm<QWidget> 
{
    public QLabel label;
    public QPushButton trendButton;
    public QLabel label_2;
    public QTableWidget resultTableWidget;
    public QPushButton mainMenuButton;
    public QPushButton cat3MenuButton;
    public QPushButton cat3FuelMenuButton;
    public QPushButton nuclearMenuButton;
    public QComboBox IDCBox;
    public QLineEdit dbitemEdit;
    public QLabel label_3;
    public QLineEdit sqlEdit;
    public QComboBox andorCBox;
    public QPushButton deleteButton;
    public QPushButton searchButton;
    public QPushButton legendButton;
    private Vector <String> vecTrendItem = new Vector<String> ();
    private TrendItem trend;
    private QWidget widget;
    
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String menuButton = "QPushButton {image: url(classpath:images/menu_empty.png)};";
	final String homemenuButton = "QPushButton {image: url(classpath:images/home.png)};";
	final String editStyle = "QLineEdit {background:white; color:blue;}";
	final String combStyle = "QComboBox {background:white; color:blue;}";
	final String tableSytle = "QHeaderView::section {background-color:lightblue; color: black; font-family: arial; font-size:12px;}";
	
    public Cat2Search(QWidget wid) { super(); setupUi(wid);}

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
        label.setGeometry(new QRect(330, 60, 541, 41));
        label.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        QFont font = new QFont();
        font.setPointSize(32);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(30, 160, 91, 31));
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);

        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        label_2.setFont(font);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        resultTableWidget = new QTableWidget(Form);
        resultTableWidget.setObjectName("resultTableWidget");
        resultTableWidget.setGeometry(new QRect(20, 280, 1251, 671));
        resultTableWidget.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.SingleSelection);
        resultTableWidget.setStyleSheet(tableSytle);
         
        QFont menuFont = new QFont();
        menuFont.setPointSize(10);
        menuFont.setBold(true);
        menuFont.setWeight(75);
        mainMenuButton = new QPushButton(Form);
        mainMenuButton.setObjectName("mainMenuButton");
        mainMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mainMenuButton.setStyleSheet(homemenuButton);
      
        cat3MenuButton = new QPushButton(Form);
        cat3MenuButton.setObjectName("cat3MenuButton");
        cat3MenuButton.setGeometry(new QRect(91, 0, 90, 60));
        cat3MenuButton.setStyleSheet(menuButton);
        cat3MenuButton.setFont(menuFont);
      
        cat3FuelMenuButton = new QPushButton(Form);
        cat3FuelMenuButton.setObjectName("cat3FuelMenuButton");
        cat3FuelMenuButton.setGeometry(new QRect(182, 0, 90, 60));
        cat3FuelMenuButton.setStyleSheet(menuButton);
        cat3FuelMenuButton.setFont(menuFont);
      
        nuclearMenuButton = new QPushButton(Form);
        nuclearMenuButton.setObjectName("nuclearMenuButton");
        nuclearMenuButton.setGeometry(new QRect(273, 0, 90, 60));
        nuclearMenuButton.setStyleSheet(menuButton);
        nuclearMenuButton.setFont(menuFont);
      
        
        IDCBox = new QComboBox(Form);
        IDCBox.setObjectName("IDCBox");
        IDCBox.setGeometry(new QRect(130, 160, 160, 40));
        IDCBox.setStyleSheet(combStyle);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        IDCBox.setFont(font);
        
        dbitemEdit = new QLineEdit(Form);
        dbitemEdit.setObjectName("dbitemEdit");
        dbitemEdit.setGeometry(new QRect(300, 160, 261, 41));
        dbitemEdit.setStyleSheet(editStyle);
        
        label_3 = new QLabel(Form);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(30, 220, 91, 31));
        label_3.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        font.setKerning(false);
        label_3.setFont(font);
        label_3.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        sqlEdit = new QLineEdit(Form);
        sqlEdit.setObjectName("sqlEdit");
        sqlEdit.setGeometry(new QRect(130, 217, 891, 41));
        sqlEdit.setStyleSheet(editStyle);
        font.setPointSize(12);
        sqlEdit.setFont(font);
        
        andorCBox = new QComboBox(Form);
        andorCBox.setObjectName("andorCBox");
        andorCBox.setGeometry(new QRect(570, 160, 160, 40));
        andorCBox.setStyleSheet(combStyle);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        font.setWeight(75);
        andorCBox.setFont(font);
        
        deleteButton = new QPushButton(Form);
        deleteButton.setObjectName("deleteButton");
        deleteButton.setGeometry(new QRect(840, 160, 180, 45));
        deleteButton.setStyleSheet(styleButton);
        QFont btnFont = new QFont();
        btnFont.setPointSize(12);
        btnFont.setBold(true);
        btnFont.setWeight(75);
        deleteButton.setFont(btnFont);
        
        searchButton = new QPushButton(Form);
        searchButton.setObjectName("searchButton");
        searchButton.setGeometry(new QRect(1030, 160, 180, 45));
        searchButton.setStyleSheet(styleButton);
        searchButton.setFont(btnFont);
        
        legendButton = new QPushButton(Form);
        legendButton.setObjectName("legendButton");
        legendButton.setGeometry(new QRect(1030, 220, 180, 45));
        legendButton.setStyleSheet(styleButton);
        legendButton.setFont(btnFont);

        trendButton = new QPushButton(Form);
        trendButton.setObjectName("trendButton");
        trendButton.setGeometry(new QRect(1090, 970, 180, 45));
        trendButton.setStyleSheet(styleButton);
        trendButton.setFont(btnFont);
        
        retranslateUi(Form);
        connectSignalSlot();
        addID();

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
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category II", null));
        trendButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Trend", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "DB \ud56d\ubaa9", null));
        resultTableWidget.clear();

        cat3MenuButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Cat. 3", null));
        cat3FuelMenuButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Cat. 3\nFuel Asm.", null));
        nuclearMenuButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Nuclear\nMat.", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80\uc0c9\uc870\uac74:", null));
        andorCBox.clear();
        andorCBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "AND", null));
        andorCBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Form", "OR", null));
        deleteButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uc0ad \uc81c", null));
        searchButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80 \uc0c9", null));
        legendButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ubc94 \ub840", null));
    } // retranslateUi
    
    void connectSignalSlot()
    {
    	mainMenuButton.pressed.connect(this, "MainMenu()");
    	cat3MenuButton.pressed.connect(this, "Cat3Menu()");
    	cat3FuelMenuButton.pressed.connect(this, "Cat3FuelMenu()");
    	nuclearMenuButton.pressed.connect(this, "NuclearMenu()");
    	searchButton.pressed.connect(this, "SearchDB()");
    	trendButton.pressed.connect(this, "TrendItem()");
    }
    
    void Search(int select)
    {
    	Connection con = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
		String strsql = "";
		
		if (select == 0)
		{
			String strid = IDCBox.currentText();
			try {
				int idx = IDCBox.currentIndex();
				System.out.println("Index: " + idx);
				if (idx == 0) 
				{
					return;
				};
			
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();

			strsql = "select "+ strid + " from category2";
			rs = st.executeQuery(strsql);
			
			//resultTableWidget.setColumnCount(resultTableWidget.columnCount()+1);
			//resultTableWidget.setColumnCount(5);
			//resultTableWidget.setRowCount(5);
			
			QTableWidgetItem item = new QTableWidgetItem();
			item.setText(strid);
			resultTableWidget.setHorizontalHeaderItem(0, item);
			
			while(rs.next())
			{
				resultTableWidget.setRowCount(resultTableWidget.rowCount()+1);
				int row = resultTableWidget.rowCount();
				int col = resultTableWidget.columnCount();
				System.out.println("row:" + row +", col: " + col); 
		         switch(idx)
		        {
		        	case 1:
		        		break;
		        	
		        	case 13:
		        		float result = 	rs.getFloat(strid);
		        		QTableWidgetItem resultitem = new QTableWidgetItem();
		        		resultitem.setText(String.valueOf(result));
		        		resultTableWidget.setItem(row-1, 0, resultitem);
		        		System.out.println("Resut: " + result);
		        		break;
		        	case 14:
		        		float u238 = 	rs.getFloat(strid);
		        		QTableWidgetItem u238item = new QTableWidgetItem();
		        		u238item.setText(String.valueOf(u238));
		        		resultTableWidget.setItem(row-1, 0, u238item);
		        		System.out.println("Resut: " + u238);
		        		break;
		        	
		        	default:
		        		break;
		        }
		      }
			resultTableWidget.show();
		   rs.close();			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	} else {
	
		strsql = sqlEdit.text();
		StringTokenizer tokenstr = new StringTokenizer(strsql, ", ");
        String strelement = "";
		
        int count = 0;
        while (tokenstr.hasMoreElements()) {
			strelement = tokenstr.nextElement().toString();
			if(strelement.compareToIgnoreCase("select") == 0 ) continue;
			else if(strelement.compareToIgnoreCase("from") == 0 ) break;
			count++;	
			System.out.println("Token: " + strelement);
        }
        
        System.out.println("Count: " + count);
		
	};
  			

    }
    
    void SearchDB ()
    {
       	Connection con = null;
    	java.sql.Statement st = null;
   		ResultSet rs = null;
   		//String strsql = "select u238, u235, pu239, u236, pu240, ce140, cs137, ce142, mo100, nd143, mo98, mo97, sr90, nd148, u234, "
   			//	+ "sm147, eu153, ba137, pm147, ba134, ag109, gd156, zr90, cs134, ru106, te125, gd154, sm149, sb125, in115, sn115, "
   				//+ "cd113, er166, tc98, ge72, pm146, in113, cd108, ba132, nb93, rh102 from category2";
   		
   		String strsql = sqlEdit.text();
		resultTableWidget.setRowCount(0);
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			st=con.createStatement();

			rs = st.executeQuery(strsql);
		
			int first = 0;
			int row = 0;
			while(rs.next())
			{
		        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
		        resultTableWidget.setRowCount(resultTableWidget.rowCount()+1);
		        if(first == 0)
		        {
		        	first++;
		        	resultTableWidget.setColumnCount(rsmd.getColumnCount());
		        }
		        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		           
		            String fieldName = rsmd.getColumnName(i);
		            resultTableWidget.setHorizontalHeaderItem(i-1, new QTableWidgetItem(fieldName));
		            

		            int type = rsmd.getColumnType(i);
		            String strresult = "";
		            if (type == Types.VARCHAR || type == Types.CHAR) {
		                strresult = rs.getString(i);
		            } else {
		                //System.out.print(rs.getDouble(i));
		                Double dvalue = rs.getDouble(i);
		                strresult = String.valueOf(dvalue);
		            }
		        
		            QTableWidgetItem colItem = new QTableWidgetItem();
					colItem.setText(strresult);
					resultTableWidget.setItem(row, i-1, colItem);
			    };

			    row++;
		       // System.out.println();
			};
			rs.close();			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    }
    
     void MainMenu()
    {
    	ViewDB view = new ViewDB(new QWidget());
    	widget.close();
    }
    
    void Cat3Menu()
    {
    	Cat3Search cat3 = new Cat3Search(new QWidget());
    	widget.close();
    }
    
    void Cat3FuelMenu()
    {
    	Cat3FuelSearch cat3search = new Cat3FuelSearch(new QWidget());
    	widget.close();
    }
    
    void NuclearMenu()
    {
    	
    }
    
    private void addID()
    {
    	IDCBox.addItem("선택");
    	IDCBox.addItem("fuelID");
    	IDCBox.addItem("plant");
    	IDCBox.addItem("hogi");
    	IDCBox.addItem("jugi");
    	IDCBox.addItem("fuelnum");
    	IDCBox.addItem("burnup");
    	IDCBox.addItem("type");
    	IDCBox.addItem("fuelkind");
    	IDCBox.addItem("perday");
    	IDCBox.addItem("peryear");
    	IDCBox.addItem("u_tot");
    	IDCBox.addItem("enrich");
    	IDCBox.addItem("u238");
    	IDCBox.addItem("u235");
    	IDCBox.addItem("pu239");
    	IDCBox.addItem("u236");
    	IDCBox.addItem("pu240");
    	IDCBox.addItem("ce140");
    	IDCBox.addItem("cs137");
    	IDCBox.addItem("ce142");
    	IDCBox.addItem("mo100");
    	IDCBox.addItem("nd143");
    	IDCBox.addItem("mo98");
    	IDCBox.addItem("mo97");
    	IDCBox.addItem("sr90");
    	IDCBox.addItem("nd148");
    	IDCBox.addItem("u234");
    	IDCBox.addItem("sm147");
    	IDCBox.addItem("eu153");
    	IDCBox.addItem("ba137");
    	IDCBox.addItem("pm147");
    	IDCBox.addItem("ba134");
    	IDCBox.addItem("ag109");
    	IDCBox.addItem("gd156");
    	IDCBox.addItem("zr90");
    	IDCBox.addItem("cs134");
    	IDCBox.addItem("ru106");
    	IDCBox.addItem("te125");
    	IDCBox.addItem("gd154");
    	IDCBox.addItem("sm149");
    	IDCBox.addItem("sb125");
    	IDCBox.addItem("in115");
    	IDCBox.addItem("sn115");
    	IDCBox.addItem("cd113");
    	IDCBox.addItem("er166");
    	IDCBox.addItem("tc98");
    	IDCBox.addItem("ge72");
    	IDCBox.addItem("pm146");
    	IDCBox.addItem("in113");
    	IDCBox.addItem("cd108");
    	IDCBox.addItem("ba132");
    	IDCBox.addItem("nb93");
    	IDCBox.addItem("rh102");
    	
    	resultTableWidget.setColumnCount(IDCBox.count());

    }
    
    void TrendItem()
    {
    	if(trend != null )
    	{
    		return;
    	};
    	
    	trend = new TrendItem(this, new QWidget());
    	
    	int colcnt = resultTableWidget.columnCount();
    	
    	for(int i = 0; i < colcnt; i++)
    	{
    		QTableWidgetItem item = resultTableWidget.horizontalHeaderItem(i);
    		//System.out.println("Header: " + item.text());
    		trend.SetItem(item.text());
    	};
    }
    
    void RemoveItemsAll()
    {
    	vecTrendItem.clear();
    }
    
    void AddItem(String stritem)
    {
    	vecTrendItem.add(stritem);
    }
    
    void Trend()
    {
    	int rowcount = resultTableWidget.rowCount();
    	int colcount = resultTableWidget.columnCount();
    	
        Font f = new Font("Gulim", Font.BOLD, 14);
        Font axisF = new Font("Gulim", Font.PLAIN, 14);
        
        // 공통 옵션 정의
        final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();
        final ItemLabelPosition p_below = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT);
        
        // plot 생성
        final CategoryPlot plot = new CategoryPlot();
   
        Vector <DefaultCategoryDataset> vecDataset = new Vector<DefaultCategoryDataset> ();
        Vector <LineAndShapeRenderer>  vecRender = new Vector<LineAndShapeRenderer> ();
    	QTableWidgetItem item = null;
        //LineAndShapeRenderer renderer = new LineAndShapeRenderer();
    	LineAndShapeRenderer renderer = null;
    	vecDataset.clear();
    	vecRender.clear();
       	for(int i = 0; i < vecTrendItem.size(); i++)
    	{
       		plot.setDataset(i,null);
			plot.setRenderer(i, null);
    	}
    	for(int i = 0; i < vecTrendItem.size(); i++)
    	{
    		String indexname = vecTrendItem.elementAt(i);
    		vecDataset.add(new DefaultCategoryDataset());
    		renderer = new LineAndShapeRenderer();
            //renderer.setBaseItemLabelGenerator(generator);
            //renderer.setBaseItemLabelsVisible(true);
            renderer.setBaseShapesVisible(true);
            renderer.setDrawOutlines(true);
            renderer.setUseFillPaint(true);
            renderer.setBaseFillPaint(Color.WHITE);
            renderer.setBaseItemLabelFont(f);
            renderer.setBasePositiveItemLabelPosition(p_below);
            Random r = new Random();
            Color  c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            renderer.setSeriesPaint(0,c);
            renderer.setSeriesStroke(0,new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 3.0f));		
    		vecRender.add(renderer);
    		
    		int index = 0;
    		for (; index < colcount; index++)
    		{
    			item = resultTableWidget.horizontalHeaderItem(index);
    			if(item.text().compareToIgnoreCase(indexname) == 0)
    			{
    					break;
    			};
    		};
    	
    		for (int row = 0; row < rowcount; row++)
    		{
    			item = resultTableWidget.item(row, index);
    			//System.out.println("Index: " + index +", Index Name:" + indexname +", Value: " + item.text() );
    			
    			if(item == null)
    				vecDataset.elementAt(i).addValue(0.0, indexname, String.valueOf(row));
    			else
    				vecDataset.elementAt(i).addValue(Double.valueOf(item.text()), indexname, String.valueOf(row));
    		};

    		if(i == 0)
    		{
    			plot.setDataset(vecDataset.elementAt(i));
    			plot.setRenderer(vecRender.elementAt(i));
    		}
    		else
    		{
    			plot.setDataset(i, vecDataset.elementAt(i));
    			plot.setRenderer(i, vecRender.elementAt(i));
    		}
    		
    	};
        // plot 기본 설정
        plot.setOrientation(PlotOrientation.VERTICAL);             // 그래프 표시 방향
        plot.setRangeGridlinesVisible(true);                       // X축 가이드 라인 표시여부
        plot.setDomainGridlinesVisible(true);                      // Y축 가이드 라인 표시여부
 
        // 렌더링 순서 정의 : dataset 등록 순서대로 렌더링 ( 즉, 먼저 등록한게 아래로 깔림 )
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
       
        // X축 세팅
        plot.setDomainAxis(new CategoryAxis());              // X축 종류 설정
        plot.getDomainAxis().setTickLabelFont(axisF); // X축 눈금라벨 폰트 조정
        plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD);       // 카테고리 라벨 위치 조정
 
        // Y축 세팅
        plot.setRangeAxis(new NumberAxis());                 // Y축 종류 설정
        plot.getRangeAxis().setTickLabelFont(axisF);  // Y축 눈금라벨 폰트 조정
    	       
    	final JFreeChart chart = new JFreeChart(plot);
   	
        ChartFrame frame=new ChartFrame("Data Plot",chart);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      }

}

