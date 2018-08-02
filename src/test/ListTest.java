import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    @Test
    public void listTest(){
        List<String> list = new ArrayList();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        String names = "";
        for (int i =0 ; i < list.size() ; i++){
            names += list.get(i)+"<br>";
        }
        System.out.println(names);
    }
}
