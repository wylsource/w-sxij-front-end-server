package com.lywu.sxij;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@EnableZuulProxy
@Configuration
public class ApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	/**
	 * 配置带用户名密码访问Eureka(与 Eureka 设置的用户名密码一致)
	 * @return
	 */
	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("admin", "admin");
	}

//	@Bean
//	public AuthenPreFilter authenPreFilter(){
//		return new AuthenPreFilter();
//	}
//
//	@Bean
//	public AuthenPostFilter authenPostFilter() {
//		return new AuthenPostFilter();
//	}
}
