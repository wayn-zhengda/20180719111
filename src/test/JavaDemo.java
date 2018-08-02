import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public void stringSpilt(){
        String str = "www.upupoo.com";
        String delimeter = "\\.";
        String[] temp ;
        temp = str.split(delimeter);
        for (String x : temp){
            System.out.println(x);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str,".");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }

    @Test
    public void arraySort(){
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        List list = Arrays.asList("a,s,x,xs,a,z,z");
        System.out.println(list.get(0));
    }

    @Test
    public void dataDemo(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
    }

    @Test
    public void printArray(){
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        for (Double d : doubleArray){
            System.out.printf("%s",d);
            System.out.println();
        }
    }

    @Test
    public void testContinue(){
        StringBuffer searchstr = new StringBuffer("hello how are you. ");
        int length = searchstr.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchstr.charAt(i) == 'h'){
            count++;
            System.out.println(searchstr.charAt(i));
            searchstr.setCharAt(i, 'H');
        }}
        System.out.println("发现 " + count
                + " 个 h 字符");
        System.out.println(searchstr);
    }

    @Test
    public void testVarargs(){
        int sum = sumVarargs(1,2,2,4);
        System.out.println(sum);
    }

    static int sumVarargs(int... ints){
        int sum = 0;
        for (int i : ints){
            sum += i;
        }
        return sum;
    }

    @Test
    public void printDiamond(){
        int x = 5;
        int y = 1;
        for (int s = 0;s<5;s++) {
            for (int i = 0; i < x; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            x -=1;
            y +=2;
            System.out.println();
        }

        for (int s = 0;s<5;s++) {
            x +=1;
            y -=2;
            for (int i = 0; i < x; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
