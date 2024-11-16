package org.example.model

import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Size
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

@Entity
@Table(name = "\"user\"")
data class User(

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @field:Size(min = 3, max = 32)
    @Column(name = "username", unique = true)
    var username: String,

    @field:Size(min = 8, max = 256)
    @Column(name = "password")
    var password: String,

    @field:Email
    @Column(name = "email", unique = true)
    var email: String,

    @field:Size(min = 10, max = 18)
    @Column(name = "phone", unique = true)
    var phone: String,

    @ManyToOne
    @JoinColumn(name = "role_id")
    var role: Role,

    @ManyToOne
    @JoinColumn(name = "status_id")
    var status: Status,

    @OneToMany(mappedBy = "user")
    var emailTokens: List<EmailToken>,

    @OneToMany(mappedBy = "user")
    var subscriptions: List<Subscription>

) : UserDetails {
    override fun getAuthorities(): Collection<GrantedAuthority> {
        return listOf(SimpleGrantedAuthority(role.name))
    }

    override fun getPassword(): String {
        return password
    }

    override fun getUsername(): String {
        return username
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}


