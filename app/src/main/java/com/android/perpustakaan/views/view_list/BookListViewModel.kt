package com.android.perpustakaan.views.view_list

import com.android.perpustakaan.data.data_model.Book

class BookListViewModel (
    private val items : List<Book>,
    private val clickListener :OnItemClicklistener
):
