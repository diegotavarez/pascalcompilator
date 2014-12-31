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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'+'", "'-'"
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=62)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:89:1: ( ruleGreeting EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:97:1: ruleGreeting : ( ruleidentifier ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:101:2: ( ( ruleidentifier ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:102:1: ( ruleidentifier )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:102:1: ( ruleidentifier )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:103:1: ruleidentifier
            {
             before(grammarAccess.getGreetingAccess().getIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleidentifier_in_ruleGreeting155);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleinteger_number"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:118:1: entryRuleinteger_number : ruleinteger_number EOF ;
    public final void entryRuleinteger_number() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:119:1: ( ruleinteger_number EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:120:1: ruleinteger_number EOF
            {
             before(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number183);
            ruleinteger_number();

            state._fsp--;

             after(grammarAccess.getInteger_numberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number190); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:127:1: ruleinteger_number : ( ruledigit_sequence ) ;
    public final void ruleinteger_number() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:131:2: ( ( ruledigit_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:132:1: ( ruledigit_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:132:1: ( ruledigit_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:133:1: ruledigit_sequence
            {
             before(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number216);
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


    // $ANTLR start "entryRuleidentifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:146:1: entryRuleidentifier : ruleidentifier EOF ;
    public final void entryRuleidentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:147:1: ( ruleidentifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:148:1: ruleidentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleidentifier_in_entryRuleidentifier242);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier249); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:155:1: ruleidentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleidentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:159:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:160:1: ( ( rule__Identifier__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:160:1: ( ( rule__Identifier__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:161:1: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:162:1: ( rule__Identifier__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:162:2: rule__Identifier__Group__0
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0_in_ruleidentifier275);
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


    // $ANTLR start "entryRuleletter"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:174:1: entryRuleletter : ruleletter EOF ;
    public final void entryRuleletter() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:175:1: ( ruleletter EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:176:1: ruleletter EOF
            {
             before(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_ruleletter_in_entryRuleletter302);
            ruleletter();

            state._fsp--;

             after(grammarAccess.getLetterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletter309); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:183:1: ruleletter : ( ( rule__Letter__Alternatives ) ) ;
    public final void ruleletter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:187:2: ( ( ( rule__Letter__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:188:1: ( ( rule__Letter__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:188:1: ( ( rule__Letter__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:189:1: ( rule__Letter__Alternatives )
            {
             before(grammarAccess.getLetterAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:190:1: ( rule__Letter__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:190:2: rule__Letter__Alternatives
            {
            pushFollow(FOLLOW_rule__Letter__Alternatives_in_ruleletter335);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:202:1: entryRuledigit : ruledigit EOF ;
    public final void entryRuledigit() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:203:1: ( ruledigit EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:204:1: ruledigit EOF
            {
             before(grammarAccess.getDigitRule()); 
            pushFollow(FOLLOW_ruledigit_in_entryRuledigit362);
            ruledigit();

            state._fsp--;

             after(grammarAccess.getDigitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit369); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:211:1: ruledigit : ( ( rule__Digit__Alternatives ) ) ;
    public final void ruledigit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:215:2: ( ( ( rule__Digit__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:216:1: ( ( rule__Digit__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:216:1: ( ( rule__Digit__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:217:1: ( rule__Digit__Alternatives )
            {
             before(grammarAccess.getDigitAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:218:1: ( rule__Digit__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:218:2: rule__Digit__Alternatives
            {
            pushFollow(FOLLOW_rule__Digit__Alternatives_in_ruledigit395);
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


    // $ANTLR start "entryRuledigit_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:230:1: entryRuledigit_sequence : ruledigit_sequence EOF ;
    public final void entryRuledigit_sequence() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:231:1: ( ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:232:1: ruledigit_sequence EOF
            {
             before(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence422);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getDigit_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence429); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:239:1: ruledigit_sequence : ( ( rule__Digit_sequence__Group__0 ) ) ;
    public final void ruledigit_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:243:2: ( ( ( rule__Digit_sequence__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:244:1: ( ( rule__Digit_sequence__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:244:1: ( ( rule__Digit_sequence__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:245:1: ( rule__Digit_sequence__Group__0 )
            {
             before(grammarAccess.getDigit_sequenceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:246:1: ( rule__Digit_sequence__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:246:2: rule__Digit_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__0_in_ruledigit_sequence455);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:258:1: entryRulesign : rulesign EOF ;
    public final void entryRulesign() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:259:1: ( rulesign EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:260:1: rulesign EOF
            {
             before(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign482);
            rulesign();

            state._fsp--;

             after(grammarAccess.getSignRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign489); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:267:1: rulesign : ( ( rule__Sign__Alternatives ) ) ;
    public final void rulesign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:271:2: ( ( ( rule__Sign__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:272:1: ( ( rule__Sign__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:272:1: ( ( rule__Sign__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:273:1: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:274:1: ( rule__Sign__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:274:2: rule__Sign__Alternatives
            {
            pushFollow(FOLLOW_rule__Sign__Alternatives_in_rulesign515);
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


    // $ANTLR start "entryRuleunsigned_digit_sequence"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:286:1: entryRuleunsigned_digit_sequence : ruleunsigned_digit_sequence EOF ;
    public final void entryRuleunsigned_digit_sequence() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:287:1: ( ruleunsigned_digit_sequence EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:288:1: ruleunsigned_digit_sequence EOF
            {
             before(grammarAccess.getUnsigned_digit_sequenceRule()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence542);
            ruleunsigned_digit_sequence();

            state._fsp--;

             after(grammarAccess.getUnsigned_digit_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_digit_sequence549); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:295:1: ruleunsigned_digit_sequence : ( ( rule__Unsigned_digit_sequence__Group__0 ) ) ;
    public final void ruleunsigned_digit_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:299:2: ( ( ( rule__Unsigned_digit_sequence__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:300:1: ( ( rule__Unsigned_digit_sequence__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:300:1: ( ( rule__Unsigned_digit_sequence__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:301:1: ( rule__Unsigned_digit_sequence__Group__0 )
            {
             before(grammarAccess.getUnsigned_digit_sequenceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:302:1: ( rule__Unsigned_digit_sequence__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:302:2: rule__Unsigned_digit_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Unsigned_digit_sequence__Group__0_in_ruleunsigned_digit_sequence575);
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


    // $ANTLR start "rule__Identifier__Alternatives_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:314:1: rule__Identifier__Alternatives_1 : ( ( ruleletter ) | ( ruledigit ) );
    public final void rule__Identifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:318:1: ( ( ruleletter ) | ( ruledigit ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=62)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=63 && LA2_0<=72)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:319:1: ( ruleletter )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:319:1: ( ruleletter )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:320:1: ruleletter
                    {
                     before(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleletter_in_rule__Identifier__Alternatives_1611);
                    ruleletter();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:325:6: ( ruledigit )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:325:6: ( ruledigit )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:326:1: ruledigit
                    {
                     before(grammarAccess.getIdentifierAccess().getDigitParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruledigit_in_rule__Identifier__Alternatives_1628);
                    ruledigit();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getDigitParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Identifier__Alternatives_1"


    // $ANTLR start "rule__Letter__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:336:1: rule__Letter__Alternatives : ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'S' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'u' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) );
    public final void rule__Letter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:340:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'S' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'u' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) )
            int alt3=52;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            case 21:
                {
                alt3=11;
                }
                break;
            case 22:
                {
                alt3=12;
                }
                break;
            case 23:
                {
                alt3=13;
                }
                break;
            case 24:
                {
                alt3=14;
                }
                break;
            case 25:
                {
                alt3=15;
                }
                break;
            case 26:
                {
                alt3=16;
                }
                break;
            case 27:
                {
                alt3=17;
                }
                break;
            case 28:
                {
                alt3=18;
                }
                break;
            case 29:
                {
                alt3=19;
                }
                break;
            case 30:
                {
                alt3=20;
                }
                break;
            case 31:
                {
                alt3=21;
                }
                break;
            case 32:
                {
                alt3=22;
                }
                break;
            case 33:
                {
                alt3=23;
                }
                break;
            case 34:
                {
                alt3=24;
                }
                break;
            case 35:
                {
                alt3=25;
                }
                break;
            case 36:
                {
                alt3=26;
                }
                break;
            case 37:
                {
                alt3=27;
                }
                break;
            case 38:
                {
                alt3=28;
                }
                break;
            case 39:
                {
                alt3=29;
                }
                break;
            case 40:
                {
                alt3=30;
                }
                break;
            case 41:
                {
                alt3=31;
                }
                break;
            case 42:
                {
                alt3=32;
                }
                break;
            case 43:
                {
                alt3=33;
                }
                break;
            case 44:
                {
                alt3=34;
                }
                break;
            case 45:
                {
                alt3=35;
                }
                break;
            case 46:
                {
                alt3=36;
                }
                break;
            case 47:
                {
                alt3=37;
                }
                break;
            case 48:
                {
                alt3=38;
                }
                break;
            case 49:
                {
                alt3=39;
                }
                break;
            case 50:
                {
                alt3=40;
                }
                break;
            case 51:
                {
                alt3=41;
                }
                break;
            case 52:
                {
                alt3=42;
                }
                break;
            case 53:
                {
                alt3=43;
                }
                break;
            case 54:
                {
                alt3=44;
                }
                break;
            case 55:
                {
                alt3=45;
                }
                break;
            case 56:
                {
                alt3=46;
                }
                break;
            case 57:
                {
                alt3=47;
                }
                break;
            case 58:
                {
                alt3=48;
                }
                break;
            case 59:
                {
                alt3=49;
                }
                break;
            case 60:
                {
                alt3=50;
                }
                break;
            case 61:
                {
                alt3=51;
                }
                break;
            case 62:
                {
                alt3=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:341:1: ( 'A' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:341:1: ( 'A' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:342:1: 'A'
                    {
                     before(grammarAccess.getLetterAccess().getAKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Letter__Alternatives661); 
                     after(grammarAccess.getLetterAccess().getAKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:349:6: ( 'B' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:349:6: ( 'B' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:350:1: 'B'
                    {
                     before(grammarAccess.getLetterAccess().getBKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Letter__Alternatives681); 
                     after(grammarAccess.getLetterAccess().getBKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:357:6: ( 'C' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:357:6: ( 'C' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:358:1: 'C'
                    {
                     before(grammarAccess.getLetterAccess().getCKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Letter__Alternatives701); 
                     after(grammarAccess.getLetterAccess().getCKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:365:6: ( 'D' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:365:6: ( 'D' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:366:1: 'D'
                    {
                     before(grammarAccess.getLetterAccess().getDKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Letter__Alternatives721); 
                     after(grammarAccess.getLetterAccess().getDKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:373:6: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:373:6: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:374:1: 'E'
                    {
                     before(grammarAccess.getLetterAccess().getEKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Letter__Alternatives741); 
                     after(grammarAccess.getLetterAccess().getEKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:381:6: ( 'F' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:381:6: ( 'F' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:382:1: 'F'
                    {
                     before(grammarAccess.getLetterAccess().getFKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Letter__Alternatives761); 
                     after(grammarAccess.getLetterAccess().getFKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:389:6: ( 'G' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:389:6: ( 'G' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:390:1: 'G'
                    {
                     before(grammarAccess.getLetterAccess().getGKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__Letter__Alternatives781); 
                     after(grammarAccess.getLetterAccess().getGKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:397:6: ( 'H' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:397:6: ( 'H' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:398:1: 'H'
                    {
                     before(grammarAccess.getLetterAccess().getHKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__Letter__Alternatives801); 
                     after(grammarAccess.getLetterAccess().getHKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:405:6: ( 'I' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:405:6: ( 'I' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:406:1: 'I'
                    {
                     before(grammarAccess.getLetterAccess().getIKeyword_8()); 
                    match(input,19,FOLLOW_19_in_rule__Letter__Alternatives821); 
                     after(grammarAccess.getLetterAccess().getIKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:413:6: ( 'J' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:413:6: ( 'J' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:414:1: 'J'
                    {
                     before(grammarAccess.getLetterAccess().getJKeyword_9()); 
                    match(input,20,FOLLOW_20_in_rule__Letter__Alternatives841); 
                     after(grammarAccess.getLetterAccess().getJKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:421:6: ( 'K' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:421:6: ( 'K' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:422:1: 'K'
                    {
                     before(grammarAccess.getLetterAccess().getKKeyword_10()); 
                    match(input,21,FOLLOW_21_in_rule__Letter__Alternatives861); 
                     after(grammarAccess.getLetterAccess().getKKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:429:6: ( 'L' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:429:6: ( 'L' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:430:1: 'L'
                    {
                     before(grammarAccess.getLetterAccess().getLKeyword_11()); 
                    match(input,22,FOLLOW_22_in_rule__Letter__Alternatives881); 
                     after(grammarAccess.getLetterAccess().getLKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:437:6: ( 'M' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:437:6: ( 'M' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:438:1: 'M'
                    {
                     before(grammarAccess.getLetterAccess().getMKeyword_12()); 
                    match(input,23,FOLLOW_23_in_rule__Letter__Alternatives901); 
                     after(grammarAccess.getLetterAccess().getMKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:445:6: ( 'N' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:445:6: ( 'N' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:446:1: 'N'
                    {
                     before(grammarAccess.getLetterAccess().getNKeyword_13()); 
                    match(input,24,FOLLOW_24_in_rule__Letter__Alternatives921); 
                     after(grammarAccess.getLetterAccess().getNKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:453:6: ( 'O' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:453:6: ( 'O' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:454:1: 'O'
                    {
                     before(grammarAccess.getLetterAccess().getOKeyword_14()); 
                    match(input,25,FOLLOW_25_in_rule__Letter__Alternatives941); 
                     after(grammarAccess.getLetterAccess().getOKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:461:6: ( 'P' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:461:6: ( 'P' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:462:1: 'P'
                    {
                     before(grammarAccess.getLetterAccess().getPKeyword_15()); 
                    match(input,26,FOLLOW_26_in_rule__Letter__Alternatives961); 
                     after(grammarAccess.getLetterAccess().getPKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:469:6: ( 'Q' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:469:6: ( 'Q' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:470:1: 'Q'
                    {
                     before(grammarAccess.getLetterAccess().getQKeyword_16()); 
                    match(input,27,FOLLOW_27_in_rule__Letter__Alternatives981); 
                     after(grammarAccess.getLetterAccess().getQKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:477:6: ( 'R' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:477:6: ( 'R' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:478:1: 'R'
                    {
                     before(grammarAccess.getLetterAccess().getRKeyword_17()); 
                    match(input,28,FOLLOW_28_in_rule__Letter__Alternatives1001); 
                     after(grammarAccess.getLetterAccess().getRKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:485:6: ( 'S' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:485:6: ( 'S' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:486:1: 'S'
                    {
                     before(grammarAccess.getLetterAccess().getSKeyword_18()); 
                    match(input,29,FOLLOW_29_in_rule__Letter__Alternatives1021); 
                     after(grammarAccess.getLetterAccess().getSKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:493:6: ( 'T' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:493:6: ( 'T' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:494:1: 'T'
                    {
                     before(grammarAccess.getLetterAccess().getTKeyword_19()); 
                    match(input,30,FOLLOW_30_in_rule__Letter__Alternatives1041); 
                     after(grammarAccess.getLetterAccess().getTKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:501:6: ( 'U' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:501:6: ( 'U' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:502:1: 'U'
                    {
                     before(grammarAccess.getLetterAccess().getUKeyword_20()); 
                    match(input,31,FOLLOW_31_in_rule__Letter__Alternatives1061); 
                     after(grammarAccess.getLetterAccess().getUKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:509:6: ( 'V' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:509:6: ( 'V' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:510:1: 'V'
                    {
                     before(grammarAccess.getLetterAccess().getVKeyword_21()); 
                    match(input,32,FOLLOW_32_in_rule__Letter__Alternatives1081); 
                     after(grammarAccess.getLetterAccess().getVKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:517:6: ( 'W' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:517:6: ( 'W' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:518:1: 'W'
                    {
                     before(grammarAccess.getLetterAccess().getWKeyword_22()); 
                    match(input,33,FOLLOW_33_in_rule__Letter__Alternatives1101); 
                     after(grammarAccess.getLetterAccess().getWKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:525:6: ( 'X' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:525:6: ( 'X' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:526:1: 'X'
                    {
                     before(grammarAccess.getLetterAccess().getXKeyword_23()); 
                    match(input,34,FOLLOW_34_in_rule__Letter__Alternatives1121); 
                     after(grammarAccess.getLetterAccess().getXKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:533:6: ( 'Y' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:533:6: ( 'Y' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:534:1: 'Y'
                    {
                     before(grammarAccess.getLetterAccess().getYKeyword_24()); 
                    match(input,35,FOLLOW_35_in_rule__Letter__Alternatives1141); 
                     after(grammarAccess.getLetterAccess().getYKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:541:6: ( 'Z' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:541:6: ( 'Z' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:542:1: 'Z'
                    {
                     before(grammarAccess.getLetterAccess().getZKeyword_25()); 
                    match(input,36,FOLLOW_36_in_rule__Letter__Alternatives1161); 
                     after(grammarAccess.getLetterAccess().getZKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:549:6: ( 'a' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:549:6: ( 'a' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:550:1: 'a'
                    {
                     before(grammarAccess.getLetterAccess().getAKeyword_26()); 
                    match(input,37,FOLLOW_37_in_rule__Letter__Alternatives1181); 
                     after(grammarAccess.getLetterAccess().getAKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:557:6: ( 'b' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:557:6: ( 'b' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:558:1: 'b'
                    {
                     before(grammarAccess.getLetterAccess().getBKeyword_27()); 
                    match(input,38,FOLLOW_38_in_rule__Letter__Alternatives1201); 
                     after(grammarAccess.getLetterAccess().getBKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:565:6: ( 'c' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:565:6: ( 'c' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:566:1: 'c'
                    {
                     before(grammarAccess.getLetterAccess().getCKeyword_28()); 
                    match(input,39,FOLLOW_39_in_rule__Letter__Alternatives1221); 
                     after(grammarAccess.getLetterAccess().getCKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:573:6: ( 'd' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:573:6: ( 'd' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:574:1: 'd'
                    {
                     before(grammarAccess.getLetterAccess().getDKeyword_29()); 
                    match(input,40,FOLLOW_40_in_rule__Letter__Alternatives1241); 
                     after(grammarAccess.getLetterAccess().getDKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:581:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:581:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:582:1: 'e'
                    {
                     before(grammarAccess.getLetterAccess().getEKeyword_30()); 
                    match(input,41,FOLLOW_41_in_rule__Letter__Alternatives1261); 
                     after(grammarAccess.getLetterAccess().getEKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:589:6: ( 'f' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:589:6: ( 'f' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:590:1: 'f'
                    {
                     before(grammarAccess.getLetterAccess().getFKeyword_31()); 
                    match(input,42,FOLLOW_42_in_rule__Letter__Alternatives1281); 
                     after(grammarAccess.getLetterAccess().getFKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:597:6: ( 'g' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:597:6: ( 'g' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:598:1: 'g'
                    {
                     before(grammarAccess.getLetterAccess().getGKeyword_32()); 
                    match(input,43,FOLLOW_43_in_rule__Letter__Alternatives1301); 
                     after(grammarAccess.getLetterAccess().getGKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:605:6: ( 'h' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:605:6: ( 'h' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:606:1: 'h'
                    {
                     before(grammarAccess.getLetterAccess().getHKeyword_33()); 
                    match(input,44,FOLLOW_44_in_rule__Letter__Alternatives1321); 
                     after(grammarAccess.getLetterAccess().getHKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:613:6: ( 'i' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:613:6: ( 'i' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:614:1: 'i'
                    {
                     before(grammarAccess.getLetterAccess().getIKeyword_34()); 
                    match(input,45,FOLLOW_45_in_rule__Letter__Alternatives1341); 
                     after(grammarAccess.getLetterAccess().getIKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:621:6: ( 'j' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:621:6: ( 'j' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:622:1: 'j'
                    {
                     before(grammarAccess.getLetterAccess().getJKeyword_35()); 
                    match(input,46,FOLLOW_46_in_rule__Letter__Alternatives1361); 
                     after(grammarAccess.getLetterAccess().getJKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:629:6: ( 'k' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:629:6: ( 'k' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:630:1: 'k'
                    {
                     before(grammarAccess.getLetterAccess().getKKeyword_36()); 
                    match(input,47,FOLLOW_47_in_rule__Letter__Alternatives1381); 
                     after(grammarAccess.getLetterAccess().getKKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:637:6: ( 'l' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:637:6: ( 'l' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:638:1: 'l'
                    {
                     before(grammarAccess.getLetterAccess().getLKeyword_37()); 
                    match(input,48,FOLLOW_48_in_rule__Letter__Alternatives1401); 
                     after(grammarAccess.getLetterAccess().getLKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:645:6: ( 'm' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:645:6: ( 'm' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:646:1: 'm'
                    {
                     before(grammarAccess.getLetterAccess().getMKeyword_38()); 
                    match(input,49,FOLLOW_49_in_rule__Letter__Alternatives1421); 
                     after(grammarAccess.getLetterAccess().getMKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:653:6: ( 'n' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:653:6: ( 'n' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:654:1: 'n'
                    {
                     before(grammarAccess.getLetterAccess().getNKeyword_39()); 
                    match(input,50,FOLLOW_50_in_rule__Letter__Alternatives1441); 
                     after(grammarAccess.getLetterAccess().getNKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:661:6: ( 'o' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:661:6: ( 'o' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:662:1: 'o'
                    {
                     before(grammarAccess.getLetterAccess().getOKeyword_40()); 
                    match(input,51,FOLLOW_51_in_rule__Letter__Alternatives1461); 
                     after(grammarAccess.getLetterAccess().getOKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:669:6: ( 'p' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:669:6: ( 'p' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:670:1: 'p'
                    {
                     before(grammarAccess.getLetterAccess().getPKeyword_41()); 
                    match(input,52,FOLLOW_52_in_rule__Letter__Alternatives1481); 
                     after(grammarAccess.getLetterAccess().getPKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:677:6: ( 'q' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:677:6: ( 'q' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:678:1: 'q'
                    {
                     before(grammarAccess.getLetterAccess().getQKeyword_42()); 
                    match(input,53,FOLLOW_53_in_rule__Letter__Alternatives1501); 
                     after(grammarAccess.getLetterAccess().getQKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:685:6: ( 'r' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:685:6: ( 'r' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:686:1: 'r'
                    {
                     before(grammarAccess.getLetterAccess().getRKeyword_43()); 
                    match(input,54,FOLLOW_54_in_rule__Letter__Alternatives1521); 
                     after(grammarAccess.getLetterAccess().getRKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:693:6: ( 's' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:693:6: ( 's' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:694:1: 's'
                    {
                     before(grammarAccess.getLetterAccess().getSKeyword_44()); 
                    match(input,55,FOLLOW_55_in_rule__Letter__Alternatives1541); 
                     after(grammarAccess.getLetterAccess().getSKeyword_44()); 

                    }


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:701:6: ( 't' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:701:6: ( 't' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:702:1: 't'
                    {
                     before(grammarAccess.getLetterAccess().getTKeyword_45()); 
                    match(input,56,FOLLOW_56_in_rule__Letter__Alternatives1561); 
                     after(grammarAccess.getLetterAccess().getTKeyword_45()); 

                    }


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:709:6: ( 'u' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:709:6: ( 'u' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:710:1: 'u'
                    {
                     before(grammarAccess.getLetterAccess().getUKeyword_46()); 
                    match(input,57,FOLLOW_57_in_rule__Letter__Alternatives1581); 
                     after(grammarAccess.getLetterAccess().getUKeyword_46()); 

                    }


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:717:6: ( 'v' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:717:6: ( 'v' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:718:1: 'v'
                    {
                     before(grammarAccess.getLetterAccess().getVKeyword_47()); 
                    match(input,58,FOLLOW_58_in_rule__Letter__Alternatives1601); 
                     after(grammarAccess.getLetterAccess().getVKeyword_47()); 

                    }


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:725:6: ( 'w' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:725:6: ( 'w' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:726:1: 'w'
                    {
                     before(grammarAccess.getLetterAccess().getWKeyword_48()); 
                    match(input,59,FOLLOW_59_in_rule__Letter__Alternatives1621); 
                     after(grammarAccess.getLetterAccess().getWKeyword_48()); 

                    }


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:733:6: ( 'x' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:733:6: ( 'x' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:734:1: 'x'
                    {
                     before(grammarAccess.getLetterAccess().getXKeyword_49()); 
                    match(input,60,FOLLOW_60_in_rule__Letter__Alternatives1641); 
                     after(grammarAccess.getLetterAccess().getXKeyword_49()); 

                    }


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:741:6: ( 'y' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:741:6: ( 'y' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:742:1: 'y'
                    {
                     before(grammarAccess.getLetterAccess().getYKeyword_50()); 
                    match(input,61,FOLLOW_61_in_rule__Letter__Alternatives1661); 
                     after(grammarAccess.getLetterAccess().getYKeyword_50()); 

                    }


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:749:6: ( 'z' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:749:6: ( 'z' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:750:1: 'z'
                    {
                     before(grammarAccess.getLetterAccess().getZKeyword_51()); 
                    match(input,62,FOLLOW_62_in_rule__Letter__Alternatives1681); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:762:1: rule__Digit__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__Digit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:766:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt4=1;
                }
                break;
            case 64:
                {
                alt4=2;
                }
                break;
            case 65:
                {
                alt4=3;
                }
                break;
            case 66:
                {
                alt4=4;
                }
                break;
            case 67:
                {
                alt4=5;
                }
                break;
            case 68:
                {
                alt4=6;
                }
                break;
            case 69:
                {
                alt4=7;
                }
                break;
            case 70:
                {
                alt4=8;
                }
                break;
            case 71:
                {
                alt4=9;
                }
                break;
            case 72:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:767:1: ( '0' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:767:1: ( '0' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:768:1: '0'
                    {
                     before(grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
                    match(input,63,FOLLOW_63_in_rule__Digit__Alternatives1716); 
                     after(grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:775:6: ( '1' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:775:6: ( '1' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:776:1: '1'
                    {
                     before(grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
                    match(input,64,FOLLOW_64_in_rule__Digit__Alternatives1736); 
                     after(grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:783:6: ( '2' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:783:6: ( '2' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:784:1: '2'
                    {
                     before(grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
                    match(input,65,FOLLOW_65_in_rule__Digit__Alternatives1756); 
                     after(grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:791:6: ( '3' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:791:6: ( '3' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:792:1: '3'
                    {
                     before(grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
                    match(input,66,FOLLOW_66_in_rule__Digit__Alternatives1776); 
                     after(grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:799:6: ( '4' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:799:6: ( '4' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:800:1: '4'
                    {
                     before(grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
                    match(input,67,FOLLOW_67_in_rule__Digit__Alternatives1796); 
                     after(grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:807:6: ( '5' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:807:6: ( '5' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:808:1: '5'
                    {
                     before(grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
                    match(input,68,FOLLOW_68_in_rule__Digit__Alternatives1816); 
                     after(grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:815:6: ( '6' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:815:6: ( '6' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:816:1: '6'
                    {
                     before(grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
                    match(input,69,FOLLOW_69_in_rule__Digit__Alternatives1836); 
                     after(grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:823:6: ( '7' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:823:6: ( '7' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:824:1: '7'
                    {
                     before(grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
                    match(input,70,FOLLOW_70_in_rule__Digit__Alternatives1856); 
                     after(grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:831:6: ( '8' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:831:6: ( '8' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:832:1: '8'
                    {
                     before(grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
                    match(input,71,FOLLOW_71_in_rule__Digit__Alternatives1876); 
                     after(grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:839:6: ( '9' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:839:6: ( '9' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:840:1: '9'
                    {
                     before(grammarAccess.getDigitAccess().getDigitNineKeyword_9()); 
                    match(input,72,FOLLOW_72_in_rule__Digit__Alternatives1896); 
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


    // $ANTLR start "rule__Sign__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:852:1: rule__Sign__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:856:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==73) ) {
                alt5=1;
            }
            else if ( (LA5_0==74) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:857:1: ( '+' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:857:1: ( '+' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:858:1: '+'
                    {
                     before(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                    match(input,73,FOLLOW_73_in_rule__Sign__Alternatives1931); 
                     after(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:865:6: ( '-' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:865:6: ( '-' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:866:1: '-'
                    {
                     before(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                    match(input,74,FOLLOW_74_in_rule__Sign__Alternatives1951); 
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


    // $ANTLR start "rule__Identifier__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:880:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:884:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:885:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__01983);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__01986);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:892:1: rule__Identifier__Group__0__Impl : ( ruleletter ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:896:1: ( ( ruleletter ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:897:1: ( ruleletter )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:897:1: ( ruleletter )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:898:1: ruleletter
            {
             before(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleletter_in_rule__Identifier__Group__0__Impl2013);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:909:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:913:1: ( rule__Identifier__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:914:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__12042);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:920:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Alternatives_1 )? ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:924:1: ( ( ( rule__Identifier__Alternatives_1 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:925:1: ( ( rule__Identifier__Alternatives_1 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:925:1: ( ( rule__Identifier__Alternatives_1 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:926:1: ( rule__Identifier__Alternatives_1 )?
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:927:1: ( rule__Identifier__Alternatives_1 )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:927:2: rule__Identifier__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Identifier__Alternatives_1_in_rule__Identifier__Group__1__Impl2069);
                    rule__Identifier__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIdentifierAccess().getAlternatives_1()); 

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


    // $ANTLR start "rule__Digit_sequence__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:941:1: rule__Digit_sequence__Group__0 : rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1 ;
    public final void rule__Digit_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:945:1: ( rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:946:2: rule__Digit_sequence__Group__0__Impl rule__Digit_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__0__Impl_in_rule__Digit_sequence__Group__02104);
            rule__Digit_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Digit_sequence__Group__1_in_rule__Digit_sequence__Group__02107);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:953:1: rule__Digit_sequence__Group__0__Impl : ( ( rulesign )? ) ;
    public final void rule__Digit_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:957:1: ( ( ( rulesign )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:958:1: ( ( rulesign )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:958:1: ( ( rulesign )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:959:1: ( rulesign )?
            {
             before(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:960:1: ( rulesign )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=73 && LA7_0<=74)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:960:3: rulesign
                    {
                    pushFollow(FOLLOW_rulesign_in_rule__Digit_sequence__Group__0__Impl2135);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:970:1: rule__Digit_sequence__Group__1 : rule__Digit_sequence__Group__1__Impl ;
    public final void rule__Digit_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:974:1: ( rule__Digit_sequence__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:975:2: rule__Digit_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Digit_sequence__Group__1__Impl_in_rule__Digit_sequence__Group__12166);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:981:1: rule__Digit_sequence__Group__1__Impl : ( ruleunsigned_digit_sequence ) ;
    public final void rule__Digit_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:985:1: ( ( ruleunsigned_digit_sequence ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:986:1: ( ruleunsigned_digit_sequence )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:986:1: ( ruleunsigned_digit_sequence )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:987:1: ruleunsigned_digit_sequence
            {
             before(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_rule__Digit_sequence__Group__1__Impl2193);
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


    // $ANTLR start "rule__Unsigned_digit_sequence__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1002:1: rule__Unsigned_digit_sequence__Group__0 : rule__Unsigned_digit_sequence__Group__0__Impl rule__Unsigned_digit_sequence__Group__1 ;
    public final void rule__Unsigned_digit_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1006:1: ( rule__Unsigned_digit_sequence__Group__0__Impl rule__Unsigned_digit_sequence__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1007:2: rule__Unsigned_digit_sequence__Group__0__Impl rule__Unsigned_digit_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Unsigned_digit_sequence__Group__0__Impl_in_rule__Unsigned_digit_sequence__Group__02226);
            rule__Unsigned_digit_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unsigned_digit_sequence__Group__1_in_rule__Unsigned_digit_sequence__Group__02229);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1014:1: rule__Unsigned_digit_sequence__Group__0__Impl : ( ruledigit ) ;
    public final void rule__Unsigned_digit_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1018:1: ( ( ruledigit ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1019:1: ( ruledigit )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1019:1: ( ruledigit )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1020:1: ruledigit
            {
             before(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledigit_in_rule__Unsigned_digit_sequence__Group__0__Impl2256);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1031:1: rule__Unsigned_digit_sequence__Group__1 : rule__Unsigned_digit_sequence__Group__1__Impl ;
    public final void rule__Unsigned_digit_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1035:1: ( rule__Unsigned_digit_sequence__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1036:2: rule__Unsigned_digit_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Unsigned_digit_sequence__Group__1__Impl_in_rule__Unsigned_digit_sequence__Group__12285);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1042:1: rule__Unsigned_digit_sequence__Group__1__Impl : ( ( ruledigit )* ) ;
    public final void rule__Unsigned_digit_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1046:1: ( ( ( ruledigit )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1047:1: ( ( ruledigit )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1047:1: ( ( ruledigit )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1048:1: ( ruledigit )*
            {
             before(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1049:1: ( ruledigit )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=63 && LA8_0<=72)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1049:3: ruledigit
            	    {
            	    pushFollow(FOLLOW_ruledigit_in_rule__Unsigned_digit_sequence__Group__1__Impl2313);
            	    ruledigit();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1064:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1068:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1069:1: ( ruleGreeting )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1069:1: ( ruleGreeting )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalPascal.g:1070:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment2353);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\66\uffff";
    static final String DFA6_eofS =
        "\1\65\65\uffff";
    static final String DFA6_minS =
        "\1\13\65\uffff";
    static final String DFA6_maxS =
        "\1\110\65\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\64\1\1\2";
    static final String DFA6_specialS =
        "\66\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
            "\1\62\1\63\13\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "927:1: ( rule__Identifier__Alternatives_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x7FFFFFFFFFFFF802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_entryRuleidentifier242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0_in_ruleidentifier275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_entryRuleletter302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletter309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Letter__Alternatives_in_ruleletter335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_entryRuledigit362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit__Alternatives_in_ruledigit395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__0_in_ruledigit_sequence455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sign__Alternatives_in_rulesign515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_digit_sequence549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_digit_sequence__Group__0_in_ruleunsigned_digit_sequence575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_rule__Identifier__Alternatives_1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_rule__Identifier__Alternatives_1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Letter__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Letter__Alternatives681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Letter__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Letter__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Letter__Alternatives741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Letter__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Letter__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Letter__Alternatives801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Letter__Alternatives821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Letter__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Letter__Alternatives861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Letter__Alternatives881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Letter__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Letter__Alternatives921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Letter__Alternatives941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Letter__Alternatives961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Letter__Alternatives981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Letter__Alternatives1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Letter__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Letter__Alternatives1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Letter__Alternatives1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Letter__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Letter__Alternatives1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Letter__Alternatives1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Letter__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Letter__Alternatives1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Letter__Alternatives1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Letter__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Letter__Alternatives1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Letter__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Letter__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Letter__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Letter__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Letter__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Letter__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Letter__Alternatives1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Letter__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Letter__Alternatives1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Letter__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Letter__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Letter__Alternatives1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Letter__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Letter__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Letter__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Letter__Alternatives1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Letter__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Letter__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Letter__Alternatives1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Letter__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Letter__Alternatives1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Letter__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Letter__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Digit__Alternatives1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Digit__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Digit__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Digit__Alternatives1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Digit__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Digit__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Digit__Alternatives1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Digit__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__Digit__Alternatives1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Digit__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__Sign__Alternatives1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__Sign__Alternatives1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__01983 = new BitSet(new long[]{0xFFFFFFFFFFFFF800L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__01986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_rule__Identifier__Group__0__Impl2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__12042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Alternatives_1_in_rule__Identifier__Group__1__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__0__Impl_in_rule__Digit_sequence__Group__02104 = new BitSet(new long[]{0xFFFFFFFFFFFFF800L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__1_in_rule__Digit_sequence__Group__02107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_rule__Digit_sequence__Group__0__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__Group__1__Impl_in_rule__Digit_sequence__Group__12166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_rule__Digit_sequence__Group__1__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_digit_sequence__Group__0__Impl_in_rule__Unsigned_digit_sequence__Group__02226 = new BitSet(new long[]{0xFFFFFFFFFFFFF800L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__Unsigned_digit_sequence__Group__1_in_rule__Unsigned_digit_sequence__Group__02229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_rule__Unsigned_digit_sequence__Group__0__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_digit_sequence__Group__1__Impl_in_rule__Unsigned_digit_sequence__Group__12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_rule__Unsigned_digit_sequence__Group__1__Impl2313 = new BitSet(new long[]{0xFFFFFFFFFFFFF802L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment2353 = new BitSet(new long[]{0x0000000000000002L});

}