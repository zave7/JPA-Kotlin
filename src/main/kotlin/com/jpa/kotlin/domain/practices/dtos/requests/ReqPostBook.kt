package com.jpa.kotlin.domain.practices.dtos.requests

import com.jpa.kotlin.domain.practices.entities.Books
import javax.validation.constraints.NotNull

data class ReqPostBook(
    @NotNull
    var title: String,
    @NotNull
    var author: String
) {
    fun toEntity(): Books {
        return Books(
            title = title,
            author = author
        )
    }
}
