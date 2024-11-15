package com.example.receipe_sharing.Repository;

import com.example.receipe_sharing.Model.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AccountUser,Long> {
}
