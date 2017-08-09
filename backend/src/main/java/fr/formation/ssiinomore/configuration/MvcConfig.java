package fr.formation.ssiinomore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import fr.formation.ssiinomore.security.SecurityConfiguration;
 
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "fr.formation.ssiinomore.controller.ws", "fr.formation.ssiinomore.service" })
@EnableJpaRepositories(basePackages = {"fr.formation.ssiinomore.dao"})
@Import({ SecurityConfiguration.class })
public class MvcConfig extends WebMvcConfigurerAdapter {
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    	LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
    	lcemfb.setPersistenceUnitName("ssiinomore");
    	return lcemfb;
    }
    
    @Bean
    public PlatformTransactionManager transactionManager() {
    	PlatformTransactionManager tm = new JpaTransactionManager(this.entityManagerFactory().getObject());
    	return tm;
    }
 
    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
        resource.setBasename("classpath:message");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }
 
}