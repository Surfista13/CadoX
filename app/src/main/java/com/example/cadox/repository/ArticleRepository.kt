package com.example.cadox.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.cadox.bo.Article
import com.example.cadox.dao.DAOFactory
import com.example.cadox.dao.DAOType
import java.time.LocalDate

class ArticleRepository {

    val instance = DAOFactory.Factory.createArticleDAO(DAOType.MEMORY);
    @RequiresApi(Build.VERSION_CODES.O)
    fun getArticle(id:Long):Article {
        val article : Article = instance.selectById(1)
        return article
    };
}