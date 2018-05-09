package pl.corp.wyrwas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ShareIt

fun main(args: Array<String>) {
    runApplication<ShareIt>(*args)

}