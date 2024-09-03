package com.tasnimulhasan.entity.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_tmart_cart_item")
data class CartItemRoomEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var name: String?,
)