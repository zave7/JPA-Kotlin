package com.jpa.kotlin.domain.practices.dtos.responses

import com.jpa.kotlin.domain.practices.entities.Books
import com.jpa.kotlin.domain.practices.entities.Reviews

data class ResBook(
    private val book: Books
) {
    val id: Long = book.id
    val title: String = book.title
    val author: String = book.author
    val reviews: List<Reviews> = book.reviews
}
