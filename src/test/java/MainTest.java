import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSumOk(){

        Main main = new Main();
        main.sum(2,5);
        assertEquals(7,main.sum(2,5));
    }

    @Test
    public void testSumError(){
        Main main = new Main();
        assertEquals(7,main.sum(2,5));
    }

}
