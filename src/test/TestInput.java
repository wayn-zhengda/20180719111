import org.junit.Test;

import java.io.*;

public class TestInput {

    @Test
    public void readFile(){
        File file = new File("d:");
        try {
            InputStream inputStream = new FileInputStream("D:\\Git\\LICENSE.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
            String content = "";
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String tempString = null;
            while ((tempString=bufferedReader.readLine()) !=null){
                content += tempString + "\n";
            }
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
