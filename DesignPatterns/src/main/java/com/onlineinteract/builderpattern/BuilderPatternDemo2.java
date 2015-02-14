package com.onlineinteract.builderpattern;

import com.onlineinteract.builderpattern.builder.RecordBuilder;
import com.onlineinteract.builderpattern.model.Record;

public class BuilderPatternDemo2 {
	public static void main(String[] args) {
		RecordBuilder recordBuilder = new RecordBuilder();
		try {
			Record record = recordBuilder
					.generateRecord("1234,JG410811A,Gary Black");
			System.out
					.println("Generating record: 1234,JG410811A,Gary Black\n");
			System.out.println(record.getRecordID());
			System.out.println(record.getNino());
			System.out.println(record.getName());
		} catch (Exception e) {
			System.out
					.println("There was a problem generating the record, exception message: "
							+ e.getMessage());
			e.printStackTrace();
		}
	}
}
