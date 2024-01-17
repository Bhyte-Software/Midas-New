@file:OptIn(ExperimentalMaterial3Api::class)

package com.bhyte.midas.presentation.common

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.bhyte.midas.R

@Composable
fun PrimaryTextField(
    modifier: Modifier = Modifier,
    label: String,
    placeholder: String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
) {
    val backgroundColor = colorResource(id = R.color.background_light)
    val primaryColor = colorResource(id = R.color.primary)

    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        placeholder = { Text(text = placeholder) },
        keyboardOptions = keyboardOptions,
        modifier = modifier,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = backgroundColor,
            unfocusedContainerColor = backgroundColor,
            disabledContainerColor = backgroundColor,
            cursorColor = primaryColor,
            focusedIndicatorColor = primaryColor,
            unfocusedIndicatorColor = backgroundColor,
            focusedLabelColor = primaryColor,
        )
    )
}
