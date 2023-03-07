package com.example.cadox.dao

import com.example.cadox.bo.Article

interface ArticleDAO {

    fun selectById(id:Long):Article;

}