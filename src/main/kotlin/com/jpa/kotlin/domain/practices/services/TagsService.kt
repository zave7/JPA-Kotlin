package com.jpa.kotlin.domain.practices.services

import com.jpa.kotlin.domain.practices.dtos.requests.ReqPostTag
import com.jpa.kotlin.domain.practices.dtos.responses.ResTag
import com.jpa.kotlin.domain.practices.entities.Tags
import com.jpa.kotlin.domain.practices.repositories.TagsRepository
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class TagsService(val tagsRepository: TagsRepository) {

    fun getTags() : List<ResTag> {
        return tagsRepository.findAll(Sort.by(Sort.Direction.ASC, Tags.COL_NAME))
            .map(::ResTag)
    }

    fun postTag(reqPostTag: ReqPostTag) : List<ResTag> {
        tagsRepository.save(reqPostTag.toEntity())
        return this.getTags()
    }

    fun deleteTags() : List<ResTag> {
        tagsRepository.deleteAll()
        return listOf()
    }
}