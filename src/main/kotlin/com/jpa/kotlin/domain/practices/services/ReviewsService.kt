package com.jpa.kotlin.domain.practices.services

import com.jpa.kotlin.domain.practices.dtos.requests.ReqPostReview
import com.jpa.kotlin.domain.practices.dtos.responses.ResReview
import com.jpa.kotlin.domain.practices.repositories.ReviewsRepository
import org.springframework.stereotype.Repository

@Repository
class ReviewsService(private val reviewsRepository: ReviewsRepository) {

    fun getReviews() : List<ResReview> {
        return this.reviewsRepository.findAll()
            .map(::ResReview)
    }

    fun postReview(reqPostReview: ReqPostReview) : List<ResReview> {
        this.reviewsRepository.save(reqPostReview.toEntity())
        return this.getReviews()
    }

    fun deleteReview() : List<ResReview> {
        this.reviewsRepository.deleteAll()
        return listOf()
    }
}