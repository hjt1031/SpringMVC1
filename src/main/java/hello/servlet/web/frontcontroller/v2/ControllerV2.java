package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    //process라는 메소드의 반환형이 MyView닌깐 Myview 받아야지 응응

    //    public static String 메소드명칭 하면
    // ㅇㅇ 마자 final은 변수에 쓰는 상수 잘못씀
    //    public은 접근제어자, static은 바로 메모리에 올릴껀지 String이 이제 반황형
    // 여기는 반환형이 MyView닌깐 받을려면 return 된게 MyView닌깐 MyView로 받아야지

}
