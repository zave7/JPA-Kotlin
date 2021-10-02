package com.jpa.kotlin.domain.practices.entities

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = Books.TABLE_NAME)
data class Books(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COL_ID)
    val id: Long = 0,

    @Column(name = COL_TITLE)
    var title: String = "",

    @Column(name = COL_AUTHOR)
    var author: String = "",

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = Reviews.COL_BOOK_ID)
    var reviews: List<Reviews> = listOf()
) {

    companion object {
        const val TABLE_NAME = "Books"

        const val COL_ID = "id"
        const val COL_TITLE = "title"
        const val COL_AUTHOR = "author"
    }

}
