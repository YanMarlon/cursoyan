package com.yan.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yan.senai.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{


}
