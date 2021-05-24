package com.barclays.interview.suitabilitycheck.validate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

import com.barclays.interview.suitabilitycheck.RuleInput;
import com.barclays.interview.suitabilitycheck.RuleOutput;
import com.barclays.interview.suitabilitycheck.engine.SuitabilityCheck;

public class RuleInputProcessor implements Runnable {
	  private BlockingQueue<RuleInput> ruleInputList;
	  
	  private SuitabilityCheck sc;
	  
	  private List<RuleOutput> ruleOutputList = new ArrayList<>();
	  
	  public RuleInputProcessor(BlockingQueue<RuleInput> ruleInputList, SuitabilityCheck sc) {
	    this.ruleInputList = ruleInputList;
	    this.sc = sc;
	  }
	  
	  public void run() {
	    while (true) {
	      RuleInput ruleInput = null;
	      try {
	        ruleInput = this.ruleInputList.take();
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      } 
	      RuleOutput ruleOutput = this.sc.check(ruleInput);
	      System.out.println("thread name: " + ruleOutput.getThreadName() + " id: " + ruleOutput.getId() + " result: " + ruleOutput.getResult());
	      this.ruleOutputList.add(ruleOutput);
	    } 
	  }
	  
	  public List<RuleOutput> getRuleOutputList() {
	    return this.ruleOutputList;
	  }
	}
