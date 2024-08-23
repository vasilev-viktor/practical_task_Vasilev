package org.ibs;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class FirstTest {

    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriwer.chrome.driver",
                "D:\\Programming\\Project IBS\\practical_task_Vasilev\\src\\test\\resources\\chromedriver.exe");


        driver.get("http://localhost:8080");
        driver.manage().window().maximize();
        Thread.sleep(1000);


        //Нажатие кнопки "Песочница"
        WebElement dropDownSandbox = driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]"));
        dropDownSandbox.click();

        //Нажатие кнопки "Товары"
        WebElement buttonGoods = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/a[1]"));
        buttonGoods.click();


        //Кейс 1. Создание фрукта "Маракуйя" с чекбоксом "Экзотический" - true.

        //Нажатие кнопки "Добавить", ожидание появления окна
        WebElement buttonAdd1 = driver.findElement(By.xpath("//button[@data-toggle='modal']"));
        buttonAdd1.click();
 //       Thread.sleep(1000);


        //Кликаем на поле ввода
        //Заполнение поля ввода переменной "Маракуйя"(string)

        WebElement inputFieldFruit = driver.findElement(By.xpath("//input[@placeholder=\"Наименование\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        inputFieldFruit.sendKeys("Маракуйя");

        //Раскрытие выпадающего списка "Тип"
        WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        dropDown1.click();

        //Выбор типа "Фрукт"
        WebElement fruitButton = driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]"));
        fruitButton.click();

        //Чекбокс "Экзотический" - true
        WebElement checkBoxExoticTrue = driver.findElement(By.xpath("//*[@id=\"exotic\"]"));
        checkBoxExoticTrue.click();

        //Нажатие кнопки "Сохранить", ожидание сохранения
        WebElement saveButton1 = driver.findElement(By.xpath("//*[@id=\"save\"]"));
        saveButton1.click();
        Thread.sleep(1000);

        //Кейс 2. Создание овоща "Кукумбер" с чекбоксом "Экзотический" - false.

        //Нажатие кнопки "Добавить", ожидание появления окна
        WebElement buttonAdd2 = driver.findElement(By.xpath("//button[@data-toggle='modal']"));
        buttonAdd2.click();


        //Кликаем на поле ввода
        //Заполнение поля ввода переменной "Кукумбер"(string)
        WebElement inputField = driver.findElement(By.xpath("//input[@placeholder=\"Наименование\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        inputField.click();
        inputField.sendKeys("Кукумбер");

        //Раскрытие выпадающего списка "Тип"
        WebElement dropDown2 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        dropDown2.click();

        //Выбор типа "Овощ"
        WebElement vegetableButton = driver.findElement(By.xpath("//*[@id=\"type\"]/option[1]"));
        vegetableButton.click();

        //Нажатие кнопки "Сохранить", ожидание сохранения
        WebElement saveButton2 = driver.findElement(By.xpath("//*[@id=\"save\"]"));
        saveButton2.click();
        Thread.sleep(2000);

        //Закрытие браузера
        driver.quit();

    }
}


