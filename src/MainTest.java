import org.junit.Test;

public class MainTest extends CoreTestCase
{
    MathHelper Math = new MathHelper();
    @Test
    public void MyFirstTest() {
        int a = Math.OutFunc(12);
        System.out.println(a);
        int b = Math.OutFunc( 11,17);
        System.out.println(b);
    }

}
