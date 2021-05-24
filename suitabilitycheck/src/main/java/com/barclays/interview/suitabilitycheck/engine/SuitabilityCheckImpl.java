package com.barclays.interview.suitabilitycheck.engine;

import com.barclays.interview.suitabilitycheck.RuleInput;
import com.barclays.interview.suitabilitycheck.RuleOutput;

public class SuitabilityCheckImpl implements SuitabilityCheck {
  public RuleOutput check(RuleInput ruleInput) {
    RuleOutput ruleOutput = new RuleOutput();
    ruleOutput.setResult(false);
    if (ruleInput.getProduct() != null && ruleInput.getProduct().startsWith("Fund") && 
      ruleInput.getClient() != null && ruleInput.getClient().startsWith("J")) {
    	ruleOutput.setResult(true); 
    }
    return ruleOutput;
  }
}
