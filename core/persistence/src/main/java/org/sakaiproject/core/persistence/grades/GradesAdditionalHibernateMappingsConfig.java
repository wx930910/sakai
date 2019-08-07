package org.sakaiproject.core.persistence.grades;

import org.sakaiproject.core.persistence.grades.entity.AssignmentGradeRecord;
import org.sakaiproject.core.persistence.grades.entity.Category;
import org.sakaiproject.core.persistence.grades.entity.Comment;
import org.sakaiproject.core.persistence.grades.entity.CourseGrade;
import org.sakaiproject.core.persistence.grades.entity.CourseGradeRecord;
import org.sakaiproject.core.persistence.grades.entity.GradableObject;
import org.sakaiproject.core.persistence.grades.entity.GradeMapping;
import org.sakaiproject.core.persistence.grades.entity.Gradebook;
import org.sakaiproject.core.persistence.grades.entity.GradebookAssignment;
import org.sakaiproject.core.persistence.grades.entity.GradebookProperty;
import org.sakaiproject.core.persistence.grades.entity.GradingEvent;
import org.sakaiproject.core.persistence.grades.entity.GradingScale;
import org.sakaiproject.core.persistence.grades.entity.LetterGradePercentMapping;
import org.sakaiproject.core.persistence.grades.entity.Permission;
import org.sakaiproject.core.persistence.grades.entity.Spreadsheet;
import org.sakaiproject.springframework.orm.hibernate.AdditionalHibernateMappings;
import org.sakaiproject.springframework.orm.hibernate.impl.AdditionalHibernateMappingsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GradesAdditionalHibernateMappingsConfig {

    @Bean
    public AdditionalHibernateMappings additionalHibernateMappings() {

        AdditionalHibernateMappings mappings = new AdditionalHibernateMappingsImpl();

        Class[] annotatedClasses = new Class[] {
                AssignmentGradeRecord.class,
                Category.class,
                Comment.class,
                CourseGrade.class,
                CourseGradeRecord.class,
                GradableObject.class,
                Gradebook.class,
                GradebookAssignment.class,
                GradebookProperty.class,
                GradeMapping.class,
                GradingEvent.class,
                GradingScale.class,
                LetterGradePercentMapping.class,
                Permission.class,
                Spreadsheet.class
        };

        // mappings.setAnnotatedPackages("org.sakaiproject.core.persistence.grades.model");
        mappings.setAnnotatedClasses(annotatedClasses);
        return mappings;
    }
}
