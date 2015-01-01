package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_STRING", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_LETTER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure_declaration'", "'function_declaration'", "'TESTE'", "'E'", "'e'", "'+'", "'-'", "'.'", "'program'", "';'", "'('", "')'", "'label'", "','", "'const'", "'='", "'type'", "'var'", "':'", "'begin'", "'end'", "'statement'", "'..'", "'packed'", "'array'", "'[ '", "' ]'", "'of'", "'record'", "'set'", "'file'", "'^'", "'case'"
    };
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=9;
    public static final int RULE_DIGIT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LETTER=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g"; }


     
     	private PascalGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:69:1: ruleModel : ( ( rule__Model__ProgramsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:73:2: ( ( ( rule__Model__ProgramsAssignment )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:74:1: ( ( rule__Model__ProgramsAssignment )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:74:1: ( ( rule__Model__ProgramsAssignment )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:75:1: ( rule__Model__ProgramsAssignment )*
            {
             before(grammarAccess.getModelAccess().getProgramsAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:76:1: ( rule__Model__ProgramsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:76:2: rule__Model__ProgramsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ProgramsAssignment_in_ruleModel94);
            	    rule__Model__ProgramsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getProgramsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleprogram"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:88:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:89:1: ( ruleprogram EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:90:1: ruleprogram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram122);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:97:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:101:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:102:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:102:1: ( ( rule__Program__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:103:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:104:1: ( rule__Program__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:104:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleprogram155);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:116:1: entryRuleprogram_heading : ruleprogram_heading EOF ;
    public final void entryRuleprogram_heading() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:117:1: ( ruleprogram_heading EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:118:1: ruleprogram_heading EOF
            {
             before(grammarAccess.getProgram_headingRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading182);
            ruleprogram_heading();

            state._fsp--;

             after(grammarAccess.getProgram_headingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogram_heading"


    // $ANTLR start "ruleprogram_heading"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:125:1: ruleprogram_heading : ( ( rule__Program_heading__Group__0 ) ) ;
    public final void ruleprogram_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:129:2: ( ( ( rule__Program_heading__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:130:1: ( ( rule__Program_heading__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:130:1: ( ( rule__Program_heading__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:131:1: ( rule__Program_heading__Group__0 )
            {
             before(grammarAccess.getProgram_headingAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:132:1: ( rule__Program_heading__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:132:2: rule__Program_heading__Group__0
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__0_in_ruleprogram_heading215);
            rule__Program_heading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgram_headingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogram_heading"


    // $ANTLR start "entryRuleblock"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:144:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:145:1: ( ruleblock EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:146:1: ruleblock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock242);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:153:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:157:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:158:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:158:1: ( ( rule__Block__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:159:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:160:1: ( rule__Block__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:160:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleblock275);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRuledeclaration_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:172:1: entryRuledeclaration_part : ruledeclaration_part EOF ;
    public final void entryRuledeclaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:173:1: ( ruledeclaration_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:174:1: ruledeclaration_part EOF
            {
             before(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part302);
            ruledeclaration_part();

            state._fsp--;

             after(grammarAccess.getDeclaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledeclaration_part"


    // $ANTLR start "ruledeclaration_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:181:1: ruledeclaration_part : ( ( rule__Declaration_part__Group__0 ) ) ;
    public final void ruledeclaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:185:2: ( ( ( rule__Declaration_part__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:186:1: ( ( rule__Declaration_part__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:186:1: ( ( rule__Declaration_part__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:187:1: ( rule__Declaration_part__Group__0 )
            {
             before(grammarAccess.getDeclaration_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:188:1: ( rule__Declaration_part__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:188:2: rule__Declaration_part__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration_part__Group__0_in_ruledeclaration_part335);
            rule__Declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaration_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:200:1: entryRulelabel_declaration_part : rulelabel_declaration_part EOF ;
    public final void entryRulelabel_declaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:201:1: ( rulelabel_declaration_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:202:1: rulelabel_declaration_part EOF
            {
             before(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part362);
            rulelabel_declaration_part();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:209:1: rulelabel_declaration_part : ( ( rule__Label_declaration_part__Group__0 ) ) ;
    public final void rulelabel_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:213:2: ( ( ( rule__Label_declaration_part__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:214:1: ( ( rule__Label_declaration_part__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:214:1: ( ( rule__Label_declaration_part__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:215:1: ( rule__Label_declaration_part__Group__0 )
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:216:1: ( rule__Label_declaration_part__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:216:2: rule__Label_declaration_part__Group__0
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part395);
            rule__Label_declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabel_declaration_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:228:1: entryRuleconstant_definition_part : ruleconstant_definition_part EOF ;
    public final void entryRuleconstant_definition_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:229:1: ( ruleconstant_definition_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:230:1: ruleconstant_definition_part EOF
            {
             before(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part422);
            ruleconstant_definition_part();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:237:1: ruleconstant_definition_part : ( ( rule__Constant_definition_part__Group__0 ) ) ;
    public final void ruleconstant_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:241:2: ( ( ( rule__Constant_definition_part__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:242:1: ( ( rule__Constant_definition_part__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:242:1: ( ( rule__Constant_definition_part__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:243:1: ( rule__Constant_definition_part__Group__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:244:1: ( rule__Constant_definition_part__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:244:2: rule__Constant_definition_part__Group__0
            {
            pushFollow(FOLLOW_rule__Constant_definition_part__Group__0_in_ruleconstant_definition_part455);
            rule__Constant_definition_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:256:1: entryRuleconstant_definition : ruleconstant_definition EOF ;
    public final void entryRuleconstant_definition() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:257:1: ( ruleconstant_definition EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:258:1: ruleconstant_definition EOF
            {
             before(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition482);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:265:1: ruleconstant_definition : ( ( rule__Constant_definition__Group__0 ) ) ;
    public final void ruleconstant_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:269:2: ( ( ( rule__Constant_definition__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:270:1: ( ( rule__Constant_definition__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:270:1: ( ( rule__Constant_definition__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:271:1: ( rule__Constant_definition__Group__0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:272:1: ( rule__Constant_definition__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:272:2: rule__Constant_definition__Group__0
            {
            pushFollow(FOLLOW_rule__Constant_definition__Group__0_in_ruleconstant_definition515);
            rule__Constant_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:284:1: entryRuletype_definition_part : ruletype_definition_part EOF ;
    public final void entryRuletype_definition_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:285:1: ( ruletype_definition_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:286:1: ruletype_definition_part EOF
            {
             before(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part542);
            ruletype_definition_part();

            state._fsp--;

             after(grammarAccess.getType_definition_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:293:1: ruletype_definition_part : ( ( rule__Type_definition_part__Group__0 ) ) ;
    public final void ruletype_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:297:2: ( ( ( rule__Type_definition_part__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:298:1: ( ( rule__Type_definition_part__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:298:1: ( ( rule__Type_definition_part__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:299:1: ( rule__Type_definition_part__Group__0 )
            {
             before(grammarAccess.getType_definition_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:300:1: ( rule__Type_definition_part__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:300:2: rule__Type_definition_part__Group__0
            {
            pushFollow(FOLLOW_rule__Type_definition_part__Group__0_in_ruletype_definition_part575);
            rule__Type_definition_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:312:1: entryRuletype_definition : ruletype_definition EOF ;
    public final void entryRuletype_definition() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:313:1: ( ruletype_definition EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:314:1: ruletype_definition EOF
            {
             before(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition602);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:321:1: ruletype_definition : ( ( rule__Type_definition__Group__0 ) ) ;
    public final void ruletype_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:325:2: ( ( ( rule__Type_definition__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:326:1: ( ( rule__Type_definition__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:326:1: ( ( rule__Type_definition__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:327:1: ( rule__Type_definition__Group__0 )
            {
             before(grammarAccess.getType_definitionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:328:1: ( rule__Type_definition__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:328:2: rule__Type_definition__Group__0
            {
            pushFollow(FOLLOW_rule__Type_definition__Group__0_in_ruletype_definition635);
            rule__Type_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRulevariable_declaration_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:340:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:341:1: ( rulevariable_declaration_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:342:1: rulevariable_declaration_part EOF
            {
             before(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part662);
            rulevariable_declaration_part();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:349:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:353:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:354:1: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:354:1: ( ( rule__Variable_declaration_part__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:355:1: ( rule__Variable_declaration_part__Group__0 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:356:1: ( rule__Variable_declaration_part__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:356:2: rule__Variable_declaration_part__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declaration_part__Group__0_in_rulevariable_declaration_part695);
            rule__Variable_declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_declaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:368:1: entryRulevariable_declaration : rulevariable_declaration EOF ;
    public final void entryRulevariable_declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:369:1: ( rulevariable_declaration EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:370:1: rulevariable_declaration EOF
            {
             before(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration722);
            rulevariable_declaration();

            state._fsp--;

             after(grammarAccess.getVariable_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_declaration"


    // $ANTLR start "rulevariable_declaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:377:1: rulevariable_declaration : ( ( rule__Variable_declaration__Group__0 ) ) ;
    public final void rulevariable_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:381:2: ( ( ( rule__Variable_declaration__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:382:1: ( ( rule__Variable_declaration__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:382:1: ( ( rule__Variable_declaration__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:383:1: ( rule__Variable_declaration__Group__0 )
            {
             before(grammarAccess.getVariable_declarationAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:384:1: ( rule__Variable_declaration__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:384:2: rule__Variable_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0_in_rulevariable_declaration755);
            rule__Variable_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_declaration"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:396:1: entryRuleprocedure_and_function_declaration_part : ruleprocedure_and_function_declaration_part EOF ;
    public final void entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:397:1: ( ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:398:1: ruleprocedure_and_function_declaration_part EOF
            {
             before(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part782);
            ruleprocedure_and_function_declaration_part();

            state._fsp--;

             after(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:405:1: ruleprocedure_and_function_declaration_part : ( ( rule__Procedure_and_function_declaration_part__Group__0 )* ) ;
    public final void ruleprocedure_and_function_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:409:2: ( ( ( rule__Procedure_and_function_declaration_part__Group__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:410:1: ( ( rule__Procedure_and_function_declaration_part__Group__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:410:1: ( ( rule__Procedure_and_function_declaration_part__Group__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:411:1: ( rule__Procedure_and_function_declaration_part__Group__0 )*
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:412:1: ( rule__Procedure_and_function_declaration_part__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:412:2: rule__Procedure_and_function_declaration_part__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Procedure_and_function_declaration_part__Group__0_in_ruleprocedure_and_function_declaration_part815);
            	    rule__Procedure_and_function_declaration_part__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:424:1: entryRulestatement_part : rulestatement_part EOF ;
    public final void entryRulestatement_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:425:1: ( rulestatement_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:426:1: rulestatement_part EOF
            {
             before(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part843);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getStatement_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:433:1: rulestatement_part : ( ( rule__Statement_part__Group__0 ) ) ;
    public final void rulestatement_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:437:2: ( ( ( rule__Statement_part__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:438:1: ( ( rule__Statement_part__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:438:1: ( ( rule__Statement_part__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:439:1: ( rule__Statement_part__Group__0 )
            {
             before(grammarAccess.getStatement_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:440:1: ( rule__Statement_part__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:440:2: rule__Statement_part__Group__0
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__0_in_rulestatement_part876);
            rule__Statement_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:452:1: entryRulestatement_sequence : rulestatement_sequence EOF ;
    public final void entryRulestatement_sequence() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:453:1: ( rulestatement_sequence EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:454:1: rulestatement_sequence EOF
            {
             before(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence903);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:461:1: rulestatement_sequence : ( ( rule__Statement_sequence__Group__0 ) ) ;
    public final void rulestatement_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:465:2: ( ( ( rule__Statement_sequence__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:466:1: ( ( rule__Statement_sequence__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:466:1: ( ( rule__Statement_sequence__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:467:1: ( rule__Statement_sequence__Group__0 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:468:1: ( rule__Statement_sequence__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:468:2: rule__Statement_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__0_in_rulestatement_sequence936);
            rule__Statement_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_sequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:480:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:481:1: ( rulestatement EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:482:1: rulestatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement963);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:489:1: rulestatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:493:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:494:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:494:1: ( ( rule__Statement__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:495:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:496:1: ( rule__Statement__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:496:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_rulestatement996);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulecase_label_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:508:1: entryRulecase_label_list : rulecase_label_list EOF ;
    public final void entryRulecase_label_list() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:509:1: ( rulecase_label_list EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:510:1: rulecase_label_list EOF
            {
             before(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list1023);
            rulecase_label_list();

            state._fsp--;

             after(grammarAccess.getCase_label_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:517:1: rulecase_label_list : ( ( rule__Case_label_list__Group__0 ) ) ;
    public final void rulecase_label_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:521:2: ( ( ( rule__Case_label_list__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:522:1: ( ( rule__Case_label_list__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:522:1: ( ( rule__Case_label_list__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:523:1: ( rule__Case_label_list__Group__0 )
            {
             before(grammarAccess.getCase_label_listAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:524:1: ( rule__Case_label_list__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:524:2: rule__Case_label_list__Group__0
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group__0_in_rulecase_label_list1056);
            rule__Case_label_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCase_label_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:544:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:545:1: ( ruletype EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:546:1: ruletype EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype1091);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype1098); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:553:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:557:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:558:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:558:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:559:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:560:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:560:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruletype1124);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:572:1: entryRulesimple_type : rulesimple_type EOF ;
    public final void entryRulesimple_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:573:1: ( rulesimple_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:574:1: rulesimple_type EOF
            {
             before(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type1151);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type1158); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:581:1: rulesimple_type : ( ( rule__Simple_type__Alternatives ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:585:2: ( ( ( rule__Simple_type__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:586:1: ( ( rule__Simple_type__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:586:1: ( ( rule__Simple_type__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:587:1: ( rule__Simple_type__Alternatives )
            {
             before(grammarAccess.getSimple_typeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:588:1: ( rule__Simple_type__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:588:2: rule__Simple_type__Alternatives
            {
            pushFollow(FOLLOW_rule__Simple_type__Alternatives_in_rulesimple_type1184);
            rule__Simple_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRuleenumerated_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:600:1: entryRuleenumerated_type : ruleenumerated_type EOF ;
    public final void entryRuleenumerated_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:601:1: ( ruleenumerated_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:602:1: ruleenumerated_type EOF
            {
             before(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type1211);
            ruleenumerated_type();

            state._fsp--;

             after(grammarAccess.getEnumerated_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type1218); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:609:1: ruleenumerated_type : ( ( rule__Enumerated_type__Group__0 ) ) ;
    public final void ruleenumerated_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:613:2: ( ( ( rule__Enumerated_type__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:614:1: ( ( rule__Enumerated_type__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:614:1: ( ( rule__Enumerated_type__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:615:1: ( rule__Enumerated_type__Group__0 )
            {
             before(grammarAccess.getEnumerated_typeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:616:1: ( rule__Enumerated_type__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:616:2: rule__Enumerated_type__Group__0
            {
            pushFollow(FOLLOW_rule__Enumerated_type__Group__0_in_ruleenumerated_type1244);
            rule__Enumerated_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerated_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulesubrange_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:628:1: entryRulesubrange_type : rulesubrange_type EOF ;
    public final void entryRulesubrange_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:629:1: ( rulesubrange_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:630:1: rulesubrange_type EOF
            {
             before(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type1271);
            rulesubrange_type();

            state._fsp--;

             after(grammarAccess.getSubrange_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type1278); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:637:1: rulesubrange_type : ( ( rule__Subrange_type__Group__0 ) ) ;
    public final void rulesubrange_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:641:2: ( ( ( rule__Subrange_type__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:642:1: ( ( rule__Subrange_type__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:642:1: ( ( rule__Subrange_type__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:643:1: ( rule__Subrange_type__Group__0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:644:1: ( rule__Subrange_type__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:644:2: rule__Subrange_type__Group__0
            {
            pushFollow(FOLLOW_rule__Subrange_type__Group__0_in_rulesubrange_type1304);
            rule__Subrange_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRulelower_bound"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:656:1: entryRulelower_bound : rulelower_bound EOF ;
    public final void entryRulelower_bound() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:657:1: ( rulelower_bound EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:658:1: rulelower_bound EOF
            {
             before(grammarAccess.getLower_boundRule()); 
            pushFollow(FOLLOW_rulelower_bound_in_entryRulelower_bound1331);
            rulelower_bound();

            state._fsp--;

             after(grammarAccess.getLower_boundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelower_bound1338); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelower_bound"


    // $ANTLR start "rulelower_bound"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:665:1: rulelower_bound : ( ruleconstant ) ;
    public final void rulelower_bound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:669:2: ( ( ruleconstant ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:670:1: ( ruleconstant )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:670:1: ( ruleconstant )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:671:1: ruleconstant
            {
             before(grammarAccess.getLower_boundAccess().getConstantParserRuleCall()); 
            pushFollow(FOLLOW_ruleconstant_in_rulelower_bound1364);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getLower_boundAccess().getConstantParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelower_bound"


    // $ANTLR start "entryRuleupper_bound"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:684:1: entryRuleupper_bound : ruleupper_bound EOF ;
    public final void entryRuleupper_bound() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:685:1: ( ruleupper_bound EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:686:1: ruleupper_bound EOF
            {
             before(grammarAccess.getUpper_boundRule()); 
            pushFollow(FOLLOW_ruleupper_bound_in_entryRuleupper_bound1390);
            ruleupper_bound();

            state._fsp--;

             after(grammarAccess.getUpper_boundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleupper_bound1397); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleupper_bound"


    // $ANTLR start "ruleupper_bound"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:693:1: ruleupper_bound : ( ruleconstant ) ;
    public final void ruleupper_bound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:697:2: ( ( ruleconstant ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:698:1: ( ruleconstant )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:698:1: ( ruleconstant )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:699:1: ruleconstant
            {
             before(grammarAccess.getUpper_boundAccess().getConstantParserRuleCall()); 
            pushFollow(FOLLOW_ruleconstant_in_ruleupper_bound1423);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getUpper_boundAccess().getConstantParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleupper_bound"


    // $ANTLR start "entryRulestructured_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:712:1: entryRulestructured_type : rulestructured_type EOF ;
    public final void entryRulestructured_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:713:1: ( rulestructured_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:714:1: rulestructured_type EOF
            {
             before(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type1449);
            rulestructured_type();

            state._fsp--;

             after(grammarAccess.getStructured_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type1456); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:721:1: rulestructured_type : ( ( rule__Structured_type__Group__0 ) ) ;
    public final void rulestructured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:725:2: ( ( ( rule__Structured_type__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:726:1: ( ( rule__Structured_type__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:726:1: ( ( rule__Structured_type__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:727:1: ( rule__Structured_type__Group__0 )
            {
             before(grammarAccess.getStructured_typeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:728:1: ( rule__Structured_type__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:728:2: rule__Structured_type__Group__0
            {
            pushFollow(FOLLOW_rule__Structured_type__Group__0_in_rulestructured_type1482);
            rule__Structured_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructured_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:740:1: entryRuleunpacked_structured_type : ruleunpacked_structured_type EOF ;
    public final void entryRuleunpacked_structured_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:741:1: ( ruleunpacked_structured_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:742:1: ruleunpacked_structured_type EOF
            {
             before(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type1509);
            ruleunpacked_structured_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_structured_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type1516); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:749:1: ruleunpacked_structured_type : ( ( rule__Unpacked_structured_type__Alternatives ) ) ;
    public final void ruleunpacked_structured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:753:2: ( ( ( rule__Unpacked_structured_type__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:754:1: ( ( rule__Unpacked_structured_type__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:754:1: ( ( rule__Unpacked_structured_type__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:755:1: ( rule__Unpacked_structured_type__Alternatives )
            {
             before(grammarAccess.getUnpacked_structured_typeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:756:1: ( rule__Unpacked_structured_type__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:756:2: rule__Unpacked_structured_type__Alternatives
            {
            pushFollow(FOLLOW_rule__Unpacked_structured_type__Alternatives_in_ruleunpacked_structured_type1542);
            rule__Unpacked_structured_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnpacked_structured_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:768:1: entryRulearray_type : rulearray_type EOF ;
    public final void entryRulearray_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:769:1: ( rulearray_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:770:1: rulearray_type EOF
            {
             before(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type1569);
            rulearray_type();

            state._fsp--;

             after(grammarAccess.getArray_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type1576); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:777:1: rulearray_type : ( ( rule__Array_type__Group__0 ) ) ;
    public final void rulearray_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:781:2: ( ( ( rule__Array_type__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:782:1: ( ( rule__Array_type__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:782:1: ( ( rule__Array_type__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:783:1: ( rule__Array_type__Group__0 )
            {
             before(grammarAccess.getArray_typeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:784:1: ( rule__Array_type__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:784:2: rule__Array_type__Group__0
            {
            pushFollow(FOLLOW_rule__Array_type__Group__0_in_rulearray_type1602);
            rule__Array_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArray_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuleindex_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:796:1: entryRuleindex_type : ruleindex_type EOF ;
    public final void entryRuleindex_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:797:1: ( ruleindex_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:798:1: ruleindex_type EOF
            {
             before(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_ruleindex_type_in_entryRuleindex_type1629);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getIndex_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex_type1636); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:805:1: ruleindex_type : ( rulesimple_type ) ;
    public final void ruleindex_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:809:2: ( ( rulesimple_type ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:810:1: ( rulesimple_type )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:810:1: ( rulesimple_type )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:811:1: rulesimple_type
            {
             before(grammarAccess.getIndex_typeAccess().getSimple_typeParserRuleCall()); 
            pushFollow(FOLLOW_rulesimple_type_in_ruleindex_type1662);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getIndex_typeAccess().getSimple_typeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRuleelement_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:824:1: entryRuleelement_type : ruleelement_type EOF ;
    public final void entryRuleelement_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:825:1: ( ruleelement_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:826:1: ruleelement_type EOF
            {
             before(grammarAccess.getElement_typeRule()); 
            pushFollow(FOLLOW_ruleelement_type_in_entryRuleelement_type1688);
            ruleelement_type();

            state._fsp--;

             after(grammarAccess.getElement_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_type1695); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleelement_type"


    // $ANTLR start "ruleelement_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:833:1: ruleelement_type : ( ruletype ) ;
    public final void ruleelement_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:837:2: ( ( ruletype ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:838:1: ( ruletype )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:838:1: ( ruletype )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:839:1: ruletype
            {
             before(grammarAccess.getElement_typeAccess().getTypeParserRuleCall()); 
            pushFollow(FOLLOW_ruletype_in_ruleelement_type1721);
            ruletype();

            state._fsp--;

             after(grammarAccess.getElement_typeAccess().getTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelement_type"


    // $ANTLR start "entryRulerecord_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:852:1: entryRulerecord_type : rulerecord_type EOF ;
    public final void entryRulerecord_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:853:1: ( rulerecord_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:854:1: rulerecord_type EOF
            {
             before(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_rulerecord_type_in_entryRulerecord_type1747);
            rulerecord_type();

            state._fsp--;

             after(grammarAccess.getRecord_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_type1754); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:861:1: rulerecord_type : ( ( rule__Record_type__Group__0 ) ) ;
    public final void rulerecord_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:865:2: ( ( ( rule__Record_type__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:866:1: ( ( rule__Record_type__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:866:1: ( ( rule__Record_type__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:867:1: ( rule__Record_type__Group__0 )
            {
             before(grammarAccess.getRecord_typeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:868:1: ( rule__Record_type__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:868:2: rule__Record_type__Group__0
            {
            pushFollow(FOLLOW_rule__Record_type__Group__0_in_rulerecord_type1780);
            rule__Record_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecord_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRuleset_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:880:1: entryRuleset_type : ruleset_type EOF ;
    public final void entryRuleset_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:881:1: ( ruleset_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:882:1: ruleset_type EOF
            {
             before(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type1807);
            ruleset_type();

            state._fsp--;

             after(grammarAccess.getSet_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type1814); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:889:1: ruleset_type : ( ( rule__Set_type__Group__0 ) ) ;
    public final void ruleset_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:893:2: ( ( ( rule__Set_type__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:894:1: ( ( rule__Set_type__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:894:1: ( ( rule__Set_type__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:895:1: ( rule__Set_type__Group__0 )
            {
             before(grammarAccess.getSet_typeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:896:1: ( rule__Set_type__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:896:2: rule__Set_type__Group__0
            {
            pushFollow(FOLLOW_rule__Set_type__Group__0_in_ruleset_type1840);
            rule__Set_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSet_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulebase_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:908:1: entryRulebase_type : rulebase_type EOF ;
    public final void entryRulebase_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:909:1: ( rulebase_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:910:1: rulebase_type EOF
            {
             before(grammarAccess.getBase_typeRule()); 
            pushFollow(FOLLOW_rulebase_type_in_entryRulebase_type1867);
            rulebase_type();

            state._fsp--;

             after(grammarAccess.getBase_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebase_type1874); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebase_type"


    // $ANTLR start "rulebase_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:917:1: rulebase_type : ( ruletype ) ;
    public final void rulebase_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:921:2: ( ( ruletype ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:922:1: ( ruletype )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:922:1: ( ruletype )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:923:1: ruletype
            {
             before(grammarAccess.getBase_typeAccess().getTypeParserRuleCall()); 
            pushFollow(FOLLOW_ruletype_in_rulebase_type1900);
            ruletype();

            state._fsp--;

             after(grammarAccess.getBase_typeAccess().getTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebase_type"


    // $ANTLR start "entryRulefile_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:936:1: entryRulefile_type : rulefile_type EOF ;
    public final void entryRulefile_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:937:1: ( rulefile_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:938:1: rulefile_type EOF
            {
             before(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type1926);
            rulefile_type();

            state._fsp--;

             after(grammarAccess.getFile_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type1933); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefile_type"


    // $ANTLR start "rulefile_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:945:1: rulefile_type : ( ( rule__File_type__Group__0 ) ) ;
    public final void rulefile_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:949:2: ( ( ( rule__File_type__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:950:1: ( ( rule__File_type__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:950:1: ( ( rule__File_type__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:951:1: ( rule__File_type__Group__0 )
            {
             before(grammarAccess.getFile_typeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:952:1: ( rule__File_type__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:952:2: rule__File_type__Group__0
            {
            pushFollow(FOLLOW_rule__File_type__Group__0_in_rulefile_type1959);
            rule__File_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFile_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulefile_component_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:964:1: entryRulefile_component_type : rulefile_component_type EOF ;
    public final void entryRulefile_component_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:965:1: ( rulefile_component_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:966:1: rulefile_component_type EOF
            {
             before(grammarAccess.getFile_component_typeRule()); 
            pushFollow(FOLLOW_rulefile_component_type_in_entryRulefile_component_type1986);
            rulefile_component_type();

            state._fsp--;

             after(grammarAccess.getFile_component_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_component_type1993); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefile_component_type"


    // $ANTLR start "rulefile_component_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:973:1: rulefile_component_type : ( ruletype ) ;
    public final void rulefile_component_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:977:2: ( ( ruletype ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:978:1: ( ruletype )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:978:1: ( ruletype )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:979:1: ruletype
            {
             before(grammarAccess.getFile_component_typeAccess().getTypeParserRuleCall()); 
            pushFollow(FOLLOW_ruletype_in_rulefile_component_type2019);
            ruletype();

            state._fsp--;

             after(grammarAccess.getFile_component_typeAccess().getTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefile_component_type"


    // $ANTLR start "entryRulepointer_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:992:1: entryRulepointer_type : rulepointer_type EOF ;
    public final void entryRulepointer_type() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:993:1: ( rulepointer_type EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:994:1: rulepointer_type EOF
            {
             before(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_rulepointer_type_in_entryRulepointer_type2045);
            rulepointer_type();

            state._fsp--;

             after(grammarAccess.getPointer_typeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepointer_type2052); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1001:1: rulepointer_type : ( ( rule__Pointer_type__Group__0 ) ) ;
    public final void rulepointer_type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1005:2: ( ( ( rule__Pointer_type__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1006:1: ( ( rule__Pointer_type__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1006:1: ( ( rule__Pointer_type__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1007:1: ( rule__Pointer_type__Group__0 )
            {
             before(grammarAccess.getPointer_typeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1008:1: ( rule__Pointer_type__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1008:2: rule__Pointer_type__Group__0
            {
            pushFollow(FOLLOW_rule__Pointer_type__Group__0_in_rulepointer_type2078);
            rule__Pointer_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointer_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulefield_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1020:1: entryRulefield_list : rulefield_list EOF ;
    public final void entryRulefield_list() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1021:1: ( rulefield_list EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1022:1: rulefield_list EOF
            {
             before(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list2105);
            rulefield_list();

            state._fsp--;

             after(grammarAccess.getField_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list2112); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1029:1: rulefield_list : ( ( rule__Field_list__Group__0 )? ) ;
    public final void rulefield_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1033:2: ( ( ( rule__Field_list__Group__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1034:1: ( ( rule__Field_list__Group__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1034:1: ( ( rule__Field_list__Group__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1035:1: ( rule__Field_list__Group__0 )?
            {
             before(grammarAccess.getField_listAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1036:1: ( rule__Field_list__Group__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENTIFIER||LA3_0==47) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1036:2: rule__Field_list__Group__0
                    {
                    pushFollow(FOLLOW_rule__Field_list__Group__0_in_rulefield_list2138);
                    rule__Field_list__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getField_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1048:1: entryRulefixed_part : rulefixed_part EOF ;
    public final void entryRulefixed_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1049:1: ( rulefixed_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1050:1: rulefixed_part EOF
            {
             before(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part2166);
            rulefixed_part();

            state._fsp--;

             after(grammarAccess.getFixed_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part2173); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1057:1: rulefixed_part : ( ( rule__Fixed_part__Group__0 ) ) ;
    public final void rulefixed_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1061:2: ( ( ( rule__Fixed_part__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1062:1: ( ( rule__Fixed_part__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1062:1: ( ( rule__Fixed_part__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1063:1: ( rule__Fixed_part__Group__0 )
            {
             before(grammarAccess.getFixed_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1064:1: ( rule__Fixed_part__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1064:2: rule__Fixed_part__Group__0
            {
            pushFollow(FOLLOW_rule__Fixed_part__Group__0_in_rulefixed_part2199);
            rule__Fixed_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFixed_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulerecord_section"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1076:1: entryRulerecord_section : rulerecord_section EOF ;
    public final void entryRulerecord_section() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1077:1: ( rulerecord_section EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1078:1: rulerecord_section EOF
            {
             before(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section2226);
            rulerecord_section();

            state._fsp--;

             after(grammarAccess.getRecord_sectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section2233); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1085:1: rulerecord_section : ( ( rule__Record_section__Group__0 ) ) ;
    public final void rulerecord_section() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1089:2: ( ( ( rule__Record_section__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1090:1: ( ( rule__Record_section__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1090:1: ( ( rule__Record_section__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1091:1: ( rule__Record_section__Group__0 )
            {
             before(grammarAccess.getRecord_sectionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1092:1: ( rule__Record_section__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1092:2: rule__Record_section__Group__0
            {
            pushFollow(FOLLOW_rule__Record_section__Group__0_in_rulerecord_section2259);
            rule__Record_section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecord_sectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1104:1: entryRulevariant_part : rulevariant_part EOF ;
    public final void entryRulevariant_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1105:1: ( rulevariant_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1106:1: rulevariant_part EOF
            {
             before(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part2286);
            rulevariant_part();

            state._fsp--;

             after(grammarAccess.getVariant_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part2293); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1113:1: rulevariant_part : ( ( rule__Variant_part__Group__0 ) ) ;
    public final void rulevariant_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1117:2: ( ( ( rule__Variant_part__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1118:1: ( ( rule__Variant_part__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1118:1: ( ( rule__Variant_part__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1119:1: ( rule__Variant_part__Group__0 )
            {
             before(grammarAccess.getVariant_partAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1120:1: ( rule__Variant_part__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1120:2: rule__Variant_part__Group__0
            {
            pushFollow(FOLLOW_rule__Variant_part__Group__0_in_rulevariant_part2319);
            rule__Variant_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariant_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1132:1: entryRuletag_field : ruletag_field EOF ;
    public final void entryRuletag_field() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1133:1: ( ruletag_field EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1134:1: ruletag_field EOF
            {
             before(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field2346);
            ruletag_field();

            state._fsp--;

             after(grammarAccess.getTag_fieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field2353); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1141:1: ruletag_field : ( ( rule__Tag_field__Group__0 )? ) ;
    public final void ruletag_field() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1145:2: ( ( ( rule__Tag_field__Group__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1146:1: ( ( rule__Tag_field__Group__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1146:1: ( ( rule__Tag_field__Group__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1147:1: ( rule__Tag_field__Group__0 )?
            {
             before(grammarAccess.getTag_fieldAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1148:1: ( rule__Tag_field__Group__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_IDENTIFIER) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==33) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1148:2: rule__Tag_field__Group__0
                    {
                    pushFollow(FOLLOW_rule__Tag_field__Group__0_in_ruletag_field2379);
                    rule__Tag_field__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTag_fieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1160:1: entryRulevariant : rulevariant EOF ;
    public final void entryRulevariant() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1161:1: ( rulevariant EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1162:1: rulevariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant2407);
            rulevariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant2414); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1169:1: rulevariant : ( ( rule__Variant__Group__0 ) ) ;
    public final void rulevariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1173:2: ( ( ( rule__Variant__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1174:1: ( ( rule__Variant__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1174:1: ( ( rule__Variant__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1175:1: ( rule__Variant__Group__0 )
            {
             before(grammarAccess.getVariantAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1176:1: ( rule__Variant__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1176:2: rule__Variant__Group__0
            {
            pushFollow(FOLLOW_rule__Variant__Group__0_in_rulevariant2440);
            rule__Variant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRulefield_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1190:1: entryRulefield_identifier : rulefield_identifier EOF ;
    public final void entryRulefield_identifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1191:1: ( rulefield_identifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1192:1: rulefield_identifier EOF
            {
             before(grammarAccess.getField_identifierRule()); 
            pushFollow(FOLLOW_rulefield_identifier_in_entryRulefield_identifier2469);
            rulefield_identifier();

            state._fsp--;

             after(grammarAccess.getField_identifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_identifier2476); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefield_identifier"


    // $ANTLR start "rulefield_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1199:1: rulefield_identifier : ( RULE_IDENTIFIER ) ;
    public final void rulefield_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1203:2: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1204:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1204:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1205:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getField_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefield_identifier2502); 
             after(grammarAccess.getField_identifierAccess().getIDENTIFIERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefield_identifier"


    // $ANTLR start "entryRuleconstant_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1218:1: entryRuleconstant_identifier : ruleconstant_identifier EOF ;
    public final void entryRuleconstant_identifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1219:1: ( ruleconstant_identifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1220:1: ruleconstant_identifier EOF
            {
             before(grammarAccess.getConstant_identifierRule()); 
            pushFollow(FOLLOW_ruleconstant_identifier_in_entryRuleconstant_identifier2528);
            ruleconstant_identifier();

            state._fsp--;

             after(grammarAccess.getConstant_identifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_identifier2535); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant_identifier"


    // $ANTLR start "ruleconstant_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1227:1: ruleconstant_identifier : ( RULE_IDENTIFIER ) ;
    public final void ruleconstant_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1231:2: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1232:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1232:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1233:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getConstant_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant_identifier2561); 
             after(grammarAccess.getConstant_identifierAccess().getIDENTIFIERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_identifier"


    // $ANTLR start "entryRulevariable_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1246:1: entryRulevariable_identifier : rulevariable_identifier EOF ;
    public final void entryRulevariable_identifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1247:1: ( rulevariable_identifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1248:1: rulevariable_identifier EOF
            {
             before(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier2587);
            rulevariable_identifier();

            state._fsp--;

             after(grammarAccess.getVariable_identifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier2594); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_identifier"


    // $ANTLR start "rulevariable_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1255:1: rulevariable_identifier : ( RULE_IDENTIFIER ) ;
    public final void rulevariable_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1259:2: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1260:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1260:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1261:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getVariable_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier2620); 
             after(grammarAccess.getVariable_identifierAccess().getIDENTIFIERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_identifier"


    // $ANTLR start "entryRuletype_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1274:1: entryRuletype_identifier : ruletype_identifier EOF ;
    public final void entryRuletype_identifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1275:1: ( ruletype_identifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1276:1: ruletype_identifier EOF
            {
             before(grammarAccess.getType_identifierRule()); 
            pushFollow(FOLLOW_ruletype_identifier_in_entryRuletype_identifier2646);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getType_identifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_identifier2653); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_identifier"


    // $ANTLR start "ruletype_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1283:1: ruletype_identifier : ( RULE_IDENTIFIER ) ;
    public final void ruletype_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1287:2: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1288:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1288:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1289:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getType_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype_identifier2679); 
             after(grammarAccess.getType_identifierAccess().getIDENTIFIERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_identifier"


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1308:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1309:1: ( ruleidentifier_list EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1310:1: ruleidentifier_list EOF
            {
             before(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list2711);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getIdentifier_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list2718); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1317:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1321:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1322:1: ( ( rule__Identifier_list__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1322:1: ( ( rule__Identifier_list__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1323:1: ( rule__Identifier_list__Group__0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1324:1: ( rule__Identifier_list__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1324:2: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0_in_ruleidentifier_list2744);
            rule__Identifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1336:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1337:1: ( rulenumber EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1338:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber2771);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber2778); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1345:1: rulenumber : ( ( rule__Number__Alternatives ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1349:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1350:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1350:1: ( ( rule__Number__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1351:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1352:1: ( rule__Number__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1352:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_rulenumber2804);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleinteger_number"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1364:1: entryRuleinteger_number : ruleinteger_number EOF ;
    public final void entryRuleinteger_number() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1365:1: ( ruleinteger_number EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1366:1: ruleinteger_number EOF
            {
             before(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number2831);
            ruleinteger_number();

            state._fsp--;

             after(grammarAccess.getInteger_numberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number2838); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleinteger_number"


    // $ANTLR start "ruleinteger_number"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1373:1: ruleinteger_number : ( ruledigit_sequence ) ;
    public final void ruleinteger_number() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1377:2: ( ( ruledigit_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1378:1: ( ruledigit_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1378:1: ( ruledigit_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1379:1: ruledigit_sequence
            {
             before(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number2864);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleinteger_number"


    // $ANTLR start "entryRulereal_number"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1392:1: entryRulereal_number : rulereal_number EOF ;
    public final void entryRulereal_number() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1393:1: ( rulereal_number EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1394:1: rulereal_number EOF
            {
             before(grammarAccess.getReal_numberRule()); 
            pushFollow(FOLLOW_rulereal_number_in_entryRulereal_number2890);
            rulereal_number();

            state._fsp--;

             after(grammarAccess.getReal_numberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereal_number2897); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulereal_number"


    // $ANTLR start "rulereal_number"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1401:1: rulereal_number : ( ( rule__Real_number__Alternatives ) ) ;
    public final void rulereal_number() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1405:2: ( ( ( rule__Real_number__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1406:1: ( ( rule__Real_number__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1406:1: ( ( rule__Real_number__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1407:1: ( rule__Real_number__Alternatives )
            {
             before(grammarAccess.getReal_numberAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1408:1: ( rule__Real_number__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1408:2: rule__Real_number__Alternatives
            {
            pushFollow(FOLLOW_rule__Real_number__Alternatives_in_rulereal_number2923);
            rule__Real_number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReal_numberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulereal_number"


    // $ANTLR start "entryRulescale_factor"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1420:1: entryRulescale_factor : rulescale_factor EOF ;
    public final void entryRulescale_factor() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1421:1: ( rulescale_factor EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1422:1: rulescale_factor EOF
            {
             before(grammarAccess.getScale_factorRule()); 
            pushFollow(FOLLOW_rulescale_factor_in_entryRulescale_factor2950);
            rulescale_factor();

            state._fsp--;

             after(grammarAccess.getScale_factorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulescale_factor2957); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulescale_factor"


    // $ANTLR start "rulescale_factor"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1429:1: rulescale_factor : ( ( rule__Scale_factor__Group__0 ) ) ;
    public final void rulescale_factor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1433:2: ( ( ( rule__Scale_factor__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1434:1: ( ( rule__Scale_factor__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1434:1: ( ( rule__Scale_factor__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1435:1: ( rule__Scale_factor__Group__0 )
            {
             before(grammarAccess.getScale_factorAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1436:1: ( rule__Scale_factor__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1436:2: rule__Scale_factor__Group__0
            {
            pushFollow(FOLLOW_rule__Scale_factor__Group__0_in_rulescale_factor2983);
            rule__Scale_factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScale_factorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulescale_factor"


    // $ANTLR start "entryRuledigit_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1448:1: entryRuledigit_sequence : ruledigit_sequence EOF ;
    public final void entryRuledigit_sequence() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1449:1: ( ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1450:1: ruledigit_sequence EOF
            {
             before(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence3010);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getDigit_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence3017); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledigit_sequence"


    // $ANTLR start "ruledigit_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1457:1: ruledigit_sequence : ( ( rule__Digit_sequence__Group__0 ) ) ;
    public final void ruledigit_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1461:2: ( ( ( rule__Digit_sequence__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1462:1: ( ( rule__Digit_sequence__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1462:1: ( ( rule__Digit_sequence__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1463:1: ( rule__Digit_sequence__Group__0 )
            {
             before(grammarAccess.getDigit_sequenceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1464:1: ( rule__Digit_sequence__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1464:2: rule__Digit_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__0_in_ruledigit_sequence3043);
            rule__Digit_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDigit_sequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledigit_sequence"


    // $ANTLR start "entryRulesign"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1476:1: entryRulesign : rulesign EOF ;
    public final void entryRulesign() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1477:1: ( rulesign EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1478:1: rulesign EOF
            {
             before(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign3070);
            rulesign();

            state._fsp--;

             after(grammarAccess.getSignRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign3077); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1485:1: rulesign : ( ( rule__Sign__Alternatives ) ) ;
    public final void rulesign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1489:2: ( ( ( rule__Sign__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1490:1: ( ( rule__Sign__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1490:1: ( ( rule__Sign__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1491:1: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1492:1: ( rule__Sign__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1492:2: rule__Sign__Alternatives
            {
            pushFollow(FOLLOW_rule__Sign__Alternatives_in_rulesign3103);
            rule__Sign__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesign"


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1504:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1505:1: ( rulelabel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1506:1: rulelabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel3130);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel3137); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1513:1: rulelabel : ( ruleinteger_number ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1517:2: ( ( ruleinteger_number ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1518:1: ( ruleinteger_number )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1518:1: ( ruleinteger_number )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1519:1: ruleinteger_number
            {
             before(grammarAccess.getLabelAccess().getInteger_numberParserRuleCall()); 
            pushFollow(FOLLOW_ruleinteger_number_in_rulelabel3163);
            ruleinteger_number();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getInteger_numberParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRuleconstant"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1532:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1533:1: ( ruleconstant EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1534:1: ruleconstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant3189);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant3196); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1541:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1545:2: ( ( ( rule__Constant__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1546:1: ( ( rule__Constant__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1546:1: ( ( rule__Constant__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1547:1: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1548:1: ( rule__Constant__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1548:2: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_in_ruleconstant3222);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Alternatives_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1560:1: rule__Procedure_and_function_declaration_part__Alternatives_0 : ( ( 'procedure_declaration' ) | ( 'function_declaration' ) );
    public final void rule__Procedure_and_function_declaration_part__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1564:1: ( ( 'procedure_declaration' ) | ( 'function_declaration' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1565:1: ( 'procedure_declaration' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1565:1: ( 'procedure_declaration' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1566:1: 'procedure_declaration'
                    {
                     before(grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_declarationKeyword_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Procedure_and_function_declaration_part__Alternatives_03259); 
                     after(grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_declarationKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1573:6: ( 'function_declaration' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1573:6: ( 'function_declaration' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1574:1: 'function_declaration'
                    {
                     before(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunction_declarationKeyword_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__Procedure_and_function_declaration_part__Alternatives_03279); 
                     after(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunction_declarationKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Alternatives_0"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1590:1: rule__Type__Alternatives : ( ( rulesimple_type ) | ( rulestructured_type ) | ( rulepointer_type ) | ( ruletype_identifier ) | ( 'TESTE' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1594:1: ( ( rulesimple_type ) | ( rulestructured_type ) | ( rulepointer_type ) | ( ruletype_identifier ) | ( 'TESTE' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UNSIGNED_DIGIT_SEQUENCE:
            case 20:
            case 21:
            case 25:
                {
                alt6=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==37) ) {
                    alt6=1;
                }
                else if ( (LA6_2==EOF||LA6_2==24||LA6_2==26||LA6_2==35) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
            case 39:
            case 43:
            case 44:
            case 45:
                {
                alt6=2;
                }
                break;
            case 46:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1595:1: ( rulesimple_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1595:1: ( rulesimple_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1596:1: rulesimple_type
                    {
                     before(grammarAccess.getTypeAccess().getSimple_typeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulesimple_type_in_rule__Type__Alternatives3317);
                    rulesimple_type();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimple_typeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1601:6: ( rulestructured_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1601:6: ( rulestructured_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1602:1: rulestructured_type
                    {
                     before(grammarAccess.getTypeAccess().getStructured_typeParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulestructured_type_in_rule__Type__Alternatives3334);
                    rulestructured_type();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getStructured_typeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1607:6: ( rulepointer_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1607:6: ( rulepointer_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1608:1: rulepointer_type
                    {
                     before(grammarAccess.getTypeAccess().getPointer_typeParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulepointer_type_in_rule__Type__Alternatives3351);
                    rulepointer_type();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPointer_typeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1613:6: ( ruletype_identifier )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1613:6: ( ruletype_identifier )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1614:1: ruletype_identifier
                    {
                     before(grammarAccess.getTypeAccess().getType_identifierParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruletype_identifier_in_rule__Type__Alternatives3368);
                    ruletype_identifier();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_identifierParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1619:6: ( 'TESTE' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1619:6: ( 'TESTE' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1620:1: 'TESTE'
                    {
                     before(grammarAccess.getTypeAccess().getTESTEKeyword_4()); 
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives3386); 
                     after(grammarAccess.getTypeAccess().getTESTEKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Simple_type__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1632:1: rule__Simple_type__Alternatives : ( ( rulesubrange_type ) | ( ruleenumerated_type ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1636:1: ( ( rulesubrange_type ) | ( ruleenumerated_type ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_IDENTIFIER && LA7_0<=RULE_UNSIGNED_DIGIT_SEQUENCE)||(LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1637:1: ( rulesubrange_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1637:1: ( rulesubrange_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1638:1: rulesubrange_type
                    {
                     before(grammarAccess.getSimple_typeAccess().getSubrange_typeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulesubrange_type_in_rule__Simple_type__Alternatives3420);
                    rulesubrange_type();

                    state._fsp--;

                     after(grammarAccess.getSimple_typeAccess().getSubrange_typeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1643:6: ( ruleenumerated_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1643:6: ( ruleenumerated_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1644:1: ruleenumerated_type
                    {
                     before(grammarAccess.getSimple_typeAccess().getEnumerated_typeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleenumerated_type_in_rule__Simple_type__Alternatives3437);
                    ruleenumerated_type();

                    state._fsp--;

                     after(grammarAccess.getSimple_typeAccess().getEnumerated_typeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__Alternatives"


    // $ANTLR start "rule__Unpacked_structured_type__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1654:1: rule__Unpacked_structured_type__Alternatives : ( ( rulearray_type ) | ( rulerecord_type ) | ( ruleset_type ) | ( rulefile_type ) );
    public final void rule__Unpacked_structured_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1658:1: ( ( rulearray_type ) | ( rulerecord_type ) | ( ruleset_type ) | ( rulefile_type ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case 43:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            case 45:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1659:1: ( rulearray_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1659:1: ( rulearray_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1660:1: rulearray_type
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getArray_typeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulearray_type_in_rule__Unpacked_structured_type__Alternatives3469);
                    rulearray_type();

                    state._fsp--;

                     after(grammarAccess.getUnpacked_structured_typeAccess().getArray_typeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1665:6: ( rulerecord_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1665:6: ( rulerecord_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1666:1: rulerecord_type
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getRecord_typeParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulerecord_type_in_rule__Unpacked_structured_type__Alternatives3486);
                    rulerecord_type();

                    state._fsp--;

                     after(grammarAccess.getUnpacked_structured_typeAccess().getRecord_typeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1671:6: ( ruleset_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1671:6: ( ruleset_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1672:1: ruleset_type
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getSet_typeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleset_type_in_rule__Unpacked_structured_type__Alternatives3503);
                    ruleset_type();

                    state._fsp--;

                     after(grammarAccess.getUnpacked_structured_typeAccess().getSet_typeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1677:6: ( rulefile_type )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1677:6: ( rulefile_type )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1678:1: rulefile_type
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getFile_typeParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulefile_type_in_rule__Unpacked_structured_type__Alternatives3520);
                    rulefile_type();

                    state._fsp--;

                     after(grammarAccess.getUnpacked_structured_typeAccess().getFile_typeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_structured_type__Alternatives"


    // $ANTLR start "rule__Field_list__Alternatives_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1688:1: rule__Field_list__Alternatives_0 : ( ( ( rule__Field_list__Group_0_0__0 ) ) | ( rulevariant_part ) );
    public final void rule__Field_list__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1692:1: ( ( ( rule__Field_list__Group_0_0__0 ) ) | ( rulevariant_part ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_IDENTIFIER) ) {
                alt9=1;
            }
            else if ( (LA9_0==47) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1693:1: ( ( rule__Field_list__Group_0_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1693:1: ( ( rule__Field_list__Group_0_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1694:1: ( rule__Field_list__Group_0_0__0 )
                    {
                     before(grammarAccess.getField_listAccess().getGroup_0_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1695:1: ( rule__Field_list__Group_0_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1695:2: rule__Field_list__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Field_list__Group_0_0__0_in_rule__Field_list__Alternatives_03552);
                    rule__Field_list__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_listAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1699:6: ( rulevariant_part )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1699:6: ( rulevariant_part )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1700:1: rulevariant_part
                    {
                     before(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulevariant_part_in_rule__Field_list__Alternatives_03570);
                    rulevariant_part();

                    state._fsp--;

                     after(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Alternatives_0"


    // $ANTLR start "rule__Number__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1711:1: rule__Number__Alternatives : ( ( ruleinteger_number ) | ( rulereal_number ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1715:1: ( ( ruleinteger_number ) | ( rulereal_number ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                    int LA10_3 = input.LA(3);

                    if ( ((LA10_3>=18 && LA10_3<=19)||LA10_3==22) ) {
                        alt10=2;
                    }
                    else if ( (LA10_3==EOF||LA10_3==24||LA10_3==26||LA10_3==28||LA10_3==33||LA10_3==35||LA10_3==37||LA10_3==41) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                    int LA10_3 = input.LA(3);

                    if ( ((LA10_3>=18 && LA10_3<=19)||LA10_3==22) ) {
                        alt10=2;
                    }
                    else if ( (LA10_3==EOF||LA10_3==24||LA10_3==26||LA10_3==28||LA10_3==33||LA10_3==35||LA10_3==37||LA10_3==41) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNSIGNED_DIGIT_SEQUENCE:
                {
                int LA10_3 = input.LA(2);

                if ( ((LA10_3>=18 && LA10_3<=19)||LA10_3==22) ) {
                    alt10=2;
                }
                else if ( (LA10_3==EOF||LA10_3==24||LA10_3==26||LA10_3==28||LA10_3==33||LA10_3==35||LA10_3==37||LA10_3==41) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1716:1: ( ruleinteger_number )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1716:1: ( ruleinteger_number )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1717:1: ruleinteger_number
                    {
                     before(grammarAccess.getNumberAccess().getInteger_numberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleinteger_number_in_rule__Number__Alternatives3603);
                    ruleinteger_number();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getInteger_numberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1722:6: ( rulereal_number )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1722:6: ( rulereal_number )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1723:1: rulereal_number
                    {
                     before(grammarAccess.getNumberAccess().getReal_numberParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulereal_number_in_rule__Number__Alternatives3620);
                    rulereal_number();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getReal_numberParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Real_number__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1733:1: rule__Real_number__Alternatives : ( ( ( rule__Real_number__Group_0__0 ) ) | ( ( rule__Real_number__Group_1__0 ) ) );
    public final void rule__Real_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1737:1: ( ( ( rule__Real_number__Group_0__0 ) ) | ( ( rule__Real_number__Group_1__0 ) ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==22) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_3>=18 && LA11_3<=19)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==22) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_3>=18 && LA11_3<=19)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNSIGNED_DIGIT_SEQUENCE:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==22) ) {
                    alt11=1;
                }
                else if ( ((LA11_3>=18 && LA11_3<=19)) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1738:1: ( ( rule__Real_number__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1738:1: ( ( rule__Real_number__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1739:1: ( rule__Real_number__Group_0__0 )
                    {
                     before(grammarAccess.getReal_numberAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1740:1: ( rule__Real_number__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1740:2: rule__Real_number__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Real_number__Group_0__0_in_rule__Real_number__Alternatives3652);
                    rule__Real_number__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReal_numberAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1744:6: ( ( rule__Real_number__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1744:6: ( ( rule__Real_number__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1745:1: ( rule__Real_number__Group_1__0 )
                    {
                     before(grammarAccess.getReal_numberAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1746:1: ( rule__Real_number__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1746:2: rule__Real_number__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Real_number__Group_1__0_in_rule__Real_number__Alternatives3670);
                    rule__Real_number__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReal_numberAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Alternatives"


    // $ANTLR start "rule__Scale_factor__Alternatives_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1755:1: rule__Scale_factor__Alternatives_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Scale_factor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1759:1: ( ( 'E' ) | ( 'e' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1760:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1760:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1761:1: 'E'
                    {
                     before(grammarAccess.getScale_factorAccess().getEKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Scale_factor__Alternatives_03704); 
                     after(grammarAccess.getScale_factorAccess().getEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1768:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1768:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1769:1: 'e'
                    {
                     before(grammarAccess.getScale_factorAccess().getEKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Scale_factor__Alternatives_03724); 
                     after(grammarAccess.getScale_factorAccess().getEKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale_factor__Alternatives_0"


    // $ANTLR start "rule__Sign__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1781:1: rule__Sign__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1785:1: ( ( '+' ) | ( '-' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1786:1: ( '+' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1786:1: ( '+' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1787:1: '+'
                    {
                     before(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                    match(input,20,FOLLOW_20_in_rule__Sign__Alternatives3759); 
                     after(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1794:6: ( '-' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1794:6: ( '-' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1795:1: '-'
                    {
                     before(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                    match(input,21,FOLLOW_21_in_rule__Sign__Alternatives3779); 
                     after(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sign__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1807:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( RULE_STRING ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1811:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( RULE_STRING ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDENTIFIER||LA14_0==RULE_UNSIGNED_DIGIT_SEQUENCE||(LA14_0>=20 && LA14_0<=21)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1812:1: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1812:1: ( ( rule__Constant__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1813:1: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1814:1: ( rule__Constant__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1814:2: rule__Constant__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_0__0_in_rule__Constant__Alternatives3813);
                    rule__Constant__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1818:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1818:6: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1819:1: RULE_STRING
                    {
                     before(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constant__Alternatives3831); 
                     after(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives_0_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1829:1: rule__Constant__Alternatives_0_1 : ( ( ruleconstant_identifier ) | ( rulenumber ) );
    public final void rule__Constant__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1833:1: ( ( ruleconstant_identifier ) | ( rulenumber ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IDENTIFIER) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_UNSIGNED_DIGIT_SEQUENCE||(LA15_0>=20 && LA15_0<=21)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1834:1: ( ruleconstant_identifier )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1834:1: ( ruleconstant_identifier )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1835:1: ruleconstant_identifier
                    {
                     before(grammarAccess.getConstantAccess().getConstant_identifierParserRuleCall_0_1_0()); 
                    pushFollow(FOLLOW_ruleconstant_identifier_in_rule__Constant__Alternatives_0_13863);
                    ruleconstant_identifier();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getConstant_identifierParserRuleCall_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1840:6: ( rulenumber )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1840:6: ( rulenumber )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1841:1: rulenumber
                    {
                     before(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 
                    pushFollow(FOLLOW_rulenumber_in_rule__Constant__Alternatives_0_13880);
                    rulenumber();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives_0_1"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1853:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1857:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1858:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__03910);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__03913);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1865:1: rule__Program__Group__0__Impl : ( ruleprogram_heading ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1869:1: ( ( ruleprogram_heading ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1870:1: ( ruleprogram_heading )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1870:1: ( ruleprogram_heading )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1871:1: ruleprogram_heading
            {
             before(grammarAccess.getProgramAccess().getProgram_headingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_heading_in_rule__Program__Group__0__Impl3940);
            ruleprogram_heading();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProgram_headingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1882:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1886:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1887:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__13969);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__13972);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1894:1: rule__Program__Group__1__Impl : ( ruleblock ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1898:1: ( ( ruleblock ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1899:1: ( ruleblock )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1899:1: ( ruleblock )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1900:1: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleblock_in_rule__Program__Group__1__Impl3999);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1911:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1915:1: ( rule__Program__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1916:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__24028);
            rule__Program__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1922:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1926:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1927:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1927:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1928:1: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group__2__Impl4056); 
             after(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program_heading__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1947:1: rule__Program_heading__Group__0 : rule__Program_heading__Group__0__Impl rule__Program_heading__Group__1 ;
    public final void rule__Program_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1951:1: ( rule__Program_heading__Group__0__Impl rule__Program_heading__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1952:2: rule__Program_heading__Group__0__Impl rule__Program_heading__Group__1
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__0__Impl_in_rule__Program_heading__Group__04093);
            rule__Program_heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group__1_in_rule__Program_heading__Group__04096);
            rule__Program_heading__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group__0"


    // $ANTLR start "rule__Program_heading__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1959:1: rule__Program_heading__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1963:1: ( ( 'program' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1964:1: ( 'program' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1964:1: ( 'program' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1965:1: 'program'
            {
             before(grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Program_heading__Group__0__Impl4124); 
             after(grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group__0__Impl"


    // $ANTLR start "rule__Program_heading__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1978:1: rule__Program_heading__Group__1 : rule__Program_heading__Group__1__Impl rule__Program_heading__Group__2 ;
    public final void rule__Program_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1982:1: ( rule__Program_heading__Group__1__Impl rule__Program_heading__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1983:2: rule__Program_heading__Group__1__Impl rule__Program_heading__Group__2
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__1__Impl_in_rule__Program_heading__Group__14155);
            rule__Program_heading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group__2_in_rule__Program_heading__Group__14158);
            rule__Program_heading__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group__1"


    // $ANTLR start "rule__Program_heading__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1990:1: rule__Program_heading__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Program_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1994:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1995:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1995:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1996:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getProgram_headingAccess().getIDENTIFIERTerminalRuleCall_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading__Group__1__Impl4185); 
             after(grammarAccess.getProgram_headingAccess().getIDENTIFIERTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group__1__Impl"


    // $ANTLR start "rule__Program_heading__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2007:1: rule__Program_heading__Group__2 : rule__Program_heading__Group__2__Impl rule__Program_heading__Group__3 ;
    public final void rule__Program_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2011:1: ( rule__Program_heading__Group__2__Impl rule__Program_heading__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2012:2: rule__Program_heading__Group__2__Impl rule__Program_heading__Group__3
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__2__Impl_in_rule__Program_heading__Group__24214);
            rule__Program_heading__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group__3_in_rule__Program_heading__Group__24217);
            rule__Program_heading__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group__2"


    // $ANTLR start "rule__Program_heading__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2019:1: rule__Program_heading__Group__2__Impl : ( ( rule__Program_heading__Group_2__0 )? ) ;
    public final void rule__Program_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2023:1: ( ( ( rule__Program_heading__Group_2__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2024:1: ( ( rule__Program_heading__Group_2__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2024:1: ( ( rule__Program_heading__Group_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2025:1: ( rule__Program_heading__Group_2__0 )?
            {
             before(grammarAccess.getProgram_headingAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2026:1: ( rule__Program_heading__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2026:2: rule__Program_heading__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Program_heading__Group_2__0_in_rule__Program_heading__Group__2__Impl4244);
                    rule__Program_heading__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgram_headingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group__2__Impl"


    // $ANTLR start "rule__Program_heading__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2036:1: rule__Program_heading__Group__3 : rule__Program_heading__Group__3__Impl ;
    public final void rule__Program_heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2040:1: ( rule__Program_heading__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2041:2: rule__Program_heading__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__3__Impl_in_rule__Program_heading__Group__34275);
            rule__Program_heading__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group__3"


    // $ANTLR start "rule__Program_heading__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2047:1: rule__Program_heading__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2051:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2052:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2052:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2053:1: ';'
            {
             before(grammarAccess.getProgram_headingAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Program_heading__Group__3__Impl4303); 
             after(grammarAccess.getProgram_headingAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group__3__Impl"


    // $ANTLR start "rule__Program_heading__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2074:1: rule__Program_heading__Group_2__0 : rule__Program_heading__Group_2__0__Impl rule__Program_heading__Group_2__1 ;
    public final void rule__Program_heading__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2078:1: ( rule__Program_heading__Group_2__0__Impl rule__Program_heading__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2079:2: rule__Program_heading__Group_2__0__Impl rule__Program_heading__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program_heading__Group_2__0__Impl_in_rule__Program_heading__Group_2__04342);
            rule__Program_heading__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group_2__1_in_rule__Program_heading__Group_2__04345);
            rule__Program_heading__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group_2__0"


    // $ANTLR start "rule__Program_heading__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2086:1: rule__Program_heading__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2090:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2091:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2091:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2092:1: '('
            {
             before(grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Program_heading__Group_2__0__Impl4373); 
             after(grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group_2__0__Impl"


    // $ANTLR start "rule__Program_heading__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2105:1: rule__Program_heading__Group_2__1 : rule__Program_heading__Group_2__1__Impl rule__Program_heading__Group_2__2 ;
    public final void rule__Program_heading__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2109:1: ( rule__Program_heading__Group_2__1__Impl rule__Program_heading__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2110:2: rule__Program_heading__Group_2__1__Impl rule__Program_heading__Group_2__2
            {
            pushFollow(FOLLOW_rule__Program_heading__Group_2__1__Impl_in_rule__Program_heading__Group_2__14404);
            rule__Program_heading__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group_2__2_in_rule__Program_heading__Group_2__14407);
            rule__Program_heading__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group_2__1"


    // $ANTLR start "rule__Program_heading__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2117:1: rule__Program_heading__Group_2__1__Impl : ( ruleidentifier_list ) ;
    public final void rule__Program_heading__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2121:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2122:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2122:1: ( ruleidentifier_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2123:1: ruleidentifier_list
            {
             before(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Program_heading__Group_2__1__Impl4434);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group_2__1__Impl"


    // $ANTLR start "rule__Program_heading__Group_2__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2134:1: rule__Program_heading__Group_2__2 : rule__Program_heading__Group_2__2__Impl ;
    public final void rule__Program_heading__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2138:1: ( rule__Program_heading__Group_2__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2139:2: rule__Program_heading__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading__Group_2__2__Impl_in_rule__Program_heading__Group_2__24463);
            rule__Program_heading__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group_2__2"


    // $ANTLR start "rule__Program_heading__Group_2__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2145:1: rule__Program_heading__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2149:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2150:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2150:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2151:1: ')'
            {
             before(grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_2_2()); 
            match(input,26,FOLLOW_26_in_rule__Program_heading__Group_2__2__Impl4491); 
             after(grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading__Group_2__2__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2170:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2174:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2175:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04528);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04531);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2182:1: rule__Block__Group__0__Impl : ( ruledeclaration_part ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2186:1: ( ( ruledeclaration_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2187:1: ( ruledeclaration_part )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2187:1: ( ruledeclaration_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2188:1: ruledeclaration_part
            {
             before(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl4558);
            ruledeclaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2199:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2203:1: ( rule__Block__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2204:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14587);
            rule__Block__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2210:1: rule__Block__Group__1__Impl : ( rulestatement_part ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2214:1: ( ( rulestatement_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2215:1: ( rulestatement_part )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2215:1: ( rulestatement_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2216:1: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl4614);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Declaration_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2231:1: rule__Declaration_part__Group__0 : rule__Declaration_part__Group__0__Impl rule__Declaration_part__Group__1 ;
    public final void rule__Declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2235:1: ( rule__Declaration_part__Group__0__Impl rule__Declaration_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2236:2: rule__Declaration_part__Group__0__Impl rule__Declaration_part__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration_part__Group__0__Impl_in_rule__Declaration_part__Group__04647);
            rule__Declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration_part__Group__1_in_rule__Declaration_part__Group__04650);
            rule__Declaration_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__0"


    // $ANTLR start "rule__Declaration_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2243:1: rule__Declaration_part__Group__0__Impl : ( ( rulelabel_declaration_part )? ) ;
    public final void rule__Declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2247:1: ( ( ( rulelabel_declaration_part )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2248:1: ( ( rulelabel_declaration_part )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2248:1: ( ( rulelabel_declaration_part )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2249:1: ( rulelabel_declaration_part )?
            {
             before(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2250:1: ( rulelabel_declaration_part )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2250:3: rulelabel_declaration_part
                    {
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_rule__Declaration_part__Group__0__Impl4678);
                    rulelabel_declaration_part();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Declaration_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2260:1: rule__Declaration_part__Group__1 : rule__Declaration_part__Group__1__Impl rule__Declaration_part__Group__2 ;
    public final void rule__Declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2264:1: ( rule__Declaration_part__Group__1__Impl rule__Declaration_part__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2265:2: rule__Declaration_part__Group__1__Impl rule__Declaration_part__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration_part__Group__1__Impl_in_rule__Declaration_part__Group__14709);
            rule__Declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration_part__Group__2_in_rule__Declaration_part__Group__14712);
            rule__Declaration_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__1"


    // $ANTLR start "rule__Declaration_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2272:1: rule__Declaration_part__Group__1__Impl : ( ( ruleconstant_definition_part )? ) ;
    public final void rule__Declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2276:1: ( ( ( ruleconstant_definition_part )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2277:1: ( ( ruleconstant_definition_part )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2277:1: ( ( ruleconstant_definition_part )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2278:1: ( ruleconstant_definition_part )?
            {
             before(grammarAccess.getDeclaration_partAccess().getConstant_definition_partParserRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2279:1: ( ruleconstant_definition_part )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2279:3: ruleconstant_definition_part
                    {
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_rule__Declaration_part__Group__1__Impl4740);
                    ruleconstant_definition_part();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaration_partAccess().getConstant_definition_partParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Declaration_part__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2289:1: rule__Declaration_part__Group__2 : rule__Declaration_part__Group__2__Impl rule__Declaration_part__Group__3 ;
    public final void rule__Declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2293:1: ( rule__Declaration_part__Group__2__Impl rule__Declaration_part__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2294:2: rule__Declaration_part__Group__2__Impl rule__Declaration_part__Group__3
            {
            pushFollow(FOLLOW_rule__Declaration_part__Group__2__Impl_in_rule__Declaration_part__Group__24771);
            rule__Declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration_part__Group__3_in_rule__Declaration_part__Group__24774);
            rule__Declaration_part__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__2"


    // $ANTLR start "rule__Declaration_part__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2301:1: rule__Declaration_part__Group__2__Impl : ( ( ruletype_definition_part )? ) ;
    public final void rule__Declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2305:1: ( ( ( ruletype_definition_part )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2306:1: ( ( ruletype_definition_part )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2306:1: ( ( ruletype_definition_part )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2307:1: ( ruletype_definition_part )?
            {
             before(grammarAccess.getDeclaration_partAccess().getType_definition_partParserRuleCall_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2308:1: ( ruletype_definition_part )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2308:3: ruletype_definition_part
                    {
                    pushFollow(FOLLOW_ruletype_definition_part_in_rule__Declaration_part__Group__2__Impl4802);
                    ruletype_definition_part();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaration_partAccess().getType_definition_partParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__2__Impl"


    // $ANTLR start "rule__Declaration_part__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2318:1: rule__Declaration_part__Group__3 : rule__Declaration_part__Group__3__Impl rule__Declaration_part__Group__4 ;
    public final void rule__Declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2322:1: ( rule__Declaration_part__Group__3__Impl rule__Declaration_part__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2323:2: rule__Declaration_part__Group__3__Impl rule__Declaration_part__Group__4
            {
            pushFollow(FOLLOW_rule__Declaration_part__Group__3__Impl_in_rule__Declaration_part__Group__34833);
            rule__Declaration_part__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration_part__Group__4_in_rule__Declaration_part__Group__34836);
            rule__Declaration_part__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__3"


    // $ANTLR start "rule__Declaration_part__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2330:1: rule__Declaration_part__Group__3__Impl : ( ( rulevariable_declaration_part )? ) ;
    public final void rule__Declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2334:1: ( ( ( rulevariable_declaration_part )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2335:1: ( ( rulevariable_declaration_part )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2335:1: ( ( rulevariable_declaration_part )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2336:1: ( rulevariable_declaration_part )?
            {
             before(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partParserRuleCall_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2337:1: ( rulevariable_declaration_part )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2337:3: rulevariable_declaration_part
                    {
                    pushFollow(FOLLOW_rulevariable_declaration_part_in_rule__Declaration_part__Group__3__Impl4864);
                    rulevariable_declaration_part();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__3__Impl"


    // $ANTLR start "rule__Declaration_part__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2347:1: rule__Declaration_part__Group__4 : rule__Declaration_part__Group__4__Impl ;
    public final void rule__Declaration_part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2351:1: ( rule__Declaration_part__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2352:2: rule__Declaration_part__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Declaration_part__Group__4__Impl_in_rule__Declaration_part__Group__44895);
            rule__Declaration_part__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__4"


    // $ANTLR start "rule__Declaration_part__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2358:1: rule__Declaration_part__Group__4__Impl : ( ruleprocedure_and_function_declaration_part ) ;
    public final void rule__Declaration_part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2362:1: ( ( ruleprocedure_and_function_declaration_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2363:1: ( ruleprocedure_and_function_declaration_part )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2363:1: ( ruleprocedure_and_function_declaration_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2364:1: ruleprocedure_and_function_declaration_part
            {
             before(grammarAccess.getDeclaration_partAccess().getProcedure_and_function_declaration_partParserRuleCall_4()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_rule__Declaration_part__Group__4__Impl4922);
            ruleprocedure_and_function_declaration_part();

            state._fsp--;

             after(grammarAccess.getDeclaration_partAccess().getProcedure_and_function_declaration_partParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration_part__Group__4__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2385:1: rule__Label_declaration_part__Group__0 : rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 ;
    public final void rule__Label_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2389:1: ( rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2390:2: rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__04961);
            rule__Label_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__04964);
            rule__Label_declaration_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group__0"


    // $ANTLR start "rule__Label_declaration_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2397:1: rule__Label_declaration_part__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2401:1: ( ( 'label' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2402:1: ( 'label' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2402:1: ( 'label' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2403:1: 'label'
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Label_declaration_part__Group__0__Impl4992); 
             after(grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2416:1: rule__Label_declaration_part__Group__1 : rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 ;
    public final void rule__Label_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2420:1: ( rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2421:2: rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__15023);
            rule__Label_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__15026);
            rule__Label_declaration_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group__1"


    // $ANTLR start "rule__Label_declaration_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2428:1: rule__Label_declaration_part__Group__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2432:1: ( ( rulelabel ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2433:1: ( rulelabel )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2433:1: ( rulelabel )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2434:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl5053);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2445:1: rule__Label_declaration_part__Group__2 : rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 ;
    public final void rule__Label_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2449:1: ( rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2450:2: rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__25082);
            rule__Label_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__25085);
            rule__Label_declaration_part__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group__2"


    // $ANTLR start "rule__Label_declaration_part__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2457:1: rule__Label_declaration_part__Group__2__Impl : ( ( rule__Label_declaration_part__Group_2__0 )* ) ;
    public final void rule__Label_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2461:1: ( ( ( rule__Label_declaration_part__Group_2__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2462:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2462:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2463:1: ( rule__Label_declaration_part__Group_2__0 )*
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2464:1: ( rule__Label_declaration_part__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2464:2: rule__Label_declaration_part__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl5112);
            	    rule__Label_declaration_part__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getLabel_declaration_partAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group__2__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2474:1: rule__Label_declaration_part__Group__3 : rule__Label_declaration_part__Group__3__Impl ;
    public final void rule__Label_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2478:1: ( rule__Label_declaration_part__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2479:2: rule__Label_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__35143);
            rule__Label_declaration_part__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group__3"


    // $ANTLR start "rule__Label_declaration_part__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2485:1: rule__Label_declaration_part__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2489:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2490:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2490:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2491:1: ';'
            {
             before(grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Label_declaration_part__Group__3__Impl5171); 
             after(grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group__3__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2512:1: rule__Label_declaration_part__Group_2__0 : rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 ;
    public final void rule__Label_declaration_part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2516:1: ( rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2517:2: rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__05210);
            rule__Label_declaration_part__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__05213);
            rule__Label_declaration_part__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group_2__0"


    // $ANTLR start "rule__Label_declaration_part__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2524:1: rule__Label_declaration_part__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration_part__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2528:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2529:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2529:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2530:1: ','
            {
             before(grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Label_declaration_part__Group_2__0__Impl5241); 
             after(grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group_2__0__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2543:1: rule__Label_declaration_part__Group_2__1 : rule__Label_declaration_part__Group_2__1__Impl ;
    public final void rule__Label_declaration_part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2547:1: ( rule__Label_declaration_part__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2548:2: rule__Label_declaration_part__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__15272);
            rule__Label_declaration_part__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group_2__1"


    // $ANTLR start "rule__Label_declaration_part__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2554:1: rule__Label_declaration_part__Group_2__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2558:1: ( ( rulelabel ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2559:1: ( rulelabel )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2559:1: ( rulelabel )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2560:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl5299);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label_declaration_part__Group_2__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2575:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2579:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2580:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
            {
            pushFollow(FOLLOW_rule__Constant_definition_part__Group__0__Impl_in_rule__Constant_definition_part__Group__05332);
            rule__Constant_definition_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant_definition_part__Group__1_in_rule__Constant_definition_part__Group__05335);
            rule__Constant_definition_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__0"


    // $ANTLR start "rule__Constant_definition_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2587:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2591:1: ( ( 'const' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2592:1: ( 'const' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2592:1: ( 'const' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2593:1: 'const'
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Constant_definition_part__Group__0__Impl5363); 
             after(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2606:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl rule__Constant_definition_part__Group__2 ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2610:1: ( rule__Constant_definition_part__Group__1__Impl rule__Constant_definition_part__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2611:2: rule__Constant_definition_part__Group__1__Impl rule__Constant_definition_part__Group__2
            {
            pushFollow(FOLLOW_rule__Constant_definition_part__Group__1__Impl_in_rule__Constant_definition_part__Group__15394);
            rule__Constant_definition_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant_definition_part__Group__2_in_rule__Constant_definition_part__Group__15397);
            rule__Constant_definition_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__1"


    // $ANTLR start "rule__Constant_definition_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2618:1: rule__Constant_definition_part__Group__1__Impl : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2622:1: ( ( ruleconstant_definition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2623:1: ( ruleconstant_definition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2623:1: ( ruleconstant_definition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2624:1: ruleconstant_definition
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_rule__Constant_definition_part__Group__1__Impl5424);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2635:1: rule__Constant_definition_part__Group__2 : rule__Constant_definition_part__Group__2__Impl rule__Constant_definition_part__Group__3 ;
    public final void rule__Constant_definition_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2639:1: ( rule__Constant_definition_part__Group__2__Impl rule__Constant_definition_part__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2640:2: rule__Constant_definition_part__Group__2__Impl rule__Constant_definition_part__Group__3
            {
            pushFollow(FOLLOW_rule__Constant_definition_part__Group__2__Impl_in_rule__Constant_definition_part__Group__25453);
            rule__Constant_definition_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant_definition_part__Group__3_in_rule__Constant_definition_part__Group__25456);
            rule__Constant_definition_part__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__2"


    // $ANTLR start "rule__Constant_definition_part__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2647:1: rule__Constant_definition_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2651:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2652:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2652:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2653:1: ';'
            {
             before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Constant_definition_part__Group__2__Impl5484); 
             after(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__2__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2666:1: rule__Constant_definition_part__Group__3 : rule__Constant_definition_part__Group__3__Impl ;
    public final void rule__Constant_definition_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2670:1: ( rule__Constant_definition_part__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2671:2: rule__Constant_definition_part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Constant_definition_part__Group__3__Impl_in_rule__Constant_definition_part__Group__35515);
            rule__Constant_definition_part__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__3"


    // $ANTLR start "rule__Constant_definition_part__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2677:1: rule__Constant_definition_part__Group__3__Impl : ( ( rule__Constant_definition_part__Group_3__0 )* ) ;
    public final void rule__Constant_definition_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2681:1: ( ( ( rule__Constant_definition_part__Group_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2682:1: ( ( rule__Constant_definition_part__Group_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2682:1: ( ( rule__Constant_definition_part__Group_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2683:1: ( rule__Constant_definition_part__Group_3__0 )*
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2684:1: ( rule__Constant_definition_part__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_IDENTIFIER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2684:2: rule__Constant_definition_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Constant_definition_part__Group_3__0_in_rule__Constant_definition_part__Group__3__Impl5542);
            	    rule__Constant_definition_part__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getConstant_definition_partAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__3__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2702:1: rule__Constant_definition_part__Group_3__0 : rule__Constant_definition_part__Group_3__0__Impl rule__Constant_definition_part__Group_3__1 ;
    public final void rule__Constant_definition_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2706:1: ( rule__Constant_definition_part__Group_3__0__Impl rule__Constant_definition_part__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2707:2: rule__Constant_definition_part__Group_3__0__Impl rule__Constant_definition_part__Group_3__1
            {
            pushFollow(FOLLOW_rule__Constant_definition_part__Group_3__0__Impl_in_rule__Constant_definition_part__Group_3__05581);
            rule__Constant_definition_part__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant_definition_part__Group_3__1_in_rule__Constant_definition_part__Group_3__05584);
            rule__Constant_definition_part__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_3__0"


    // $ANTLR start "rule__Constant_definition_part__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2714:1: rule__Constant_definition_part__Group_3__0__Impl : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2718:1: ( ( ruleconstant_definition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2719:1: ( ruleconstant_definition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2719:1: ( ruleconstant_definition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2720:1: ruleconstant_definition
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_rule__Constant_definition_part__Group_3__0__Impl5611);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_3__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2731:1: rule__Constant_definition_part__Group_3__1 : rule__Constant_definition_part__Group_3__1__Impl ;
    public final void rule__Constant_definition_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2735:1: ( rule__Constant_definition_part__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2736:2: rule__Constant_definition_part__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant_definition_part__Group_3__1__Impl_in_rule__Constant_definition_part__Group_3__15640);
            rule__Constant_definition_part__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_3__1"


    // $ANTLR start "rule__Constant_definition_part__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2742:1: rule__Constant_definition_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2746:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2747:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2747:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2748:1: ';'
            {
             before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_3_1()); 
            match(input,24,FOLLOW_24_in_rule__Constant_definition_part__Group_3__1__Impl5668); 
             after(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_3__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2765:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2769:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2770:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
            {
            pushFollow(FOLLOW_rule__Constant_definition__Group__0__Impl_in_rule__Constant_definition__Group__05703);
            rule__Constant_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant_definition__Group__1_in_rule__Constant_definition__Group__05706);
            rule__Constant_definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__0"


    // $ANTLR start "rule__Constant_definition__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2777:1: rule__Constant_definition__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2781:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2782:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2782:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2783:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getConstant_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Constant_definition__Group__0__Impl5733); 
             after(grammarAccess.getConstant_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2794:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2798:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2799:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
            {
            pushFollow(FOLLOW_rule__Constant_definition__Group__1__Impl_in_rule__Constant_definition__Group__15762);
            rule__Constant_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant_definition__Group__2_in_rule__Constant_definition__Group__15765);
            rule__Constant_definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__1"


    // $ANTLR start "rule__Constant_definition__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2806:1: rule__Constant_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2810:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2811:1: ( '=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2811:1: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2812:1: '='
            {
             before(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Constant_definition__Group__1__Impl5793); 
             after(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2825:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2829:1: ( rule__Constant_definition__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2830:2: rule__Constant_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Constant_definition__Group__2__Impl_in_rule__Constant_definition__Group__25824);
            rule__Constant_definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__2"


    // $ANTLR start "rule__Constant_definition__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2836:1: rule__Constant_definition__Group__2__Impl : ( ruleconstant ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2840:1: ( ( ruleconstant ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2841:1: ( ruleconstant )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2841:1: ( ruleconstant )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2842:1: ruleconstant
            {
             before(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleconstant_in_rule__Constant_definition__Group__2__Impl5851);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__2__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2859:1: rule__Type_definition_part__Group__0 : rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 ;
    public final void rule__Type_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2863:1: ( rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2864:2: rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1
            {
            pushFollow(FOLLOW_rule__Type_definition_part__Group__0__Impl_in_rule__Type_definition_part__Group__05886);
            rule__Type_definition_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_definition_part__Group__1_in_rule__Type_definition_part__Group__05889);
            rule__Type_definition_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__0"


    // $ANTLR start "rule__Type_definition_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2871:1: rule__Type_definition_part__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2875:1: ( ( 'type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2876:1: ( 'type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2876:1: ( 'type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2877:1: 'type'
            {
             before(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Type_definition_part__Group__0__Impl5917); 
             after(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2890:1: rule__Type_definition_part__Group__1 : rule__Type_definition_part__Group__1__Impl rule__Type_definition_part__Group__2 ;
    public final void rule__Type_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2894:1: ( rule__Type_definition_part__Group__1__Impl rule__Type_definition_part__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2895:2: rule__Type_definition_part__Group__1__Impl rule__Type_definition_part__Group__2
            {
            pushFollow(FOLLOW_rule__Type_definition_part__Group__1__Impl_in_rule__Type_definition_part__Group__15948);
            rule__Type_definition_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_definition_part__Group__2_in_rule__Type_definition_part__Group__15951);
            rule__Type_definition_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__1"


    // $ANTLR start "rule__Type_definition_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2902:1: rule__Type_definition_part__Group__1__Impl : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2906:1: ( ( ruletype_definition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2907:1: ( ruletype_definition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2907:1: ( ruletype_definition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2908:1: ruletype_definition
            {
             before(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruletype_definition_in_rule__Type_definition_part__Group__1__Impl5978);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__1__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2919:1: rule__Type_definition_part__Group__2 : rule__Type_definition_part__Group__2__Impl rule__Type_definition_part__Group__3 ;
    public final void rule__Type_definition_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2923:1: ( rule__Type_definition_part__Group__2__Impl rule__Type_definition_part__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2924:2: rule__Type_definition_part__Group__2__Impl rule__Type_definition_part__Group__3
            {
            pushFollow(FOLLOW_rule__Type_definition_part__Group__2__Impl_in_rule__Type_definition_part__Group__26007);
            rule__Type_definition_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_definition_part__Group__3_in_rule__Type_definition_part__Group__26010);
            rule__Type_definition_part__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__2"


    // $ANTLR start "rule__Type_definition_part__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2931:1: rule__Type_definition_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Type_definition_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2935:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2936:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2936:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2937:1: ';'
            {
             before(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Type_definition_part__Group__2__Impl6038); 
             after(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__2__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2950:1: rule__Type_definition_part__Group__3 : rule__Type_definition_part__Group__3__Impl ;
    public final void rule__Type_definition_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2954:1: ( rule__Type_definition_part__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2955:2: rule__Type_definition_part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Type_definition_part__Group__3__Impl_in_rule__Type_definition_part__Group__36069);
            rule__Type_definition_part__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__3"


    // $ANTLR start "rule__Type_definition_part__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2961:1: rule__Type_definition_part__Group__3__Impl : ( ( rule__Type_definition_part__Group_3__0 )* ) ;
    public final void rule__Type_definition_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2965:1: ( ( ( rule__Type_definition_part__Group_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2966:1: ( ( rule__Type_definition_part__Group_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2966:1: ( ( rule__Type_definition_part__Group_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2967:1: ( rule__Type_definition_part__Group_3__0 )*
            {
             before(grammarAccess.getType_definition_partAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2968:1: ( rule__Type_definition_part__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_IDENTIFIER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2968:2: rule__Type_definition_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Type_definition_part__Group_3__0_in_rule__Type_definition_part__Group__3__Impl6096);
            	    rule__Type_definition_part__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getType_definition_partAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__3__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2986:1: rule__Type_definition_part__Group_3__0 : rule__Type_definition_part__Group_3__0__Impl rule__Type_definition_part__Group_3__1 ;
    public final void rule__Type_definition_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2990:1: ( rule__Type_definition_part__Group_3__0__Impl rule__Type_definition_part__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2991:2: rule__Type_definition_part__Group_3__0__Impl rule__Type_definition_part__Group_3__1
            {
            pushFollow(FOLLOW_rule__Type_definition_part__Group_3__0__Impl_in_rule__Type_definition_part__Group_3__06135);
            rule__Type_definition_part__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_definition_part__Group_3__1_in_rule__Type_definition_part__Group_3__06138);
            rule__Type_definition_part__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_3__0"


    // $ANTLR start "rule__Type_definition_part__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:2998:1: rule__Type_definition_part__Group_3__0__Impl : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3002:1: ( ( ruletype_definition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3003:1: ( ruletype_definition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3003:1: ( ruletype_definition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3004:1: ruletype_definition
            {
             before(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruletype_definition_in_rule__Type_definition_part__Group_3__0__Impl6165);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_3__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3015:1: rule__Type_definition_part__Group_3__1 : rule__Type_definition_part__Group_3__1__Impl ;
    public final void rule__Type_definition_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3019:1: ( rule__Type_definition_part__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3020:2: rule__Type_definition_part__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Type_definition_part__Group_3__1__Impl_in_rule__Type_definition_part__Group_3__16194);
            rule__Type_definition_part__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_3__1"


    // $ANTLR start "rule__Type_definition_part__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3026:1: rule__Type_definition_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Type_definition_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3030:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3031:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3031:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3032:1: ';'
            {
             before(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_3_1()); 
            match(input,24,FOLLOW_24_in_rule__Type_definition_part__Group_3__1__Impl6222); 
             after(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_3__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3049:1: rule__Type_definition__Group__0 : rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 ;
    public final void rule__Type_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3053:1: ( rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3054:2: rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1
            {
            pushFollow(FOLLOW_rule__Type_definition__Group__0__Impl_in_rule__Type_definition__Group__06257);
            rule__Type_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_definition__Group__1_in_rule__Type_definition__Group__06260);
            rule__Type_definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__0"


    // $ANTLR start "rule__Type_definition__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3061:1: rule__Type_definition__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Type_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3065:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3066:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3066:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3067:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getType_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Type_definition__Group__0__Impl6287); 
             after(grammarAccess.getType_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__0__Impl"


    // $ANTLR start "rule__Type_definition__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3078:1: rule__Type_definition__Group__1 : rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 ;
    public final void rule__Type_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3082:1: ( rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3083:2: rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2
            {
            pushFollow(FOLLOW_rule__Type_definition__Group__1__Impl_in_rule__Type_definition__Group__16316);
            rule__Type_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_definition__Group__2_in_rule__Type_definition__Group__16319);
            rule__Type_definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__1"


    // $ANTLR start "rule__Type_definition__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3090:1: rule__Type_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Type_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3094:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3095:1: ( '=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3095:1: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3096:1: '='
            {
             before(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Type_definition__Group__1__Impl6347); 
             after(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3109:1: rule__Type_definition__Group__2 : rule__Type_definition__Group__2__Impl ;
    public final void rule__Type_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3113:1: ( rule__Type_definition__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3114:2: rule__Type_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type_definition__Group__2__Impl_in_rule__Type_definition__Group__26378);
            rule__Type_definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__2"


    // $ANTLR start "rule__Type_definition__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3120:1: rule__Type_definition__Group__2__Impl : ( ruletype ) ;
    public final void rule__Type_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3124:1: ( ( ruletype ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3125:1: ( ruletype )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3125:1: ( ruletype )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3126:1: ruletype
            {
             before(grammarAccess.getType_definitionAccess().getTypeParserRuleCall_2()); 
            pushFollow(FOLLOW_ruletype_in_rule__Type_definition__Group__2__Impl6405);
            ruletype();

            state._fsp--;

             after(grammarAccess.getType_definitionAccess().getTypeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3143:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3147:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3148:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration_part__Group__0__Impl_in_rule__Variable_declaration_part__Group__06440);
            rule__Variable_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration_part__Group__1_in_rule__Variable_declaration_part__Group__06443);
            rule__Variable_declaration_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__0"


    // $ANTLR start "rule__Variable_declaration_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3155:1: rule__Variable_declaration_part__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3159:1: ( ( 'var' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3160:1: ( 'var' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3160:1: ( 'var' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3161:1: 'var'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Variable_declaration_part__Group__0__Impl6471); 
             after(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3174:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3178:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3179:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration_part__Group__1__Impl_in_rule__Variable_declaration_part__Group__16502);
            rule__Variable_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration_part__Group__2_in_rule__Variable_declaration_part__Group__16505);
            rule__Variable_declaration_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__1"


    // $ANTLR start "rule__Variable_declaration_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3186:1: rule__Variable_declaration_part__Group__1__Impl : ( rulevariable_declaration ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3190:1: ( ( rulevariable_declaration ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3191:1: ( rulevariable_declaration )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3191:1: ( rulevariable_declaration )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3192:1: rulevariable_declaration
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationParserRuleCall_1()); 
            pushFollow(FOLLOW_rulevariable_declaration_in_rule__Variable_declaration_part__Group__1__Impl6532);
            rulevariable_declaration();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3203:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3207:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3208:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
            {
            pushFollow(FOLLOW_rule__Variable_declaration_part__Group__2__Impl_in_rule__Variable_declaration_part__Group__26561);
            rule__Variable_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration_part__Group__3_in_rule__Variable_declaration_part__Group__26564);
            rule__Variable_declaration_part__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__2"


    // $ANTLR start "rule__Variable_declaration_part__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3215:1: rule__Variable_declaration_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3219:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3220:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3220:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3221:1: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Variable_declaration_part__Group__2__Impl6592); 
             after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3234:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3238:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3239:2: rule__Variable_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration_part__Group__3__Impl_in_rule__Variable_declaration_part__Group__36623);
            rule__Variable_declaration_part__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__3"


    // $ANTLR start "rule__Variable_declaration_part__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3245:1: rule__Variable_declaration_part__Group__3__Impl : ( ( rule__Variable_declaration_part__Group_3__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3249:1: ( ( ( rule__Variable_declaration_part__Group_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3250:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3250:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3251:1: ( rule__Variable_declaration_part__Group_3__0 )*
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3252:1: ( rule__Variable_declaration_part__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_IDENTIFIER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3252:2: rule__Variable_declaration_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration_part__Group_3__0_in_rule__Variable_declaration_part__Group__3__Impl6650);
            	    rule__Variable_declaration_part__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__3__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3270:1: rule__Variable_declaration_part__Group_3__0 : rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 ;
    public final void rule__Variable_declaration_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3274:1: ( rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3275:2: rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration_part__Group_3__0__Impl_in_rule__Variable_declaration_part__Group_3__06689);
            rule__Variable_declaration_part__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration_part__Group_3__1_in_rule__Variable_declaration_part__Group_3__06692);
            rule__Variable_declaration_part__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_3__0"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3282:1: rule__Variable_declaration_part__Group_3__0__Impl : ( rulevariable_declaration ) ;
    public final void rule__Variable_declaration_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3286:1: ( ( rulevariable_declaration ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3287:1: ( rulevariable_declaration )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3287:1: ( rulevariable_declaration )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3288:1: rulevariable_declaration
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulevariable_declaration_in_rule__Variable_declaration_part__Group_3__0__Impl6719);
            rulevariable_declaration();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_3__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3299:1: rule__Variable_declaration_part__Group_3__1 : rule__Variable_declaration_part__Group_3__1__Impl ;
    public final void rule__Variable_declaration_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3303:1: ( rule__Variable_declaration_part__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3304:2: rule__Variable_declaration_part__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration_part__Group_3__1__Impl_in_rule__Variable_declaration_part__Group_3__16748);
            rule__Variable_declaration_part__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_3__1"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3310:1: rule__Variable_declaration_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3314:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3315:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3315:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3316:1: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            match(input,24,FOLLOW_24_in_rule__Variable_declaration_part__Group_3__1__Impl6776); 
             after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_3__1__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3333:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3337:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3338:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__06811);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__06814);
            rule__Variable_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__0"


    // $ANTLR start "rule__Variable_declaration__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3345:1: rule__Variable_declaration__Group__0__Impl : ( ruleidentifier_list ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3349:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3350:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3350:1: ( ruleidentifier_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3351:1: ruleidentifier_list
            {
             before(grammarAccess.getVariable_declarationAccess().getIdentifier_listParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Variable_declaration__Group__0__Impl6841);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getIdentifier_listParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3362:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3366:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3367:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__16870);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__16873);
            rule__Variable_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__1"


    // $ANTLR start "rule__Variable_declaration__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3374:1: rule__Variable_declaration__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3378:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3379:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3379:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3380:1: ':'
            {
             before(grammarAccess.getVariable_declarationAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Variable_declaration__Group__1__Impl6901); 
             after(grammarAccess.getVariable_declarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3393:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3397:1: ( rule__Variable_declaration__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3398:2: rule__Variable_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__26932);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__2"


    // $ANTLR start "rule__Variable_declaration__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3404:1: rule__Variable_declaration__Group__2__Impl : ( ruletype ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3408:1: ( ( ruletype ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3409:1: ( ruletype )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3409:1: ( ruletype )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3410:1: ruletype
            {
             before(grammarAccess.getVariable_declarationAccess().getTypeParserRuleCall_2()); 
            pushFollow(FOLLOW_ruletype_in_rule__Variable_declaration__Group__2__Impl6959);
            ruletype();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getTypeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__2__Impl"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3427:1: rule__Procedure_and_function_declaration_part__Group__0 : rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1 ;
    public final void rule__Procedure_and_function_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3431:1: ( rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3432:2: rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure_and_function_declaration_part__Group__0__Impl_in_rule__Procedure_and_function_declaration_part__Group__06994);
            rule__Procedure_and_function_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure_and_function_declaration_part__Group__1_in_rule__Procedure_and_function_declaration_part__Group__06997);
            rule__Procedure_and_function_declaration_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__0"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3439:1: rule__Procedure_and_function_declaration_part__Group__0__Impl : ( ( rule__Procedure_and_function_declaration_part__Alternatives_0 ) ) ;
    public final void rule__Procedure_and_function_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3443:1: ( ( ( rule__Procedure_and_function_declaration_part__Alternatives_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3444:1: ( ( rule__Procedure_and_function_declaration_part__Alternatives_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3444:1: ( ( rule__Procedure_and_function_declaration_part__Alternatives_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3445:1: ( rule__Procedure_and_function_declaration_part__Alternatives_0 )
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3446:1: ( rule__Procedure_and_function_declaration_part__Alternatives_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3446:2: rule__Procedure_and_function_declaration_part__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Procedure_and_function_declaration_part__Alternatives_0_in_rule__Procedure_and_function_declaration_part__Group__0__Impl7024);
            rule__Procedure_and_function_declaration_part__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3456:1: rule__Procedure_and_function_declaration_part__Group__1 : rule__Procedure_and_function_declaration_part__Group__1__Impl ;
    public final void rule__Procedure_and_function_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3460:1: ( rule__Procedure_and_function_declaration_part__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3461:2: rule__Procedure_and_function_declaration_part__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure_and_function_declaration_part__Group__1__Impl_in_rule__Procedure_and_function_declaration_part__Group__17054);
            rule__Procedure_and_function_declaration_part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__1"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3467:1: rule__Procedure_and_function_declaration_part__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_and_function_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3471:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3472:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3472:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3473:1: ';'
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Procedure_and_function_declaration_part__Group__1__Impl7082); 
             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Statement_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3490:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3494:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3495:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__07117);
            rule__Statement_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__07120);
            rule__Statement_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__0"


    // $ANTLR start "rule__Statement_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3502:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3506:1: ( ( 'begin' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3507:1: ( 'begin' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3507:1: ( 'begin' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3508:1: 'begin'
            {
             before(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Statement_part__Group__0__Impl7148); 
             after(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__0__Impl"


    // $ANTLR start "rule__Statement_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3521:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3525:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3526:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__17179);
            rule__Statement_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__17182);
            rule__Statement_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__1"


    // $ANTLR start "rule__Statement_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3533:1: rule__Statement_part__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3537:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3538:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3538:1: ( rulestatement_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3539:1: rulestatement_sequence
            {
             before(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl7209);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__1__Impl"


    // $ANTLR start "rule__Statement_part__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3550:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3554:1: ( rule__Statement_part__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3555:2: rule__Statement_part__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__27238);
            rule__Statement_part__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__2"


    // $ANTLR start "rule__Statement_part__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3561:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3565:1: ( ( 'end' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3566:1: ( 'end' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3566:1: ( 'end' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3567:1: 'end'
            {
             before(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Statement_part__Group__2__Impl7266); 
             after(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__2__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3586:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3590:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3591:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__07303);
            rule__Statement_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__07306);
            rule__Statement_sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group__0"


    // $ANTLR start "rule__Statement_sequence__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3598:1: rule__Statement_sequence__Group__0__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3602:1: ( ( rulestatement ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3603:1: ( rulestatement )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3603:1: ( rulestatement )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3604:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl7333);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3615:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3619:1: ( rule__Statement_sequence__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3620:2: rule__Statement_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__17362);
            rule__Statement_sequence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group__1"


    // $ANTLR start "rule__Statement_sequence__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3626:1: rule__Statement_sequence__Group__1__Impl : ( ( rulestatement )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3630:1: ( ( ( rulestatement )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3631:1: ( ( rulestatement )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3631:1: ( ( rulestatement )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3632:1: ( rulestatement )*
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3633:1: ( rulestatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3633:3: rulestatement
            	    {
            	    pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group__1__Impl7390);
            	    rulestatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3647:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3651:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3652:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__07425);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__07428);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3659:1: rule__Statement__Group__0__Impl : ( 'statement' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3663:1: ( ( 'statement' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3664:1: ( 'statement' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3664:1: ( 'statement' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3665:1: 'statement'
            {
             before(grammarAccess.getStatementAccess().getStatementKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Statement__Group__0__Impl7456); 
             after(grammarAccess.getStatementAccess().getStatementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3678:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3682:1: ( rule__Statement__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3683:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__17487);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3689:1: rule__Statement__Group__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3693:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3694:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3694:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3695:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Statement__Group__1__Impl7515); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Case_label_list__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3712:1: rule__Case_label_list__Group__0 : rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 ;
    public final void rule__Case_label_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3716:1: ( rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3717:2: rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group__0__Impl_in_rule__Case_label_list__Group__07550);
            rule__Case_label_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_label_list__Group__1_in_rule__Case_label_list__Group__07553);
            rule__Case_label_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group__0"


    // $ANTLR start "rule__Case_label_list__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3724:1: rule__Case_label_list__Group__0__Impl : ( ruleconstant ) ;
    public final void rule__Case_label_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3728:1: ( ( ruleconstant ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3729:1: ( ruleconstant )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3729:1: ( ruleconstant )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3730:1: ruleconstant
            {
             before(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleconstant_in_rule__Case_label_list__Group__0__Impl7580);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group__0__Impl"


    // $ANTLR start "rule__Case_label_list__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3741:1: rule__Case_label_list__Group__1 : rule__Case_label_list__Group__1__Impl ;
    public final void rule__Case_label_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3745:1: ( rule__Case_label_list__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3746:2: rule__Case_label_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group__1__Impl_in_rule__Case_label_list__Group__17609);
            rule__Case_label_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group__1"


    // $ANTLR start "rule__Case_label_list__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3752:1: rule__Case_label_list__Group__1__Impl : ( ( rule__Case_label_list__Group_1__0 )* ) ;
    public final void rule__Case_label_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3756:1: ( ( ( rule__Case_label_list__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3757:1: ( ( rule__Case_label_list__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3757:1: ( ( rule__Case_label_list__Group_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3758:1: ( rule__Case_label_list__Group_1__0 )*
            {
             before(grammarAccess.getCase_label_listAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3759:1: ( rule__Case_label_list__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3759:2: rule__Case_label_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Case_label_list__Group_1__0_in_rule__Case_label_list__Group__1__Impl7636);
            	    rule__Case_label_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCase_label_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group__1__Impl"


    // $ANTLR start "rule__Case_label_list__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3773:1: rule__Case_label_list__Group_1__0 : rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 ;
    public final void rule__Case_label_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3777:1: ( rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3778:2: rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group_1__0__Impl_in_rule__Case_label_list__Group_1__07671);
            rule__Case_label_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_label_list__Group_1__1_in_rule__Case_label_list__Group_1__07674);
            rule__Case_label_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group_1__0"


    // $ANTLR start "rule__Case_label_list__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3785:1: rule__Case_label_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Case_label_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3789:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3790:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3790:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3791:1: ','
            {
             before(grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Case_label_list__Group_1__0__Impl7702); 
             after(grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group_1__0__Impl"


    // $ANTLR start "rule__Case_label_list__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3804:1: rule__Case_label_list__Group_1__1 : rule__Case_label_list__Group_1__1__Impl ;
    public final void rule__Case_label_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3808:1: ( rule__Case_label_list__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3809:2: rule__Case_label_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group_1__1__Impl_in_rule__Case_label_list__Group_1__17733);
            rule__Case_label_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group_1__1"


    // $ANTLR start "rule__Case_label_list__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3815:1: rule__Case_label_list__Group_1__1__Impl : ( ruleconstant ) ;
    public final void rule__Case_label_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3819:1: ( ( ruleconstant ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3820:1: ( ruleconstant )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3820:1: ( ruleconstant )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3821:1: ruleconstant
            {
             before(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleconstant_in_rule__Case_label_list__Group_1__1__Impl7760);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group_1__1__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3836:1: rule__Enumerated_type__Group__0 : rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 ;
    public final void rule__Enumerated_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3840:1: ( rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3841:2: rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1
            {
            pushFollow(FOLLOW_rule__Enumerated_type__Group__0__Impl_in_rule__Enumerated_type__Group__07793);
            rule__Enumerated_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumerated_type__Group__1_in_rule__Enumerated_type__Group__07796);
            rule__Enumerated_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__0"


    // $ANTLR start "rule__Enumerated_type__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3848:1: rule__Enumerated_type__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3852:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3853:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3853:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3854:1: '('
            {
             before(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Enumerated_type__Group__0__Impl7824); 
             after(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__0__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3867:1: rule__Enumerated_type__Group__1 : rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 ;
    public final void rule__Enumerated_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3871:1: ( rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3872:2: rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2
            {
            pushFollow(FOLLOW_rule__Enumerated_type__Group__1__Impl_in_rule__Enumerated_type__Group__17855);
            rule__Enumerated_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumerated_type__Group__2_in_rule__Enumerated_type__Group__17858);
            rule__Enumerated_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__1"


    // $ANTLR start "rule__Enumerated_type__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3879:1: rule__Enumerated_type__Group__1__Impl : ( ruleidentifier_list ) ;
    public final void rule__Enumerated_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3883:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3884:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3884:1: ( ruleidentifier_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3885:1: ruleidentifier_list
            {
             before(grammarAccess.getEnumerated_typeAccess().getIdentifier_listParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Enumerated_type__Group__1__Impl7885);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getEnumerated_typeAccess().getIdentifier_listParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__1__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3896:1: rule__Enumerated_type__Group__2 : rule__Enumerated_type__Group__2__Impl ;
    public final void rule__Enumerated_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3900:1: ( rule__Enumerated_type__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3901:2: rule__Enumerated_type__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Enumerated_type__Group__2__Impl_in_rule__Enumerated_type__Group__27914);
            rule__Enumerated_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__2"


    // $ANTLR start "rule__Enumerated_type__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3907:1: rule__Enumerated_type__Group__2__Impl : ( ')' ) ;
    public final void rule__Enumerated_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3911:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3912:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3912:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3913:1: ')'
            {
             before(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Enumerated_type__Group__2__Impl7942); 
             after(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__2__Impl"


    // $ANTLR start "rule__Subrange_type__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3932:1: rule__Subrange_type__Group__0 : rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1 ;
    public final void rule__Subrange_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3936:1: ( rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3937:2: rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1
            {
            pushFollow(FOLLOW_rule__Subrange_type__Group__0__Impl_in_rule__Subrange_type__Group__07979);
            rule__Subrange_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subrange_type__Group__1_in_rule__Subrange_type__Group__07982);
            rule__Subrange_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__0"


    // $ANTLR start "rule__Subrange_type__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3944:1: rule__Subrange_type__Group__0__Impl : ( rulelower_bound ) ;
    public final void rule__Subrange_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3948:1: ( ( rulelower_bound ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3949:1: ( rulelower_bound )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3949:1: ( rulelower_bound )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3950:1: rulelower_bound
            {
             before(grammarAccess.getSubrange_typeAccess().getLower_boundParserRuleCall_0()); 
            pushFollow(FOLLOW_rulelower_bound_in_rule__Subrange_type__Group__0__Impl8009);
            rulelower_bound();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getLower_boundParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__0__Impl"


    // $ANTLR start "rule__Subrange_type__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3961:1: rule__Subrange_type__Group__1 : rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2 ;
    public final void rule__Subrange_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3965:1: ( rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3966:2: rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2
            {
            pushFollow(FOLLOW_rule__Subrange_type__Group__1__Impl_in_rule__Subrange_type__Group__18038);
            rule__Subrange_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subrange_type__Group__2_in_rule__Subrange_type__Group__18041);
            rule__Subrange_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__1"


    // $ANTLR start "rule__Subrange_type__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3973:1: rule__Subrange_type__Group__1__Impl : ( '..' ) ;
    public final void rule__Subrange_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3977:1: ( ( '..' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3978:1: ( '..' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3978:1: ( '..' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3979:1: '..'
            {
             before(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Subrange_type__Group__1__Impl8069); 
             after(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__1__Impl"


    // $ANTLR start "rule__Subrange_type__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3992:1: rule__Subrange_type__Group__2 : rule__Subrange_type__Group__2__Impl ;
    public final void rule__Subrange_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3996:1: ( rule__Subrange_type__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:3997:2: rule__Subrange_type__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Subrange_type__Group__2__Impl_in_rule__Subrange_type__Group__28100);
            rule__Subrange_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__2"


    // $ANTLR start "rule__Subrange_type__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4003:1: rule__Subrange_type__Group__2__Impl : ( ruleupper_bound ) ;
    public final void rule__Subrange_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4007:1: ( ( ruleupper_bound ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4008:1: ( ruleupper_bound )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4008:1: ( ruleupper_bound )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4009:1: ruleupper_bound
            {
             before(grammarAccess.getSubrange_typeAccess().getUpper_boundParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleupper_bound_in_rule__Subrange_type__Group__2__Impl8127);
            ruleupper_bound();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getUpper_boundParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__2__Impl"


    // $ANTLR start "rule__Structured_type__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4026:1: rule__Structured_type__Group__0 : rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 ;
    public final void rule__Structured_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4030:1: ( rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4031:2: rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1
            {
            pushFollow(FOLLOW_rule__Structured_type__Group__0__Impl_in_rule__Structured_type__Group__08162);
            rule__Structured_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structured_type__Group__1_in_rule__Structured_type__Group__08165);
            rule__Structured_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__0"


    // $ANTLR start "rule__Structured_type__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4038:1: rule__Structured_type__Group__0__Impl : ( ( 'packed' )? ) ;
    public final void rule__Structured_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4042:1: ( ( ( 'packed' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4043:1: ( ( 'packed' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4043:1: ( ( 'packed' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4044:1: ( 'packed' )?
            {
             before(grammarAccess.getStructured_typeAccess().getPackedKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4045:1: ( 'packed' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4046:2: 'packed'
                    {
                    match(input,38,FOLLOW_38_in_rule__Structured_type__Group__0__Impl8194); 

                    }
                    break;

            }

             after(grammarAccess.getStructured_typeAccess().getPackedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__0__Impl"


    // $ANTLR start "rule__Structured_type__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4057:1: rule__Structured_type__Group__1 : rule__Structured_type__Group__1__Impl ;
    public final void rule__Structured_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4061:1: ( rule__Structured_type__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4062:2: rule__Structured_type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Structured_type__Group__1__Impl_in_rule__Structured_type__Group__18227);
            rule__Structured_type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__1"


    // $ANTLR start "rule__Structured_type__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4068:1: rule__Structured_type__Group__1__Impl : ( ruleunpacked_structured_type ) ;
    public final void rule__Structured_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4072:1: ( ( ruleunpacked_structured_type ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4073:1: ( ruleunpacked_structured_type )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4073:1: ( ruleunpacked_structured_type )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4074:1: ruleunpacked_structured_type
            {
             before(grammarAccess.getStructured_typeAccess().getUnpacked_structured_typeParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rule__Structured_type__Group__1__Impl8254);
            ruleunpacked_structured_type();

            state._fsp--;

             after(grammarAccess.getStructured_typeAccess().getUnpacked_structured_typeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__1__Impl"


    // $ANTLR start "rule__Array_type__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4089:1: rule__Array_type__Group__0 : rule__Array_type__Group__0__Impl rule__Array_type__Group__1 ;
    public final void rule__Array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4093:1: ( rule__Array_type__Group__0__Impl rule__Array_type__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4094:2: rule__Array_type__Group__0__Impl rule__Array_type__Group__1
            {
            pushFollow(FOLLOW_rule__Array_type__Group__0__Impl_in_rule__Array_type__Group__08287);
            rule__Array_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array_type__Group__1_in_rule__Array_type__Group__08290);
            rule__Array_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__0"


    // $ANTLR start "rule__Array_type__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4101:1: rule__Array_type__Group__0__Impl : ( 'array' ) ;
    public final void rule__Array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4105:1: ( ( 'array' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4106:1: ( 'array' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4106:1: ( 'array' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4107:1: 'array'
            {
             before(grammarAccess.getArray_typeAccess().getArrayKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Array_type__Group__0__Impl8318); 
             after(grammarAccess.getArray_typeAccess().getArrayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__0__Impl"


    // $ANTLR start "rule__Array_type__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4120:1: rule__Array_type__Group__1 : rule__Array_type__Group__1__Impl rule__Array_type__Group__2 ;
    public final void rule__Array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4124:1: ( rule__Array_type__Group__1__Impl rule__Array_type__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4125:2: rule__Array_type__Group__1__Impl rule__Array_type__Group__2
            {
            pushFollow(FOLLOW_rule__Array_type__Group__1__Impl_in_rule__Array_type__Group__18349);
            rule__Array_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array_type__Group__2_in_rule__Array_type__Group__18352);
            rule__Array_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__1"


    // $ANTLR start "rule__Array_type__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4132:1: rule__Array_type__Group__1__Impl : ( '[ ' ) ;
    public final void rule__Array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4136:1: ( ( '[ ' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4137:1: ( '[ ' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4137:1: ( '[ ' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4138:1: '[ '
            {
             before(grammarAccess.getArray_typeAccess().getLeftSquareBracketSpaceKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Array_type__Group__1__Impl8380); 
             after(grammarAccess.getArray_typeAccess().getLeftSquareBracketSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__1__Impl"


    // $ANTLR start "rule__Array_type__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4151:1: rule__Array_type__Group__2 : rule__Array_type__Group__2__Impl rule__Array_type__Group__3 ;
    public final void rule__Array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4155:1: ( rule__Array_type__Group__2__Impl rule__Array_type__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4156:2: rule__Array_type__Group__2__Impl rule__Array_type__Group__3
            {
            pushFollow(FOLLOW_rule__Array_type__Group__2__Impl_in_rule__Array_type__Group__28411);
            rule__Array_type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array_type__Group__3_in_rule__Array_type__Group__28414);
            rule__Array_type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__2"


    // $ANTLR start "rule__Array_type__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4163:1: rule__Array_type__Group__2__Impl : ( ruleindex_type ) ;
    public final void rule__Array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4167:1: ( ( ruleindex_type ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4168:1: ( ruleindex_type )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4168:1: ( ruleindex_type )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4169:1: ruleindex_type
            {
             before(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleindex_type_in_rule__Array_type__Group__2__Impl8441);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__2__Impl"


    // $ANTLR start "rule__Array_type__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4180:1: rule__Array_type__Group__3 : rule__Array_type__Group__3__Impl rule__Array_type__Group__4 ;
    public final void rule__Array_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4184:1: ( rule__Array_type__Group__3__Impl rule__Array_type__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4185:2: rule__Array_type__Group__3__Impl rule__Array_type__Group__4
            {
            pushFollow(FOLLOW_rule__Array_type__Group__3__Impl_in_rule__Array_type__Group__38470);
            rule__Array_type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array_type__Group__4_in_rule__Array_type__Group__38473);
            rule__Array_type__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__3"


    // $ANTLR start "rule__Array_type__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4192:1: rule__Array_type__Group__3__Impl : ( ( rule__Array_type__Group_3__0 )* ) ;
    public final void rule__Array_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4196:1: ( ( ( rule__Array_type__Group_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4197:1: ( ( rule__Array_type__Group_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4197:1: ( ( rule__Array_type__Group_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4198:1: ( rule__Array_type__Group_3__0 )*
            {
             before(grammarAccess.getArray_typeAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4199:1: ( rule__Array_type__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4199:2: rule__Array_type__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Array_type__Group_3__0_in_rule__Array_type__Group__3__Impl8500);
            	    rule__Array_type__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getArray_typeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__3__Impl"


    // $ANTLR start "rule__Array_type__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4209:1: rule__Array_type__Group__4 : rule__Array_type__Group__4__Impl rule__Array_type__Group__5 ;
    public final void rule__Array_type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4213:1: ( rule__Array_type__Group__4__Impl rule__Array_type__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4214:2: rule__Array_type__Group__4__Impl rule__Array_type__Group__5
            {
            pushFollow(FOLLOW_rule__Array_type__Group__4__Impl_in_rule__Array_type__Group__48531);
            rule__Array_type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array_type__Group__5_in_rule__Array_type__Group__48534);
            rule__Array_type__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__4"


    // $ANTLR start "rule__Array_type__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4221:1: rule__Array_type__Group__4__Impl : ( ' ]' ) ;
    public final void rule__Array_type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4225:1: ( ( ' ]' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4226:1: ( ' ]' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4226:1: ( ' ]' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4227:1: ' ]'
            {
             before(grammarAccess.getArray_typeAccess().getSpaceRightSquareBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__Array_type__Group__4__Impl8562); 
             after(grammarAccess.getArray_typeAccess().getSpaceRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__4__Impl"


    // $ANTLR start "rule__Array_type__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4240:1: rule__Array_type__Group__5 : rule__Array_type__Group__5__Impl rule__Array_type__Group__6 ;
    public final void rule__Array_type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4244:1: ( rule__Array_type__Group__5__Impl rule__Array_type__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4245:2: rule__Array_type__Group__5__Impl rule__Array_type__Group__6
            {
            pushFollow(FOLLOW_rule__Array_type__Group__5__Impl_in_rule__Array_type__Group__58593);
            rule__Array_type__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array_type__Group__6_in_rule__Array_type__Group__58596);
            rule__Array_type__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__5"


    // $ANTLR start "rule__Array_type__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4252:1: rule__Array_type__Group__5__Impl : ( 'of' ) ;
    public final void rule__Array_type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4256:1: ( ( 'of' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4257:1: ( 'of' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4257:1: ( 'of' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4258:1: 'of'
            {
             before(grammarAccess.getArray_typeAccess().getOfKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__Array_type__Group__5__Impl8624); 
             after(grammarAccess.getArray_typeAccess().getOfKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__5__Impl"


    // $ANTLR start "rule__Array_type__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4271:1: rule__Array_type__Group__6 : rule__Array_type__Group__6__Impl ;
    public final void rule__Array_type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4275:1: ( rule__Array_type__Group__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4276:2: rule__Array_type__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Array_type__Group__6__Impl_in_rule__Array_type__Group__68655);
            rule__Array_type__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__6"


    // $ANTLR start "rule__Array_type__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4282:1: rule__Array_type__Group__6__Impl : ( ruleelement_type ) ;
    public final void rule__Array_type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4286:1: ( ( ruleelement_type ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4287:1: ( ruleelement_type )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4287:1: ( ruleelement_type )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4288:1: ruleelement_type
            {
             before(grammarAccess.getArray_typeAccess().getElement_typeParserRuleCall_6()); 
            pushFollow(FOLLOW_ruleelement_type_in_rule__Array_type__Group__6__Impl8682);
            ruleelement_type();

            state._fsp--;

             after(grammarAccess.getArray_typeAccess().getElement_typeParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__6__Impl"


    // $ANTLR start "rule__Array_type__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4313:1: rule__Array_type__Group_3__0 : rule__Array_type__Group_3__0__Impl rule__Array_type__Group_3__1 ;
    public final void rule__Array_type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4317:1: ( rule__Array_type__Group_3__0__Impl rule__Array_type__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4318:2: rule__Array_type__Group_3__0__Impl rule__Array_type__Group_3__1
            {
            pushFollow(FOLLOW_rule__Array_type__Group_3__0__Impl_in_rule__Array_type__Group_3__08725);
            rule__Array_type__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array_type__Group_3__1_in_rule__Array_type__Group_3__08728);
            rule__Array_type__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group_3__0"


    // $ANTLR start "rule__Array_type__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4325:1: rule__Array_type__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Array_type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4329:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4330:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4330:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4331:1: ','
            {
             before(grammarAccess.getArray_typeAccess().getCommaKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Array_type__Group_3__0__Impl8756); 
             after(grammarAccess.getArray_typeAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group_3__0__Impl"


    // $ANTLR start "rule__Array_type__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4344:1: rule__Array_type__Group_3__1 : rule__Array_type__Group_3__1__Impl ;
    public final void rule__Array_type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4348:1: ( rule__Array_type__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4349:2: rule__Array_type__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Array_type__Group_3__1__Impl_in_rule__Array_type__Group_3__18787);
            rule__Array_type__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group_3__1"


    // $ANTLR start "rule__Array_type__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4355:1: rule__Array_type__Group_3__1__Impl : ( ruleindex_type ) ;
    public final void rule__Array_type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4359:1: ( ( ruleindex_type ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4360:1: ( ruleindex_type )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4360:1: ( ruleindex_type )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4361:1: ruleindex_type
            {
             before(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleindex_type_in_rule__Array_type__Group_3__1__Impl8814);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group_3__1__Impl"


    // $ANTLR start "rule__Record_type__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4376:1: rule__Record_type__Group__0 : rule__Record_type__Group__0__Impl rule__Record_type__Group__1 ;
    public final void rule__Record_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4380:1: ( rule__Record_type__Group__0__Impl rule__Record_type__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4381:2: rule__Record_type__Group__0__Impl rule__Record_type__Group__1
            {
            pushFollow(FOLLOW_rule__Record_type__Group__0__Impl_in_rule__Record_type__Group__08847);
            rule__Record_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record_type__Group__1_in_rule__Record_type__Group__08850);
            rule__Record_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__0"


    // $ANTLR start "rule__Record_type__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4388:1: rule__Record_type__Group__0__Impl : ( 'record' ) ;
    public final void rule__Record_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4392:1: ( ( 'record' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4393:1: ( 'record' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4393:1: ( 'record' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4394:1: 'record'
            {
             before(grammarAccess.getRecord_typeAccess().getRecordKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Record_type__Group__0__Impl8878); 
             after(grammarAccess.getRecord_typeAccess().getRecordKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__0__Impl"


    // $ANTLR start "rule__Record_type__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4407:1: rule__Record_type__Group__1 : rule__Record_type__Group__1__Impl rule__Record_type__Group__2 ;
    public final void rule__Record_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4411:1: ( rule__Record_type__Group__1__Impl rule__Record_type__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4412:2: rule__Record_type__Group__1__Impl rule__Record_type__Group__2
            {
            pushFollow(FOLLOW_rule__Record_type__Group__1__Impl_in_rule__Record_type__Group__18909);
            rule__Record_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record_type__Group__2_in_rule__Record_type__Group__18912);
            rule__Record_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__1"


    // $ANTLR start "rule__Record_type__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4419:1: rule__Record_type__Group__1__Impl : ( rulefield_list ) ;
    public final void rule__Record_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4423:1: ( ( rulefield_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4424:1: ( rulefield_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4424:1: ( rulefield_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4425:1: rulefield_list
            {
             before(grammarAccess.getRecord_typeAccess().getField_listParserRuleCall_1()); 
            pushFollow(FOLLOW_rulefield_list_in_rule__Record_type__Group__1__Impl8939);
            rulefield_list();

            state._fsp--;

             after(grammarAccess.getRecord_typeAccess().getField_listParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__1__Impl"


    // $ANTLR start "rule__Record_type__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4436:1: rule__Record_type__Group__2 : rule__Record_type__Group__2__Impl ;
    public final void rule__Record_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4440:1: ( rule__Record_type__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4441:2: rule__Record_type__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Record_type__Group__2__Impl_in_rule__Record_type__Group__28968);
            rule__Record_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__2"


    // $ANTLR start "rule__Record_type__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4447:1: rule__Record_type__Group__2__Impl : ( 'end' ) ;
    public final void rule__Record_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4451:1: ( ( 'end' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4452:1: ( 'end' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4452:1: ( 'end' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4453:1: 'end'
            {
             before(grammarAccess.getRecord_typeAccess().getEndKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Record_type__Group__2__Impl8996); 
             after(grammarAccess.getRecord_typeAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__2__Impl"


    // $ANTLR start "rule__Set_type__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4472:1: rule__Set_type__Group__0 : rule__Set_type__Group__0__Impl rule__Set_type__Group__1 ;
    public final void rule__Set_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4476:1: ( rule__Set_type__Group__0__Impl rule__Set_type__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4477:2: rule__Set_type__Group__0__Impl rule__Set_type__Group__1
            {
            pushFollow(FOLLOW_rule__Set_type__Group__0__Impl_in_rule__Set_type__Group__09033);
            rule__Set_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set_type__Group__1_in_rule__Set_type__Group__09036);
            rule__Set_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__0"


    // $ANTLR start "rule__Set_type__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4484:1: rule__Set_type__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4488:1: ( ( 'set' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4489:1: ( 'set' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4489:1: ( 'set' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4490:1: 'set'
            {
             before(grammarAccess.getSet_typeAccess().getSetKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Set_type__Group__0__Impl9064); 
             after(grammarAccess.getSet_typeAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__0__Impl"


    // $ANTLR start "rule__Set_type__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4503:1: rule__Set_type__Group__1 : rule__Set_type__Group__1__Impl rule__Set_type__Group__2 ;
    public final void rule__Set_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4507:1: ( rule__Set_type__Group__1__Impl rule__Set_type__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4508:2: rule__Set_type__Group__1__Impl rule__Set_type__Group__2
            {
            pushFollow(FOLLOW_rule__Set_type__Group__1__Impl_in_rule__Set_type__Group__19095);
            rule__Set_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set_type__Group__2_in_rule__Set_type__Group__19098);
            rule__Set_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__1"


    // $ANTLR start "rule__Set_type__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4515:1: rule__Set_type__Group__1__Impl : ( 'of' ) ;
    public final void rule__Set_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4519:1: ( ( 'of' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4520:1: ( 'of' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4520:1: ( 'of' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4521:1: 'of'
            {
             before(grammarAccess.getSet_typeAccess().getOfKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__Set_type__Group__1__Impl9126); 
             after(grammarAccess.getSet_typeAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__1__Impl"


    // $ANTLR start "rule__Set_type__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4534:1: rule__Set_type__Group__2 : rule__Set_type__Group__2__Impl ;
    public final void rule__Set_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4538:1: ( rule__Set_type__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4539:2: rule__Set_type__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Set_type__Group__2__Impl_in_rule__Set_type__Group__29157);
            rule__Set_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__2"


    // $ANTLR start "rule__Set_type__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4545:1: rule__Set_type__Group__2__Impl : ( rulebase_type ) ;
    public final void rule__Set_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4549:1: ( ( rulebase_type ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4550:1: ( rulebase_type )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4550:1: ( rulebase_type )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4551:1: rulebase_type
            {
             before(grammarAccess.getSet_typeAccess().getBase_typeParserRuleCall_2()); 
            pushFollow(FOLLOW_rulebase_type_in_rule__Set_type__Group__2__Impl9184);
            rulebase_type();

            state._fsp--;

             after(grammarAccess.getSet_typeAccess().getBase_typeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__2__Impl"


    // $ANTLR start "rule__File_type__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4568:1: rule__File_type__Group__0 : rule__File_type__Group__0__Impl rule__File_type__Group__1 ;
    public final void rule__File_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4572:1: ( rule__File_type__Group__0__Impl rule__File_type__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4573:2: rule__File_type__Group__0__Impl rule__File_type__Group__1
            {
            pushFollow(FOLLOW_rule__File_type__Group__0__Impl_in_rule__File_type__Group__09219);
            rule__File_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File_type__Group__1_in_rule__File_type__Group__09222);
            rule__File_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File_type__Group__0"


    // $ANTLR start "rule__File_type__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4580:1: rule__File_type__Group__0__Impl : ( 'file' ) ;
    public final void rule__File_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4584:1: ( ( 'file' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4585:1: ( 'file' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4585:1: ( 'file' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4586:1: 'file'
            {
             before(grammarAccess.getFile_typeAccess().getFileKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__File_type__Group__0__Impl9250); 
             after(grammarAccess.getFile_typeAccess().getFileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File_type__Group__0__Impl"


    // $ANTLR start "rule__File_type__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4599:1: rule__File_type__Group__1 : rule__File_type__Group__1__Impl rule__File_type__Group__2 ;
    public final void rule__File_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4603:1: ( rule__File_type__Group__1__Impl rule__File_type__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4604:2: rule__File_type__Group__1__Impl rule__File_type__Group__2
            {
            pushFollow(FOLLOW_rule__File_type__Group__1__Impl_in_rule__File_type__Group__19281);
            rule__File_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File_type__Group__2_in_rule__File_type__Group__19284);
            rule__File_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File_type__Group__1"


    // $ANTLR start "rule__File_type__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4611:1: rule__File_type__Group__1__Impl : ( 'of' ) ;
    public final void rule__File_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4615:1: ( ( 'of' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4616:1: ( 'of' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4616:1: ( 'of' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4617:1: 'of'
            {
             before(grammarAccess.getFile_typeAccess().getOfKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__File_type__Group__1__Impl9312); 
             after(grammarAccess.getFile_typeAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File_type__Group__1__Impl"


    // $ANTLR start "rule__File_type__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4630:1: rule__File_type__Group__2 : rule__File_type__Group__2__Impl ;
    public final void rule__File_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4634:1: ( rule__File_type__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4635:2: rule__File_type__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__File_type__Group__2__Impl_in_rule__File_type__Group__29343);
            rule__File_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File_type__Group__2"


    // $ANTLR start "rule__File_type__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4641:1: rule__File_type__Group__2__Impl : ( rulefile_component_type ) ;
    public final void rule__File_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4645:1: ( ( rulefile_component_type ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4646:1: ( rulefile_component_type )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4646:1: ( rulefile_component_type )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4647:1: rulefile_component_type
            {
             before(grammarAccess.getFile_typeAccess().getFile_component_typeParserRuleCall_2()); 
            pushFollow(FOLLOW_rulefile_component_type_in_rule__File_type__Group__2__Impl9370);
            rulefile_component_type();

            state._fsp--;

             after(grammarAccess.getFile_typeAccess().getFile_component_typeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File_type__Group__2__Impl"


    // $ANTLR start "rule__Pointer_type__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4664:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4668:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4669:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
            {
            pushFollow(FOLLOW_rule__Pointer_type__Group__0__Impl_in_rule__Pointer_type__Group__09405);
            rule__Pointer_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pointer_type__Group__1_in_rule__Pointer_type__Group__09408);
            rule__Pointer_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__Group__0"


    // $ANTLR start "rule__Pointer_type__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4676:1: rule__Pointer_type__Group__0__Impl : ( '^' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4680:1: ( ( '^' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4681:1: ( '^' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4681:1: ( '^' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4682:1: '^'
            {
             before(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Pointer_type__Group__0__Impl9436); 
             after(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__Group__0__Impl"


    // $ANTLR start "rule__Pointer_type__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4695:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4699:1: ( rule__Pointer_type__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4700:2: rule__Pointer_type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Pointer_type__Group__1__Impl_in_rule__Pointer_type__Group__19467);
            rule__Pointer_type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__Group__1"


    // $ANTLR start "rule__Pointer_type__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4706:1: rule__Pointer_type__Group__1__Impl : ( ruletype_identifier ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4710:1: ( ( ruletype_identifier ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4711:1: ( ruletype_identifier )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4711:1: ( ruletype_identifier )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4712:1: ruletype_identifier
            {
             before(grammarAccess.getPointer_typeAccess().getType_identifierParserRuleCall_1()); 
            pushFollow(FOLLOW_ruletype_identifier_in_rule__Pointer_type__Group__1__Impl9494);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getPointer_typeAccess().getType_identifierParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__Group__1__Impl"


    // $ANTLR start "rule__Field_list__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4727:1: rule__Field_list__Group__0 : rule__Field_list__Group__0__Impl rule__Field_list__Group__1 ;
    public final void rule__Field_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4731:1: ( rule__Field_list__Group__0__Impl rule__Field_list__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4732:2: rule__Field_list__Group__0__Impl rule__Field_list__Group__1
            {
            pushFollow(FOLLOW_rule__Field_list__Group__0__Impl_in_rule__Field_list__Group__09527);
            rule__Field_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field_list__Group__1_in_rule__Field_list__Group__09530);
            rule__Field_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group__0"


    // $ANTLR start "rule__Field_list__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4739:1: rule__Field_list__Group__0__Impl : ( ( rule__Field_list__Alternatives_0 ) ) ;
    public final void rule__Field_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4743:1: ( ( ( rule__Field_list__Alternatives_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4744:1: ( ( rule__Field_list__Alternatives_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4744:1: ( ( rule__Field_list__Alternatives_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4745:1: ( rule__Field_list__Alternatives_0 )
            {
             before(grammarAccess.getField_listAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4746:1: ( rule__Field_list__Alternatives_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4746:2: rule__Field_list__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Field_list__Alternatives_0_in_rule__Field_list__Group__0__Impl9557);
            rule__Field_list__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getField_listAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group__0__Impl"


    // $ANTLR start "rule__Field_list__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4756:1: rule__Field_list__Group__1 : rule__Field_list__Group__1__Impl ;
    public final void rule__Field_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4760:1: ( rule__Field_list__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4761:2: rule__Field_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_list__Group__1__Impl_in_rule__Field_list__Group__19587);
            rule__Field_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group__1"


    // $ANTLR start "rule__Field_list__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4767:1: rule__Field_list__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Field_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4771:1: ( ( ( ';' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4772:1: ( ( ';' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4772:1: ( ( ';' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4773:1: ( ';' )?
            {
             before(grammarAccess.getField_listAccess().getSemicolonKeyword_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4774:1: ( ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4775:2: ';'
                    {
                    match(input,24,FOLLOW_24_in_rule__Field_list__Group__1__Impl9616); 

                    }
                    break;

            }

             after(grammarAccess.getField_listAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group__1__Impl"


    // $ANTLR start "rule__Field_list__Group_0_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4790:1: rule__Field_list__Group_0_0__0 : rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1 ;
    public final void rule__Field_list__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4794:1: ( rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4795:2: rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Field_list__Group_0_0__0__Impl_in_rule__Field_list__Group_0_0__09653);
            rule__Field_list__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field_list__Group_0_0__1_in_rule__Field_list__Group_0_0__09656);
            rule__Field_list__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0__0"


    // $ANTLR start "rule__Field_list__Group_0_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4802:1: rule__Field_list__Group_0_0__0__Impl : ( rulefixed_part ) ;
    public final void rule__Field_list__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4806:1: ( ( rulefixed_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4807:1: ( rulefixed_part )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4807:1: ( rulefixed_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4808:1: rulefixed_part
            {
             before(grammarAccess.getField_listAccess().getFixed_partParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_rulefixed_part_in_rule__Field_list__Group_0_0__0__Impl9683);
            rulefixed_part();

            state._fsp--;

             after(grammarAccess.getField_listAccess().getFixed_partParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0__0__Impl"


    // $ANTLR start "rule__Field_list__Group_0_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4819:1: rule__Field_list__Group_0_0__1 : rule__Field_list__Group_0_0__1__Impl ;
    public final void rule__Field_list__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4823:1: ( rule__Field_list__Group_0_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4824:2: rule__Field_list__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_list__Group_0_0__1__Impl_in_rule__Field_list__Group_0_0__19712);
            rule__Field_list__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0__1"


    // $ANTLR start "rule__Field_list__Group_0_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4830:1: rule__Field_list__Group_0_0__1__Impl : ( ( rule__Field_list__Group_0_0_1__0 )? ) ;
    public final void rule__Field_list__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4834:1: ( ( ( rule__Field_list__Group_0_0_1__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4835:1: ( ( rule__Field_list__Group_0_0_1__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4835:1: ( ( rule__Field_list__Group_0_0_1__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4836:1: ( rule__Field_list__Group_0_0_1__0 )?
            {
             before(grammarAccess.getField_listAccess().getGroup_0_0_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4837:1: ( rule__Field_list__Group_0_0_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==47) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4837:2: rule__Field_list__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Field_list__Group_0_0_1__0_in_rule__Field_list__Group_0_0__1__Impl9739);
                    rule__Field_list__Group_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getField_listAccess().getGroup_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0__1__Impl"


    // $ANTLR start "rule__Field_list__Group_0_0_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4851:1: rule__Field_list__Group_0_0_1__0 : rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1 ;
    public final void rule__Field_list__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4855:1: ( rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4856:2: rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1
            {
            pushFollow(FOLLOW_rule__Field_list__Group_0_0_1__0__Impl_in_rule__Field_list__Group_0_0_1__09774);
            rule__Field_list__Group_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field_list__Group_0_0_1__1_in_rule__Field_list__Group_0_0_1__09777);
            rule__Field_list__Group_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0_1__0"


    // $ANTLR start "rule__Field_list__Group_0_0_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4863:1: rule__Field_list__Group_0_0_1__0__Impl : ( ';' ) ;
    public final void rule__Field_list__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4867:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4868:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4868:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4869:1: ';'
            {
             before(grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Field_list__Group_0_0_1__0__Impl9805); 
             after(grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__Field_list__Group_0_0_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4882:1: rule__Field_list__Group_0_0_1__1 : rule__Field_list__Group_0_0_1__1__Impl ;
    public final void rule__Field_list__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4886:1: ( rule__Field_list__Group_0_0_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4887:2: rule__Field_list__Group_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_list__Group_0_0_1__1__Impl_in_rule__Field_list__Group_0_0_1__19836);
            rule__Field_list__Group_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0_1__1"


    // $ANTLR start "rule__Field_list__Group_0_0_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4893:1: rule__Field_list__Group_0_0_1__1__Impl : ( rulevariant_part ) ;
    public final void rule__Field_list__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4897:1: ( ( rulevariant_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4898:1: ( rulevariant_part )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4898:1: ( rulevariant_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4899:1: rulevariant_part
            {
             before(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_0_1_1()); 
            pushFollow(FOLLOW_rulevariant_part_in_rule__Field_list__Group_0_0_1__1__Impl9863);
            rulevariant_part();

            state._fsp--;

             after(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__Fixed_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4914:1: rule__Fixed_part__Group__0 : rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1 ;
    public final void rule__Fixed_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4918:1: ( rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4919:2: rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1
            {
            pushFollow(FOLLOW_rule__Fixed_part__Group__0__Impl_in_rule__Fixed_part__Group__09896);
            rule__Fixed_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fixed_part__Group__1_in_rule__Fixed_part__Group__09899);
            rule__Fixed_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group__0"


    // $ANTLR start "rule__Fixed_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4926:1: rule__Fixed_part__Group__0__Impl : ( rulerecord_section ) ;
    public final void rule__Fixed_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4930:1: ( ( rulerecord_section ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4931:1: ( rulerecord_section )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4931:1: ( rulerecord_section )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4932:1: rulerecord_section
            {
             before(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulerecord_section_in_rule__Fixed_part__Group__0__Impl9926);
            rulerecord_section();

            state._fsp--;

             after(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group__0__Impl"


    // $ANTLR start "rule__Fixed_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4943:1: rule__Fixed_part__Group__1 : rule__Fixed_part__Group__1__Impl ;
    public final void rule__Fixed_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4947:1: ( rule__Fixed_part__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4948:2: rule__Fixed_part__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Fixed_part__Group__1__Impl_in_rule__Fixed_part__Group__19955);
            rule__Fixed_part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group__1"


    // $ANTLR start "rule__Fixed_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4954:1: rule__Fixed_part__Group__1__Impl : ( ( rule__Fixed_part__Group_1__0 )* ) ;
    public final void rule__Fixed_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4958:1: ( ( ( rule__Fixed_part__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4959:1: ( ( rule__Fixed_part__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4959:1: ( ( rule__Fixed_part__Group_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4960:1: ( rule__Fixed_part__Group_1__0 )*
            {
             before(grammarAccess.getFixed_partAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4961:1: ( rule__Fixed_part__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==RULE_IDENTIFIER) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4961:2: rule__Fixed_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Fixed_part__Group_1__0_in_rule__Fixed_part__Group__1__Impl9982);
            	    rule__Fixed_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getFixed_partAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group__1__Impl"


    // $ANTLR start "rule__Fixed_part__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4975:1: rule__Fixed_part__Group_1__0 : rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1 ;
    public final void rule__Fixed_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4979:1: ( rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4980:2: rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fixed_part__Group_1__0__Impl_in_rule__Fixed_part__Group_1__010017);
            rule__Fixed_part__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fixed_part__Group_1__1_in_rule__Fixed_part__Group_1__010020);
            rule__Fixed_part__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group_1__0"


    // $ANTLR start "rule__Fixed_part__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4987:1: rule__Fixed_part__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Fixed_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4991:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4992:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4992:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:4993:1: ';'
            {
             before(grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Fixed_part__Group_1__0__Impl10048); 
             after(grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group_1__0__Impl"


    // $ANTLR start "rule__Fixed_part__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5006:1: rule__Fixed_part__Group_1__1 : rule__Fixed_part__Group_1__1__Impl ;
    public final void rule__Fixed_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5010:1: ( rule__Fixed_part__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5011:2: rule__Fixed_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fixed_part__Group_1__1__Impl_in_rule__Fixed_part__Group_1__110079);
            rule__Fixed_part__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group_1__1"


    // $ANTLR start "rule__Fixed_part__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5017:1: rule__Fixed_part__Group_1__1__Impl : ( rulerecord_section ) ;
    public final void rule__Fixed_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5021:1: ( ( rulerecord_section ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5022:1: ( rulerecord_section )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5022:1: ( rulerecord_section )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5023:1: rulerecord_section
            {
             before(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulerecord_section_in_rule__Fixed_part__Group_1__1__Impl10106);
            rulerecord_section();

            state._fsp--;

             after(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group_1__1__Impl"


    // $ANTLR start "rule__Record_section__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5038:1: rule__Record_section__Group__0 : rule__Record_section__Group__0__Impl rule__Record_section__Group__1 ;
    public final void rule__Record_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5042:1: ( rule__Record_section__Group__0__Impl rule__Record_section__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5043:2: rule__Record_section__Group__0__Impl rule__Record_section__Group__1
            {
            pushFollow(FOLLOW_rule__Record_section__Group__0__Impl_in_rule__Record_section__Group__010139);
            rule__Record_section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record_section__Group__1_in_rule__Record_section__Group__010142);
            rule__Record_section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__0"


    // $ANTLR start "rule__Record_section__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5050:1: rule__Record_section__Group__0__Impl : ( ruleidentifier_list ) ;
    public final void rule__Record_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5054:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5055:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5055:1: ( ruleidentifier_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5056:1: ruleidentifier_list
            {
             before(grammarAccess.getRecord_sectionAccess().getIdentifier_listParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Record_section__Group__0__Impl10169);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getRecord_sectionAccess().getIdentifier_listParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__0__Impl"


    // $ANTLR start "rule__Record_section__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5067:1: rule__Record_section__Group__1 : rule__Record_section__Group__1__Impl rule__Record_section__Group__2 ;
    public final void rule__Record_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5071:1: ( rule__Record_section__Group__1__Impl rule__Record_section__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5072:2: rule__Record_section__Group__1__Impl rule__Record_section__Group__2
            {
            pushFollow(FOLLOW_rule__Record_section__Group__1__Impl_in_rule__Record_section__Group__110198);
            rule__Record_section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record_section__Group__2_in_rule__Record_section__Group__110201);
            rule__Record_section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__1"


    // $ANTLR start "rule__Record_section__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5079:1: rule__Record_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Record_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5083:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5084:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5084:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5085:1: ':'
            {
             before(grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Record_section__Group__1__Impl10229); 
             after(grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__1__Impl"


    // $ANTLR start "rule__Record_section__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5098:1: rule__Record_section__Group__2 : rule__Record_section__Group__2__Impl ;
    public final void rule__Record_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5102:1: ( rule__Record_section__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5103:2: rule__Record_section__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Record_section__Group__2__Impl_in_rule__Record_section__Group__210260);
            rule__Record_section__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__2"


    // $ANTLR start "rule__Record_section__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5109:1: rule__Record_section__Group__2__Impl : ( ruletype ) ;
    public final void rule__Record_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5113:1: ( ( ruletype ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5114:1: ( ruletype )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5114:1: ( ruletype )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5115:1: ruletype
            {
             before(grammarAccess.getRecord_sectionAccess().getTypeParserRuleCall_2()); 
            pushFollow(FOLLOW_ruletype_in_rule__Record_section__Group__2__Impl10287);
            ruletype();

            state._fsp--;

             after(grammarAccess.getRecord_sectionAccess().getTypeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__2__Impl"


    // $ANTLR start "rule__Variant_part__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5132:1: rule__Variant_part__Group__0 : rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1 ;
    public final void rule__Variant_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5136:1: ( rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5137:2: rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1
            {
            pushFollow(FOLLOW_rule__Variant_part__Group__0__Impl_in_rule__Variant_part__Group__010322);
            rule__Variant_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant_part__Group__1_in_rule__Variant_part__Group__010325);
            rule__Variant_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__0"


    // $ANTLR start "rule__Variant_part__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5144:1: rule__Variant_part__Group__0__Impl : ( 'case' ) ;
    public final void rule__Variant_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5148:1: ( ( 'case' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5149:1: ( 'case' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5149:1: ( 'case' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5150:1: 'case'
            {
             before(grammarAccess.getVariant_partAccess().getCaseKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Variant_part__Group__0__Impl10353); 
             after(grammarAccess.getVariant_partAccess().getCaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__0__Impl"


    // $ANTLR start "rule__Variant_part__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5163:1: rule__Variant_part__Group__1 : rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2 ;
    public final void rule__Variant_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5167:1: ( rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5168:2: rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2
            {
            pushFollow(FOLLOW_rule__Variant_part__Group__1__Impl_in_rule__Variant_part__Group__110384);
            rule__Variant_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant_part__Group__2_in_rule__Variant_part__Group__110387);
            rule__Variant_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__1"


    // $ANTLR start "rule__Variant_part__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5175:1: rule__Variant_part__Group__1__Impl : ( ruletag_field ) ;
    public final void rule__Variant_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5179:1: ( ( ruletag_field ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5180:1: ( ruletag_field )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5180:1: ( ruletag_field )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5181:1: ruletag_field
            {
             before(grammarAccess.getVariant_partAccess().getTag_fieldParserRuleCall_1()); 
            pushFollow(FOLLOW_ruletag_field_in_rule__Variant_part__Group__1__Impl10414);
            ruletag_field();

            state._fsp--;

             after(grammarAccess.getVariant_partAccess().getTag_fieldParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__1__Impl"


    // $ANTLR start "rule__Variant_part__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5192:1: rule__Variant_part__Group__2 : rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3 ;
    public final void rule__Variant_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5196:1: ( rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5197:2: rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3
            {
            pushFollow(FOLLOW_rule__Variant_part__Group__2__Impl_in_rule__Variant_part__Group__210443);
            rule__Variant_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant_part__Group__3_in_rule__Variant_part__Group__210446);
            rule__Variant_part__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__2"


    // $ANTLR start "rule__Variant_part__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5204:1: rule__Variant_part__Group__2__Impl : ( ruletype_identifier ) ;
    public final void rule__Variant_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5208:1: ( ( ruletype_identifier ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5209:1: ( ruletype_identifier )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5209:1: ( ruletype_identifier )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5210:1: ruletype_identifier
            {
             before(grammarAccess.getVariant_partAccess().getType_identifierParserRuleCall_2()); 
            pushFollow(FOLLOW_ruletype_identifier_in_rule__Variant_part__Group__2__Impl10473);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getVariant_partAccess().getType_identifierParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__2__Impl"


    // $ANTLR start "rule__Variant_part__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5221:1: rule__Variant_part__Group__3 : rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4 ;
    public final void rule__Variant_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5225:1: ( rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5226:2: rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4
            {
            pushFollow(FOLLOW_rule__Variant_part__Group__3__Impl_in_rule__Variant_part__Group__310502);
            rule__Variant_part__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant_part__Group__4_in_rule__Variant_part__Group__310505);
            rule__Variant_part__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__3"


    // $ANTLR start "rule__Variant_part__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5233:1: rule__Variant_part__Group__3__Impl : ( 'of' ) ;
    public final void rule__Variant_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5237:1: ( ( 'of' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5238:1: ( 'of' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5238:1: ( 'of' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5239:1: 'of'
            {
             before(grammarAccess.getVariant_partAccess().getOfKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__Variant_part__Group__3__Impl10533); 
             after(grammarAccess.getVariant_partAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__3__Impl"


    // $ANTLR start "rule__Variant_part__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5252:1: rule__Variant_part__Group__4 : rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5 ;
    public final void rule__Variant_part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5256:1: ( rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5257:2: rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5
            {
            pushFollow(FOLLOW_rule__Variant_part__Group__4__Impl_in_rule__Variant_part__Group__410564);
            rule__Variant_part__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant_part__Group__5_in_rule__Variant_part__Group__410567);
            rule__Variant_part__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__4"


    // $ANTLR start "rule__Variant_part__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5264:1: rule__Variant_part__Group__4__Impl : ( rulevariant ) ;
    public final void rule__Variant_part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5268:1: ( ( rulevariant ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5269:1: ( rulevariant )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5269:1: ( rulevariant )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5270:1: rulevariant
            {
             before(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_4()); 
            pushFollow(FOLLOW_rulevariant_in_rule__Variant_part__Group__4__Impl10594);
            rulevariant();

            state._fsp--;

             after(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__4__Impl"


    // $ANTLR start "rule__Variant_part__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5281:1: rule__Variant_part__Group__5 : rule__Variant_part__Group__5__Impl ;
    public final void rule__Variant_part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5285:1: ( rule__Variant_part__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5286:2: rule__Variant_part__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Variant_part__Group__5__Impl_in_rule__Variant_part__Group__510623);
            rule__Variant_part__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__5"


    // $ANTLR start "rule__Variant_part__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5292:1: rule__Variant_part__Group__5__Impl : ( ( rule__Variant_part__Group_5__0 )* ) ;
    public final void rule__Variant_part__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5296:1: ( ( ( rule__Variant_part__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5297:1: ( ( rule__Variant_part__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5297:1: ( ( rule__Variant_part__Group_5__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5298:1: ( rule__Variant_part__Group_5__0 )*
            {
             before(grammarAccess.getVariant_partAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5299:1: ( rule__Variant_part__Group_5__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24) ) {
                    int LA32_2 = input.LA(2);

                    if ( ((LA32_2>=RULE_IDENTIFIER && LA32_2<=RULE_UNSIGNED_DIGIT_SEQUENCE)||(LA32_2>=20 && LA32_2<=21)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5299:2: rule__Variant_part__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Variant_part__Group_5__0_in_rule__Variant_part__Group__5__Impl10650);
            	    rule__Variant_part__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getVariant_partAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__5__Impl"


    // $ANTLR start "rule__Variant_part__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5321:1: rule__Variant_part__Group_5__0 : rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1 ;
    public final void rule__Variant_part__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5325:1: ( rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5326:2: rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1
            {
            pushFollow(FOLLOW_rule__Variant_part__Group_5__0__Impl_in_rule__Variant_part__Group_5__010693);
            rule__Variant_part__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant_part__Group_5__1_in_rule__Variant_part__Group_5__010696);
            rule__Variant_part__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group_5__0"


    // $ANTLR start "rule__Variant_part__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5333:1: rule__Variant_part__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Variant_part__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5337:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5338:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5338:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5339:1: ';'
            {
             before(grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Variant_part__Group_5__0__Impl10724); 
             after(grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group_5__0__Impl"


    // $ANTLR start "rule__Variant_part__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5352:1: rule__Variant_part__Group_5__1 : rule__Variant_part__Group_5__1__Impl ;
    public final void rule__Variant_part__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5356:1: ( rule__Variant_part__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5357:2: rule__Variant_part__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Variant_part__Group_5__1__Impl_in_rule__Variant_part__Group_5__110755);
            rule__Variant_part__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group_5__1"


    // $ANTLR start "rule__Variant_part__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5363:1: rule__Variant_part__Group_5__1__Impl : ( rulevariant ) ;
    public final void rule__Variant_part__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5367:1: ( ( rulevariant ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5368:1: ( rulevariant )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5368:1: ( rulevariant )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5369:1: rulevariant
            {
             before(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_5_1()); 
            pushFollow(FOLLOW_rulevariant_in_rule__Variant_part__Group_5__1__Impl10782);
            rulevariant();

            state._fsp--;

             after(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group_5__1__Impl"


    // $ANTLR start "rule__Tag_field__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5384:1: rule__Tag_field__Group__0 : rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1 ;
    public final void rule__Tag_field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5388:1: ( rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5389:2: rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1
            {
            pushFollow(FOLLOW_rule__Tag_field__Group__0__Impl_in_rule__Tag_field__Group__010815);
            rule__Tag_field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag_field__Group__1_in_rule__Tag_field__Group__010818);
            rule__Tag_field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag_field__Group__0"


    // $ANTLR start "rule__Tag_field__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5396:1: rule__Tag_field__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Tag_field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5400:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5401:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5401:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5402:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getTag_fieldAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Tag_field__Group__0__Impl10845); 
             after(grammarAccess.getTag_fieldAccess().getIDENTIFIERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag_field__Group__0__Impl"


    // $ANTLR start "rule__Tag_field__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5413:1: rule__Tag_field__Group__1 : rule__Tag_field__Group__1__Impl ;
    public final void rule__Tag_field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5417:1: ( rule__Tag_field__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5418:2: rule__Tag_field__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Tag_field__Group__1__Impl_in_rule__Tag_field__Group__110874);
            rule__Tag_field__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag_field__Group__1"


    // $ANTLR start "rule__Tag_field__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5424:1: rule__Tag_field__Group__1__Impl : ( ':' ) ;
    public final void rule__Tag_field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5428:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5429:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5429:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5430:1: ':'
            {
             before(grammarAccess.getTag_fieldAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Tag_field__Group__1__Impl10902); 
             after(grammarAccess.getTag_fieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag_field__Group__1__Impl"


    // $ANTLR start "rule__Variant__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5447:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5451:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5452:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
            {
            pushFollow(FOLLOW_rule__Variant__Group__0__Impl_in_rule__Variant__Group__010937);
            rule__Variant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant__Group__1_in_rule__Variant__Group__010940);
            rule__Variant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__0"


    // $ANTLR start "rule__Variant__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5459:1: rule__Variant__Group__0__Impl : ( rulecase_label_list ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5463:1: ( ( rulecase_label_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5464:1: ( rulecase_label_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5464:1: ( rulecase_label_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5465:1: rulecase_label_list
            {
             before(grammarAccess.getVariantAccess().getCase_label_listParserRuleCall_0()); 
            pushFollow(FOLLOW_rulecase_label_list_in_rule__Variant__Group__0__Impl10967);
            rulecase_label_list();

            state._fsp--;

             after(grammarAccess.getVariantAccess().getCase_label_listParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__0__Impl"


    // $ANTLR start "rule__Variant__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5476:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5480:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5481:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
            {
            pushFollow(FOLLOW_rule__Variant__Group__1__Impl_in_rule__Variant__Group__110996);
            rule__Variant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant__Group__2_in_rule__Variant__Group__110999);
            rule__Variant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__1"


    // $ANTLR start "rule__Variant__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5488:1: rule__Variant__Group__1__Impl : ( ':' ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5492:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5493:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5493:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5494:1: ':'
            {
             before(grammarAccess.getVariantAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Variant__Group__1__Impl11027); 
             after(grammarAccess.getVariantAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__1__Impl"


    // $ANTLR start "rule__Variant__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5507:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5511:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5512:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
            {
            pushFollow(FOLLOW_rule__Variant__Group__2__Impl_in_rule__Variant__Group__211058);
            rule__Variant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant__Group__3_in_rule__Variant__Group__211061);
            rule__Variant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__2"


    // $ANTLR start "rule__Variant__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5519:1: rule__Variant__Group__2__Impl : ( '(' ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5523:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5524:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5524:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5525:1: '('
            {
             before(grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Variant__Group__2__Impl11089); 
             after(grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__2__Impl"


    // $ANTLR start "rule__Variant__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5538:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl rule__Variant__Group__4 ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5542:1: ( rule__Variant__Group__3__Impl rule__Variant__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5543:2: rule__Variant__Group__3__Impl rule__Variant__Group__4
            {
            pushFollow(FOLLOW_rule__Variant__Group__3__Impl_in_rule__Variant__Group__311120);
            rule__Variant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variant__Group__4_in_rule__Variant__Group__311123);
            rule__Variant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__3"


    // $ANTLR start "rule__Variant__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5550:1: rule__Variant__Group__3__Impl : ( rulefield_list ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5554:1: ( ( rulefield_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5555:1: ( rulefield_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5555:1: ( rulefield_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5556:1: rulefield_list
            {
             before(grammarAccess.getVariantAccess().getField_listParserRuleCall_3()); 
            pushFollow(FOLLOW_rulefield_list_in_rule__Variant__Group__3__Impl11150);
            rulefield_list();

            state._fsp--;

             after(grammarAccess.getVariantAccess().getField_listParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__3__Impl"


    // $ANTLR start "rule__Variant__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5567:1: rule__Variant__Group__4 : rule__Variant__Group__4__Impl ;
    public final void rule__Variant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5571:1: ( rule__Variant__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5572:2: rule__Variant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Variant__Group__4__Impl_in_rule__Variant__Group__411179);
            rule__Variant__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__4"


    // $ANTLR start "rule__Variant__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5578:1: rule__Variant__Group__4__Impl : ( ')' ) ;
    public final void rule__Variant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5582:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5583:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5583:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5584:1: ')'
            {
             before(grammarAccess.getVariantAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Variant__Group__4__Impl11207); 
             after(grammarAccess.getVariantAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__4__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5608:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5612:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5613:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__011249);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__011252);
            rule__Identifier_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__0"


    // $ANTLR start "rule__Identifier_list__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5620:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5624:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5625:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5625:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5626:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl11279); 
             after(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5637:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5641:1: ( rule__Identifier_list__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5642:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__111308);
            rule__Identifier_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__1"


    // $ANTLR start "rule__Identifier_list__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5648:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5652:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5653:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5653:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5654:1: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5655:1: ( rule__Identifier_list__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5655:2: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl11335);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getIdentifier_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5669:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5673:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5674:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__011370);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__011373);
            rule__Identifier_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__0"


    // $ANTLR start "rule__Identifier_list__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5681:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5685:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5686:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5686:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5687:1: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Identifier_list__Group_1__0__Impl11401); 
             after(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5700:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5704:1: ( rule__Identifier_list__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5705:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__111432);
            rule__Identifier_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__1"


    // $ANTLR start "rule__Identifier_list__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5711:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5715:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5716:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5716:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5717:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl11459); 
             after(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Real_number__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5732:1: rule__Real_number__Group_0__0 : rule__Real_number__Group_0__0__Impl rule__Real_number__Group_0__1 ;
    public final void rule__Real_number__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5736:1: ( rule__Real_number__Group_0__0__Impl rule__Real_number__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5737:2: rule__Real_number__Group_0__0__Impl rule__Real_number__Group_0__1
            {
            pushFollow(FOLLOW_rule__Real_number__Group_0__0__Impl_in_rule__Real_number__Group_0__011492);
            rule__Real_number__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real_number__Group_0__1_in_rule__Real_number__Group_0__011495);
            rule__Real_number__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_0__0"


    // $ANTLR start "rule__Real_number__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5744:1: rule__Real_number__Group_0__0__Impl : ( ruledigit_sequence ) ;
    public final void rule__Real_number__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5748:1: ( ( ruledigit_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5749:1: ( ruledigit_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5749:1: ( ruledigit_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5750:1: ruledigit_sequence
            {
             before(grammarAccess.getReal_numberAccess().getDigit_sequenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_rule__Real_number__Group_0__0__Impl11522);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getReal_numberAccess().getDigit_sequenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_0__0__Impl"


    // $ANTLR start "rule__Real_number__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5761:1: rule__Real_number__Group_0__1 : rule__Real_number__Group_0__1__Impl rule__Real_number__Group_0__2 ;
    public final void rule__Real_number__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5765:1: ( rule__Real_number__Group_0__1__Impl rule__Real_number__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5766:2: rule__Real_number__Group_0__1__Impl rule__Real_number__Group_0__2
            {
            pushFollow(FOLLOW_rule__Real_number__Group_0__1__Impl_in_rule__Real_number__Group_0__111551);
            rule__Real_number__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real_number__Group_0__2_in_rule__Real_number__Group_0__111554);
            rule__Real_number__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_0__1"


    // $ANTLR start "rule__Real_number__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5773:1: rule__Real_number__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Real_number__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5777:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5778:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5778:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5779:1: '.'
            {
             before(grammarAccess.getReal_numberAccess().getFullStopKeyword_0_1()); 
            match(input,22,FOLLOW_22_in_rule__Real_number__Group_0__1__Impl11582); 
             after(grammarAccess.getReal_numberAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_0__1__Impl"


    // $ANTLR start "rule__Real_number__Group_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5792:1: rule__Real_number__Group_0__2 : rule__Real_number__Group_0__2__Impl rule__Real_number__Group_0__3 ;
    public final void rule__Real_number__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5796:1: ( rule__Real_number__Group_0__2__Impl rule__Real_number__Group_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5797:2: rule__Real_number__Group_0__2__Impl rule__Real_number__Group_0__3
            {
            pushFollow(FOLLOW_rule__Real_number__Group_0__2__Impl_in_rule__Real_number__Group_0__211613);
            rule__Real_number__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real_number__Group_0__3_in_rule__Real_number__Group_0__211616);
            rule__Real_number__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_0__2"


    // $ANTLR start "rule__Real_number__Group_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5804:1: rule__Real_number__Group_0__2__Impl : ( ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ) ;
    public final void rule__Real_number__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5808:1: ( ( ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5809:1: ( ( RULE_UNSIGNED_DIGIT_SEQUENCE )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5809:1: ( ( RULE_UNSIGNED_DIGIT_SEQUENCE )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5810:1: ( RULE_UNSIGNED_DIGIT_SEQUENCE )?
            {
             before(grammarAccess.getReal_numberAccess().getUNSIGNED_DIGIT_SEQUENCETerminalRuleCall_0_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5811:1: ( RULE_UNSIGNED_DIGIT_SEQUENCE )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5811:3: RULE_UNSIGNED_DIGIT_SEQUENCE
                    {
                    match(input,RULE_UNSIGNED_DIGIT_SEQUENCE,FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_rule__Real_number__Group_0__2__Impl11644); 

                    }
                    break;

            }

             after(grammarAccess.getReal_numberAccess().getUNSIGNED_DIGIT_SEQUENCETerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_0__2__Impl"


    // $ANTLR start "rule__Real_number__Group_0__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5821:1: rule__Real_number__Group_0__3 : rule__Real_number__Group_0__3__Impl ;
    public final void rule__Real_number__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5825:1: ( rule__Real_number__Group_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5826:2: rule__Real_number__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Real_number__Group_0__3__Impl_in_rule__Real_number__Group_0__311675);
            rule__Real_number__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_0__3"


    // $ANTLR start "rule__Real_number__Group_0__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5832:1: rule__Real_number__Group_0__3__Impl : ( rulescale_factor ) ;
    public final void rule__Real_number__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5836:1: ( ( rulescale_factor ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5837:1: ( rulescale_factor )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5837:1: ( rulescale_factor )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5838:1: rulescale_factor
            {
             before(grammarAccess.getReal_numberAccess().getScale_factorParserRuleCall_0_3()); 
            pushFollow(FOLLOW_rulescale_factor_in_rule__Real_number__Group_0__3__Impl11702);
            rulescale_factor();

            state._fsp--;

             after(grammarAccess.getReal_numberAccess().getScale_factorParserRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_0__3__Impl"


    // $ANTLR start "rule__Real_number__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5857:1: rule__Real_number__Group_1__0 : rule__Real_number__Group_1__0__Impl rule__Real_number__Group_1__1 ;
    public final void rule__Real_number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5861:1: ( rule__Real_number__Group_1__0__Impl rule__Real_number__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5862:2: rule__Real_number__Group_1__0__Impl rule__Real_number__Group_1__1
            {
            pushFollow(FOLLOW_rule__Real_number__Group_1__0__Impl_in_rule__Real_number__Group_1__011739);
            rule__Real_number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real_number__Group_1__1_in_rule__Real_number__Group_1__011742);
            rule__Real_number__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_1__0"


    // $ANTLR start "rule__Real_number__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5869:1: rule__Real_number__Group_1__0__Impl : ( ruledigit_sequence ) ;
    public final void rule__Real_number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5873:1: ( ( ruledigit_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5874:1: ( ruledigit_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5874:1: ( ruledigit_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5875:1: ruledigit_sequence
            {
             before(grammarAccess.getReal_numberAccess().getDigit_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_rule__Real_number__Group_1__0__Impl11769);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getReal_numberAccess().getDigit_sequenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_1__0__Impl"


    // $ANTLR start "rule__Real_number__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5886:1: rule__Real_number__Group_1__1 : rule__Real_number__Group_1__1__Impl ;
    public final void rule__Real_number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5890:1: ( rule__Real_number__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5891:2: rule__Real_number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Real_number__Group_1__1__Impl_in_rule__Real_number__Group_1__111798);
            rule__Real_number__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_1__1"


    // $ANTLR start "rule__Real_number__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5897:1: rule__Real_number__Group_1__1__Impl : ( rulescale_factor ) ;
    public final void rule__Real_number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5901:1: ( ( rulescale_factor ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5902:1: ( rulescale_factor )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5902:1: ( rulescale_factor )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5903:1: rulescale_factor
            {
             before(grammarAccess.getReal_numberAccess().getScale_factorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulescale_factor_in_rule__Real_number__Group_1__1__Impl11825);
            rulescale_factor();

            state._fsp--;

             after(grammarAccess.getReal_numberAccess().getScale_factorParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_number__Group_1__1__Impl"


    // $ANTLR start "rule__Scale_factor__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5918:1: rule__Scale_factor__Group__0 : rule__Scale_factor__Group__0__Impl rule__Scale_factor__Group__1 ;
    public final void rule__Scale_factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5922:1: ( rule__Scale_factor__Group__0__Impl rule__Scale_factor__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5923:2: rule__Scale_factor__Group__0__Impl rule__Scale_factor__Group__1
            {
            pushFollow(FOLLOW_rule__Scale_factor__Group__0__Impl_in_rule__Scale_factor__Group__011858);
            rule__Scale_factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scale_factor__Group__1_in_rule__Scale_factor__Group__011861);
            rule__Scale_factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale_factor__Group__0"


    // $ANTLR start "rule__Scale_factor__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5930:1: rule__Scale_factor__Group__0__Impl : ( ( rule__Scale_factor__Alternatives_0 ) ) ;
    public final void rule__Scale_factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5934:1: ( ( ( rule__Scale_factor__Alternatives_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5935:1: ( ( rule__Scale_factor__Alternatives_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5935:1: ( ( rule__Scale_factor__Alternatives_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5936:1: ( rule__Scale_factor__Alternatives_0 )
            {
             before(grammarAccess.getScale_factorAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5937:1: ( rule__Scale_factor__Alternatives_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5937:2: rule__Scale_factor__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Scale_factor__Alternatives_0_in_rule__Scale_factor__Group__0__Impl11888);
            rule__Scale_factor__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getScale_factorAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale_factor__Group__0__Impl"


    // $ANTLR start "rule__Scale_factor__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5947:1: rule__Scale_factor__Group__1 : rule__Scale_factor__Group__1__Impl ;
    public final void rule__Scale_factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5951:1: ( rule__Scale_factor__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5952:2: rule__Scale_factor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scale_factor__Group__1__Impl_in_rule__Scale_factor__Group__111918);
            rule__Scale_factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale_factor__Group__1"


    // $ANTLR start "rule__Scale_factor__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5958:1: rule__Scale_factor__Group__1__Impl : ( ruledigit_sequence ) ;
    public final void rule__Scale_factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5962:1: ( ( ruledigit_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5963:1: ( ruledigit_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5963:1: ( ruledigit_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5964:1: ruledigit_sequence
            {
             before(grammarAccess.getScale_factorAccess().getDigit_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_rule__Scale_factor__Group__1__Impl11945);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getScale_factorAccess().getDigit_sequenceParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale_factor__Group__1__Impl"


    // $ANTLR start "rule__Digit_sequence__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5979:1: rule__Digit_sequence__Group__0 : rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1 ;
    public final void rule__Digit_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5983:1: ( rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5984:2: rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__0__Impl_in_rule__Digit_sequence__Group__011978);
            rule__Digit_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Digit_sequence__Group__1_in_rule__Digit_sequence__Group__011981);
            rule__Digit_sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digit_sequence__Group__0"


    // $ANTLR start "rule__Digit_sequence__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5991:1: rule__Digit_sequence__Group__0__Impl : ( ( rulesign )? ) ;
    public final void rule__Digit_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5995:1: ( ( ( rulesign )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5996:1: ( ( rulesign )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5996:1: ( ( rulesign )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5997:1: ( rulesign )?
            {
             before(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5998:1: ( rulesign )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=20 && LA35_0<=21)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:5998:3: rulesign
                    {
                    pushFollow(FOLLOW_rulesign_in_rule__Digit_sequence__Group__0__Impl12009);
                    rulesign();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digit_sequence__Group__0__Impl"


    // $ANTLR start "rule__Digit_sequence__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6008:1: rule__Digit_sequence__Group__1 : rule__Digit_sequence__Group__1__Impl ;
    public final void rule__Digit_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6012:1: ( rule__Digit_sequence__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6013:2: rule__Digit_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__1__Impl_in_rule__Digit_sequence__Group__112040);
            rule__Digit_sequence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digit_sequence__Group__1"


    // $ANTLR start "rule__Digit_sequence__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6019:1: rule__Digit_sequence__Group__1__Impl : ( RULE_UNSIGNED_DIGIT_SEQUENCE ) ;
    public final void rule__Digit_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6023:1: ( ( RULE_UNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6024:1: ( RULE_UNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6024:1: ( RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6025:1: RULE_UNSIGNED_DIGIT_SEQUENCE
            {
             before(grammarAccess.getDigit_sequenceAccess().getUNSIGNED_DIGIT_SEQUENCETerminalRuleCall_1()); 
            match(input,RULE_UNSIGNED_DIGIT_SEQUENCE,FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_rule__Digit_sequence__Group__1__Impl12067); 
             after(grammarAccess.getDigit_sequenceAccess().getUNSIGNED_DIGIT_SEQUENCETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digit_sequence__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6040:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6044:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6045:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_0__0__Impl_in_rule__Constant__Group_0__012100);
            rule__Constant__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group_0__1_in_rule__Constant__Group_0__012103);
            rule__Constant__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__0"


    // $ANTLR start "rule__Constant__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6052:1: rule__Constant__Group_0__0__Impl : ( ( rulesign )? ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6056:1: ( ( ( rulesign )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6057:1: ( ( rulesign )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6057:1: ( ( rulesign )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6058:1: ( rulesign )?
            {
             before(grammarAccess.getConstantAccess().getSignParserRuleCall_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6059:1: ( rulesign )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            else if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6059:3: rulesign
                    {
                    pushFollow(FOLLOW_rulesign_in_rule__Constant__Group_0__0__Impl12131);
                    rulesign();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getSignParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__0__Impl"


    // $ANTLR start "rule__Constant__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6069:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6073:1: ( rule__Constant__Group_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6074:2: rule__Constant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_0__1__Impl_in_rule__Constant__Group_0__112162);
            rule__Constant__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__1"


    // $ANTLR start "rule__Constant__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6080:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__Alternatives_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6084:1: ( ( ( rule__Constant__Alternatives_0_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6085:1: ( ( rule__Constant__Alternatives_0_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6085:1: ( ( rule__Constant__Alternatives_0_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6086:1: ( rule__Constant__Alternatives_0_1 )
            {
             before(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6087:1: ( rule__Constant__Alternatives_0_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6087:2: rule__Constant__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_0_1_in_rule__Constant__Group_0__1__Impl12189);
            rule__Constant__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__1__Impl"


    // $ANTLR start "rule__Model__ProgramsAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6102:1: rule__Model__ProgramsAssignment : ( ruleprogram ) ;
    public final void rule__Model__ProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6106:1: ( ( ruleprogram ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6107:1: ( ruleprogram )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6107:1: ( ruleprogram )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:6108:1: ruleprogram
            {
             before(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_in_rule__Model__ProgramsAssignment12228);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProgramsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProgramsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleprogram155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__0_in_ruleprogram_heading215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleblock275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__0_in_ruledeclaration_part335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group__0_in_ruleconstant_definition_part455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition__Group__0_in_ruleconstant_definition515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group__0_in_ruletype_definition_part575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition__Group__0_in_ruletype_definition635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group__0_in_rulevariable_declaration_part695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0_in_rulevariable_declaration755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure_and_function_declaration_part__Group__0_in_ruleprocedure_and_function_declaration_part815 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__0_in_rulestatement_part876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__0_in_rulestatement_sequence936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_rulestatement996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group__0_in_rulecase_label_list1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype1091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruletype1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_type__Alternatives_in_rulesimple_type1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerated_type__Group__0_in_ruleenumerated_type1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange_type__Group__0_in_rulesubrange_type1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelower_bound_in_entryRulelower_bound1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelower_bound1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulelower_bound1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleupper_bound_in_entryRuleupper_bound1390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleupper_bound1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleupper_bound1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type1449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structured_type__Group__0_in_rulestructured_type1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unpacked_structured_type__Alternatives_in_ruleunpacked_structured_type1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group__0_in_rulearray_type1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_entryRuleindex_type1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex_type1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruleindex_type1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_type_in_entryRuleelement_type1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_type1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleelement_type1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_entryRulerecord_type1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_type1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record_type__Group__0_in_rulerecord_type1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set_type__Group__0_in_ruleset_type1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebase_type_in_entryRulebase_type1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebase_type1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rulebase_type1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File_type__Group__0_in_rulefile_type1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_component_type_in_entryRulefile_component_type1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_component_type1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_component_type2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_entryRulepointer_type2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepointer_type2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pointer_type__Group__0_in_rulepointer_type2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list2105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group__0_in_rulefield_list2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fixed_part__Group__0_in_rulefixed_part2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record_section__Group__0_in_rulerecord_section2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__0_in_rulevariant_part2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag_field__Group__0_in_ruletag_field2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Group__0_in_rulevariant2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_identifier_in_entryRulefield_identifier2469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_identifier2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefield_identifier2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_identifier_in_entryRuleconstant_identifier2528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_identifier2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant_identifier2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier2587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_identifier_in_entryRuletype_identifier2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_identifier2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype_identifier2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list2711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0_in_ruleidentifier_list2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber2771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_rulenumber2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number2831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_number_in_entryRulereal_number2890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal_number2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Alternatives_in_rulereal_number2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescale_factor_in_entryRulescale_factor2950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulescale_factor2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scale_factor__Group__0_in_rulescale_factor2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence3010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__0_in_ruledigit_sequence3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign3070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sign__Alternatives_in_rulesign3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel3130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rulelabel3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant3189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_in_ruleconstant3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Procedure_and_function_declaration_part__Alternatives_03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Procedure_and_function_declaration_part__Alternatives_03279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_rule__Type__Alternatives3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_rule__Type__Alternatives3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_rule__Type__Alternatives3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_identifier_in_rule__Type__Alternatives3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rule__Simple_type__Alternatives3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rule__Simple_type__Alternatives3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_rule__Unpacked_structured_type__Alternatives3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_rule__Unpacked_structured_type__Alternatives3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_rule__Unpacked_structured_type__Alternatives3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_rule__Unpacked_structured_type__Alternatives3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group_0_0__0_in_rule__Field_list__Alternatives_03552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rule__Field_list__Alternatives_03570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rule__Number__Alternatives3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_number_in_rule__Number__Alternatives3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Group_0__0_in_rule__Real_number__Alternatives3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Group_1__0_in_rule__Real_number__Alternatives3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Scale_factor__Alternatives_03704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Scale_factor__Alternatives_03724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sign__Alternatives3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sign__Alternatives3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__0_in_rule__Constant__Alternatives3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constant__Alternatives3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_identifier_in_rule__Constant__Alternatives_0_13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Constant__Alternatives_0_13880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__03910 = new BitSet(new long[]{0x00000001A8018000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__03913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_rule__Program__Group__0__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__13969 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__13972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Program__Group__1__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__24028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group__2__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__0__Impl_in_rule__Program_heading__Group__04093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__1_in_rule__Program_heading__Group__04096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program_heading__Group__0__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__1__Impl_in_rule__Program_heading__Group__14155 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__2_in_rule__Program_heading__Group__14158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading__Group__1__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__2__Impl_in_rule__Program_heading__Group__24214 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__3_in_rule__Program_heading__Group__24217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group_2__0_in_rule__Program_heading__Group__2__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__3__Impl_in_rule__Program_heading__Group__34275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Program_heading__Group__3__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group_2__0__Impl_in_rule__Program_heading__Group_2__04342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program_heading__Group_2__1_in_rule__Program_heading__Group_2__04345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Program_heading__Group_2__0__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group_2__1__Impl_in_rule__Program_heading__Group_2__14404 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Program_heading__Group_2__2_in_rule__Program_heading__Group_2__14407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Program_heading__Group_2__1__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group_2__2__Impl_in_rule__Program_heading__Group_2__24463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Program_heading__Group_2__2__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__0__Impl_in_rule__Declaration_part__Group__04647 = new BitSet(new long[]{0x00000001A8018000L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__1_in_rule__Declaration_part__Group__04650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_rule__Declaration_part__Group__0__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__1__Impl_in_rule__Declaration_part__Group__14709 = new BitSet(new long[]{0x00000001A8018000L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__2_in_rule__Declaration_part__Group__14712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_rule__Declaration_part__Group__1__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__2__Impl_in_rule__Declaration_part__Group__24771 = new BitSet(new long[]{0x00000001A8018000L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__3_in_rule__Declaration_part__Group__24774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_rule__Declaration_part__Group__2__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__3__Impl_in_rule__Declaration_part__Group__34833 = new BitSet(new long[]{0x00000001A8018000L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__4_in_rule__Declaration_part__Group__34836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_rule__Declaration_part__Group__3__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration_part__Group__4__Impl_in_rule__Declaration_part__Group__44895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_rule__Declaration_part__Group__4__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__04961 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Label_declaration_part__Group__0__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__15023 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__25082 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__25085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl5112 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__35143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Label_declaration_part__Group__3__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__05210 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__05213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Label_declaration_part__Group_2__0__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__15272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group__0__Impl_in_rule__Constant_definition_part__Group__05332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group__1_in_rule__Constant_definition_part__Group__05335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constant_definition_part__Group__0__Impl5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group__1__Impl_in_rule__Constant_definition_part__Group__15394 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group__2_in_rule__Constant_definition_part__Group__15397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_rule__Constant_definition_part__Group__1__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group__2__Impl_in_rule__Constant_definition_part__Group__25453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group__3_in_rule__Constant_definition_part__Group__25456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constant_definition_part__Group__2__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group__3__Impl_in_rule__Constant_definition_part__Group__35515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group_3__0_in_rule__Constant_definition_part__Group__3__Impl5542 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group_3__0__Impl_in_rule__Constant_definition_part__Group_3__05581 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group_3__1_in_rule__Constant_definition_part__Group_3__05584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_rule__Constant_definition_part__Group_3__0__Impl5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition_part__Group_3__1__Impl_in_rule__Constant_definition_part__Group_3__15640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constant_definition_part__Group_3__1__Impl5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition__Group__0__Impl_in_rule__Constant_definition__Group__05703 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Constant_definition__Group__1_in_rule__Constant_definition__Group__05706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Constant_definition__Group__0__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition__Group__1__Impl_in_rule__Constant_definition__Group__15762 = new BitSet(new long[]{0x0000000000300070L});
    public static final BitSet FOLLOW_rule__Constant_definition__Group__2_in_rule__Constant_definition__Group__15765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Constant_definition__Group__1__Impl5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant_definition__Group__2__Impl_in_rule__Constant_definition__Group__25824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rule__Constant_definition__Group__2__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group__0__Impl_in_rule__Type_definition_part__Group__05886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group__1_in_rule__Type_definition_part__Group__05889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Type_definition_part__Group__0__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group__1__Impl_in_rule__Type_definition_part__Group__15948 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group__2_in_rule__Type_definition_part__Group__15951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_in_rule__Type_definition_part__Group__1__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group__2__Impl_in_rule__Type_definition_part__Group__26007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group__3_in_rule__Type_definition_part__Group__26010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type_definition_part__Group__2__Impl6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group__3__Impl_in_rule__Type_definition_part__Group__36069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group_3__0_in_rule__Type_definition_part__Group__3__Impl6096 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group_3__0__Impl_in_rule__Type_definition_part__Group_3__06135 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group_3__1_in_rule__Type_definition_part__Group_3__06138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_in_rule__Type_definition_part__Group_3__0__Impl6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition_part__Group_3__1__Impl_in_rule__Type_definition_part__Group_3__16194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type_definition_part__Group_3__1__Impl6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition__Group__0__Impl_in_rule__Type_definition__Group__06257 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Type_definition__Group__1_in_rule__Type_definition__Group__06260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Type_definition__Group__0__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition__Group__1__Impl_in_rule__Type_definition__Group__16316 = new BitSet(new long[]{0x000078C002320070L});
    public static final BitSet FOLLOW_rule__Type_definition__Group__2_in_rule__Type_definition__Group__16319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Type_definition__Group__1__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_definition__Group__2__Impl_in_rule__Type_definition__Group__26378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Type_definition__Group__2__Impl6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group__0__Impl_in_rule__Variable_declaration_part__Group__06440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group__1_in_rule__Variable_declaration_part__Group__06443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Variable_declaration_part__Group__0__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group__1__Impl_in_rule__Variable_declaration_part__Group__16502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group__2_in_rule__Variable_declaration_part__Group__16505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rule__Variable_declaration_part__Group__1__Impl6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group__2__Impl_in_rule__Variable_declaration_part__Group__26561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group__3_in_rule__Variable_declaration_part__Group__26564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variable_declaration_part__Group__2__Impl6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group__3__Impl_in_rule__Variable_declaration_part__Group__36623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group_3__0_in_rule__Variable_declaration_part__Group__3__Impl6650 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group_3__0__Impl_in_rule__Variable_declaration_part__Group_3__06689 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group_3__1_in_rule__Variable_declaration_part__Group_3__06692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rule__Variable_declaration_part__Group_3__0__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration_part__Group_3__1__Impl_in_rule__Variable_declaration_part__Group_3__16748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variable_declaration_part__Group_3__1__Impl6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__06811 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__06814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Variable_declaration__Group__0__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__16870 = new BitSet(new long[]{0x000078C002320070L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__16873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Variable_declaration__Group__1__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__26932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Variable_declaration__Group__2__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure_and_function_declaration_part__Group__0__Impl_in_rule__Procedure_and_function_declaration_part__Group__06994 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Procedure_and_function_declaration_part__Group__1_in_rule__Procedure_and_function_declaration_part__Group__06997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure_and_function_declaration_part__Alternatives_0_in_rule__Procedure_and_function_declaration_part__Group__0__Impl7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure_and_function_declaration_part__Group__1__Impl_in_rule__Procedure_and_function_declaration_part__Group__17054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Procedure_and_function_declaration_part__Group__1__Impl7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__07117 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__07120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement_part__Group__0__Impl7148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__17179 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__17182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__27238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement_part__Group__2__Impl7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__07303 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__07306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__17362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group__1__Impl7390 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__07425 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__07428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group__0__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__17487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Statement__Group__1__Impl7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group__0__Impl_in_rule__Case_label_list__Group__07550 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group__1_in_rule__Case_label_list__Group__07553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rule__Case_label_list__Group__0__Impl7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group__1__Impl_in_rule__Case_label_list__Group__17609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group_1__0_in_rule__Case_label_list__Group__1__Impl7636 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group_1__0__Impl_in_rule__Case_label_list__Group_1__07671 = new BitSet(new long[]{0x0000000000300070L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group_1__1_in_rule__Case_label_list__Group_1__07674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Case_label_list__Group_1__0__Impl7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group_1__1__Impl_in_rule__Case_label_list__Group_1__17733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rule__Case_label_list__Group_1__1__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerated_type__Group__0__Impl_in_rule__Enumerated_type__Group__07793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumerated_type__Group__1_in_rule__Enumerated_type__Group__07796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Enumerated_type__Group__0__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerated_type__Group__1__Impl_in_rule__Enumerated_type__Group__17855 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Enumerated_type__Group__2_in_rule__Enumerated_type__Group__17858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Enumerated_type__Group__1__Impl7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerated_type__Group__2__Impl_in_rule__Enumerated_type__Group__27914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Enumerated_type__Group__2__Impl7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange_type__Group__0__Impl_in_rule__Subrange_type__Group__07979 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Subrange_type__Group__1_in_rule__Subrange_type__Group__07982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelower_bound_in_rule__Subrange_type__Group__0__Impl8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange_type__Group__1__Impl_in_rule__Subrange_type__Group__18038 = new BitSet(new long[]{0x0000000000300070L});
    public static final BitSet FOLLOW_rule__Subrange_type__Group__2_in_rule__Subrange_type__Group__18041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Subrange_type__Group__1__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange_type__Group__2__Impl_in_rule__Subrange_type__Group__28100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleupper_bound_in_rule__Subrange_type__Group__2__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structured_type__Group__0__Impl_in_rule__Structured_type__Group__08162 = new BitSet(new long[]{0x000038C000000000L});
    public static final BitSet FOLLOW_rule__Structured_type__Group__1_in_rule__Structured_type__Group__08165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Structured_type__Group__0__Impl8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structured_type__Group__1__Impl_in_rule__Structured_type__Group__18227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rule__Structured_type__Group__1__Impl8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group__0__Impl_in_rule__Array_type__Group__08287 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Array_type__Group__1_in_rule__Array_type__Group__08290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Array_type__Group__0__Impl8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group__1__Impl_in_rule__Array_type__Group__18349 = new BitSet(new long[]{0x0000000002300070L});
    public static final BitSet FOLLOW_rule__Array_type__Group__2_in_rule__Array_type__Group__18352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Array_type__Group__1__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group__2__Impl_in_rule__Array_type__Group__28411 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_rule__Array_type__Group__3_in_rule__Array_type__Group__28414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_rule__Array_type__Group__2__Impl8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group__3__Impl_in_rule__Array_type__Group__38470 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_rule__Array_type__Group__4_in_rule__Array_type__Group__38473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group_3__0_in_rule__Array_type__Group__3__Impl8500 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group__4__Impl_in_rule__Array_type__Group__48531 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Array_type__Group__5_in_rule__Array_type__Group__48534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Array_type__Group__4__Impl8562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group__5__Impl_in_rule__Array_type__Group__58593 = new BitSet(new long[]{0x000078C002320070L});
    public static final BitSet FOLLOW_rule__Array_type__Group__6_in_rule__Array_type__Group__58596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Array_type__Group__5__Impl8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group__6__Impl_in_rule__Array_type__Group__68655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_type_in_rule__Array_type__Group__6__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group_3__0__Impl_in_rule__Array_type__Group_3__08725 = new BitSet(new long[]{0x0000000002300070L});
    public static final BitSet FOLLOW_rule__Array_type__Group_3__1_in_rule__Array_type__Group_3__08728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Array_type__Group_3__0__Impl8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array_type__Group_3__1__Impl_in_rule__Array_type__Group_3__18787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_rule__Array_type__Group_3__1__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record_type__Group__0__Impl_in_rule__Record_type__Group__08847 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_rule__Record_type__Group__1_in_rule__Record_type__Group__08850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Record_type__Group__0__Impl8878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record_type__Group__1__Impl_in_rule__Record_type__Group__18909 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Record_type__Group__2_in_rule__Record_type__Group__18912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_rule__Record_type__Group__1__Impl8939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record_type__Group__2__Impl_in_rule__Record_type__Group__28968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Record_type__Group__2__Impl8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set_type__Group__0__Impl_in_rule__Set_type__Group__09033 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Set_type__Group__1_in_rule__Set_type__Group__09036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Set_type__Group__0__Impl9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set_type__Group__1__Impl_in_rule__Set_type__Group__19095 = new BitSet(new long[]{0x000078C002320070L});
    public static final BitSet FOLLOW_rule__Set_type__Group__2_in_rule__Set_type__Group__19098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Set_type__Group__1__Impl9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set_type__Group__2__Impl_in_rule__Set_type__Group__29157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebase_type_in_rule__Set_type__Group__2__Impl9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File_type__Group__0__Impl_in_rule__File_type__Group__09219 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__File_type__Group__1_in_rule__File_type__Group__09222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__File_type__Group__0__Impl9250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File_type__Group__1__Impl_in_rule__File_type__Group__19281 = new BitSet(new long[]{0x000078C002320070L});
    public static final BitSet FOLLOW_rule__File_type__Group__2_in_rule__File_type__Group__19284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__File_type__Group__1__Impl9312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File_type__Group__2__Impl_in_rule__File_type__Group__29343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_component_type_in_rule__File_type__Group__2__Impl9370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pointer_type__Group__0__Impl_in_rule__Pointer_type__Group__09405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pointer_type__Group__1_in_rule__Pointer_type__Group__09408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Pointer_type__Group__0__Impl9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pointer_type__Group__1__Impl_in_rule__Pointer_type__Group__19467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_identifier_in_rule__Pointer_type__Group__1__Impl9494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group__0__Impl_in_rule__Field_list__Group__09527 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field_list__Group__1_in_rule__Field_list__Group__09530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Alternatives_0_in_rule__Field_list__Group__0__Impl9557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group__1__Impl_in_rule__Field_list__Group__19587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field_list__Group__1__Impl9616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group_0_0__0__Impl_in_rule__Field_list__Group_0_0__09653 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field_list__Group_0_0__1_in_rule__Field_list__Group_0_0__09656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rule__Field_list__Group_0_0__0__Impl9683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group_0_0__1__Impl_in_rule__Field_list__Group_0_0__19712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group_0_0_1__0_in_rule__Field_list__Group_0_0__1__Impl9739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group_0_0_1__0__Impl_in_rule__Field_list__Group_0_0_1__09774 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_rule__Field_list__Group_0_0_1__1_in_rule__Field_list__Group_0_0_1__09777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field_list__Group_0_0_1__0__Impl9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_list__Group_0_0_1__1__Impl_in_rule__Field_list__Group_0_0_1__19836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rule__Field_list__Group_0_0_1__1__Impl9863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fixed_part__Group__0__Impl_in_rule__Fixed_part__Group__09896 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Fixed_part__Group__1_in_rule__Fixed_part__Group__09899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rule__Fixed_part__Group__0__Impl9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fixed_part__Group__1__Impl_in_rule__Fixed_part__Group__19955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fixed_part__Group_1__0_in_rule__Fixed_part__Group__1__Impl9982 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Fixed_part__Group_1__0__Impl_in_rule__Fixed_part__Group_1__010017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fixed_part__Group_1__1_in_rule__Fixed_part__Group_1__010020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Fixed_part__Group_1__0__Impl10048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fixed_part__Group_1__1__Impl_in_rule__Fixed_part__Group_1__110079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rule__Fixed_part__Group_1__1__Impl10106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record_section__Group__0__Impl_in_rule__Record_section__Group__010139 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Record_section__Group__1_in_rule__Record_section__Group__010142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Record_section__Group__0__Impl10169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record_section__Group__1__Impl_in_rule__Record_section__Group__110198 = new BitSet(new long[]{0x000078C002320070L});
    public static final BitSet FOLLOW_rule__Record_section__Group__2_in_rule__Record_section__Group__110201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Record_section__Group__1__Impl10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record_section__Group__2__Impl_in_rule__Record_section__Group__210260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Record_section__Group__2__Impl10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__0__Impl_in_rule__Variant_part__Group__010322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__1_in_rule__Variant_part__Group__010325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Variant_part__Group__0__Impl10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__1__Impl_in_rule__Variant_part__Group__110384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__2_in_rule__Variant_part__Group__110387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletag_field_in_rule__Variant_part__Group__1__Impl10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__2__Impl_in_rule__Variant_part__Group__210443 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__3_in_rule__Variant_part__Group__210446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_identifier_in_rule__Variant_part__Group__2__Impl10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__3__Impl_in_rule__Variant_part__Group__310502 = new BitSet(new long[]{0x0000000000300070L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__4_in_rule__Variant_part__Group__310505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Variant_part__Group__3__Impl10533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__4__Impl_in_rule__Variant_part__Group__410564 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__5_in_rule__Variant_part__Group__410567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_rule__Variant_part__Group__4__Impl10594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group__5__Impl_in_rule__Variant_part__Group__510623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group_5__0_in_rule__Variant_part__Group__5__Impl10650 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group_5__0__Impl_in_rule__Variant_part__Group_5__010693 = new BitSet(new long[]{0x0000000000300070L});
    public static final BitSet FOLLOW_rule__Variant_part__Group_5__1_in_rule__Variant_part__Group_5__010696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variant_part__Group_5__0__Impl10724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant_part__Group_5__1__Impl_in_rule__Variant_part__Group_5__110755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_rule__Variant_part__Group_5__1__Impl10782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag_field__Group__0__Impl_in_rule__Tag_field__Group__010815 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Tag_field__Group__1_in_rule__Tag_field__Group__010818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Tag_field__Group__0__Impl10845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag_field__Group__1__Impl_in_rule__Tag_field__Group__110874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Tag_field__Group__1__Impl10902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Group__0__Impl_in_rule__Variant__Group__010937 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Variant__Group__1_in_rule__Variant__Group__010940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rule__Variant__Group__0__Impl10967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Group__1__Impl_in_rule__Variant__Group__110996 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Variant__Group__2_in_rule__Variant__Group__110999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Variant__Group__1__Impl11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Group__2__Impl_in_rule__Variant__Group__211058 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_rule__Variant__Group__3_in_rule__Variant__Group__211061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Variant__Group__2__Impl11089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Group__3__Impl_in_rule__Variant__Group__311120 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Variant__Group__4_in_rule__Variant__Group__311123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_rule__Variant__Group__3__Impl11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Group__4__Impl_in_rule__Variant__Group__411179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Variant__Group__4__Impl11207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__011249 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__011252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__111308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl11335 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__011370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__011373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Identifier_list__Group_1__0__Impl11401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__111432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl11459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Group_0__0__Impl_in_rule__Real_number__Group_0__011492 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Real_number__Group_0__1_in_rule__Real_number__Group_0__011495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rule__Real_number__Group_0__0__Impl11522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Group_0__1__Impl_in_rule__Real_number__Group_0__111551 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__Real_number__Group_0__2_in_rule__Real_number__Group_0__111554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Real_number__Group_0__1__Impl11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Group_0__2__Impl_in_rule__Real_number__Group_0__211613 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__Real_number__Group_0__3_in_rule__Real_number__Group_0__211616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_rule__Real_number__Group_0__2__Impl11644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Group_0__3__Impl_in_rule__Real_number__Group_0__311675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescale_factor_in_rule__Real_number__Group_0__3__Impl11702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Group_1__0__Impl_in_rule__Real_number__Group_1__011739 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__Real_number__Group_1__1_in_rule__Real_number__Group_1__011742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rule__Real_number__Group_1__0__Impl11769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_number__Group_1__1__Impl_in_rule__Real_number__Group_1__111798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescale_factor_in_rule__Real_number__Group_1__1__Impl11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scale_factor__Group__0__Impl_in_rule__Scale_factor__Group__011858 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_rule__Scale_factor__Group__1_in_rule__Scale_factor__Group__011861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scale_factor__Alternatives_0_in_rule__Scale_factor__Group__0__Impl11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scale_factor__Group__1__Impl_in_rule__Scale_factor__Group__111918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rule__Scale_factor__Group__1__Impl11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__0__Impl_in_rule__Digit_sequence__Group__011978 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__1_in_rule__Digit_sequence__Group__011981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_rule__Digit_sequence__Group__0__Impl12009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__1__Impl_in_rule__Digit_sequence__Group__112040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_rule__Digit_sequence__Group__1__Impl12067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__0__Impl_in_rule__Constant__Group_0__012100 = new BitSet(new long[]{0x0000000000300050L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__1_in_rule__Constant__Group_0__012103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_rule__Constant__Group_0__0__Impl12131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__1__Impl_in_rule__Constant__Group_0__112162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_0_1_in_rule__Constant__Group_0__1__Impl12189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rule__Model__ProgramsAssignment12228 = new BitSet(new long[]{0x0000000000000002L});

}