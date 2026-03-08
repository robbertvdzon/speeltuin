package com.vdzon.speeltuin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ContactControllerTest {

    @Autowired
    lateinit var contactController: ContactController

    @Test
    fun `should add and get contacts`() {
        contactController.addContact("Jan")
        assertEquals(listOf("Jan"), contactController.getContacts())

        contactController.addContact("Piet")
        assertEquals(listOf("Jan", "Piet"), contactController.getContacts())
    }
}
