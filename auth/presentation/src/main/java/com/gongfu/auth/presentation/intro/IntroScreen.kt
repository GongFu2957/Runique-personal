package com.gongfu.auth.presentation.intro

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gongfu.core.presentation.designsystem.RuniquepersonalTheme

@Composable
fun IntroScreenRoot(
    onSignUpClick: () -> Unit,
    onSignInClick: () -> Unit
) {
    IntroScreen(
        onAction = { action ->
            when(action) {
                IntroAction.OnSignInClick -> onSignInClick()
                IntroAction.OnSignUpClick -> onSignUpClick()
            }
        }
    )
}

@Composable
fun IntroScreen(
    onAction: (IntroAction) -> Unit
) {

}

@Preview
@Composable
private fun IntroScreenPreview() {
    RuniquepersonalTheme {
        IntroScreen(
            onAction = {}
        )
    }
}