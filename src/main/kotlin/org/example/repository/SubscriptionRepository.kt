package org.example.repository

import org.example.model.Subscription
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface SubscriptionRepository : JpaRepository<Subscription, Long> {

    fun findByUserIdAndStatus(userId: Long, status: String): Optional<Subscription>

    fun existsByUserIdAndPlanIdAndStatus(userId: Long, planId: Long, status: String): Boolean

    fun existsByUserId(userId: Long): Boolean
}