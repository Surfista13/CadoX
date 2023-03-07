package com.example.cadox.repository

import com.example.cadox.bo.Article
import com.example.cadox.dao.DAOFactory

class ArticleRepository {

    val instance = DAOFactory.Factory.createArticleDAO();
    val liste: Article = instance.selectById(10);

}