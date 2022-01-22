public class Jawaon {

    public static void main(String[] args) {
        System.out.println("I am alive");
        System.setProperty("webdriver.gecko.driver", "C://Selenium//Drivers/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
