package com.virtusa.model;

import java.io.Reader;

public class UploadDownloadAssignmentsModel {
	
	private int fileId;
	 private String fileName;
	 private String fileDescription;
	 private String path;
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileDescription() {
		return fileDescription;
	}
	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "UploadDownloadAssignmentsModel [fileId=" + fileId + ", fileName=" + fileName + ", fileDescription="
				+ fileDescription + ", path=" + path + "]";
	}
	 
	 

}
