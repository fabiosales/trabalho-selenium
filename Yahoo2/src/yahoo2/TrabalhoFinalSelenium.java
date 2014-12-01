package yahoo2;

import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrabalhoFinalSelenium {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //abre firefox
        WebDriver driver = new FirefoxDriver();
        
        //acessa o site do google
        driver.get("https://twitter.com/");

        //Informa��es do login
        WebElement campoEmail = driver.findElement(By.id("signin-email"));
        campoEmail.sendKeys("fabiosales.c@unidavi.edu.br");

        WebElement campoSenha = driver.findElement(By.id("signin-password"));
        campoSenha.sendKeys("123teste321");
        
        //Efetua o login
        WebElement botaoEntrar = driver.findElement(By.cssSelector("button.submit.btn.primary-btn.flex-table-btn.js-submit"));
        botaoEntrar.click();
        
        //Informa um tweet
        WebElement campoTweet = driver.findElement(By.id("tweet-box-mini-home-profile"));
        campoTweet.sendKeys("Teste Selenium #Selenium #19");
        
        //Tweeta
        WebElement botaoTweet = driver.findElement(By.cssSelector("button.btn.primary-btn.tweet-action.tweet-btn.js-tweet-btn"));
        botaoTweet.click();
        
        
        
        //Pesquisa UNIDAVI
        WebElement campoPesquisa = (new WebDriverWait(driver, 10))
                                       .until(ExpectedConditions.presenceOfElementLocated(By.id("search-query")));
        campoPesquisa.sendKeys("@unidavi");
        campoPesquisa.submit();
        
        //Clica na op��o Seguir
        WebElement botaoSeguir = (new WebDriverWait(driver, 10))
                                  .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.user-actions-follow-button.js-follow-btn.follow-button.btn.small.small-follow-btn")));
        botaoSeguir.click();
        
        //Clica no nome do perfil
        WebElement linkNome = (new WebDriverWait(driver, 10))
                               .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.account-group.js-account-group.js-user-profile-link")));
        linkNome.click();
        
        //Vai at� o perfil completo
        WebElement linkPerfilCompleto = (new WebDriverWait(driver, 10))
                                         .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Ir para o perfil completo")));
        linkPerfilCompleto.click();
        
        //Clica no bot�o para twittar para o perfil
        WebElement botaoTweetarPerfil = (new WebDriverWait(driver, 10))
                                         .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.NewTweetButton.u-sizeFull.js-tooltip.btn.primary-btn.tweet-action.tweet-btn")));
        botaoTweetarPerfil.click();
        
        //Informa um tweet
        WebElement campoTweetarPerfil = (new WebDriverWait(driver, 10))
                                         .until(ExpectedConditions.presenceOfElementLocated(By.id("tweet-box-global")));
        campoTweetarPerfil.sendKeys("Teste Selenium - Disciplina T�picos Avan�ados - BSI 8� fase #UNIDAVI");
        
        //Clicar em tweetar
        WebElement botaoTweetar = (new WebDriverWait(driver, 10))
                                         .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.btn.primary-btn.tweet-action.tweet-btn.js-tweet-btn")));
        botaoTweetar.click();
        
        WebElement botaoInicio = (new WebDriverWait(driver, 10))
                                         .until(ExpectedConditions.presenceOfElementLocated(By.linkText("In�cio")));
        botaoInicio.click();
    }
}
