import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSort {


    @Test
    public void testSort(){
       int[] ints ={5,69,8,6,8,5,57,9,1};
        for (int x =0;x<ints.length;x++){
            for (int i = 0;i < ints.length-1;i++){
                if (ints[i] > ints[i+1]){
                    int j = ints[i];
                    ints[i] = ints[i+1];
                    ints[i+1] = j;
                }
            }
        }

       for (int i =0;i<ints.length;i++){
               System.out.println(ints[i]);
       }
    }
}
