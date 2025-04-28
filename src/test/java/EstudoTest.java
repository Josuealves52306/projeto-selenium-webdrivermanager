//BIBLIOTECA
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//CLASSE
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Teste de Login")
public class EstudoTest {

    //ATRIBUTOS
    private static WebDriver driver;

    //FUNÇÕES, METODOS


    //ANTES DO TESTE
    @BeforeAll

    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }
    @BeforeEach
    public void inicioTesteUnico() {
        driver.get("https://front.serverest.dev/login");

    }

    //DEPOIS DO TESTE
    @AfterAll
    public static void tearDown() {
        System.out.println("Teste Finalizado");
        driver.quit();
    }

    //TESTE1
    @Test
    @Order(1)
    @DisplayName("Teste realizado no caminho feliz com sucesso")
    public void testCadastroSimplesComDadosValidos() {

        driver.findElement(By.linkText("Cadastre-se")).click();
        driver.findElement(By.id("nome")).click();
        driver.findElement(By.id("nome")).sendKeys("josue27");
        driver.findElement(By.id("email")).sendKeys("josue_alves2027@hotmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("56762191");

        assertEquals("Cadastrar", driver.findElement(By.cssSelector(".btn-primary")).getText(),"Texto esperado 'Cadastrar com sucesso', mas foi exivido outro texto");

        driver.findElement(By.cssSelector(".form-check")).click();
        driver.findElement(By.cssSelector(".btn-primary")).click();
        assertEquals("Cadastro realizado com sucesso", driver.findElement(By.cssSelector("a.alert-link")).getText(),"Texto esperado 'Cadastro realizado com sucesso', mas foi exivido outro texto");



    }
    //TESTE2
    @Test
    @Order(2)
    @DisplayName("Teste realizado com mensagem pra email ja existente")
    public void testCadastroSimplesComJaUtilizado() {

        driver.findElement(By.linkText("Cadastre-se")).click();
        driver.findElement(By.id("nome")).click();
        driver.findElement(By.id("nome")).sendKeys("josue27");
        driver.findElement(By.id("email")).sendKeys("josue_alves2027@hotmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("56762191");

        assertEquals("Cadastrar", driver.findElement(By.cssSelector(".btn-primary")).getText(),"Texto esperado 'Cadastrar com sucesso', mas foi exivido outro texto");

        driver.findElement(By.cssSelector(".form-check")).click();
        driver.findElement(By.cssSelector(".btn-primary")).click();
        assertEquals("Este email já está sendo usado", driver.findElement(By.cssSelector("div.alert.alert-secondary.alert-dismissible > span")).getText(),"Texto esperado 'Cadastro realizado com sucesso', mas foi exivido outro texto");



    }


}