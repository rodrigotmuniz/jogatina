/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogatina.selenium;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.jogatina.entidades.Response;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Rodrigo Muniz
 */
public class Main {

    static WebDriver driver = new PhantomJSDriver();
    static String resp = "";
//    static String resp = "<html><head></head><body><pre style=\"word-wrap: break-word; white-space: pre-wrap;\">{\"_graph\":[{\"name\":\"1\",\"color\":\"#6390bc\",\"type\":\"line\",\"pointStart\":-16,\"data\":[{\"x\":-16,\"y\":8,\"name\":-16},{\"x\":-15,\"y\":9,\"name\":-15},{\"x\":-14,\"y\":9,\"name\":-14},{\"x\":-13,\"y\":9,\"name\":-13},{\"x\":-12,\"y\":9,\"name\":-12},{\"x\":-11,\"y\":12.5,\"name\":-11},{\"x\":-10,\"y\":13.5,\"name\":-10},{\"x\":-9,\"y\":14,\"name\":-9},{\"x\":-8,\"y\":13.5,\"name\":-8},{\"x\":-7,\"y\":14,\"name\":-7},{\"x\":-6,\"y\":14.5,\"name\":-6},{\"x\":-5,\"y\":15,\"name\":-5},{\"x\":-4,\"y\":16,\"name\":-4},{\"x\":-3,\"y\":15.5,\"name\":-3},{\"x\":-2,\"y\":15,\"name\":-2},{\"x\":-1,\"y\":15.5,\"name\":-1},{\"x\":0,\"y\":15,\"name\":0},{\"x\":1,\"y\":15,\"name\":1},{\"x\":2,\"y\":16,\"name\":2},{\"x\":3,\"y\":15.5,\"name\":3},{\"x\":4,\"y\":15,\"name\":4},{\"x\":5,\"y\":14,\"name\":5},{\"x\":6,\"y\":14,\"name\":6},{\"x\":7,\"y\":14,\"name\":7},{\"x\":8,\"y\":15,\"name\":8},{\"x\":9,\"y\":15,\"name\":9},{\"x\":10,\"y\":12.5,\"name\":10},{\"x\":11,\"y\":12.5,\"name\":11},{\"x\":12,\"y\":11,\"name\":12},{\"x\":13,\"y\":11,\"name\":13},{\"x\":14,\"y\":11,\"name\":14},{\"x\":15,\"y\":11,\"name\":15},{\"x\":16,\"y\":10,\"name\":16},{\"x\":17,\"y\":10,\"name\":17},{\"x\":18,\"y\":10,\"name\":18},{\"x\":19,\"y\":9.2,\"name\":19},{\"x\":20,\"y\":10,\"name\":20},{\"x\":21,\"y\":9.4,\"name\":21},{\"x\":22,\"y\":9.4,\"name\":22}]},{\"name\":\"2\",\"color\":\"#F45B5B\",\"type\":\"line\",\"pointStart\":-16,\"data\":[{\"x\":-16,\"y\":1.05,\"name\":-16},{\"x\":-15,\"y\":1.06,\"name\":-15},{\"x\":-14,\"y\":1.07,\"name\":-14},{\"x\":-13,\"y\":1.08,\"name\":-13},{\"x\":-12,\"y\":1.07,\"name\":-12},{\"x\":-11,\"y\":1.07,\"name\":-11},{\"x\":-10,\"y\":1.07,\"name\":-10},{\"x\":-9,\"y\":1.07,\"name\":-9},{\"x\":-8,\"y\":1.07,\"name\":-8},{\"x\":-7,\"y\":1.06,\"name\":-7},{\"x\":-6,\"y\":1.06,\"name\":-6},{\"x\":-5,\"y\":1.06,\"name\":-5},{\"x\":-4,\"y\":1.06,\"name\":-4},{\"x\":-3,\"y\":1.06,\"name\":-3},{\"x\":-2,\"y\":1.06,\"name\":-2},{\"x\":-1,\"y\":1.06,\"name\":-1},{\"x\":0,\"y\":1.06,\"name\":0},{\"x\":1,\"y\":1.07,\"name\":1},{\"x\":2,\"y\":1.07,\"name\":2},{\"x\":3,\"y\":1.07,\"name\":3},{\"x\":4,\"y\":1.07,\"name\":4},{\"x\":5,\"y\":1.07,\"name\":5},{\"x\":6,\"y\":1.07,\"name\":6},{\"x\":7,\"y\":1.07,\"name\":7},{\"x\":8,\"y\":1.07,\"name\":8},{\"x\":9,\"y\":1.08,\"name\":9},{\"x\":10,\"y\":1.08,\"name\":10},{\"x\":11,\"y\":1.1,\"name\":11},{\"x\":12,\"y\":1.1,\"name\":12},{\"x\":13,\"y\":1.09,\"name\":13},{\"x\":14,\"y\":1.1,\"name\":14},{\"x\":15,\"y\":1.09,\"name\":15},{\"x\":16,\"y\":1.1,\"name\":16},{\"x\":17,\"y\":1.11,\"name\":17},{\"x\":18,\"y\":1.12,\"name\":18},{\"x\":19,\"y\":1.12,\"name\":19},{\"x\":20,\"y\":1.12,\"name\":20},{\"x\":21,\"y\":1.12,\"name\":21},{\"x\":22,\"y\":1.12,\"name\":22}]}],\"x_labels\":[{\"value\":0,\"width\":1,\"zIndex\":2,\"color\":null,\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":12,\"x\":-1,\"text\":0,\"useHTML\":true}},{\"value\":0,\"width\":1,\"zIndex\":2,\"color\":\"gray\",\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":30,\"x\":-1,\"text\":\"In\\u00edcio\",\"useHTML\":true}},{\"value\":10,\"width\":1,\"zIndex\":2,\"color\":null,\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":12,\"x\":-1,\"text\":\"10'\",\"useHTML\":true}},{\"value\":20,\"width\":1,\"zIndex\":2,\"color\":null,\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":12,\"x\":-1,\"text\":\"20'\",\"useHTML\":true}},{\"value\":21,\"width\":1,\"zIndex\":2,\"color\":\"green\",\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":15,\"x\":-1,\"text\":\"&lt;span class='event G tipsy-active' title='&lt;img style=&amp;quot;float:left;margin-right:5px;&amp;quot; src=&amp;quot;https:\\/\\/academia.r.worldssl.net\\/addons\\/default\\/modules\\/stats\\/img\\/team\\/24x24\\/302.png&amp;quot; \\/&gt; &lt;span style=&amp;quot;text-align:left;&amp;quot;&gt;Nen&amp;ecirc;&lt;br \\/&gt;21&amp;apos;&lt;\\/span&gt;&lt;br class=&amp;quot;clear&amp;quot; \\/&gt;' style='margin-left:-7px;'&gt;&lt;\\/span&gt;\",\"useHTML\":true}},{\"value\":35,\"width\":1,\"zIndex\":2,\"color\":\"red\",\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":25,\"x\":-1,\"text\":\"&lt;span class='event RC tipsy-active' title='&lt;img style=&amp;quot;float:left;margin-right:5px;&amp;quot; src=&amp;quot;https:\\/\\/academia.r.worldssl.net\\/addons\\/default\\/modules\\/stats\\/img\\/team\\/24x24\\/306.png&amp;quot; \\/&gt; &lt;span style=&amp;quot;text-align:left;&amp;quot;&gt;Yago&lt;br \\/&gt;35&amp;apos;&lt;\\/span&gt;&lt;br class=&amp;quot;clear&amp;quot; \\/&gt;' style='margin-left:-7px;'&gt;&lt;\\/span&gt;\",\"useHTML\":true}},{\"value\":42,\"width\":1,\"zIndex\":2,\"color\":\"green\",\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":15,\"x\":-1,\"text\":\"&lt;span class='event G tipsy-active' title='&lt;img style=&amp;quot;float:left;margin-right:5px;&amp;quot; src=&amp;quot;https:\\/\\/academia.r.worldssl.net\\/addons\\/default\\/modules\\/stats\\/img\\/team\\/24x24\\/302.png&amp;quot; \\/&gt; &lt;span style=&amp;quot;text-align:left;&amp;quot;&gt;Nen&amp;ecirc;&lt;br \\/&gt;42&amp;apos;&lt;\\/span&gt;&lt;br class=&amp;quot;clear&amp;quot; \\/&gt;' style='margin-left:-7px;'&gt;&lt;\\/span&gt;\",\"useHTML\":true}},{\"value\":54,\"width\":1,\"zIndex\":2,\"color\":\"green\",\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":15,\"x\":-1,\"text\":\"&lt;span class='event G tipsy-active' title='&lt;img style=&amp;quot;float:left;margin-right:5px;&amp;quot; src=&amp;quot;https:\\/\\/academia.r.worldssl.net\\/addons\\/default\\/modules\\/stats\\/img\\/team\\/24x24\\/302.png&amp;quot; \\/&gt; &lt;span style=&amp;quot;text-align:left;&amp;quot;&gt;&amp;Eacute;verton&lt;br \\/&gt;54&amp;apos;&lt;\\/span&gt;&lt;br class=&amp;quot;clear&amp;quot; \\/&gt;' style='margin-left:-7px;'&gt;&lt;\\/span&gt;\",\"useHTML\":true}},{\"value\":77,\"width\":1,\"zIndex\":2,\"color\":\"red\",\"label\":{\"verticalAlign\":\"bottom\",\"rotation\":0,\"style\":{\"color\":\"#666\",\"font-size\":\"11px\"},\"textAlign\":\"center\",\"y\":25,\"x\":-1,\"text\":\"&lt;span class='event Y2C tipsy-active' title='&lt;img style=&amp;quot;float:left;margin-right:5px;&amp;quot; src=&amp;quot;https:\\/\\/academia.r.worldssl.net\\/addons\\/default\\/modules\\/stats\\/img\\/team\\/24x24\\/302.png&amp;quot; \\/&gt; &lt;span style=&amp;quot;text-align:left;&amp;quot;&gt;Lucas Fernandes&lt;br \\/&gt;77&amp;apos;&lt;\\/span&gt;&lt;br class=&amp;quot;clear&amp;quot; \\/&gt;' style='margin-left:-7px;'&gt;&lt;\\/span&gt;\",\"useHTML\":true}}],\"_graph_bands\":[],\"view\":\"    &lt;div class=\\\"title\\\"&gt;\\n        Gr\\u00e1fico &lt;b&gt;Odds vs Tempo&lt;\\/b&gt; - pre\\u00e7o transaccionado Betfair    &lt;\\/div&gt;\\n    &lt;div class=\\\"graph_filters\\\"&gt;\\n        &lt;span class=\\\"filters_title\\\"&gt;Selec\\u00e7\\u00e3o do mercado:&lt;\\/span&gt;\\n                            &lt;span class=\\\"graph_f\\\" data-serie-id=\\\"0\\\"&gt;&lt;span style=\\\"background-color:#6390bc;\\\"&gt;&lt;\\/span&gt;Under 0.5 Goals&lt;\\/span&gt;\\n                    &lt;span class=\\\"graph_f\\\" data-serie-id=\\\"1\\\"&gt;&lt;span style=\\\"background-color:#F45B5B;\\\"&gt;&lt;\\/span&gt;Over 0.5 Goals&lt;\\/span&gt;\\n                    &lt;\\/div&gt;\\n    &lt;br class=\\\"clear\\\" \\/&gt;\\n    &lt;div id=\\\"graph-odds\\\" style=\\\"min-width: 200px; height: 400px; margin: 0 auto;\\\"&gt;&lt;\\/div&gt;\\n\",\"status\":\"success\"}</pre></body></html>";
    
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.phantomjs.driver", "phantomjs.exe");

