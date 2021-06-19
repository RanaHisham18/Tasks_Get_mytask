package com.rana.tasks_get_my_task.Ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rana.tasks_get_my_task.R
import com.rana.tasks_get_my_task.Ui.main.HomeState
import com.rana.tasks_get_my_task.Ui.main.ViewModel
import okhttp3.internal.concurrent.Task

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
