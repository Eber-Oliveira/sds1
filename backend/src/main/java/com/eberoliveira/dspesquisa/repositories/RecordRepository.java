package com.eberoliveira.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eberoliveira.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
