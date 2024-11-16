package org.example.repository

import org.example.model.EmailToken
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface EmailTokenRepository : JpaRepository<EmailToken, Long> {

    fun findByToken(token: String): Optional<EmailToken>
}