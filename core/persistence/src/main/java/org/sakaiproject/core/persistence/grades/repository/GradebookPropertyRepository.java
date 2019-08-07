package org.sakaiproject.core.persistence.grades.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import org.sakaiproject.core.persistence.grades.entity.GradebookProperty;

public interface GradebookPropertyRepository extends CrudRepository<GradebookProperty, Long> {

    List<GradebookProperty> findByName(String name);
}
