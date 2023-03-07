package com.example.cadox.repository

import com.example.cadox.dao.DAOFactory

class ArticleRepository {

    val instance = DAOFactory.createArticleDAO();

}