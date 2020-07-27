package com.mantabs.app.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.ldap.LdapRepositoriesAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
		exclude = {
				LdapRepositoriesAutoConfiguration.class,
				JpaRepositoriesAutoConfiguration.class
		}
)

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.mantabs.bo", "com.ags.bo", "com.mantabs.app.api"})
public class RestApplication extends SpringBootServletInitializer
{
	private static final Logger log = LoggerFactory.getLogger(RestApplication.class);

	public static void main(String... args) throws Exception
	{
		try {
			SpringApplication.run(RestApplication.class, args);
		} catch (Exception e) {
			log.debug("EXCEPTION : MAIN APPLICATION");
			log.error(e.getMessage());
		}
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestApplication.class);
	}
}
