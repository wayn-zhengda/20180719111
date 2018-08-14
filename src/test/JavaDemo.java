import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class JavaDemo {

    @Test
    public void stringReplace() {
        String str = "Hello World";
        String regEx = "[abcdH]";
        String reStr = "";
        Pattern pattern = Pattern.compile(regEx);
        System.out.println(pattern);
        Matcher matcher = pattern.matcher(str); // 替换 a、b、c、d、H 为空，即删除这几个字母
        System.out.println(matcher.toString());
        reStr = matcher.replaceAll("").trim();
        System.out.println(reStr);
    }

    @Test
    public void stringSpilt() {
        String str = "www.upupoo.com";
        String delimeter = "\\.";
        String[] temp;
        temp = str.split(delimeter);
        for (String x : temp) {
            System.out.println(x);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }

    @Test
    public void arraySort() {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        List list = Arrays.asList("a,s,x,xs,a,z,z");
        System.out.println(list.get(0));
    }

    @Test
    public void dataDemo() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
    }

    @Test
    public void printArray() {
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        for (Double d : doubleArray) {
            System.out.printf("%s", d);
            System.out.println();
        }
    }

    @Test
    public void testContinue() {
        StringBuffer searchstr = new StringBuffer("hello how are you. ");
        int length = searchstr.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchstr.charAt(i) == 'h') {
                count++;
                System.out.println(searchstr.charAt(i));
                searchstr.setCharAt(i, 'H');
            }
        }
        System.out.println("发现 " + count + " 个 h 字符");
        System.out.println(searchstr);
    }

    @Test
    public void testVarargs() {
        int sum = sumVarargs(1, 2, 2, 4);
        System.out.println(sum);
    }

    static int sumVarargs(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    @Test
    public void printDiamond() {
        int x = 5;
        int y = 1;
        for (int s = 0; s < 5; s++) {
            for (int i = 0; i < x; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            x -= 1;
            y += 2;
            System.out.println();
        }

        for (int s = 0; s < 5; s++) {
            x += 1;
            y -= 2;
            for (int i = 0; i < x; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void itrTest() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "1st");
        hashMap.put("2", "2nd");
        hashMap.put("3", "3rd");
        Collection collections = hashMap.values();
        Collection collection = hashMap.keySet();
        Iterator iterator = collections.iterator();
        Iterator iterator1 = collection.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }
        Set<Map.Entry<String,String>> entrySet =hashMap.entrySet();
        for (Map.Entry set : entrySet){
            System.out.print(set.getKey());
            System.out.println(set.getValue());
        }
    }

    @Test
    public void listTest(){
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");
        //1.iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //2.for
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //2.foreach
        for (String s : list){
            System.out.println(s);
        }
    }

    @Test
    public void setTest(){
        Set<String> set = new HashSet<String>();
        set.add("JAVA");
        set.add("C");
        set.add("C++");
        // 重复数据添加失败
        set.add("JAVA");
        set.add("JAVASCRIPT");

        // 使用iterator遍历set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void rotateTest(){
        List list = Arrays.asList("one Two three Four five six".split(" "));
        System.out.println(list);
        Collections.rotate(list,4);
        System.out.println(list);
    }

    @Test
    public void getIp(){
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName("www.upupoo.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getAddress());
        System.out.println(inetAddress.getCanonicalHostName());
        System.out.println(inetAddress.getHostName());
    }
    @Value("testtttttt")
    private String testUrl;
    @Test
    public void readerTest(){
        System.out.println(testUrl);
        try {
            URL url = new URL(testUrl);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String temp = "";
            while (bufferedReader.readLine() !=null){
                temp += bufferedReader.readLine()+"\n";
                System.out.println(temp);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\11.txt"));
            bufferedWriter.write(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRandom(){
        int maxNum = 10;
        int count =0;
        char[] word = {'1','a','e','w','r','t','y','u','i','o','p','s','d',' ',' '};
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer("");
        while (count<8){
            int i = random.nextInt(maxNum);
            stringBuffer.append(word[i]);
            count++;
        }
        String s =stringBuffer.toString();
        System.out.println(s.toUpperCase());
        System.out.println(stringBuffer.toString());
    }
}
