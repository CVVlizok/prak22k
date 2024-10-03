package com.example.prak22k

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.prak22k.R

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        val buttonBack: Button = view.findViewById(R.id.btn_back)

        buttonBack.setOnClickListener {
            parentFragmentManager.popBackStack()  // Возвращаемся назад на Fragment2
        }

        return view
    }
}