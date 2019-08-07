package org.sakaiproject.core.endpoints;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "org.sakaiproject.core")
@EnableJpaRepositories(basePackages = "org.sakaiproject.core.persistence")
public class Core {
}
