package com.infinie.alpha_estate_api.repositories;

import com.infinie.alpha_estate_api.models.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepository extends JpaRepository<Agency,Long> {
}
