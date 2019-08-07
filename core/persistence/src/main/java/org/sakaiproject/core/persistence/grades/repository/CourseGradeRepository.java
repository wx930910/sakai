package org.sakaiproject.core.persistence.grades.repository;

import org.springframework.data.repository.CrudRepository;

import org.sakaiproject.core.persistence.grades.entity.CourseGrade;

public interface CourseGradeRepository extends CrudRepository<CourseGrade, Long> {

    CourseGrade findOneByGradebook_Id(Long gradebookId);
}
