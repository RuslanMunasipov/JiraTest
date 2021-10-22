package Web;

import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$x;

public class someExceptions {
    public static void failExec(){
        try {
            Assertions.assertEquals($x("//h1[text()='System Dashboard']"), "<h1>System Dashboard</h1>", "oshibka");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
