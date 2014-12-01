/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yahoo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.css.sac.Locator;

/**
 *
 * @author Juliano Nardelli 
 */
public class JulianoNardelli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://login.yahoo.com/?.src=ym&.intl=br&.lang=pt-BR&.done=http://mail.yahoo.com/");
        
        // Faze o login       
        WebElement campoEmail = driver.findElement(By.name("login"));
        campoEmail.sendKeys("julianonardelli");
        //campoEmail.submit();
        
        WebElement campoSenha = driver.findElement(By.name("passwd"));
        campoSenha.sendKeys("XXXX");
        
        WebElement btnConectado = driver.findElement((By.id("pLabelC")));
        btnConectado.click();
        
        WebElement btnLoga = driver.findElement(By.name(".save"));
        btnLoga.submit();
        //Termina de logar
        
        WebElement esperar = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='Compose']/button")));
        esperar.click();
        
        
        WebElement cpPara = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("to-field")));
        cpPara.sendKeys("julianonardelli@gmail.com");
        
        
        WebElement cpAssunto = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("subject-field")));
        cpAssunto.sendKeys("AssuntoTeste");
        
        
        WebElement cpConteudo = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("rtetext")));
        cpConteudo.sendKeys("TESTE SELENIUM");
              
                
        WebElement btnEnviar = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enviar")));
        btnEnviar.click();
        
       //WebElement btnEnviar = driver.findElement(By.xpath("//div[@id='yui_3_16_0_1_1417471041592_2611']/span"));
       //btnEnviar.click();
    }
}
