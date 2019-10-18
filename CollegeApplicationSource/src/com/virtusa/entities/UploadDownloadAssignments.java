package com.virtusa.entities;

public class UploadDownloadAssignments {

	
	 private int fileId;
	 private String fileName;
	
	 
	 
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
	@Override
	public String toString() {
		return "UploadDownloadAssignments [fileId=" + fileId + ", fileName=" + fileName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fileId;
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UploadDownloadAssignments other = (UploadDownloadAssignments) obj;
		if (fileId != other.fileId)
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		return true;
	}
	
	
	 
	 
	 
}
