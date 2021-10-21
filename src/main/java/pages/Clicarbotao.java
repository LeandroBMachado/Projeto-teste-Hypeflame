package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clicarbotao {

    private WebDriver navegador;

    public Clicarbotao (WebDriver navegador) {
        this.navegador = navegador ;
    }

    public Clicarbotaopage clique() {

        navegador.findElement(By.xpath("//*[@id=\"post-1257\"]/footer/a")).click();

        return  new Clicarbotaopage(navegador);
    }

}


