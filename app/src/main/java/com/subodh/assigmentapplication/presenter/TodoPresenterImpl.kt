package com.subodh.assigmentapplication.presenter

import com.subodh.assigmentapplication.model.Todo
import com.subodh.assigmentapplication.network.NetworkService
import com.subodh.assigmentapplication.repository.GetPosts
import io.reactivex.Observable

class TodoPresenterImpl :TodoPresenter{
    val getPosts:GetPosts = NetworkService.getPosts

    override fun getTodos(): Observable<List<Todo>> {
        return getPosts.getPosts()
    }
}