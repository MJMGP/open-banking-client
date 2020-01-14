package au.com.mjmgp.openbankingclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenBankingClientApplication

fun main(args: Array<String>) {
	runApplication<OpenBankingClientApplication>(*args)
}
