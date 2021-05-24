package com.barclays.interview.suitabilitycheck;

public class RuleOutput {
	  private int id;
	  
	  private boolean result;
	  
	  private String threadName;
	  
	  public boolean getResult() {
	    return this.result;
	  }
	  
	  public void setResult(boolean result) {
	    this.result = result;
	  }
	  
	  public int getId() {
	    return this.id;
	  }
	  
	  public void setId(int id) {
	    this.id = id;
	  }
	  
	  public String getThreadName() {
	    return this.threadName;
	  }
	  
	  public void setThreadName(String threadName) {
	    this.threadName = threadName;
	  }
	}
