package com.onlineinteract.builderpattern.model;

public class Record {

	private String recordID;
	private String nino;
	private String name;

	public Record(String recordID, String nino, String name) {
		super();
		this.recordID = recordID;
		this.nino = nino;
		this.name = name;
	}
	
	public String getRecordID() {
		return recordID;
	}

	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}

	public String getNino() {
		return nino;
	}

	public void setNino(String nino) {
		this.nino = nino;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
