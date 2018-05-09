package pl.corp.wyrwas.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import pl.corp.wyrwas.model.User

@Repository
interface UserRepository : JpaRepository<User, Long> {
}