package org.factoriaf5.amuntp1samplespringbootrestapi.repositories

import jakarta.persistence.*

@Table(name = "coders")
@Entity
data class Coder(
    var name: String,
    var favouriteLanguage: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null
)