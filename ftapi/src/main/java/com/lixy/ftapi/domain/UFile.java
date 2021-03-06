package com.lixy.ftapi.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "file", catalog = "")
public class UFile implements Serializable {

	private static final long serialVersionUID = -4446929343152142811L;

	@JsonIgnore
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "uploader")
	private Long uploader;
	
	@Column(name = "owner")
	private Long owner;

	@JsonIgnore
	@Column(name = "original_name")
	private String originalName;
	
	@JsonIgnore
	@Column(name = "mime_type")
	private String mimeType;

	@Column(name = "temp_name")
	private String tempName;
	
	@JsonIgnore
	@Column(name = "size")
	private Long size;

	@JsonIgnore
	@Column(name = "full_temp_path")
	private String fullTempPath;
	
	@JsonIgnore
	@Column(name = "full_server_path")
	private String fullServerPath;
	
	@Column(name = "file_identifier")
	private String fileIdentifier;
	
	@JoinColumn(name = "server_id", referencedColumnName = "id")
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	private Server server;

	@Column(name = "status")
	private Long status;

	@Column(name = "CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createdDate;
	
	@Column(name = "server_upload_date")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date serverUploadDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUploader() {
		return uploader;
	}

	public void setUploader(Long uploader) {
		this.uploader = uploader;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public String getTempName() {
		return tempName;
	}

	public void setTempName(String tempName) {
		this.tempName = tempName;
	}

	public String getFullTempPath() {
		return fullTempPath;
	}

	public void setFullTempPath(String fullTempPath) {
		this.fullTempPath = fullTempPath;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Long getSize() {
		return size;
	}

	public Long getOwner() {
		return owner;
	}

	public void setOwner(Long owner) {
		this.owner = owner;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getFullServerPath() {
		return fullServerPath;
	}

	public void setFullServerPath(String fullServerPath) {
		this.fullServerPath = fullServerPath;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Date getServerUploadDate() {
		return serverUploadDate;
	}

	public void setServerUploadDate(Date serverUploadDate) {
		this.serverUploadDate = serverUploadDate;
	}
	
	public String getFileIdentifier() {
		return fileIdentifier;
	}

	public void setFileIdentifier(String fileIdentifier) {
		this.fileIdentifier = fileIdentifier;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	@Override
	public String toString() {
		return "UFile [id=" + id + ", uploader=" + uploader + ", owner=" + owner + ", originalName=" + originalName
				+ ", mimeType=" + mimeType + ", tempName=" + tempName + ", size=" + size + ", fullTempPath="
				+ fullTempPath + ", fullServerPath=" + fullServerPath + ", fileIdentifier=" + fileIdentifier
				+ ", server=" + server + ", status=" + status + ", createdDate=" + createdDate + ", serverUploadDate="
				+ serverUploadDate + "]";
	}
}
