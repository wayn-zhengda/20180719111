package valuetest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@Configuration
@PropertySource("classpath:*.properties")
public class AppConfig {
    @Value("sssss")
    private String url;
    @Value("zzzzzz")
    private String userName;
    @Value("xxxxxx")
    private String password;
    @Value("${jdbc_url}")
    private String url1;

    public void outSource()
    {
        System.out.println(url);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(url1);
        Arrays.asList("1 2 3 4 5 6".split(" "));
    }
}
