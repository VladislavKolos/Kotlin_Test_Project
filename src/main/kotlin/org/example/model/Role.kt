package org.example.model

import jakarta.persistence.*
import jakarta.validation.constraints.Size

@Entity
@Table(name = "role")
data class Role(

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @field:Size(min = 2, max = 50)
    @Column(name = "role_name")
    var name: String
)
