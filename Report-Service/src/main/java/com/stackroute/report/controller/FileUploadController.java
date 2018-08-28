package com.stackroute.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.stackroute.report.service.UploadService;

@RestController
public class FileUploadController {
	
	private UploadService uploadService;
	@Autowired
	public FileUploadController(UploadService uploadService) {
		this.uploadService=uploadService;
	}
	
	public ResponseEntity<String> uploadFile(MultipartFile file){
		
		ResponseEntity<String> responseEntity = null;
		
		
		
		
		
		return responseEntity;
	}
	

}
