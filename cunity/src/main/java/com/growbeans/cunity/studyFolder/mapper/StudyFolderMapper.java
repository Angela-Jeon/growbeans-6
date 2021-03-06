package com.growbeans.cunity.studyFolder.mapper;

import com.growbeans.cunity.studyFolder.domain.StudyFolder;

public interface StudyFolderMapper {
	// 스터디 폴더 하나 선택
	StudyFolder selectOneStudyFolder(StudyFolder studyFolder); 
	// 스터디 폴더 하나 생성
	int insertStudyFolder(StudyFolder studyFolder);
	// 스터디 폴더 하나 삭제
	int deleteStudyFolder(int folderNo);
}
