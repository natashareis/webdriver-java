package tests;

//import org.junit.Assert;
import static org.junit.Assert.*; //importa todos os métodos assert para a classe
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","/users/reisna01/Drivers/chromedriver");
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\NREIS\\drivers\\chromedriver.exe"); //for windows
        WebDriver navegador = new ChromeDriver();

        //Navegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit");

        assertEquals(1,1);
    }
}
