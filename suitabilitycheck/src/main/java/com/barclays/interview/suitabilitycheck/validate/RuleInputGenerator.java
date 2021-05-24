package com.barclays.interview.suitabilitycheck.validate;

import java.util.concurrent.BlockingQueue;

import com.barclays.interview.suitabilitycheck.RuleInput;

public class RuleInputGenerator implements Runnable {
	private BlockingQueue<RuleInput> ruleInputList;

	private String threadName;

	public RuleInputGenerator(BlockingQueue<RuleInput> ruleInputList, String threadName) {
		this.ruleInputList = ruleInputList;
		this.threadName = threadName;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			RuleInput ruleInput = new RuleInput();
			ruleInput.setThreadName(this.threadName);
			ruleInput.setId((int) (Math.random() * 100000));
			try {
				this.ruleInputList.put(ruleInput);
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public BlockingQueue<RuleInput> getRuleInputList() {
		return this.ruleInputList;
	}

	public String getThreadName() {
		return this.threadName;
	}
}
