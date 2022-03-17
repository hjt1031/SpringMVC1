package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {
    // 다형성을 위해 생성
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    // 여긴 void자나 그러닌깐 받든 안받든
    // return이 없지만

}
