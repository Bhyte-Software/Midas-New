@file:OptIn(ExperimentalMaterial3Api::class)

package com.bhyte.midas.presentation.common


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhyte.midas.R
import com.bhyte.midas.ui.theme.MidasTheme

@Composable
fun PasswordToggleTextField(
    modifier: Modifier = Modifier,
    label: String,
    placeholder: String,
    value: String,
    onValueChange: (String) -> Unit,
    showPassword: Boolean,
    onTogglePassword: () -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
) {
    val backgroundColor = colorResource(id = R.color.background_light)
    val primaryColor = colorResource(id = R.color.primary)

    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        placeholder = { Text(text = placeholder) },
        visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
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
        ),
        trailingIcon = {
            Icon(
                imageVector = if (showPassword) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility,
                contentDescription = if (showPassword) "Hide password" else "Show password",
                modifier = Modifier
                    .clickable { onTogglePassword() }
                    .padding(8.dp)
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PasswordToggleTextFieldPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            PasswordToggleTextField(
                label = "Password",
                placeholder = "Enter your password",
                value = "",
                onValueChange = {},
                showPassword = false,
                onTogglePassword = {}
            )
        }
    }
}
