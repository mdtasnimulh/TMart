package com.tasnimulhasan.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.tasnimulhasan.entity.room.CartItemRoomEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CartItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCity(items: CartItemRoomEntity)

    @Query("DELETE FROM TABLE_TMART_CART_ITEM WHERE id=:id AND name=:name")
    suspend fun deleteCities(id: Int, name: String)

    @Query("DELETE FROM TABLE_TMART_CART_ITEM")
    suspend fun deleteAllCities()

    @Query("SELECT * FROM TABLE_TMART_CART_ITEM")
    fun getCities(): Flow<List<CartItemRoomEntity>>

}