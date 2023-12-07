package com.pixelpalace.msMarketTransactions.repository;

import com.pixelpalace.msMarketTransactions.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
    Optional<Transaction> findById(Long id);

    List<Transaction> findAll();

    @Query("SELECT t FROM Transaction t JOIN t.iduser u WHERE u.id = :userId")
    List<Transaction> findByUserId(@Param("userId") Long id);
}
