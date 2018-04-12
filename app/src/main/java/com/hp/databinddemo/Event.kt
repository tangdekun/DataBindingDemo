package com.hp.databinddemo

/**
 * Created by tangdekun on 2018/4/12.
 */
class Event(user: User){
    var user:User
    init {
        this.user  = user
    }
    fun onNameTextChanged (s:CharSequence,start:Int, before:Int,  count:Int){
        user.name  = s.toString()

    }
    fun onAgeTextChanged (s:CharSequence,start:Int, before:Int,  count:Int){
        user.age  = s.toString().toInt()

    }
}