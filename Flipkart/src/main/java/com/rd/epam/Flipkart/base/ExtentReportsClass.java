package com.rd.epam.Flipkart.base;

import com.relevantcodes.extentreports.ExtentReports;



public class ExtentReportsClass {
    public ExtentReports extent;
    private static ExtentReportsClass reportclassinstance;

 

    private ExtentReportsClass() {
        extent = new ExtentReports(System.getProperty("user.dir") + "//reports//test_reports.html");
    }

 

    public static ExtentReportsClass getExtentReportClassInstance() {
        if (reportclassinstance == null)
            reportclassinstance = new ExtentReportsClass();
        return reportclassinstance;
    }

 

    public ExtentReports getExtentReports() {
        return extent;
    }

 

}
