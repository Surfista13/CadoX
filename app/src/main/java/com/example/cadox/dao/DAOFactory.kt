package com.example.cadox.dao

import com.example.cadox.dao.memory.ArticleDAOMemoryImpl

abstract class DAOFactory {
    object Factory{
        fun createArticleDAO(): ArticleDAO = ArticleDAOMemoryImpl();
    }
}