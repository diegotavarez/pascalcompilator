/*
* generated by Xtext
*/
grammar InternalPascal;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.PascalGrammarAccess;

}

@parser::members {

 	private PascalGrammarAccess grammarAccess;
 	
    public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected PascalGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0()); 
	    }
		lv_programs_0_0=ruleprogram		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"programs",
        		lv_programs_0_0, 
        		"program");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;







// Entry rule entryRuleprogram
entryRuleprogram returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); } 
	 iv_ruleprogram=ruleprogram 
	 { $current=$iv_ruleprogram.current.getText(); }  
	 EOF 
;

// Rule program
ruleprogram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getProgramAccess().getProgram_headingParserRuleCall_0()); 
    }
    this_program_heading_0=ruleprogram_heading    {
		$current.merge(this_program_heading_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    { 
        newCompositeNode(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
    }
    this_block_1=ruleblock    {
		$current.merge(this_block_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleprogram_heading
entryRuleprogram_heading returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgram_headingRule()); } 
	 iv_ruleprogram_heading=ruleprogram_heading 
	 { $current=$iv_ruleprogram_heading.current.getText(); }  
	 EOF 
;

// Rule program_heading
ruleprogram_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='program' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifierParserRuleCall_1()); 
    }
    this_identifier_1=ruleidentifier    {
		$current.merge(this_identifier_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='(' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2()); 
    }

    { 
        newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_3()); 
    }
    this_identifier_list_3=ruleidentifier_list    {
		$current.merge(this_identifier_list_3);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw=')' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_4()); 
    }

	kw=';' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getProgram_headingAccess().getSemicolonKeyword_5()); 
    }
)
    ;





// Entry rule entryRuleblock
entryRuleblock returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getBlockRule()); } 
	 iv_ruleblock=ruleblock 
	 { $current=$iv_ruleblock.current.getText(); }  
	 EOF 
;

// Rule block
ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
    }
    this_declaration_part_0=ruledeclaration_part    {
		$current.merge(this_declaration_part_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    { 
        newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
    }
    this_statement_part_1=rulestatement_part    {
		$current.merge(this_statement_part_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuledeclaration_part
entryRuledeclaration_part returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeclaration_partRule()); } 
	 iv_ruledeclaration_part=ruledeclaration_part 
	 { $current=$iv_ruledeclaration_part.current.getText(); }  
	 EOF 
;

// Rule declaration_part
ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='declaration_part' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDeclaration_partAccess().getDeclaration_partKeyword()); 
    }

    ;





// Entry rule entryRulestatement_part
entryRulestatement_part returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatement_partRule()); } 
	 iv_rulestatement_part=rulestatement_part 
	 { $current=$iv_rulestatement_part.current.getText(); }  
	 EOF 
;

// Rule statement_part
rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='statement_part' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getStatement_partAccess().getStatement_partKeyword()); 
    }

    ;

















// Entry rule entryRuletype
entryRuletype returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); } 
	 iv_ruletype=ruletype 
	 { $current=$iv_ruletype.current.getText(); }  
	 EOF 
;

// Rule type
ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='simple_type' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getSimple_typeKeyword_0()); 
    }

    |
	kw='structured_type' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getStructured_typeKeyword_1()); 
    }

    |
	kw='pointer_type' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getPointer_typeKeyword_2()); 
    }

    |
	kw='type_identifier' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getType_identifierKeyword_3()); 
    }
)
    ;







// Entry rule entryRuleidentifier
entryRuleidentifier returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getIdentifierRule()); } 
	 iv_ruleidentifier=ruleidentifier 
	 { $current=$iv_ruleidentifier.current.getText(); }  
	 EOF 
;

