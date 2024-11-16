package org.example.repository

import org.example.model.PromotionTariff
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PromotionTariffRepository : JpaRepository<PromotionTariff, Long> {

    override fun findAll(pageable: Pageable): Page<PromotionTariff>
}