/*
* generated by Xtext
*/
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PascalGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cGreetingsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cGreetingsGreetingParserRuleCall_0 = (RuleCall)cGreetingsAssignment.eContents().get(0);
		
		//Model:
		//	greetings+=Greeting*;
		public ParserRule getRule() { return rule; }

		//greetings+=Greeting*
		public Assignment getGreetingsAssignment() { return cGreetingsAssignment; }

		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_0() { return cGreetingsGreetingParserRuleCall_0; }
	}

	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Greeting");
		private final RuleCall cIdentifierParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Greeting:
		//	identifier;
		public ParserRule getRule() { return rule; }

		//identifier
		public RuleCall getIdentifierParserRuleCall() { return cIdentifierParserRuleCall; }
	}

	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "label");
		private final RuleCall cInteger_numberParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//label:
		//	integer_number;
		public ParserRule getRule() { return rule; }

		//integer_number
		public RuleCall getInteger_numberParserRuleCall() { return cInteger_numberParserRuleCall; }
	}

	public class Integer_numberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "integer_number");
		private final RuleCall cDigit_sequenceParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//integer_number:
		//	digit_sequence;
		public ParserRule getRule() { return rule; }

		//digit_sequence
		public RuleCall getDigit_sequenceParserRuleCall() { return cDigit_sequenceParserRuleCall; }
	}

	public class IdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "identifier");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLetterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cLetterParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cDigitParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//identifier:
		//	letter (letter | digit)?;
		public ParserRule getRule() { return rule; }

		//letter (letter | digit)?
		public Group getGroup() { return cGroup; }

		//letter
		public RuleCall getLetterParserRuleCall_0() { return cLetterParserRuleCall_0; }

		//(letter | digit)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//letter
		public RuleCall getLetterParserRuleCall_1_0() { return cLetterParserRuleCall_1_0; }

		//digit
		public RuleCall getDigitParserRuleCall_1_1() { return cDigitParserRuleCall_1_1; }
	}

	public class LetterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "letter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cAKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cCKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cDKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cEKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cFKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cGKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cHKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cIKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		private final Keyword cJKeyword_9 = (Keyword)cAlternatives.eContents().get(9);
		private final Keyword cKKeyword_10 = (Keyword)cAlternatives.eContents().get(10);
		private final Keyword cLKeyword_11 = (Keyword)cAlternatives.eContents().get(11);
		private final Keyword cMKeyword_12 = (Keyword)cAlternatives.eContents().get(12);
		private final Keyword cNKeyword_13 = (Keyword)cAlternatives.eContents().get(13);
		private final Keyword cOKeyword_14 = (Keyword)cAlternatives.eContents().get(14);
		private final Keyword cPKeyword_15 = (Keyword)cAlternatives.eContents().get(15);
		private final Keyword cQKeyword_16 = (Keyword)cAlternatives.eContents().get(16);
		private final Keyword cRKeyword_17 = (Keyword)cAlternatives.eContents().get(17);
		private final Keyword cSKeyword_18 = (Keyword)cAlternatives.eContents().get(18);
		private final Keyword cTKeyword_19 = (Keyword)cAlternatives.eContents().get(19);
		private final Keyword cUKeyword_20 = (Keyword)cAlternatives.eContents().get(20);
		private final Keyword cVKeyword_21 = (Keyword)cAlternatives.eContents().get(21);
		private final Keyword cWKeyword_22 = (Keyword)cAlternatives.eContents().get(22);
		private final Keyword cXKeyword_23 = (Keyword)cAlternatives.eContents().get(23);
		private final Keyword cYKeyword_24 = (Keyword)cAlternatives.eContents().get(24);
		private final Keyword cZKeyword_25 = (Keyword)cAlternatives.eContents().get(25);
		private final Keyword cAKeyword_26 = (Keyword)cAlternatives.eContents().get(26);
		private final Keyword cBKeyword_27 = (Keyword)cAlternatives.eContents().get(27);
		private final Keyword cCKeyword_28 = (Keyword)cAlternatives.eContents().get(28);
		private final Keyword cDKeyword_29 = (Keyword)cAlternatives.eContents().get(29);
		private final Keyword cEKeyword_30 = (Keyword)cAlternatives.eContents().get(30);
		private final Keyword cFKeyword_31 = (Keyword)cAlternatives.eContents().get(31);
		private final Keyword cGKeyword_32 = (Keyword)cAlternatives.eContents().get(32);
		private final Keyword cHKeyword_33 = (Keyword)cAlternatives.eContents().get(33);
		private final Keyword cIKeyword_34 = (Keyword)cAlternatives.eContents().get(34);
		private final Keyword cJKeyword_35 = (Keyword)cAlternatives.eContents().get(35);
		private final Keyword cKKeyword_36 = (Keyword)cAlternatives.eContents().get(36);
		private final Keyword cLKeyword_37 = (Keyword)cAlternatives.eContents().get(37);
		private final Keyword cMKeyword_38 = (Keyword)cAlternatives.eContents().get(38);
		private final Keyword cNKeyword_39 = (Keyword)cAlternatives.eContents().get(39);
		private final Keyword cOKeyword_40 = (Keyword)cAlternatives.eContents().get(40);
		private final Keyword cPKeyword_41 = (Keyword)cAlternatives.eContents().get(41);
		private final Keyword cQKeyword_42 = (Keyword)cAlternatives.eContents().get(42);
		private final Keyword cRKeyword_43 = (Keyword)cAlternatives.eContents().get(43);
		private final Keyword cSKeyword_44 = (Keyword)cAlternatives.eContents().get(44);
		private final Keyword cTKeyword_45 = (Keyword)cAlternatives.eContents().get(45);
		private final Keyword cUKeyword_46 = (Keyword)cAlternatives.eContents().get(46);
		private final Keyword cVKeyword_47 = (Keyword)cAlternatives.eContents().get(47);
		private final Keyword cWKeyword_48 = (Keyword)cAlternatives.eContents().get(48);
		private final Keyword cXKeyword_49 = (Keyword)cAlternatives.eContents().get(49);
		private final Keyword cYKeyword_50 = (Keyword)cAlternatives.eContents().get(50);
		private final Keyword cZKeyword_51 = (Keyword)cAlternatives.eContents().get(51);
		
		//letter:
		//	"A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T"
		//	| "U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" |
		//	"n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z";
		public ParserRule getRule() { return rule; }

		//"A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T" |
		//"U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n"
		//| "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"A"
		public Keyword getAKeyword_0() { return cAKeyword_0; }

		//"B"
		public Keyword getBKeyword_1() { return cBKeyword_1; }

		//"C"
		public Keyword getCKeyword_2() { return cCKeyword_2; }

		//"D"
		public Keyword getDKeyword_3() { return cDKeyword_3; }

		//"E"
		public Keyword getEKeyword_4() { return cEKeyword_4; }

		//"F"
		public Keyword getFKeyword_5() { return cFKeyword_5; }

		//"G"
		public Keyword getGKeyword_6() { return cGKeyword_6; }

		//"H"
		public Keyword getHKeyword_7() { return cHKeyword_7; }

		//"I"
		public Keyword getIKeyword_8() { return cIKeyword_8; }

		//"J"
		public Keyword getJKeyword_9() { return cJKeyword_9; }

		//"K"
		public Keyword getKKeyword_10() { return cKKeyword_10; }

		//"L"
		public Keyword getLKeyword_11() { return cLKeyword_11; }

		//"M"
		public Keyword getMKeyword_12() { return cMKeyword_12; }

		//"N"
		public Keyword getNKeyword_13() { return cNKeyword_13; }

		//"O"
		public Keyword getOKeyword_14() { return cOKeyword_14; }

		//"P"
		public Keyword getPKeyword_15() { return cPKeyword_15; }

		//"Q"
		public Keyword getQKeyword_16() { return cQKeyword_16; }

		//"R"
		public Keyword getRKeyword_17() { return cRKeyword_17; }

		//"S"
		public Keyword getSKeyword_18() { return cSKeyword_18; }

		//"T"
		public Keyword getTKeyword_19() { return cTKeyword_19; }

		//"U"
		public Keyword getUKeyword_20() { return cUKeyword_20; }

		//"V"
		public Keyword getVKeyword_21() { return cVKeyword_21; }

		//"W"
		public Keyword getWKeyword_22() { return cWKeyword_22; }

		//"X"
		public Keyword getXKeyword_23() { return cXKeyword_23; }

		//"Y"
		public Keyword getYKeyword_24() { return cYKeyword_24; }

		//"Z"
		public Keyword getZKeyword_25() { return cZKeyword_25; }

		//"a"
		public Keyword getAKeyword_26() { return cAKeyword_26; }

		//"b"
		public Keyword getBKeyword_27() { return cBKeyword_27; }

		//"c"
		public Keyword getCKeyword_28() { return cCKeyword_28; }

		//"d"
		public Keyword getDKeyword_29() { return cDKeyword_29; }

		//"e"
		public Keyword getEKeyword_30() { return cEKeyword_30; }

		//"f"
		public Keyword getFKeyword_31() { return cFKeyword_31; }

		//"g"
		public Keyword getGKeyword_32() { return cGKeyword_32; }

		//"h"
		public Keyword getHKeyword_33() { return cHKeyword_33; }

		//"i"
		public Keyword getIKeyword_34() { return cIKeyword_34; }

		//"j"
		public Keyword getJKeyword_35() { return cJKeyword_35; }

		//"k"
		public Keyword getKKeyword_36() { return cKKeyword_36; }

		//"l"
		public Keyword getLKeyword_37() { return cLKeyword_37; }

		//"m"
		public Keyword getMKeyword_38() { return cMKeyword_38; }

		//"n"
		public Keyword getNKeyword_39() { return cNKeyword_39; }

		//"o"
		public Keyword getOKeyword_40() { return cOKeyword_40; }

		//"p"
		public Keyword getPKeyword_41() { return cPKeyword_41; }

		//"q"
		public Keyword getQKeyword_42() { return cQKeyword_42; }

		//"r"
		public Keyword getRKeyword_43() { return cRKeyword_43; }

		//"s"
		public Keyword getSKeyword_44() { return cSKeyword_44; }

		//"t"
		public Keyword getTKeyword_45() { return cTKeyword_45; }

		//"u"
		public Keyword getUKeyword_46() { return cUKeyword_46; }

		//"v"
		public Keyword getVKeyword_47() { return cVKeyword_47; }

		//"w"
		public Keyword getWKeyword_48() { return cWKeyword_48; }

		//"x"
		public Keyword getXKeyword_49() { return cXKeyword_49; }

		//"y"
		public Keyword getYKeyword_50() { return cYKeyword_50; }

		//"z"
		public Keyword getZKeyword_51() { return cZKeyword_51; }
	}

	public class DigitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "digit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cDigitZeroKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cDigitOneKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cDigitTwoKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cDigitThreeKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cDigitFourKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cDigitFiveKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cDigitSixKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cDigitSevenKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cDigitEightKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		private final Keyword cDigitNineKeyword_9 = (Keyword)cAlternatives.eContents().get(9);
		
		//digit:
		//	"0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9";
		public ParserRule getRule() { return rule; }

		//"0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"0"
		public Keyword getDigitZeroKeyword_0() { return cDigitZeroKeyword_0; }

		//"1"
		public Keyword getDigitOneKeyword_1() { return cDigitOneKeyword_1; }

		//"2"
		public Keyword getDigitTwoKeyword_2() { return cDigitTwoKeyword_2; }

		//"3"
		public Keyword getDigitThreeKeyword_3() { return cDigitThreeKeyword_3; }

		//"4"
		public Keyword getDigitFourKeyword_4() { return cDigitFourKeyword_4; }

		//"5"
		public Keyword getDigitFiveKeyword_5() { return cDigitFiveKeyword_5; }

		//"6"
		public Keyword getDigitSixKeyword_6() { return cDigitSixKeyword_6; }

		//"7"
		public Keyword getDigitSevenKeyword_7() { return cDigitSevenKeyword_7; }

		//"8"
		public Keyword getDigitEightKeyword_8() { return cDigitEightKeyword_8; }

		//"9"
		public Keyword getDigitNineKeyword_9() { return cDigitNineKeyword_9; }
	}

	public class Digit_sequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "digit_sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSignParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cUnsigned_digit_sequenceParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//digit_sequence:
		//	sign? unsigned_digit_sequence;
		public ParserRule getRule() { return rule; }

		//sign? unsigned_digit_sequence
		public Group getGroup() { return cGroup; }

		//sign?
		public RuleCall getSignParserRuleCall_0() { return cSignParserRuleCall_0; }

		//unsigned_digit_sequence
		public RuleCall getUnsigned_digit_sequenceParserRuleCall_1() { return cUnsigned_digit_sequenceParserRuleCall_1; }
	}

	public class SignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sign");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPlusSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//sign:
		//	"+" | "-";
		public ParserRule getRule() { return rule; }

		//"+" | "-"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"+"
		public Keyword getPlusSignKeyword_0() { return cPlusSignKeyword_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
	}

	public class Unsigned_digit_sequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "unsigned_digit_sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDigitParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cDigitParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//unsigned_digit_sequence:
		//	digit digit*;
		public ParserRule getRule() { return rule; }

		//digit digit*
		public Group getGroup() { return cGroup; }

		//digit
		public RuleCall getDigitParserRuleCall_0() { return cDigitParserRuleCall_0; }

		//digit*
		public RuleCall getDigitParserRuleCall_1() { return cDigitParserRuleCall_1; }
	}
	
	
	private final ModelElements pModel;
	private final GreetingElements pGreeting;
	private final LabelElements pLabel;
	private final Integer_numberElements pInteger_number;
	private final IdentifierElements pIdentifier;
	private final LetterElements pLetter;
	private final DigitElements pDigit;
	private final Digit_sequenceElements pDigit_sequence;
	private final SignElements pSign;
	private final Unsigned_digit_sequenceElements pUnsigned_digit_sequence;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PascalGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pGreeting = new GreetingElements();
		this.pLabel = new LabelElements();
		this.pInteger_number = new Integer_numberElements();
		this.pIdentifier = new IdentifierElements();
		this.pLetter = new LetterElements();
		this.pDigit = new DigitElements();
		this.pDigit_sequence = new Digit_sequenceElements();
		this.pSign = new SignElements();
		this.pUnsigned_digit_sequence = new Unsigned_digit_sequenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.Pascal".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	greetings+=Greeting*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Greeting:
	//	identifier;
	public GreetingElements getGreetingAccess() {
		return pGreeting;
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}

	//label:
	//	integer_number;
	public LabelElements getLabelAccess() {
		return pLabel;
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}

	//integer_number:
	//	digit_sequence;
	public Integer_numberElements getInteger_numberAccess() {
		return pInteger_number;
	}
	
	public ParserRule getInteger_numberRule() {
		return getInteger_numberAccess().getRule();
	}

	//identifier:
	//	letter (letter | digit)?;
	public IdentifierElements getIdentifierAccess() {
		return pIdentifier;
	}
	
	public ParserRule getIdentifierRule() {
		return getIdentifierAccess().getRule();
	}

	//letter:
	//	"A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T"
	//	| "U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" |
	//	"n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z";
	public LetterElements getLetterAccess() {
		return pLetter;
	}
	
	public ParserRule getLetterRule() {
		return getLetterAccess().getRule();
	}

	//digit:
	//	"0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9";
	public DigitElements getDigitAccess() {
		return pDigit;
	}
	
	public ParserRule getDigitRule() {
		return getDigitAccess().getRule();
	}

	//digit_sequence:
	//	sign? unsigned_digit_sequence;
	public Digit_sequenceElements getDigit_sequenceAccess() {
		return pDigit_sequence;
	}
	
	public ParserRule getDigit_sequenceRule() {
		return getDigit_sequenceAccess().getRule();
	}

	//sign:
	//	"+" | "-";
	public SignElements getSignAccess() {
		return pSign;
	}
	
	public ParserRule getSignRule() {
		return getSignAccess().getRule();
	}

	//unsigned_digit_sequence:
	//	digit digit*;
	public Unsigned_digit_sequenceElements getUnsigned_digit_sequenceAccess() {
		return pUnsigned_digit_sequence;
	}
	
	public ParserRule getUnsigned_digit_sequenceRule() {
		return getUnsigned_digit_sequenceAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
