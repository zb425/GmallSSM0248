import org.springframework.util.DigestUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Test {
    public static void main(String[] args) {
        /*HttpServletRequest httpServletRequest = null;
        Cookie[] cookies = httpServletRequest.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getValue());
        }*/

        System.out.println(DigestUtils.md5DigestAsHex("123456789".getBytes()));
    }
}
