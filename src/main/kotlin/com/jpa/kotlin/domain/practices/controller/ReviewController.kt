package com.jpa.kotlin.domain.practices.controller

import com.jpa.kotlin.domain.practices.dtos.requests.ReqPostReview
import com.jpa.kotlin.domain.practices.dtos.responses.ResReview
import com.jpa.kotlin.domain.practices.services.ReviewsService
import javax.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/reviews")
class ReviewController(private val reviewsService: ReviewsService) {

    @GetMapping("/{bookId}")
    fun getReviews(@PathVariable("bookId") bookId: Long) : List<ResReview> {
        return reviewsService.getReviews()
    }

    @PostMapping
    fun postReview(@RequestBody @Valid reqPostReview: ReqPostReview) : List<ResReview> {
        return reviewsService.postReview(reqPostReview)
    }

    @DeleteMapping
    fun deleteReviews() : List<ResReview> {
        return reviewsService.deleteReview()
    }
}