package org.hikit

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration

@SpringBootApplication(exclude = [MongoAutoConfiguration::class])
open class Main {

    companion object{
        private val LOGGER: Logger = LoggerFactory.getLogger(Main::class.java)
        private val LOGO = "Hikit OSM"

        @JvmStatic
        fun main(args: Array<String>) {
            val backend = SpringApplication(Main::class.java)
            backend.setBannerMode(Banner.Mode.OFF)
            backend.run(*args)
            LOGGER.info(LOGO)
        }
    }

}