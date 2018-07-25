import org.junit.Test;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


public class TestSocket {

    @Test
    public void socketDemo() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        inetAddress.getAddress();
        inetAddress.getCanonicalHostName();
        inetAddress.getHostAddress();
        inetAddress.getHostName();
        System.out.println(inetAddress.getAddress()+ "\n"+inetAddress.getCanonicalHostName()+"\n"+inetAddress.getHostAddress()+"\n"+ inetAddress.getHostName());
        byte[] bytes = inetAddress.getAddress();
        System.out.println(Arrays.toString(bytes));
    }
}
