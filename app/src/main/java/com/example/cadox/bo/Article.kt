package com.example.cadox.bo

import java.time.LocalDate

class Article (var id:Long,var intitule:String,var description:String,var prix:Double,var niveau:Byte,var url:String?,var achete:Boolean=false,var dateAchat:LocalDate?) {

    override fun toString(): String {
        return "Article(id=$id, intitule='$intitule', description='$description', prix=$prix, niveau=$niveau, url=$url, achete=$achete, dateAchat=$dateAchat)"
    }
}