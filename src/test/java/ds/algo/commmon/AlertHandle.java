package ds.algo.commmon;

import org.openqa.selenium.WebDriver;

public class AlertHandle {

public static void alerthandle() {
	BrowserDriverManager.driver.switchTo().alert().accept();
}
}
