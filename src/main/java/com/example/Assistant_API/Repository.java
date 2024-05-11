package com.example.Assistant_API;

import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Assistant,Integer> {
}
