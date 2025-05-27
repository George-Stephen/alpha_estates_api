package com.infinie.alpha_estate_api.repositories;

import com.infinie.alpha_estate_api.models.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home,Long> {
}
