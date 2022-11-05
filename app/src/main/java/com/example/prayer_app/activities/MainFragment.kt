package com.example.prayer_app.activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.prayer_app.R


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_main, container, false)

        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val nextBtn: Button = view.findViewById(R.id.GetStart)
        nextBtn.setOnClickListener{
            val fragment = HomeActivity()// nevigate to second
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        return view


    }


}