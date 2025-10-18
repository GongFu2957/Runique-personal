package com.gongfu.auth.domain

import com.gongfu.core.domain.util.DataError
import com.gongfu.core.domain.util.EmptyDataResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyDataResult<DataError.Network>
}