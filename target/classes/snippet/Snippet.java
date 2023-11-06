package snippet;

public class Snippet {
	static WebDriver driver;
		static Properties data;
	
		
		public static void main(String[] args) {
			read();
			WebDriverManager.chromedriver().setup();
			Object myUname = data.get("u");
			Object mypass = data.get("p");
			Object url = data.get("b");
			// System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			driver = new ChromeDriver();
	
			driver.get(url.toString());
			WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
			username.sendKeys(myUname.toString());
			WebElement pass = driver.findElement(By.name("pass"));
	        pass.sendKeys(mypass.toString());
			// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("cgrad");
	
		}
	
		public static void read() {
	
			try {
				FileInputStream is = new FileInputStream("./src/main/resources/data.properties");
			try {	
				    data = new Properties();
					data.load(is);
				} 
			catch (IOException e) {
					
					e.printStackTrace();
				}
		}	 catch (FileNotFoundException e) {
	
				e.printStackTrace();
	
			}
			
		}
		
	
	}
		
}

