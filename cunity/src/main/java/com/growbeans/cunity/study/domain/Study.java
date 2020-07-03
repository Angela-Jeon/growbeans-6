package com.growbeans.cunity.study.domain;

public class Study {
 
	private int studyNo; // 스터디 번호
	private String studyName; // 스터디 이름
	private String studyManager;
	public Study() {}

	public Study(int studyNo, String studyName, String studyManager) {
		super();
		this.studyNo = studyNo;
		this.studyName = studyName;
		this.studyManager = studyManager;
	}

	public int getStudyNo() {
		return studyNo;
	}

	public void setStudyNo(int studyNo) {
		this.studyNo = studyNo;
	}

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}
	
	
	public String getStudyManager() {
		return studyManager;
	}

	public void setStudyManager(String studyManager) {
		this.studyManager = studyManager;
	}

	@Override
	public String toString() {
		return "Study [studyNo=" + studyNo + ", studyName=" + studyName + ", studyManager=" + studyManager + "]";
	}

	
	
}
