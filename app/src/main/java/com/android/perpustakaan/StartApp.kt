package com.android.perpustakaan

import android.app.Application
import com.android.perpustakaan.data.BookRepo

class StartApp : Application(){
    fun getBookRepo()= BookRepo(this)
}