import com.sun.org.apache.xpath.internal.objects.XNumber;
import org.junit.Test;
//тут учился переменным класса и  внешним фукциям через применение методов класса this.OutFunc
public class SecondTest {
    int a= 11;
    int b = 12;

    @Test
    public void MyFirstTest() {
        int a = this.OutFunc(12);
        System.out.println(a);
        int b = this.OutFunc( 11,17);
        System.out.println(b);
    }
    public int OutFunc(int number){
        return number*2;
    }
    public int OutFunc(int number, int multiplaer){
        return number + multiplaer;
    }
}
