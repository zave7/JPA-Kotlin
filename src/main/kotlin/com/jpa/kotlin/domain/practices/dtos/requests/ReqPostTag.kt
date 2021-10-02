package com.jpa.kotlin.domain.practices.dtos.requests

import com.jpa.kotlin.domain.practices.entities.Tags
import javax.validation.constraints.NotNull

data class ReqPostTag(
    @NotNull
    var name: String
) {
    fun toEntity() :Tags {
        return Tags(name = name)
    }
}