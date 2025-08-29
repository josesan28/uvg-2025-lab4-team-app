package com.uvg.teamapp.data

// Data class temporal - Luego se borrará
data class TeamMember(
    val name: String,
    val description: String
)

class FakeTeamRepository {
    fun getTeamMembers(): List<TeamMember> {
        return listOf(
            TeamMember(
                name = "Juan Gualim",
                description = "Nacido en Carchá, le gusta el balonmano"
            ),
            TeamMember(
                name = "José Sanchez",
                description = "Nacido en Huehuetenango, le gusta el fútbol"
            ),
            TeamMember(
                name = "Daniel Sandoval",
                description = "Nacido en Ciudad de Guatemala, le gustan los videojuegos"
            ),
        )
    }
}