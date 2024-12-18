package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//여기에서는 간단한 rest api를 만들어본다.
//스프링 부트를 이용해서 rest api를 만드는 것은 아주 간단하다.
//빈을 정의하거나 xml로 설정할 필요도 없음.
//이제는 이를 위해 스프링 부트 백그라운드에서 무슨 일이 일어나는지 알아볼 것이다.

@RestController
public class CourseController {

    // /courses url 로 접속하면 이 메서드가 실행됨.
    //JSON으로 반환됨.
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "LearnAWS", "dongwoo"),
                new Course(2, "LearnDevOps", "dongwoo"),
                //spring boot devtools를 사용하기 떄문에 코드의 변경이 발생했을 떄 서버를 수동으로 껐다가 켤 필요가 없다.
                new Course(3, "LearnAzure", "dongwoo")
        );
    }
}
