package com.jpa.kotlin.domain.practices.dtos.responses

import com.jpa.kotlin.domain.practices.entities.Tags

data class ResTag(
    private val tag: Tags
) {
    val id: Long = tag.id
    val name: String = tag.name
}