// Rule identifier
ruleidentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); 
    }
    this_letter_0=ruleletter    {
		$current.merge(this_letter_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    { 
        newCompositeNode(grammarAccess.getIdentifierAccess().getIdentifier2ParserRuleCall_1()); 
    }
    this_identifier2_1=ruleidentifier2    {
		$current.merge(this_identifier2_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleidentifier2
entryRuleidentifier2 returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getIdentifier2Rule()); } 
	 iv_ruleidentifier2=ruleidentifier2 
	 { $current=$iv_ruleidentifier2.current.getText(); }  
	 EOF 
;

// Rule identifier2
ruleidentifier2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getIdentifier2Access().getLetterParserRuleCall_0()); 
    }
    this_letter_0=ruleletter    {
		$current.merge(this_letter_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getIdentifier2Access().getDigitParserRuleCall_1()); 
    }
    this_digit_1=ruledigit    {
		$current.merge(this_digit_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*
    ;





// Entry rule entryRulefield_identifier
entryRulefield_identifier returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getField_identifierRule()); } 
	 iv_rulefield_identifier=rulefield_identifier 
	 { $current=$iv_rulefield_identifier.current.getText(); }  
	 EOF 
;

// Rule field_identifier
rulefield_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getField_identifierAccess().getIdentifierParserRuleCall()); 
    }
    this_identifier_0=ruleidentifier    {
		$current.merge(this_identifier_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;







// Entry rule entryRulevariable_identifier
entryRulevariable_identifier returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariable_identifierRule()); } 
	 iv_rulevariable_identifier=rulevariable_identifier 
	 { $current=$iv_rulevariable_identifier.current.getText(); }  
	 EOF 
;

// Rule variable_identifier
rulevariable_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getVariable_identifierAccess().getIdentifierParserRuleCall()); 
    }
    this_identifier_0=ruleidentifier    {
		$current.merge(this_identifier_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;













// Entry rule entryRuleidentifier_list
entryRuleidentifier_list returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getIdentifier_listRule()); } 
	 iv_ruleidentifier_list=ruleidentifier_list 
	 { $current=$iv_ruleidentifier_list.current.getText(); }  
	 EOF 
;

// Rule identifier_list
ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_0()); 
    }
    this_identifier_0=ruleidentifier    {
		$current.merge(this_identifier_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_1_1()); 
    }
    this_identifier_2=ruleidentifier    {
		$current.merge(this_identifier_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Entry rule entryRuleinteger_number
entryRuleinteger_number returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getInteger_numberRule()); } 
	 iv_ruleinteger_number=ruleinteger_number 
	 { $current=$iv_ruleinteger_number.current.getText(); }  
	 EOF 
;

// Rule integer_number
ruleinteger_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
    }
    this_digit_sequence_0=ruledigit_sequence    {
		$current.merge(this_digit_sequence_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;







// Entry rule entryRuleunsigned_digit_sequence
entryRuleunsigned_digit_sequence returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getUnsigned_digit_sequenceRule()); } 
	 iv_ruleunsigned_digit_sequence=ruleunsigned_digit_sequence 
	 { $current=$iv_ruleunsigned_digit_sequence.current.getText(); }  
	 EOF 
;

