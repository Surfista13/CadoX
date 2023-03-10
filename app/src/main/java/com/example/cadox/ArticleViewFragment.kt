package com.example.cadox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.cadox.bo.Article
import com.example.cadox.databinding.FragmentArticleViewBinding
import com.example.cadox.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar

class ArticleViewFragment : Fragment() {
    lateinit var favb: FragmentArticleViewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        favb = FragmentArticleViewBinding.inflate(inflater, container, false)
        return favb.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val articleRepo = ArticleRepository()
        val article = articleRepo.getArticle(1)
        favb.article = article
        favb.buttonInternet.setOnClickListener {
            val text = article.url.toString()
            val duration = Snackbar.LENGTH_LONG
            Snackbar.make(
                favb.buttonInternet,
                text,
                duration
            ).show()
        }
        favb.buttonEdit.setOnClickListener() {
            val targetFragmentDirection = ArticleViewFragmentDirections.actionToEdit(article)
            Navigation.findNavController(it).navigate(targetFragmentDirection)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}