package com.hendisantika.repo

import com.hendisantika.model.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by hendisantika on 6/30/17.
 */
@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(lastName: String): Iterable<Customer>
}