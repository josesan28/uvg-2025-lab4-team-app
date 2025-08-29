package com.uvg.teamapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.teamapp.R
import com.uvg.teamapp.data.FakeTeamRepository
import com.uvg.teamapp.model.TeamMember


@Composable
fun TeamListScreen(
    members : FakeTeamRepository = FakeTeamRepository(),
    modifier: Modifier = Modifier,
    onMemberClick: (TeamMember) -> Unit = { }
) {

    val teamMembers = remember {
        members.getTeamMembers()
    }
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.iphone_xs_programming_background_1125_x_2436_1j7ukc3osiuhjfup),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column {
            Tittle()
            Spacer(modifier = Modifier.height(20.dp))
            TeamList(
                members = teamMembers,
                onMemberClick = onMemberClick
            )
        }
    }

}

@Composable
private fun Tittle(){


    Column {
        Text(
            text = "Equipo",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2),
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
            fontSize = 60.sp
        )

        Text(
            text = "Integranes",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF19A3E3),
            modifier = Modifier.padding(vertical =  8.dp, horizontal = 16.dp),
            fontSize = 30.sp
        )
    }
}

@Composable
private fun TeamList(
    members: List<TeamMember>,
    onMemberClick: (TeamMember) -> Unit
){
    LazyColumn (
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(members){ member ->
            ShowMember(
                member = member,
                onClick = { onMemberClick(member) }

            )
        }
    }
}

@Composable
private fun ShowMember (
    member: TeamMember,
    onClick: () -> Unit
) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clickable{ onClick() },
        colors = CardDefaults.cardColors(containerColor = Color(0xFFBBDEFB)),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Text(
            text = member.name,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF0FB3DC),
            modifier = Modifier.padding(14.dp)
        )
    }
}

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun TeamListScreenPreview() {
    MaterialTheme {
        TeamListScreen()
    }

}

