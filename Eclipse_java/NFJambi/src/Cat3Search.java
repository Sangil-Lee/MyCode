/********************************************************************************
 ** Form generated from reading ui file 'Cat3Search.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Random;
import java.util.Vector;

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
import com.trolltech.qt.gui.QAbstractItemView.SelectionMode;

public class Cat3Search implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QPushButton loadviewButton;
    public QLabel label_2;
    public QTableWidget resultTableWidget;
    public QPushButton cat2MenuButton;
    public QPushButton mainMenuButton;
    public QPushButton cat3FuelMenuButton;
    public QPushButton nuclearMenuButton;
    public QLineEdit dbitemEdit;
    public QPushButton searchButton;
    public QPushButton legendButton;
    public QPushButton trendButton;
    public QCheckBox checkBox;
    public QCheckBox checkBox_2;
    public QCheckBox checkBox_3;
    public QCheckBox checkBox_4;
    public QButtonGroup selTable;

    private QWidget widget;
    
	final String strStyle = "background-image:url(classpath:images/search.png); color:white;";
	final String styleButton = "QPushButton{background: #0a5abe;border-style: outset; border-width: 2px; border-radius: 10px; border-color: beige; color:white; font: bold 16px; min-width: 10em;padding: 6px;}";
	final String menuButton = "QPushButton {image: url(classpath:images/menu_empty.png)};";
	final String homemenuButton = "QPushButton {image: url(classpath:images/home.png)};";
	final String checkSytle  = "QCheckBox {background: transparent}";
	final String editStyle = "QLineEdit {background:white; color:blue;}";
	final String tableSytle = "QHeaderView::section {background-color:lightblue; color: black; font-family: arial; font-size:12px;}";
	
    private int btngrpid = 0;

    public Cat3Search (QWidget wid) { super(); setupUi(wid); }

    public void setupUi(QWidget Form)
    {
    	widget = Form;
        Form.setObjectName("Form");
        Form.resize(new QSize(1280, 1024).expandedTo(Form.minimumSizeHint()));
        Form.setMinimumSize(1280, 1024);
     	Form.setMaximumSize(1280, 1024);
     	
     	Form.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        
        Form.setAutoFillBackground(true);
        Form.setStyleSheet(strStyle);
        
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
        
        loadviewButton = new QPushButton(Form);
        loadviewButton.setObjectName("loadviewButton");
        loadviewButton.setGeometry(new QRect(1090, 970, 180, 45));
        loadviewButton.setStyleSheet(styleButton);
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        loadviewButton.setFont(font);
        
        label_2 = new QLabel(Form);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(40, 190, 150, 31));
        label_2.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground);
        font.setFamily("Courier");
        font.setPointSize(16);
        font.setBold(true);
        label_2.setFont(font);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignLeft,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        
        resultTableWidget = new QTableWidget(Form);
        resultTableWidget.setObjectName("resultTableWidget");
        resultTableWidget.setGeometry(new QRect(20, 240, 1251, 711));
        resultTableWidget.setStyleSheet(tableSytle);
        //resultTableWidget.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.SingleSelection);
        resultTableWidget.setSelectionMode(SelectionMode.ExtendedSelection);
        
        
        mainMenuButton = new QPushButton(Form);
        mainMenuButton.setObjectName("mainMenuButton");
        mainMenuButton.setGeometry(new QRect(0, 0, 90, 60));
        mainMenuButton.setStyleSheet(homemenuButton);
        font.setPointSize(10);
        mainMenuButton.setFont(font);
        
        cat2MenuButton = new QPushButton(Form);
        cat2MenuButton.setObjectName("cat2MenuButton");
        cat2MenuButton.setGeometry(new QRect(91, 0, 90, 60));
        cat2MenuButton.setStyleSheet(menuButton);
        cat2MenuButton.setFont(font);

        cat3FuelMenuButton = new QPushButton(Form);
        cat3FuelMenuButton.setObjectName("cat3FuelMenuButton");
        cat3FuelMenuButton.setGeometry(new QRect(182, 0, 90, 60));
        cat3FuelMenuButton.setStyleSheet(menuButton);
        cat3FuelMenuButton.setFont(font);
        
        nuclearMenuButton = new QPushButton(Form);
        nuclearMenuButton.setObjectName("nuclearMenuButton");
        nuclearMenuButton.setGeometry(new QRect(273, 0, 90, 60));
        nuclearMenuButton.setStyleSheet(menuButton);
        nuclearMenuButton.setFont(font);
        
        dbitemEdit = new QLineEdit(Form);
        dbitemEdit.setObjectName("dbitemEdit");
        dbitemEdit.setGeometry(new QRect(200, 190, 800, 41));
        dbitemEdit.setStyleSheet(editStyle);
        font.setPointSize(14);
        dbitemEdit.setFont(font);
        
        searchButton = new QPushButton(Form);
        searchButton.setObjectName("searchButton");
        searchButton.setGeometry(new QRect(1050, 130, 180, 45));
        searchButton.setStyleSheet(styleButton);
        font.setPointSize(10);
        searchButton.setFont(font);
        
        legendButton = new QPushButton(Form);
        legendButton.setObjectName("legendButton");
        legendButton.setGeometry(new QRect(1050, 190, 180, 45));
        legendButton.setStyleSheet(styleButton);
        legendButton.setFont(font);
        
        trendButton = new QPushButton(Form);
        trendButton.setObjectName("trendButton");
        trendButton.setGeometry(new QRect(900, 970, 180, 45));
        trendButton.setStyleSheet(styleButton);
        font.setPointSize(14);
        font.setBold(true);
        trendButton.setFont(font);
         
        checkBox = new QCheckBox(widget);
        QButtonGroup itemButtonGroup = new QButtonGroup(Form);
        itemButtonGroup.addButton(checkBox);
        checkBox.setObjectName("checkBox");
        checkBox.setGeometry(40, 140, 128, 24);
        checkBox.setStyleSheet(checkSytle);
        font.setPointSize(15);
        font.setBold(true);
        font.setWeight(75);
        checkBox.setFont(font);
        checkBox.setIconSize(new QSize(32, 32));

        checkBox_2 = new QCheckBox(widget);
        itemButtonGroup.addButton(checkBox_2);
        checkBox_2.setObjectName("checkBox_2");
        checkBox_2.setGeometry(155, 140, 128, 24);
        checkBox_2.setStyleSheet(checkSytle);
        checkBox_2.setFont(font);
        checkBox_2.setIconSize(new QSize(16, 16));
 
        checkBox_3 = new QCheckBox(widget);
        itemButtonGroup.addButton(checkBox_3);
        checkBox_3.setObjectName("checkBox_3");
        checkBox_3.setGeometry(284, 140, 128, 24);
        checkBox_3.setStyleSheet(checkSytle);
        checkBox_3.setFont(font);
        checkBox_3.setIconSize(new QSize(16, 16));
 
        checkBox_4 = new QCheckBox(widget);
        itemButtonGroup.addButton(checkBox_4);
        checkBox_4.setObjectName("checkBox_4");
        checkBox_4.setGeometry(418, 140, 128, 24);
        checkBox_4.setStyleSheet(checkSytle);
        checkBox_4.setFont(font);
        checkBox_4.setIconSize(new QSize(16, 16));
        
        selTable = new QButtonGroup(Form);
        selTable.addButton(checkBox);
        selTable.addButton(checkBox_2);
        selTable.addButton(checkBox_3);
        selTable.addButton(checkBox_4);

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
        loadviewButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Load ImageView", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "검색조건", null));
        resultTableWidget.clear();
        cat2MenuButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Category 2 ", null));
        cat3FuelMenuButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Cat. 3\nFuel Asm.", null));
        nuclearMenuButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Nuclear\nMat.", null));
        searchButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\uac80 \uc0c9", null));
        legendButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "\ubc94 \ub840", null));
        trendButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Trend", null));
        checkBox.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "CAT3UF6", null));
        checkBox_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "CAT3UO2", null));
        checkBox_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "CAT3GDPELLET", null));
        checkBox_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "CAT3SOGUL", null));
    } // retranslateUi

    void connectSignalSlot()
    {
    	searchButton.pressed.connect(this, "SearchDB()");
    	legendButton.pressed.connect(this, "Legend()");
    	selTable.buttonClicked.connect(this, "SelectTable(QAbstractButton)");
    	selTable.buttonIdClicked.connect(this, "SelectTableID(Integer)");
    	trendButton.pressed.connect(this, "Trend()");
    	loadviewButton.pressed.connect(this, "LoadImage()");
    	
    	cat2MenuButton.pressed.connect(this, "Cat2Search()");
    	cat3FuelMenuButton.pressed.connect(this, "Cat3FuelSearch()");
    	mainMenuButton.pressed.connect(this,"Home()");
    }
    
    void Home()
    {
    	ViewDB view = new ViewDB(new QWidget());
    	
    	widget.close();
    }
    
    void Cat2Search()
    {
    	Cat2Search cat2 = new Cat2Search(new QWidget());
    	widget.close();
    }
    
    void Cat3FuelSearch()
    {
    	Cat3FuelSearch fuel = new Cat3FuelSearch(new QWidget());
    	widget.close();
    }
    
    void SelectTableID(Integer id)
    {
    	System.out.println("ID: " + Math.abs(id));
    	btngrpid = Math.abs(id);
    	if(btngrpid >= 4)
    	{
    		loadviewButton.setEnabled(true);
    	} else {
    		loadviewButton.setEnabled(false);
    	};
    }
    
    void SelectTable(QAbstractButton button)
    {
    	System.out.println("CheckedButton: " + button.text());
    }
    
    void SearchDB()
    {
    	int id = Math.abs(selTable.checkedId());
    	
    	Connection con = null;
    	java.sql.Statement st = null;
   		ResultSet rs = null;
   		
   		String strsql = dbitemEdit.text();
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
		            if (fieldName.compareToIgnoreCase("iin") == 0) fieldName = "in";
		            resultTableWidget.setHorizontalHeaderItem(i-1, new QTableWidgetItem(fieldName));

		            int type = rsmd.getColumnType(i);
		            String strresult = "";
		            
		            switch(type)
		            {
		            	case Types.DOUBLE:
		            		Double dvalue = rs.getDouble(i);
			                strresult = String.valueOf(dvalue);
		            		break;
		            	default:
		            		strresult = rs.getString(i);
		            		break;
		            }
		            		        
		            QTableWidgetItem colItem = new QTableWidgetItem();
					colItem.setText(strresult);
					resultTableWidget.setItem(row, i-1, colItem);
			    };

			    row++;
		        System.out.println();
			};
			rs.close();			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    void Trend()
    {
    	List <QTableWidgetItem> itemlist =	resultTableWidget.selectedItems();
      	
    	// 공통 옵션 정의
        final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();
        final ItemLabelPosition p_below = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT);
        
        Font f = new Font("Gulim", Font.BOLD, 14);
        Font axisF = new Font("Gulim", Font.PLAIN, 14);
        
        // plot 생성
        final CategoryPlot plot = new CategoryPlot();
        Vector <DefaultCategoryDataset> vecDataset = new Vector<DefaultCategoryDataset> ();
        Vector <LineAndShapeRenderer>  vecRender = new Vector<LineAndShapeRenderer> ();
    	QTableWidgetItem item = null;
        //LineAndShapeRenderer renderer = new LineAndShapeRenderer();
    	LineAndShapeRenderer renderer = null;
    	vecDataset.clear();
    	vecRender.clear();
    	
       	for(int i = 0; i < plot.getDatasetCount(); i++)
    	{
       		plot.setDataset(i,null);
			plot.setRenderer(i, null);
    	};
    	
    	String headername = "";
    	int index = -1;
 		for (int i = 0; i < itemlist.size();i++)
    	{
 			item = itemlist.get(i);
    		QTableWidgetItem header = resultTableWidget.horizontalHeaderItem(item.column());
    		if (headername.compareToIgnoreCase(header.text()) != 0)
    		{
    			headername = header.text();
        		vecDataset.add(new DefaultCategoryDataset());
        		renderer = new LineAndShapeRenderer();
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
        		index++;
    		};
    		
   			if(item.text() == "")
   				vecDataset.elementAt(index).addValue(0.0, headername, String.valueOf(item.row()+1));
   			else
   				vecDataset.elementAt(index).addValue(Double.valueOf(item.text()), headername, String.valueOf(item.row()+1));
			
    		if(index == 0)
    		{
    			plot.setDataset(vecDataset.elementAt(index));
    			plot.setRenderer(vecRender.elementAt(index));
    		}
    		else
    		{
    			plot.setDataset(index, vecDataset.elementAt(index));
    			plot.setRenderer(index, vecRender.elementAt(index));
    		};
    		System.out.println("HeaderName: " + header.text() + ", Row: " + (item.row()+1) + ", Col: " + item.column() +", Value: " + item.text());
    	};
 		
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
    
    void Legend()
    {
    }
    
    void LoadImage()
    {
    	List <QTableWidgetItem> itemlist =	resultTableWidget.selectedItems();
    	if(itemlist == null) return;
    	
    	final ImageViewSelect imgselect = new ImageViewSelect(btngrpid, new QWidget());
    	imgselect.SetImageList(itemlist);
    }
}

