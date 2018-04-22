package daggerok

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexPage {

  @GetMapping(path = ["", "/", "/404", "/index"])
  fun index() = "index"
}

@SpringBootApplication
class App

fun main(args: Array<String>) {
  runApplication<App>(*args)
}