        login();
        resp = consultarOdds();
        
        driver.quit();

//        
        trabalharResposta();
        objetoTeste();
    }

    public static void trabalharResposta() {
        
        resp = resp.substring(resp.indexOf("{"), resp.lastIndexOf("}")+1);
        resp = resp.replace("_graph", "graph");
        resp = resp.replace("_graph_bands", "graph_bands");
        resp = resp.replaceAll("font-size", "fontSize");
//        System.out.println(resp);
    }

    public static void objetoTeste() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Response obj = mapper.readValue(resp, Response.class);
    }

    public static String consultarOdds() throws InterruptedException, NoSuchElementException {
        String enderecoConsultar = "https://www.academiadasapostas.com/stats/getAjaxOddsGraph?market_id=18120873&match_id=2729353";
        ((JavascriptExecutor) driver).executeScript("window.location = '" + enderecoConsultar + "'");

        WebDriverWait wait = new WebDriverWait(driver, 5L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("pre")));

        String resultado = driver.getPageSource();
        System.out.println(resultado);

        return resultado;

    }

    public static void login() throws InterruptedException {
        driver.get("https://www.academiadasapostas.com/users/login");
        driver.findElement(By.id("reg-user")).sendKeys("rodrigotmuni");
        driver.findElement(By.id("log-passwrd1")).sendKeys("123456");
        driver.findElements(By.cssSelector("input")).get(8).submit();
    }

}
