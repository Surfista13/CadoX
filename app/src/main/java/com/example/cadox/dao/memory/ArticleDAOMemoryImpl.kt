package com.example.cadox.dao.memory

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.cadox.bo.Article
import com.example.cadox.dao.ArticleDAO
import java.time.LocalDate
import java.util.*

private lateinit var articlesInMemory:MutableList<Article>;

class ArticleDAOMemoryImpl : ArticleDAO  {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun selectById(id: Long): Article {
        val article = Article(1,"Poele","anti-adhesive",56.2,1,"https://developer.android.com/guide/topics/",true,
            LocalDate.now()
        )
    return article
    }
}