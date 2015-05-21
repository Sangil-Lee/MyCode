
public class InputData {

	private String strtitle = "";
	private String strfueltype = "";
	private String strburnup = "";
	private String struranium = "";
	private String strenrich = "";
	private String strcooltime = "";
	private String strcycle = "1";
	private String stravgPower = "";
	private String strlibrary = "1";
	public InputData() {};
	
	public void setTitle(String title) 
	{
		strtitle = title;
	}
	
	public String getTitle() {return strtitle;}
	
	public void setFueltype(String fuel) 
	{
		strfueltype = fuel;
	}
	
	public String getFueltype() {return strfueltype;}
	
	public void setBurnup(String burn) 
	{
		strburnup = burn;
	}
	
	public String getBurnup() {return strburnup;}
	
	public void setUraninum(String uranium) 
	{
		struranium = uranium;
	}
	
	public String getUraninum() {return struranium;}
	
	public void setEnrich(String enrich) 
	{
		strenrich = enrich;
	}
	
	public String getEnrich() {return strenrich;}
	
	public void setCooltime(String cooltime) 
	{
		strcooltime = cooltime;
	}
	
	public String getCooltime() {return strcooltime;}		
	
	public void setCycle(String cycle) 
	{
		strcycle = cycle;
	}
	
	public String getCycle() {return strcycle;}		
	
	public void setAvgpower(String power) 
	{
		double dburnup = Double.valueOf(strburnup) / 1000;
		stravgPower = String.valueOf(dburnup);
	}
	
	public String getAvgpower() {return stravgPower;}
	
	public void setLibraries(String library) 
	{
		strlibrary = library;
	}
	
	public String getLibraries() {return strlibrary;}
	
}
