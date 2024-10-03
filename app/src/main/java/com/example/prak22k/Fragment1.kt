package com.example.prak22k

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.prak22k.R

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        val buttonNext: Button = view.findViewById(R.id.btn_next)

        buttonNext.setOnClickListener {
            val fragment2 = Fragment2()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment2)  // Заменяем текущий фрагмент на Fragment2
                .addToBackStack(null)  // Добавляем в стек, чтобы можно было вернуться назад
                .commit()
        }

        return view
    }
}