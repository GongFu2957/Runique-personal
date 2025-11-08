package com.gongfu.auth.presentation.di

import com.gongfu.auth.presentation.login.LoginViewModel
import com.gongfu.auth.presentation.register.RegisterViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}