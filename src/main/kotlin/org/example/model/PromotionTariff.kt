package org.example.model

import jakarta.persistence.*

@Entity
@Table(name = "promotions_tariffs")
data class PromotionTariff(

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var  id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "promotion_id")
    var promotion: Promotion,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tariff_id")
    var tariff: Tariff
)
