package com.example.apis

import android.content.Context
import android.os.Bundle
import android.os.ParcelFileDescriptor
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.apis.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var mBinding: FragmentFirstBinding
    lateinit var productName:String
    lateinit var productDescription:String
    lateinit var productPrice:String
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        mBinding = FragmentFirstBinding.inflate(layoutInflater)

        

        productName = mBinding.productName.text.toString()
        productDescription = mBinding.productDescription.text.toString()
        productPrice = mBinding.productPrice.text.toString()

        mBinding.productNameTv.text = productName
        mBinding.productPriceTv.text = productPrice
        mBinding.productDescriptionTv.text = productDescription


        mBinding.save.setOnClickListener {

            productName = mBinding.productName.text.toString()
            productDescription = mBinding.productDescription.text.toString()
            productPrice = mBinding.productPrice.text.toString()

            mBinding.productNameTv.text = productName
            mBinding.productPriceTv.text = productPrice
            mBinding.productDescriptionTv.text = productDescription

        }


        return mBinding.root
    }






}
