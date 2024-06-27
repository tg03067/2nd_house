package org.example.second.subject;

import org.apache.ibatis.annotations.Mapper;
import org.example.second.subject.model.DeleteSubjectReq;
import org.example.second.subject.model.GetSubjectReq;
import org.example.second.subject.model.GetSubjectRes;
import org.example.second.subject.model.PostSubjectReq;

import java.util.List;


@Mapper
public interface SubjectMapper {
    int postSubject(PostSubjectReq req);
    int deleteSubject(DeleteSubjectReq req);
    List<GetSubjectRes> getSubjectList(GetSubjectReq req);
}
