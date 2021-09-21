package com.subodh.assigmentapplication.repository

import com.subodh.assigmentapplication.model.Comment
import com.subodh.assigmentapplication.model.Todo
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path


interface GetPosts {
    /**
     * List Posts from jsonplaceholder.com
     * @return list of Posts
     */
    @GET("posts")
    fun getPosts() : Observable<List<Todo>>

    /**
     * List Contributors of Comments
     * @param postId post id
     * @return Comments for post
     */
    @GET("posts/{post_id}/comments")
    fun getComments(
        @Path("post_id") postId: String
    ): Observable<List<Comment>>

}