package com.gongfu.core.data.di

import com.gongfu.core.data.auth.EncryptedSessionStorage
import com.gongfu.core.data.networking.HttpClientFactory
import com.gongfu.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}