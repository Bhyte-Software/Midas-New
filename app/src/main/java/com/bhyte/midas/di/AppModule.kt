package com.bhyte.midas.di

import android.app.Application
import com.bhyte.midas.data.manager.LocalUserManagerImplementation
import com.bhyte.midas.domain.manager.LocalUserManager
import com.bhyte.midas.domain.usecases.AppEntryUseCases
import com.bhyte.midas.domain.usecases.ReadAppEntry
import com.bhyte.midas.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImplementation(application)


    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}