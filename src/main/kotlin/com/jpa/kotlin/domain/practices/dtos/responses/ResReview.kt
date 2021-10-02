package com.jpa.kotlin.domain.practices.dtos.responses

import com.jpa.kotlin.domain.practices.entities.Reviews

data class ResReview(
    private val review: Reviews
) {
    val id: Long = review.id
    val content: String = review.content
    val bookId: Long = review.bookId
}