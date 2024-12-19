package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//여기에서는 복잡한 환경 설정을 하는 방법에 대해서 알아볼 것이다. 이런 경우 스프링 부트에서는 이런 ConfigurationProperties 클래스를 만드는 것이 권장된다고 한다.
//currency-service.url
//currency-service.username
//currency-service.key

//이렇게 작성하고 나면 이제 애플리케이션이 이 값들에 대해서 이해하게된다. 설정은 applications.properties에서 하면 됨.
@Component//이것도 Component로 등록한다. 스프링이 자동으로 빈을 생성함.
@ConfigurationProperties(prefix = "currency-service")
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
