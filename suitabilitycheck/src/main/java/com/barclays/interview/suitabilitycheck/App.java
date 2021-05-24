package com.barclays.interview.suitabilitycheck;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.barclays.interview.suitabilitycheck.engine.SuitabilityCheckById;
import com.barclays.interview.suitabilitycheck.validate.RuleInputGenerator;
import com.barclays.interview.suitabilitycheck.validate.RuleInputProcessor;

public class App {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<RuleInput> ruleInputList = new ArrayBlockingQueue<>(100);
		RuleInputGenerator gen = new RuleInputGenerator(ruleInputList, "T1");
		RuleInputGenerator gen2 = new RuleInputGenerator(ruleInputList, "T2");
		SuitabilityCheckById suitabilityCheckById = new SuitabilityCheckById();
		RuleInputProcessor ruleInputProcessor = new RuleInputProcessor(ruleInputList, suitabilityCheckById);
//		RuleInputProcessor ruleInputProcessor2 = new RuleInputProcessor(ruleInputList, suitabilityCheckById);
		Thread tgen1 = new Thread(gen);
		tgen1.start();
		Thread tgen2 = new Thread(gen2);
		tgen2.start();
		Thread t = new Thread(ruleInputProcessor);
		t.start();
//		Thread t2 = new Thread(ruleInputProcessor);
//		t2.start();
	}
}
