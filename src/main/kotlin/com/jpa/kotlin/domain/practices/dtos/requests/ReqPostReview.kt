package com.jpa.kotlin.domain.practices.dtos.requests

import com.jpa.kotlin.domain.practices.entities.Reviews
import javax.validation.constraints.NotNull

data class ReqPostReview(
    @NotNull
    var content: String,
    @NotNull
    var bookId: Long
) {
    fun toEntity() : Reviews {
        return Reviews(
            content = this.content,
            bookId = this.bookId
        )
    }
}