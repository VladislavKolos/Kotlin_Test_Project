package org.example.repository

import org.example.model.Promotion
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PromotionRepository : JpaRepository<Promotion, Long> {

    override fun findAll(pageable: Pageable): Page<Promotion>
}