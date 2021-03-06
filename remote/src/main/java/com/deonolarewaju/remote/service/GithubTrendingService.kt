package com.deonolarewaju.remote.service

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query
import com.deonolarewaju.remote.model.ProjectsResponseModel

interface GithubTrendingService {

    @GET("search/repositories")
    fun searchRepositories(@Query("q") query: String,
                           @Query("sort") sortBy: String,
                           @Query("order") order: String): Flowable<ProjectsResponseModel>
}