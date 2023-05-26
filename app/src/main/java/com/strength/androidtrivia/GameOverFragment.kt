package com.strength.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class GameOverFragment : Fragment() {
    private lateinit var returnButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game_over, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        returnButton = view.findViewById(R.id.return_home_button_GOF)

        returnButton.setOnClickListener {
            val actionReturnHome = GameOverFragmentDirections.actionGameOverFragmentToTitleFragment()
            view.findNavController().navigate(actionReturnHome)
        }
    }
}