package com.sprintrecap.userservice.repository;

import com.sprintrecap.userservice.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TeamRepository extends JpaRepository<Team, UUID> {

    Optional<Team> findByIdAndTenantId(UUID id, UUID tenantId);

    List<Team> findAllByTenantId(UUID tenantId);
}