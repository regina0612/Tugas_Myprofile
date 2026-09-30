package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    MaterialTheme {
        ProfileScreen()
    }
}

@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ProfileHeader()

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        ProfileBio()

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        ProfileCard()

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Button(
            onClick = {
            }
        ) {
            Text("Follow")
        }
    }
}

@Composable
fun ProfileHeader() {

    Box(
        modifier = Modifier
            .size(120.dp)
            .clip(CircleShape)
            .background(Color(0xFFE8D5C4)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "👤",
            style = MaterialTheme.typography.displaySmall
        )
    }
    Spacer(
        modifier = Modifier.height(12.dp)
    )
    Text(
        text = "Regina Cahyani Puteri",
        style = MaterialTheme.typography.headlineMedium,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = "Teknik Informatika",
        style = MaterialTheme.typography.bodyMedium
    )
}
@Composable
fun ProfileBio() {

    Text(
        text = "Halo! Saya Regina, mahasiswa Teknik Informatika yang mengambil mata kuliah Pengembangan Aplikasi Mobile.",
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center
    )
}
@Composable
fun ProfileCard() {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            InfoItem(
                icon = "✉️",
                title = "Email",
                value = "regina.124140063@itera.ac.id"
            )

            InfoItem(
                icon = "📱",
                title = "Phone",
                value = "082267889099"
            )

            InfoItem(
                icon = "📍",
                title = "Location",
                value = "Lampung, Indonesia"
            )
        }
    }
}
@Composable
fun InfoItem(
    icon: String,
    title: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = icon,
            modifier = Modifier.size(32.dp)
        )
        Spacer(
            modifier = Modifier.size(12.dp)
        )
        Column {

            Text(
                text = title,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = value,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}