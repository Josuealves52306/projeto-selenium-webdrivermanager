//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//    public class testeESTUDO {
//
//        private WebDriver driver; // Removido "static"
//
//        @BeforeEach
//        public void setUp() {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            driver.get("https://front.serverest.dev/login");
//            driver.manage().window().maximize();
//        }
//
//        @AfterEach
//        public void tearDown() {
//            if (driver != null) {
//                driver.quit(); // Fecha o driver após cada teste
//            }
//        }
//
//        @Test
//        public void testCadastro() {
//            driver.findElement(By.linkText("Cadastre-se")).click();
//            driver.findElement(By.id("nome")).sendKeys("josue1");
//            driver.findElement(By.id("email")).sendKeys("josue_alves2011@hotmail.com");
//            driver.findElement(By.id("password")).sendKeys("56762191");
//            driver.findElement(By.cssSelector(".form-check")).click();
//            driver.findElement(By.id("administrador")).click();
//            driver.findElement(By.cssSelector(".btn-primary")).click();
//
//            String mensagem = driver.findElement(By.cssSelector(".lead")).getText();
//            assertThat(mensagem, is("Este é seu sistema para administrar seu ecommerce."));
//        }
//    }
//
