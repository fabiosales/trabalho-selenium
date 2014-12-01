package yahoo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JeanPerfoll {
    public static void main(String[] args) {
        // abre firefox
           WebDriver driver = new FirefoxDriver();
           driver.get("http://www.minha.unidavi.edu.br/");
           
           WebElement campoLogin = driver.findElement(By.id("UWS_FRM_USR_NOME"));
           campoLogin.sendKeys("31888");
           
           
           WebElement campoSenha = driver.findElement(By.name("UWS_FRM_USR_SENHA"));
           campoSenha.sendKeys("171189");

            WebElement campoAcao = driver.findElement(By.name("acao"));
           campoAcao.submit();
           
            WebElement campoSala = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sala Virtual")));
            campoSala.click();
            
            WebElement campo2014 = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("22014")));
            campo2014.click();  
            
            WebElement campoMateria = driver.findElement(By.partialLinkText("BSN - Legislação e ética"));
            campoMateria.click();
            
            WebElement campoTrabalhos = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Trabalhos")));
            campoTrabalhos.click();
            
            WebElement campoMidiateca = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Midiateca Disciplina")));
            campoMidiateca.click();
            
            WebElement campoSpan2 = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.hitarea.closed-hitarea.expandable-hitarea")));
            campoSpan2.click();
            
            WebElement campoLink = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Artigo_contratos_informaticos_Fabio_Losso")));
            campoLink.click();
            
            WebElement campoSair = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sair")));
            campoSair.click();
    }
}
