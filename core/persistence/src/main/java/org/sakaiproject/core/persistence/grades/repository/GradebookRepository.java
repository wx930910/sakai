package org.sakaiproject.core.persistence.grades.repository;

import org.springframework.data.repository.CrudRepository;

import org.sakaiproject.core.persistence.grades.entity.Gradebook;

public interface GradebookRepository extends CrudRepository<Gradebook, Long> {

    Gradebook findByUid(String uid);
    boolean existsByUid(String uid);
}
