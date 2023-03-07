package com.example.cadox.dao.memory

import com.example.cadox.bo.Article
import com.example.cadox.dao.ArticleDAO

private lateinit var articlesInMemory:MutableList<Article>;

class ArticleDAOMemoryImpl : ArticleDAO  {
    override fun selectById(id: Long): Article {
        TODO("Not yet implemented")
    }


}