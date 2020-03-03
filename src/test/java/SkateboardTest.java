
import org.junit.Test;
import static org.junit.Assert.*;

public class SkateboardTest {


    Skateboard skateboard = new Skateboard(4,3,2);

    @Test
    public void testNumOfWheels()
    {

             assertSame(4,skateboard.getWheels());


    }


    @Test
    public void testAbecSpeed()
    {

        assertSame(3,skateboard.getAbecSpeed());


    }


    @Test
    public void testDeckStrength()
    {

        assertSame(2,skateboard.deckStrength);

    }


}
