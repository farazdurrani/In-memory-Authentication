package com.example.secure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	/**
	 * Just by using spring boot security starter, it gives us a login dialog box
	 * automatically. We don't want to use login dialog box, we want to see a login
	 * page. Below method will add a login page. And since we won't be validating user ourselves,
	 * and since login is configured in SecurityConfig, Spring
	 * will automatically take care of validating user. 
	 * Since login page is a just a view, below method will do it for us.
	 * In other words, when a controller doesn't populate a model, or process input, below method does it for us.
	 * It simply forwards the request the a view.
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home");
		registry.addViewController("/login");
	}

}
