package com.codebind;

import java.io.PrintStream;

import javax.inject.Inject;

public class Greeter {
	
	public PhraseBuilder phraseBuilder;
	
    @Inject
    public Greeter(PhraseBuilder phraseBuilder) {
        this.phraseBuilder = phraseBuilder;
    }
    
	public void greet(PrintStream to, String name) {
		to.println(createGreeting(name));
	}

	public String createGreeting(String name) {
		return "Hello, " + name + "!";
	}
}
