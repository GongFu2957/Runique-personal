package com.gongfu.auth.domain

import com.gongfu.core.domain.util.DataError
import com.gongfu.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}