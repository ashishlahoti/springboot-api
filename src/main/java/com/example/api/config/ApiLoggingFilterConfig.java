package com.example.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${app.api.logging.enable:true}")
public class ApiLoggingFilterConfig {

	@Value("${app.api.logging.url-patterns}")
	private String[] urlPatterns;
	
	@Value("${app.api.logging.requestIdParamName:requestId}")
	private String requestIdParamName;
	
	@Value("${app.api.logging.requestIdMDCParamName:REQUEST_ID}")
	private String requestIdMDCParamName;
	
	@Bean
	public FilterRegistrationBean<ApiLoggingFilter> loggingFilter() {
	   FilterRegistrationBean<ApiLoggingFilter> registrationBean = new FilterRegistrationBean<>();
	   registrationBean.setFilter(new ApiLoggingFilter(requestIdParamName, requestIdMDCParamName));
	   registrationBean.addUrlPatterns(urlPatterns);
	   return registrationBean;
	}
}
