package com.bhyte.midas.presentation.auth.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.R
import com.bhyte.midas.ui.theme.archivoFontFamily


@Composable
fun PinView(
    modifier: Modifier = Modifier,
    otpText: String,
    otpCount: Int = 6,
    onOtpTextChange: (String, Boolean) -> Unit
) {
    LaunchedEffect(Unit) {
        if (otpText.length > otpCount) {
            throw IllegalArgumentException("Otp text value must not have more than otpCount: $otpCount characters")
        }
    }

    BasicTextField(
        modifier = modifier,
        value = TextFieldValue(otpText, selection = TextRange(otpText.length)),
        onValueChange = {
            if (it.text.length <= otpCount) {
                onOtpTextChange.invoke(it.text, it.text.length == otpCount)
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.NumberPassword, imeAction = ImeAction.Done
        ),
        decorationBox = {
            Row(horizontalArrangement = Arrangement.Center) {
                repeat(otpCount) { index ->
                    CharView(
                        index = index,
                        text = otpText
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }
    )
}

@Composable
private fun CharView(
    index: Int,
    text: String
) {
    val isFocused = text.length == index
    val char = when {
        index == text.length -> ""
        index > text.length -> ""
        else -> text[index].toString()
    }
    val primaryColor = colorResource(id = R.color.primary)
    val backgroundColor = colorResource(id = R.color.background_light)
    val cellColor = colorResource(id = R.color.cell)
    val textColor = colorResource(id = R.color.text)


    Text(
        modifier = Modifier
            .width(55.dp)
            .height(55.dp)
            .border(
                1.dp, when {
                    isFocused -> primaryColor
                    else -> backgroundColor
                }, RoundedCornerShape(12.dp)
            )
            .background(
                when {
                    isFocused -> cellColor
                    else -> backgroundColor
                }, RoundedCornerShape(12.dp)
            )
            .padding(horizontal = 2.dp, vertical = 10.dp),
        text = char,
        style = MaterialTheme.typography.displaySmall,
        fontSize = 24.sp,
        fontFamily = archivoFontFamily,
        color = if (isFocused) {
            Color.Gray
        } else {
            textColor
        },
        textAlign = TextAlign.Center
    )
}