package com.example.thirdpartylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import `is`.arontibo.library.ElasticDownloadView
import android.view.View
import com.example.thirdpartylibrary.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var mElasticDownloadView: ElasticDownloadView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mElasticDownloadView = binding.elasticDownloadView
        //mElasticDownloadView.setProgress(25F)

    }

    fun start(view: View) {
        mElasticDownloadView.startIntro()
    }

    fun success(view: View) {
        mElasticDownloadView.success()
    }

    fun field(view: View) {
        mElasticDownloadView.fail()
    }
}