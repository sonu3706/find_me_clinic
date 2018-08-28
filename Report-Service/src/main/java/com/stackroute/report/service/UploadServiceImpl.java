package com.stackroute.report.service;

import java.nio.file.Path;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadServiceImpl implements UploadService {
	
	private  Path rootLocation;
	
	public UploadServiceImpl() {}

	@Override
	public boolean uploadFile(MultipartFile file) {
		// TODO Auto-generated method stub
		return false;
	}
	


	
}
