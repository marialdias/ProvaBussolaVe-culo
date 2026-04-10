package com.novadoc.prova.repository;

import com.novadoc.prova.model.AcessoriosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessoriosRepository extends JpaRepository<AcessoriosModel, Long> {
}
