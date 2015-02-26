/**
 */
package org.xtext.example.mydsl.pascal.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.pascal.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.pascal.PascalPackage
 * @generated
 */
public class PascalSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PascalPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PascalPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PascalPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.PROGRAM:
      {
        program program = (program)theEObject;
        T result = caseprogram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.PROGRAM_HEADING:
      {
        program_heading program_heading = (program_heading)theEObject;
        T result = caseprogram_heading(program_heading);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.BLOCK:
      {
        block block = (block)theEObject;
        T result = caseblock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.DECLARATION_PART:
      {
        DeclarationPart declarationPart = (DeclarationPart)theEObject;
        T result = caseDeclarationPart(declarationPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.LABEL_DECLARATION_PART:
      {
        label_declaration_part label_declaration_part = (label_declaration_part)theEObject;
        T result = caselabel_declaration_part(label_declaration_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.CONSTANT_DEFINITION_PART:
      {
        constant_definition_part constant_definition_part = (constant_definition_part)theEObject;
        T result = caseconstant_definition_part(constant_definition_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.CONSTANT_DEFINITION:
      {
        constant_definition constant_definition = (constant_definition)theEObject;
        T result = caseconstant_definition(constant_definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.TYPE_DEFINITION_PART:
      {
        type_definition_part type_definition_part = (type_definition_part)theEObject;
        T result = casetype_definition_part(type_definition_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.TYPE_DEFINITION:
      {
        type_definition type_definition = (type_definition)theEObject;
        T result = casetype_definition(type_definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.VARIABLE_DECLARATION_PART:
      {
        variable_declaration_part variable_declaration_part = (variable_declaration_part)theEObject;
        T result = casevariable_declaration_part(variable_declaration_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.VARIABLE_DECLARATION:
      {
        variable_declaration variable_declaration = (variable_declaration)theEObject;
        T result = casevariable_declaration(variable_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART:
      {
        procedure_and_function_declaration_part procedure_and_function_declaration_part = (procedure_and_function_declaration_part)theEObject;
        T result = caseprocedure_and_function_declaration_part(procedure_and_function_declaration_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.PROCEDURE_DECLARATION:
      {
        procedure_declaration procedure_declaration = (procedure_declaration)theEObject;
        T result = caseprocedure_declaration(procedure_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FUNCTION_DECLARATION:
      {
        function_declaration function_declaration = (function_declaration)theEObject;
        T result = casefunction_declaration(function_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.STATEMENT_PART:
      {
        statement_part statement_part = (statement_part)theEObject;
        T result = casestatement_part(statement_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.PROCEDURE_HEADING:
      {
        procedure_heading procedure_heading = (procedure_heading)theEObject;
        T result = caseprocedure_heading(procedure_heading);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FUNCTION_HEADING:
      {
        function_heading function_heading = (function_heading)theEObject;
        T result = casefunction_heading(function_heading);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FORMAL_PARAMETER_LIST:
      {
        formal_parameter_list formal_parameter_list = (formal_parameter_list)theEObject;
        T result = caseformal_parameter_list(formal_parameter_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FORMAL_PARAMETER_SECTION:
      {
        formal_parameter_section formal_parameter_section = (formal_parameter_section)theEObject;
        T result = caseformal_parameter_section(formal_parameter_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.VALUE_PARAMETER_SECTION:
      {
        value_parameter_section value_parameter_section = (value_parameter_section)theEObject;
        T result = casevalue_parameter_section(value_parameter_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.VARIABLE_PARAMETER_SECTION:
      {
        variable_parameter_section variable_parameter_section = (variable_parameter_section)theEObject;
        T result = casevariable_parameter_section(variable_parameter_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.PARAMETER_TYPE:
      {
        parameter_type parameter_type = (parameter_type)theEObject;
        T result = caseparameter_type(parameter_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA:
      {
        conformant_array_schema conformant_array_schema = (conformant_array_schema)theEObject;
        T result = caseconformant_array_schema(conformant_array_schema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA:
      {
        packed_conformant_array_schema packed_conformant_array_schema = (packed_conformant_array_schema)theEObject;
        T result = casepacked_conformant_array_schema(packed_conformant_array_schema);
        if (result == null) result = caseconformant_array_schema(packed_conformant_array_schema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA:
      {
        unpacked_conformant_array_Schema unpacked_conformant_array_Schema = (unpacked_conformant_array_Schema)theEObject;
        T result = caseunpacked_conformant_array_Schema(unpacked_conformant_array_Schema);
        if (result == null) result = caseconformant_array_schema(unpacked_conformant_array_Schema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.BOUND_SPECIFICATION:
      {
        bound_specification bound_specification = (bound_specification)theEObject;
        T result = casebound_specification(bound_specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.STATEMENT_SEQUENCE:
      {
        statement_sequence statement_sequence = (statement_sequence)theEObject;
        T result = casestatement_sequence(statement_sequence);
        if (result == null) result = casestatement_part(statement_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.STATEMENT:
      {
        statement statement = (statement)theEObject;
        T result = casestatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.SIMPLE_STATEMENT:
      {
        simple_statement simple_statement = (simple_statement)theEObject;
        T result = casesimple_statement(simple_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.ASSIGNMENT_STATEMENT:
      {
        assignment_statement assignment_statement = (assignment_statement)theEObject;
        T result = caseassignment_statement(assignment_statement);
        if (result == null) result = casesimple_statement(assignment_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.PROCEDURE_STATEMENT:
      {
        procedure_statement procedure_statement = (procedure_statement)theEObject;
        T result = caseprocedure_statement(procedure_statement);
        if (result == null) result = casesimple_statement(procedure_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.GOTO_STATEMENT:
      {
        goto_statement goto_statement = (goto_statement)theEObject;
        T result = casegoto_statement(goto_statement);
        if (result == null) result = casesimple_statement(goto_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.STRUCTURED_STATEMENT:
      {
        structured_statement structured_statement = (structured_statement)theEObject;
        T result = casestructured_statement(structured_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.COMPOUND_STATEMENT:
      {
        compound_statement compound_statement = (compound_statement)theEObject;
        T result = casecompound_statement(compound_statement);
        if (result == null) result = casestructured_statement(compound_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.REPETITIVE_STATEMENT:
      {
        repetitive_statement repetitive_statement = (repetitive_statement)theEObject;
        T result = caserepetitive_statement(repetitive_statement);
        if (result == null) result = casestructured_statement(repetitive_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.WHILE_STATEMENT:
      {
        while_statement while_statement = (while_statement)theEObject;
        T result = casewhile_statement(while_statement);
        if (result == null) result = caserepetitive_statement(while_statement);
        if (result == null) result = casestructured_statement(while_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.REPEAT_STATEMENT:
      {
        repeat_statement repeat_statement = (repeat_statement)theEObject;
        T result = caserepeat_statement(repeat_statement);
        if (result == null) result = caserepetitive_statement(repeat_statement);
        if (result == null) result = casestructured_statement(repeat_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FOR_STATEMENT:
      {
        for_statement for_statement = (for_statement)theEObject;
        T result = casefor_statement(for_statement);
        if (result == null) result = caserepetitive_statement(for_statement);
        if (result == null) result = casestructured_statement(for_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.CONDITIONAL_STATEMENT:
      {
        conditional_statement conditional_statement = (conditional_statement)theEObject;
        T result = caseconditional_statement(conditional_statement);
        if (result == null) result = casestructured_statement(conditional_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.IF_STATEMENT:
      {
        if_statement if_statement = (if_statement)theEObject;
        T result = caseif_statement(if_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.CASE_STATEMENT:
      {
        case_statement case_statement = (case_statement)theEObject;
        T result = casecase_statement(case_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.CASE_LIMB:
      {
        case_limb case_limb = (case_limb)theEObject;
        T result = casecase_limb(case_limb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.CASE_LABEL_LIST:
      {
        case_label_list case_label_list = (case_label_list)theEObject;
        T result = casecase_label_list(case_label_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.WITH_STATEMENT:
      {
        with_statement with_statement = (with_statement)theEObject;
        T result = casewith_statement(with_statement);
        if (result == null) result = casestructured_statement(with_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.EXPRESSION:
      {
        expression expression = (expression)theEObject;
        T result = caseexpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.SIMPLE_EXPRESSION:
      {
        simple_expression simple_expression = (simple_expression)theEObject;
        T result = casesimple_expression(simple_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.TERM:
      {
        term term = (term)theEObject;
        T result = caseterm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FACTOR:
      {
        factor factor = (factor)theEObject;
        T result = casefactor(factor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.VARIABLE:
      {
        variable variable = (variable)theEObject;
        T result = casevariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.VARIABLE1:
      {
        Variable1 variable1 = (Variable1)theEObject;
        T result = caseVariable1(variable1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.SET:
      {
        Set set = (Set)theEObject;
        T result = caseSet(set);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.ELEMENT_LIST:
      {
        ElementList elementList = (ElementList)theEObject;
        T result = caseElementList(elementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FUNCTION_DESIGNATOR:
      {
        FunctionDesignator functionDesignator = (FunctionDesignator)theEObject;
        T result = caseFunctionDesignator(functionDesignator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.TYPE:
      {
        type type = (type)theEObject;
        T result = casetype(type);
        if (result == null) result = casetype_definition(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.SIMPLE_TYPE:
      {
        simple_type simple_type = (simple_type)theEObject;
        T result = casesimple_type(simple_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.ENUMERATED_TYPE:
      {
        enumerated_type enumerated_type = (enumerated_type)theEObject;
        T result = caseenumerated_type(enumerated_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.SUBRANGE_TYPE:
      {
        subrange_type subrange_type = (subrange_type)theEObject;
        T result = casesubrange_type(subrange_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.STRUCTURED_TYPE:
      {
        structured_type structured_type = (structured_type)theEObject;
        T result = casestructured_type(structured_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.UNPACKED_STRUCTURED_TYPE:
      {
        unpacked_structured_type unpacked_structured_type = (unpacked_structured_type)theEObject;
        T result = caseunpacked_structured_type(unpacked_structured_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.ARRAY_TYPE:
      {
        array_type array_type = (array_type)theEObject;
        T result = casearray_type(array_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.RECORD_TYPE:
      {
        record_type record_type = (record_type)theEObject;
        T result = caserecord_type(record_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.SET_TYPE:
      {
        set_type set_type = (set_type)theEObject;
        T result = caseset_type(set_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FILE_TYPE:
      {
        file_type file_type = (file_type)theEObject;
        T result = casefile_type(file_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.POINTER_TYPE:
      {
        pointer_type pointer_type = (pointer_type)theEObject;
        T result = casepointer_type(pointer_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FIELD_LIST:
      {
        field_list field_list = (field_list)theEObject;
        T result = casefield_list(field_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.FIXED_PART:
      {
        fixed_part fixed_part = (fixed_part)theEObject;
        T result = casefixed_part(fixed_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.RECORD_SECTION:
      {
        record_section record_section = (record_section)theEObject;
        T result = caserecord_section(record_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.VARIANT_PART:
      {
        variant_part variant_part = (variant_part)theEObject;
        T result = casevariant_part(variant_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.TAG_FIELD:
      {
        tag_field tag_field = (tag_field)theEObject;
        T result = casetag_field(tag_field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.VARIANT:
      {
        variant variant = (variant)theEObject;
        T result = casevariant(variant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.EXPRESSION_LIST:
      {
        ExpressionList expressionList = (ExpressionList)theEObject;
        T result = caseExpressionList(expressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.IDENTIFIER_LIST:
      {
        identifier_list identifier_list = (identifier_list)theEObject;
        T result = caseidentifier_list(identifier_list);
        if (result == null) result = caseprogram_heading(identifier_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.NUMBER:
      {
        number number = (number)theEObject;
        T result = casenumber(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.LABEL:
      {
        label label = (label)theEObject;
        T result = caselabel(label);
        if (result == null) result = casestatement(label);
        if (result == null) result = casegoto_statement(label);
        if (result == null) result = casesimple_statement(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PascalPackage.CONSTANT:
      {
        constant constant = (constant)theEObject;
        T result = caseconstant(constant);
        if (result == null) result = caseconstant_definition(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprogram(program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>program heading</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>program heading</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprogram_heading(program_heading object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseblock(block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarationPart(DeclarationPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>label declaration part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>label declaration part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselabel_declaration_part(label_declaration_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant definition part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant definition part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant_definition_part(constant_definition_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant_definition(constant_definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type definition part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type definition part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_definition_part(type_definition_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_definition(type_definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable declaration part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable declaration part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable_declaration_part(variable_declaration_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable_declaration(variable_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>procedure and function declaration part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>procedure and function declaration part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprocedure_and_function_declaration_part(procedure_and_function_declaration_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>procedure declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>procedure declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprocedure_declaration(procedure_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction_declaration(function_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement_part(statement_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>procedure heading</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>procedure heading</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprocedure_heading(procedure_heading object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function heading</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function heading</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction_heading(function_heading object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>formal parameter list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>formal parameter list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseformal_parameter_list(formal_parameter_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>formal parameter section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>formal parameter section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseformal_parameter_section(formal_parameter_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>value parameter section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>value parameter section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevalue_parameter_section(value_parameter_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable parameter section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable parameter section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable_parameter_section(variable_parameter_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameter_type(parameter_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>conformant array schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>conformant array schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconformant_array_schema(conformant_array_schema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>packed conformant array schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>packed conformant array schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepacked_conformant_array_schema(packed_conformant_array_schema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unpacked conformant array Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unpacked conformant array Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunpacked_conformant_array_Schema(unpacked_conformant_array_Schema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bound specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bound specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebound_specification(bound_specification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement_sequence(statement_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement(statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimple_statement(simple_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assignment statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assignment statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassignment_statement(assignment_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>procedure statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>procedure statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprocedure_statement(procedure_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>goto statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>goto statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegoto_statement(goto_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>structured statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>structured statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestructured_statement(structured_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>compound statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compound statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompound_statement(compound_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>repetitive statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>repetitive statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserepetitive_statement(repetitive_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>while statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>while statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewhile_statement(while_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>repeat statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>repeat statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserepeat_statement(repeat_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefor_statement(for_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>conditional statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>conditional statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconditional_statement(conditional_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>if statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>if statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseif_statement(if_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>case statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>case statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecase_statement(case_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>case limb</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>case limb</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecase_limb(case_limb object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>case label list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>case label list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecase_label_list(case_label_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>with statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>with statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewith_statement(with_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression(expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimple_expression(simple_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseterm(term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefactor(factor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable(variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable1(Variable1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSet(Set object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementList(ElementList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Designator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Designator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDesignator(FunctionDesignator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype(type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimple_type(simple_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enumerated type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enumerated type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenumerated_type(enumerated_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>subrange type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>subrange type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesubrange_type(subrange_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>structured type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>structured type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestructured_type(structured_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unpacked structured type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unpacked structured type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunpacked_structured_type(unpacked_structured_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>array type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>array type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearray_type(array_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>record type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>record type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserecord_type(record_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>set type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>set type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseset_type(set_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>file type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>file type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefile_type(file_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pointer type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pointer type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepointer_type(pointer_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>field list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefield_list(field_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fixed part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fixed part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefixed_part(fixed_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>record section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>record section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserecord_section(record_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variant part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variant part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariant_part(variant_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tag field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tag field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetag_field(tag_field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariant(variant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionList(ExpressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>identifier list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>identifier list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseidentifier_list(identifier_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenumber(number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselabel(label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant(constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PascalSwitch
