package dev.tiago.agregadorInv.repository;

import dev.tiago.agregadorInv.entity.Account;
import dev.tiago.agregadorInv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {

}
