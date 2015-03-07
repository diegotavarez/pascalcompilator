/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.pascal.DeclarationPart
import org.xtext.example.mydsl.pascal.block
import org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part
import org.xtext.example.mydsl.pascal.procedure_statement
import org.xtext.example.mydsl.pascal.type
import org.xtext.example.mydsl.pascal.type_identifier
import org.xtext.example.mydsl.pascal.variable
import org.xtext.example.mydsl.pascal.variable_declaration_part

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class PascalValidator extends AbstractPascalValidator {
	public static val String[] AVAILABLE_TYPES = #["integer", "char", "string", "real", "boolean"];
	
	@Check
	def checkvariable_unique_declaration(variable_declaration_part declarations) {
		val String[] variable_ids = newArrayOfSize(200)
		var variableDeclarations = declarations.variableDeclarations
		var id = 0

		for (var i = 0; i < variableDeclarations.size; i++) {
			var declaracao_atual = variableDeclarations.get(i);
			var declaracao_atual_ids = declaracao_atual.identifierList.ids;

			for (var id_i = 0; id_i < declaracao_atual_ids.size; id_i++) {
				if (!variable_ids.contains(declaracao_atual_ids.get(id_i))) {
					variable_ids.set(id, declaracao_atual_ids.get(id_i))
					id = id + 1

				} else {
					error("A variável " + declaracao_atual_ids.get(id_i) + " já foi declarada.", null)
				}
			}
		}
	}

	@Check
	def check_unique_procedure_declaration(procedure_and_function_declaration_part declarations) {
		val String[] procedure_ids = newArrayOfSize(200)
		var procedureDeclarations = declarations.procedureDeclarations
		var id = 0

		for (var i = 0; i < procedureDeclarations.size; i++) {
			var declaracao_atual = procedureDeclarations.get(i);
			var cabecalho_atual = declaracao_atual.heading
			var nome_atual = cabecalho_atual.procedureName

			if (!procedure_ids.contains(nome_atual)) {
				procedure_ids.set(id, nome_atual)
				id = id + 1

			} else {
				error("O procedure " + nome_atual + " já foi declarado.", null)
			}
		}
	}
	
	@Check
	def check_unique_constant_definition(DeclarationPart DeclarationPart) {
		val declarations = DeclarationPart.constantDefinitionPart
		val String[] constant_ids = newArrayOfSize(200)
		var constantDefinitions = declarations.constantDefinitions
		var id = 0

		for (var i = 0; i < constantDefinitions.size; i++) {
			var declaracao_atual = constantDefinitions.get(i);
			var nome_atual = declaracao_atual.constantName

			if (!constant_ids.contains(nome_atual)) {
				constant_ids.set(id, nome_atual)
				id = id + 1

			} else {
				error("A constante " + nome_atual + " já foi definida.", null)
			}
		}
	}

	def searchVariableDeclaration(variable variable, EObject parent) {
		val name = variable.name
		if (parent == null) {
			return null
		} else if (!(parent instanceof block)) {
			searchVariableDeclaration(variable, parent.eContainer)
		} else {
			val block = parent as block
			val block_declaration_part = block.declarationPart
			val declarations = block_declaration_part.variableDeclarationPart

			val String[] variable_ids = newArrayOfSize(200)
			var variableDeclarations = declarations.variableDeclarations
			var id = 0

			for (var i = 0; i < variableDeclarations.size; i++) {
				var declaracao_atual = variableDeclarations.get(i);
				var declaracao_atual_ids = declaracao_atual.identifierList.ids;

				for (var id_i = 0; id_i < declaracao_atual_ids.size; id_i++) {
					if (!variable_ids.contains(declaracao_atual_ids.get(id_i))) {
						variable_ids.set(id, declaracao_atual_ids.get(id_i))
						id = id + 1

					}
				}
			}

			if (!variable_ids.contains(name) || variableDeclarations.size == 0) {
				error("A variável " + name + " não foi declarada.", null)
			}
		}
	}

	@Check
	def checkVariableDeclaration(variable variable) {
		searchVariableDeclaration(variable, variable.eContainer)
	}

	def searchProcedureDeclaration(procedure_statement procedure_statement, EObject parent) {
		val procedureIdentifier = procedure_statement.procedureIdentifier
		val name = procedureIdentifier.procedure_name

		if (parent == null) {
			return null
		} else if (!(parent instanceof block)) {
			searchProcedureDeclaration(procedure_statement, parent.eContainer)
		} else {
			val block = parent as block
			val block_declaration_part = block.declarationPart
			val declarations = block_declaration_part.procedureAndFunctionDeclarationPart

			val String[] procedure_ids = newArrayOfSize(200)
			var procedureDeclarations = declarations.procedureDeclarations
			var id = 0

			for (var i = 0; i < procedureDeclarations.size; i++) {
				var declaracao_atual = procedureDeclarations.get(i);
				var cabecalho_atual = declaracao_atual.heading
				var nome_atual = cabecalho_atual.procedureName

				if (!procedure_ids.contains(nome_atual)) {
					procedure_ids.set(id, nome_atual)
					id = id + 1
				}
			}

			if (!procedure_ids.contains(name) || procedureDeclarations.size == 0) {
				error("O procedure " + name + " não foi declarado ou não possui esta assinatura.", null)
			}
		}
	}

	@Check
	def checkProcedureDeclaration(procedure_statement procedure_statement) {
		searchProcedureDeclaration(procedure_statement, procedure_statement.eContainer)
	}
	
	
	@Check
	def checkType(type type) {
		if (type instanceof type_identifier) {
			val t = type as type_identifier
			if (!AVAILABLE_TYPES.contains(t.typeIdentifierName)) {
				error("O tipo " + t.typeIdentifierName +  " não é suportado", null);
			}
		}
	}
	
}
