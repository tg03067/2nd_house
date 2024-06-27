package org.example.second.student_subject;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentSubjectMapper {
    int postScore();
}
