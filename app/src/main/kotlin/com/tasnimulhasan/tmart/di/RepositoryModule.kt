package com.tasnimulhasan.tmart.di

import com.tasnimulhasan.data.repoimpl.remote.TMartRepoImpl
import com.tasnimulhasan.domain.repository.remote.TMartRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindHomeWeatherRepository(weatherRepoImpl: TMartRepoImpl): TMartRepository

}