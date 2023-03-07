package com.example.cadox.bo

import java.time.LocalDate

data class Article (var id:Long,var intitule:String,var description:String,var prix:Double,var niveau:Byte,var url:String?=null,var achete:Boolean=false,var dateAchat:LocalDate?=null) {
}