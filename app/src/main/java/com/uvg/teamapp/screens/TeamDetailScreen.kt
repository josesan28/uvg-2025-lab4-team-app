package com.uvg.teamapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.teamapp.model.respository.TeamMember
import com.uvg.teamapp.R

@Composable
fun TeamDetailScreen(
    member: TeamMember,
    modifier: Modifier = Modifier,
    onBackClick : () -> Unit = { }
) {
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(R.drawable.iphone_xs_programming_background_1125_x_2436_1j7ukc3osiuhjfup),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column {
            Row  (modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically){
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
                Text(
                    text = member.name,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1976D2),
                    fontSize = 40.sp
                )

            }
            Spacer(modifier = Modifier.height(40.dp))

            Card (
                modifier= Modifier
                    .padding(horizontal = 16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFBBDEFB)),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Column  (
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text (
                        text = "Información sobre ${member.name}",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF0D47A1),
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text (
                        text = member.description,
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color(0xFF0D47A1),
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                }
            }


        }
    }
}



@Preview (showBackground = true, showSystemUi = true)
@Composable
fun MemberDetailPreview() {
    MaterialTheme {
        TeamDetailScreen(
            member = TeamMember(
                name = "Juan Gualim",
                description = "Nacido en Carchá, le gusta el balonmano"
            )
        )
    }
}