package com.vdzon.speeltuin

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/contacts")
class ContactController {
    private val contacts = mutableListOf<String>()

    @GetMapping
    fun getContacts(): List<String> = contacts

    @PostMapping
    fun addContact(@RequestBody name: String) {
        contacts.add(name)
    }
}
