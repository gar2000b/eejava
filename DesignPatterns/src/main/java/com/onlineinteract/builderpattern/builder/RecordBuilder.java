package com.onlineinteract.builderpattern.builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

import com.onlineinteract.builderpattern.model.Record;

public class RecordBuilder {

	private String recordID;
	private String nino;
	private String name;
	String recordString;

	private static final Pattern RECORD = compile("^(.*),(.*),(.*)$");

	public Record generateRecord(String recordString) throws Exception {
		this.recordString = recordString;
		Matcher randomMatcher = RECORD.matcher(recordString);

		if (randomMatcher.matches()) {
			return new RecordBuilder().withRecordID(randomMatcher.group(1))
					.withNino(randomMatcher.group(2))
					.withName(randomMatcher.group(3)).build();
		} else {
			throw new Exception();
		}
	}

	private RecordBuilder withRecordID(String recordID) {
		this.recordID = recordID;
		return this;
	}

	private RecordBuilder withNino(String nino) {
		this.nino = nino;
		return this;
	}

	private RecordBuilder withName(String name) {
		this.name = name;
		return this;
	}

	private Record build() throws Exception {
		if (recordID != null && !recordID.isEmpty()) {
			return new Record(recordID, nino, name);
		} else {
			throw new Exception("recordID is empty or null");
		}
	}

}
