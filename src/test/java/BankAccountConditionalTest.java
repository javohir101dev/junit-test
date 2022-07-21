import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BankAccountConditionalTest {

    @Test
    @EnabledOnOs({OS.MAC})
//    @DisabledOnOs({OS.MAC})
    public void testMac(){

    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testWindows(){

    }

    @Test
    @EnabledOnJre({JRE.JAVA_11})
    public void testOnJre(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_11})
    public void testNoJre(){

    }
}
