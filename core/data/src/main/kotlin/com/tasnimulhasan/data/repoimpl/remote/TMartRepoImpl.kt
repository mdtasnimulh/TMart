package com.tasnimulhasan.data.repoimpl.remote

import com.tasnimulhasan.data.NetworkBoundResource
import com.tasnimulhasan.data.apiservice.TMartApiService
import com.tasnimulhasan.domain.repository.remote.TMartRepository
import javax.inject.Inject

class TMartRepoImpl @Inject constructor(
    private val apiService: TMartApiService,
    private val networkBoundResources: NetworkBoundResource
) : TMartRepository {

}