package com.barclays.interview.suitabilitycheck.engine;

import com.barclays.interview.suitabilitycheck.RuleInput;
import com.barclays.interview.suitabilitycheck.RuleOutput;

public interface SuitabilityCheck {
	  RuleOutput check(RuleInput paramRuleInput);
}