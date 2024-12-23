package org.scode.shared_navigation_decompose_kmp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.scode.shared_navigation_decompose_kmp.navigation.ScreenBComponent

@Composable
fun ScreenB(text: String, component: ScreenBComponent) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Second Screen:\n $text", fontSize = 21.sp,textAlign = TextAlign.Center)
        Button(onClick = {
            component.goBack()
        },shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Cyan
            ),
            modifier = Modifier
                .fillMaxWidth().padding(20.dp)) {
            Text("Go back", modifier = Modifier.padding(top = 8.dp, bottom = 8.dp))
        }
    }
}