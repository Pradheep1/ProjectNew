import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Action1\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> a = d.findElements(By.tagName("tr"));
for (int i = 0; i < a.size(); i++) {
	WebElement b = a.get(i);
List<WebElement> c = b.findElements(By.tagName("td"));
for (int j = 0; j <c.size(); j++) {
	WebElement e = c.get(j);
String txt = e.getText();
System.out.println(txt);
}
}
}
}
