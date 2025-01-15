/*
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.mdd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.mdd.spellLang.ComplexSpell
import uk.ac.kcl.inf.mdd.spellLang.Model
import uk.ac.kcl.inf.mdd.spellLang.Move
import uk.ac.kcl.inf.mdd.spellLang.Say
import uk.ac.kcl.inf.mdd.spellLang.SimpleSpell
import uk.ac.kcl.inf.mdd.spellLang.SpellExpression
import uk.ac.kcl.inf.mdd.spellLang.SpellInvocation

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SpellLangGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('''«resource.className».java''',
			(resource.contents.head as Model).doGenerate(resource.className))
	}

	def String className(Resource resource) '''Spells«resource.URI.trimFileExtension.lastSegment.toFirstUpper»'''

	def doGenerate(Model spells, String className) {
		// TODO: Put your code here (and in additional methods as needed)...
	}
}
