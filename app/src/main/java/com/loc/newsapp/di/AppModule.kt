package com.loc.newsapp.di

import android.app.Application
import com.loc.newsapp.data.manager.LocalUserManagerImpl
import com.loc.newsapp.domain.UseCases.app_entry.AppEntryUseCases
import com.loc.newsapp.domain.UseCases.app_entry.ReadAppEntry
import com.loc.newsapp.domain.UseCases.app_entry.SaveAppEntry
import com.loc.newsapp.domain.manager.LocalUserManager
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
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    )= AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}

