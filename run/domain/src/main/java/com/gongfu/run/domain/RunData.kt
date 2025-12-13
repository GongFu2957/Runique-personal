package com.gongfu.run.domain

import com.gongfu.core.domain.location.LocationTimestamp
import kotlin.time.Duration

class RunData(
    val distanceMeters: Int = 0,
    val pace: Duration = Duration.ZERO,
    val locations: List<List<LocationTimestamp>> = emptyList()
) {
}