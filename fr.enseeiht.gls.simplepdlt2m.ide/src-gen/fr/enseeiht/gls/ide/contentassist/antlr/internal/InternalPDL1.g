/*
 * generated by Xtext 2.17.1
 */
grammar InternalPDL1;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.enseeiht.gls.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.enseeiht.gls.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.enseeiht.gls.services.PDL1GrammarAccess;

}
@parser::members {
	private PDL1GrammarAccess grammarAccess;

	public void setGrammarAccess(PDL1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleProcess
entryRuleProcess
:
{ before(grammarAccess.getProcessRule()); }
	 ruleProcess
{ after(grammarAccess.getProcessRule()); } 
	 EOF 
;

// Rule Process
ruleProcess 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProcessAccess().getGroup()); }
		(rule__Process__Group__0)
		{ after(grammarAccess.getProcessAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProcessElement
entryRuleProcessElement
:
{ before(grammarAccess.getProcessElementRule()); }
	 ruleProcessElement
{ after(grammarAccess.getProcessElementRule()); } 
	 EOF 
;

// Rule ProcessElement
ruleProcessElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProcessElementAccess().getAlternatives()); }
		(rule__ProcessElement__Alternatives)
		{ after(grammarAccess.getProcessElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRessource
entryRuleRessource
:
{ before(grammarAccess.getRessourceRule()); }
	 ruleRessource
{ after(grammarAccess.getRessourceRule()); } 
	 EOF 
;

// Rule Ressource
ruleRessource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRessourceAccess().getGroup()); }
		(rule__Ressource__Group__0)
		{ after(grammarAccess.getRessourceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRessource_Usage
entryRuleRessource_Usage
:
{ before(grammarAccess.getRessource_UsageRule()); }
	 ruleRessource_Usage
{ after(grammarAccess.getRessource_UsageRule()); } 
	 EOF 
;

// Rule Ressource_Usage
ruleRessource_Usage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRessource_UsageAccess().getGroup()); }
		(rule__Ressource_Usage__Group__0)
		{ after(grammarAccess.getRessource_UsageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition
:
{ before(grammarAccess.getWorkDefinitionRule()); }
	 ruleWorkDefinition
{ after(grammarAccess.getWorkDefinitionRule()); } 
	 EOF 
;

// Rule WorkDefinition
ruleWorkDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getGroup()); }
		(rule__WorkDefinition__Group__0)
		{ after(grammarAccess.getWorkDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWorkSequence
entryRuleWorkSequence
:
{ before(grammarAccess.getWorkSequenceRule()); }
	 ruleWorkSequence
{ after(grammarAccess.getWorkSequenceRule()); } 
	 EOF 
;

// Rule WorkSequence
ruleWorkSequence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getGroup()); }
		(rule__WorkSequence__Group__0)
		{ after(grammarAccess.getWorkSequenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGuidance
entryRuleGuidance
:
{ before(grammarAccess.getGuidanceRule()); }
	 ruleGuidance
{ after(grammarAccess.getGuidanceRule()); } 
	 EOF 
;

// Rule Guidance
ruleGuidance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGuidanceAccess().getGroup()); }
		(rule__Guidance__Group__0)
		{ after(grammarAccess.getGuidanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule WorkSequenceType
ruleWorkSequenceType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); }
		(rule__WorkSequenceType__Alternatives)
		{ after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcessElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); }
		ruleWorkDefinition
		{ after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); }
		ruleWorkSequence
		{ after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); }
		ruleGuidance
		{ after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); }
		ruleRessource
		{ after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getProcessElementAccess().getRessource_UsageParserRuleCall_4()); }
		ruleRessource_Usage
		{ after(grammarAccess.getProcessElementAccess().getRessource_UsageParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); }
		('s2s')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); }
		('f2s')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); }
		('s2f')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); }
		('f2f')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__0__Impl
	rule__Process__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessKeyword_0()); }
	'process'
	{ after(grammarAccess.getProcessAccess().getProcessKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__1__Impl
	rule__Process__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getNameAssignment_1()); }
	(rule__Process__NameAssignment_1)
	{ after(grammarAccess.getProcessAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__2__Impl
	rule__Process__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__3__Impl
	rule__Process__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); }
	(rule__Process__ProcessElementsAssignment_3)*
	{ after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ressource__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__0__Impl
	rule__Ressource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getRsKeyword_0()); }
	'rs'
	{ after(grammarAccess.getRessourceAccess().getRsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__1__Impl
	rule__Ressource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getNameAssignment_1()); }
	(rule__Ressource__NameAssignment_1)
	{ after(grammarAccess.getRessourceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__2__Impl
	rule__Ressource__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getQtKeyword_2()); }
	'qt'
	{ after(grammarAccess.getRessourceAccess().getQtKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getQuantiteAssignment_3()); }
	(rule__Ressource__QuantiteAssignment_3)
	{ after(grammarAccess.getRessourceAccess().getQuantiteAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ressource_Usage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource_Usage__Group__0__Impl
	rule__Ressource_Usage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessource_UsageAccess().getGetKeyword_0()); }
	'get'
	{ after(grammarAccess.getRessource_UsageAccess().getGetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource_Usage__Group__1__Impl
	rule__Ressource_Usage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessource_UsageAccess().getQuantiteAssignment_1()); }
	(rule__Ressource_Usage__QuantiteAssignment_1)
	{ after(grammarAccess.getRessource_UsageAccess().getQuantiteAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource_Usage__Group__2__Impl
	rule__Ressource_Usage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessource_UsageAccess().getOfKeyword_2()); }
	'of'
	{ after(grammarAccess.getRessource_UsageAccess().getOfKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource_Usage__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessource_UsageAccess().getRessourceAssignment_3()); }
	(rule__Ressource_Usage__RessourceAssignment_3)
	{ after(grammarAccess.getRessource_UsageAccess().getRessourceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group__0__Impl
	rule__WorkDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); }
	'wd'
	{ after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group__1__Impl
	rule__WorkDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); }
	(rule__WorkDefinition__NameAssignment_1)
	{ after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group__2__Impl
	rule__WorkDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getNeedsKeyword_2()); }
	'needs'
	{ after(grammarAccess.getWorkDefinitionAccess().getNeedsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group__3__Impl
	rule__WorkDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getToKeyword_3()); }
	'to'
	{ after(grammarAccess.getWorkDefinitionAccess().getToKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getRessource_UsageAssignment_4()); }
	(rule__WorkDefinition__Ressource_UsageAssignment_4)*
	{ after(grammarAccess.getWorkDefinitionAccess().getRessource_UsageAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WorkSequence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__0__Impl
	rule__WorkSequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); }
	'ws'
	{ after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__1__Impl
	rule__WorkSequence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); }
	(rule__WorkSequence__LinkTypeAssignment_1)
	{ after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__2__Impl
	rule__WorkSequence__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); }
	'from'
	{ after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__3__Impl
	rule__WorkSequence__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); }
	(rule__WorkSequence__PredecessorAssignment_3)
	{ after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__4__Impl
	rule__WorkSequence__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); }
	'to'
	{ after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); }
	(rule__WorkSequence__SuccessorAssignment_5)
	{ after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Guidance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group__0__Impl
	rule__Guidance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); }
	'note'
	{ after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); }
	(rule__Guidance__TexteAssignment_1)
	{ after(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Process__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__ProcessElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); }
		ruleProcessElement
		{ after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__QuantiteAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRessourceAccess().getQuantiteINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getRessourceAccess().getQuantiteINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__QuantiteAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRessource_UsageAccess().getQuantiteINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getRessource_UsageAccess().getQuantiteINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource_Usage__RessourceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRessource_UsageAccess().getRessourceRessourceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getRessource_UsageAccess().getRessourceRessourceIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRessource_UsageAccess().getRessourceRessourceIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getRessource_UsageAccess().getRessourceRessourceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Ressource_UsageAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getRessource_UsageRessource_UsageParserRuleCall_4_0()); }
		ruleRessource_Usage
		{ after(grammarAccess.getWorkDefinitionAccess().getRessource_UsageRessource_UsageParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__LinkTypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); }
		ruleWorkSequenceType
		{ after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__PredecessorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__SuccessorAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); }
		(
			{ before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__TexteAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
