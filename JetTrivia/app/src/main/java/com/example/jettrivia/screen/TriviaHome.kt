package com.example.jettrivia.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jettrivia.component.Questions

@Composable
fun TrivialHome(viewModel: QuestionsViewModel = hiltViewModel()) {
    Questions(viewModel)
}
