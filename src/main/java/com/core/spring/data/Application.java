package com.core.spring.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/** Spring Boot auto-configuration attempts to automatically configure your Spring application based on the 
jar dependencies that you have added. For example, If HSQLDB is on your classpath, and you have not manually 
configured any database connection beans, then we will auto-configure an in-memory database.

You need to opt-in to auto-configuration by adding the @EnableAutoConfiguration or @SpringBootApplication 
annotations to one of your @Configuration classes.


You should only ever add one @EnableAutoConfiguration annotation. We generally recommend that you add 
it to your primary @Configuration class */




@Configuration
@SpringBootApplication
@EnableJpaRepositories
/**Spring Boot auto-configures a suitable CacheManager according to the implementation as
 * long as the caching support is enabled via the @EnableCaching annotation. 
 * */

/** Add @EnableCaching annotation in the spring boot configuration class. This annotation is the indicator for enabling
 *  the caching mechanism in your application.Next step is to add the required libraries in the classpath. If you 
 *  are using the ehcache as the cache implementation, then add the dependency to the POM.xml file.Next step is to 
 *  add the configuration file for the cache provider. If you are using the ehcache, the add the ehcache.xml at 
 *  the root of the classpath.you have to enable caching by @Cacheable  */


@EnableCaching
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}



 
