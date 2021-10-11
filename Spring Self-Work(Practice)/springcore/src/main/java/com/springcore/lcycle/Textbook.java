package com.springcore.lcycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Textbook {
	private String textbookName;

	public String getTextbookName() {
		return textbookName;
	}

	public void setTextbookName(String textbookName) {
		this.textbookName = textbookName;
	}

	public Textbook() {
		super();
	}

	@Override
	public String toString() {
		return "Textbook [textbookName=" + textbookName + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Textbook Init");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending Textbook Destroy");
	}
}
