/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yahoo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author aluno
 */
public class ViniciusCunha {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        @SuppressWarnings("UnusedAssignment")
        WebElement campoTexto = null;
        WebElement campoTexto1 = null;
        WebElement campoTexto2 = null;
         WebElement campoTexto3 = null;
          WebElement campoTexto4 = null;
          WebElement log = null;
  
          
//
        driver.get("http://www.4shared.com/");

        campoTexto = driver.findElement(By.id("sign_form_log"));
        campoTexto.sendKeys("seleniumtest@hotmail.com");

        campoTexto1 = driver.findElement(By.id("sign_form_cp1"));
        campoTexto1.sendKeys("789asddsa");
       
        campoTexto2 = driver.findElement(By.id("sign_form_cp2"));
        campoTexto2.sendKeys("789asddsa");
        
        WebElement campoSpan2 = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='sign_form']/div[6]/a")));
            campoSpan2.click();
            
            campoTexto3 = driver.findElement(By.id("step1firstname"));
            campoTexto3.sendKeys("Testando");
            
            
            campoTexto4 = driver.findElement(By.id("step1lastname"));
            campoTexto4.sendKeys("Selenium");
            
           
           WebElement Log = driver.findElement(By.id("registrationSubmit"));
            Log.click();

}
}
