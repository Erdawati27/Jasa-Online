package com.example.jasaonlinee.models

import android.os.Message

data class LoginResponse (
    val message: String,
    val error: Boolean,
    val data: User
        )