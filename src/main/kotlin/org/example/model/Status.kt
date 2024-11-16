package org.example.model

import jakarta.persistence.*
import jakarta.validation.constraints.Size

@Entity
@Table(name = "status")
data class Status(

    @Id
    @Column(name = "status_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @field:Size(min = 6, max = 8)
    @Column(name = "status_name")
    var name: String
)
