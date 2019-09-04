package com.rd.epam.Flipkart.base;

import java.io.File;



import java.io.IOException;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

 

public class ScreenshotFailed {

 

    private static int count = 0;

 

    private ScreenshotFailed() throws IllegalAccessException {
        throw new IllegalAccessException("Can't Instantiate this class");
    }

 

    public static void failed(WebDriver driver, String testmethodname) throws IOException {
        count++;
        
        try {
            String filenum = Integer.toString(count);
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,
                    new File(System.getProperty("user.dir") + "//reports//" + testmethodname + filenum + ".jpg"));

 

        } catch (Exception e) {

 

        }
    }

 

    public static String getScreenshot(WebDriver driver, String testmethodname) throws IOException {

 

        TakesScreenshot ts = (TakesScreenshot) driver;

 

        File src = ts.getScreenshotAs(OutputType.FILE);

 

        String path = System.getProperty("user.dir") + "\\reports\\" + testmethodname + System.currentTimeMillis()
                + ".jpg";

 

        File destination = new File(path);

 

        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            System.out.println("Capture Failed " + e.getMessage());
        }

 

        return path;
    }

 

}
