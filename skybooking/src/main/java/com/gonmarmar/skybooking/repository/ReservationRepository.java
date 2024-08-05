package com.gonmarmar.skybooking.repository;

import com.gonmarmar.skybooking.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si es necesario
}
