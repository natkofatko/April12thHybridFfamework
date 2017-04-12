package Factory;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataProviderFactory {
	
	
	public static ConfigDataProvider getDataFromConfig()
	{
		ConfigDataProvider cf = new ConfigDataProvider(); 
		return cf; 
	}
	
	public static ExcelDataProvider getDataFromExcel()
	{
		ExcelDataProvider ex = new ExcelDataProvider();
		return ex; 
	}

	
	}

	

