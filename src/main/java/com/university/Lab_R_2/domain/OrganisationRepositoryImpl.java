package com.university.Lab_R_2.domain;

import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@Repository
public class OrganisationRepositoryImpl {

    @Autowired
    private OrganisationRepository organisationRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Organisation getEntity(Long id) {
        return organisationRepository.findById(id).orElse(null);
    }

    @Transactional
    public Organisation getOrganisationByName(String name) {
        return organisationRepository.getOrganisationByName(name);
    }

    @Transactional
    public void addOrganisation(Organisation organisation) {
        organisationRepository.save(organisation);
    }

    @Transactional
    public void editOrganisation(Organisation organisation) {
        organisationRepository.save(organisation);
    }

    @Transactional
    public void removeOrganisation(Organisation organisation) {
        organisationRepository.delete(organisation);
    }

    @Transactional
    public List<Organisation> getOrganisations() {
        return organisationRepository.findAll();
    }
}
