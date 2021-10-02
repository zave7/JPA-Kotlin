package com.jpa.kotlin.domain.practices.controller

import com.jpa.kotlin.domain.practices.dtos.requests.ReqPostBook
import com.jpa.kotlin.domain.practices.dtos.responses.ResBook
import com.jpa.kotlin.domain.practices.services.BooksService
import javax.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books")
class BookController(private val booksService: BooksService) {

    @GetMapping
    fun getBooks() : List<ResBook> {
        return booksService.getBooks()
    }

    @PostMapping
    fun postBook(@RequestBody @Valid reqPostBook: ReqPostBook) : List<ResBook> {
        return booksService.postBook(reqPostBook)
    }

    @DeleteMapping
    fun deleteBooks() : List<ResBook> {
        return booksService.deleteBooks()
    }

}