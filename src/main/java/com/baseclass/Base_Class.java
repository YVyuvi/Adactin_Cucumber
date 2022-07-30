package com.baseclass;

import java.awt.Robot;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver; // Null
	public static String value; // Null

	public static WebDriver getBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void sendKeyElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void Alerts(String option, String text) {
		Alert a = driver.switchTo().alert();
		if (option.equalsIgnoreCase("accept")) {
			a.accept();
		} else if (option.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		} else if (option.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(text);
			a.accept();
		} else if (option.equalsIgnoreCase("gettext")) {
			String getText = a.getText();
			System.out.println(getText);
			a.accept();
		}
	}

	public static void Action(String option, WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		if (option.equalsIgnoreCase("click")) {
			a.click(from).build().perform();
		} else if (option.equalsIgnoreCase("doubleClick")) {
			a.doubleClick(from).build().perform();
		} else if (option.equalsIgnoreCase("contextClick")) {
			a.contextClick(from).build().perform();
		} else if (option.equalsIgnoreCase("dragAndDrop")) {
			a.dragAndDrop(from, to).build().perform();
		} else if (option.equalsIgnoreCase("moveToElement")) {
			a.clickAndHold(from).moveToElement(to).release(to).build().perform();
		}
	}

	public static void frames(String option, String type, WebElement element) {
		if (option.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(type);
			driver.switchTo().frame(index);
		} else if (option.equalsIgnoreCase("idOrName")) {
			driver.switchTo().frame(type);
		} else if (option.equalsIgnoreCase("webElement")) {
			driver.switchTo().frame(element);
		} else if (option.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
		}
	}

	public static void robotsPress(int type) throws Throwable {
		Robot r = new Robot();
		r.keyPress(type);
		// r.keyRelease(type);
	}

	public static void robotsRelease(int type) throws Throwable {
		Robot r = new Robot();
		// r.keyPress(type);
		r.keyRelease(type);
	}

	public static void robots(int type) throws Throwable {
		Robot r = new Robot();
		r.keyPress(type);
		r.keyRelease(type);
	}

	public static void windowHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static Set<String> windowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println("Total windows : " + size);
		for (String cw : windowHandles) {
			System.out.println(cw);
			String title = driver.switchTo().window(cw).getTitle();
			System.out.println(title);
		}
		return windowHandles;
	}

	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(value);
		}
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			// System.out.println(webElement);
			System.out.println(webElement.getText());
		}
	}

	public static void getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		// System.out.println(firstSelectedOption);
		System.out.println(firstSelectedOption.getText());
	}

	public static void getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			// System.out.println(webElement);
			System.out.println(webElement.getText());
		}
	}

	public static void checkBox(WebElement element) {
		element.click();
	}

	public static void radioButton(WebElement element) {
		element.click();
	}

	public static void isEnable(WebElement element) {
		boolean enable = element.isEnabled();
		System.out.println(enable);
	}

	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void getTitle() {
		System.out.println(driver.getTitle());
	}

	public static void getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}

	public static void getAttribute(WebElement element, String value) {
		System.out.println(element.getAttribute(value));
	}

	public static void takesScreenshot(String name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Hp\\eclipse-workspace\\Maven_Project\\Screenshot//" + name + ".png");
		FileUtils.copyFile(src, des);
	}

	public static void scroll(String option, String x, String y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (option.equalsIgnoreCase("down")) {
			int parseInt1 = Integer.parseInt(x);
			int parseInt2 = Integer.parseInt(y);
			js.executeScript("window.scrollBy(" + parseInt1 + "," + parseInt2 + ");");
		} else if (option.equalsIgnoreCase("up")) {
			int parseInt1 = Integer.parseInt(x);
			int parseInt2 = Integer.parseInt(y);
			js.executeScript("window.scrollBy(" + parseInt1 + "," + parseInt2 + ");");
		} else if (option.equalsIgnoreCase("end")) {
			js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		} else if (option.equalsIgnoreCase("home")) {
			js.executeScript("window.scroll(0,0)", "");
		}
	}

	public static void waits(String type, int x, TimeUnit seconds, WebElement element) {
		if (type.equalsIgnoreCase("implicit")) {
			driver.manage().timeouts().implicitlyWait(x, seconds);
		} else if (type.equalsIgnoreCase("explicit")) {
			WebDriverWait wait = new WebDriverWait(driver, x);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}

}
