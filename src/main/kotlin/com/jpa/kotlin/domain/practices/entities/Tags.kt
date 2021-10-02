package com.jpa.kotlin.domain.practices.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = Tags.TABLE_NAME)
data class Tags(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COL_ID)
    val id: Long = 0,

    @Column(name = COL_NAME)
    var name: String = ""
) {
    companion object {
        const val TABLE_NAME = "Tags"
        const val COL_ID = "id"
        const val COL_NAME = "name"
    }

}