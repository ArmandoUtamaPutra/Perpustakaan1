package com.android.perpustakaan.data

import android.app.Application
import android.arch.lifecycle.LiveData
import com.android.perpustakaan.data.data_model.Book
import com.android.perpustakaan.data.db_only.BookDAO
import com.android.perpustakaan.data.db_only.BookDb

class BookRepo (application: Application) {
    private val bookDao : BookDAO

    init {
        val bookDatabase= BookDb.getInstance(application)
        bookDao = bookDatabase.bookDao()
    }
    /**
     * menampilkan data tapi secara descending
     */
    fun getAllBook() :LiveData<List<Book>>{
        return bookDao.getAll()
    }
    fun insertBook(book: Book){
        bookDao.insert(book)
    }
    fun findBook(id : Int):LiveData<Book>{
        return bookDao.find(id)

    }
}