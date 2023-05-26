package com.strength.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class GameWonFragment : Fragment() {
    private lateinit var returnButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game_won, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        returnButton = view.findViewById(R.id.return_home_button_GWF)

        returnButton.setOnClickListener {
            val actionReturnHome = GameWonFragmentDirections.actionGameWonFragmentToTitleFragment()
            view.findNavController().navigate(actionReturnHome)
        }
    }
}