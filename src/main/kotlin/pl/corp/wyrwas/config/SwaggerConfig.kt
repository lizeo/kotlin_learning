package pl.corp.wyrwas.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import com.google.common.base.Predicate

import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import springfox.documentation.builders.PathSelectors.regex
import com.google.common.base.Predicates.or
import com.google.common.collect.ImmutableList
import org.springframework.context.annotation.Import
import org.springframework.web.bind.annotation.RequestMethod
import springfox.documentation.builders.ResponseMessageBuilder
import springfox.documentation.schema.ModelRef
import kotlin.reflect.KClass

@Configuration
@EnableSwagger2
@Import(value = [Class.forName("springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration")] as Array<out KClass<*>>)
open class SwaggerConfig {

    @Bean
    open fun postsApi(): Docket {
        val docket = Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build()
        docket.globalResponseMessage(RequestMethod.GET, ImmutableList.of(
                ResponseMessageBuilder().code(400).message("Bad Request").responseModel(ModelRef("Error")).build(),
                ResponseMessageBuilder().code(500).message("Internal Server Error").responseModel(ModelRef("Error")).build()))
        return docket
    }

    private fun postPaths(): Predicate<String> {
        return regex("/*")
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder().title("JavaInUse API")
                .description("JavaInUse API reference for developers")
                .termsOfServiceUrl("http://javainuse.com")
                .contact("javainuse@gmail.com").license("JavaInUse License")
                .licenseUrl("javainuse@gmail.com").version("1.0").build()
    }

}