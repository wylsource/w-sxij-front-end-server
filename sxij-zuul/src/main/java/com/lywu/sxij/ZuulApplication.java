package com.lywu.sxij;

import com.lywu.sxij.filter.AuthenPostFilter;
import com.lywu.sxij.filter.AuthenPreFilter;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@EnableZuulProxy
@Configuration
public class ZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
	public AuthenPreFilter authenPreFilter(){
		return new AuthenPreFilter();
	}

	@Bean
	public AuthenPostFilter authenPostFilter() {
		return new AuthenPostFilter();
	}
}
