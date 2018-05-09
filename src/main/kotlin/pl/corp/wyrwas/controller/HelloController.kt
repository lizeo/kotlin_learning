package pl.corp.wyrwas.controller

import io.swagger.annotations.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import pl.corp.wyrwas.Something
import pl.corp.wyrwas.model.PersonalData
import pl.corp.wyrwas.model.User
import pl.corp.wyrwas.repository.UserRepository

@RestController
class HelloController {

    @ApiOperation(value = "getGreeting", notes="get greeting",nickname = "getGreeting")
    @ApiResponses(value = [ApiResponse(code = 200, message = "Nice")])
    @RequestMapping(method = [RequestMethod.POST], value = "/api/javainuse")
    fun sayHello(@ApiParam(value = "testId", required = false, defaultValue = "Dawid")
                 @RequestParam("iID") institutuionId : String) : List<Hello> {
        val hello = ArrayList<Hello>()
        hello.add(Hello("hello", "$institutuionId"))
        main()
        return hello
    }

    @Autowired
    lateinit var userRepo: UserRepository

    @GetMapping(value = "/kopyta")
    fun main() {
        val something = Something()
        val personalData = PersonalData("", "", "")
        val user = User(1, personalData, ArrayList())

        userRepo.save(user)
    }

}

@ApiModel
data class Hello(@ApiModelProperty(position = 1, required = false, value = "Hello ") val hello: String = "Hello ",
                 @ApiModelProperty(position = 2, required = false, value = "Stefan") val name : String = "Stefan") {
    override fun toString(): String {
        return "$hello $name"
    }
}