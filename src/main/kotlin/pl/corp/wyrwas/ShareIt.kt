package pl.corp.wyrwas

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import pl.corp.wyrwas.model.PersonalData
import pl.corp.wyrwas.model.User
import pl.corp.wyrwas.repository.UserRepository

@SpringBootApplication
@EntityScan(basePackages = arrayOf("pl.corp.wyrwas"))
@EnableJpaRepositories(basePackages = arrayOf("pl.corp.wyrwas"))
class ShareIt

fun main(args: Array<String>) {
    runApplication<ShareIt>(*args)

}

class Something {
    @Autowired
    lateinit var userRepo: UserRepository

    fun main() {

    }
}

