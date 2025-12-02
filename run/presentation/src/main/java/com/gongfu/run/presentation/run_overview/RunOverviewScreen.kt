package com.gongfu.run.presentation.run_overview
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gongfu.core.presentation.designsystem.RuniquepersonalTheme
import org.koin.androidx.compose.koinViewModel
@Composable
fun RunOverviewScreenRot(
    viewModel: RunOverviewViewModel  = koinViewModel()
) {
    RunOverviewScreen(
        onAction = viewModel::onAction
    )
}
@Composable
private fun RunOverviewScreen(
    onAction: (RunOverviewAction) -> Unit
) {

}

@Preview
@Composable
private fun RunOverviewScreenPreview() {
    RuniquepersonalTheme {
        RunOverviewScreen(
            onAction = {}
        )
    }
}