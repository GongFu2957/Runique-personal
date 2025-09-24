package com.gongfu.auth.presentation.register

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gongfu.core.presentation.designsystem.Poppins
import com.gongfu.core.presentation.designsystem.R
import com.gongfu.core.presentation.designsystem.RuniqueGray
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
    GradientBackground {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .padding(vertical = 32.dp)
                .padding(top = 16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.create_account),
                style = MaterialTheme.typography.headlineMedium
            )
            val annotatedString = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                    fontFamily = Poppins,
                    color = RuniqueGray
                    )
                ) {
                    append(stringResource(id = R.string.already_have_an_account) + " ")
                    pushStringAnnotation(
                        tag = "clickable_text",
                        annotation = stringResource(id = R.string.login)
                    )
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.primary,
                            fontFamily = Poppins
                        )
                    ) {
                        append(stringResource(id = R.string.login))
                    }
                }
            }
            Text(
                modifier = Modifier.clickable {
                    val annotatedText = annotatedString.getStringAnnotations(
                        tag = "clickable_text",
                        start = 0,
                        end = annotatedString.length
                    ).firstOrNull()?.let {
                        onAction(RegisterAction.OnLoginClick)
                    }
                },
                text = annotatedString
            )
            Spacer(modifier = Modifier.height(48.dp))
        }
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