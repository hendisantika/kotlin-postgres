package com.hendisantika.controller

import com.hendisantika.model.Customer
import com.hendisantika.repo.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by hendisantika on 6/30/17.
 */
@RestController
class WebController {
    @Autowired
    lateinit var repository: CustomerRepository

    @RequestMapping("/save")
    fun save(): String {
        repository.save(Customer("Hendi", "Santika"))
        repository.save(Customer("Uzumaki", "Naruto"))
        repository.save(Customer("Uchiha", "Sasuke"))
        repository.save(Customer("Haruno", "Sakura"))
        repository.save(Customer("Hatake", "Kakashi"))

        return "Done"
    }

    @RequestMapping("/findAll")
    fun findAll() = repository.findAll()

    @RequestMapping("/findById/{id}")
    fun findById(@PathVariable id: Long)
            = repository.findOne(id)

    @RequestMapping("findByLastname/{lastName}")
    fun findByLastName(@PathVariable lastName: String)
            = repository.findByLastName(lastName)
}