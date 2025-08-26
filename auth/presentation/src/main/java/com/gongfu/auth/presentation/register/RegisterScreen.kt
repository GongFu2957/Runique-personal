package com.gongfu.auth.presentation.register

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gongfu.core.presentation.designsystem.RuniquepersonalTheme
import com.gongfu.core.presentation.designsystem.components.GradientBackground
import org.koin.androidx.compose.koinViewModel

@Composable
fun RegisterScreenRot(
    viewModel: RegisterViewModel  = koinViewModel()
) {

    RegisterScreen(
        state = viewModel.state,
        onAction = viewModel::onAction
    )
}

@Composable
private fun RegisterScreen(
    state: RegisterState,
    onAction: (RegisterAction) -> Unit
) {
    GradientBackground() {

    }
}

@Preview
@Composable
private fun RegisterScreenPreview() {
    RuniquepersonalTheme {
        RegisterScreen(
            state = RegisterState(),
            onAction = {}
        )
    }
}