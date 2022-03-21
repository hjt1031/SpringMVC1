package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// 스프링이 자동으로 스프링 빈으로 등록한다.
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }
}

/**
 * RequestMappingHandlerMapping 은 스프링 빈 중에서 @RequestMapping 또는 @Controller(상위에 @Compnent가 있음)
 * 가 클래스 레벨에 붙어 있는 경우에 매핑 정보로 인식한다.
 */