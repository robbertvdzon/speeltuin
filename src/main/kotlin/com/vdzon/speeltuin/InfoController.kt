package com.vdzon.speeltuin

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/info")
class InfoController {

    @GetMapping
    fun getInfo(): String = "v1.01"

}
