package com.university.Lab_R_2.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepository extends JpaRepository<Organisation, Long> {
    Organisation getOrganisationByName(String name);
}
