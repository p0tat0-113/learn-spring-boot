package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

//currency-service.url 등이 제대로 설정되었는지 확인해보기 위해 간단한 컨트롤러를 만들었다.

@RestController
public class CurrencyConfigurationController {
    @Autowired//CurrencyServiceConfiguration를 스프링 빈으로 등록했기 때문에 AutoWired된다.
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration CurrencyServiceConfiguration() {
        return configuration;
    }
}
