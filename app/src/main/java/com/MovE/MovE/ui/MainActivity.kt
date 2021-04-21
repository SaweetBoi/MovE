package com.MovE.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.MovE.R
import com.MovE.ui.MovieDetails.SingleMovie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppComspatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//when a user selects a particular movie from the home page, this triggers activity to open the movie details page
        btn.setOnClickListener {
            val intent = Intent(this, SingleMovie::class.java)
            intent.putExtra("id",299534 )
            this.startActivity(intent)
        }
    }
}
