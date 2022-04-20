package com.example.apis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.apis.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {


    lateinit var mBinding: ActivityMainBinding
    private lateinit var mRetrofit: Retrofit
    private lateinit var a: LiveData<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val db = Room.databaseBuilder(applicationContext,)

//
//        mRetrofit = Retrofit
//            .Builder()
//            .baseUrl("https://api.mulum.pk/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//    }
//
//    val service = mRetrofit
//        .create(Service::class.java)
//        .fetchSuppliers("7887").enqueue(object : Callback<Response>{
//            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onFailure(call: Call<Response>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//        })
    }

}