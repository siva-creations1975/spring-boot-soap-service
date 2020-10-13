package com.example.howtodoinjava.springbootsoapservice;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/cazana-service/*");
	}

	@Bean(name = "studentDetailsWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("StudentDetailsPort");
		wsdl11Definition.setLocationUri("/service/student-details");
		wsdl11Definition.setTargetNamespace("http://www.example.com/xml/school");
		wsdl11Definition.setSchema(schema);
		return wsdl11Definition;
	}
	
	@Bean(name = "vehicleValuationWsdl")
	public DefaultWsdl11Definition defaultVehicleValuationWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("VehicleValuationPort");
		wsdl11Definition.setLocationUri("/service/vehicle/valuation");
		wsdl11Definition.setTargetNamespace("http://schemas.datacontract.org/2004/07/IntegrationServiceLayer.Services.Entities.CazanaVehicleValuationLookup");
		wsdl11Definition.setSchema(schema);
		return wsdl11Definition;
	}
	
	/*
	 * @Bean public XsdSchema cazanaServiceSchema() { return new SimpleXsdSchema(new
	 * ClassPathResource("school.xsd,cazana_service.xsd")); }
	 */

	/*
	 * @Bean public XsdSchema studentSchema() { return new SimpleXsdSchema(new
	 * ClassPathResource("school.xsd")); }
	 */
	
	
	  @Bean public XsdSchema vehicleValuationSchema() { return new
	  SimpleXsdSchema(new ClassPathResource("cazana_service.xsd")); }
	 
}