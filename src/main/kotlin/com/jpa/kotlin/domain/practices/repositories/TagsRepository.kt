package com.jpa.kotlin.domain.practices.repositories

import com.jpa.kotlin.domain.practices.entities.Tags
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TagsRepository : JpaRepository<Tags, Long> {
}