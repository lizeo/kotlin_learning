package pl.corp.wyrwas.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration

@EntityScan(basePackages = arrayOf("pl.corp.wyrwas"))
@EnableJpaRepositories(basePackages = arrayOf("pl.corp.wyrwas"))
class JpaConfig {
}