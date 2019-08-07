package org.sakaiproject.core.persistence.grades.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import org.sakaiproject.core.persistence.grades.entity.AbstractGradeRecord;

@NoRepositoryBean
public interface AbstractGradeRecordRepository<T extends AbstractGradeRecord> extends CrudRepository<T, Long> {

    long deleteByGradableObject_Gradebook_Id(Long gradebookId);
}
