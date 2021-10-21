package suporte;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Web {


    public static WebDriver createChrome()  {
        //Criar Chrome
        System.setProperty("webdriver.crome.driver" ,"driver/chromedriver.exe");
        //Tempo sessão objeto
        WebDriver navegador = new ChromeDriver();
        //Scroll na tela
        JavascriptExecutor jse = (JavascriptExecutor)navegador;
         //chamando navegador
        navegador.get("https://hypeflame.blog/");
        //maximar tela
        navegador.manage().window().maximize();
        //timeout 20 segundos
        navegador.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        return navegador;
    }

}
