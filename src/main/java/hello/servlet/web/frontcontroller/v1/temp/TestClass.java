package hello.servlet.web.frontcontroller.v1.temp;

import hello.servlet.web.frontcontroller.MyView;

public class TestClass {
    // void닌깐 반환형이 없어서 return 안써도 에러 없지?
    // ㅇㅇ
    public static MyView testMethod() {


        return new MyView("/test");
    }


}
