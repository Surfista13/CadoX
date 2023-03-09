package com.example.cadox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.content.Intent;
import android.os.Build
import android.widget.CheckBox
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.cadox.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar


class ArticleViewActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_view)

        val buttonEdit = findViewById<ImageButton>(R.id.imageButton2);
        val buttonInternet = findViewById<ImageButton>(R.id.imageButton);

        //Récupération d'un article
        val articleRepo = ArticleRepository()
        val article = articleRepo.getArticle(1)

        val intitule = findViewById<TextView>(R.id.textViewIntitule)
        val description = findViewById<TextView>(R.id.textViewDescription)
        val tarif = findViewById<TextView>(R.id.textViewPrix)
        val date = findViewById<TextView>(R.id.textViewDateAchats)
        val rate = findViewById<RatingBar>(R.id.ratingBarLevel)
        val url = findViewById<TextView>(R.id.textViewUrl)
        val checkBox = findViewById<CheckBox>(R.id.checkBoxAchete)

        intitule.text = article.intitule
        description.text = article.description
        tarif.text = article.prix.toString()
        date.text = article.dateAchat.toString()
        rate.rating = article.niveau.toFloat()
        url.text = article.url
        checkBox.isChecked = article.achete

        //Navigation vers la page de modification de l'article
        buttonEdit.setOnClickListener{
               val intent = Intent(this,activity_article_edit_view::class.java);
                startActivity(intent);
        }
        //Renvoi vers l'url de l'article
        buttonInternet.setOnClickListener {
            val text = url.text
            val duration = Snackbar.LENGTH_LONG
            Snackbar.make(
                buttonInternet,
                text,
                duration
            ).show()
        }
    }
}