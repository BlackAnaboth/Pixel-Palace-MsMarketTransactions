package com.pixelpalace.msMarketTransactions.repository;

import com.pixelpalace.msMarketTransactions.model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPlatformRepository extends JpaRepository<Platform, Long> {

    Optional<Platform> findById(Long id);

    @Query("SELECT id, name FROM Platform")
    List<Platform> getAllPlatformsName();
}
