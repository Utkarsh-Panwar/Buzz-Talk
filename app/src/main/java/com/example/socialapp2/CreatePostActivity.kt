package com.example.socialapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialapp2.daos.PostDao
import com.example.socialapp2.databinding.ActivityCreatePostBinding



class CreatePostActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityCreatePostBinding
    private lateinit var postDao:PostDao


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        viewBinding= ActivityCreatePostBinding.inflate(layoutInflater)
        setContentView( viewBinding.root)

        postDao= PostDao()
        viewBinding.postButton.setOnClickListener {
            val input=viewBinding.postInput.text.toString().trim()
            if(input.isNotEmpty()){

            postDao.addPost(input)
                finish()

            }
        }

    }
}