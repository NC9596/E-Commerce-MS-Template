package com.shr.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author sagar.hr
 *
 * @apiNote Swagger Configuration class for the swagger HTML page for the API
 *          Testing.
 *          
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.shr.controller")).build()
				.useDefaultResponseMessages(true).apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		Contact contact = new Contact("POC_E-Commerce_Product", "https:://www.eshopping.com/product",
				"hrsagar1712@gmail.com");
		return new ApiInfo("Order API", "Gives Access to Product Management", "3.4.RELEASE",
				"http://www.eshopping.com/license", contact, "GNU Public", "http://apache.org/license/gnu",
				Collections.emptyList());
	}
}
