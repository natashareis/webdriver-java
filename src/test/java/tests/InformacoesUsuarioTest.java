package tests;

//import org.junit.Assert;
import static java.lang.Thread.sleep;
import static org.junit.Assert.*; //importa todos os métodos assert para a classe

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class InformacoesUsuarioTest {
    private WebDriver browser;

    @Before
    public void setUp(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","/users/natasha/automation/chromedriver");
        // System.setProperty("webdriver.chrome.driver","C:\\Users\\NREIS\\drivers\\chromedriver.exe"); //for windows
        browser = new ChromeDriver();
        browser.manage().window().setSize(new Dimension(1280, 800));
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //espera para iteração
        //Navegando para a página do Taskit!
        browser.get("http://www.juliodelima.com.br/taskit");
        //browser.get("https://nationalbank-stage.nestready.ca/");
    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() throws InterruptedException {
        //clicar no link que possui o texto "sign in"
       // WebElement linkSignIn = browser.findElement(By.linkText("Sign in"));
       // linkSignIn.click();
        browser.findElement(By.linkText("Sign in")).click();

        //Identificando o formulário de login
        WebElement formularioSignInBox = browser.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" que está dentro do formulário de ID signinbox o texto "julio0001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");


        //Digitar no campo com name "password" que está dentro do formulário de ID signinbox o texto "123456"

        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        //clicar no link com o texto SIGN IN
        formularioSignInBox.findElement(By.linkText("SIGN IN")).click();

        //Validar que dentro do elemento com classe "me" possui o texto Hi, Julio
        WebElement me = browser.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, Julio", textoNoElementoMe);

        //clicar no link que tem a class me

        //clicar no link que contém o texto "More data about you"

        //clicar no botão

    }


    @After
    public void tearDown(){
        //Fechar o navegador
        browser.close();
    }
}
