/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.pascal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalFactoryImpl extends EFactoryImpl implements PascalFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PascalFactory init()
  {
    try
    {
      PascalFactory thePascalFactory = (PascalFactory)EPackage.Registry.INSTANCE.getEFactory(PascalPackage.eNS_URI);
      if (thePascalFactory != null)
      {
        return thePascalFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PascalFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PascalPackage.MODEL: return createModel();
      case PascalPackage.PROGRAM: return createprogram();
      case PascalPackage.PROGRAM_HEADING: return createprogram_heading();
      case PascalPackage.BLOCK: return createblock();
      case PascalPackage.DECLARATION_PART: return createDeclarationPart();
      case PascalPackage.LABEL_DECLARATION_PART: return createlabel_declaration_part();
      case PascalPackage.CONSTANT_DEFINITION_PART: return createconstant_definition_part();
      case PascalPackage.CONSTANT_DEFINITION: return createconstant_definition();
      case PascalPackage.TYPE_DEFINITION_PART: return createtype_definition_part();
      case PascalPackage.TYPE_DEFINITION: return createtype_definition();
      case PascalPackage.VARIABLE_DECLARATION_PART: return createvariable_declaration_part();
      case PascalPackage.VARIABLE_DECLARATION: return createvariable_declaration();
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART: return createprocedure_and_function_declaration_part();
      case PascalPackage.PROCEDURE_DECLARATION: return createprocedure_declaration();
      case PascalPackage.FUNCTION_DECLARATION: return createfunction_declaration();
      case PascalPackage.STATEMENT_PART: return createstatement_part();
      case PascalPackage.PROCEDURE_HEADING: return createprocedure_heading();
      case PascalPackage.FUNCTION_HEADING: return createfunction_heading();
      case PascalPackage.FORMAL_PARAMETER_LIST: return createformal_parameter_list();
      case PascalPackage.FORMAL_PARAMETER_SECTION: return createformal_parameter_section();
      case PascalPackage.VALUE_PARAMETER_SECTION: return createvalue_parameter_section();
      case PascalPackage.VARIABLE_PARAMETER_SECTION: return createvariable_parameter_section();
      case PascalPackage.PARAMETER_TYPE: return createparameter_type();
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA: return createconformant_array_schema();
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA: return createpacked_conformant_array_schema();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA: return createunpacked_conformant_array_Schema();
      case PascalPackage.BOUND_SPECIFICATION: return createbound_specification();
      case PascalPackage.STATEMENT_SEQUENCE: return createstatement_sequence();
      case PascalPackage.STATEMENT: return createstatement();
      case PascalPackage.SIMPLE_STATEMENT: return createsimple_statement();
      case PascalPackage.ASSIGNMENT_STATEMENT: return createassignment_statement();
      case PascalPackage.PROCEDURE_STATEMENT: return createprocedure_statement();
      case PascalPackage.GOTO_STATEMENT: return creategoto_statement();
      case PascalPackage.STRUCTURED_STATEMENT: return createstructured_statement();
      case PascalPackage.COMPOUND_STATEMENT: return createcompound_statement();
      case PascalPackage.REPETITIVE_STATEMENT: return createrepetitive_statement();
      case PascalPackage.WHILE_STATEMENT: return createwhile_statement();
      case PascalPackage.REPEAT_STATEMENT: return createrepeat_statement();
      case PascalPackage.FOR_STATEMENT: return createfor_statement();
      case PascalPackage.CONDITIONAL_STATEMENT: return createconditional_statement();
      case PascalPackage.IF_STATEMENT: return createif_statement();
      case PascalPackage.CASE_STATEMENT: return createcase_statement();
      case PascalPackage.CASE_LIMB: return createcase_limb();
      case PascalPackage.CASE_LABEL_LIST: return createcase_label_list();
      case PascalPackage.WITH_STATEMENT: return createwith_statement();
      case PascalPackage.EXPRESSION: return createexpression();
      case PascalPackage.SIMPLE_EXPRESSION: return createsimple_expression();
      case PascalPackage.TERM: return createterm();
      case PascalPackage.FACTOR: return createfactor();
      case PascalPackage.VARIABLE: return createvariable();
      case PascalPackage.VARIABLE1: return createVariable1();
      case PascalPackage.SET: return createSet();
      case PascalPackage.ELEMENT_LIST: return createElementList();
      case PascalPackage.FUNCTION_DESIGNATOR: return createFunctionDesignator();
      case PascalPackage.TYPE: return createtype();
      case PascalPackage.SIMPLE_TYPE: return createsimple_type();
      case PascalPackage.ENUMERATED_TYPE: return createenumerated_type();
      case PascalPackage.SUBRANGE_TYPE: return createsubrange_type();
      case PascalPackage.STRUCTURED_TYPE: return createstructured_type();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE: return createunpacked_structured_type();
      case PascalPackage.ARRAY_TYPE: return createarray_type();
      case PascalPackage.RECORD_TYPE: return createrecord_type();
      case PascalPackage.SET_TYPE: return createset_type();
      case PascalPackage.FILE_TYPE: return createfile_type();
      case PascalPackage.POINTER_TYPE: return createpointer_type();
      case PascalPackage.FIELD_LIST: return createfield_list();
      case PascalPackage.FIXED_PART: return createfixed_part();
      case PascalPackage.RECORD_SECTION: return createrecord_section();
      case PascalPackage.VARIANT_PART: return createvariant_part();
      case PascalPackage.TAG_FIELD: return createtag_field();
      case PascalPackage.VARIANT: return createvariant();
      case PascalPackage.EXPRESSION_LIST: return createExpressionList();
      case PascalPackage.IDENTIFIER_LIST: return createidentifier_list();
      case PascalPackage.NUMBER: return createnumber();
      case PascalPackage.LABEL: return createlabel();
      case PascalPackage.CONSTANT: return createconstant();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program createprogram()
  {
    programImpl program = new programImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program_heading createprogram_heading()
  {
    program_headingImpl program_heading = new program_headingImpl();
    return program_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block createblock()
  {
    blockImpl block = new blockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationPart createDeclarationPart()
  {
    DeclarationPartImpl declarationPart = new DeclarationPartImpl();
    return declarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_declaration_part createlabel_declaration_part()
  {
    label_declaration_partImpl label_declaration_part = new label_declaration_partImpl();
    return label_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition_part createconstant_definition_part()
  {
    constant_definition_partImpl constant_definition_part = new constant_definition_partImpl();
    return constant_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition createconstant_definition()
  {
    constant_definitionImpl constant_definition = new constant_definitionImpl();
    return constant_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition_part createtype_definition_part()
  {
    type_definition_partImpl type_definition_part = new type_definition_partImpl();
    return type_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition createtype_definition()
  {
    type_definitionImpl type_definition = new type_definitionImpl();
    return type_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration_part createvariable_declaration_part()
  {
    variable_declaration_partImpl variable_declaration_part = new variable_declaration_partImpl();
    return variable_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration createvariable_declaration()
  {
    variable_declarationImpl variable_declaration = new variable_declarationImpl();
    return variable_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_and_function_declaration_part createprocedure_and_function_declaration_part()
  {
    procedure_and_function_declaration_partImpl procedure_and_function_declaration_part = new procedure_and_function_declaration_partImpl();
    return procedure_and_function_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_declaration createprocedure_declaration()
  {
    procedure_declarationImpl procedure_declaration = new procedure_declarationImpl();
    return procedure_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_declaration createfunction_declaration()
  {
    function_declarationImpl function_declaration = new function_declarationImpl();
    return function_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_part createstatement_part()
  {
    statement_partImpl statement_part = new statement_partImpl();
    return statement_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_heading createprocedure_heading()
  {
    procedure_headingImpl procedure_heading = new procedure_headingImpl();
    return procedure_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_heading createfunction_heading()
  {
    function_headingImpl function_heading = new function_headingImpl();
    return function_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_list createformal_parameter_list()
  {
    formal_parameter_listImpl formal_parameter_list = new formal_parameter_listImpl();
    return formal_parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_section createformal_parameter_section()
  {
    formal_parameter_sectionImpl formal_parameter_section = new formal_parameter_sectionImpl();
    return formal_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public value_parameter_section createvalue_parameter_section()
  {
    value_parameter_sectionImpl value_parameter_section = new value_parameter_sectionImpl();
    return value_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_parameter_section createvariable_parameter_section()
  {
    variable_parameter_sectionImpl variable_parameter_section = new variable_parameter_sectionImpl();
    return variable_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_type createparameter_type()
  {
    parameter_typeImpl parameter_type = new parameter_typeImpl();
    return parameter_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conformant_array_schema createconformant_array_schema()
  {
    conformant_array_schemaImpl conformant_array_schema = new conformant_array_schemaImpl();
    return conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public packed_conformant_array_schema createpacked_conformant_array_schema()
  {
    packed_conformant_array_schemaImpl packed_conformant_array_schema = new packed_conformant_array_schemaImpl();
    return packed_conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpacked_conformant_array_Schema createunpacked_conformant_array_Schema()
  {
    unpacked_conformant_array_SchemaImpl unpacked_conformant_array_Schema = new unpacked_conformant_array_SchemaImpl();
    return unpacked_conformant_array_Schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bound_specification createbound_specification()
  {
    bound_specificationImpl bound_specification = new bound_specificationImpl();
    return bound_specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_sequence createstatement_sequence()
  {
    statement_sequenceImpl statement_sequence = new statement_sequenceImpl();
    return statement_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_statement createsimple_statement()
  {
    simple_statementImpl simple_statement = new simple_statementImpl();
    return simple_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_statement createassignment_statement()
  {
    assignment_statementImpl assignment_statement = new assignment_statementImpl();
    return assignment_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_statement createprocedure_statement()
  {
    procedure_statementImpl procedure_statement = new procedure_statementImpl();
    return procedure_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public goto_statement creategoto_statement()
  {
    goto_statementImpl goto_statement = new goto_statementImpl();
    return goto_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structured_statement createstructured_statement()
  {
    structured_statementImpl structured_statement = new structured_statementImpl();
    return structured_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement createcompound_statement()
  {
    compound_statementImpl compound_statement = new compound_statementImpl();
    return compound_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public repetitive_statement createrepetitive_statement()
  {
    repetitive_statementImpl repetitive_statement = new repetitive_statementImpl();
    return repetitive_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public while_statement createwhile_statement()
  {
    while_statementImpl while_statement = new while_statementImpl();
    return while_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public repeat_statement createrepeat_statement()
  {
    repeat_statementImpl repeat_statement = new repeat_statementImpl();
    return repeat_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_statement createfor_statement()
  {
    for_statementImpl for_statement = new for_statementImpl();
    return for_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_statement createconditional_statement()
  {
    conditional_statementImpl conditional_statement = new conditional_statementImpl();
    return conditional_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public if_statement createif_statement()
  {
    if_statementImpl if_statement = new if_statementImpl();
    return if_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_statement createcase_statement()
  {
    case_statementImpl case_statement = new case_statementImpl();
    return case_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_limb createcase_limb()
  {
    case_limbImpl case_limb = new case_limbImpl();
    return case_limb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_label_list createcase_label_list()
  {
    case_label_listImpl case_label_list = new case_label_listImpl();
    return case_label_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public with_statement createwith_statement()
  {
    with_statementImpl with_statement = new with_statementImpl();
    return with_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_expression createsimple_expression()
  {
    simple_expressionImpl simple_expression = new simple_expressionImpl();
    return simple_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term createterm()
  {
    termImpl term = new termImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factor createfactor()
  {
    factorImpl factor = new factorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable createvariable()
  {
    variableImpl variable = new variableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable1 createVariable1()
  {
    Variable1Impl variable1 = new Variable1Impl();
    return variable1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set createSet()
  {
    SetImpl set = new SetImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementList createElementList()
  {
    ElementListImpl elementList = new ElementListImpl();
    return elementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDesignator createFunctionDesignator()
  {
    FunctionDesignatorImpl functionDesignator = new FunctionDesignatorImpl();
    return functionDesignator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_type createsimple_type()
  {
    simple_typeImpl simple_type = new simple_typeImpl();
    return simple_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumerated_type createenumerated_type()
  {
    enumerated_typeImpl enumerated_type = new enumerated_typeImpl();
    return enumerated_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subrange_type createsubrange_type()
  {
    subrange_typeImpl subrange_type = new subrange_typeImpl();
    return subrange_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structured_type createstructured_type()
  {
    structured_typeImpl structured_type = new structured_typeImpl();
    return structured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpacked_structured_type createunpacked_structured_type()
  {
    unpacked_structured_typeImpl unpacked_structured_type = new unpacked_structured_typeImpl();
    return unpacked_structured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public array_type createarray_type()
  {
    array_typeImpl array_type = new array_typeImpl();
    return array_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public record_type createrecord_type()
  {
    record_typeImpl record_type = new record_typeImpl();
    return record_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set_type createset_type()
  {
    set_typeImpl set_type = new set_typeImpl();
    return set_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public file_type createfile_type()
  {
    file_typeImpl file_type = new file_typeImpl();
    return file_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer_type createpointer_type()
  {
    pointer_typeImpl pointer_type = new pointer_typeImpl();
    return pointer_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_list createfield_list()
  {
    field_listImpl field_list = new field_listImpl();
    return field_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fixed_part createfixed_part()
  {
    fixed_partImpl fixed_part = new fixed_partImpl();
    return fixed_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public record_section createrecord_section()
  {
    record_sectionImpl record_section = new record_sectionImpl();
    return record_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variant_part createvariant_part()
  {
    variant_partImpl variant_part = new variant_partImpl();
    return variant_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tag_field createtag_field()
  {
    tag_fieldImpl tag_field = new tag_fieldImpl();
    return tag_field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variant createvariant()
  {
    variantImpl variant = new variantImpl();
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_list createidentifier_list()
  {
    identifier_listImpl identifier_list = new identifier_listImpl();
    return identifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number createnumber()
  {
    numberImpl number = new numberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label createlabel()
  {
    labelImpl label = new labelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant createconstant()
  {
    constantImpl constant = new constantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalPackage getPascalPackage()
  {
    return (PascalPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PascalPackage getPackage()
  {
    return PascalPackage.eINSTANCE;
  }

} //PascalFactoryImpl
