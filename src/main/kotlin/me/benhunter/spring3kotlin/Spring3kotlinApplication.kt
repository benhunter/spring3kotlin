package me.benhunter.spring3kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Spring3kotlinApplication

fun main(args: Array<String>) {
	runApplication<Spring3kotlinApplication>(*args)
}
