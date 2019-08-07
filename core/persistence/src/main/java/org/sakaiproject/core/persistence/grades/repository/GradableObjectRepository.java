package org.sakaiproject.core.persistence.grades.repository;

import org.springframework.data.repository.CrudRepository;

import org.sakaiproject.core.persistence.grades.entity.Gradebook;
import org.sakaiproject.core.persistence.grades.entity.GradableObject;

public interface GradableObjectRepository extends CrudRepository<GradableObject, Long> {

    long countByNameAndGradebook_UidAndRemoved(String name, String uid, boolean removed);
    long countByNameAndGradebookAndIdNotAndRemovedIsFalse(String name, Gradebook gradebook, Long assignmentId);
    long deleteByGradebook_Id(Long gradebookId);
}
