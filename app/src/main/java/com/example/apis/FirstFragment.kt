package com.example.apis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import com.example.apis.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var mBinding: FragmentFirstBinding

    private var pName = MutableLiveData(0)
    private var pDescription = MutableLiveData<String>()
    private var pPrice = MutableLiveData<String>()

    lateinit var productName:String
    lateinit var productDescription:String
    lateinit var productPrice:String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        mBinding = FragmentFirstBinding.inflate(layoutInflater)



        mBinding.save.setOnClickListener {

           productName = mBinding.productName.text.toString()
           productDescription = mBinding.productDescription.text.toString()
           productPrice = mBinding.productPrice.text.toString()

           mBinding.productNameTv.text = productName
           mBinding.productDescriptionTv.text = productDescription
           mBinding.productPriceTv.text = productPrice



        }


        pName.observe(viewLifecycleOwner){
            mBinding.productNameTv.text = it.toString()
        }

        pDescription.observe(viewLifecycleOwner){
            mBinding.productDescriptionTv.text = it.toString()
        }

        pPrice.observe(viewLifecycleOwner){
            mBinding.productPriceTv.text = it.toString()
        }

        return mBinding.root


    }

}

