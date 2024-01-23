package com.bhyte.midas.presentation.auth.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.bhyte.midas.R
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountryDropdown() {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    var gender by remember {
        mutableStateOf("")
    }
    val backgroundColor = colorResource(id = R.color.background_light)
    val primaryColor = colorResource(id = R.color.primary)

    Surface {
        ExposedDropdownMenuBox(
            modifier = Modifier.fillMaxWidth(),
            expanded = isExpanded,
            onExpandedChange = { newValue -> isExpanded = newValue }
        ) {
            TextField(
                value = gender,
                onValueChange = {},
                readOnly = true,
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                },
                placeholder = {
                    Text(text = "Select country")
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors(
                    focusedContainerColor = backgroundColor,
                    unfocusedContainerColor = backgroundColor,
                    disabledContainerColor = backgroundColor,
                    cursorColor = primaryColor,
                    focusedIndicatorColor = primaryColor,
                    unfocusedIndicatorColor = backgroundColor,
                    focusedLabelColor = primaryColor,
                ),
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth()
            )

            DropdownMenu(
                modifier = Modifier
                    .background(backgroundColor)
                    .exposedDropdownSize(matchTextFieldWidth = true),
                expanded = isExpanded,
                onDismissRequest = {
                    isExpanded = false
                }
            ) {
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Ghana",
                            style = MaterialTheme.typography.bodyLarge,
                            fontFamily = archivoFontFamily,
                            fontWeight = FontWeight.Normal
                        )
                    },
                    onClick = {
                        gender = "Ghana"
                        isExpanded = false
                    }
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Other",
                            style = MaterialTheme.typography.bodyLarge,
                            fontFamily = archivoFontFamily,
                            fontWeight = FontWeight.Normal
                        )
                    },
                    onClick = {
                        gender = "Other"
                        isExpanded = false
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CountryDropdownPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            CountryDropdown()
        }
    }
}