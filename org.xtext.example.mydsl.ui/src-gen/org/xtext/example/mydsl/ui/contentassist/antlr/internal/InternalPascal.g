/*
* generated by Xtext
*/
grammar InternalPascal;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.PascalGrammarAccess;

}

@parser::members {
 
 	private PascalGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGreetingsAssignment()); }
(rule__Model__GreetingsAssignment)*
{ after(grammarAccess.getModelAccess().getGreetingsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleGreeting
entryRuleGreeting 
:
{ before(grammarAccess.getGreetingRule()); }
	 ruleGreeting
{ after(grammarAccess.getGreetingRule()); } 
	 EOF 
;

// Rule Greeting
ruleGreeting
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGreetingAccess().getIdentifierParserRuleCall()); }
	ruleidentifier
{ after(grammarAccess.getGreetingAccess().getIdentifierParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleinteger_number
entryRuleinteger_number 
:
{ before(grammarAccess.getInteger_numberRule()); }
	 ruleinteger_number
{ after(grammarAccess.getInteger_numberRule()); } 
	 EOF 
;

// Rule integer_number
ruleinteger_number
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); }
	ruledigit_sequence
{ after(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleidentifier
entryRuleidentifier 
:
{ before(grammarAccess.getIdentifierRule()); }
	 ruleidentifier
{ after(grammarAccess.getIdentifierRule()); } 
	 EOF 
;

// Rule identifier
ruleidentifier
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIdentifierAccess().getGroup()); }
(rule__Identifier__Group__0)
{ after(grammarAccess.getIdentifierAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleletter
entryRuleletter 
:
{ before(grammarAccess.getLetterRule()); }
	 ruleletter
{ after(grammarAccess.getLetterRule()); } 
	 EOF 
;

// Rule letter
ruleletter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLetterAccess().getAlternatives()); }
(rule__Letter__Alternatives)
{ after(grammarAccess.getLetterAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuledigit
entryRuledigit 
:
{ before(grammarAccess.getDigitRule()); }
	 ruledigit
{ after(grammarAccess.getDigitRule()); } 
	 EOF 
;

// Rule digit
ruledigit
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDigitAccess().getAlternatives()); }
(rule__Digit__Alternatives)
{ after(grammarAccess.getDigitAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuledigit_sequence
entryRuledigit_sequence 
:
{ before(grammarAccess.getDigit_sequenceRule()); }
	 ruledigit_sequence
{ after(grammarAccess.getDigit_sequenceRule()); } 
	 EOF 
;

// Rule digit_sequence
ruledigit_sequence
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDigit_sequenceAccess().getGroup()); }
(rule__Digit_sequence__Group__0)
{ after(grammarAccess.getDigit_sequenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulesign
entryRulesign 
:
{ before(grammarAccess.getSignRule()); }
	 rulesign
{ after(grammarAccess.getSignRule()); } 
	 EOF 
;

// Rule sign
rulesign
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSignAccess().getAlternatives()); }
(rule__Sign__Alternatives)
{ after(grammarAccess.getSignAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleunsigned_digit_sequence
entryRuleunsigned_digit_sequence 
:
{ before(grammarAccess.getUnsigned_digit_sequenceRule()); }
	 ruleunsigned_digit_sequence
{ after(grammarAccess.getUnsigned_digit_sequenceRule()); } 
	 EOF 
;

// Rule unsigned_digit_sequence
ruleunsigned_digit_sequence
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUnsigned_digit_sequenceAccess().getGroup()); }
(rule__Unsigned_digit_sequence__Group__0)
{ after(grammarAccess.getUnsigned_digit_sequenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Identifier__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_1_0()); }
	ruleletter
{ after(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_1_0()); }
)

    |(
{ before(grammarAccess.getIdentifierAccess().getDigitParserRuleCall_1_1()); }
	ruledigit
{ after(grammarAccess.getIdentifierAccess().getDigitParserRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Letter__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLetterAccess().getAKeyword_0()); }

	'A' 

{ after(grammarAccess.getLetterAccess().getAKeyword_0()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getBKeyword_1()); }

	'B' 

{ after(grammarAccess.getLetterAccess().getBKeyword_1()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getCKeyword_2()); }

	'C' 

{ after(grammarAccess.getLetterAccess().getCKeyword_2()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getDKeyword_3()); }

	'D' 

{ after(grammarAccess.getLetterAccess().getDKeyword_3()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getEKeyword_4()); }

	'E' 

{ after(grammarAccess.getLetterAccess().getEKeyword_4()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getFKeyword_5()); }

	'F' 

{ after(grammarAccess.getLetterAccess().getFKeyword_5()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getGKeyword_6()); }

	'G' 

{ after(grammarAccess.getLetterAccess().getGKeyword_6()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getHKeyword_7()); }

	'H' 

{ after(grammarAccess.getLetterAccess().getHKeyword_7()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getIKeyword_8()); }

	'I' 

{ after(grammarAccess.getLetterAccess().getIKeyword_8()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getJKeyword_9()); }

	'J' 

{ after(grammarAccess.getLetterAccess().getJKeyword_9()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getKKeyword_10()); }

	'K' 

{ after(grammarAccess.getLetterAccess().getKKeyword_10()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getLKeyword_11()); }

	'L' 

{ after(grammarAccess.getLetterAccess().getLKeyword_11()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getMKeyword_12()); }

	'M' 

{ after(grammarAccess.getLetterAccess().getMKeyword_12()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getNKeyword_13()); }

	'N' 

{ after(grammarAccess.getLetterAccess().getNKeyword_13()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getOKeyword_14()); }

	'O' 

{ after(grammarAccess.getLetterAccess().getOKeyword_14()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getPKeyword_15()); }

	'P' 

{ after(grammarAccess.getLetterAccess().getPKeyword_15()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getQKeyword_16()); }

	'Q' 

{ after(grammarAccess.getLetterAccess().getQKeyword_16()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getRKeyword_17()); }

	'R' 

{ after(grammarAccess.getLetterAccess().getRKeyword_17()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getSKeyword_18()); }

	'S' 

{ after(grammarAccess.getLetterAccess().getSKeyword_18()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getTKeyword_19()); }

	'T' 

{ after(grammarAccess.getLetterAccess().getTKeyword_19()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getUKeyword_20()); }

	'U' 

{ after(grammarAccess.getLetterAccess().getUKeyword_20()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getVKeyword_21()); }

	'V' 

{ after(grammarAccess.getLetterAccess().getVKeyword_21()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getWKeyword_22()); }

	'W' 

{ after(grammarAccess.getLetterAccess().getWKeyword_22()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getXKeyword_23()); }

	'X' 

{ after(grammarAccess.getLetterAccess().getXKeyword_23()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getYKeyword_24()); }

	'Y' 

{ after(grammarAccess.getLetterAccess().getYKeyword_24()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getZKeyword_25()); }

	'Z' 

{ after(grammarAccess.getLetterAccess().getZKeyword_25()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getAKeyword_26()); }

	'a' 

{ after(grammarAccess.getLetterAccess().getAKeyword_26()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getBKeyword_27()); }

	'b' 

{ after(grammarAccess.getLetterAccess().getBKeyword_27()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getCKeyword_28()); }

	'c' 

{ after(grammarAccess.getLetterAccess().getCKeyword_28()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getDKeyword_29()); }

	'd' 

{ after(grammarAccess.getLetterAccess().getDKeyword_29()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getEKeyword_30()); }

	'e' 

{ after(grammarAccess.getLetterAccess().getEKeyword_30()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getFKeyword_31()); }

	'f' 

{ after(grammarAccess.getLetterAccess().getFKeyword_31()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getGKeyword_32()); }

	'g' 

{ after(grammarAccess.getLetterAccess().getGKeyword_32()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getHKeyword_33()); }

	'h' 

{ after(grammarAccess.getLetterAccess().getHKeyword_33()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getIKeyword_34()); }

	'i' 

{ after(grammarAccess.getLetterAccess().getIKeyword_34()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getJKeyword_35()); }

	'j' 

{ after(grammarAccess.getLetterAccess().getJKeyword_35()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getKKeyword_36()); }

	'k' 

{ after(grammarAccess.getLetterAccess().getKKeyword_36()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getLKeyword_37()); }

	'l' 

{ after(grammarAccess.getLetterAccess().getLKeyword_37()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getMKeyword_38()); }

	'm' 

{ after(grammarAccess.getLetterAccess().getMKeyword_38()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getNKeyword_39()); }

	'n' 

{ after(grammarAccess.getLetterAccess().getNKeyword_39()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getOKeyword_40()); }

	'o' 

{ after(grammarAccess.getLetterAccess().getOKeyword_40()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getPKeyword_41()); }

	'p' 

{ after(grammarAccess.getLetterAccess().getPKeyword_41()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getQKeyword_42()); }

	'q' 

{ after(grammarAccess.getLetterAccess().getQKeyword_42()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getRKeyword_43()); }

	'r' 

{ after(grammarAccess.getLetterAccess().getRKeyword_43()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getSKeyword_44()); }

	's' 

{ after(grammarAccess.getLetterAccess().getSKeyword_44()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getTKeyword_45()); }

	't' 

{ after(grammarAccess.getLetterAccess().getTKeyword_45()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getUKeyword_46()); }

	'u' 

{ after(grammarAccess.getLetterAccess().getUKeyword_46()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getVKeyword_47()); }

	'v' 

{ after(grammarAccess.getLetterAccess().getVKeyword_47()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getWKeyword_48()); }

	'w' 

{ after(grammarAccess.getLetterAccess().getWKeyword_48()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getXKeyword_49()); }

	'x' 

{ after(grammarAccess.getLetterAccess().getXKeyword_49()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getYKeyword_50()); }

	'y' 

{ after(grammarAccess.getLetterAccess().getYKeyword_50()); }
)

    |(
{ before(grammarAccess.getLetterAccess().getZKeyword_51()); }

	'z' 

{ after(grammarAccess.getLetterAccess().getZKeyword_51()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Digit__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); }

	'0' 

{ after(grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitOneKeyword_1()); }

	'1' 

{ after(grammarAccess.getDigitAccess().getDigitOneKeyword_1()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); }

	'2' 

{ after(grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); }

	'3' 

{ after(grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitFourKeyword_4()); }

	'4' 

{ after(grammarAccess.getDigitAccess().getDigitFourKeyword_4()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); }

	'5' 

{ after(grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitSixKeyword_6()); }

	'6' 

{ after(grammarAccess.getDigitAccess().getDigitSixKeyword_6()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); }

	'7' 

{ after(grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitEightKeyword_8()); }

	'8' 

{ after(grammarAccess.getDigitAccess().getDigitEightKeyword_8()); }
)

    |(
{ before(grammarAccess.getDigitAccess().getDigitNineKeyword_9()); }

	'9' 

{ after(grammarAccess.getDigitAccess().getDigitNineKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sign__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSignAccess().getPlusSignKeyword_0()); }

	'+' 

{ after(grammarAccess.getSignAccess().getPlusSignKeyword_0()); }
)

    |(
{ before(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); }

	'-' 

{ after(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Identifier__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Identifier__Group__0__Impl
	rule__Identifier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Identifier__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); }
	ruleletter
{ after(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Identifier__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Identifier__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Identifier__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIdentifierAccess().getAlternatives_1()); }
(rule__Identifier__Alternatives_1)?
{ after(grammarAccess.getIdentifierAccess().getAlternatives_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Digit_sequence__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Digit_sequence__Group__0__Impl
	rule__Digit_sequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Digit_sequence__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); }
(	rulesign)?
{ after(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Digit_sequence__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Digit_sequence__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Digit_sequence__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); }
	ruleunsigned_digit_sequence
{ after(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Unsigned_digit_sequence__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Unsigned_digit_sequence__Group__0__Impl
	rule__Unsigned_digit_sequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unsigned_digit_sequence__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); }
	ruledigit
{ after(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Unsigned_digit_sequence__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Unsigned_digit_sequence__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unsigned_digit_sequence__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); }
(	ruledigit)*
{ after(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__GreetingsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
	ruleGreeting{ after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


