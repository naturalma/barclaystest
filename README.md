# barclaystest

App.java is the main program, it creates two threads each of which will create rule input objects every 100ms for suitability check and put it into a queue, 
it also creates a thread to process the rule input objects for mock suitability check, and output the suitability check results.  
