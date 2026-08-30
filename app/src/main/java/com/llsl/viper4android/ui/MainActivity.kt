package com.llsl.viper4android.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.llsl.viper4android.service.ViperService
import com.llsl.viper4android.ui.navigation.ViperNavigation
import com.llsl.viper4android.ui.theme.ViperTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint(ComponentActivity::class)
class MainActivity : Hilt_MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViperService.startService(this)
        enableEdgeToEdge()
        setContent {
            ViperTheme {
                ViperNavigation()
            }
        }
    }
}
