package org.sakaiproject.core.services.grades;

import org.sakaiproject.util.ResourceLoaderMessageSource;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GradesServiceConfig {

    @Bean(name = "org.sakaiproject.core.services.grades.messages")
    public MessageSource messageSource() {
        ResourceLoaderMessageSource messageSource = new ResourceLoaderMessageSource();
        messageSource.setBasename("core.grades");
        return messageSource;
    }
}
