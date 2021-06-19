package com.rana.tasks_get_my_task.app

import coil.Coil
import coil.ImageLoader
import coil.decode.SvgDecoder
import com.rana.tasks_get_my_task.DI.networkModule
import com.rana.tasks_get_my_task.DI.taskModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class Application : Application() {

    @Override
    override fun onCreate() {
        super.onCreate()

        val imageLoader = ImageLoader.Builder(this).componentRegistry {
            add(SvgDecoder(this@Application))
        }.build()
        Coil.setImageLoader(imageLoader)
        startKoin {
            androidContext(this@Application)
            modules(
                listOf(
networkModule, taskModule
                )
        }

    } }


