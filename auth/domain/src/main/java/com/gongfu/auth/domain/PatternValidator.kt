package com.gongfu.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}