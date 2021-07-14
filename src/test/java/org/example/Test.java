package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test{
    public static void main(String[] args) {
        Options.tested();
    }
}

class Options{
    public static void tested() {
        System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // first test
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("stasmotorin199407@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("input[name='commit']")).click();

        //second test
        driver.findElement(By.cssSelector("a[href=\"/addresses\"]")).click();
        driver.findElement(By.cssSelector("a[class= \"row justify-content-center\"]")).click();
        driver.findElement(By.name("address[first_name]")).sendKeys("Stanislav");
        driver.findElement(By.name("address[last_name]")).sendKeys("Motorin");

    }
}