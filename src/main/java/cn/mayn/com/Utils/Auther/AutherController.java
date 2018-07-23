package cn.mayn.com.Utils.Auther;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wxlogin")
public class AutherController {
    AuthUtil authUtil = new AuthUtil();
    String wxUrl = "https://open.weixin.qq.com/connect/qrconnect?" +
            "appid=APPID" +
            "&redirect_uri=REDIRECT_URI" +
            "&response_type=code" +
            "&scope=snsapi_login" +
            "&state=STATE#wechat_redirect";
    String backUrl = "";
}
