package com.gonmarmar.skybooking.repository;

import com.gonmarmar.skybooking.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si es necesario
}
