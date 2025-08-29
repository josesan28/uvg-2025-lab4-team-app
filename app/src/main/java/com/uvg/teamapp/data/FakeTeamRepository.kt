package com.uvg.teamapp.data

import com.uvg.teamapp.model.respository.TeamMember

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
    fun findMemberByName(name: String): TeamMember? {
        return getTeamMembers().find { it.name.equals(name, ignoreCase = true) }
    }
}