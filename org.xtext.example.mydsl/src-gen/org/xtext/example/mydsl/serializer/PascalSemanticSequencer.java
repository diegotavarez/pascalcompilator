package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.pascal.DeclarationPart;
import org.xtext.example.mydsl.pascal.ElementList;
import org.xtext.example.mydsl.pascal.ExpressionList;
import org.xtext.example.mydsl.pascal.FunctionDesignator;
import org.xtext.example.mydsl.pascal.Model;
import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.Set;
import org.xtext.example.mydsl.pascal.Variable1;
import org.xtext.example.mydsl.pascal.array_type;
import org.xtext.example.mydsl.pascal.assignment_statement;
import org.xtext.example.mydsl.pascal.block;
import org.xtext.example.mydsl.pascal.bound_specification;
import org.xtext.example.mydsl.pascal.case_label_list;
import org.xtext.example.mydsl.pascal.case_limb;
import org.xtext.example.mydsl.pascal.case_statement;
import org.xtext.example.mydsl.pascal.compound_statement;
import org.xtext.example.mydsl.pascal.conditional_statement;
import org.xtext.example.mydsl.pascal.constant;
import org.xtext.example.mydsl.pascal.constant_definition_part;
import org.xtext.example.mydsl.pascal.enumerated_type;
import org.xtext.example.mydsl.pascal.expression;
import org.xtext.example.mydsl.pascal.factor;
import org.xtext.example.mydsl.pascal.field_list;
import org.xtext.example.mydsl.pascal.file_type;
import org.xtext.example.mydsl.pascal.fixed_part;
import org.xtext.example.mydsl.pascal.for_statement;
import org.xtext.example.mydsl.pascal.formal_parameter_list;
import org.xtext.example.mydsl.pascal.formal_parameter_section;
import org.xtext.example.mydsl.pascal.function_declaration;
import org.xtext.example.mydsl.pascal.function_heading;
import org.xtext.example.mydsl.pascal.identifier_list;
import org.xtext.example.mydsl.pascal.if_statement;
import org.xtext.example.mydsl.pascal.label;
import org.xtext.example.mydsl.pascal.label_declaration_part;
import org.xtext.example.mydsl.pascal.number;
import org.xtext.example.mydsl.pascal.packed_conformant_array_schema;
import org.xtext.example.mydsl.pascal.parameter_type;
import org.xtext.example.mydsl.pascal.pointer_type;
import org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part;
import org.xtext.example.mydsl.pascal.procedure_declaration;
import org.xtext.example.mydsl.pascal.procedure_heading;
import org.xtext.example.mydsl.pascal.procedure_statement;
import org.xtext.example.mydsl.pascal.program;
import org.xtext.example.mydsl.pascal.record_section;
import org.xtext.example.mydsl.pascal.record_type;
import org.xtext.example.mydsl.pascal.repeat_statement;
import org.xtext.example.mydsl.pascal.set_type;
import org.xtext.example.mydsl.pascal.simple_expression;
import org.xtext.example.mydsl.pascal.simple_type;
import org.xtext.example.mydsl.pascal.statement;
import org.xtext.example.mydsl.pascal.statement_sequence;
import org.xtext.example.mydsl.pascal.structured_type;
import org.xtext.example.mydsl.pascal.subrange_type;
import org.xtext.example.mydsl.pascal.tag_field;
import org.xtext.example.mydsl.pascal.term;
import org.xtext.example.mydsl.pascal.type;
import org.xtext.example.mydsl.pascal.type_definition_part;
import org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema;
import org.xtext.example.mydsl.pascal.unpacked_structured_type;
import org.xtext.example.mydsl.pascal.value_parameter_section;
import org.xtext.example.mydsl.pascal.variable;
import org.xtext.example.mydsl.pascal.variable_declaration;
import org.xtext.example.mydsl.pascal.variable_declaration_part;
import org.xtext.example.mydsl.pascal.variable_parameter_section;
import org.xtext.example.mydsl.pascal.variant;
import org.xtext.example.mydsl.pascal.variant_part;
import org.xtext.example.mydsl.pascal.while_statement;
import org.xtext.example.mydsl.pascal.with_statement;
import org.xtext.example.mydsl.services.PascalGrammarAccess;

