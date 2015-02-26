/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.pascal.DeclarationPart;
import org.xtext.example.mydsl.pascal.ElementList;
import org.xtext.example.mydsl.pascal.ExpressionList;
import org.xtext.example.mydsl.pascal.FunctionDesignator;
import org.xtext.example.mydsl.pascal.Model;
import org.xtext.example.mydsl.pascal.PascalFactory;
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
import org.xtext.example.mydsl.pascal.conformant_array_schema;
import org.xtext.example.mydsl.pascal.constant;
import org.xtext.example.mydsl.pascal.constant_definition;
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
import org.xtext.example.mydsl.pascal.goto_statement;
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
import org.xtext.example.mydsl.pascal.program_heading;
import org.xtext.example.mydsl.pascal.record_section;
import org.xtext.example.mydsl.pascal.record_type;
import org.xtext.example.mydsl.pascal.repeat_statement;
import org.xtext.example.mydsl.pascal.repetitive_statement;
import org.xtext.example.mydsl.pascal.set_type;
import org.xtext.example.mydsl.pascal.simple_expression;
import org.xtext.example.mydsl.pascal.simple_statement;
import org.xtext.example.mydsl.pascal.simple_type;
import org.xtext.example.mydsl.pascal.statement;
import org.xtext.example.mydsl.pascal.statement_part;
import org.xtext.example.mydsl.pascal.statement_sequence;
import org.xtext.example.mydsl.pascal.structured_statement;
import org.xtext.example.mydsl.pascal.structured_type;
import org.xtext.example.mydsl.pascal.subrange_type;
import org.xtext.example.mydsl.pascal.tag_field;
import org.xtext.example.mydsl.pascal.term;
import org.xtext.example.mydsl.pascal.type;
import org.xtext.example.mydsl.pascal.type_definition;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalPackageImpl extends EPackageImpl implements PascalPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass program_headingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass label_declaration_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_definition_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_definition_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declaration_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedure_and_function_declaration_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedure_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statement_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedure_headingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_headingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formal_parameter_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formal_parameter_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass value_parameter_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_parameter_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameter_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conformant_array_schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packed_conformant_array_schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unpacked_conformant_array_SchemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bound_specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statement_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignment_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedure_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goto_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structured_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compound_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repetitive_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass while_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeat_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditional_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass if_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_limbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_label_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass with_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDesignatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerated_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subrange_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structured_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unpacked_structured_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass record_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass set_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass file_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointer_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass field_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixed_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass record_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variant_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tag_fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifier_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.pascal.PascalPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PascalPackageImpl()
  {
    super(eNS_URI, PascalFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PascalPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PascalPackage init()
  {
    if (isInited) return (PascalPackage)EPackage.Registry.INSTANCE.getEPackage(PascalPackage.eNS_URI);

    // Obtain or create and register package
    PascalPackageImpl thePascalPackage = (PascalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PascalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PascalPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePascalPackage.createPackageContents();

    // Initialize created meta-data
    thePascalPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePascalPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PascalPackage.eNS_URI, thePascalPackage);
    return thePascalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Programs()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprogram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Program()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Block()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprogram_heading()
  {
    return program_headingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getblock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getblock_DeclarationPart()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getblock_StatementPart()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarationPart()
  {
    return declarationPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationPart_LabelDeclarationPart()
  {
    return (EReference)declarationPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationPart_ConstantDefinitionPart()
  {
    return (EReference)declarationPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationPart_TypeDefinitionPart()
  {
    return (EReference)declarationPartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationPart_VariableDeclarationPart()
  {
    return (EReference)declarationPartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationPart_ProcedureAndFunctionDeclarationPart()
  {
    return (EReference)declarationPartEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlabel_declaration_part()
  {
    return label_declaration_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabel_declaration_part_Labels()
  {
    return (EReference)label_declaration_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_definition_part()
  {
    return constant_definition_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_definition_part_ConstantDefinitions()
  {
    return (EReference)constant_definition_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_definition()
  {
    return constant_definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_definition_part()
  {
    return type_definition_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_definition_part_TypeDefinitions()
  {
    return (EReference)type_definition_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_definition()
  {
    return type_definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_declaration_part()
  {
    return variable_declaration_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declaration_part_VariableDeclarations()
  {
    return (EReference)variable_declaration_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_declaration()
  {
    return variable_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declaration_IdentifierList()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declaration_Type()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprocedure_and_function_declaration_part()
  {
    return procedure_and_function_declaration_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprocedure_and_function_declaration_part_ProcedureDeclarations()
  {
    return (EReference)procedure_and_function_declaration_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprocedure_and_function_declaration_part_FunctionDeclarations()
  {
    return (EReference)procedure_and_function_declaration_partEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprocedure_declaration()
  {
    return procedure_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprocedure_declaration_Name()
  {
    return (EAttribute)procedure_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprocedure_declaration_FormalParameterList()
  {
    return (EReference)procedure_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprocedure_declaration_Block()
  {
    return (EReference)procedure_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction_declaration()
  {
    return function_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_declaration_Name()
  {
    return (EAttribute)function_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_FormalParameterList()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_Type()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_Block()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement_part()
  {
    return statement_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprocedure_heading()
  {
    return procedure_headingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprocedure_heading_Name()
  {
    return (EAttribute)procedure_headingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprocedure_heading_FormalParameterList()
  {
    return (EReference)procedure_headingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction_heading()
  {
    return function_headingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_heading_Id1()
  {
    return (EAttribute)function_headingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_heading_FormalParameterList()
  {
    return (EReference)function_headingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_heading_Id2()
  {
    return (EAttribute)function_headingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getformal_parameter_list()
  {
    return formal_parameter_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_list_FormalParameterSections()
  {
    return (EReference)formal_parameter_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getformal_parameter_section()
  {
    return formal_parameter_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_section_ValueParameterSection()
  {
    return (EReference)formal_parameter_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_section_VariableParamenterSection()
  {
    return (EReference)formal_parameter_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_section_ProcedureHeading()
  {
    return (EReference)formal_parameter_sectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_section_FunctionHeading()
  {
    return (EReference)formal_parameter_sectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvalue_parameter_section()
  {
    return value_parameter_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalue_parameter_section_IdentifierList()
  {
    return (EReference)value_parameter_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalue_parameter_section_ParameterType()
  {
    return (EReference)value_parameter_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_parameter_section()
  {
    return variable_parameter_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_parameter_section_IdentifierList()
  {
    return (EReference)variable_parameter_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_parameter_section_ParameterType()
  {
    return (EReference)variable_parameter_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameter_type()
  {
    return parameter_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameter_type_Id()
  {
    return (EAttribute)parameter_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameter_type_ConformantArraySchema()
  {
    return (EReference)parameter_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconformant_array_schema()
  {
    return conformant_array_schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconformant_array_schema_Id()
  {
    return (EAttribute)conformant_array_schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpacked_conformant_array_schema()
  {
    return packed_conformant_array_schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpacked_conformant_array_schema_BoundSpecification()
  {
    return (EReference)packed_conformant_array_schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunpacked_conformant_array_Schema()
  {
    return unpacked_conformant_array_SchemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_conformant_array_Schema_BoundSpecifications()
  {
    return (EReference)unpacked_conformant_array_SchemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_conformant_array_Schema_ConformantArraySchema()
  {
    return (EReference)unpacked_conformant_array_SchemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbound_specification()
  {
    return bound_specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbound_specification_Id1()
  {
    return (EAttribute)bound_specificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbound_specification_Id2()
  {
    return (EAttribute)bound_specificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbound_specification_Id3()
  {
    return (EAttribute)bound_specificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement_sequence()
  {
    return statement_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_sequence_Statements()
  {
    return (EReference)statement_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_statement()
  {
    return simple_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getassignment_statement()
  {
    return assignment_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getassignment_statement_Variable()
  {
    return (EAttribute)assignment_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getassignment_statement_Identifier()
  {
    return (EAttribute)assignment_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassignment_statement_Expression()
  {
    return (EReference)assignment_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprocedure_statement()
  {
    return procedure_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprocedure_statement_Name()
  {
    return (EAttribute)procedure_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprocedure_statement_ActualParameterList()
  {
    return (EAttribute)procedure_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgoto_statement()
  {
    return goto_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstructured_statement()
  {
    return structured_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompound_statement()
  {
    return compound_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompound_statement_StatementSequence()
  {
    return (EReference)compound_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrepetitive_statement()
  {
    return repetitive_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwhile_statement()
  {
    return while_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhile_statement_Expression()
  {
    return (EReference)while_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhile_statement_Statement()
  {
    return (EReference)while_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrepeat_statement()
  {
    return repeat_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrepeat_statement_StatementSequence()
  {
    return (EReference)repeat_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrepeat_statement_Expression()
  {
    return (EReference)repeat_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfor_statement()
  {
    return for_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfor_statement_Name()
  {
    return (EAttribute)for_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_Expression1()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_Expression2()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_Statement()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconditional_statement()
  {
    return conditional_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconditional_statement_IfStatement()
  {
    return (EReference)conditional_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconditional_statement_CaseStatement()
  {
    return (EReference)conditional_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getif_statement()
  {
    return if_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_Expression()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_IfStatement()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_ElseStatement()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcase_statement()
  {
    return case_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_statement_Expression()
  {
    return (EReference)case_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_statement_CaseLimbs()
  {
    return (EReference)case_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcase_limb()
  {
    return case_limbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_limb_CaseLabelList()
  {
    return (EReference)case_limbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_limb_Statement()
  {
    return (EReference)case_limbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcase_label_list()
  {
    return case_label_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_label_list_Constants()
  {
    return (EReference)case_label_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwith_statement()
  {
    return with_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwith_statement_Variables()
  {
    return (EReference)with_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwith_statement_Statement()
  {
    return (EReference)with_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_SimpleExpressions()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpression_Relational_operators()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_expression()
  {
    return simple_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_expression_Terms()
  {
    return (EReference)simple_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getterm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getterm_Factors()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfactor()
  {
    return factorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_FunctionDesignator()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Variable()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Number()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfactor_String()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Set()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfactor_Nil()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfactor_Id()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Expression()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Factor()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_Variable1()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable1()
  {
    return variable1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable1_ExpressionList()
  {
    return (EReference)variable1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable1_Variable1()
  {
    return (EReference)variable1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable1_Name()
  {
    return (EAttribute)variable1EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSet()
  {
    return setEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSet_ElementList()
  {
    return (EReference)setEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementList()
  {
    return elementListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementList_Expressions()
  {
    return (EReference)elementListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDesignator()
  {
    return functionDesignatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionDesignator_Name()
  {
    return (EAttribute)functionDesignatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_SimpleType()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_StructuredType()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_PointerType()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettype_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_type()
  {
    return simple_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_type_PrimitiveType()
  {
    return (EAttribute)simple_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_type_SubrangeType()
  {
    return (EReference)simple_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_type_EnumeratedType()
  {
    return (EReference)simple_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenumerated_type()
  {
    return enumerated_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getenumerated_type_IdentifierList()
  {
    return (EReference)enumerated_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsubrange_type()
  {
    return subrange_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubrange_type_Constant()
  {
    return (EReference)subrange_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubrange_type_Constant2()
  {
    return (EReference)subrange_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstructured_type()
  {
    return structured_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructured_type_UnpackedStructuredType()
  {
    return (EReference)structured_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunpacked_structured_type()
  {
    return unpacked_structured_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_ArrayType()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_RecordType()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_SetType()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_FileType()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarray_type()
  {
    return array_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarray_type_SimpleTypes()
  {
    return (EReference)array_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarray_type_Type()
  {
    return (EReference)array_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrecord_type()
  {
    return record_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrecord_type_Fieldlist()
  {
    return (EReference)record_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getset_type()
  {
    return set_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getset_type_Type()
  {
    return (EReference)set_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfile_type()
  {
    return file_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfile_type_Type()
  {
    return (EReference)file_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpointer_type()
  {
    return pointer_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpointer_type_Name()
  {
    return (EAttribute)pointer_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfield_list()
  {
    return field_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_list_FixedPart()
  {
    return (EReference)field_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_list_VariantPart()
  {
    return (EReference)field_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfixed_part()
  {
    return fixed_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfixed_part_RecordSections()
  {
    return (EReference)fixed_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrecord_section()
  {
    return record_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrecord_section_IdentifierList()
  {
    return (EReference)record_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrecord_section_Type()
  {
    return (EReference)record_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariant_part()
  {
    return variant_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariant_part_Tagfield()
  {
    return (EReference)variant_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariant_part_Id()
  {
    return (EAttribute)variant_partEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariant_part_Variants()
  {
    return (EReference)variant_partEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettag_field()
  {
    return tag_fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettag_field_Id()
  {
    return (EAttribute)tag_fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariant()
  {
    return variantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariant_CaseLabelList()
  {
    return (EReference)variantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariant_FieldList()
  {
    return (EReference)variantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionList()
  {
    return expressionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionList_Expressions()
  {
    return (EReference)expressionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getidentifier_list()
  {
    return identifier_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getidentifier_list_Ids()
  {
    return (EAttribute)identifier_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnumber_Integer()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnumber_Real()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlabel_Int()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_Number()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_String()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalFactory getPascalFactory()
  {
    return (PascalFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PROGRAMS);

    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__PROGRAM);
    createEReference(programEClass, PROGRAM__BLOCK);

    program_headingEClass = createEClass(PROGRAM_HEADING);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__DECLARATION_PART);
    createEReference(blockEClass, BLOCK__STATEMENT_PART);

    declarationPartEClass = createEClass(DECLARATION_PART);
    createEReference(declarationPartEClass, DECLARATION_PART__LABEL_DECLARATION_PART);
    createEReference(declarationPartEClass, DECLARATION_PART__CONSTANT_DEFINITION_PART);
    createEReference(declarationPartEClass, DECLARATION_PART__TYPE_DEFINITION_PART);
    createEReference(declarationPartEClass, DECLARATION_PART__VARIABLE_DECLARATION_PART);
    createEReference(declarationPartEClass, DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART);

    label_declaration_partEClass = createEClass(LABEL_DECLARATION_PART);
    createEReference(label_declaration_partEClass, LABEL_DECLARATION_PART__LABELS);

    constant_definition_partEClass = createEClass(CONSTANT_DEFINITION_PART);
    createEReference(constant_definition_partEClass, CONSTANT_DEFINITION_PART__CONSTANT_DEFINITIONS);

    constant_definitionEClass = createEClass(CONSTANT_DEFINITION);

    type_definition_partEClass = createEClass(TYPE_DEFINITION_PART);
    createEReference(type_definition_partEClass, TYPE_DEFINITION_PART__TYPE_DEFINITIONS);

    type_definitionEClass = createEClass(TYPE_DEFINITION);

    variable_declaration_partEClass = createEClass(VARIABLE_DECLARATION_PART);
    createEReference(variable_declaration_partEClass, VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS);

    variable_declarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__IDENTIFIER_LIST);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__TYPE);

    procedure_and_function_declaration_partEClass = createEClass(PROCEDURE_AND_FUNCTION_DECLARATION_PART);
    createEReference(procedure_and_function_declaration_partEClass, PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS);
    createEReference(procedure_and_function_declaration_partEClass, PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS);

    procedure_declarationEClass = createEClass(PROCEDURE_DECLARATION);
    createEAttribute(procedure_declarationEClass, PROCEDURE_DECLARATION__NAME);
    createEReference(procedure_declarationEClass, PROCEDURE_DECLARATION__FORMAL_PARAMETER_LIST);
    createEReference(procedure_declarationEClass, PROCEDURE_DECLARATION__BLOCK);

    function_declarationEClass = createEClass(FUNCTION_DECLARATION);
    createEAttribute(function_declarationEClass, FUNCTION_DECLARATION__NAME);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__TYPE);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__BLOCK);

    statement_partEClass = createEClass(STATEMENT_PART);

    procedure_headingEClass = createEClass(PROCEDURE_HEADING);
    createEAttribute(procedure_headingEClass, PROCEDURE_HEADING__NAME);
    createEReference(procedure_headingEClass, PROCEDURE_HEADING__FORMAL_PARAMETER_LIST);

    function_headingEClass = createEClass(FUNCTION_HEADING);
    createEAttribute(function_headingEClass, FUNCTION_HEADING__ID1);
    createEReference(function_headingEClass, FUNCTION_HEADING__FORMAL_PARAMETER_LIST);
    createEAttribute(function_headingEClass, FUNCTION_HEADING__ID2);

    formal_parameter_listEClass = createEClass(FORMAL_PARAMETER_LIST);
    createEReference(formal_parameter_listEClass, FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS);

    formal_parameter_sectionEClass = createEClass(FORMAL_PARAMETER_SECTION);
    createEReference(formal_parameter_sectionEClass, FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION);
    createEReference(formal_parameter_sectionEClass, FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION);
    createEReference(formal_parameter_sectionEClass, FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING);
    createEReference(formal_parameter_sectionEClass, FORMAL_PARAMETER_SECTION__FUNCTION_HEADING);

    value_parameter_sectionEClass = createEClass(VALUE_PARAMETER_SECTION);
    createEReference(value_parameter_sectionEClass, VALUE_PARAMETER_SECTION__IDENTIFIER_LIST);
    createEReference(value_parameter_sectionEClass, VALUE_PARAMETER_SECTION__PARAMETER_TYPE);

    variable_parameter_sectionEClass = createEClass(VARIABLE_PARAMETER_SECTION);
    createEReference(variable_parameter_sectionEClass, VARIABLE_PARAMETER_SECTION__IDENTIFIER_LIST);
    createEReference(variable_parameter_sectionEClass, VARIABLE_PARAMETER_SECTION__PARAMETER_TYPE);

    parameter_typeEClass = createEClass(PARAMETER_TYPE);
    createEAttribute(parameter_typeEClass, PARAMETER_TYPE__ID);
    createEReference(parameter_typeEClass, PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA);

    conformant_array_schemaEClass = createEClass(CONFORMANT_ARRAY_SCHEMA);
    createEAttribute(conformant_array_schemaEClass, CONFORMANT_ARRAY_SCHEMA__ID);

    packed_conformant_array_schemaEClass = createEClass(PACKED_CONFORMANT_ARRAY_SCHEMA);
    createEReference(packed_conformant_array_schemaEClass, PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION);

    unpacked_conformant_array_SchemaEClass = createEClass(UNPACKED_CONFORMANT_ARRAY_SCHEMA);
    createEReference(unpacked_conformant_array_SchemaEClass, UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS);
    createEReference(unpacked_conformant_array_SchemaEClass, UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA);

    bound_specificationEClass = createEClass(BOUND_SPECIFICATION);
    createEAttribute(bound_specificationEClass, BOUND_SPECIFICATION__ID1);
    createEAttribute(bound_specificationEClass, BOUND_SPECIFICATION__ID2);
    createEAttribute(bound_specificationEClass, BOUND_SPECIFICATION__ID3);

    statement_sequenceEClass = createEClass(STATEMENT_SEQUENCE);
    createEReference(statement_sequenceEClass, STATEMENT_SEQUENCE__STATEMENTS);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__STATEMENT);

    simple_statementEClass = createEClass(SIMPLE_STATEMENT);

    assignment_statementEClass = createEClass(ASSIGNMENT_STATEMENT);
    createEAttribute(assignment_statementEClass, ASSIGNMENT_STATEMENT__VARIABLE);
    createEAttribute(assignment_statementEClass, ASSIGNMENT_STATEMENT__IDENTIFIER);
    createEReference(assignment_statementEClass, ASSIGNMENT_STATEMENT__EXPRESSION);

    procedure_statementEClass = createEClass(PROCEDURE_STATEMENT);
    createEAttribute(procedure_statementEClass, PROCEDURE_STATEMENT__NAME);
    createEAttribute(procedure_statementEClass, PROCEDURE_STATEMENT__ACTUAL_PARAMETER_LIST);

    goto_statementEClass = createEClass(GOTO_STATEMENT);

    structured_statementEClass = createEClass(STRUCTURED_STATEMENT);

    compound_statementEClass = createEClass(COMPOUND_STATEMENT);
    createEReference(compound_statementEClass, COMPOUND_STATEMENT__STATEMENT_SEQUENCE);

    repetitive_statementEClass = createEClass(REPETITIVE_STATEMENT);

    while_statementEClass = createEClass(WHILE_STATEMENT);
    createEReference(while_statementEClass, WHILE_STATEMENT__EXPRESSION);
    createEReference(while_statementEClass, WHILE_STATEMENT__STATEMENT);

    repeat_statementEClass = createEClass(REPEAT_STATEMENT);
    createEReference(repeat_statementEClass, REPEAT_STATEMENT__STATEMENT_SEQUENCE);
    createEReference(repeat_statementEClass, REPEAT_STATEMENT__EXPRESSION);

    for_statementEClass = createEClass(FOR_STATEMENT);
    createEAttribute(for_statementEClass, FOR_STATEMENT__NAME);
    createEReference(for_statementEClass, FOR_STATEMENT__EXPRESSION1);
    createEReference(for_statementEClass, FOR_STATEMENT__EXPRESSION2);
    createEReference(for_statementEClass, FOR_STATEMENT__STATEMENT);

    conditional_statementEClass = createEClass(CONDITIONAL_STATEMENT);
    createEReference(conditional_statementEClass, CONDITIONAL_STATEMENT__IF_STATEMENT);
    createEReference(conditional_statementEClass, CONDITIONAL_STATEMENT__CASE_STATEMENT);

    if_statementEClass = createEClass(IF_STATEMENT);
    createEReference(if_statementEClass, IF_STATEMENT__EXPRESSION);
    createEReference(if_statementEClass, IF_STATEMENT__IF_STATEMENT);
    createEReference(if_statementEClass, IF_STATEMENT__ELSE_STATEMENT);

    case_statementEClass = createEClass(CASE_STATEMENT);
    createEReference(case_statementEClass, CASE_STATEMENT__EXPRESSION);
    createEReference(case_statementEClass, CASE_STATEMENT__CASE_LIMBS);

    case_limbEClass = createEClass(CASE_LIMB);
    createEReference(case_limbEClass, CASE_LIMB__CASE_LABEL_LIST);
    createEReference(case_limbEClass, CASE_LIMB__STATEMENT);

    case_label_listEClass = createEClass(CASE_LABEL_LIST);
    createEReference(case_label_listEClass, CASE_LABEL_LIST__CONSTANTS);

    with_statementEClass = createEClass(WITH_STATEMENT);
    createEReference(with_statementEClass, WITH_STATEMENT__VARIABLES);
    createEReference(with_statementEClass, WITH_STATEMENT__STATEMENT);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__SIMPLE_EXPRESSIONS);
    createEAttribute(expressionEClass, EXPRESSION__RELATIONAL_OPERATORS);

    simple_expressionEClass = createEClass(SIMPLE_EXPRESSION);
    createEReference(simple_expressionEClass, SIMPLE_EXPRESSION__TERMS);

    termEClass = createEClass(TERM);
    createEReference(termEClass, TERM__FACTORS);

    factorEClass = createEClass(FACTOR);
    createEReference(factorEClass, FACTOR__FUNCTION_DESIGNATOR);
    createEReference(factorEClass, FACTOR__VARIABLE);
    createEReference(factorEClass, FACTOR__NUMBER);
    createEAttribute(factorEClass, FACTOR__STRING);
    createEReference(factorEClass, FACTOR__SET);
    createEAttribute(factorEClass, FACTOR__NIL);
    createEAttribute(factorEClass, FACTOR__ID);
    createEReference(factorEClass, FACTOR__EXPRESSION);
    createEReference(factorEClass, FACTOR__FACTOR);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);
    createEReference(variableEClass, VARIABLE__VARIABLE1);

    variable1EClass = createEClass(VARIABLE1);
    createEReference(variable1EClass, VARIABLE1__EXPRESSION_LIST);
    createEReference(variable1EClass, VARIABLE1__VARIABLE1);
    createEAttribute(variable1EClass, VARIABLE1__NAME);

    setEClass = createEClass(SET);
    createEReference(setEClass, SET__ELEMENT_LIST);

    elementListEClass = createEClass(ELEMENT_LIST);
    createEReference(elementListEClass, ELEMENT_LIST__EXPRESSIONS);

    functionDesignatorEClass = createEClass(FUNCTION_DESIGNATOR);
    createEAttribute(functionDesignatorEClass, FUNCTION_DESIGNATOR__NAME);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__SIMPLE_TYPE);
    createEReference(typeEClass, TYPE__STRUCTURED_TYPE);
    createEReference(typeEClass, TYPE__POINTER_TYPE);
    createEAttribute(typeEClass, TYPE__NAME);

    simple_typeEClass = createEClass(SIMPLE_TYPE);
    createEAttribute(simple_typeEClass, SIMPLE_TYPE__PRIMITIVE_TYPE);
    createEReference(simple_typeEClass, SIMPLE_TYPE__SUBRANGE_TYPE);
    createEReference(simple_typeEClass, SIMPLE_TYPE__ENUMERATED_TYPE);

    enumerated_typeEClass = createEClass(ENUMERATED_TYPE);
    createEReference(enumerated_typeEClass, ENUMERATED_TYPE__IDENTIFIER_LIST);

    subrange_typeEClass = createEClass(SUBRANGE_TYPE);
    createEReference(subrange_typeEClass, SUBRANGE_TYPE__CONSTANT);
    createEReference(subrange_typeEClass, SUBRANGE_TYPE__CONSTANT2);

    structured_typeEClass = createEClass(STRUCTURED_TYPE);
    createEReference(structured_typeEClass, STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE);

    unpacked_structured_typeEClass = createEClass(UNPACKED_STRUCTURED_TYPE);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__RECORD_TYPE);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__SET_TYPE);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__FILE_TYPE);

    array_typeEClass = createEClass(ARRAY_TYPE);
    createEReference(array_typeEClass, ARRAY_TYPE__SIMPLE_TYPES);
    createEReference(array_typeEClass, ARRAY_TYPE__TYPE);

    record_typeEClass = createEClass(RECORD_TYPE);
    createEReference(record_typeEClass, RECORD_TYPE__FIELDLIST);

    set_typeEClass = createEClass(SET_TYPE);
    createEReference(set_typeEClass, SET_TYPE__TYPE);

    file_typeEClass = createEClass(FILE_TYPE);
    createEReference(file_typeEClass, FILE_TYPE__TYPE);

    pointer_typeEClass = createEClass(POINTER_TYPE);
    createEAttribute(pointer_typeEClass, POINTER_TYPE__NAME);

    field_listEClass = createEClass(FIELD_LIST);
    createEReference(field_listEClass, FIELD_LIST__FIXED_PART);
    createEReference(field_listEClass, FIELD_LIST__VARIANT_PART);

    fixed_partEClass = createEClass(FIXED_PART);
    createEReference(fixed_partEClass, FIXED_PART__RECORD_SECTIONS);

    record_sectionEClass = createEClass(RECORD_SECTION);
    createEReference(record_sectionEClass, RECORD_SECTION__IDENTIFIER_LIST);
    createEReference(record_sectionEClass, RECORD_SECTION__TYPE);

    variant_partEClass = createEClass(VARIANT_PART);
    createEReference(variant_partEClass, VARIANT_PART__TAGFIELD);
    createEAttribute(variant_partEClass, VARIANT_PART__ID);
    createEReference(variant_partEClass, VARIANT_PART__VARIANTS);

    tag_fieldEClass = createEClass(TAG_FIELD);
    createEAttribute(tag_fieldEClass, TAG_FIELD__ID);

    variantEClass = createEClass(VARIANT);
    createEReference(variantEClass, VARIANT__CASE_LABEL_LIST);
    createEReference(variantEClass, VARIANT__FIELD_LIST);

    expressionListEClass = createEClass(EXPRESSION_LIST);
    createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSIONS);

    identifier_listEClass = createEClass(IDENTIFIER_LIST);
    createEAttribute(identifier_listEClass, IDENTIFIER_LIST__IDS);

    numberEClass = createEClass(NUMBER);
    createEAttribute(numberEClass, NUMBER__INTEGER);
    createEAttribute(numberEClass, NUMBER__REAL);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__INT);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__NAME);
    createEReference(constantEClass, CONSTANT__NUMBER);
    createEAttribute(constantEClass, CONSTANT__STRING);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packed_conformant_array_schemaEClass.getESuperTypes().add(this.getconformant_array_schema());
    unpacked_conformant_array_SchemaEClass.getESuperTypes().add(this.getconformant_array_schema());
    statement_sequenceEClass.getESuperTypes().add(this.getstatement_part());
    assignment_statementEClass.getESuperTypes().add(this.getsimple_statement());
    procedure_statementEClass.getESuperTypes().add(this.getsimple_statement());
    goto_statementEClass.getESuperTypes().add(this.getsimple_statement());
    compound_statementEClass.getESuperTypes().add(this.getstructured_statement());
    repetitive_statementEClass.getESuperTypes().add(this.getstructured_statement());
    while_statementEClass.getESuperTypes().add(this.getrepetitive_statement());
    repeat_statementEClass.getESuperTypes().add(this.getrepetitive_statement());
    for_statementEClass.getESuperTypes().add(this.getrepetitive_statement());
    conditional_statementEClass.getESuperTypes().add(this.getstructured_statement());
    with_statementEClass.getESuperTypes().add(this.getstructured_statement());
    typeEClass.getESuperTypes().add(this.gettype_definition());
    identifier_listEClass.getESuperTypes().add(this.getprogram_heading());
    labelEClass.getESuperTypes().add(this.getstatement());
    labelEClass.getESuperTypes().add(this.getgoto_statement());
    constantEClass.getESuperTypes().add(this.getconstant_definition());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Programs(), this.getprogram(), null, "programs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(programEClass, program.class, "program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getprogram_Program(), this.getprogram_heading(), null, "program", null, 0, 1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Block(), this.getblock(), null, "block", null, 0, 1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(program_headingEClass, program_heading.class, "program_heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEClass, block.class, "block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getblock_DeclarationPart(), this.getDeclarationPart(), null, "declarationPart", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getblock_StatementPart(), this.getstatement_part(), null, "statementPart", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationPartEClass, DeclarationPart.class, "DeclarationPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarationPart_LabelDeclarationPart(), this.getlabel_declaration_part(), null, "labelDeclarationPart", null, 0, 1, DeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationPart_ConstantDefinitionPart(), this.getconstant_definition_part(), null, "constantDefinitionPart", null, 0, 1, DeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationPart_TypeDefinitionPart(), this.gettype_definition_part(), null, "typeDefinitionPart", null, 0, 1, DeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationPart_VariableDeclarationPart(), this.getvariable_declaration_part(), null, "variableDeclarationPart", null, 0, 1, DeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationPart_ProcedureAndFunctionDeclarationPart(), this.getprocedure_and_function_declaration_part(), null, "procedureAndFunctionDeclarationPart", null, 0, 1, DeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(label_declaration_partEClass, label_declaration_part.class, "label_declaration_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlabel_declaration_part_Labels(), this.getlabel(), null, "labels", null, 0, -1, label_declaration_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_definition_partEClass, constant_definition_part.class, "constant_definition_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconstant_definition_part_ConstantDefinitions(), this.getconstant_definition(), null, "constantDefinitions", null, 0, -1, constant_definition_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_definitionEClass, constant_definition.class, "constant_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(type_definition_partEClass, type_definition_part.class, "type_definition_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettype_definition_part_TypeDefinitions(), this.gettype_definition(), null, "typeDefinitions", null, 0, -1, type_definition_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_definitionEClass, type_definition.class, "type_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variable_declaration_partEClass, variable_declaration_part.class, "variable_declaration_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_declaration_part_VariableDeclarations(), this.getvariable_declaration(), null, "variableDeclarations", null, 0, -1, variable_declaration_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_declarationEClass, variable_declaration.class, "variable_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_declaration_IdentifierList(), this.getidentifier_list(), null, "identifierList", null, 0, 1, variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_declaration_Type(), this.gettype(), null, "type", null, 0, 1, variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedure_and_function_declaration_partEClass, procedure_and_function_declaration_part.class, "procedure_and_function_declaration_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getprocedure_and_function_declaration_part_ProcedureDeclarations(), this.getprocedure_declaration(), null, "procedureDeclarations", null, 0, -1, procedure_and_function_declaration_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprocedure_and_function_declaration_part_FunctionDeclarations(), this.getfunction_declaration(), null, "functionDeclarations", null, 0, -1, procedure_and_function_declaration_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedure_declarationEClass, procedure_declaration.class, "procedure_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getprocedure_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, procedure_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprocedure_declaration_FormalParameterList(), this.getformal_parameter_list(), null, "formalParameterList", null, 0, 1, procedure_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprocedure_declaration_Block(), this.getblock(), null, "block", null, 0, 1, procedure_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_declarationEClass, function_declaration.class, "function_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunction_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_FormalParameterList(), this.getformal_parameter_list(), null, "formalParameterList", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_Type(), this.gettype(), null, "type", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_Block(), this.getblock(), null, "block", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statement_partEClass, statement_part.class, "statement_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(procedure_headingEClass, procedure_heading.class, "procedure_heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getprocedure_heading_Name(), ecorePackage.getEString(), "name", null, 0, 1, procedure_heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprocedure_heading_FormalParameterList(), this.getformal_parameter_list(), null, "FormalParameterList", null, 0, 1, procedure_heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_headingEClass, function_heading.class, "function_heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunction_heading_Id1(), ecorePackage.getEString(), "id1", null, 0, 1, function_heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_heading_FormalParameterList(), this.getformal_parameter_list(), null, "FormalParameterList", null, 0, 1, function_heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfunction_heading_Id2(), ecorePackage.getEString(), "id2", null, 0, 1, function_heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formal_parameter_listEClass, formal_parameter_list.class, "formal_parameter_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getformal_parameter_list_FormalParameterSections(), this.getformal_parameter_section(), null, "FormalParameterSections", null, 0, -1, formal_parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formal_parameter_sectionEClass, formal_parameter_section.class, "formal_parameter_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getformal_parameter_section_ValueParameterSection(), this.getvalue_parameter_section(), null, "valueParameterSection", null, 0, 1, formal_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getformal_parameter_section_VariableParamenterSection(), this.getvariable_parameter_section(), null, "variableParamenterSection", null, 0, 1, formal_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getformal_parameter_section_ProcedureHeading(), this.getprocedure_heading(), null, "procedureHeading", null, 0, 1, formal_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getformal_parameter_section_FunctionHeading(), this.getfunction_heading(), null, "functionHeading", null, 0, 1, formal_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(value_parameter_sectionEClass, value_parameter_section.class, "value_parameter_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvalue_parameter_section_IdentifierList(), this.getidentifier_list(), null, "identifierList", null, 0, 1, value_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvalue_parameter_section_ParameterType(), this.getparameter_type(), null, "parameterType", null, 0, 1, value_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_parameter_sectionEClass, variable_parameter_section.class, "variable_parameter_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_parameter_section_IdentifierList(), this.getidentifier_list(), null, "identifierList", null, 0, 1, variable_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_parameter_section_ParameterType(), this.getparameter_type(), null, "parameterType", null, 0, 1, variable_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameter_typeEClass, parameter_type.class, "parameter_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getparameter_type_Id(), ecorePackage.getEString(), "id", null, 0, 1, parameter_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getparameter_type_ConformantArraySchema(), this.getconformant_array_schema(), null, "conformantArraySchema", null, 0, 1, parameter_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conformant_array_schemaEClass, conformant_array_schema.class, "conformant_array_schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconformant_array_schema_Id(), ecorePackage.getEString(), "id", null, 0, 1, conformant_array_schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packed_conformant_array_schemaEClass, packed_conformant_array_schema.class, "packed_conformant_array_schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpacked_conformant_array_schema_BoundSpecification(), this.getbound_specification(), null, "boundSpecification", null, 0, 1, packed_conformant_array_schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unpacked_conformant_array_SchemaEClass, unpacked_conformant_array_Schema.class, "unpacked_conformant_array_Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunpacked_conformant_array_Schema_BoundSpecifications(), this.getbound_specification(), null, "boundSpecifications", null, 0, -1, unpacked_conformant_array_Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_conformant_array_Schema_ConformantArraySchema(), this.getconformant_array_schema(), null, "conformantArraySchema", null, 0, 1, unpacked_conformant_array_Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bound_specificationEClass, bound_specification.class, "bound_specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbound_specification_Id1(), ecorePackage.getEString(), "id1", null, 0, 1, bound_specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbound_specification_Id2(), ecorePackage.getEString(), "id2", null, 0, 1, bound_specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbound_specification_Id3(), ecorePackage.getEString(), "id3", null, 0, 1, bound_specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statement_sequenceEClass, statement_sequence.class, "statement_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_sequence_Statements(), this.getstatement(), null, "statements", null, 0, -1, statement_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, statement.class, "statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_Statement(), ecorePackage.getEObject(), null, "statement", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_statementEClass, simple_statement.class, "simple_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignment_statementEClass, assignment_statement.class, "assignment_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getassignment_statement_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, assignment_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getassignment_statement_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, assignment_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getassignment_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, assignment_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedure_statementEClass, procedure_statement.class, "procedure_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getprocedure_statement_Name(), ecorePackage.getEString(), "name", null, 0, 1, procedure_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getprocedure_statement_ActualParameterList(), ecorePackage.getEString(), "actualParameterList", null, 0, 1, procedure_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goto_statementEClass, goto_statement.class, "goto_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structured_statementEClass, structured_statement.class, "structured_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compound_statementEClass, compound_statement.class, "compound_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompound_statement_StatementSequence(), this.getstatement_sequence(), null, "statementSequence", null, 0, 1, compound_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repetitive_statementEClass, repetitive_statement.class, "repetitive_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(while_statementEClass, while_statement.class, "while_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwhile_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, while_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwhile_statement_Statement(), this.getstatement(), null, "statement", null, 0, 1, while_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeat_statementEClass, repeat_statement.class, "repeat_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrepeat_statement_StatementSequence(), this.getstatement_sequence(), null, "statementSequence", null, 0, 1, repeat_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrepeat_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, repeat_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_statementEClass, for_statement.class, "for_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfor_statement_Name(), ecorePackage.getEString(), "name", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_Expression1(), this.getexpression(), null, "expression1", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_Expression2(), this.getexpression(), null, "expression2", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_Statement(), this.getstatement(), null, "statement", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditional_statementEClass, conditional_statement.class, "conditional_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconditional_statement_IfStatement(), this.getif_statement(), null, "ifStatement", null, 0, 1, conditional_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconditional_statement_CaseStatement(), this.getcase_statement(), null, "caseStatement", null, 0, 1, conditional_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(if_statementEClass, if_statement.class, "if_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getif_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getif_statement_IfStatement(), this.getstatement(), null, "ifStatement", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getif_statement_ElseStatement(), this.getstatement(), null, "elseStatement", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_statementEClass, case_statement.class, "case_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcase_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, case_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcase_statement_CaseLimbs(), this.getcase_limb(), null, "caseLimbs", null, 0, -1, case_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_limbEClass, case_limb.class, "case_limb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcase_limb_CaseLabelList(), this.getcase_label_list(), null, "caseLabelList", null, 0, 1, case_limb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcase_limb_Statement(), this.getstatement(), null, "statement", null, 0, 1, case_limb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_label_listEClass, case_label_list.class, "case_label_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcase_label_list_Constants(), this.getconstant(), null, "constants", null, 0, -1, case_label_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(with_statementEClass, with_statement.class, "with_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwith_statement_Variables(), this.getvariable(), null, "variables", null, 0, -1, with_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwith_statement_Statement(), this.getstatement(), null, "statement", null, 0, 1, with_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_SimpleExpressions(), this.getsimple_expression(), null, "simpleExpressions", null, 0, -1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getexpression_Relational_operators(), ecorePackage.getEString(), "relational_operators", null, 0, -1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_expressionEClass, simple_expression.class, "simple_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsimple_expression_Terms(), this.getterm(), null, "terms", null, 0, -1, simple_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, term.class, "term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getterm_Factors(), this.getfactor(), null, "factors", null, 0, -1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorEClass, factor.class, "factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfactor_FunctionDesignator(), this.getFunctionDesignator(), null, "functionDesignator", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Variable(), this.getvariable(), null, "variable", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Number(), this.getnumber(), null, "number", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfactor_String(), ecorePackage.getEString(), "string", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Set(), this.getSet(), null, "set", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfactor_Nil(), ecorePackage.getEString(), "nil", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfactor_Id(), ecorePackage.getEString(), "id", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Expression(), this.getexpression(), null, "expression", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Factor(), this.getfactor(), null, "factor", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, variable.class, "variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_Variable1(), this.getVariable1(), null, "variable1", null, 0, 1, variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable1EClass, Variable1.class, "Variable1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable1_ExpressionList(), this.getExpressionList(), null, "expressionList", null, 0, 1, Variable1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable1_Variable1(), this.getVariable1(), null, "variable1", null, 0, 1, Variable1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable1_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSet_ElementList(), this.getElementList(), null, "elementList", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementListEClass, ElementList.class, "ElementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementList_Expressions(), this.getexpression(), null, "expressions", null, 0, -1, ElementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDesignatorEClass, FunctionDesignator.class, "FunctionDesignator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionDesignator_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, type.class, "type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettype_SimpleType(), this.getsimple_type(), null, "simpleType", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_StructuredType(), this.getstructured_type(), null, "structuredType", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_PointerType(), this.getpointer_type(), null, "pointerType", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettype_Name(), ecorePackage.getEString(), "name", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_typeEClass, simple_type.class, "simple_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsimple_type_PrimitiveType(), ecorePackage.getEString(), "primitiveType", null, 0, 1, simple_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_type_SubrangeType(), this.getsubrange_type(), null, "subrangeType", null, 0, 1, simple_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_type_EnumeratedType(), this.getenumerated_type(), null, "enumeratedType", null, 0, 1, simple_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerated_typeEClass, enumerated_type.class, "enumerated_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getenumerated_type_IdentifierList(), this.getidentifier_list(), null, "identifierList", null, 0, 1, enumerated_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subrange_typeEClass, subrange_type.class, "subrange_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsubrange_type_Constant(), this.getconstant(), null, "constant", null, 0, 1, subrange_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsubrange_type_Constant2(), this.getconstant(), null, "constant2", null, 0, 1, subrange_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structured_typeEClass, structured_type.class, "structured_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstructured_type_UnpackedStructuredType(), this.getunpacked_structured_type(), null, "unpackedStructuredType", null, 0, 1, structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unpacked_structured_typeEClass, unpacked_structured_type.class, "unpacked_structured_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunpacked_structured_type_ArrayType(), this.getarray_type(), null, "arrayType", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_structured_type_RecordType(), this.getrecord_type(), null, "recordType", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_structured_type_SetType(), this.getset_type(), null, "setType", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_structured_type_FileType(), this.getfile_type(), null, "fileType", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_typeEClass, array_type.class, "array_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getarray_type_SimpleTypes(), this.getsimple_type(), null, "simpleTypes", null, 0, -1, array_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getarray_type_Type(), this.gettype(), null, "type", null, 0, 1, array_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(record_typeEClass, record_type.class, "record_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrecord_type_Fieldlist(), this.getfield_list(), null, "fieldlist", null, 0, 1, record_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(set_typeEClass, set_type.class, "set_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getset_type_Type(), this.gettype(), null, "type", null, 0, 1, set_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(file_typeEClass, file_type.class, "file_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfile_type_Type(), this.gettype(), null, "type", null, 0, 1, file_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointer_typeEClass, pointer_type.class, "pointer_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpointer_type_Name(), ecorePackage.getEString(), "name", null, 0, 1, pointer_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(field_listEClass, field_list.class, "field_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfield_list_FixedPart(), this.getfixed_part(), null, "fixedPart", null, 0, 1, field_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfield_list_VariantPart(), this.getvariant_part(), null, "variantPart", null, 0, 1, field_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixed_partEClass, fixed_part.class, "fixed_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfixed_part_RecordSections(), this.getrecord_section(), null, "recordSections", null, 0, -1, fixed_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(record_sectionEClass, record_section.class, "record_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrecord_section_IdentifierList(), this.getidentifier_list(), null, "identifierList", null, 0, 1, record_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrecord_section_Type(), this.gettype(), null, "type", null, 0, 1, record_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variant_partEClass, variant_part.class, "variant_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariant_part_Tagfield(), this.gettag_field(), null, "tagfield", null, 0, 1, variant_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvariant_part_Id(), ecorePackage.getEString(), "id", null, 0, 1, variant_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariant_part_Variants(), this.getvariant(), null, "variants", null, 0, -1, variant_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tag_fieldEClass, tag_field.class, "tag_field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettag_field_Id(), ecorePackage.getEString(), "id", null, 0, 1, tag_field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantEClass, variant.class, "variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariant_CaseLabelList(), this.getcase_label_list(), null, "caseLabelList", null, 0, 1, variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariant_FieldList(), this.getfield_list(), null, "fieldList", null, 0, 1, variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionList_Expressions(), this.getexpression(), null, "expressions", null, 0, -1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifier_listEClass, identifier_list.class, "identifier_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getidentifier_list_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, identifier_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberEClass, number.class, "number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnumber_Integer(), ecorePackage.getEString(), "integer", null, 0, 1, number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnumber_Real(), ecorePackage.getEString(), "real", null, 0, 1, number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, label.class, "label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlabel_Int(), ecorePackage.getEString(), "int", null, 0, 1, label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, constant.class, "constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstant_Number(), this.getnumber(), null, "number", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_String(), ecorePackage.getEString(), "string", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PascalPackageImpl
