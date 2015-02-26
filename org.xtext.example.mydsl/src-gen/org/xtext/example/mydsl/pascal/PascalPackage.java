/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.pascal.PascalFactory
 * @model kind="package"
 * @generated
 */
public interface PascalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pascal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/Pascal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pascal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PascalPackage eINSTANCE = org.xtext.example.mydsl.pascal.impl.PascalPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.ModelImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Programs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROGRAMS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.programImpl <em>program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.programImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprogram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__BLOCK = 1;

  /**
   * The number of structural features of the '<em>program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.program_headingImpl <em>program heading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.program_headingImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprogram_heading()
   * @generated
   */
  int PROGRAM_HEADING = 2;

  /**
   * The number of structural features of the '<em>program heading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_HEADING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.blockImpl <em>block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.blockImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getblock()
   * @generated
   */
  int BLOCK = 3;

  /**
   * The feature id for the '<em><b>Declaration Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__DECLARATION_PART = 0;

  /**
   * The feature id for the '<em><b>Statement Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENT_PART = 1;

  /**
   * The number of structural features of the '<em>block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl <em>Declaration Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getDeclarationPart()
   * @generated
   */
  int DECLARATION_PART = 4;

  /**
   * The feature id for the '<em><b>Label Declaration Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_PART__LABEL_DECLARATION_PART = 0;

  /**
   * The feature id for the '<em><b>Constant Definition Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_PART__CONSTANT_DEFINITION_PART = 1;

  /**
   * The feature id for the '<em><b>Type Definition Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_PART__TYPE_DEFINITION_PART = 2;

  /**
   * The feature id for the '<em><b>Variable Declaration Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_PART__VARIABLE_DECLARATION_PART = 3;

  /**
   * The feature id for the '<em><b>Procedure And Function Declaration Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART = 4;

  /**
   * The number of structural features of the '<em>Declaration Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_PART_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.label_declaration_partImpl <em>label declaration part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.label_declaration_partImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getlabel_declaration_part()
   * @generated
   */
  int LABEL_DECLARATION_PART = 5;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DECLARATION_PART__LABELS = 0;

  /**
   * The number of structural features of the '<em>label declaration part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DECLARATION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.constant_definition_partImpl <em>constant definition part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.constant_definition_partImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconstant_definition_part()
   * @generated
   */
  int CONSTANT_DEFINITION_PART = 6;

  /**
   * The feature id for the '<em><b>Constant Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_PART__CONSTANT_DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>constant definition part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.constant_definitionImpl <em>constant definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.constant_definitionImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconstant_definition()
   * @generated
   */
  int CONSTANT_DEFINITION = 7;

  /**
   * The number of structural features of the '<em>constant definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.type_definition_partImpl <em>type definition part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.type_definition_partImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#gettype_definition_part()
   * @generated
   */
  int TYPE_DEFINITION_PART = 8;

  /**
   * The feature id for the '<em><b>Type Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_PART__TYPE_DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>type definition part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.type_definitionImpl <em>type definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.type_definitionImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#gettype_definition()
   * @generated
   */
  int TYPE_DEFINITION = 9;

  /**
   * The number of structural features of the '<em>type definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.variable_declaration_partImpl <em>variable declaration part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.variable_declaration_partImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariable_declaration_part()
   * @generated
   */
  int VARIABLE_DECLARATION_PART = 10;

  /**
   * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>variable declaration part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.variable_declarationImpl <em>variable declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.variable_declarationImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariable_declaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__IDENTIFIER_LIST = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = 1;

  /**
   * The number of structural features of the '<em>variable declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.procedure_and_function_declaration_partImpl <em>procedure and function declaration part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.procedure_and_function_declaration_partImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprocedure_and_function_declaration_part()
   * @generated
   */
  int PROCEDURE_AND_FUNCTION_DECLARATION_PART = 12;

  /**
   * The feature id for the '<em><b>Procedure Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Function Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>procedure and function declaration part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_AND_FUNCTION_DECLARATION_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.procedure_declarationImpl <em>procedure declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.procedure_declarationImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprocedure_declaration()
   * @generated
   */
  int PROCEDURE_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Formal Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION__FORMAL_PARAMETER_LIST = 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION__BLOCK = 2;

  /**
   * The number of structural features of the '<em>procedure declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.function_declarationImpl <em>function declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.function_declarationImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfunction_declaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Formal Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__BLOCK = 3;

  /**
   * The number of structural features of the '<em>function declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.statement_partImpl <em>statement part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.statement_partImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstatement_part()
   * @generated
   */
  int STATEMENT_PART = 15;

  /**
   * The number of structural features of the '<em>statement part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.procedure_headingImpl <em>procedure heading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.procedure_headingImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprocedure_heading()
   * @generated
   */
  int PROCEDURE_HEADING = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_HEADING__NAME = 0;

  /**
   * The feature id for the '<em><b>Formal Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_HEADING__FORMAL_PARAMETER_LIST = 1;

  /**
   * The number of structural features of the '<em>procedure heading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_HEADING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.function_headingImpl <em>function heading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.function_headingImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfunction_heading()
   * @generated
   */
  int FUNCTION_HEADING = 17;

  /**
   * The feature id for the '<em><b>Id1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADING__ID1 = 0;

  /**
   * The feature id for the '<em><b>Formal Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADING__FORMAL_PARAMETER_LIST = 1;

  /**
   * The feature id for the '<em><b>Id2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADING__ID2 = 2;

  /**
   * The number of structural features of the '<em>function heading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_listImpl <em>formal parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.formal_parameter_listImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getformal_parameter_list()
   * @generated
   */
  int FORMAL_PARAMETER_LIST = 18;

  /**
   * The feature id for the '<em><b>Formal Parameter Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS = 0;

  /**
   * The number of structural features of the '<em>formal parameter list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl <em>formal parameter section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getformal_parameter_section()
   * @generated
   */
  int FORMAL_PARAMETER_SECTION = 19;

  /**
   * The feature id for the '<em><b>Value Parameter Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION = 0;

  /**
   * The feature id for the '<em><b>Variable Paramenter Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION = 1;

  /**
   * The feature id for the '<em><b>Procedure Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING = 2;

  /**
   * The feature id for the '<em><b>Function Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_SECTION__FUNCTION_HEADING = 3;

  /**
   * The number of structural features of the '<em>formal parameter section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_SECTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.value_parameter_sectionImpl <em>value parameter section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.value_parameter_sectionImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvalue_parameter_section()
   * @generated
   */
  int VALUE_PARAMETER_SECTION = 20;

  /**
   * The feature id for the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PARAMETER_SECTION__IDENTIFIER_LIST = 0;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PARAMETER_SECTION__PARAMETER_TYPE = 1;

  /**
   * The number of structural features of the '<em>value parameter section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PARAMETER_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.variable_parameter_sectionImpl <em>variable parameter section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.variable_parameter_sectionImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariable_parameter_section()
   * @generated
   */
  int VARIABLE_PARAMETER_SECTION = 21;

  /**
   * The feature id for the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAMETER_SECTION__IDENTIFIER_LIST = 0;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAMETER_SECTION__PARAMETER_TYPE = 1;

  /**
   * The number of structural features of the '<em>variable parameter section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAMETER_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.parameter_typeImpl <em>parameter type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.parameter_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getparameter_type()
   * @generated
   */
  int PARAMETER_TYPE = 22;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__ID = 0;

  /**
   * The feature id for the '<em><b>Conformant Array Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA = 1;

  /**
   * The number of structural features of the '<em>parameter type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.conformant_array_schemaImpl <em>conformant array schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.conformant_array_schemaImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconformant_array_schema()
   * @generated
   */
  int CONFORMANT_ARRAY_SCHEMA = 23;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFORMANT_ARRAY_SCHEMA__ID = 0;

  /**
   * The number of structural features of the '<em>conformant array schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.packed_conformant_array_schemaImpl <em>packed conformant array schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.packed_conformant_array_schemaImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getpacked_conformant_array_schema()
   * @generated
   */
  int PACKED_CONFORMANT_ARRAY_SCHEMA = 24;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKED_CONFORMANT_ARRAY_SCHEMA__ID = CONFORMANT_ARRAY_SCHEMA__ID;

  /**
   * The feature id for the '<em><b>Bound Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>packed conformant array schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKED_CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.unpacked_conformant_array_SchemaImpl <em>unpacked conformant array Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.unpacked_conformant_array_SchemaImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getunpacked_conformant_array_Schema()
   * @generated
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA = 25;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA__ID = CONFORMANT_ARRAY_SCHEMA__ID;

  /**
   * The feature id for the '<em><b>Bound Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conformant Array Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>unpacked conformant array Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.bound_specificationImpl <em>bound specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.bound_specificationImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getbound_specification()
   * @generated
   */
  int BOUND_SPECIFICATION = 26;

  /**
   * The feature id for the '<em><b>Id1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_SPECIFICATION__ID1 = 0;

  /**
   * The feature id for the '<em><b>Id2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_SPECIFICATION__ID2 = 1;

  /**
   * The feature id for the '<em><b>Id3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_SPECIFICATION__ID3 = 2;

  /**
   * The number of structural features of the '<em>bound specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_SPECIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.statement_sequenceImpl <em>statement sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.statement_sequenceImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstatement_sequence()
   * @generated
   */
  int STATEMENT_SEQUENCE = 27;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE__STATEMENTS = STATEMENT_PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>statement sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE_FEATURE_COUNT = STATEMENT_PART_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 28;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.simple_statementImpl <em>simple statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.simple_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getsimple_statement()
   * @generated
   */
  int SIMPLE_STATEMENT = 29;

  /**
   * The number of structural features of the '<em>simple statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.assignment_statementImpl <em>assignment statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.assignment_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getassignment_statement()
   * @generated
   */
  int ASSIGNMENT_STATEMENT = 30;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__VARIABLE = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__IDENTIFIER = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__EXPRESSION = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>assignment statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.procedure_statementImpl <em>procedure statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.procedure_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprocedure_statement()
   * @generated
   */
  int PROCEDURE_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_STATEMENT__NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actual Parameter List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_STATEMENT__ACTUAL_PARAMETER_LIST = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>procedure statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.goto_statementImpl <em>goto statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.goto_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getgoto_statement()
   * @generated
   */
  int GOTO_STATEMENT = 32;

  /**
   * The number of structural features of the '<em>goto statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.structured_statementImpl <em>structured statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.structured_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstructured_statement()
   * @generated
   */
  int STRUCTURED_STATEMENT = 33;

  /**
   * The number of structural features of the '<em>structured statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.compound_statementImpl <em>compound statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.compound_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getcompound_statement()
   * @generated
   */
  int COMPOUND_STATEMENT = 34;

  /**
   * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT__STATEMENT_SEQUENCE = STRUCTURED_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>compound statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_FEATURE_COUNT = STRUCTURED_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.repetitive_statementImpl <em>repetitive statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.repetitive_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getrepetitive_statement()
   * @generated
   */
  int REPETITIVE_STATEMENT = 35;

  /**
   * The number of structural features of the '<em>repetitive statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPETITIVE_STATEMENT_FEATURE_COUNT = STRUCTURED_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.while_statementImpl <em>while statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.while_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getwhile_statement()
   * @generated
   */
  int WHILE_STATEMENT = 36;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EXPRESSION = REPETITIVE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STATEMENT = REPETITIVE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>while statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = REPETITIVE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.repeat_statementImpl <em>repeat statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.repeat_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getrepeat_statement()
   * @generated
   */
  int REPEAT_STATEMENT = 37;

  /**
   * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STATEMENT__STATEMENT_SEQUENCE = REPETITIVE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STATEMENT__EXPRESSION = REPETITIVE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>repeat statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STATEMENT_FEATURE_COUNT = REPETITIVE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.for_statementImpl <em>for statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.for_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfor_statement()
   * @generated
   */
  int FOR_STATEMENT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__NAME = REPETITIVE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSION1 = REPETITIVE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSION2 = REPETITIVE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STATEMENT = REPETITIVE_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>for statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = REPETITIVE_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.conditional_statementImpl <em>conditional statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.conditional_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconditional_statement()
   * @generated
   */
  int CONDITIONAL_STATEMENT = 39;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT__IF_STATEMENT = STRUCTURED_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Case Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT__CASE_STATEMENT = STRUCTURED_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>conditional statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT_FEATURE_COUNT = STRUCTURED_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.if_statementImpl <em>if statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.if_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getif_statement()
   * @generated
   */
  int IF_STATEMENT = 40;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__IF_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>if statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.case_statementImpl <em>case statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.case_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getcase_statement()
   * @generated
   */
  int CASE_STATEMENT = 41;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Case Limbs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__CASE_LIMBS = 1;

  /**
   * The number of structural features of the '<em>case statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.case_limbImpl <em>case limb</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.case_limbImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getcase_limb()
   * @generated
   */
  int CASE_LIMB = 42;

  /**
   * The feature id for the '<em><b>Case Label List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIMB__CASE_LABEL_LIST = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIMB__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>case limb</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIMB_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.case_label_listImpl <em>case label list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.case_label_listImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getcase_label_list()
   * @generated
   */
  int CASE_LABEL_LIST = 43;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LABEL_LIST__CONSTANTS = 0;

  /**
   * The number of structural features of the '<em>case label list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LABEL_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.with_statementImpl <em>with statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.with_statementImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getwith_statement()
   * @generated
   */
  int WITH_STATEMENT = 44;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT__VARIABLES = STRUCTURED_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT__STATEMENT = STRUCTURED_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>with statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT_FEATURE_COUNT = STRUCTURED_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.expressionImpl <em>expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.expressionImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getexpression()
   * @generated
   */
  int EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Simple Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SIMPLE_EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Relational operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RELATIONAL_OPERATORS = 1;

  /**
   * The number of structural features of the '<em>expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.simple_expressionImpl <em>simple expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.simple_expressionImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getsimple_expression()
   * @generated
   */
  int SIMPLE_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__TERMS = 0;

  /**
   * The number of structural features of the '<em>simple expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.termImpl <em>term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.termImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getterm()
   * @generated
   */
  int TERM = 47;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__FACTORS = 0;

  /**
   * The number of structural features of the '<em>term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.factorImpl <em>factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.factorImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfactor()
   * @generated
   */
  int FACTOR = 48;

  /**
   * The feature id for the '<em><b>Function Designator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FUNCTION_DESIGNATOR = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__NUMBER = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__STRING = 3;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__SET = 4;

  /**
   * The feature id for the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__NIL = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__ID = 6;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FACTOR = 8;

  /**
   * The number of structural features of the '<em>factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.variableImpl <em>variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.variableImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariable()
   * @generated
   */
  int VARIABLE = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Variable1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE1 = 1;

  /**
   * The number of structural features of the '<em>variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.Variable1Impl <em>Variable1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.Variable1Impl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getVariable1()
   * @generated
   */
  int VARIABLE1 = 50;

  /**
   * The feature id for the '<em><b>Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE1__EXPRESSION_LIST = 0;

  /**
   * The feature id for the '<em><b>Variable1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE1__VARIABLE1 = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE1__NAME = 2;

  /**
   * The number of structural features of the '<em>Variable1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE1_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.SetImpl <em>Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.SetImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getSet()
   * @generated
   */
  int SET = 51;

  /**
   * The feature id for the '<em><b>Element List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__ELEMENT_LIST = 0;

  /**
   * The number of structural features of the '<em>Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.ElementListImpl <em>Element List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.ElementListImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getElementList()
   * @generated
   */
  int ELEMENT_LIST = 52;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LIST__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Element List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.FunctionDesignatorImpl <em>Function Designator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.FunctionDesignatorImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getFunctionDesignator()
   * @generated
   */
  int FUNCTION_DESIGNATOR = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DESIGNATOR__NAME = 0;

  /**
   * The number of structural features of the '<em>Function Designator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DESIGNATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.typeImpl <em>type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#gettype()
   * @generated
   */
  int TYPE = 54;

  /**
   * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__SIMPLE_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__STRUCTURED_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pointer Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__POINTER_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.simple_typeImpl <em>simple type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.simple_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getsimple_type()
   * @generated
   */
  int SIMPLE_TYPE = 55;

  /**
   * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__PRIMITIVE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Subrange Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__SUBRANGE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Enumerated Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__ENUMERATED_TYPE = 2;

  /**
   * The number of structural features of the '<em>simple type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.enumerated_typeImpl <em>enumerated type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.enumerated_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getenumerated_type()
   * @generated
   */
  int ENUMERATED_TYPE = 56;

  /**
   * The feature id for the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_TYPE__IDENTIFIER_LIST = 0;

  /**
   * The number of structural features of the '<em>enumerated type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.subrange_typeImpl <em>subrange type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.subrange_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getsubrange_type()
   * @generated
   */
  int SUBRANGE_TYPE = 57;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE__CONSTANT = 0;

  /**
   * The feature id for the '<em><b>Constant2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE__CONSTANT2 = 1;

  /**
   * The number of structural features of the '<em>subrange type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.structured_typeImpl <em>structured type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.structured_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstructured_type()
   * @generated
   */
  int STRUCTURED_TYPE = 58;

  /**
   * The feature id for the '<em><b>Unpacked Structured Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE = 0;

  /**
   * The number of structural features of the '<em>structured type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.unpacked_structured_typeImpl <em>unpacked structured type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.unpacked_structured_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getunpacked_structured_type()
   * @generated
   */
  int UNPACKED_STRUCTURED_TYPE = 59;

  /**
   * The feature id for the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE = 0;

  /**
   * The feature id for the '<em><b>Record Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_STRUCTURED_TYPE__RECORD_TYPE = 1;

  /**
   * The feature id for the '<em><b>Set Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_STRUCTURED_TYPE__SET_TYPE = 2;

  /**
   * The feature id for the '<em><b>File Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_STRUCTURED_TYPE__FILE_TYPE = 3;

  /**
   * The number of structural features of the '<em>unpacked structured type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.array_typeImpl <em>array type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.array_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getarray_type()
   * @generated
   */
  int ARRAY_TYPE = 60;

  /**
   * The feature id for the '<em><b>Simple Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__SIMPLE_TYPES = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__TYPE = 1;

  /**
   * The number of structural features of the '<em>array type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.record_typeImpl <em>record type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.record_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getrecord_type()
   * @generated
   */
  int RECORD_TYPE = 61;

  /**
   * The feature id for the '<em><b>Fieldlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__FIELDLIST = 0;

  /**
   * The number of structural features of the '<em>record type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.set_typeImpl <em>set type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.set_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getset_type()
   * @generated
   */
  int SET_TYPE = 62;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>set type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.file_typeImpl <em>file type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.file_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfile_type()
   * @generated
   */
  int FILE_TYPE = 63;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>file type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.pointer_typeImpl <em>pointer type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.pointer_typeImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getpointer_type()
   * @generated
   */
  int POINTER_TYPE = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>pointer type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.field_listImpl <em>field list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.field_listImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfield_list()
   * @generated
   */
  int FIELD_LIST = 65;

  /**
   * The feature id for the '<em><b>Fixed Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST__FIXED_PART = 0;

  /**
   * The feature id for the '<em><b>Variant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST__VARIANT_PART = 1;

  /**
   * The number of structural features of the '<em>field list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.fixed_partImpl <em>fixed part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.fixed_partImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfixed_part()
   * @generated
   */
  int FIXED_PART = 66;

  /**
   * The feature id for the '<em><b>Record Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PART__RECORD_SECTIONS = 0;

  /**
   * The number of structural features of the '<em>fixed part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.record_sectionImpl <em>record section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.record_sectionImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getrecord_section()
   * @generated
   */
  int RECORD_SECTION = 67;

  /**
   * The feature id for the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_SECTION__IDENTIFIER_LIST = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_SECTION__TYPE = 1;

  /**
   * The number of structural features of the '<em>record section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.variant_partImpl <em>variant part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.variant_partImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariant_part()
   * @generated
   */
  int VARIANT_PART = 68;

  /**
   * The feature id for the '<em><b>Tagfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART__TAGFIELD = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART__ID = 1;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART__VARIANTS = 2;

  /**
   * The number of structural features of the '<em>variant part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.tag_fieldImpl <em>tag field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.tag_fieldImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#gettag_field()
   * @generated
   */
  int TAG_FIELD = 69;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FIELD__ID = 0;

  /**
   * The number of structural features of the '<em>tag field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.variantImpl <em>variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.variantImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariant()
   * @generated
   */
  int VARIANT = 70;

  /**
   * The feature id for the '<em><b>Case Label List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__CASE_LABEL_LIST = 0;

  /**
   * The feature id for the '<em><b>Field List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__FIELD_LIST = 1;

  /**
   * The number of structural features of the '<em>variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.ExpressionListImpl <em>Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.ExpressionListImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getExpressionList()
   * @generated
   */
  int EXPRESSION_LIST = 71;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.identifier_listImpl <em>identifier list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.identifier_listImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getidentifier_list()
   * @generated
   */
  int IDENTIFIER_LIST = 72;

  /**
   * The feature id for the '<em><b>Ids</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_LIST__IDS = PROGRAM_HEADING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>identifier list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_LIST_FEATURE_COUNT = PROGRAM_HEADING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.numberImpl <em>number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.numberImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getnumber()
   * @generated
   */
  int NUMBER = 73;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__INTEGER = 0;

  /**
   * The feature id for the '<em><b>Real</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__REAL = 1;

  /**
   * The number of structural features of the '<em>number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.labelImpl <em>label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.labelImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getlabel()
   * @generated
   */
  int LABEL = 74;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__STATEMENT = STATEMENT__STATEMENT;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__INT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.pascal.impl.constantImpl <em>constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.pascal.impl.constantImpl
   * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconstant()
   * @generated
   */
  int CONSTANT = 75;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = CONSTANT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NUMBER = CONSTANT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STRING = CONSTANT_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = CONSTANT_DEFINITION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.pascal.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.Model#getPrograms <em>Programs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Programs</em>'.
   * @see org.xtext.example.mydsl.pascal.Model#getPrograms()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Programs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.program <em>program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>program</em>'.
   * @see org.xtext.example.mydsl.pascal.program
   * @generated
   */
  EClass getprogram();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.program#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see org.xtext.example.mydsl.pascal.program#getProgram()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Program();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.program#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.mydsl.pascal.program#getBlock()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.program_heading <em>program heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>program heading</em>'.
   * @see org.xtext.example.mydsl.pascal.program_heading
   * @generated
   */
  EClass getprogram_heading();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.block <em>block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>block</em>'.
   * @see org.xtext.example.mydsl.pascal.block
   * @generated
   */
  EClass getblock();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.block#getDeclarationPart <em>Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration Part</em>'.
   * @see org.xtext.example.mydsl.pascal.block#getDeclarationPart()
   * @see #getblock()
   * @generated
   */
  EReference getblock_DeclarationPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.block#getStatementPart <em>Statement Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Part</em>'.
   * @see org.xtext.example.mydsl.pascal.block#getStatementPart()
   * @see #getblock()
   * @generated
   */
  EReference getblock_StatementPart();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.DeclarationPart <em>Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration Part</em>'.
   * @see org.xtext.example.mydsl.pascal.DeclarationPart
   * @generated
   */
  EClass getDeclarationPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getLabelDeclarationPart <em>Label Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label Declaration Part</em>'.
   * @see org.xtext.example.mydsl.pascal.DeclarationPart#getLabelDeclarationPart()
   * @see #getDeclarationPart()
   * @generated
   */
  EReference getDeclarationPart_LabelDeclarationPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getConstantDefinitionPart <em>Constant Definition Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant Definition Part</em>'.
   * @see org.xtext.example.mydsl.pascal.DeclarationPart#getConstantDefinitionPart()
   * @see #getDeclarationPart()
   * @generated
   */
  EReference getDeclarationPart_ConstantDefinitionPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getTypeDefinitionPart <em>Type Definition Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Definition Part</em>'.
   * @see org.xtext.example.mydsl.pascal.DeclarationPart#getTypeDefinitionPart()
   * @see #getDeclarationPart()
   * @generated
   */
  EReference getDeclarationPart_TypeDefinitionPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getVariableDeclarationPart <em>Variable Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration Part</em>'.
   * @see org.xtext.example.mydsl.pascal.DeclarationPart#getVariableDeclarationPart()
   * @see #getDeclarationPart()
   * @generated
   */
  EReference getDeclarationPart_VariableDeclarationPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getProcedureAndFunctionDeclarationPart <em>Procedure And Function Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Procedure And Function Declaration Part</em>'.
   * @see org.xtext.example.mydsl.pascal.DeclarationPart#getProcedureAndFunctionDeclarationPart()
   * @see #getDeclarationPart()
   * @generated
   */
  EReference getDeclarationPart_ProcedureAndFunctionDeclarationPart();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.label_declaration_part <em>label declaration part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>label declaration part</em>'.
   * @see org.xtext.example.mydsl.pascal.label_declaration_part
   * @generated
   */
  EClass getlabel_declaration_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.label_declaration_part#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Labels</em>'.
   * @see org.xtext.example.mydsl.pascal.label_declaration_part#getLabels()
   * @see #getlabel_declaration_part()
   * @generated
   */
  EReference getlabel_declaration_part_Labels();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.constant_definition_part <em>constant definition part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant definition part</em>'.
   * @see org.xtext.example.mydsl.pascal.constant_definition_part
   * @generated
   */
  EClass getconstant_definition_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.constant_definition_part#getConstantDefinitions <em>Constant Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant Definitions</em>'.
   * @see org.xtext.example.mydsl.pascal.constant_definition_part#getConstantDefinitions()
   * @see #getconstant_definition_part()
   * @generated
   */
  EReference getconstant_definition_part_ConstantDefinitions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.constant_definition <em>constant definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant definition</em>'.
   * @see org.xtext.example.mydsl.pascal.constant_definition
   * @generated
   */
  EClass getconstant_definition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.type_definition_part <em>type definition part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type definition part</em>'.
   * @see org.xtext.example.mydsl.pascal.type_definition_part
   * @generated
   */
  EClass gettype_definition_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.type_definition_part#getTypeDefinitions <em>Type Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Definitions</em>'.
   * @see org.xtext.example.mydsl.pascal.type_definition_part#getTypeDefinitions()
   * @see #gettype_definition_part()
   * @generated
   */
  EReference gettype_definition_part_TypeDefinitions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.type_definition <em>type definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type definition</em>'.
   * @see org.xtext.example.mydsl.pascal.type_definition
   * @generated
   */
  EClass gettype_definition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.variable_declaration_part <em>variable declaration part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable declaration part</em>'.
   * @see org.xtext.example.mydsl.pascal.variable_declaration_part
   * @generated
   */
  EClass getvariable_declaration_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.variable_declaration_part#getVariableDeclarations <em>Variable Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
   * @see org.xtext.example.mydsl.pascal.variable_declaration_part#getVariableDeclarations()
   * @see #getvariable_declaration_part()
   * @generated
   */
  EReference getvariable_declaration_part_VariableDeclarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.variable_declaration <em>variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable declaration</em>'.
   * @see org.xtext.example.mydsl.pascal.variable_declaration
   * @generated
   */
  EClass getvariable_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.variable_declaration#getIdentifierList <em>Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier List</em>'.
   * @see org.xtext.example.mydsl.pascal.variable_declaration#getIdentifierList()
   * @see #getvariable_declaration()
   * @generated
   */
  EReference getvariable_declaration_IdentifierList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.variable_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.pascal.variable_declaration#getType()
   * @see #getvariable_declaration()
   * @generated
   */
  EReference getvariable_declaration_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part <em>procedure and function declaration part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>procedure and function declaration part</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part
   * @generated
   */
  EClass getprocedure_and_function_declaration_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part#getProcedureDeclarations <em>Procedure Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedure Declarations</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part#getProcedureDeclarations()
   * @see #getprocedure_and_function_declaration_part()
   * @generated
   */
  EReference getprocedure_and_function_declaration_part_ProcedureDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part#getFunctionDeclarations <em>Function Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Declarations</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part#getFunctionDeclarations()
   * @see #getprocedure_and_function_declaration_part()
   * @generated
   */
  EReference getprocedure_and_function_declaration_part_FunctionDeclarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.procedure_declaration <em>procedure declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>procedure declaration</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_declaration
   * @generated
   */
  EClass getprocedure_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.procedure_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_declaration#getName()
   * @see #getprocedure_declaration()
   * @generated
   */
  EAttribute getprocedure_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.procedure_declaration#getFormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameter List</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_declaration#getFormalParameterList()
   * @see #getprocedure_declaration()
   * @generated
   */
  EReference getprocedure_declaration_FormalParameterList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.procedure_declaration#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_declaration#getBlock()
   * @see #getprocedure_declaration()
   * @generated
   */
  EReference getprocedure_declaration_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.function_declaration <em>function declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function declaration</em>'.
   * @see org.xtext.example.mydsl.pascal.function_declaration
   * @generated
   */
  EClass getfunction_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.function_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.function_declaration#getName()
   * @see #getfunction_declaration()
   * @generated
   */
  EAttribute getfunction_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.function_declaration#getFormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameter List</em>'.
   * @see org.xtext.example.mydsl.pascal.function_declaration#getFormalParameterList()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_FormalParameterList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.function_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.pascal.function_declaration#getType()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.function_declaration#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.mydsl.pascal.function_declaration#getBlock()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.statement_part <em>statement part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement part</em>'.
   * @see org.xtext.example.mydsl.pascal.statement_part
   * @generated
   */
  EClass getstatement_part();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.procedure_heading <em>procedure heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>procedure heading</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_heading
   * @generated
   */
  EClass getprocedure_heading();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.procedure_heading#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_heading#getName()
   * @see #getprocedure_heading()
   * @generated
   */
  EAttribute getprocedure_heading_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.procedure_heading#getFormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameter List</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_heading#getFormalParameterList()
   * @see #getprocedure_heading()
   * @generated
   */
  EReference getprocedure_heading_FormalParameterList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.function_heading <em>function heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function heading</em>'.
   * @see org.xtext.example.mydsl.pascal.function_heading
   * @generated
   */
  EClass getfunction_heading();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.function_heading#getId1 <em>Id1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id1</em>'.
   * @see org.xtext.example.mydsl.pascal.function_heading#getId1()
   * @see #getfunction_heading()
   * @generated
   */
  EAttribute getfunction_heading_Id1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.function_heading#getFormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameter List</em>'.
   * @see org.xtext.example.mydsl.pascal.function_heading#getFormalParameterList()
   * @see #getfunction_heading()
   * @generated
   */
  EReference getfunction_heading_FormalParameterList();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.function_heading#getId2 <em>Id2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id2</em>'.
   * @see org.xtext.example.mydsl.pascal.function_heading#getId2()
   * @see #getfunction_heading()
   * @generated
   */
  EAttribute getfunction_heading_Id2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.formal_parameter_list <em>formal parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>formal parameter list</em>'.
   * @see org.xtext.example.mydsl.pascal.formal_parameter_list
   * @generated
   */
  EClass getformal_parameter_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.formal_parameter_list#getFormalParameterSections <em>Formal Parameter Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formal Parameter Sections</em>'.
   * @see org.xtext.example.mydsl.pascal.formal_parameter_list#getFormalParameterSections()
   * @see #getformal_parameter_list()
   * @generated
   */
  EReference getformal_parameter_list_FormalParameterSections();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.formal_parameter_section <em>formal parameter section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>formal parameter section</em>'.
   * @see org.xtext.example.mydsl.pascal.formal_parameter_section
   * @generated
   */
  EClass getformal_parameter_section();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getValueParameterSection <em>Value Parameter Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Parameter Section</em>'.
   * @see org.xtext.example.mydsl.pascal.formal_parameter_section#getValueParameterSection()
   * @see #getformal_parameter_section()
   * @generated
   */
  EReference getformal_parameter_section_ValueParameterSection();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getVariableParamenterSection <em>Variable Paramenter Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Paramenter Section</em>'.
   * @see org.xtext.example.mydsl.pascal.formal_parameter_section#getVariableParamenterSection()
   * @see #getformal_parameter_section()
   * @generated
   */
  EReference getformal_parameter_section_VariableParamenterSection();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getProcedureHeading <em>Procedure Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Procedure Heading</em>'.
   * @see org.xtext.example.mydsl.pascal.formal_parameter_section#getProcedureHeading()
   * @see #getformal_parameter_section()
   * @generated
   */
  EReference getformal_parameter_section_ProcedureHeading();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getFunctionHeading <em>Function Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function Heading</em>'.
   * @see org.xtext.example.mydsl.pascal.formal_parameter_section#getFunctionHeading()
   * @see #getformal_parameter_section()
   * @generated
   */
  EReference getformal_parameter_section_FunctionHeading();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.value_parameter_section <em>value parameter section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>value parameter section</em>'.
   * @see org.xtext.example.mydsl.pascal.value_parameter_section
   * @generated
   */
  EClass getvalue_parameter_section();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.value_parameter_section#getIdentifierList <em>Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier List</em>'.
   * @see org.xtext.example.mydsl.pascal.value_parameter_section#getIdentifierList()
   * @see #getvalue_parameter_section()
   * @generated
   */
  EReference getvalue_parameter_section_IdentifierList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.value_parameter_section#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Type</em>'.
   * @see org.xtext.example.mydsl.pascal.value_parameter_section#getParameterType()
   * @see #getvalue_parameter_section()
   * @generated
   */
  EReference getvalue_parameter_section_ParameterType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.variable_parameter_section <em>variable parameter section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable parameter section</em>'.
   * @see org.xtext.example.mydsl.pascal.variable_parameter_section
   * @generated
   */
  EClass getvariable_parameter_section();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.variable_parameter_section#getIdentifierList <em>Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier List</em>'.
   * @see org.xtext.example.mydsl.pascal.variable_parameter_section#getIdentifierList()
   * @see #getvariable_parameter_section()
   * @generated
   */
  EReference getvariable_parameter_section_IdentifierList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.variable_parameter_section#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Type</em>'.
   * @see org.xtext.example.mydsl.pascal.variable_parameter_section#getParameterType()
   * @see #getvariable_parameter_section()
   * @generated
   */
  EReference getvariable_parameter_section_ParameterType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.parameter_type <em>parameter type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter type</em>'.
   * @see org.xtext.example.mydsl.pascal.parameter_type
   * @generated
   */
  EClass getparameter_type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.parameter_type#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.pascal.parameter_type#getId()
   * @see #getparameter_type()
   * @generated
   */
  EAttribute getparameter_type_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.parameter_type#getConformantArraySchema <em>Conformant Array Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conformant Array Schema</em>'.
   * @see org.xtext.example.mydsl.pascal.parameter_type#getConformantArraySchema()
   * @see #getparameter_type()
   * @generated
   */
  EReference getparameter_type_ConformantArraySchema();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.conformant_array_schema <em>conformant array schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>conformant array schema</em>'.
   * @see org.xtext.example.mydsl.pascal.conformant_array_schema
   * @generated
   */
  EClass getconformant_array_schema();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.conformant_array_schema#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.pascal.conformant_array_schema#getId()
   * @see #getconformant_array_schema()
   * @generated
   */
  EAttribute getconformant_array_schema_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.packed_conformant_array_schema <em>packed conformant array schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>packed conformant array schema</em>'.
   * @see org.xtext.example.mydsl.pascal.packed_conformant_array_schema
   * @generated
   */
  EClass getpacked_conformant_array_schema();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.packed_conformant_array_schema#getBoundSpecification <em>Bound Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bound Specification</em>'.
   * @see org.xtext.example.mydsl.pascal.packed_conformant_array_schema#getBoundSpecification()
   * @see #getpacked_conformant_array_schema()
   * @generated
   */
  EReference getpacked_conformant_array_schema_BoundSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema <em>unpacked conformant array Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unpacked conformant array Schema</em>'.
   * @see org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema
   * @generated
   */
  EClass getunpacked_conformant_array_Schema();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema#getBoundSpecifications <em>Bound Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bound Specifications</em>'.
   * @see org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema#getBoundSpecifications()
   * @see #getunpacked_conformant_array_Schema()
   * @generated
   */
  EReference getunpacked_conformant_array_Schema_BoundSpecifications();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema#getConformantArraySchema <em>Conformant Array Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conformant Array Schema</em>'.
   * @see org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema#getConformantArraySchema()
   * @see #getunpacked_conformant_array_Schema()
   * @generated
   */
  EReference getunpacked_conformant_array_Schema_ConformantArraySchema();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.bound_specification <em>bound specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bound specification</em>'.
   * @see org.xtext.example.mydsl.pascal.bound_specification
   * @generated
   */
  EClass getbound_specification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.bound_specification#getId1 <em>Id1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id1</em>'.
   * @see org.xtext.example.mydsl.pascal.bound_specification#getId1()
   * @see #getbound_specification()
   * @generated
   */
  EAttribute getbound_specification_Id1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.bound_specification#getId2 <em>Id2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id2</em>'.
   * @see org.xtext.example.mydsl.pascal.bound_specification#getId2()
   * @see #getbound_specification()
   * @generated
   */
  EAttribute getbound_specification_Id2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.bound_specification#getId3 <em>Id3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id3</em>'.
   * @see org.xtext.example.mydsl.pascal.bound_specification#getId3()
   * @see #getbound_specification()
   * @generated
   */
  EAttribute getbound_specification_Id3();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.statement_sequence <em>statement sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement sequence</em>'.
   * @see org.xtext.example.mydsl.pascal.statement_sequence
   * @generated
   */
  EClass getstatement_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.statement_sequence#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.example.mydsl.pascal.statement_sequence#getStatements()
   * @see #getstatement_sequence()
   * @generated
   */
  EReference getstatement_sequence_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see org.xtext.example.mydsl.pascal.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.statement#getStatement()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.simple_statement <em>simple statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple statement</em>'.
   * @see org.xtext.example.mydsl.pascal.simple_statement
   * @generated
   */
  EClass getsimple_statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.assignment_statement <em>assignment statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assignment statement</em>'.
   * @see org.xtext.example.mydsl.pascal.assignment_statement
   * @generated
   */
  EClass getassignment_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.assignment_statement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.pascal.assignment_statement#getVariable()
   * @see #getassignment_statement()
   * @generated
   */
  EAttribute getassignment_statement_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.assignment_statement#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.example.mydsl.pascal.assignment_statement#getIdentifier()
   * @see #getassignment_statement()
   * @generated
   */
  EAttribute getassignment_statement_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.assignment_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.pascal.assignment_statement#getExpression()
   * @see #getassignment_statement()
   * @generated
   */
  EReference getassignment_statement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.procedure_statement <em>procedure statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>procedure statement</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_statement
   * @generated
   */
  EClass getprocedure_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.procedure_statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_statement#getName()
   * @see #getprocedure_statement()
   * @generated
   */
  EAttribute getprocedure_statement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.procedure_statement#getActualParameterList <em>Actual Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actual Parameter List</em>'.
   * @see org.xtext.example.mydsl.pascal.procedure_statement#getActualParameterList()
   * @see #getprocedure_statement()
   * @generated
   */
  EAttribute getprocedure_statement_ActualParameterList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.goto_statement <em>goto statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>goto statement</em>'.
   * @see org.xtext.example.mydsl.pascal.goto_statement
   * @generated
   */
  EClass getgoto_statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.structured_statement <em>structured statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>structured statement</em>'.
   * @see org.xtext.example.mydsl.pascal.structured_statement
   * @generated
   */
  EClass getstructured_statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.compound_statement <em>compound statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compound statement</em>'.
   * @see org.xtext.example.mydsl.pascal.compound_statement
   * @generated
   */
  EClass getcompound_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.compound_statement#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.xtext.example.mydsl.pascal.compound_statement#getStatementSequence()
   * @see #getcompound_statement()
   * @generated
   */
  EReference getcompound_statement_StatementSequence();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.repetitive_statement <em>repetitive statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>repetitive statement</em>'.
   * @see org.xtext.example.mydsl.pascal.repetitive_statement
   * @generated
   */
  EClass getrepetitive_statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.while_statement <em>while statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>while statement</em>'.
   * @see org.xtext.example.mydsl.pascal.while_statement
   * @generated
   */
  EClass getwhile_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.while_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.pascal.while_statement#getExpression()
   * @see #getwhile_statement()
   * @generated
   */
  EReference getwhile_statement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.while_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.while_statement#getStatement()
   * @see #getwhile_statement()
   * @generated
   */
  EReference getwhile_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.repeat_statement <em>repeat statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>repeat statement</em>'.
   * @see org.xtext.example.mydsl.pascal.repeat_statement
   * @generated
   */
  EClass getrepeat_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.repeat_statement#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.xtext.example.mydsl.pascal.repeat_statement#getStatementSequence()
   * @see #getrepeat_statement()
   * @generated
   */
  EReference getrepeat_statement_StatementSequence();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.repeat_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.pascal.repeat_statement#getExpression()
   * @see #getrepeat_statement()
   * @generated
   */
  EReference getrepeat_statement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.for_statement <em>for statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for statement</em>'.
   * @see org.xtext.example.mydsl.pascal.for_statement
   * @generated
   */
  EClass getfor_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.for_statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.for_statement#getName()
   * @see #getfor_statement()
   * @generated
   */
  EAttribute getfor_statement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.for_statement#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.xtext.example.mydsl.pascal.for_statement#getExpression1()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_Expression1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.for_statement#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.example.mydsl.pascal.for_statement#getExpression2()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_Expression2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.for_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.for_statement#getStatement()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.conditional_statement <em>conditional statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>conditional statement</em>'.
   * @see org.xtext.example.mydsl.pascal.conditional_statement
   * @generated
   */
  EClass getconditional_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.conditional_statement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.conditional_statement#getIfStatement()
   * @see #getconditional_statement()
   * @generated
   */
  EReference getconditional_statement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.conditional_statement#getCaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.conditional_statement#getCaseStatement()
   * @see #getconditional_statement()
   * @generated
   */
  EReference getconditional_statement_CaseStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.if_statement <em>if statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>if statement</em>'.
   * @see org.xtext.example.mydsl.pascal.if_statement
   * @generated
   */
  EClass getif_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.if_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.pascal.if_statement#getExpression()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.if_statement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.if_statement#getIfStatement()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.if_statement#getElseStatement <em>Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.if_statement#getElseStatement()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_ElseStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.case_statement <em>case statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>case statement</em>'.
   * @see org.xtext.example.mydsl.pascal.case_statement
   * @generated
   */
  EClass getcase_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.case_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.pascal.case_statement#getExpression()
   * @see #getcase_statement()
   * @generated
   */
  EReference getcase_statement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.case_statement#getCaseLimbs <em>Case Limbs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Limbs</em>'.
   * @see org.xtext.example.mydsl.pascal.case_statement#getCaseLimbs()
   * @see #getcase_statement()
   * @generated
   */
  EReference getcase_statement_CaseLimbs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.case_limb <em>case limb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>case limb</em>'.
   * @see org.xtext.example.mydsl.pascal.case_limb
   * @generated
   */
  EClass getcase_limb();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.case_limb#getCaseLabelList <em>Case Label List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Label List</em>'.
   * @see org.xtext.example.mydsl.pascal.case_limb#getCaseLabelList()
   * @see #getcase_limb()
   * @generated
   */
  EReference getcase_limb_CaseLabelList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.case_limb#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.case_limb#getStatement()
   * @see #getcase_limb()
   * @generated
   */
  EReference getcase_limb_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.case_label_list <em>case label list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>case label list</em>'.
   * @see org.xtext.example.mydsl.pascal.case_label_list
   * @generated
   */
  EClass getcase_label_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.case_label_list#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.xtext.example.mydsl.pascal.case_label_list#getConstants()
   * @see #getcase_label_list()
   * @generated
   */
  EReference getcase_label_list_Constants();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.with_statement <em>with statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>with statement</em>'.
   * @see org.xtext.example.mydsl.pascal.with_statement
   * @generated
   */
  EClass getwith_statement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.with_statement#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.example.mydsl.pascal.with_statement#getVariables()
   * @see #getwith_statement()
   * @generated
   */
  EReference getwith_statement_Variables();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.with_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.pascal.with_statement#getStatement()
   * @see #getwith_statement()
   * @generated
   */
  EReference getwith_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression</em>'.
   * @see org.xtext.example.mydsl.pascal.expression
   * @generated
   */
  EClass getexpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.expression#getSimpleExpressions <em>Simple Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Simple Expressions</em>'.
   * @see org.xtext.example.mydsl.pascal.expression#getSimpleExpressions()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_SimpleExpressions();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.pascal.expression#getRelational_operators <em>Relational operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Relational operators</em>'.
   * @see org.xtext.example.mydsl.pascal.expression#getRelational_operators()
   * @see #getexpression()
   * @generated
   */
  EAttribute getexpression_Relational_operators();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.simple_expression <em>simple expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple expression</em>'.
   * @see org.xtext.example.mydsl.pascal.simple_expression
   * @generated
   */
  EClass getsimple_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.simple_expression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see org.xtext.example.mydsl.pascal.simple_expression#getTerms()
   * @see #getsimple_expression()
   * @generated
   */
  EReference getsimple_expression_Terms();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term</em>'.
   * @see org.xtext.example.mydsl.pascal.term
   * @generated
   */
  EClass getterm();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.term#getFactors <em>Factors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Factors</em>'.
   * @see org.xtext.example.mydsl.pascal.term#getFactors()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Factors();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.factor <em>factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>factor</em>'.
   * @see org.xtext.example.mydsl.pascal.factor
   * @generated
   */
  EClass getfactor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.factor#getFunctionDesignator <em>Function Designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function Designator</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getFunctionDesignator()
   * @see #getfactor()
   * @generated
   */
  EReference getfactor_FunctionDesignator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.factor#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getVariable()
   * @see #getfactor()
   * @generated
   */
  EReference getfactor_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.factor#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getNumber()
   * @see #getfactor()
   * @generated
   */
  EReference getfactor_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.factor#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getString()
   * @see #getfactor()
   * @generated
   */
  EAttribute getfactor_String();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.factor#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getSet()
   * @see #getfactor()
   * @generated
   */
  EReference getfactor_Set();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.factor#getNil <em>Nil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nil</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getNil()
   * @see #getfactor()
   * @generated
   */
  EAttribute getfactor_Nil();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.factor#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getId()
   * @see #getfactor()
   * @generated
   */
  EAttribute getfactor_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.factor#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getExpression()
   * @see #getfactor()
   * @generated
   */
  EReference getfactor_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.factor#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Factor</em>'.
   * @see org.xtext.example.mydsl.pascal.factor#getFactor()
   * @see #getfactor()
   * @generated
   */
  EReference getfactor_Factor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.variable <em>variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable</em>'.
   * @see org.xtext.example.mydsl.pascal.variable
   * @generated
   */
  EClass getvariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.variable#getName()
   * @see #getvariable()
   * @generated
   */
  EAttribute getvariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.variable#getVariable1 <em>Variable1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable1</em>'.
   * @see org.xtext.example.mydsl.pascal.variable#getVariable1()
   * @see #getvariable()
   * @generated
   */
  EReference getvariable_Variable1();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.Variable1 <em>Variable1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable1</em>'.
   * @see org.xtext.example.mydsl.pascal.Variable1
   * @generated
   */
  EClass getVariable1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.Variable1#getExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression List</em>'.
   * @see org.xtext.example.mydsl.pascal.Variable1#getExpressionList()
   * @see #getVariable1()
   * @generated
   */
  EReference getVariable1_ExpressionList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.Variable1#getVariable1 <em>Variable1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable1</em>'.
   * @see org.xtext.example.mydsl.pascal.Variable1#getVariable1()
   * @see #getVariable1()
   * @generated
   */
  EReference getVariable1_Variable1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.Variable1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.Variable1#getName()
   * @see #getVariable1()
   * @generated
   */
  EAttribute getVariable1_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set</em>'.
   * @see org.xtext.example.mydsl.pascal.Set
   * @generated
   */
  EClass getSet();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.Set#getElementList <em>Element List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element List</em>'.
   * @see org.xtext.example.mydsl.pascal.Set#getElementList()
   * @see #getSet()
   * @generated
   */
  EReference getSet_ElementList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.ElementList <em>Element List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element List</em>'.
   * @see org.xtext.example.mydsl.pascal.ElementList
   * @generated
   */
  EClass getElementList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.ElementList#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.xtext.example.mydsl.pascal.ElementList#getExpressions()
   * @see #getElementList()
   * @generated
   */
  EReference getElementList_Expressions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.FunctionDesignator <em>Function Designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Designator</em>'.
   * @see org.xtext.example.mydsl.pascal.FunctionDesignator
   * @generated
   */
  EClass getFunctionDesignator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.FunctionDesignator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.FunctionDesignator#getName()
   * @see #getFunctionDesignator()
   * @generated
   */
  EAttribute getFunctionDesignator_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type</em>'.
   * @see org.xtext.example.mydsl.pascal.type
   * @generated
   */
  EClass gettype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.type#getSimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Type</em>'.
   * @see org.xtext.example.mydsl.pascal.type#getSimpleType()
   * @see #gettype()
   * @generated
   */
  EReference gettype_SimpleType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.type#getStructuredType <em>Structured Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured Type</em>'.
   * @see org.xtext.example.mydsl.pascal.type#getStructuredType()
   * @see #gettype()
   * @generated
   */
  EReference gettype_StructuredType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.type#getPointerType <em>Pointer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointer Type</em>'.
   * @see org.xtext.example.mydsl.pascal.type#getPointerType()
   * @see #gettype()
   * @generated
   */
  EReference gettype_PointerType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.type#getName()
   * @see #gettype()
   * @generated
   */
  EAttribute gettype_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.simple_type <em>simple type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple type</em>'.
   * @see org.xtext.example.mydsl.pascal.simple_type
   * @generated
   */
  EClass getsimple_type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.simple_type#getPrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primitive Type</em>'.
   * @see org.xtext.example.mydsl.pascal.simple_type#getPrimitiveType()
   * @see #getsimple_type()
   * @generated
   */
  EAttribute getsimple_type_PrimitiveType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.simple_type#getSubrangeType <em>Subrange Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subrange Type</em>'.
   * @see org.xtext.example.mydsl.pascal.simple_type#getSubrangeType()
   * @see #getsimple_type()
   * @generated
   */
  EReference getsimple_type_SubrangeType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.simple_type#getEnumeratedType <em>Enumerated Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumerated Type</em>'.
   * @see org.xtext.example.mydsl.pascal.simple_type#getEnumeratedType()
   * @see #getsimple_type()
   * @generated
   */
  EReference getsimple_type_EnumeratedType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.enumerated_type <em>enumerated type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enumerated type</em>'.
   * @see org.xtext.example.mydsl.pascal.enumerated_type
   * @generated
   */
  EClass getenumerated_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.enumerated_type#getIdentifierList <em>Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier List</em>'.
   * @see org.xtext.example.mydsl.pascal.enumerated_type#getIdentifierList()
   * @see #getenumerated_type()
   * @generated
   */
  EReference getenumerated_type_IdentifierList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.subrange_type <em>subrange type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>subrange type</em>'.
   * @see org.xtext.example.mydsl.pascal.subrange_type
   * @generated
   */
  EClass getsubrange_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.subrange_type#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see org.xtext.example.mydsl.pascal.subrange_type#getConstant()
   * @see #getsubrange_type()
   * @generated
   */
  EReference getsubrange_type_Constant();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.subrange_type#getConstant2 <em>Constant2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant2</em>'.
   * @see org.xtext.example.mydsl.pascal.subrange_type#getConstant2()
   * @see #getsubrange_type()
   * @generated
   */
  EReference getsubrange_type_Constant2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.structured_type <em>structured type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>structured type</em>'.
   * @see org.xtext.example.mydsl.pascal.structured_type
   * @generated
   */
  EClass getstructured_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.structured_type#getUnpackedStructuredType <em>Unpacked Structured Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unpacked Structured Type</em>'.
   * @see org.xtext.example.mydsl.pascal.structured_type#getUnpackedStructuredType()
   * @see #getstructured_type()
   * @generated
   */
  EReference getstructured_type_UnpackedStructuredType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type <em>unpacked structured type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unpacked structured type</em>'.
   * @see org.xtext.example.mydsl.pascal.unpacked_structured_type
   * @generated
   */
  EClass getunpacked_structured_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Type</em>'.
   * @see org.xtext.example.mydsl.pascal.unpacked_structured_type#getArrayType()
   * @see #getunpacked_structured_type()
   * @generated
   */
  EReference getunpacked_structured_type_ArrayType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getRecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Type</em>'.
   * @see org.xtext.example.mydsl.pascal.unpacked_structured_type#getRecordType()
   * @see #getunpacked_structured_type()
   * @generated
   */
  EReference getunpacked_structured_type_RecordType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getSetType <em>Set Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set Type</em>'.
   * @see org.xtext.example.mydsl.pascal.unpacked_structured_type#getSetType()
   * @see #getunpacked_structured_type()
   * @generated
   */
  EReference getunpacked_structured_type_SetType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getFileType <em>File Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File Type</em>'.
   * @see org.xtext.example.mydsl.pascal.unpacked_structured_type#getFileType()
   * @see #getunpacked_structured_type()
   * @generated
   */
  EReference getunpacked_structured_type_FileType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.array_type <em>array type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>array type</em>'.
   * @see org.xtext.example.mydsl.pascal.array_type
   * @generated
   */
  EClass getarray_type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.array_type#getSimpleTypes <em>Simple Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Simple Types</em>'.
   * @see org.xtext.example.mydsl.pascal.array_type#getSimpleTypes()
   * @see #getarray_type()
   * @generated
   */
  EReference getarray_type_SimpleTypes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.array_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.pascal.array_type#getType()
   * @see #getarray_type()
   * @generated
   */
  EReference getarray_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.record_type <em>record type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>record type</em>'.
   * @see org.xtext.example.mydsl.pascal.record_type
   * @generated
   */
  EClass getrecord_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.record_type#getFieldlist <em>Fieldlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fieldlist</em>'.
   * @see org.xtext.example.mydsl.pascal.record_type#getFieldlist()
   * @see #getrecord_type()
   * @generated
   */
  EReference getrecord_type_Fieldlist();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.set_type <em>set type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set type</em>'.
   * @see org.xtext.example.mydsl.pascal.set_type
   * @generated
   */
  EClass getset_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.set_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.pascal.set_type#getType()
   * @see #getset_type()
   * @generated
   */
  EReference getset_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.file_type <em>file type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>file type</em>'.
   * @see org.xtext.example.mydsl.pascal.file_type
   * @generated
   */
  EClass getfile_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.file_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.pascal.file_type#getType()
   * @see #getfile_type()
   * @generated
   */
  EReference getfile_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.pointer_type <em>pointer type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pointer type</em>'.
   * @see org.xtext.example.mydsl.pascal.pointer_type
   * @generated
   */
  EClass getpointer_type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.pointer_type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.pointer_type#getName()
   * @see #getpointer_type()
   * @generated
   */
  EAttribute getpointer_type_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.field_list <em>field list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field list</em>'.
   * @see org.xtext.example.mydsl.pascal.field_list
   * @generated
   */
  EClass getfield_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.field_list#getFixedPart <em>Fixed Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fixed Part</em>'.
   * @see org.xtext.example.mydsl.pascal.field_list#getFixedPart()
   * @see #getfield_list()
   * @generated
   */
  EReference getfield_list_FixedPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.field_list#getVariantPart <em>Variant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variant Part</em>'.
   * @see org.xtext.example.mydsl.pascal.field_list#getVariantPart()
   * @see #getfield_list()
   * @generated
   */
  EReference getfield_list_VariantPart();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.fixed_part <em>fixed part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fixed part</em>'.
   * @see org.xtext.example.mydsl.pascal.fixed_part
   * @generated
   */
  EClass getfixed_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.fixed_part#getRecordSections <em>Record Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record Sections</em>'.
   * @see org.xtext.example.mydsl.pascal.fixed_part#getRecordSections()
   * @see #getfixed_part()
   * @generated
   */
  EReference getfixed_part_RecordSections();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.record_section <em>record section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>record section</em>'.
   * @see org.xtext.example.mydsl.pascal.record_section
   * @generated
   */
  EClass getrecord_section();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.record_section#getIdentifierList <em>Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier List</em>'.
   * @see org.xtext.example.mydsl.pascal.record_section#getIdentifierList()
   * @see #getrecord_section()
   * @generated
   */
  EReference getrecord_section_IdentifierList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.record_section#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.pascal.record_section#getType()
   * @see #getrecord_section()
   * @generated
   */
  EReference getrecord_section_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.variant_part <em>variant part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variant part</em>'.
   * @see org.xtext.example.mydsl.pascal.variant_part
   * @generated
   */
  EClass getvariant_part();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.variant_part#getTagfield <em>Tagfield</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tagfield</em>'.
   * @see org.xtext.example.mydsl.pascal.variant_part#getTagfield()
   * @see #getvariant_part()
   * @generated
   */
  EReference getvariant_part_Tagfield();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.variant_part#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.pascal.variant_part#getId()
   * @see #getvariant_part()
   * @generated
   */
  EAttribute getvariant_part_Id();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.variant_part#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see org.xtext.example.mydsl.pascal.variant_part#getVariants()
   * @see #getvariant_part()
   * @generated
   */
  EReference getvariant_part_Variants();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.tag_field <em>tag field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tag field</em>'.
   * @see org.xtext.example.mydsl.pascal.tag_field
   * @generated
   */
  EClass gettag_field();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.tag_field#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.pascal.tag_field#getId()
   * @see #gettag_field()
   * @generated
   */
  EAttribute gettag_field_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.variant <em>variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variant</em>'.
   * @see org.xtext.example.mydsl.pascal.variant
   * @generated
   */
  EClass getvariant();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.variant#getCaseLabelList <em>Case Label List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Label List</em>'.
   * @see org.xtext.example.mydsl.pascal.variant#getCaseLabelList()
   * @see #getvariant()
   * @generated
   */
  EReference getvariant_CaseLabelList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.variant#getFieldList <em>Field List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field List</em>'.
   * @see org.xtext.example.mydsl.pascal.variant#getFieldList()
   * @see #getvariant()
   * @generated
   */
  EReference getvariant_FieldList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression List</em>'.
   * @see org.xtext.example.mydsl.pascal.ExpressionList
   * @generated
   */
  EClass getExpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.pascal.ExpressionList#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.xtext.example.mydsl.pascal.ExpressionList#getExpressions()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Expressions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.identifier_list <em>identifier list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>identifier list</em>'.
   * @see org.xtext.example.mydsl.pascal.identifier_list
   * @generated
   */
  EClass getidentifier_list();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.pascal.identifier_list#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ids</em>'.
   * @see org.xtext.example.mydsl.pascal.identifier_list#getIds()
   * @see #getidentifier_list()
   * @generated
   */
  EAttribute getidentifier_list_Ids();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.number <em>number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>number</em>'.
   * @see org.xtext.example.mydsl.pascal.number
   * @generated
   */
  EClass getnumber();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.number#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see org.xtext.example.mydsl.pascal.number#getInteger()
   * @see #getnumber()
   * @generated
   */
  EAttribute getnumber_Integer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.number#getReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real</em>'.
   * @see org.xtext.example.mydsl.pascal.number#getReal()
   * @see #getnumber()
   * @generated
   */
  EAttribute getnumber_Real();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.label <em>label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>label</em>'.
   * @see org.xtext.example.mydsl.pascal.label
   * @generated
   */
  EClass getlabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.label#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.example.mydsl.pascal.label#getInt()
   * @see #getlabel()
   * @generated
   */
  EAttribute getlabel_Int();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.pascal.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant</em>'.
   * @see org.xtext.example.mydsl.pascal.constant
   * @generated
   */
  EClass getconstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.pascal.constant#getName()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.pascal.constant#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see org.xtext.example.mydsl.pascal.constant#getNumber()
   * @see #getconstant()
   * @generated
   */
  EReference getconstant_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.pascal.constant#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.mydsl.pascal.constant#getString()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_String();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PascalFactory getPascalFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.ModelImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROGRAMS = eINSTANCE.getModel_Programs();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.programImpl <em>program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.programImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprogram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getprogram();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROGRAM = eINSTANCE.getprogram_Program();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__BLOCK = eINSTANCE.getprogram_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.program_headingImpl <em>program heading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.program_headingImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprogram_heading()
     * @generated
     */
    EClass PROGRAM_HEADING = eINSTANCE.getprogram_heading();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.blockImpl <em>block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.blockImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getblock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getblock();

    /**
     * The meta object literal for the '<em><b>Declaration Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__DECLARATION_PART = eINSTANCE.getblock_DeclarationPart();

    /**
     * The meta object literal for the '<em><b>Statement Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENT_PART = eINSTANCE.getblock_StatementPart();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl <em>Declaration Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getDeclarationPart()
     * @generated
     */
    EClass DECLARATION_PART = eINSTANCE.getDeclarationPart();

    /**
     * The meta object literal for the '<em><b>Label Declaration Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_PART__LABEL_DECLARATION_PART = eINSTANCE.getDeclarationPart_LabelDeclarationPart();

    /**
     * The meta object literal for the '<em><b>Constant Definition Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_PART__CONSTANT_DEFINITION_PART = eINSTANCE.getDeclarationPart_ConstantDefinitionPart();

    /**
     * The meta object literal for the '<em><b>Type Definition Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_PART__TYPE_DEFINITION_PART = eINSTANCE.getDeclarationPart_TypeDefinitionPart();

    /**
     * The meta object literal for the '<em><b>Variable Declaration Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_PART__VARIABLE_DECLARATION_PART = eINSTANCE.getDeclarationPart_VariableDeclarationPart();

    /**
     * The meta object literal for the '<em><b>Procedure And Function Declaration Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART = eINSTANCE.getDeclarationPart_ProcedureAndFunctionDeclarationPart();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.label_declaration_partImpl <em>label declaration part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.label_declaration_partImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getlabel_declaration_part()
     * @generated
     */
    EClass LABEL_DECLARATION_PART = eINSTANCE.getlabel_declaration_part();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_DECLARATION_PART__LABELS = eINSTANCE.getlabel_declaration_part_Labels();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.constant_definition_partImpl <em>constant definition part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.constant_definition_partImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconstant_definition_part()
     * @generated
     */
    EClass CONSTANT_DEFINITION_PART = eINSTANCE.getconstant_definition_part();

    /**
     * The meta object literal for the '<em><b>Constant Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION_PART__CONSTANT_DEFINITIONS = eINSTANCE.getconstant_definition_part_ConstantDefinitions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.constant_definitionImpl <em>constant definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.constant_definitionImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconstant_definition()
     * @generated
     */
    EClass CONSTANT_DEFINITION = eINSTANCE.getconstant_definition();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.type_definition_partImpl <em>type definition part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.type_definition_partImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#gettype_definition_part()
     * @generated
     */
    EClass TYPE_DEFINITION_PART = eINSTANCE.gettype_definition_part();

    /**
     * The meta object literal for the '<em><b>Type Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION_PART__TYPE_DEFINITIONS = eINSTANCE.gettype_definition_part_TypeDefinitions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.type_definitionImpl <em>type definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.type_definitionImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#gettype_definition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.gettype_definition();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.variable_declaration_partImpl <em>variable declaration part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.variable_declaration_partImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariable_declaration_part()
     * @generated
     */
    EClass VARIABLE_DECLARATION_PART = eINSTANCE.getvariable_declaration_part();

    /**
     * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS = eINSTANCE.getvariable_declaration_part_VariableDeclarations();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.variable_declarationImpl <em>variable declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.variable_declarationImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariable_declaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getvariable_declaration();

    /**
     * The meta object literal for the '<em><b>Identifier List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__IDENTIFIER_LIST = eINSTANCE.getvariable_declaration_IdentifierList();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getvariable_declaration_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.procedure_and_function_declaration_partImpl <em>procedure and function declaration part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.procedure_and_function_declaration_partImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprocedure_and_function_declaration_part()
     * @generated
     */
    EClass PROCEDURE_AND_FUNCTION_DECLARATION_PART = eINSTANCE.getprocedure_and_function_declaration_part();

    /**
     * The meta object literal for the '<em><b>Procedure Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS = eINSTANCE.getprocedure_and_function_declaration_part_ProcedureDeclarations();

    /**
     * The meta object literal for the '<em><b>Function Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS = eINSTANCE.getprocedure_and_function_declaration_part_FunctionDeclarations();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.procedure_declarationImpl <em>procedure declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.procedure_declarationImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprocedure_declaration()
     * @generated
     */
    EClass PROCEDURE_DECLARATION = eINSTANCE.getprocedure_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_DECLARATION__NAME = eINSTANCE.getprocedure_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Formal Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECLARATION__FORMAL_PARAMETER_LIST = eINSTANCE.getprocedure_declaration_FormalParameterList();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECLARATION__BLOCK = eINSTANCE.getprocedure_declaration_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.function_declarationImpl <em>function declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.function_declarationImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfunction_declaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getfunction_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getfunction_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Formal Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST = eINSTANCE.getfunction_declaration_FormalParameterList();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__TYPE = eINSTANCE.getfunction_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__BLOCK = eINSTANCE.getfunction_declaration_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.statement_partImpl <em>statement part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.statement_partImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstatement_part()
     * @generated
     */
    EClass STATEMENT_PART = eINSTANCE.getstatement_part();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.procedure_headingImpl <em>procedure heading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.procedure_headingImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprocedure_heading()
     * @generated
     */
    EClass PROCEDURE_HEADING = eINSTANCE.getprocedure_heading();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_HEADING__NAME = eINSTANCE.getprocedure_heading_Name();

    /**
     * The meta object literal for the '<em><b>Formal Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_HEADING__FORMAL_PARAMETER_LIST = eINSTANCE.getprocedure_heading_FormalParameterList();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.function_headingImpl <em>function heading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.function_headingImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfunction_heading()
     * @generated
     */
    EClass FUNCTION_HEADING = eINSTANCE.getfunction_heading();

    /**
     * The meta object literal for the '<em><b>Id1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADING__ID1 = eINSTANCE.getfunction_heading_Id1();

    /**
     * The meta object literal for the '<em><b>Formal Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_HEADING__FORMAL_PARAMETER_LIST = eINSTANCE.getfunction_heading_FormalParameterList();

    /**
     * The meta object literal for the '<em><b>Id2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADING__ID2 = eINSTANCE.getfunction_heading_Id2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_listImpl <em>formal parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.formal_parameter_listImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getformal_parameter_list()
     * @generated
     */
    EClass FORMAL_PARAMETER_LIST = eINSTANCE.getformal_parameter_list();

    /**
     * The meta object literal for the '<em><b>Formal Parameter Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS = eINSTANCE.getformal_parameter_list_FormalParameterSections();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl <em>formal parameter section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getformal_parameter_section()
     * @generated
     */
    EClass FORMAL_PARAMETER_SECTION = eINSTANCE.getformal_parameter_section();

    /**
     * The meta object literal for the '<em><b>Value Parameter Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION = eINSTANCE.getformal_parameter_section_ValueParameterSection();

    /**
     * The meta object literal for the '<em><b>Variable Paramenter Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION = eINSTANCE.getformal_parameter_section_VariableParamenterSection();

    /**
     * The meta object literal for the '<em><b>Procedure Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING = eINSTANCE.getformal_parameter_section_ProcedureHeading();

    /**
     * The meta object literal for the '<em><b>Function Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER_SECTION__FUNCTION_HEADING = eINSTANCE.getformal_parameter_section_FunctionHeading();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.value_parameter_sectionImpl <em>value parameter section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.value_parameter_sectionImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvalue_parameter_section()
     * @generated
     */
    EClass VALUE_PARAMETER_SECTION = eINSTANCE.getvalue_parameter_section();

    /**
     * The meta object literal for the '<em><b>Identifier List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_PARAMETER_SECTION__IDENTIFIER_LIST = eINSTANCE.getvalue_parameter_section_IdentifierList();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_PARAMETER_SECTION__PARAMETER_TYPE = eINSTANCE.getvalue_parameter_section_ParameterType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.variable_parameter_sectionImpl <em>variable parameter section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.variable_parameter_sectionImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariable_parameter_section()
     * @generated
     */
    EClass VARIABLE_PARAMETER_SECTION = eINSTANCE.getvariable_parameter_section();

    /**
     * The meta object literal for the '<em><b>Identifier List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PARAMETER_SECTION__IDENTIFIER_LIST = eINSTANCE.getvariable_parameter_section_IdentifierList();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PARAMETER_SECTION__PARAMETER_TYPE = eINSTANCE.getvariable_parameter_section_ParameterType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.parameter_typeImpl <em>parameter type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.parameter_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getparameter_type()
     * @generated
     */
    EClass PARAMETER_TYPE = eINSTANCE.getparameter_type();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_TYPE__ID = eINSTANCE.getparameter_type_Id();

    /**
     * The meta object literal for the '<em><b>Conformant Array Schema</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA = eINSTANCE.getparameter_type_ConformantArraySchema();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.conformant_array_schemaImpl <em>conformant array schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.conformant_array_schemaImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconformant_array_schema()
     * @generated
     */
    EClass CONFORMANT_ARRAY_SCHEMA = eINSTANCE.getconformant_array_schema();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFORMANT_ARRAY_SCHEMA__ID = eINSTANCE.getconformant_array_schema_Id();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.packed_conformant_array_schemaImpl <em>packed conformant array schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.packed_conformant_array_schemaImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getpacked_conformant_array_schema()
     * @generated
     */
    EClass PACKED_CONFORMANT_ARRAY_SCHEMA = eINSTANCE.getpacked_conformant_array_schema();

    /**
     * The meta object literal for the '<em><b>Bound Specification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION = eINSTANCE.getpacked_conformant_array_schema_BoundSpecification();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.unpacked_conformant_array_SchemaImpl <em>unpacked conformant array Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.unpacked_conformant_array_SchemaImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getunpacked_conformant_array_Schema()
     * @generated
     */
    EClass UNPACKED_CONFORMANT_ARRAY_SCHEMA = eINSTANCE.getunpacked_conformant_array_Schema();

    /**
     * The meta object literal for the '<em><b>Bound Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS = eINSTANCE.getunpacked_conformant_array_Schema_BoundSpecifications();

    /**
     * The meta object literal for the '<em><b>Conformant Array Schema</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA = eINSTANCE.getunpacked_conformant_array_Schema_ConformantArraySchema();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.bound_specificationImpl <em>bound specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.bound_specificationImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getbound_specification()
     * @generated
     */
    EClass BOUND_SPECIFICATION = eINSTANCE.getbound_specification();

    /**
     * The meta object literal for the '<em><b>Id1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUND_SPECIFICATION__ID1 = eINSTANCE.getbound_specification_Id1();

    /**
     * The meta object literal for the '<em><b>Id2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUND_SPECIFICATION__ID2 = eINSTANCE.getbound_specification_Id2();

    /**
     * The meta object literal for the '<em><b>Id3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUND_SPECIFICATION__ID3 = eINSTANCE.getbound_specification_Id3();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.statement_sequenceImpl <em>statement sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.statement_sequenceImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstatement_sequence()
     * @generated
     */
    EClass STATEMENT_SEQUENCE = eINSTANCE.getstatement_sequence();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_SEQUENCE__STATEMENTS = eINSTANCE.getstatement_sequence_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STATEMENT = eINSTANCE.getstatement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.simple_statementImpl <em>simple statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.simple_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getsimple_statement()
     * @generated
     */
    EClass SIMPLE_STATEMENT = eINSTANCE.getsimple_statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.assignment_statementImpl <em>assignment statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.assignment_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getassignment_statement()
     * @generated
     */
    EClass ASSIGNMENT_STATEMENT = eINSTANCE.getassignment_statement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_STATEMENT__VARIABLE = eINSTANCE.getassignment_statement_Variable();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_STATEMENT__IDENTIFIER = eINSTANCE.getassignment_statement_Identifier();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__EXPRESSION = eINSTANCE.getassignment_statement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.procedure_statementImpl <em>procedure statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.procedure_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getprocedure_statement()
     * @generated
     */
    EClass PROCEDURE_STATEMENT = eINSTANCE.getprocedure_statement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_STATEMENT__NAME = eINSTANCE.getprocedure_statement_Name();

    /**
     * The meta object literal for the '<em><b>Actual Parameter List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_STATEMENT__ACTUAL_PARAMETER_LIST = eINSTANCE.getprocedure_statement_ActualParameterList();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.goto_statementImpl <em>goto statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.goto_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getgoto_statement()
     * @generated
     */
    EClass GOTO_STATEMENT = eINSTANCE.getgoto_statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.structured_statementImpl <em>structured statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.structured_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstructured_statement()
     * @generated
     */
    EClass STRUCTURED_STATEMENT = eINSTANCE.getstructured_statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.compound_statementImpl <em>compound statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.compound_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getcompound_statement()
     * @generated
     */
    EClass COMPOUND_STATEMENT = eINSTANCE.getcompound_statement();

    /**
     * The meta object literal for the '<em><b>Statement Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATEMENT__STATEMENT_SEQUENCE = eINSTANCE.getcompound_statement_StatementSequence();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.repetitive_statementImpl <em>repetitive statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.repetitive_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getrepetitive_statement()
     * @generated
     */
    EClass REPETITIVE_STATEMENT = eINSTANCE.getrepetitive_statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.while_statementImpl <em>while statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.while_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getwhile_statement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getwhile_statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__EXPRESSION = eINSTANCE.getwhile_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__STATEMENT = eINSTANCE.getwhile_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.repeat_statementImpl <em>repeat statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.repeat_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getrepeat_statement()
     * @generated
     */
    EClass REPEAT_STATEMENT = eINSTANCE.getrepeat_statement();

    /**
     * The meta object literal for the '<em><b>Statement Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STATEMENT__STATEMENT_SEQUENCE = eINSTANCE.getrepeat_statement_StatementSequence();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STATEMENT__EXPRESSION = eINSTANCE.getrepeat_statement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.for_statementImpl <em>for statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.for_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfor_statement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getfor_statement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_STATEMENT__NAME = eINSTANCE.getfor_statement_Name();

    /**
     * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSION1 = eINSTANCE.getfor_statement_Expression1();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSION2 = eINSTANCE.getfor_statement_Expression2();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__STATEMENT = eINSTANCE.getfor_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.conditional_statementImpl <em>conditional statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.conditional_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconditional_statement()
     * @generated
     */
    EClass CONDITIONAL_STATEMENT = eINSTANCE.getconditional_statement();

    /**
     * The meta object literal for the '<em><b>If Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_STATEMENT__IF_STATEMENT = eINSTANCE.getconditional_statement_IfStatement();

    /**
     * The meta object literal for the '<em><b>Case Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_STATEMENT__CASE_STATEMENT = eINSTANCE.getconditional_statement_CaseStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.if_statementImpl <em>if statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.if_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getif_statement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getif_statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getif_statement_Expression();

    /**
     * The meta object literal for the '<em><b>If Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__IF_STATEMENT = eINSTANCE.getif_statement_IfStatement();

    /**
     * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getif_statement_ElseStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.case_statementImpl <em>case statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.case_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getcase_statement()
     * @generated
     */
    EClass CASE_STATEMENT = eINSTANCE.getcase_statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT__EXPRESSION = eINSTANCE.getcase_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Case Limbs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT__CASE_LIMBS = eINSTANCE.getcase_statement_CaseLimbs();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.case_limbImpl <em>case limb</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.case_limbImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getcase_limb()
     * @generated
     */
    EClass CASE_LIMB = eINSTANCE.getcase_limb();

    /**
     * The meta object literal for the '<em><b>Case Label List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIMB__CASE_LABEL_LIST = eINSTANCE.getcase_limb_CaseLabelList();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIMB__STATEMENT = eINSTANCE.getcase_limb_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.case_label_listImpl <em>case label list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.case_label_listImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getcase_label_list()
     * @generated
     */
    EClass CASE_LABEL_LIST = eINSTANCE.getcase_label_list();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LABEL_LIST__CONSTANTS = eINSTANCE.getcase_label_list_Constants();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.with_statementImpl <em>with statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.with_statementImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getwith_statement()
     * @generated
     */
    EClass WITH_STATEMENT = eINSTANCE.getwith_statement();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_STATEMENT__VARIABLES = eINSTANCE.getwith_statement_Variables();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_STATEMENT__STATEMENT = eINSTANCE.getwith_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.expressionImpl <em>expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.expressionImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getexpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getexpression();

    /**
     * The meta object literal for the '<em><b>Simple Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__SIMPLE_EXPRESSIONS = eINSTANCE.getexpression_SimpleExpressions();

    /**
     * The meta object literal for the '<em><b>Relational operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__RELATIONAL_OPERATORS = eINSTANCE.getexpression_Relational_operators();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.simple_expressionImpl <em>simple expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.simple_expressionImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getsimple_expression()
     * @generated
     */
    EClass SIMPLE_EXPRESSION = eINSTANCE.getsimple_expression();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__TERMS = eINSTANCE.getsimple_expression_Terms();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.termImpl <em>term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.termImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getterm()
     * @generated
     */
    EClass TERM = eINSTANCE.getterm();

    /**
     * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__FACTORS = eINSTANCE.getterm_Factors();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.factorImpl <em>factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.factorImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getfactor();

    /**
     * The meta object literal for the '<em><b>Function Designator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__FUNCTION_DESIGNATOR = eINSTANCE.getfactor_FunctionDesignator();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__VARIABLE = eINSTANCE.getfactor_Variable();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__NUMBER = eINSTANCE.getfactor_Number();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__STRING = eINSTANCE.getfactor_String();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__SET = eINSTANCE.getfactor_Set();

    /**
     * The meta object literal for the '<em><b>Nil</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__NIL = eINSTANCE.getfactor_Nil();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__ID = eINSTANCE.getfactor_Id();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__EXPRESSION = eINSTANCE.getfactor_Expression();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__FACTOR = eINSTANCE.getfactor_Factor();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.variableImpl <em>variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.variableImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getvariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getvariable_Name();

    /**
     * The meta object literal for the '<em><b>Variable1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__VARIABLE1 = eINSTANCE.getvariable_Variable1();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.Variable1Impl <em>Variable1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.Variable1Impl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getVariable1()
     * @generated
     */
    EClass VARIABLE1 = eINSTANCE.getVariable1();

    /**
     * The meta object literal for the '<em><b>Expression List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE1__EXPRESSION_LIST = eINSTANCE.getVariable1_ExpressionList();

    /**
     * The meta object literal for the '<em><b>Variable1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE1__VARIABLE1 = eINSTANCE.getVariable1_Variable1();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE1__NAME = eINSTANCE.getVariable1_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.SetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.SetImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getSet()
     * @generated
     */
    EClass SET = eINSTANCE.getSet();

    /**
     * The meta object literal for the '<em><b>Element List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__ELEMENT_LIST = eINSTANCE.getSet_ElementList();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.ElementListImpl <em>Element List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.ElementListImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getElementList()
     * @generated
     */
    EClass ELEMENT_LIST = eINSTANCE.getElementList();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_LIST__EXPRESSIONS = eINSTANCE.getElementList_Expressions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.FunctionDesignatorImpl <em>Function Designator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.FunctionDesignatorImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getFunctionDesignator()
     * @generated
     */
    EClass FUNCTION_DESIGNATOR = eINSTANCE.getFunctionDesignator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DESIGNATOR__NAME = eINSTANCE.getFunctionDesignator_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.typeImpl <em>type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#gettype()
     * @generated
     */
    EClass TYPE = eINSTANCE.gettype();

    /**
     * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__SIMPLE_TYPE = eINSTANCE.gettype_SimpleType();

    /**
     * The meta object literal for the '<em><b>Structured Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__STRUCTURED_TYPE = eINSTANCE.gettype_StructuredType();

    /**
     * The meta object literal for the '<em><b>Pointer Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__POINTER_TYPE = eINSTANCE.gettype_PointerType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.gettype_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.simple_typeImpl <em>simple type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.simple_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getsimple_type()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getsimple_type();

    /**
     * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE__PRIMITIVE_TYPE = eINSTANCE.getsimple_type_PrimitiveType();

    /**
     * The meta object literal for the '<em><b>Subrange Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__SUBRANGE_TYPE = eINSTANCE.getsimple_type_SubrangeType();

    /**
     * The meta object literal for the '<em><b>Enumerated Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__ENUMERATED_TYPE = eINSTANCE.getsimple_type_EnumeratedType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.enumerated_typeImpl <em>enumerated type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.enumerated_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getenumerated_type()
     * @generated
     */
    EClass ENUMERATED_TYPE = eINSTANCE.getenumerated_type();

    /**
     * The meta object literal for the '<em><b>Identifier List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATED_TYPE__IDENTIFIER_LIST = eINSTANCE.getenumerated_type_IdentifierList();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.subrange_typeImpl <em>subrange type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.subrange_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getsubrange_type()
     * @generated
     */
    EClass SUBRANGE_TYPE = eINSTANCE.getsubrange_type();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE_TYPE__CONSTANT = eINSTANCE.getsubrange_type_Constant();

    /**
     * The meta object literal for the '<em><b>Constant2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE_TYPE__CONSTANT2 = eINSTANCE.getsubrange_type_Constant2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.structured_typeImpl <em>structured type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.structured_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getstructured_type()
     * @generated
     */
    EClass STRUCTURED_TYPE = eINSTANCE.getstructured_type();

    /**
     * The meta object literal for the '<em><b>Unpacked Structured Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE = eINSTANCE.getstructured_type_UnpackedStructuredType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.unpacked_structured_typeImpl <em>unpacked structured type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.unpacked_structured_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getunpacked_structured_type()
     * @generated
     */
    EClass UNPACKED_STRUCTURED_TYPE = eINSTANCE.getunpacked_structured_type();

    /**
     * The meta object literal for the '<em><b>Array Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE = eINSTANCE.getunpacked_structured_type_ArrayType();

    /**
     * The meta object literal for the '<em><b>Record Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPACKED_STRUCTURED_TYPE__RECORD_TYPE = eINSTANCE.getunpacked_structured_type_RecordType();

    /**
     * The meta object literal for the '<em><b>Set Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPACKED_STRUCTURED_TYPE__SET_TYPE = eINSTANCE.getunpacked_structured_type_SetType();

    /**
     * The meta object literal for the '<em><b>File Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPACKED_STRUCTURED_TYPE__FILE_TYPE = eINSTANCE.getunpacked_structured_type_FileType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.array_typeImpl <em>array type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.array_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getarray_type()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getarray_type();

    /**
     * The meta object literal for the '<em><b>Simple Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__SIMPLE_TYPES = eINSTANCE.getarray_type_SimpleTypes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__TYPE = eINSTANCE.getarray_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.record_typeImpl <em>record type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.record_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getrecord_type()
     * @generated
     */
    EClass RECORD_TYPE = eINSTANCE.getrecord_type();

    /**
     * The meta object literal for the '<em><b>Fieldlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__FIELDLIST = eINSTANCE.getrecord_type_Fieldlist();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.set_typeImpl <em>set type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.set_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getset_type()
     * @generated
     */
    EClass SET_TYPE = eINSTANCE.getset_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_TYPE__TYPE = eINSTANCE.getset_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.file_typeImpl <em>file type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.file_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfile_type()
     * @generated
     */
    EClass FILE_TYPE = eINSTANCE.getfile_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE_TYPE__TYPE = eINSTANCE.getfile_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.pointer_typeImpl <em>pointer type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.pointer_typeImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getpointer_type()
     * @generated
     */
    EClass POINTER_TYPE = eINSTANCE.getpointer_type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTER_TYPE__NAME = eINSTANCE.getpointer_type_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.field_listImpl <em>field list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.field_listImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfield_list()
     * @generated
     */
    EClass FIELD_LIST = eINSTANCE.getfield_list();

    /**
     * The meta object literal for the '<em><b>Fixed Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_LIST__FIXED_PART = eINSTANCE.getfield_list_FixedPart();

    /**
     * The meta object literal for the '<em><b>Variant Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_LIST__VARIANT_PART = eINSTANCE.getfield_list_VariantPart();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.fixed_partImpl <em>fixed part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.fixed_partImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getfixed_part()
     * @generated
     */
    EClass FIXED_PART = eINSTANCE.getfixed_part();

    /**
     * The meta object literal for the '<em><b>Record Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIXED_PART__RECORD_SECTIONS = eINSTANCE.getfixed_part_RecordSections();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.record_sectionImpl <em>record section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.record_sectionImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getrecord_section()
     * @generated
     */
    EClass RECORD_SECTION = eINSTANCE.getrecord_section();

    /**
     * The meta object literal for the '<em><b>Identifier List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_SECTION__IDENTIFIER_LIST = eINSTANCE.getrecord_section_IdentifierList();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_SECTION__TYPE = eINSTANCE.getrecord_section_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.variant_partImpl <em>variant part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.variant_partImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariant_part()
     * @generated
     */
    EClass VARIANT_PART = eINSTANCE.getvariant_part();

    /**
     * The meta object literal for the '<em><b>Tagfield</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT_PART__TAGFIELD = eINSTANCE.getvariant_part_Tagfield();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIANT_PART__ID = eINSTANCE.getvariant_part_Id();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT_PART__VARIANTS = eINSTANCE.getvariant_part_Variants();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.tag_fieldImpl <em>tag field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.tag_fieldImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#gettag_field()
     * @generated
     */
    EClass TAG_FIELD = eINSTANCE.gettag_field();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG_FIELD__ID = eINSTANCE.gettag_field_Id();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.variantImpl <em>variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.variantImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getvariant()
     * @generated
     */
    EClass VARIANT = eINSTANCE.getvariant();

    /**
     * The meta object literal for the '<em><b>Case Label List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT__CASE_LABEL_LIST = eINSTANCE.getvariant_CaseLabelList();

    /**
     * The meta object literal for the '<em><b>Field List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT__FIELD_LIST = eINSTANCE.getvariant_FieldList();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.ExpressionListImpl <em>Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.ExpressionListImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getExpressionList()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.identifier_listImpl <em>identifier list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.identifier_listImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getidentifier_list()
     * @generated
     */
    EClass IDENTIFIER_LIST = eINSTANCE.getidentifier_list();

    /**
     * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER_LIST__IDS = eINSTANCE.getidentifier_list_Ids();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.numberImpl <em>number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.numberImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getnumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getnumber();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__INTEGER = eINSTANCE.getnumber_Integer();

    /**
     * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__REAL = eINSTANCE.getnumber_Real();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.labelImpl <em>label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.labelImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getlabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getlabel();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__INT = eINSTANCE.getlabel_Int();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.pascal.impl.constantImpl <em>constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.pascal.impl.constantImpl
     * @see org.xtext.example.mydsl.pascal.impl.PascalPackageImpl#getconstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getconstant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getconstant_Name();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__NUMBER = eINSTANCE.getconstant_Number();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STRING = eINSTANCE.getconstant_String();

  }

} //PascalPackage
