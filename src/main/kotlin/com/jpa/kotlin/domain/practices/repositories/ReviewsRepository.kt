package com.jpa.kotlin.domain.practices.repositories

import com.jpa.kotlin.domain.practices.entities.Reviews
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewsRepository : JpaRepository<Reviews, Long>{
}