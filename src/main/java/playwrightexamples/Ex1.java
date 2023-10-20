package playwrightexamples;

import com.microsoft.playwright.*;
import java.nio.file.Paths;

public class Ex1 {
    public static void main(String[] args) {
            Playwright play =Playwright.create();
        	Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        	           
            Page page = browser.newPage();
            
            page.navigate("http://playwright.dev");
            
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
            System.out.println(page.title());
            page.close();
        }
}


