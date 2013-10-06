package com.sevenlist.restplayground.resource

import com.sevenlist.restplayground.domain.Person
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

import static org.springframework.web.bind.annotation.RequestMethod.POST

@Controller
@RequestMapping('/persons')
class PersonResource {

    @RequestMapping(method = POST)
    @ResponseBody
    String createPerson(@RequestBody Person person) {
        person
    }
}
