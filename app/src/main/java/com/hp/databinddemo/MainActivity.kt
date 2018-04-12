package com.hp.databinddemo

import android.databinding.DataBindingUtil.setContentView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.hp.databinddemo.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var user: User
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_main)
        user = User("张三", 25)
        binding.user = user
        binding
//        binding.event = Event(user)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.login -> {
//                var name = editText.text.toString()
//                var age = editText2.text.toString().toInt()
//                user = User(name, age)
//                binding.user =  user
                Toast.makeText(this, "登录成功", Toast.LENGTH_LONG).show()
            }

        }
    }


}

