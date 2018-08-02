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

    @Test
    public void bufferedTest(){
        try {
            BufferedReader in = new BufferedReader(new FileReader("D:\\\\Git\\\\LICENSE.txt"));
            String str = "";
            while (in.readLine() != null){
                str = in.readLine();
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void bufferTest(){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("D:\\11.txt"));
            out.write("test*****************************\n");
            out.write("---------------------------------");
            out.close();
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
