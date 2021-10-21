package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Clicarbotao;
import suporte.Web;

public class Clicarbotaotest {
    private WebDriver navegador;

  @Before
    public void setup() {

      navegador = Web.createChrome();
  }

   @Test
    public void testClicarnobotao(){

        new Clicarbotao(navegador)
                .clique();
    }

    @After
    public void tearDown(){

      navegador.quit();
    }
}
