package com.example

import java.util.*
import javax.annotation.PostConstruct
import javax.inject.Singleton

@Singleton
class MemoryBomb {

    lateinit var uuid: UUID
    var memoryBombString : String = ""

    @PostConstruct
    fun postConstruct(){
        uuid = UUID.randomUUID()
        //just create some memory consuming data
        memoryBombString = (1..1000000).joinToString("abcdefghijklmnopqrstuvwxyz_")

    }


}