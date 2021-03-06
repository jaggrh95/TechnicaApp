package com.davis.kevin.technicav2.ui.onzeclub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.davis.kevin.technicav2.R

class OnzeclubFragment : Fragment() {

    private lateinit var onzeclubViewModel: OnzeclubViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        onzeclubViewModel =
            ViewModelProviders.of(this).get(OnzeclubViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_onzeclub, container, false)
        val textView: TextView = root.findViewById(R.id.txtClub)
        onzeclubViewModel.text.observe(this, Observer {
            //textView.text = it
        })
        return root
    }
}