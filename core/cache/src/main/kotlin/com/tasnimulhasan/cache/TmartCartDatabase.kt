package com.tasnimulhasan.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tasnimulhasan.cache.dao.CartItemDao
import com.tasnimulhasan.entity.room.CartItemRoomEntity

@Database(
    entities = [
        CartItemRoomEntity::class,
    ],
    version = 1, exportSchema = false
)
abstract class TmartCartDatabase : RoomDatabase() {
    abstract fun cartDao(): CartItemDao
}