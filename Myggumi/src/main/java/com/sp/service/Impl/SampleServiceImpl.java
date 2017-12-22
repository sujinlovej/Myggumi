package com.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.domain.User;
import com.sp.mapper.SampleMapper;
import com.sp.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService{
	
	private final SampleMapper sampleMapper;
	
	@Autowired
	public SampleServiceImpl(SampleMapper sampleMapper) {
		this.sampleMapper = sampleMapper;
	}
	
    @Override
    public List<User> getUserList() {
        return sampleMapper.getUserList();
        
    }

}
