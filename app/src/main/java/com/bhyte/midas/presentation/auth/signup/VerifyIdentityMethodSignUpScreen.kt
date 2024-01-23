package com.bhyte.midas.presentation.auth.signup

import android.content.res.Configuration
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.ui.theme.MidasTheme

@Composable
fun VerifyIdentityMethodSignUpScreen(navController: NavController){

}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun VerifyIdentityMethodSignUpScreenPreview(){
    MidasTheme {
        val previewNavController = rememberNavController()
        Surface (color = MaterialTheme.colorScheme.background) {
            VerifyIdentityMethodSignUpScreen(navController = previewNavController)
        }
    }
}