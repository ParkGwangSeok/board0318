package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Freeboard;

@Repository
public interface FreeboardRepository extends JpaRepository<Freeboard, Long> {

	//public Freeboard findByFreeid(Long freeid);
}
