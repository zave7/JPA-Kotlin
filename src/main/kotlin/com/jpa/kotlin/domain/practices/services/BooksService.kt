package com.jpa.kotlin.domain.practices.services

import com.jpa.kotlin.domain.practices.dtos.requests.ReqPostBook
import com.jpa.kotlin.domain.practices.dtos.responses.ResBook
import com.jpa.kotlin.domain.practices.entities.Books
import com.jpa.kotlin.domain.practices.repositories.BooksRepository
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class BooksService(private val booksRepository: BooksRepository) {

    fun getBooks() : List<ResBook> {
        return booksRepository.findAll(Sort.by(Sort.Direction.ASC, Books.COL_TITLE))
            .map(::ResBook)
    }

    fun postBook(reqPostBook: ReqPostBook) : List<ResBook> {
        booksRepository.save(reqPostBook.toEntity())
        return this.getBooks()
    }

    fun deleteBooks() : List<ResBook> {
        booksRepository.deleteAll()
        return listOf()
    }
}