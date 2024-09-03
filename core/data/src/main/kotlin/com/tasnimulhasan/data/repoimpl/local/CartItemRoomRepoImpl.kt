package com.tasnimulhasan.data.repoimpl.local

import com.tasnimulhasan.cache.dao.CartItemDao
import com.tasnimulhasan.domain.repository.local.CartRoomRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CartItemRoomRepoImpl @Inject constructor(
    private val cityListDao: CartItemDao
) : CartRoomRepository{

}