package com.growbeans.cunity.foreignActivities.service.logic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.growbeans.cunity.foreignActivities.domain.ForeignActivities;
import com.growbeans.cunity.foreignActivities.service.ForeignActivitiesService;
import com.growbeans.cunity.foreignActivities.store.ForeignActivitiesStore;


@Service("fActService")
public class ForeignActivitiesServiceImpl implements ForeignActivitiesService{
	
	@Autowired
	private ForeignActivitiesStore fActStore;

	@Override
	public ForeignActivities foreignInfo(int sNo) {
		return null;
	}

	@Override
	public int insertForeignAct(ForeignActivities fAct) {
		// TODO Auto-generated method stub
		return 0;
	}

}
