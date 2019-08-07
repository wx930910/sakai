package org.sakaiproject.core.persistence.grades.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import org.sakaiproject.core.persistence.grades.entity.LetterGradePercentMapping;

public interface LetterGradePercentMappingRepository extends CrudRepository<LetterGradePercentMapping, Long> {

    List<LetterGradePercentMapping> findByMappingType(int mappingType);
    LetterGradePercentMapping findByGradebookIdAndMappingType(Long gradebookId, int mappingType);
}
