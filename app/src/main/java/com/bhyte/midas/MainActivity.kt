package com.bhyte.midas

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bhyte.midas.components.navigation.BottomNavigationBar
import com.bhyte.midas.components.navigation.getBottomNavigationItems
import com.bhyte.midas.presentation.onboarding.OnBoardingScreen
import com.bhyte.midas.ui.theme.MidasTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            MidasTheme {
                //val items = getBottomNavigationItems()
                /*Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(items = items)
                        }
                    ) {

                    }
                }
                 */
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OnBoardingScreen()
                }
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun BottomNavigationBarPreviewLight() {
    MidasTheme {
        val items = getBottomNavigationItems()
        BottomNavigationBar(items = items)
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun BottomNavigationBarPreviewDark() {
    MidasTheme {
        val items = getBottomNavigationItems()
        BottomNavigationBar(items = items)
    }
}