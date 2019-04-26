package com.android.perpustakaan.data.data_net

import com.android.perpustakaan.data.data_model.Book

class BookListInfo {
    companion object {
        var bookList = initBooklist

        private fun initBooklist() : MutableList<Book>{
            var po_book = mutableListOf<Book>()
            po_book.add(
                Book(
                    "Buku 1",
                    "arman",
                    "haha",
                    1
                ))
            po_book.add(
                Book(
                    "Buku 2",
                    "arman",
                    "hehe",
                    2

            ))
            return po_book
        }
    }
}