package com.example.prak22k

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.prak22k.R

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        val buttonNext: Button = view.findViewById(R.id.btn_next)
        val buttonBack: Button = view.findViewById(R.id.btn_back)

        buttonNext.setOnClickListener {
            val fragment3 = Fragment3()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment3)  // Заменяем на Fragment3
                .addToBackStack(null)  // Добавляем в стек
                .commit()
        }

        buttonBack.setOnClickListener {
            parentFragmentManager.popBackStack()  // Возвращаемся назад
        }

        return view
    }
}