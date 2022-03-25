package com.examples.business.data;
import java.util.ArrayList;
import java.util.Collections;

import com.examples.framework.data.ReportBodyData;
import com.examples.framework.exception.UnableToSaveReportException;

/**
 * Class to represent a student record of the STUDENT_MASTER Table 
 */
public class StudentData extends ReportBodyData {
	public static final int NAME = 1;
	public static final int TOTAL = 2;
	public static final int EMAIL = 3;
	public static final int CITY = 4;

	
	
	public static final String ASC = "A";
	public static final String DESC = "D";
	
	
	
	//private String rollNo;
	// TODO Other instance variable declarations 
	
	// TODO Getter/setter methods for instance variables  
	
	
	/**
	 * Default Constructor
	 */
	public StudentData() {
		super();
		// TODO Perform initializations of all instance variables
		StudentDAO studDAO = new StudentDAO();
		reportData = studDAO.fetchStudentData();
		
	}

	/**
	 * Sort data on chosen sort order and return sorted data
	 */
	public void sortData(int sortField, String sortOrder) {
		
	
		switch(sortField)
		{
		 case 1 :
			    
			    if(sortOrder.equals(ASC))
			    {
			    NameCompareAsc nameSort = new NameCompareAsc();
			    Collections.sort(reportData,nameSort );
			    }
			    else if(sortOrder.equals(DESC))
			    {
			    NameCompareDesc nameSort = new NameCompareDesc();
			    Collections.sort(reportData,nameSort );
			    }
			    break;
		 case 2 :
			   if(sortOrder.equals(ASC))
			    {
			    TotalCompareAsc totalSort = new TotalCompareAsc();
			    Collections.sort(reportData,totalSort );
			    }
			   else if(sortOrder.equals(DESC))
			    {
			    TotalCompareDesc totalSort = new TotalCompareDesc();
			    Collections.sort(reportData,totalSort );
			    }
			   break;
		 case 3:  
			    EmailCompareDesc emailSort = new EmailCompareDesc();
			    Collections.sort(reportData,emailSort );
			    break;
			    
		 case 4:
			    CityCompareAsc citySort = new CityCompareAsc();
			    Collections.sort(reportData,citySort );
			   break;
			    
			 
		
		}
		
		
		
	}

	/**
	 * Write sorted report data to file
	 */
	protected void writeDataToFile() throws UnableToSaveReportException {
		final String EXCP_UNABLE_TO_SAVE_RPT = "EXCP0001";
		
		// TODO Code logic to write ArrayList data to file
		/*
		try {
			
		} catch(IOException ioException) {
			throw new UnableToSaveReportException(EXCP_UNABLE_TO_SAVE_RPT);
		} finally {
			
		}
		*/
	}

}
