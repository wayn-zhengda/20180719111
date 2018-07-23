package cn.mayn.com.Utils.Auther;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class AuthUtil {

    public static JSONObject doGetJson(String url){
        JSONObject jsonObject = null;
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        try {
            HttpResponse response = client.execute(httpGet);
            HttpEntity httpEntity = response.getEntity();
            if (httpEntity != null){
                String result = EntityUtils.toString(httpEntity,"UTF-8");
                jsonObject = JSONObject.parseObject(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        httpGet.releaseConnection();
        return jsonObject;
    }
}
