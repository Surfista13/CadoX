package com.example.cadox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.cadox.databinding.FragmentArticleEditViewBinding
import com.google.android.material.snackbar.Snackbar

class ArticleEditFragment : Fragment() {
    lateinit var faveb: FragmentArticleEditViewBinding
    val args by navArgs<ArticleEditFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        faveb = FragmentArticleEditViewBinding.inflate(inflater, container, false)
        return faveb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        faveb.imageButton3.setOnClickListener {
            Navigation.findNavController(view).popBackStack()
        }
        faveb.article = args.article
        super.onViewCreated(view, savedInstanceState)
    }
}