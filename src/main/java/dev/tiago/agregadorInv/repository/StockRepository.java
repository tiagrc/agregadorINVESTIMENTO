package dev.tiago.agregadorInv.repository;

import dev.tiago.agregadorInv.entity.Account;
import dev.tiago.agregadorInv.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {

}
