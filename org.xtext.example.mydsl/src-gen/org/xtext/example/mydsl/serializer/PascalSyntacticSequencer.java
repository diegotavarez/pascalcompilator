package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.PascalGrammarAccess;

@SuppressWarnings("all")
public class PascalSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PascalGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FunctionDesignator_ActualParameterListKeyword_1_q;
	protected AbstractElementAlias match_case_statement_SEMICOLONTerminalRuleCall_5_q;
	protected AbstractElementAlias match_constant___HyphenMinusKeyword_0_0_1_or_PlusSignKeyword_0_0_0__q;
	protected AbstractElementAlias match_field_list_SEMICOLONTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0;
	protected AbstractElementAlias match_simple_expression___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q;
	protected AbstractElementAlias match_structured_type_PackedKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PascalGrammarAccess) access;
		match_FunctionDesignator_ActualParameterListKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFunctionDesignatorAccess().getActualParameterListKeyword_1());
		match_case_statement_SEMICOLONTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getCase_statementAccess().getSEMICOLONTerminalRuleCall_5());
		match_constant___HyphenMinusKeyword_0_0_1_or_PlusSignKeyword_0_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getConstantAccess().getHyphenMinusKeyword_0_0_1()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getPlusSignKeyword_0_0_0()));
		match_field_list_SEMICOLONTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getField_listAccess().getSEMICOLONTerminalRuleCall_1_1());
		match_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFor_statementAccess().getDowntoKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getFor_statementAccess().getToKeyword_4_0()));
		match_simple_expression___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSimple_expressionAccess().getHyphenMinusKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getSimple_expressionAccess().getPlusSignKeyword_0_0()));
		match_structured_type_PackedKeyword_0_q = new TokenAlias(false, true, grammarAccess.getStructured_typeAccess().getPackedKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getADDITIONOPERATORRule())
			return getADDITIONOPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASSIGNMENT_SIGNRule())
			return getASSIGNMENT_SIGNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCARETRule())
			return getCARETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDIAERESISRule())
			return getDIAERESISToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDENTIFIERRule())
			return getIDENTIFIERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIGRule())
			return getIGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFT_BRACKETSRule())
			return getLEFT_BRACKETSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFT_PARENTHESISRule())
			return getLEFT_PARENTHESISToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMULTIPLICATIONOPERATORRule())
			return getMULTIPLICATIONOPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHT_BRACKETSRule())
			return getRIGHT_BRACKETSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHT_PARENTHESISRule())
			return getRIGHT_PARENTHESISToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ADDITIONOPERATOR:
	 *     '+' | '-' | 'or';
	 */
	protected String getADDITIONOPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * terminal ASSIGNMENT_SIGN : ":=";
	 */
	protected String getASSIGNMENT_SIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	
	/**
	 * terminal CARET : "^";
	 */
	protected String getCARETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	
	/**
	 * terminal COLON : ":";
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMMA : ",";
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal DIAERESIS : "..";
	 */
	protected String getDIAERESISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "..";
	}
	
	/**
	 * terminal DOT : ".";
	 */
	protected String getDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal IDENTIFIER:
	 *     (('a'..'z')|('A'..'Z')|'_') (('a'..'z')|('A'..'Z')|'_'|('0'..'9'))*;
	 */
	protected String getIDENTIFIERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal IG: "=";
	 */
	protected String getIGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal LEFT_BRACKETS : "[";
	 */
	protected String getLEFT_BRACKETSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal LEFT_PARENTHESIS : "(";
	 */
	protected String getLEFT_PARENTHESISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal MULTIPLICATIONOPERATOR:
	 *     MULTIP_SIGN | DIV_SIGN | 'div' | 'mod' | 'and';
	 */
	protected String getMULTIPLICATIONOPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * terminal RIGHT_BRACKETS : "]";
	 */
	protected String getRIGHT_BRACKETSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal RIGHT_PARENTHESIS : ")";
	 */
	protected String getRIGHT_PARENTHESISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SEMICOLON : ";";
	 */
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_FunctionDesignator_ActualParameterListKeyword_1_q.equals(syntax))
				emit_FunctionDesignator_ActualParameterListKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_case_statement_SEMICOLONTerminalRuleCall_5_q.equals(syntax))
				emit_case_statement_SEMICOLONTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_constant___HyphenMinusKeyword_0_0_1_or_PlusSignKeyword_0_0_0__q.equals(syntax))
				emit_constant___HyphenMinusKeyword_0_0_1_or_PlusSignKeyword_0_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_field_list_SEMICOLONTerminalRuleCall_1_1_q.equals(syntax))
				emit_field_list_SEMICOLONTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0.equals(syntax))
				emit_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_simple_expression___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q.equals(syntax))
				emit_simple_expression___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_structured_type_PackedKeyword_0_q.equals(syntax))
				emit_structured_type_PackedKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'actualParameterList'?
	 */
	protected void emit_FunctionDesignator_ActualParameterListKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON?
	 */
	protected void emit_case_statement_SEMICOLONTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('+' | '-')?
	 */
	protected void emit_constant___HyphenMinusKeyword_0_0_1_or_PlusSignKeyword_0_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON?
	 */
	protected void emit_field_list_SEMICOLONTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to' | 'downto'
	 */
	protected void emit_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('+' | '-')?
	 */
	protected void emit_simple_expression___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'packed'?
	 */
	protected void emit_structured_type_PackedKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
