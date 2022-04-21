package com.example.apis

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.LiveData
import com.example.apis.databinding.ActivityMainBinding
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
class MainActivity : AppCompatActivity() {


    lateinit var mBinding: ActivityMainBinding
    private lateinit var mRetrofit: Retrofit
    private lateinit var a: LiveData<Int>

    var array: Array<String> = arrayOf("nemo", "anna", "elsa", "arial", "alis", "dorry")
    lateinit var word:String


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


        mBinding.find.setOnClickListener {

            word = mBinding.wordEditText.text.toString()

            Observable.just(array,word)
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    for(i in array){
                        if(i == word){
                            mBinding.result.text = i
                            break
                        }
                        mBinding.result.text = "Error 404"
                    }
                },
                {
                    Toast.makeText(this,"something went wrong",Toast.LENGTH_LONG).show()
                },
                {
                    Toast.makeText(this,"process successful completed",Toast.LENGTH_LONG).show()
                })
        }



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