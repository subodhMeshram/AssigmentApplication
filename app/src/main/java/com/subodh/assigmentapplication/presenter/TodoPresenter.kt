package com.subodh.assigmentapplication.presenter

import com.subodh.assigmentapplication.model.Todo
import io.reactivex.Observable

interface TodoPresenter {
    fun getTodos(): Observable<List<Todo>>
}