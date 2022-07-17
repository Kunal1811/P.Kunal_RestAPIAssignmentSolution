package com.greatlearning.employeemanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
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
	public Docket employeeManagerApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.groupName("Employee_Manager-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.greatlearning.employeemanager.controller")).build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Employee_Manager API")
				.description("Employee Manager API reference for developers")
				.termsOfServiceUrl("http://fakelibrary.com")
				.contact(new Contact("Employee_Manager API", "http://fakelibrary.com", "fakelibrary@gmail.com"))
				.license("Employee Manager admin license")
				.licenseUrl("http://fakelibrary.com")
				.version("1.0")
				.build();
						
	}
}
