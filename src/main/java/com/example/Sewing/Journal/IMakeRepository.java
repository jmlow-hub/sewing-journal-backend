package com.example.Sewing.Journal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMakeRepository extends JpaRepository<Make, Integer> {

    List<Make> findByDesigner(String designer);

    List<Make> findByPattern(String pattern);

    List<Make> findByStyle(String style);




}