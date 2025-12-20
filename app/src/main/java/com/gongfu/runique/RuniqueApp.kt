package com.gongfu.runique

import android.app.Application
import com.gongfu.auth.data.di.authDataModule
import com.gongfu.auth.presentation.di.authViewModelModule
import com.gongfu.core.data.di.coreDataModule
import com.gongfu.run.presentation.di.runViewModelModule
import com.gongfu.runique.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import timber.log.Timber
import org.koin.core.context.startKoin


class RuniqueApp: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule,
                runViewModelModule
            )
        }
    }
}