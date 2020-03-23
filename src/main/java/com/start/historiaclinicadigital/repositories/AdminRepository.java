package com.start.historiaclinicadigital.repositories;

import com.start.historiaclinicadigital.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AdminRepository  extends JpaRepository<Admin,Long> {
}
