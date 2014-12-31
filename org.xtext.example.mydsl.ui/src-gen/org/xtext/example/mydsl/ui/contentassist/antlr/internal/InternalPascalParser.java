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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'declaration_part'", "'statement_part'", "'simple_type'", "'structured_type'", "'pointer_type'", "'type_identifier'", "'+'", "'-'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'.'", "'program'", "'('", "')'", "';'", "','"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
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

                if ( (LA1_0==82) ) {
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:90:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:91:1: ( ruleprogram EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:92:1: ruleprogram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram124);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram131); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:99:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:103:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:104:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:104:1: ( ( rule__Program__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:105:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:106:1: ( rule__Program__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:106:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleprogram157);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:118:1: entryRuleprogram_heading : ruleprogram_heading EOF ;
    public final void entryRuleprogram_heading() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:119:1: ( ruleprogram_heading EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:120:1: ruleprogram_heading EOF
            {
             before(grammarAccess.getProgram_headingRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading184);
            ruleprogram_heading();

            state._fsp--;

             after(grammarAccess.getProgram_headingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading191); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:127:1: ruleprogram_heading : ( ( rule__Program_heading__Group__0 ) ) ;
    public final void ruleprogram_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:131:2: ( ( ( rule__Program_heading__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:132:1: ( ( rule__Program_heading__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:132:1: ( ( rule__Program_heading__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:133:1: ( rule__Program_heading__Group__0 )
            {
             before(grammarAccess.getProgram_headingAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:134:1: ( rule__Program_heading__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:134:2: rule__Program_heading__Group__0
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__0_in_ruleprogram_heading217);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:146:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:147:1: ( ruleblock EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:148:1: ruleblock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock244);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock251); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:155:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:159:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:160:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:160:1: ( ( rule__Block__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:161:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:162:1: ( rule__Block__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:162:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleblock277);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:174:1: entryRuledeclaration_part : ruledeclaration_part EOF ;
    public final void entryRuledeclaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:175:1: ( ruledeclaration_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:176:1: ruledeclaration_part EOF
            {
             before(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part304);
            ruledeclaration_part();

            state._fsp--;

             after(grammarAccess.getDeclaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part311); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:183:1: ruledeclaration_part : ( 'declaration_part' ) ;
    public final void ruledeclaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:187:2: ( ( 'declaration_part' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:188:1: ( 'declaration_part' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:188:1: ( 'declaration_part' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:189:1: 'declaration_part'
            {
             before(grammarAccess.getDeclaration_partAccess().getDeclaration_partKeyword()); 
            match(input,11,FOLLOW_11_in_ruledeclaration_part338); 
             after(grammarAccess.getDeclaration_partAccess().getDeclaration_partKeyword()); 

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


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:204:1: entryRulestatement_part : rulestatement_part EOF ;
    public final void entryRulestatement_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:205:1: ( rulestatement_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:206:1: rulestatement_part EOF
            {
             before(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part366);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getStatement_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part373); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:213:1: rulestatement_part : ( 'statement_part' ) ;
    public final void rulestatement_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:217:2: ( ( 'statement_part' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:218:1: ( 'statement_part' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:218:1: ( 'statement_part' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:219:1: 'statement_part'
            {
             before(grammarAccess.getStatement_partAccess().getStatement_partKeyword()); 
            match(input,12,FOLLOW_12_in_rulestatement_part400); 
             after(grammarAccess.getStatement_partAccess().getStatement_partKeyword()); 

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


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:246:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:247:1: ( ruletype EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:248:1: ruletype EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype440);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype447); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:255:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:259:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:260:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:260:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:261:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:262:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:262:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruletype473);
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


    // $ANTLR start "entryRuleidentifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:276:1: entryRuleidentifier : ruleidentifier EOF ;
    public final void entryRuleidentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:277:1: ( ruleidentifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:278:1: ruleidentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleidentifier_in_entryRuleidentifier502);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier509); 

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
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:285:1: ruleidentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleidentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:289:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:290:1: ( ( rule__Identifier__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:290:1: ( ( rule__Identifier__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:291:1: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:292:1: ( rule__Identifier__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:292:2: rule__Identifier__Group__0
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0_in_ruleidentifier535);
            rule__Identifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getGroup()); 

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
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleidentifier2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:304:1: entryRuleidentifier2 : ruleidentifier2 EOF ;
    public final void entryRuleidentifier2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:305:1: ( ruleidentifier2 EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:306:1: ruleidentifier2 EOF
            {
             before(grammarAccess.getIdentifier2Rule()); 
            pushFollow(FOLLOW_ruleidentifier2_in_entryRuleidentifier2562);
            ruleidentifier2();

            state._fsp--;

             after(grammarAccess.getIdentifier2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier2569); 

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
    // $ANTLR end "entryRuleidentifier2"


    // $ANTLR start "ruleidentifier2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:313:1: ruleidentifier2 : ( ( rule__Identifier2__Alternatives )* ) ;
    public final void ruleidentifier2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:317:2: ( ( ( rule__Identifier2__Alternatives )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:318:1: ( ( rule__Identifier2__Alternatives )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:318:1: ( ( rule__Identifier2__Alternatives )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:319:1: ( rule__Identifier2__Alternatives )*
            {
             before(grammarAccess.getIdentifier2Access().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:320:1: ( rule__Identifier2__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=80)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:320:2: rule__Identifier2__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Identifier2__Alternatives_in_ruleidentifier2595);
            	    rule__Identifier2__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getIdentifier2Access().getAlternatives()); 

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
    // $ANTLR end "ruleidentifier2"


    // $ANTLR start "entryRulefield_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:332:1: entryRulefield_identifier : rulefield_identifier EOF ;
    public final void entryRulefield_identifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:333:1: ( rulefield_identifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:334:1: rulefield_identifier EOF
            {
             before(grammarAccess.getField_identifierRule()); 
            pushFollow(FOLLOW_rulefield_identifier_in_entryRulefield_identifier623);
            rulefield_identifier();

            state._fsp--;

             after(grammarAccess.getField_identifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_identifier630); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:341:1: rulefield_identifier : ( ruleidentifier ) ;
    public final void rulefield_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:345:2: ( ( ruleidentifier ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:346:1: ( ruleidentifier )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:346:1: ( ruleidentifier )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:347:1: ruleidentifier
            {
             before(grammarAccess.getField_identifierAccess().getIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleidentifier_in_rulefield_identifier656);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getField_identifierAccess().getIdentifierParserRuleCall()); 

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


    // $ANTLR start "entryRulevariable_identifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:362:1: entryRulevariable_identifier : rulevariable_identifier EOF ;
    public final void entryRulevariable_identifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:363:1: ( rulevariable_identifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:364:1: rulevariable_identifier EOF
            {
             before(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier684);
            rulevariable_identifier();

            state._fsp--;

             after(grammarAccess.getVariable_identifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier691); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:371:1: rulevariable_identifier : ( ruleidentifier ) ;
    public final void rulevariable_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:375:2: ( ( ruleidentifier ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:376:1: ( ruleidentifier )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:376:1: ( ruleidentifier )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:377:1: ruleidentifier
            {
             before(grammarAccess.getVariable_identifierAccess().getIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleidentifier_in_rulevariable_identifier717);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getVariable_identifierAccess().getIdentifierParserRuleCall()); 

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


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:398:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:399:1: ( ruleidentifier_list EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:400:1: ruleidentifier_list EOF
            {
             before(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list751);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getIdentifier_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list758); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:407:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:411:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:412:1: ( ( rule__Identifier_list__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:412:1: ( ( rule__Identifier_list__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:413:1: ( rule__Identifier_list__Group__0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:414:1: ( rule__Identifier_list__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:414:2: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0_in_ruleidentifier_list784);
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


    // $ANTLR start "entryRuleinteger_number"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:426:1: entryRuleinteger_number : ruleinteger_number EOF ;
    public final void entryRuleinteger_number() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:427:1: ( ruleinteger_number EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:428:1: ruleinteger_number EOF
            {
             before(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number811);
            ruleinteger_number();

            state._fsp--;

             after(grammarAccess.getInteger_numberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number818); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:435:1: ruleinteger_number : ( ruledigit_sequence ) ;
    public final void ruleinteger_number() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:439:2: ( ( ruledigit_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:440:1: ( ruledigit_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:440:1: ( ruledigit_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:441:1: ruledigit_sequence
            {
             before(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number844);
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


    // $ANTLR start "entryRuleunsigned_digit_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:456:1: entryRuleunsigned_digit_sequence : ruleunsigned_digit_sequence EOF ;
    public final void entryRuleunsigned_digit_sequence() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:457:1: ( ruleunsigned_digit_sequence EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:458:1: ruleunsigned_digit_sequence EOF
            {
             before(grammarAccess.getUnsigned_digit_sequenceRule()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence872);
            ruleunsigned_digit_sequence();

            state._fsp--;

             after(grammarAccess.getUnsigned_digit_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_digit_sequence879); 

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
    // $ANTLR end "entryRuleunsigned_digit_sequence"


    // $ANTLR start "ruleunsigned_digit_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:465:1: ruleunsigned_digit_sequence : ( ( rule__Unsigned_digit_sequence__Group__0 ) ) ;
    public final void ruleunsigned_digit_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:469:2: ( ( ( rule__Unsigned_digit_sequence__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:470:1: ( ( rule__Unsigned_digit_sequence__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:470:1: ( ( rule__Unsigned_digit_sequence__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:471:1: ( rule__Unsigned_digit_sequence__Group__0 )
            {
             before(grammarAccess.getUnsigned_digit_sequenceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:472:1: ( rule__Unsigned_digit_sequence__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:472:2: rule__Unsigned_digit_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Unsigned_digit_sequence__Group__0_in_ruleunsigned_digit_sequence905);
            rule__Unsigned_digit_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_digit_sequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleunsigned_digit_sequence"


    // $ANTLR start "entryRuledigit_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:484:1: entryRuledigit_sequence : ruledigit_sequence EOF ;
    public final void entryRuledigit_sequence() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:485:1: ( ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:486:1: ruledigit_sequence EOF
            {
             before(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence932);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getDigit_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence939); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:493:1: ruledigit_sequence : ( ( rule__Digit_sequence__Group__0 ) ) ;
    public final void ruledigit_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:497:2: ( ( ( rule__Digit_sequence__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:498:1: ( ( rule__Digit_sequence__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:498:1: ( ( rule__Digit_sequence__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:499:1: ( rule__Digit_sequence__Group__0 )
            {
             before(grammarAccess.getDigit_sequenceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:500:1: ( rule__Digit_sequence__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:500:2: rule__Digit_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__0_in_ruledigit_sequence965);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:512:1: entryRulesign : rulesign EOF ;
    public final void entryRulesign() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:513:1: ( rulesign EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:514:1: rulesign EOF
            {
             before(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign992);
            rulesign();

            state._fsp--;

             after(grammarAccess.getSignRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign999); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:521:1: rulesign : ( ( rule__Sign__Alternatives ) ) ;
    public final void rulesign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:525:2: ( ( ( rule__Sign__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:526:1: ( ( rule__Sign__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:526:1: ( ( rule__Sign__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:527:1: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:528:1: ( rule__Sign__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:528:2: rule__Sign__Alternatives
            {
            pushFollow(FOLLOW_rule__Sign__Alternatives_in_rulesign1025);
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


    // $ANTLR start "entryRuleletter"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:540:1: entryRuleletter : ruleletter EOF ;
    public final void entryRuleletter() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:541:1: ( ruleletter EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:542:1: ruleletter EOF
            {
             before(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_ruleletter_in_entryRuleletter1052);
            ruleletter();

            state._fsp--;

             after(grammarAccess.getLetterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletter1059); 

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
    // $ANTLR end "entryRuleletter"


    // $ANTLR start "ruleletter"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:549:1: ruleletter : ( ( rule__Letter__Alternatives ) ) ;
    public final void ruleletter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:553:2: ( ( ( rule__Letter__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:554:1: ( ( rule__Letter__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:554:1: ( ( rule__Letter__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:555:1: ( rule__Letter__Alternatives )
            {
             before(grammarAccess.getLetterAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:556:1: ( rule__Letter__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:556:2: rule__Letter__Alternatives
            {
            pushFollow(FOLLOW_rule__Letter__Alternatives_in_ruleletter1085);
            rule__Letter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleletter"


    // $ANTLR start "entryRuledigit"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:568:1: entryRuledigit : ruledigit EOF ;
    public final void entryRuledigit() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:569:1: ( ruledigit EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:570:1: ruledigit EOF
            {
             before(grammarAccess.getDigitRule()); 
            pushFollow(FOLLOW_ruledigit_in_entryRuledigit1112);
            ruledigit();

            state._fsp--;

             after(grammarAccess.getDigitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit1119); 

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
    // $ANTLR end "entryRuledigit"


    // $ANTLR start "ruledigit"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:577:1: ruledigit : ( ( rule__Digit__Alternatives ) ) ;
    public final void ruledigit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:581:2: ( ( ( rule__Digit__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:582:1: ( ( rule__Digit__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:582:1: ( ( rule__Digit__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:583:1: ( rule__Digit__Alternatives )
            {
             before(grammarAccess.getDigitAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:584:1: ( rule__Digit__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:584:2: rule__Digit__Alternatives
            {
            pushFollow(FOLLOW_rule__Digit__Alternatives_in_ruledigit1145);
            rule__Digit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDigitAccess().getAlternatives()); 

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
    // $ANTLR end "ruledigit"


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:596:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:597:1: ( rulelabel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:598:1: rulelabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1172);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1179); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:605:1: rulelabel : ( ruleinteger_number ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:609:2: ( ( ruleinteger_number ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:610:1: ( ruleinteger_number )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:610:1: ( ruleinteger_number )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:611:1: ruleinteger_number
            {
             before(grammarAccess.getLabelAccess().getInteger_numberParserRuleCall()); 
            pushFollow(FOLLOW_ruleinteger_number_in_rulelabel1205);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:628:1: rule__Type__Alternatives : ( ( 'simple_type' ) | ( 'structured_type' ) | ( 'pointer_type' ) | ( 'type_identifier' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:632:1: ( ( 'simple_type' ) | ( 'structured_type' ) | ( 'pointer_type' ) | ( 'type_identifier' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:633:1: ( 'simple_type' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:633:1: ( 'simple_type' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:634:1: 'simple_type'
                    {
                     before(grammarAccess.getTypeAccess().getSimple_typeKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives1245); 
                     after(grammarAccess.getTypeAccess().getSimple_typeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:641:6: ( 'structured_type' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:641:6: ( 'structured_type' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:642:1: 'structured_type'
                    {
                     before(grammarAccess.getTypeAccess().getStructured_typeKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives1265); 
                     after(grammarAccess.getTypeAccess().getStructured_typeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:649:6: ( 'pointer_type' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:649:6: ( 'pointer_type' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:650:1: 'pointer_type'
                    {
                     before(grammarAccess.getTypeAccess().getPointer_typeKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives1285); 
                     after(grammarAccess.getTypeAccess().getPointer_typeKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:657:6: ( 'type_identifier' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:657:6: ( 'type_identifier' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:658:1: 'type_identifier'
                    {
                     before(grammarAccess.getTypeAccess().getType_identifierKeyword_3()); 
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives1305); 
                     after(grammarAccess.getTypeAccess().getType_identifierKeyword_3()); 

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


    // $ANTLR start "rule__Identifier2__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:670:1: rule__Identifier2__Alternatives : ( ( ruleletter ) | ( ruledigit ) );
    public final void rule__Identifier2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:674:1: ( ( ruleletter ) | ( ruledigit ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=70)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=71 && LA4_0<=80)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:675:1: ( ruleletter )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:675:1: ( ruleletter )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:676:1: ruleletter
                    {
                     before(grammarAccess.getIdentifier2Access().getLetterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleletter_in_rule__Identifier2__Alternatives1339);
                    ruleletter();

                    state._fsp--;

                     after(grammarAccess.getIdentifier2Access().getLetterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:681:6: ( ruledigit )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:681:6: ( ruledigit )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:682:1: ruledigit
                    {
                     before(grammarAccess.getIdentifier2Access().getDigitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruledigit_in_rule__Identifier2__Alternatives1356);
                    ruledigit();

                    state._fsp--;

                     after(grammarAccess.getIdentifier2Access().getDigitParserRuleCall_1()); 

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
    // $ANTLR end "rule__Identifier2__Alternatives"


    // $ANTLR start "rule__Sign__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:693:1: rule__Sign__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:697:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:698:1: ( '+' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:698:1: ( '+' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:699:1: '+'
                    {
                     before(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__Sign__Alternatives1390); 
                     after(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:706:6: ( '-' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:706:6: ( '-' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:707:1: '-'
                    {
                     before(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__Sign__Alternatives1410); 
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


    // $ANTLR start "rule__Letter__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:719:1: rule__Letter__Alternatives : ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'S' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'u' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) );
    public final void rule__Letter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:723:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'S' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'u' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) )
            int alt6=52;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 26:
                {
                alt6=8;
                }
                break;
            case 27:
                {
                alt6=9;
                }
                break;
            case 28:
                {
                alt6=10;
                }
                break;
            case 29:
                {
                alt6=11;
                }
                break;
            case 30:
                {
                alt6=12;
                }
                break;
            case 31:
                {
                alt6=13;
                }
                break;
            case 32:
                {
                alt6=14;
                }
                break;
            case 33:
                {
                alt6=15;
                }
                break;
            case 34:
                {
                alt6=16;
                }
                break;
            case 35:
                {
                alt6=17;
                }
                break;
            case 36:
                {
                alt6=18;
                }
                break;
            case 37:
                {
                alt6=19;
                }
                break;
            case 38:
                {
                alt6=20;
                }
                break;
            case 39:
                {
                alt6=21;
                }
                break;
            case 40:
                {
                alt6=22;
                }
                break;
            case 41:
                {
                alt6=23;
                }
                break;
            case 42:
                {
                alt6=24;
                }
                break;
            case 43:
                {
                alt6=25;
                }
                break;
            case 44:
                {
                alt6=26;
                }
                break;
            case 45:
                {
                alt6=27;
                }
                break;
            case 46:
                {
                alt6=28;
                }
                break;
            case 47:
                {
                alt6=29;
                }
                break;
            case 48:
                {
                alt6=30;
                }
                break;
            case 49:
                {
                alt6=31;
                }
                break;
            case 50:
                {
                alt6=32;
                }
                break;
            case 51:
                {
                alt6=33;
                }
                break;
            case 52:
                {
                alt6=34;
                }
                break;
            case 53:
                {
                alt6=35;
                }
                break;
            case 54:
                {
                alt6=36;
                }
                break;
            case 55:
                {
                alt6=37;
                }
                break;
            case 56:
                {
                alt6=38;
                }
                break;
            case 57:
                {
                alt6=39;
                }
                break;
            case 58:
                {
                alt6=40;
                }
                break;
            case 59:
                {
                alt6=41;
                }
                break;
            case 60:
                {
                alt6=42;
                }
                break;
            case 61:
                {
                alt6=43;
                }
                break;
            case 62:
                {
                alt6=44;
                }
                break;
            case 63:
                {
                alt6=45;
                }
                break;
            case 64:
                {
                alt6=46;
                }
                break;
            case 65:
                {
                alt6=47;
                }
                break;
            case 66:
                {
                alt6=48;
                }
                break;
            case 67:
                {
                alt6=49;
                }
                break;
            case 68:
                {
                alt6=50;
                }
                break;
            case 69:
                {
                alt6=51;
                }
                break;
            case 70:
                {
                alt6=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:724:1: ( 'A' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:724:1: ( 'A' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:725:1: 'A'
                    {
                     before(grammarAccess.getLetterAccess().getAKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__Letter__Alternatives1445); 
                     after(grammarAccess.getLetterAccess().getAKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:732:6: ( 'B' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:732:6: ( 'B' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:733:1: 'B'
                    {
                     before(grammarAccess.getLetterAccess().getBKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__Letter__Alternatives1465); 
                     after(grammarAccess.getLetterAccess().getBKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:740:6: ( 'C' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:740:6: ( 'C' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:741:1: 'C'
                    {
                     before(grammarAccess.getLetterAccess().getCKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__Letter__Alternatives1485); 
                     after(grammarAccess.getLetterAccess().getCKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:748:6: ( 'D' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:748:6: ( 'D' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:749:1: 'D'
                    {
                     before(grammarAccess.getLetterAccess().getDKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__Letter__Alternatives1505); 
                     after(grammarAccess.getLetterAccess().getDKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:756:6: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:756:6: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:757:1: 'E'
                    {
                     before(grammarAccess.getLetterAccess().getEKeyword_4()); 
                    match(input,23,FOLLOW_23_in_rule__Letter__Alternatives1525); 
                     after(grammarAccess.getLetterAccess().getEKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:764:6: ( 'F' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:764:6: ( 'F' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:765:1: 'F'
                    {
                     before(grammarAccess.getLetterAccess().getFKeyword_5()); 
                    match(input,24,FOLLOW_24_in_rule__Letter__Alternatives1545); 
                     after(grammarAccess.getLetterAccess().getFKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:772:6: ( 'G' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:772:6: ( 'G' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:773:1: 'G'
                    {
                     before(grammarAccess.getLetterAccess().getGKeyword_6()); 
                    match(input,25,FOLLOW_25_in_rule__Letter__Alternatives1565); 
                     after(grammarAccess.getLetterAccess().getGKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:780:6: ( 'H' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:780:6: ( 'H' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:781:1: 'H'
                    {
                     before(grammarAccess.getLetterAccess().getHKeyword_7()); 
                    match(input,26,FOLLOW_26_in_rule__Letter__Alternatives1585); 
                     after(grammarAccess.getLetterAccess().getHKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:788:6: ( 'I' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:788:6: ( 'I' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:789:1: 'I'
                    {
                     before(grammarAccess.getLetterAccess().getIKeyword_8()); 
                    match(input,27,FOLLOW_27_in_rule__Letter__Alternatives1605); 
                     after(grammarAccess.getLetterAccess().getIKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:796:6: ( 'J' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:796:6: ( 'J' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:797:1: 'J'
                    {
                     before(grammarAccess.getLetterAccess().getJKeyword_9()); 
                    match(input,28,FOLLOW_28_in_rule__Letter__Alternatives1625); 
                     after(grammarAccess.getLetterAccess().getJKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:804:6: ( 'K' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:804:6: ( 'K' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:805:1: 'K'
                    {
                     before(grammarAccess.getLetterAccess().getKKeyword_10()); 
                    match(input,29,FOLLOW_29_in_rule__Letter__Alternatives1645); 
                     after(grammarAccess.getLetterAccess().getKKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:812:6: ( 'L' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:812:6: ( 'L' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:813:1: 'L'
                    {
                     before(grammarAccess.getLetterAccess().getLKeyword_11()); 
                    match(input,30,FOLLOW_30_in_rule__Letter__Alternatives1665); 
                     after(grammarAccess.getLetterAccess().getLKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:820:6: ( 'M' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:820:6: ( 'M' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:821:1: 'M'
                    {
                     before(grammarAccess.getLetterAccess().getMKeyword_12()); 
                    match(input,31,FOLLOW_31_in_rule__Letter__Alternatives1685); 
                     after(grammarAccess.getLetterAccess().getMKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:828:6: ( 'N' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:828:6: ( 'N' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:829:1: 'N'
                    {
                     before(grammarAccess.getLetterAccess().getNKeyword_13()); 
                    match(input,32,FOLLOW_32_in_rule__Letter__Alternatives1705); 
                     after(grammarAccess.getLetterAccess().getNKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:836:6: ( 'O' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:836:6: ( 'O' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:837:1: 'O'
                    {
                     before(grammarAccess.getLetterAccess().getOKeyword_14()); 
                    match(input,33,FOLLOW_33_in_rule__Letter__Alternatives1725); 
                     after(grammarAccess.getLetterAccess().getOKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:844:6: ( 'P' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:844:6: ( 'P' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:845:1: 'P'
                    {
                     before(grammarAccess.getLetterAccess().getPKeyword_15()); 
                    match(input,34,FOLLOW_34_in_rule__Letter__Alternatives1745); 
                     after(grammarAccess.getLetterAccess().getPKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:852:6: ( 'Q' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:852:6: ( 'Q' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:853:1: 'Q'
                    {
                     before(grammarAccess.getLetterAccess().getQKeyword_16()); 
                    match(input,35,FOLLOW_35_in_rule__Letter__Alternatives1765); 
                     after(grammarAccess.getLetterAccess().getQKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:860:6: ( 'R' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:860:6: ( 'R' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:861:1: 'R'
                    {
                     before(grammarAccess.getLetterAccess().getRKeyword_17()); 
                    match(input,36,FOLLOW_36_in_rule__Letter__Alternatives1785); 
                     after(grammarAccess.getLetterAccess().getRKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:868:6: ( 'S' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:868:6: ( 'S' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:869:1: 'S'
                    {
                     before(grammarAccess.getLetterAccess().getSKeyword_18()); 
                    match(input,37,FOLLOW_37_in_rule__Letter__Alternatives1805); 
                     after(grammarAccess.getLetterAccess().getSKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:876:6: ( 'T' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:876:6: ( 'T' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:877:1: 'T'
                    {
                     before(grammarAccess.getLetterAccess().getTKeyword_19()); 
                    match(input,38,FOLLOW_38_in_rule__Letter__Alternatives1825); 
                     after(grammarAccess.getLetterAccess().getTKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:884:6: ( 'U' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:884:6: ( 'U' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:885:1: 'U'
                    {
                     before(grammarAccess.getLetterAccess().getUKeyword_20()); 
                    match(input,39,FOLLOW_39_in_rule__Letter__Alternatives1845); 
                     after(grammarAccess.getLetterAccess().getUKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:892:6: ( 'V' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:892:6: ( 'V' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:893:1: 'V'
                    {
                     before(grammarAccess.getLetterAccess().getVKeyword_21()); 
                    match(input,40,FOLLOW_40_in_rule__Letter__Alternatives1865); 
                     after(grammarAccess.getLetterAccess().getVKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:900:6: ( 'W' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:900:6: ( 'W' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:901:1: 'W'
                    {
                     before(grammarAccess.getLetterAccess().getWKeyword_22()); 
                    match(input,41,FOLLOW_41_in_rule__Letter__Alternatives1885); 
                     after(grammarAccess.getLetterAccess().getWKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:908:6: ( 'X' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:908:6: ( 'X' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:909:1: 'X'
                    {
                     before(grammarAccess.getLetterAccess().getXKeyword_23()); 
                    match(input,42,FOLLOW_42_in_rule__Letter__Alternatives1905); 
                     after(grammarAccess.getLetterAccess().getXKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:916:6: ( 'Y' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:916:6: ( 'Y' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:917:1: 'Y'
                    {
                     before(grammarAccess.getLetterAccess().getYKeyword_24()); 
                    match(input,43,FOLLOW_43_in_rule__Letter__Alternatives1925); 
                     after(grammarAccess.getLetterAccess().getYKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:924:6: ( 'Z' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:924:6: ( 'Z' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:925:1: 'Z'
                    {
                     before(grammarAccess.getLetterAccess().getZKeyword_25()); 
                    match(input,44,FOLLOW_44_in_rule__Letter__Alternatives1945); 
                     after(grammarAccess.getLetterAccess().getZKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:932:6: ( 'a' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:932:6: ( 'a' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:933:1: 'a'
                    {
                     before(grammarAccess.getLetterAccess().getAKeyword_26()); 
                    match(input,45,FOLLOW_45_in_rule__Letter__Alternatives1965); 
                     after(grammarAccess.getLetterAccess().getAKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:940:6: ( 'b' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:940:6: ( 'b' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:941:1: 'b'
                    {
                     before(grammarAccess.getLetterAccess().getBKeyword_27()); 
                    match(input,46,FOLLOW_46_in_rule__Letter__Alternatives1985); 
                     after(grammarAccess.getLetterAccess().getBKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:948:6: ( 'c' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:948:6: ( 'c' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:949:1: 'c'
                    {
                     before(grammarAccess.getLetterAccess().getCKeyword_28()); 
                    match(input,47,FOLLOW_47_in_rule__Letter__Alternatives2005); 
                     after(grammarAccess.getLetterAccess().getCKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:956:6: ( 'd' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:956:6: ( 'd' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:957:1: 'd'
                    {
                     before(grammarAccess.getLetterAccess().getDKeyword_29()); 
                    match(input,48,FOLLOW_48_in_rule__Letter__Alternatives2025); 
                     after(grammarAccess.getLetterAccess().getDKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:964:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:964:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:965:1: 'e'
                    {
                     before(grammarAccess.getLetterAccess().getEKeyword_30()); 
                    match(input,49,FOLLOW_49_in_rule__Letter__Alternatives2045); 
                     after(grammarAccess.getLetterAccess().getEKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:972:6: ( 'f' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:972:6: ( 'f' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:973:1: 'f'
                    {
                     before(grammarAccess.getLetterAccess().getFKeyword_31()); 
                    match(input,50,FOLLOW_50_in_rule__Letter__Alternatives2065); 
                     after(grammarAccess.getLetterAccess().getFKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:980:6: ( 'g' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:980:6: ( 'g' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:981:1: 'g'
                    {
                     before(grammarAccess.getLetterAccess().getGKeyword_32()); 
                    match(input,51,FOLLOW_51_in_rule__Letter__Alternatives2085); 
                     after(grammarAccess.getLetterAccess().getGKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:988:6: ( 'h' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:988:6: ( 'h' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:989:1: 'h'
                    {
                     before(grammarAccess.getLetterAccess().getHKeyword_33()); 
                    match(input,52,FOLLOW_52_in_rule__Letter__Alternatives2105); 
                     after(grammarAccess.getLetterAccess().getHKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:996:6: ( 'i' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:996:6: ( 'i' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:997:1: 'i'
                    {
                     before(grammarAccess.getLetterAccess().getIKeyword_34()); 
                    match(input,53,FOLLOW_53_in_rule__Letter__Alternatives2125); 
                     after(grammarAccess.getLetterAccess().getIKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1004:6: ( 'j' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1004:6: ( 'j' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1005:1: 'j'
                    {
                     before(grammarAccess.getLetterAccess().getJKeyword_35()); 
                    match(input,54,FOLLOW_54_in_rule__Letter__Alternatives2145); 
                     after(grammarAccess.getLetterAccess().getJKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1012:6: ( 'k' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1012:6: ( 'k' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1013:1: 'k'
                    {
                     before(grammarAccess.getLetterAccess().getKKeyword_36()); 
                    match(input,55,FOLLOW_55_in_rule__Letter__Alternatives2165); 
                     after(grammarAccess.getLetterAccess().getKKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1020:6: ( 'l' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1020:6: ( 'l' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1021:1: 'l'
                    {
                     before(grammarAccess.getLetterAccess().getLKeyword_37()); 
                    match(input,56,FOLLOW_56_in_rule__Letter__Alternatives2185); 
                     after(grammarAccess.getLetterAccess().getLKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1028:6: ( 'm' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1028:6: ( 'm' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1029:1: 'm'
                    {
                     before(grammarAccess.getLetterAccess().getMKeyword_38()); 
                    match(input,57,FOLLOW_57_in_rule__Letter__Alternatives2205); 
                     after(grammarAccess.getLetterAccess().getMKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1036:6: ( 'n' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1036:6: ( 'n' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1037:1: 'n'
                    {
                     before(grammarAccess.getLetterAccess().getNKeyword_39()); 
                    match(input,58,FOLLOW_58_in_rule__Letter__Alternatives2225); 
                     after(grammarAccess.getLetterAccess().getNKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1044:6: ( 'o' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1044:6: ( 'o' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1045:1: 'o'
                    {
                     before(grammarAccess.getLetterAccess().getOKeyword_40()); 
                    match(input,59,FOLLOW_59_in_rule__Letter__Alternatives2245); 
                     after(grammarAccess.getLetterAccess().getOKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1052:6: ( 'p' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1052:6: ( 'p' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1053:1: 'p'
                    {
                     before(grammarAccess.getLetterAccess().getPKeyword_41()); 
                    match(input,60,FOLLOW_60_in_rule__Letter__Alternatives2265); 
                     after(grammarAccess.getLetterAccess().getPKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1060:6: ( 'q' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1060:6: ( 'q' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1061:1: 'q'
                    {
                     before(grammarAccess.getLetterAccess().getQKeyword_42()); 
                    match(input,61,FOLLOW_61_in_rule__Letter__Alternatives2285); 
                     after(grammarAccess.getLetterAccess().getQKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1068:6: ( 'r' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1068:6: ( 'r' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1069:1: 'r'
                    {
                     before(grammarAccess.getLetterAccess().getRKeyword_43()); 
                    match(input,62,FOLLOW_62_in_rule__Letter__Alternatives2305); 
                     after(grammarAccess.getLetterAccess().getRKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1076:6: ( 's' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1076:6: ( 's' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1077:1: 's'
                    {
                     before(grammarAccess.getLetterAccess().getSKeyword_44()); 
                    match(input,63,FOLLOW_63_in_rule__Letter__Alternatives2325); 
                     after(grammarAccess.getLetterAccess().getSKeyword_44()); 

                    }


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1084:6: ( 't' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1084:6: ( 't' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1085:1: 't'
                    {
                     before(grammarAccess.getLetterAccess().getTKeyword_45()); 
                    match(input,64,FOLLOW_64_in_rule__Letter__Alternatives2345); 
                     after(grammarAccess.getLetterAccess().getTKeyword_45()); 

                    }


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1092:6: ( 'u' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1092:6: ( 'u' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1093:1: 'u'
                    {
                     before(grammarAccess.getLetterAccess().getUKeyword_46()); 
                    match(input,65,FOLLOW_65_in_rule__Letter__Alternatives2365); 
                     after(grammarAccess.getLetterAccess().getUKeyword_46()); 

                    }


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1100:6: ( 'v' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1100:6: ( 'v' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1101:1: 'v'
                    {
                     before(grammarAccess.getLetterAccess().getVKeyword_47()); 
                    match(input,66,FOLLOW_66_in_rule__Letter__Alternatives2385); 
                     after(grammarAccess.getLetterAccess().getVKeyword_47()); 

                    }


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1108:6: ( 'w' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1108:6: ( 'w' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1109:1: 'w'
                    {
                     before(grammarAccess.getLetterAccess().getWKeyword_48()); 
                    match(input,67,FOLLOW_67_in_rule__Letter__Alternatives2405); 
                     after(grammarAccess.getLetterAccess().getWKeyword_48()); 

                    }


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1116:6: ( 'x' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1116:6: ( 'x' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1117:1: 'x'
                    {
                     before(grammarAccess.getLetterAccess().getXKeyword_49()); 
                    match(input,68,FOLLOW_68_in_rule__Letter__Alternatives2425); 
                     after(grammarAccess.getLetterAccess().getXKeyword_49()); 

                    }


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1124:6: ( 'y' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1124:6: ( 'y' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1125:1: 'y'
                    {
                     before(grammarAccess.getLetterAccess().getYKeyword_50()); 
                    match(input,69,FOLLOW_69_in_rule__Letter__Alternatives2445); 
                     after(grammarAccess.getLetterAccess().getYKeyword_50()); 

                    }


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1132:6: ( 'z' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1132:6: ( 'z' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1133:1: 'z'
                    {
                     before(grammarAccess.getLetterAccess().getZKeyword_51()); 
                    match(input,70,FOLLOW_70_in_rule__Letter__Alternatives2465); 
                     after(grammarAccess.getLetterAccess().getZKeyword_51()); 

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
    // $ANTLR end "rule__Letter__Alternatives"


    // $ANTLR start "rule__Digit__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1145:1: rule__Digit__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__Digit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1149:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt7=1;
                }
                break;
            case 72:
                {
                alt7=2;
                }
                break;
            case 73:
                {
                alt7=3;
                }
                break;
            case 74:
                {
                alt7=4;
                }
                break;
            case 75:
                {
                alt7=5;
                }
                break;
            case 76:
                {
                alt7=6;
                }
                break;
            case 77:
                {
                alt7=7;
                }
                break;
            case 78:
                {
                alt7=8;
                }
                break;
            case 79:
                {
                alt7=9;
                }
                break;
            case 80:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1150:1: ( '0' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1150:1: ( '0' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1151:1: '0'
                    {
                     before(grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
                    match(input,71,FOLLOW_71_in_rule__Digit__Alternatives2500); 
                     after(grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1158:6: ( '1' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1158:6: ( '1' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1159:1: '1'
                    {
                     before(grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
                    match(input,72,FOLLOW_72_in_rule__Digit__Alternatives2520); 
                     after(grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1166:6: ( '2' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1166:6: ( '2' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1167:1: '2'
                    {
                     before(grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
                    match(input,73,FOLLOW_73_in_rule__Digit__Alternatives2540); 
                     after(grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1174:6: ( '3' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1174:6: ( '3' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1175:1: '3'
                    {
                     before(grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
                    match(input,74,FOLLOW_74_in_rule__Digit__Alternatives2560); 
                     after(grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1182:6: ( '4' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1182:6: ( '4' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1183:1: '4'
                    {
                     before(grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
                    match(input,75,FOLLOW_75_in_rule__Digit__Alternatives2580); 
                     after(grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1190:6: ( '5' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1190:6: ( '5' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1191:1: '5'
                    {
                     before(grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
                    match(input,76,FOLLOW_76_in_rule__Digit__Alternatives2600); 
                     after(grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1198:6: ( '6' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1198:6: ( '6' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1199:1: '6'
                    {
                     before(grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
                    match(input,77,FOLLOW_77_in_rule__Digit__Alternatives2620); 
                     after(grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1206:6: ( '7' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1206:6: ( '7' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1207:1: '7'
                    {
                     before(grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
                    match(input,78,FOLLOW_78_in_rule__Digit__Alternatives2640); 
                     after(grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1214:6: ( '8' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1214:6: ( '8' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1215:1: '8'
                    {
                     before(grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
                    match(input,79,FOLLOW_79_in_rule__Digit__Alternatives2660); 
                     after(grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1222:6: ( '9' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1222:6: ( '9' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1223:1: '9'
                    {
                     before(grammarAccess.getDigitAccess().getDigitNineKeyword_9()); 
                    match(input,80,FOLLOW_80_in_rule__Digit__Alternatives2680); 
                     after(grammarAccess.getDigitAccess().getDigitNineKeyword_9()); 

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
    // $ANTLR end "rule__Digit__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1238:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1242:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1243:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02713);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02716);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1250:1: rule__Program__Group__0__Impl : ( ruleprogram_heading ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1254:1: ( ( ruleprogram_heading ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1255:1: ( ruleprogram_heading )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1255:1: ( ruleprogram_heading )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1256:1: ruleprogram_heading
            {
             before(grammarAccess.getProgramAccess().getProgram_headingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_heading_in_rule__Program__Group__0__Impl2743);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1267:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1271:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1272:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12772);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12775);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1279:1: rule__Program__Group__1__Impl : ( ruleblock ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1283:1: ( ( ruleblock ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1284:1: ( ruleblock )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1284:1: ( ruleblock )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1285:1: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleblock_in_rule__Program__Group__1__Impl2802);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1296:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1300:1: ( rule__Program__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1301:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22831);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1307:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1311:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1312:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1312:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1313:1: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,81,FOLLOW_81_in_rule__Program__Group__2__Impl2859); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1332:1: rule__Program_heading__Group__0 : rule__Program_heading__Group__0__Impl rule__Program_heading__Group__1 ;
    public final void rule__Program_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1336:1: ( rule__Program_heading__Group__0__Impl rule__Program_heading__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1337:2: rule__Program_heading__Group__0__Impl rule__Program_heading__Group__1
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__0__Impl_in_rule__Program_heading__Group__02896);
            rule__Program_heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group__1_in_rule__Program_heading__Group__02899);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1344:1: rule__Program_heading__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1348:1: ( ( 'program' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1349:1: ( 'program' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1349:1: ( 'program' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1350:1: 'program'
            {
             before(grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 
            match(input,82,FOLLOW_82_in_rule__Program_heading__Group__0__Impl2927); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1363:1: rule__Program_heading__Group__1 : rule__Program_heading__Group__1__Impl rule__Program_heading__Group__2 ;
    public final void rule__Program_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1367:1: ( rule__Program_heading__Group__1__Impl rule__Program_heading__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1368:2: rule__Program_heading__Group__1__Impl rule__Program_heading__Group__2
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__1__Impl_in_rule__Program_heading__Group__12958);
            rule__Program_heading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group__2_in_rule__Program_heading__Group__12961);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1375:1: rule__Program_heading__Group__1__Impl : ( ruleidentifier ) ;
    public final void rule__Program_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1379:1: ( ( ruleidentifier ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1380:1: ( ruleidentifier )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1380:1: ( ruleidentifier )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1381:1: ruleidentifier
            {
             before(grammarAccess.getProgram_headingAccess().getIdentifierParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleidentifier_in_rule__Program_heading__Group__1__Impl2988);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getProgram_headingAccess().getIdentifierParserRuleCall_1()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1392:1: rule__Program_heading__Group__2 : rule__Program_heading__Group__2__Impl rule__Program_heading__Group__3 ;
    public final void rule__Program_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1396:1: ( rule__Program_heading__Group__2__Impl rule__Program_heading__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1397:2: rule__Program_heading__Group__2__Impl rule__Program_heading__Group__3
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__2__Impl_in_rule__Program_heading__Group__23017);
            rule__Program_heading__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group__3_in_rule__Program_heading__Group__23020);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1404:1: rule__Program_heading__Group__2__Impl : ( '(' ) ;
    public final void rule__Program_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1408:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1409:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1409:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1410:1: '('
            {
             before(grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2()); 
            match(input,83,FOLLOW_83_in_rule__Program_heading__Group__2__Impl3048); 
             after(grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1423:1: rule__Program_heading__Group__3 : rule__Program_heading__Group__3__Impl rule__Program_heading__Group__4 ;
    public final void rule__Program_heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1427:1: ( rule__Program_heading__Group__3__Impl rule__Program_heading__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1428:2: rule__Program_heading__Group__3__Impl rule__Program_heading__Group__4
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__3__Impl_in_rule__Program_heading__Group__33079);
            rule__Program_heading__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group__4_in_rule__Program_heading__Group__33082);
            rule__Program_heading__Group__4();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1435:1: rule__Program_heading__Group__3__Impl : ( ruleidentifier_list ) ;
    public final void rule__Program_heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1439:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1440:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1440:1: ( ruleidentifier_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1441:1: ruleidentifier_list
            {
             before(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Program_heading__Group__3__Impl3109);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_3()); 

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


    // $ANTLR start "rule__Program_heading__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1452:1: rule__Program_heading__Group__4 : rule__Program_heading__Group__4__Impl rule__Program_heading__Group__5 ;
    public final void rule__Program_heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1456:1: ( rule__Program_heading__Group__4__Impl rule__Program_heading__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1457:2: rule__Program_heading__Group__4__Impl rule__Program_heading__Group__5
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__4__Impl_in_rule__Program_heading__Group__43138);
            rule__Program_heading__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading__Group__5_in_rule__Program_heading__Group__43141);
            rule__Program_heading__Group__5();

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
    // $ANTLR end "rule__Program_heading__Group__4"


    // $ANTLR start "rule__Program_heading__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1464:1: rule__Program_heading__Group__4__Impl : ( ')' ) ;
    public final void rule__Program_heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1468:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1469:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1469:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1470:1: ')'
            {
             before(grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_4()); 
            match(input,84,FOLLOW_84_in_rule__Program_heading__Group__4__Impl3169); 
             after(grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Program_heading__Group__4__Impl"


    // $ANTLR start "rule__Program_heading__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1483:1: rule__Program_heading__Group__5 : rule__Program_heading__Group__5__Impl ;
    public final void rule__Program_heading__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1487:1: ( rule__Program_heading__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1488:2: rule__Program_heading__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading__Group__5__Impl_in_rule__Program_heading__Group__53200);
            rule__Program_heading__Group__5__Impl();

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
    // $ANTLR end "rule__Program_heading__Group__5"


    // $ANTLR start "rule__Program_heading__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1494:1: rule__Program_heading__Group__5__Impl : ( ';' ) ;
    public final void rule__Program_heading__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1498:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1499:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1499:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1500:1: ';'
            {
             before(grammarAccess.getProgram_headingAccess().getSemicolonKeyword_5()); 
            match(input,85,FOLLOW_85_in_rule__Program_heading__Group__5__Impl3228); 
             after(grammarAccess.getProgram_headingAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Program_heading__Group__5__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1525:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1529:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1530:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03271);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03274);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1537:1: rule__Block__Group__0__Impl : ( ruledeclaration_part ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1541:1: ( ( ruledeclaration_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1542:1: ( ruledeclaration_part )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1542:1: ( ruledeclaration_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1543:1: ruledeclaration_part
            {
             before(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl3301);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1554:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1558:1: ( rule__Block__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1559:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13330);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1565:1: rule__Block__Group__1__Impl : ( rulestatement_part ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1569:1: ( ( rulestatement_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1570:1: ( rulestatement_part )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1570:1: ( rulestatement_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1571:1: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl3357);
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


    // $ANTLR start "rule__Identifier__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1590:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1594:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1595:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__03394);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__03397);
            rule__Identifier__Group__1();

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
    // $ANTLR end "rule__Identifier__Group__0"


    // $ANTLR start "rule__Identifier__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1602:1: rule__Identifier__Group__0__Impl : ( ruleletter ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1606:1: ( ( ruleletter ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1607:1: ( ruleletter )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1607:1: ( ruleletter )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1608:1: ruleletter
            {
             before(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleletter_in_rule__Identifier__Group__0__Impl3424);
            ruleletter();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); 

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
    // $ANTLR end "rule__Identifier__Group__0__Impl"


    // $ANTLR start "rule__Identifier__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1619:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1623:1: ( rule__Identifier__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1624:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__13453);
            rule__Identifier__Group__1__Impl();

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
    // $ANTLR end "rule__Identifier__Group__1"


    // $ANTLR start "rule__Identifier__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1630:1: rule__Identifier__Group__1__Impl : ( ruleidentifier2 ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1634:1: ( ( ruleidentifier2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1635:1: ( ruleidentifier2 )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1635:1: ( ruleidentifier2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1636:1: ruleidentifier2
            {
             before(grammarAccess.getIdentifierAccess().getIdentifier2ParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleidentifier2_in_rule__Identifier__Group__1__Impl3480);
            ruleidentifier2();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getIdentifier2ParserRuleCall_1()); 

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
    // $ANTLR end "rule__Identifier__Group__1__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1651:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1655:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1656:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__03513);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__03516);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1663:1: rule__Identifier_list__Group__0__Impl : ( ruleidentifier ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1667:1: ( ( ruleidentifier ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1668:1: ( ruleidentifier )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1668:1: ( ruleidentifier )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1669:1: ruleidentifier
            {
             before(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleidentifier_in_rule__Identifier_list__Group__0__Impl3543);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_0()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1680:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1684:1: ( rule__Identifier_list__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1685:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__13572);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1691:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1695:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1696:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1696:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1697:1: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1698:1: ( rule__Identifier_list__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==86) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1698:2: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl3599);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1712:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1716:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1717:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__03634);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__03637);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1724:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1728:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1729:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1729:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1730:1: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,86,FOLLOW_86_in_rule__Identifier_list__Group_1__0__Impl3665); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1743:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1747:1: ( rule__Identifier_list__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1748:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__13696);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1754:1: rule__Identifier_list__Group_1__1__Impl : ( ruleidentifier ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1758:1: ( ( ruleidentifier ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1759:1: ( ruleidentifier )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1759:1: ( ruleidentifier )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1760:1: ruleidentifier
            {
             before(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleidentifier_in_rule__Identifier_list__Group_1__1__Impl3723);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_1_1()); 

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


    // $ANTLR start "rule__Unsigned_digit_sequence__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1776:1: rule__Unsigned_digit_sequence__Group__0 : rule__Unsigned_digit_sequence__Group__0__Impl rule__Unsigned_digit_sequence__Group__1 ;
    public final void rule__Unsigned_digit_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1780:1: ( rule__Unsigned_digit_sequence__Group__0__Impl rule__Unsigned_digit_sequence__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1781:2: rule__Unsigned_digit_sequence__Group__0__Impl rule__Unsigned_digit_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Unsigned_digit_sequence__Group__0__Impl_in_rule__Unsigned_digit_sequence__Group__03757);
            rule__Unsigned_digit_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unsigned_digit_sequence__Group__1_in_rule__Unsigned_digit_sequence__Group__03760);
            rule__Unsigned_digit_sequence__Group__1();

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
    // $ANTLR end "rule__Unsigned_digit_sequence__Group__0"


    // $ANTLR start "rule__Unsigned_digit_sequence__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1788:1: rule__Unsigned_digit_sequence__Group__0__Impl : ( ruledigit ) ;
    public final void rule__Unsigned_digit_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1792:1: ( ( ruledigit ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1793:1: ( ruledigit )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1793:1: ( ruledigit )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1794:1: ruledigit
            {
             before(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledigit_in_rule__Unsigned_digit_sequence__Group__0__Impl3787);
            ruledigit();

            state._fsp--;

             after(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); 

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
    // $ANTLR end "rule__Unsigned_digit_sequence__Group__0__Impl"


    // $ANTLR start "rule__Unsigned_digit_sequence__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1805:1: rule__Unsigned_digit_sequence__Group__1 : rule__Unsigned_digit_sequence__Group__1__Impl ;
    public final void rule__Unsigned_digit_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1809:1: ( rule__Unsigned_digit_sequence__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1810:2: rule__Unsigned_digit_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Unsigned_digit_sequence__Group__1__Impl_in_rule__Unsigned_digit_sequence__Group__13816);
            rule__Unsigned_digit_sequence__Group__1__Impl();

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
    // $ANTLR end "rule__Unsigned_digit_sequence__Group__1"


    // $ANTLR start "rule__Unsigned_digit_sequence__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1816:1: rule__Unsigned_digit_sequence__Group__1__Impl : ( ( ruledigit )* ) ;
    public final void rule__Unsigned_digit_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1820:1: ( ( ( ruledigit )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1821:1: ( ( ruledigit )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1821:1: ( ( ruledigit )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1822:1: ( ruledigit )*
            {
             before(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1823:1: ( ruledigit )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=71 && LA9_0<=80)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1823:3: ruledigit
            	    {
            	    pushFollow(FOLLOW_ruledigit_in_rule__Unsigned_digit_sequence__Group__1__Impl3844);
            	    ruledigit();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); 

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
    // $ANTLR end "rule__Unsigned_digit_sequence__Group__1__Impl"


    // $ANTLR start "rule__Digit_sequence__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1837:1: rule__Digit_sequence__Group__0 : rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1 ;
    public final void rule__Digit_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1841:1: ( rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1842:2: rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__0__Impl_in_rule__Digit_sequence__Group__03879);
            rule__Digit_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Digit_sequence__Group__1_in_rule__Digit_sequence__Group__03882);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1849:1: rule__Digit_sequence__Group__0__Impl : ( ( rulesign )? ) ;
    public final void rule__Digit_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1853:1: ( ( ( rulesign )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1854:1: ( ( rulesign )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1854:1: ( ( rulesign )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1855:1: ( rulesign )?
            {
             before(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1856:1: ( rulesign )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=17 && LA10_0<=18)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1856:3: rulesign
                    {
                    pushFollow(FOLLOW_rulesign_in_rule__Digit_sequence__Group__0__Impl3910);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1866:1: rule__Digit_sequence__Group__1 : rule__Digit_sequence__Group__1__Impl ;
    public final void rule__Digit_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1870:1: ( rule__Digit_sequence__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1871:2: rule__Digit_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__1__Impl_in_rule__Digit_sequence__Group__13941);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1877:1: rule__Digit_sequence__Group__1__Impl : ( ruleunsigned_digit_sequence ) ;
    public final void rule__Digit_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1881:1: ( ( ruleunsigned_digit_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1882:1: ( ruleunsigned_digit_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1882:1: ( ruleunsigned_digit_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1883:1: ruleunsigned_digit_sequence
            {
             before(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_rule__Digit_sequence__Group__1__Impl3968);
            ruleunsigned_digit_sequence();

            state._fsp--;

             after(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 

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


    // $ANTLR start "rule__Model__ProgramsAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1899:1: rule__Model__ProgramsAssignment : ( ruleprogram ) ;
    public final void rule__Model__ProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1903:1: ( ( ruleprogram ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1904:1: ( ruleprogram )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1904:1: ( ruleprogram )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1905:1: ruleprogram
            {
             before(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_in_rule__Model__ProgramsAssignment4006);
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
    public static final BitSet FOLLOW_rule__Model__ProgramsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleprogram157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__0_in_ruleprogram_heading217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleblock277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruledeclaration_part338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulestatement_part400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruletype473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_entryRuleidentifier502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0_in_ruleidentifier535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier2_in_entryRuleidentifier2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier2__Alternatives_in_ruleidentifier2595 = new BitSet(new long[]{0xFFFFFFFFFFF80002L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_rulefield_identifier_in_entryRulefield_identifier623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_identifier630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rulefield_identifier656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rulevariable_identifier717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0_in_ruleidentifier_list784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_digit_sequence879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_digit_sequence__Group__0_in_ruleunsigned_digit_sequence905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__0_in_ruledigit_sequence965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sign__Alternatives_in_rulesign1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_entryRuleletter1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletter1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Letter__Alternatives_in_ruleletter1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_entryRuledigit1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit__Alternatives_in_ruledigit1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rulelabel1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_rule__Identifier2__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_rule__Identifier2__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Sign__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sign__Alternatives1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Letter__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Letter__Alternatives1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Letter__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Letter__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Letter__Alternatives1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Letter__Alternatives1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Letter__Alternatives1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Letter__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Letter__Alternatives1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Letter__Alternatives1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Letter__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Letter__Alternatives1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Letter__Alternatives1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Letter__Alternatives1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Letter__Alternatives1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Letter__Alternatives1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Letter__Alternatives1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Letter__Alternatives1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Letter__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Letter__Alternatives1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Letter__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Letter__Alternatives1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Letter__Alternatives1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Letter__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Letter__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Letter__Alternatives1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Letter__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Letter__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Letter__Alternatives2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Letter__Alternatives2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Letter__Alternatives2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Letter__Alternatives2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Letter__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Letter__Alternatives2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Letter__Alternatives2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Letter__Alternatives2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Letter__Alternatives2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Letter__Alternatives2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Letter__Alternatives2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Letter__Alternatives2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Letter__Alternatives2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Letter__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Letter__Alternatives2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Letter__Alternatives2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Letter__Alternatives2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Letter__Alternatives2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Letter__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Letter__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Letter__Alternatives2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Letter__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Letter__Alternatives2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Letter__Alternatives2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__Digit__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Digit__Alternatives2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__Digit__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__Digit__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__Digit__Alternatives2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__Digit__Alternatives2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__Digit__Alternatives2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__Digit__Alternatives2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__Digit__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__Digit__Alternatives2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02713 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_rule__Program__Group__0__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Program__Group__1__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__Program__Group__2__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__0__Impl_in_rule__Program_heading__Group__02896 = new BitSet(new long[]{0xFFFFFFFFFFF80000L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__Program_heading__Group__1_in_rule__Program_heading__Group__02899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__Program_heading__Group__0__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__1__Impl_in_rule__Program_heading__Group__12958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__2_in_rule__Program_heading__Group__12961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rule__Program_heading__Group__1__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__2__Impl_in_rule__Program_heading__Group__23017 = new BitSet(new long[]{0xFFFFFFFFFFF80000L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__Program_heading__Group__3_in_rule__Program_heading__Group__23020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__Program_heading__Group__2__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__3__Impl_in_rule__Program_heading__Group__33079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__4_in_rule__Program_heading__Group__33082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Program_heading__Group__3__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__4__Impl_in_rule__Program_heading__Group__43138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__5_in_rule__Program_heading__Group__43141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__Program_heading__Group__4__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading__Group__5__Impl_in_rule__Program_heading__Group__53200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__Program_heading__Group__5__Impl3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03271 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__03394 = new BitSet(new long[]{0xFFFFFFFFFFF80000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__03397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_rule__Identifier__Group__0__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__13453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier2_in_rule__Identifier__Group__1__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__03513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__03516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rule__Identifier_list__Group__0__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__13572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl3599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__03634 = new BitSet(new long[]{0xFFFFFFFFFFF80000L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__03637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__Identifier_list__Group_1__0__Impl3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__13696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rule__Identifier_list__Group_1__1__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_digit_sequence__Group__0__Impl_in_rule__Unsigned_digit_sequence__Group__03757 = new BitSet(new long[]{0xFFFFFFFFFFF80000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_rule__Unsigned_digit_sequence__Group__1_in_rule__Unsigned_digit_sequence__Group__03760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_rule__Unsigned_digit_sequence__Group__0__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_digit_sequence__Group__1__Impl_in_rule__Unsigned_digit_sequence__Group__13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_rule__Unsigned_digit_sequence__Group__1__Impl3844 = new BitSet(new long[]{0xFFFFFFFFFFF80002L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__0__Impl_in_rule__Digit_sequence__Group__03879 = new BitSet(new long[]{0xFFFFFFFFFFF80000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__1_in_rule__Digit_sequence__Group__03882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_rule__Digit_sequence__Group__0__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__1__Impl_in_rule__Digit_sequence__Group__13941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_rule__Digit_sequence__Group__1__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rule__Model__ProgramsAssignment4006 = new BitSet(new long[]{0x0000000000000002L});

}