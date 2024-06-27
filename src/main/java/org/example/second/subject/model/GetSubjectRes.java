package org.example.second.subject.model;

import lombok.Data;

@Data
public class GetSubjectRes {
    private long subjectId;
    private String subjectName;
    private int grade;
    private String createdAt;
    private String updatedAt;
}
