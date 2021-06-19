package com.rana.tasks_get_my_task.DI

import com.squareup.moshi.Moshi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val SERVER_URL =("http://5.9.120.72:4999/api\u200B/Tasks\u200B/GetMyTasks")
val networkModule = module {
    single { retrofit(SERVER_URL, get()) }
    single { moshi() }
}

private fun moshi(): Moshi {
    return Moshi.Builder()
        .build()
}


fun retrofit(baseUrl: String, moshi: Moshi): Retrofit {
    return Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
}