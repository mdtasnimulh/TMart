package com.tasnimulhasan.cache

import android.app.Application
import androidx.room.Room
import com.tasnimulhasan.cache.dao.CartItemDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(application: Application): TmartCartDatabase {
        return Room.databaseBuilder(
            application, TmartCartDatabase::class.java,
            "tmart.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideCartDao(database: TmartCartDatabase): CartItemDao = database.cartDao()
}