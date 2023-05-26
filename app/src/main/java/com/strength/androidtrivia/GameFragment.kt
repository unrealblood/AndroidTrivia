package com.strength.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController

class GameFragment : Fragment() {
    private lateinit var submitButton: Button
    private lateinit var answerEditText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        answerEditText = view.findViewById(R.id.answer_edit_text_GF)
        submitButton = view.findViewById(R.id.answer_submit_button_GF)

        submitButton.setOnClickListener {
            if(answerEditText.text.isNullOrEmpty()) {
                Toast.makeText(view.context, "Please provide answer...", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else {
                if(answerEditText.text.contains("Green") || answerEditText.text.contains("green")) {
                    //game won
                    val actionGameWonFragment = GameFragmentDirections.actionGameFragmentToGameWonFragment()
                    view.findNavController().navigate(actionGameWonFragment)
                }
                else {
                    //game lost
                    val actionGameLostFragment = GameFragmentDirections.actionGameFragmentToGameOverFragment()
                    view.findNavController().navigate(actionGameLostFragment)
                }
            }
        }
    }
}