package org.aalbatross.learn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
object App extends SpringBootServletInitializer {

  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[App])
  }
}
