package com.example.cadox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_article_edit_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_edit_view)

        val buttonCancel = findViewById<ImageButton>(R.id.imageButton3);

        buttonCancel.setOnClickListener(){
            val intent = Intent(this,ArticleViewActivity::class.java);
            startActivity(intent);
        }
    }
}