@SuppressWarnings("all")
public class PascalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PascalGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PascalPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PascalPackage.DECLARATION_PART:
				if(context == grammarAccess.getDeclarationPartRule()) {
					sequence_DeclarationPart(context, (DeclarationPart) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ELEMENT_LIST:
				if(context == grammarAccess.getElementListRule()) {
					sequence_ElementList(context, (ElementList) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.EXPRESSION_LIST:
				if(context == grammarAccess.getExpressionListRule()) {
					sequence_ExpressionList(context, (ExpressionList) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FUNCTION_DESIGNATOR:
				if(context == grammarAccess.getFunctionDesignatorRule()) {
					sequence_FunctionDesignator(context, (FunctionDesignator) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SET:
				if(context == grammarAccess.getSetRule()) {
					sequence_Set(context, (Set) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE1:
				if(context == grammarAccess.getVariable1Rule()) {
					sequence_Variable1(context, (Variable1) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ARRAY_TYPE:
				if(context == grammarAccess.getArray_typeRule()) {
					sequence_array_type(context, (array_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getAssignment_statementRule() ||
				   context == grammarAccess.getSimple_statementRule()) {
					sequence_assignment_statement(context, (assignment_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_block(context, (block) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.BOUND_SPECIFICATION:
				if(context == grammarAccess.getBound_specificationRule()) {
					sequence_bound_specification(context, (bound_specification) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CASE_LABEL_LIST:
				if(context == grammarAccess.getCase_label_listRule()) {
					sequence_case_label_list(context, (case_label_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CASE_LIMB:
				if(context == grammarAccess.getCase_limbRule()) {
					sequence_case_limb(context, (case_limb) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CASE_STATEMENT:
				if(context == grammarAccess.getCase_statementRule()) {
					sequence_case_statement(context, (case_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.COMPOUND_STATEMENT:
				if(context == grammarAccess.getCompound_statementRule() ||
				   context == grammarAccess.getStructured_statementRule()) {
					sequence_compound_statement(context, (compound_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CONDITIONAL_STATEMENT:
				if(context == grammarAccess.getConditional_statementRule() ||
				   context == grammarAccess.getStructured_statementRule()) {
					sequence_conditional_statement(context, (conditional_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstant_definitionRule()) {
					sequence_constant(context, (constant) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CONSTANT_DEFINITION_PART:
				if(context == grammarAccess.getConstant_definition_partRule()) {
					sequence_constant_definition_part(context, (constant_definition_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ENUMERATED_TYPE:
				if(context == grammarAccess.getEnumerated_typeRule()) {
					sequence_enumerated_type(context, (enumerated_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_expression(context, (expression) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FACTOR:
				if(context == grammarAccess.getFactorRule()) {
					sequence_factor(context, (factor) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FIELD_LIST:
				if(context == grammarAccess.getField_listRule()) {
					sequence_field_list(context, (field_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FILE_TYPE:
				if(context == grammarAccess.getFile_typeRule()) {
					sequence_file_type(context, (file_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FIXED_PART:
				if(context == grammarAccess.getFixed_partRule()) {
					sequence_fixed_part(context, (fixed_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FOR_STATEMENT:
				if(context == grammarAccess.getFor_statementRule() ||
				   context == grammarAccess.getRepetitive_statementRule() ||
				   context == grammarAccess.getStructured_statementRule()) {
					sequence_for_statement(context, (for_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FORMAL_PARAMETER_LIST:
				if(context == grammarAccess.getFormal_parameter_listRule()) {
					sequence_formal_parameter_list(context, (formal_parameter_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FORMAL_PARAMETER_SECTION:
				if(context == grammarAccess.getFormal_parameter_sectionRule()) {
					sequence_formal_parameter_section(context, (formal_parameter_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getFunction_declarationRule()) {
					sequence_function_declaration(context, (function_declaration) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FUNCTION_HEADING:
				if(context == grammarAccess.getFunction_headingRule()) {
					sequence_function_heading(context, (function_heading) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.IDENTIFIER_LIST:
				if(context == grammarAccess.getIdentifier_listRule() ||
				   context == grammarAccess.getProgram_headingRule()) {
					sequence_identifier_list(context, (identifier_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.IF_STATEMENT:
				if(context == grammarAccess.getIf_statementRule()) {
					sequence_if_statement(context, (if_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.LABEL:
				if(context == grammarAccess.getGoto_statementRule() ||
				   context == grammarAccess.getLabelRule() ||
				   context == grammarAccess.getSimple_statementRule()) {
					sequence_label(context, (label) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule()) {
					sequence_label_statement(context, (label) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.LABEL_DECLARATION_PART:
				if(context == grammarAccess.getLabel_declaration_partRule()) {
					sequence_label_declaration_part(context, (label_declaration_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.NUMBER:
				if(context == grammarAccess.getNumberRule()) {
					sequence_number(context, (number) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA:
				if(context == grammarAccess.getConformant_array_schemaRule() ||
				   context == grammarAccess.getPacked_conformant_array_schemaRule()) {
					sequence_packed_conformant_array_schema(context, (packed_conformant_array_schema) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PARAMETER_TYPE:
				if(context == grammarAccess.getParameter_typeRule()) {
					sequence_parameter_type(context, (parameter_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.POINTER_TYPE:
				if(context == grammarAccess.getPointer_typeRule()) {
					sequence_pointer_type(context, (pointer_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART:
				if(context == grammarAccess.getProcedure_and_function_declaration_partRule()) {
					sequence_procedure_and_function_declaration_part(context, (procedure_and_function_declaration_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PROCEDURE_DECLARATION:
				if(context == grammarAccess.getProcedure_declarationRule()) {
					sequence_procedure_declaration(context, (procedure_declaration) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PROCEDURE_HEADING:
				if(context == grammarAccess.getProcedure_headingRule()) {
					sequence_procedure_heading(context, (procedure_heading) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PROCEDURE_STATEMENT:
				if(context == grammarAccess.getProcedure_statementRule() ||
				   context == grammarAccess.getSimple_statementRule()) {
					sequence_procedure_statement(context, (procedure_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_program(context, (program) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.RECORD_SECTION:
				if(context == grammarAccess.getRecord_sectionRule()) {
					sequence_record_section(context, (record_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.RECORD_TYPE:
				if(context == grammarAccess.getRecord_typeRule()) {
					sequence_record_type(context, (record_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.REPEAT_STATEMENT:
				if(context == grammarAccess.getRepeat_statementRule() ||
				   context == grammarAccess.getRepetitive_statementRule() ||
				   context == grammarAccess.getStructured_statementRule()) {
					sequence_repeat_statement(context, (repeat_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SET_TYPE:
				if(context == grammarAccess.getSet_typeRule()) {
					sequence_set_type(context, (set_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SIMPLE_EXPRESSION:
				if(context == grammarAccess.getSimple_expressionRule()) {
					sequence_simple_expression(context, (simple_expression) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SIMPLE_TYPE:
				if(context == grammarAccess.getSimple_typeRule()) {
					sequence_simple_type(context, (simple_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_statement(context, (statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.STATEMENT_SEQUENCE:
				if(context == grammarAccess.getStatement_partRule() ||
				   context == grammarAccess.getStatement_sequenceRule()) {
					sequence_statement_sequence(context, (statement_sequence) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.STRUCTURED_TYPE:
				if(context == grammarAccess.getStructured_typeRule()) {
					sequence_structured_type(context, (structured_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SUBRANGE_TYPE:
				if(context == grammarAccess.getSubrange_typeRule()) {
					sequence_subrange_type(context, (subrange_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TAG_FIELD:
				if(context == grammarAccess.getTag_fieldRule()) {
					sequence_tag_field(context, (tag_field) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_term(context, (term) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getType_definitionRule()) {
					sequence_type(context, (type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TYPE_DEFINITION_PART:
				if(context == grammarAccess.getType_definition_partRule()) {
					sequence_type_definition_part(context, (type_definition_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA:
				if(context == grammarAccess.getConformant_array_schemaRule() ||
				   context == grammarAccess.getUnpacked_conformant_array_SchemaRule()) {
					sequence_unpacked_conformant_array_Schema(context, (unpacked_conformant_array_Schema) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.UNPACKED_STRUCTURED_TYPE:
				if(context == grammarAccess.getUnpacked_structured_typeRule()) {
					sequence_unpacked_structured_type(context, (unpacked_structured_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VALUE_PARAMETER_SECTION:
				if(context == grammarAccess.getValue_parameter_sectionRule()) {
					sequence_value_parameter_section(context, (value_parameter_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_variable(context, (variable) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariable_declarationRule()) {
					sequence_variable_declaration(context, (variable_declaration) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE_DECLARATION_PART:
				if(context == grammarAccess.getVariable_declaration_partRule()) {
					sequence_variable_declaration_part(context, (variable_declaration_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE_PARAMETER_SECTION:
				if(context == grammarAccess.getVariable_parameter_sectionRule()) {
					sequence_variable_parameter_section(context, (variable_parameter_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIANT:
				if(context == grammarAccess.getVariantRule()) {
					sequence_variant(context, (variant) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIANT_PART:
				if(context == grammarAccess.getVariant_partRule()) {
					sequence_variant_part(context, (variant_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.WHILE_STATEMENT:
				if(context == grammarAccess.getRepetitive_statementRule() ||
				   context == grammarAccess.getStructured_statementRule() ||
				   context == grammarAccess.getWhile_statementRule()) {
					sequence_while_statement(context, (while_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.WITH_STATEMENT:
				if(context == grammarAccess.getStructured_statementRule() ||
				   context == grammarAccess.getWith_statementRule()) {
					sequence_with_statement(context, (with_statement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         labelDeclarationPart=label_declaration_part? 
	 *         constantDefinitionPart=constant_definition_part? 
	 *         typeDefinitionPart=type_definition_part? 
	 *         variableDeclarationPart=variable_declaration_part? 
	 *         procedureAndFunctionDeclarationPart=procedure_and_function_declaration_part
	 *     )
	 */
	protected void sequence_DeclarationPart(EObject context, DeclarationPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expressions+=expression expressions+=expression*)?)
	 */
	protected void sequence_ElementList(EObject context, ElementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=expression expressions+=expression*)
	 */
	protected void sequence_ExpressionList(EObject context, ExpressionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=IDENTIFIER
	 */
	protected void sequence_FunctionDesignator(EObject context, FunctionDesignator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FUNCTION_DESIGNATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FUNCTION_DESIGNATOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionDesignatorAccess().getNameIDENTIFIERTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     programs+=program*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elementList=ElementList
	 */
	protected void sequence_Set(EObject context, Set semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.SET__ELEMENT_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.SET__ELEMENT_LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetAccess().getElementListElementListParserRuleCall_1_0(), semanticObject.getElementList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((expressionList=ExpressionList variable1=Variable1) | (name=IDENTIFIER variable1=Variable1) | variable1=Variable1)
	 */
	protected void sequence_Variable1(EObject context, Variable1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simpleTypes+=simple_type simpleTypes+=simple_type* type=type)
	 */
	protected void sequence_array_type(EObject context, array_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((variable='variable' | identifier=IDENTIFIER) expression=expression)
	 */
	protected void sequence_assignment_statement(EObject context, assignment_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarationPart=DeclarationPart statementPart=statement_part)
	 */
	protected void sequence_block(EObject context, block semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.BLOCK__DECLARATION_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.BLOCK__DECLARATION_PART));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.BLOCK__STATEMENT_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.BLOCK__STATEMENT_PART));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBlockAccess().getDeclarationPartDeclarationPartParserRuleCall_0_0(), semanticObject.getDeclarationPart());
		feeder.accept(grammarAccess.getBlockAccess().getStatementPartStatement_partParserRuleCall_1_0(), semanticObject.getStatementPart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id1=IDENTIFIER id2=IDENTIFIER id3=IDENTIFIER)
	 */
	protected void sequence_bound_specification(EObject context, bound_specification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__ID1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__ID1));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__ID2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__ID2));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__ID3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__ID3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBound_specificationAccess().getId1IDENTIFIERTerminalRuleCall_0_0(), semanticObject.getId1());
		feeder.accept(grammarAccess.getBound_specificationAccess().getId2IDENTIFIERTerminalRuleCall_2_0(), semanticObject.getId2());
		feeder.accept(grammarAccess.getBound_specificationAccess().getId3IDENTIFIERTerminalRuleCall_4_0(), semanticObject.getId3());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (constants+=constant constants+=constant*)
	 */
	protected void sequence_case_label_list(EObject context, case_label_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (caseLabelList=case_label_list statement=statement)
	 */
	protected void sequence_case_limb(EObject context, case_limb semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.CASE_LIMB__CASE_LABEL_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.CASE_LIMB__CASE_LABEL_LIST));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.CASE_LIMB__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.CASE_LIMB__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCase_limbAccess().getCaseLabelListCase_label_listParserRuleCall_0_0(), semanticObject.getCaseLabelList());
		feeder.accept(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=expression caseLimbs+=case_limb caseLimbs+=case_limb*)
	 */
	protected void sequence_case_statement(EObject context, case_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statementSequence=statement_sequence
	 */
	protected void sequence_compound_statement(EObject context, compound_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.COMPOUND_STATEMENT__STATEMENT_SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.COMPOUND_STATEMENT__STATEMENT_SEQUENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompound_statementAccess().getStatementSequenceStatement_sequenceParserRuleCall_1_0(), semanticObject.getStatementSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ifStatement=if_statement | caseStatement=case_statement)
	 */
	protected void sequence_conditional_statement(EObject context, conditional_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER | number=number | string=STRING1)
	 */
	protected void sequence_constant(EObject context, constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constantDefinitions+=constant_definition constantDefinitions+=constant_definition*)
	 */
	protected void sequence_constant_definition_part(EObject context, constant_definition_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     identifierList=identifier_list
	 */
	protected void sequence_enumerated_type(EObject context, enumerated_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.ENUMERATED_TYPE__IDENTIFIER_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.ENUMERATED_TYPE__IDENTIFIER_LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerated_typeAccess().getIdentifierListIdentifier_listParserRuleCall_1_0(), semanticObject.getIdentifierList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (simpleExpressions+=simple_expression (relational_operators+=RELATIONALOPERATOR simpleExpressions+=simple_expression)?)
	 */
	protected void sequence_expression(EObject context, expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (functionDesignator=FunctionDesignator variable=variable) | 
	 *         number=number | 
	 *         string=STRING1 | 
	 *         set=Set | 
	 *         nil='nil' | 
	 *         id=IDENTIFIER | 
	 *         expression=expression | 
	 *         factor=factor
	 *     )
	 */
	protected void sequence_factor(EObject context, factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((fixedPart=fixed_part variantPart=variant_part?) | variantPart=variant_part)?)
	 */
	protected void sequence_field_list(EObject context, field_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=type
	 */
	protected void sequence_file_type(EObject context, file_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FILE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FILE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (recordSections+=record_section recordSections+=record_section*)
	 */
	protected void sequence_fixed_part(EObject context, fixed_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER expression1=expression expression2=expression statement=statement)
	 */
	protected void sequence_for_statement(EObject context, for_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FOR_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FOR_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FOR_STATEMENT__EXPRESSION1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FOR_STATEMENT__EXPRESSION1));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FOR_STATEMENT__EXPRESSION2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FOR_STATEMENT__EXPRESSION2));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FOR_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FOR_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFor_statementAccess().getNameIDENTIFIERTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFor_statementAccess().getExpression1ExpressionParserRuleCall_3_0(), semanticObject.getExpression1());
		feeder.accept(grammarAccess.getFor_statementAccess().getExpression2ExpressionParserRuleCall_5_0(), semanticObject.getExpression2());
		feeder.accept(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_7_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (FormalParameterSections+=formal_parameter_section FormalParameterSections+=formal_parameter_section*)
	 */
	protected void sequence_formal_parameter_list(EObject context, formal_parameter_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         valueParameterSection=value_parameter_section | 
	 *         variableParamenterSection=variable_parameter_section | 
	 *         procedureHeading=procedure_heading | 
	 *         functionHeading=function_heading
	 *     )
	 */
	protected void sequence_formal_parameter_section(EObject context, formal_parameter_section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER formalParameterList=formal_parameter_list? type=type block=block)
	 */
	protected void sequence_function_declaration(EObject context, function_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id1=IDENTIFIER FormalParameterList=formal_parameter_list? id2=IDENTIFIER)
	 */
	protected void sequence_function_heading(EObject context, function_heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ids+=IDENTIFIER ids+=IDENTIFIER*)
	 */
	protected void sequence_identifier_list(EObject context, identifier_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=expression ifStatement=statement elseStatement=statement?)
	 */
	protected void sequence_if_statement(EObject context, if_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (labels+=label labels+=label*)
	 */
	protected void sequence_label_declaration_part(EObject context, label_declaration_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     int=INTEGER_NUMBER
	 */
	protected void sequence_label(EObject context, label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (int=INTEGER_NUMBER (statement=simple_statement | statement=structured_statement))
	 */
	protected void sequence_label_statement(EObject context, label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (integer=INTEGER_NUMBER | real=REAL_NUMBER)
	 */
	protected void sequence_number(EObject context, number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (boundSpecification=bound_specification id=IDENTIFIER)
	 */
	protected void sequence_packed_conformant_array_schema(EObject context, packed_conformant_array_schema semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.CONFORMANT_ARRAY_SCHEMA__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.CONFORMANT_ARRAY_SCHEMA__ID));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundSpecificationBound_specificationParserRuleCall_2_0(), semanticObject.getBoundSpecification());
		feeder.accept(grammarAccess.getPacked_conformant_array_schemaAccess().getIdIDENTIFIERTerminalRuleCall_5_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=IDENTIFIER | conformantArraySchema=conformant_array_schema)
	 */
	protected void sequence_parameter_type(EObject context, parameter_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=IDENTIFIER
	 */
	protected void sequence_pointer_type(EObject context, pointer_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.POINTER_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.POINTER_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPointer_typeAccess().getNameIDENTIFIERTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((procedureDeclarations+=procedure_declaration | functionDeclarations+=function_declaration)*)
	 */
	protected void sequence_procedure_and_function_declaration_part(EObject context, procedure_and_function_declaration_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER formalParameterList=formal_parameter_list? block=block)
	 */
	protected void sequence_procedure_declaration(EObject context, procedure_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER FormalParameterList=formal_parameter_list?)
	 */
	protected void sequence_procedure_heading(EObject context, procedure_heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER actualParameterList='ActualParameterList'?)
	 */
	protected void sequence_procedure_statement(EObject context, procedure_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (program=program_heading block=block)
	 */
	protected void sequence_program(EObject context, program semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM__PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM__PROGRAM));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProgramAccess().getProgramProgram_headingParserRuleCall_0_0(), semanticObject.getProgram());
		feeder.accept(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifierList=identifier_list type=type)
	 */
	protected void sequence_record_section(EObject context, record_section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.RECORD_SECTION__IDENTIFIER_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.RECORD_SECTION__IDENTIFIER_LIST));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.RECORD_SECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.RECORD_SECTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecord_sectionAccess().getIdentifierListIdentifier_listParserRuleCall_0_0(), semanticObject.getIdentifierList());
		feeder.accept(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     fieldlist=field_list
	 */
	protected void sequence_record_type(EObject context, record_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.RECORD_TYPE__FIELDLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.RECORD_TYPE__FIELDLIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecord_typeAccess().getFieldlistField_listParserRuleCall_1_0(), semanticObject.getFieldlist());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statementSequence=statement_sequence expression=expression)
	 */
	protected void sequence_repeat_statement(EObject context, repeat_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REPEAT_STATEMENT__STATEMENT_SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REPEAT_STATEMENT__STATEMENT_SEQUENCE));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REPEAT_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REPEAT_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRepeat_statementAccess().getStatementSequenceStatement_sequenceParserRuleCall_1_0(), semanticObject.getStatementSequence());
		feeder.accept(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=type
	 */
	protected void sequence_set_type(EObject context, set_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.SET_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.SET_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=term terms+=term*)
	 */
	protected void sequence_simple_expression(EObject context, simple_expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((primitiveType='boolean' | primitiveType='char' | primitiveType='integer' | primitiveType='real') subrangeType=subrange_type) | 
	 *         enumeratedType=enumerated_type
	 *     )
	 */
	protected void sequence_simple_type(EObject context, simple_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=statement statements+=statement*)
	 */
	protected void sequence_statement_sequence(EObject context, statement_sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=simple_statement | statement=structured_statement)
	 */
	protected void sequence_statement(EObject context, statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     unpackedStructuredType=unpacked_structured_type
	 */
	protected void sequence_structured_type(EObject context, structured_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStructured_typeAccess().getUnpackedStructuredTypeUnpacked_structured_typeParserRuleCall_1_0(), semanticObject.getUnpackedStructuredType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (constant=constant constant2=constant)
	 */
	protected void sequence_subrange_type(EObject context, subrange_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.SUBRANGE_TYPE__CONSTANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.SUBRANGE_TYPE__CONSTANT));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.SUBRANGE_TYPE__CONSTANT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.SUBRANGE_TYPE__CONSTANT2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubrange_typeAccess().getConstantConstantParserRuleCall_0_0(), semanticObject.getConstant());
		feeder.accept(grammarAccess.getSubrange_typeAccess().getConstant2ConstantParserRuleCall_2_0(), semanticObject.getConstant2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=IDENTIFIER?)
	 */
	protected void sequence_tag_field(EObject context, tag_field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (factors+=factor factors+=factor*)
	 */
	protected void sequence_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeDefinitions+=type_definition typeDefinitions+=type_definition*)
	 */
	protected void sequence_type_definition_part(EObject context, type_definition_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simpleType=simple_type | structuredType=structured_type | pointerType=pointer_type | name=IDENTIFIER)
	 */
	protected void sequence_type(EObject context, type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         boundSpecifications+=bound_specification 
	 *         boundSpecifications+=bound_specification* 
	 *         (id=IDENTIFIER | conformantArraySchema=conformant_array_schema)
	 *     )
	 */
	protected void sequence_unpacked_conformant_array_Schema(EObject context, unpacked_conformant_array_Schema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arrayType=array_type | recordType=record_type | setType=set_type | fileType=file_type)
	 */
	protected void sequence_unpacked_structured_type(EObject context, unpacked_structured_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifierList=identifier_list parameterType=parameter_type)
	 */
	protected void sequence_value_parameter_section(EObject context, value_parameter_section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__PARAMETER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__PARAMETER_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValue_parameter_sectionAccess().getIdentifierListIdentifier_listParserRuleCall_0_0(), semanticObject.getIdentifierList());
		feeder.accept(grammarAccess.getValue_parameter_sectionAccess().getParameterTypeParameter_typeParserRuleCall_2_0(), semanticObject.getParameterType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variableDeclarations+=variable_declaration variableDeclarations+=variable_declaration*)
	 */
	protected void sequence_variable_declaration_part(EObject context, variable_declaration_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifierList=identifier_list type=type)
	 */
	protected void sequence_variable_declaration(EObject context, variable_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_DECLARATION__IDENTIFIER_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_DECLARATION__IDENTIFIER_LIST));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_DECLARATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariable_declarationAccess().getIdentifierListIdentifier_listParserRuleCall_0_0(), semanticObject.getIdentifierList());
		feeder.accept(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifierList=identifier_list parameterType=parameter_type)
	 */
	protected void sequence_variable_parameter_section(EObject context, variable_parameter_section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__IDENTIFIER_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__IDENTIFIER_LIST));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__PARAMETER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__PARAMETER_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariable_parameter_sectionAccess().getIdentifierListIdentifier_listParserRuleCall_1_0(), semanticObject.getIdentifierList());
		feeder.accept(grammarAccess.getVariable_parameter_sectionAccess().getParameterTypeParameter_typeParserRuleCall_3_0(), semanticObject.getParameterType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER variable1=Variable1?)
	 */
	protected void sequence_variable(EObject context, variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tagfield=tag_field id=IDENTIFIER variants+=variant variants+=variant*)
	 */
	protected void sequence_variant_part(EObject context, variant_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (caseLabelList=case_label_list fieldList=field_list)
	 */
	protected void sequence_variant(EObject context, variant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIANT__CASE_LABEL_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIANT__CASE_LABEL_LIST));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIANT__FIELD_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIANT__FIELD_LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariantAccess().getCaseLabelListCase_label_listParserRuleCall_0_0(), semanticObject.getCaseLabelList());
		feeder.accept(grammarAccess.getVariantAccess().getFieldListField_listParserRuleCall_3_0(), semanticObject.getFieldList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=expression statement=statement)
	 */
	protected void sequence_while_statement(EObject context, while_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.WHILE_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.WHILE_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.WHILE_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.WHILE_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=variable variables+=variable* statement=statement)
	 */
	protected void sequence_with_statement(EObject context, with_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
