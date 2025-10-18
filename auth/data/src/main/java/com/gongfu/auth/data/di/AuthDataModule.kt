package com.gongfu.auth.data.di

import com.gongfu.auth.data.AuthRepositoryImpl
import com.gongfu.auth.data.EmailPatternValidator
import com.gongfu.auth.domain.AuthRepository
import com.gongfu.auth.domain.PatternValidator
import com.gongfu.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
    singleOf(::AuthRepositoryImpl).bind<AuthRepository>()
}