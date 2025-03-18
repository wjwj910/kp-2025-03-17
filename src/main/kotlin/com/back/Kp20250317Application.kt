package com.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class Kp20250317Application

fun main(args: Array<String>) {
    runApplication<Kp20250317Application>(*args)
}
