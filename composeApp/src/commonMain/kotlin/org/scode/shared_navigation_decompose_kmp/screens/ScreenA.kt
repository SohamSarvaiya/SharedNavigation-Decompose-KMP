package org.scode.shared_navigation_decompose_kmp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import org.scode.shared_navigation_decompose_kmp.navigation.ScreenAComponent
import org.scode.shared_navigation_decompose_kmp.navigation.ScreenAEvent

@Composable
fun ScreenA(component: ScreenAComponent) {
    val text by component.text.subscribeAsState()
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("First Screen", fontSize = 21.sp)
        OutlinedTextField(
            value = text,
            onValueChange = { component.onEvent(ScreenAEvent.UpdateText(it)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        Button(onClick = {
            component.onEvent(ScreenAEvent.ClickButtonA)
        },shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Cyan
            ),
            modifier = Modifier
                .fillMaxWidth().padding(start = 25.dp, end = 25.dp, top = 20.dp)) {
            Text("Go to Second Screen", modifier = Modifier.padding(top = 8.dp, bottom = 8.dp))
        }
    }
}