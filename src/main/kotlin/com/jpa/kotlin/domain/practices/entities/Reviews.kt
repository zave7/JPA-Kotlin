package com.jpa.kotlin.domain.practices.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = Reviews.TABLE_NAME)
data class Reviews(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COL_ID)
    val id: Long = 0,

    @Column(name = COL_CONTENT)
    var content: String = "",

    @Column(name = COL_BOOK_ID)
    var bookId: Long = 0
) {

    companion object{
        const val TABLE_NAME = "Reviews"
        const val COL_ID = "id"
        const val COL_CONTENT = "content"
        const val COL_BOOK_ID = "bookId"
    }


}