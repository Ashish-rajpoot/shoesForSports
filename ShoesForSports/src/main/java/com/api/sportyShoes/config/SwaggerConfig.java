package com.api.sportyShoes.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket superHeroApiDoc() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.paths(PathSelectors.ant("/admin/**"))
				.apis(RequestHandlerSelectors.basePackage("com.api.sportyShoes")).build()
				.apiInfo(new ApiInfo("Shoes for Sports",
						"api for Buy Sports Shoes",
						"1.0.0",
						"Always buy the good product for sports",
						new Contact("ME", "https://www.linkedin.com/company/simplilearn", "simplilearn@gmail.com"),
						"Standard API License",  "www.simplilearn.com",Collections.emptyList()));
	}	
}
