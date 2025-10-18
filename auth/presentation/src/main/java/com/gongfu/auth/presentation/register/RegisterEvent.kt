package com.gongfu.auth.presentation.register

import com.gongfu.core.presentation.ui.UiText

sealed interface RegisterEvent {

    data object RegistrationSuccess: RegisterEvent
    data class Error(val error: UiText): RegisterEvent
}