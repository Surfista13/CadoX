package com.example.cadox

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;


class ArticleViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_view)

        val buttonEdit = findViewById<ImageButton>(R.id.imageButton2);

        buttonEdit.setOnClickListener{
               val intent = Intent(this,activity_article_edit_view::class.java);
                startActivity(intent);
        }
    }
}