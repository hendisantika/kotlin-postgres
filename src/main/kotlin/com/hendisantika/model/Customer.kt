package com.hendisantika.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by hendisantika on 6/30/17.
 */
@Entity
class Customer(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        val firstName: String,
        val lastName: String) {

    private constructor() : this("", "")
}