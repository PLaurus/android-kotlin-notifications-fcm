package com.example.android.eggtimernotifications.util

import android.app.PendingIntent
import android.os.Build

object PendingIntentCompat {
    val FLAG_IMMUTABLE: Int
        get() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            PendingIntent.FLAG_IMMUTABLE
        } else {
            0
        }

    val FLAG_MUTABLE: Int
        get() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.FLAG_MUTABLE
        } else {
            0
        }
}