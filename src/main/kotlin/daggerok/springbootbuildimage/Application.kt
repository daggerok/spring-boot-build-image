package daggerok.springbootbuildimage

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    val logger = LoggerFactory.getLogger(Application::class.java)
    val context = runApplication<Application>(*args)
    val greetings = context.getBean<Greetings>()
    val result = greetings.hello(*args)
    logger.info("Result: {}", result)
}

@Service
class Greetings {
    fun hello(vararg names: String = arrayOf()): String {
        val namesToGreet = names.filterNot(String::isEmpty).toList()
            .takeIf { it.isNotEmpty() }
            ?: listOf("Anonymous")
        val everyone =
            if (namesToGreet.size > 1) namesToGreet.subList(0, namesToGreet.size - 1).joinToString() + " and " + namesToGreet.last()
            else namesToGreet.joinToString()
        return "Hello, $everyone!"
    }
}
