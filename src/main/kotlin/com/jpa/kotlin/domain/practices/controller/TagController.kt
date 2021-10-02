package com.jpa.kotlin.domain.practices.controller

import com.jpa.kotlin.domain.practices.dtos.requests.ReqPostTag
import com.jpa.kotlin.domain.practices.dtos.responses.ResTag
import com.jpa.kotlin.domain.practices.services.TagsService
import javax.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tags")
class TagController(private val tagsService: TagsService) {

    @GetMapping
    fun getTags() : List<ResTag> {
        return tagsService.getTags()
    }

    @PostMapping
    fun postTags(@RequestBody @Valid reqPostTag: ReqPostTag) : List<ResTag> {
        return tagsService.postTag(reqPostTag)
    }

    @DeleteMapping
    fun deleteTags() : List<ResTag> {
        return tagsService.deleteTags()
    }
}