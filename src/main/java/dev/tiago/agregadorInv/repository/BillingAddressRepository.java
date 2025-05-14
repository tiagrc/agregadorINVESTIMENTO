package dev.tiago.agregadorInv.repository;

import dev.tiago.agregadorInv.entity.AccountStock;
import dev.tiago.agregadorInv.entity.BillingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BillingAddressRepository extends JpaRepository<BillingAddress, UUID> {

}
