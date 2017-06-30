package com.hendisantika

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinPostgresqlApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinPostgresqlApplication::class.java, *args)
}
