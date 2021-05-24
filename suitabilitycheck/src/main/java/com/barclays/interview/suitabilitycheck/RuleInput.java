package com.barclays.interview.suitabilitycheck;

public class RuleInput {
	  private int id;
	  
	  private String threadName;
	  
	  String product;
	  
	  String client;
	  
	  public int getId() {
	    return this.id;
	  }
	  
	  public void setId(int id) {
	    this.id = id;
	  }
	  
	  public String getProduct() {
	    return this.product;
	  }
	  
	  public void setProduct(String product) {
	    this.product = product;
	  }
	  
	  public String getClient() {
	    return this.client;
	  }
	  
	  public void setClient(String client) {
	    this.client = client;
	  }
	  
	  public String getThreadName() {
	    return this.threadName;
	  }
	  
	  public void setThreadName(String threadName) {
	    this.threadName = threadName;
	  }
	}