// Rule unsigned_digit_sequence
ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); 
    }
    this_digit_0=ruledigit    {
		$current.merge(this_digit_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
    { 
        newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); 
    }
    this_digit_1=ruledigit    {
		$current.merge(this_digit_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Entry rule entryRuledigit_sequence
entryRuledigit_sequence returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDigit_sequenceRule()); } 
	 iv_ruledigit_sequence=ruledigit_sequence 
	 { $current=$iv_ruledigit_sequence.current.getText(); }  
	 EOF 
;

// Rule digit_sequence
ruledigit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    { 
        newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
    }
    this_sign_0=rulesign    {
		$current.merge(this_sign_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?
    { 
        newCompositeNode(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 
    }
    this_unsigned_digit_sequence_1=ruleunsigned_digit_sequence    {
		$current.merge(this_unsigned_digit_sequence_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRulesign
entryRulesign returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSignRule()); } 
	 iv_rulesign=rulesign 
	 { $current=$iv_rulesign.current.getText(); }  
	 EOF 
;

// Rule sign
rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='+' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
    }

    |
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleletter
entryRuleletter returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getLetterRule()); } 
	 iv_ruleletter=ruleletter 
	 { $current=$iv_ruleletter.current.getText(); }  
	 EOF 
;

// Rule letter
ruleletter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='A' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_0()); 
    }

    |
	kw='B' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_1()); 
    }

    |
	kw='C' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_2()); 
    }

    |
	kw='D' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_3()); 
    }

    |
	kw='E' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_4()); 
    }

    |
	kw='F' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_5()); 
    }

    |
	kw='G' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_6()); 
    }

    |
	kw='H' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_7()); 
    }

    |
	kw='I' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_8()); 
    }

    |
	kw='J' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_9()); 
    }

    |
	kw='K' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_10()); 
    }

    |
	kw='L' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_11()); 
    }

    |
	kw='M' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_12()); 
    }

    |
	kw='N' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_13()); 
    }

    |
	kw='O' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_14()); 
    }

    |
	kw='P' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_15()); 
    }

    |
	kw='Q' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_16()); 
    }

    |
	kw='R' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_17()); 
    }

    |
	kw='S' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_18()); 
    }

    |
	kw='T' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_19()); 
    }

    |
	kw='U' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_20()); 
    }

    |
	kw='V' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_21()); 
    }

    |
	kw='W' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_22()); 
    }

    |
	kw='X' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_23()); 
    }

    |
	kw='Y' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_24()); 
    }

    |
	kw='Z' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getZKeyword_25()); 
    }

    |
	kw='a' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_26()); 
    }

    |
	kw='b' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_27()); 
    }

    |
	kw='c' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_28()); 
    }

    |
	kw='d' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_29()); 
    }

    |
	kw='e' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_30()); 
    }

    |
	kw='f' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_31()); 
    }

    |
	kw='g' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_32()); 
    }

    |
	kw='h' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_33()); 
    }

    |
	kw='i' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_34()); 
    }

    |
	kw='j' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_35()); 
    }

    |
	kw='k' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_36()); 
    }

    |
	kw='l' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_37()); 
    }

    |
	kw='m' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_38()); 
    }

    |
	kw='n' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_39()); 
    }

    |
	kw='o' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_40()); 
    }

    |
	kw='p' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_41()); 
    }

    |
	kw='q' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_42()); 
    }

    |
	kw='r' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_43()); 
    }

    |
	kw='s' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_44()); 
    }

    |
	kw='t' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_45()); 
    }

    |
	kw='u' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_46()); 
    }

    |
	kw='v' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_47()); 
    }

    |
	kw='w' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_48()); 
    }

    |
	kw='x' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_49()); 
    }

    |
	kw='y' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_50()); 
    }

    |
	kw='z' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLetterAccess().getZKeyword_51()); 
    }
)
    ;





// Entry rule entryRuledigit
entryRuledigit returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDigitRule()); } 
	 iv_ruledigit=ruledigit 
	 { $current=$iv_ruledigit.current.getText(); }  
	 EOF 
;

// Rule digit
ruledigit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='0' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
    }

    |
	kw='1' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
    }

    |
	kw='2' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
    }

    |
	kw='3' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
    }

    |
	kw='4' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
    }

    |
	kw='5' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
    }

    |
	kw='6' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
    }

    |
	kw='7' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
    }

    |
	kw='8' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
    }

    |
	kw='9' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDigitAccess().getDigitNineKeyword_9()); 
    }
)
    ;





// Entry rule entryRulelabel
entryRulelabel returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getLabelRule()); } 
	 iv_rulelabel=rulelabel 
	 { $current=$iv_rulelabel.current.getText(); }  
	 EOF 
;

// Rule label
rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getLabelAccess().getInteger_numberParserRuleCall()); 
    }
    this_integer_number_0=ruleinteger_number    {
		$current.merge(this_integer_number_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


