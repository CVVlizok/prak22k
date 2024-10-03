package com.example.prak22k

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prak22k.R
import com.example.prak22k.Fragment1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Загружаем Fragment1 при запуске активности
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Fragment1())  // Заменяем контейнер на первый фрагмент
                .commit()
        }
    }
}