package com.android.perpustakaan.views.view_add

import android.app.Application
import android.arch.lifecycle.AndroidViewModel

class AddBookViewModel (application: Application) : AndroidViewModel(application) {
    private val peopleRepository = getApplication<Main>()
}