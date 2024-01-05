package com.example.recyclerviewkt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profileList = arrayListOf(
            Profiles(R.drawable.photo, "홍길동", 99, "조선시대 로빈후드")
            ,Profiles(R.drawable.photo2, "홍반장", 98, "어떤 동네 반장")
            ,Profiles(R.drawable.photo, "홍길동1", 97, "조선시대 로빈후드1")
            ,Profiles(R.drawable.photo2, "홍길동2", 96, "조선시대 로빈후드2")
            ,Profiles(R.drawable.photo, "홍길동3", 95, "조선시대 로빈후드3")
            ,Profiles(R.drawable.photo2, "홍길동4", 94, "조선시대 로빈후드4")
            ,Profiles(R.drawable.photo, "홍길동5", 93, "조선시대 로빈후드5")
            ,Profiles(R.drawable.photo2, "홍길동6", 92, "조선시대 로빈후드6")
            ,Profiles(R.drawable.photo, "홍길동7", 91, "조선시대 로빈후드7")
            ,Profiles(R.drawable.photo2, "홍길동8", 90, "조선시대 로빈후드8")
            ,Profiles(R.drawable.photo, "홍길동9", 89, "조선시대 로빈후드9")
            ,Profiles(R.drawable.photo2, "홍길동10", 88, "조선시대 로빈후드10")
        )

        binding.rvProfile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProfile.setHasFixedSize(true)
        binding.rvProfile.adapter = ProfileAdapter(profileList)


    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }

}