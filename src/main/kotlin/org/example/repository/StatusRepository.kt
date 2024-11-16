package org.example.repository

import org.example.model.Status
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface StatusRepository : JpaRepository<Status, Long> {

    fun findByName(name: String): Optional<Status>

    fun existsByName(name: String): Boolean
}