package firefoxOptions_4th_May_2023;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FFOptions {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		FirefoxOptions options= new FirefoxOptions();
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile = profiles.getProfile("CanadaAutomationBatch");
		options.setProfile(profile);
		
		//PageloadStrategy- speed at which you want the code to execute
		
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		//notificatons
		
		profile.setPreference("dom.webnotifications.enabled", false);
		
		//Certificates
		
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
		driver = new FirefoxDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
		options.addArguments("--start-maximized");

	}

}
