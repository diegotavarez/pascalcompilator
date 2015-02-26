package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOT", "RULE_IDENTIFIER", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_SEMICOLON", "RULE_COMMA", "RULE_IG", "RULE_COLON", "RULE_LEFT_BRACKETS", "RULE_RIGHT_BRACKETS", "RULE_DIAERESIS", "RULE_ASSIGNMENT_SIGN", "RULE_RELATIONALOPERATOR", "RULE_ADDITIONOPERATOR", "RULE_MULTIPLICATIONOPERATOR", "RULE_STRING1", "RULE_CARET", "RULE_INTEGER_NUMBER", "RULE_REAL_NUMBER", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_EQUALS_SIGN", "RULE_DIFFERENT_SIGN", "RULE_LESS_THAN_SIGN", "RULE_LESS_OR_EQUALS_SIGN", "RULE_GREATER_THAN_SIGN", "RULE_GREATER_OR_EQUALS_SIGN", "RULE_MULTIP_SIGN", "RULE_DIV_SIGN", "RULE_DIGIT", "RULE_EXPOENTE", "RULE_ASPASSIMPLES", "RULE_STRINGCHARACTER", "RULE_LETTER", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'program'", "'label'", "'const'", "'type'", "'var'", "'procedure'", "'function'", "'begin'", "'end'", "'packed array'", "'of'", "'array'", "'variable'", "'ActualParameterList'", "'goto'", "'while'", "'do'", "'repeat'", "'until'", "'for'", "'to'", "'downto'", "'if'", "'then'", "'else'", "'case'", "'with'", "'+'", "'-'", "'nil'", "'not'", "'actualParameterList'", "'boolean'", "'char'", "'integer'", "'real'", "'packed'", "'record'", "'set'", "'file'"
    };
    public static final int T__68=68;
    public static final int RULE_GREATER_THAN_SIGN=28;
    public static final int T__69=69;
    public static final int RULE_ID=38;
    public static final int RULE_EQUALS_SIGN=24;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_SEMICOLON=8;
    public static final int RULE_ANY_OTHER=43;
    public static final int RULE_DIAERESIS=14;
    public static final int T__61=61;
    public static final int RULE_DIFFERENT_SIGN=25;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int RULE_ADDITIONOPERATOR=17;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_STRING1=19;
    public static final int T__58=58;
    public static final int RULE_REAL_NUMBER=22;
    public static final int RULE_MULTIPLICATIONOPERATOR=18;
    public static final int T__51=51;
    public static final int RULE_DOT=4;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_RELATIONALOPERATOR=16;
    public static final int RULE_EXPOENTE=33;
    public static final int T__59=59;
    public static final int RULE_RIGHT_BRACKETS=13;
    public static final int RULE_LESS_THAN_SIGN=26;
    public static final int RULE_INT=39;
    public static final int RULE_LESS_OR_EQUALS_SIGN=27;
    public static final int RULE_LEFT_PARENTHESIS=6;
    public static final int RULE_RIGHT_PARENTHESIS=7;
    public static final int T__50=50;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int RULE_CARET=20;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_GREATER_OR_EQUALS_SIGN=29;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=23;
    public static final int RULE_COMMA=9;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_STRINGCHARACTER=35;
    public static final int RULE_SL_COMMENT=42;
    public static final int RULE_LETTER=36;
    public static final int RULE_ML_COMMENT=41;
    public static final int RULE_MULTIP_SIGN=30;
    public static final int RULE_COLON=11;
    public static final int RULE_STRING=40;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_ASPASSIMPLES=34;
    public static final int RULE_DIV_SIGN=31;
    public static final int RULE_ASSIGNMENT_SIGN=15;
    public static final int RULE_WS=37;
    public static final int T__76=76;
    public static final int RULE_DIGIT=32;
    public static final int T__75=75;
    public static final int RULE_IG=10;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int RULE_LEFT_BRACKETS=12;
    public static final int T__78=78;
    public static final int RULE_INTEGER_NUMBER=21;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g"; }



     	private PascalGrammarAccess grammarAccess;
     	
        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:76:1: ruleModel returns [EObject current=null] : ( (lv_programs_0_0= ruleprogram ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_programs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:79:28: ( ( (lv_programs_0_0= ruleprogram ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:80:1: ( (lv_programs_0_0= ruleprogram ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:80:1: ( (lv_programs_0_0= ruleprogram ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:81:1: (lv_programs_0_0= ruleprogram )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:81:1: (lv_programs_0_0= ruleprogram )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:82:3: lv_programs_0_0= ruleprogram
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleprogram_in_ruleModel130);
            	    lv_programs_0_0=ruleprogram();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"programs",
            	              		lv_programs_0_0, 
            	              		"program");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleprogram"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:106:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:107:2: (iv_ruleprogram= ruleprogram EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:108:2: iv_ruleprogram= ruleprogram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram166);
            iv_ruleprogram=ruleprogram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprogram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:115:1: ruleprogram returns [EObject current=null] : ( ( (lv_program_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) this_DOT_2= RULE_DOT ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token this_DOT_2=null;
        EObject lv_program_0_0 = null;

        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:118:28: ( ( ( (lv_program_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) this_DOT_2= RULE_DOT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:1: ( ( (lv_program_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) this_DOT_2= RULE_DOT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:1: ( ( (lv_program_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) this_DOT_2= RULE_DOT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:2: ( (lv_program_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) this_DOT_2= RULE_DOT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:2: ( (lv_program_0_0= ruleprogram_heading ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:120:1: (lv_program_0_0= ruleprogram_heading )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:120:1: (lv_program_0_0= ruleprogram_heading )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:121:3: lv_program_0_0= ruleprogram_heading
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProgramAccess().getProgramProgram_headingParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleprogram_heading_in_ruleprogram222);
            lv_program_0_0=ruleprogram_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProgramRule());
              	        }
                     		set(
                     			current, 
                     			"program",
                      		lv_program_0_0, 
                      		"program_heading");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:137:2: ( (lv_block_1_0= ruleblock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:138:1: (lv_block_1_0= ruleblock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:138:1: (lv_block_1_0= ruleblock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:139:3: lv_block_1_0= ruleblock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_ruleprogram243);
            lv_block_1_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProgramRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_1_0, 
                      		"block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_DOT_2=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleprogram254); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_2, grammarAccess.getProgramAccess().getDOTTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:167:1: entryRuleprogram_heading returns [EObject current=null] : iv_ruleprogram_heading= ruleprogram_heading EOF ;
    public final EObject entryRuleprogram_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:168:2: (iv_ruleprogram_heading= ruleprogram_heading EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:169:2: iv_ruleprogram_heading= ruleprogram_heading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgram_headingRule()); 
            }
            pushFollow(FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading289);
            iv_ruleprogram_heading=ruleprogram_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprogram_heading; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading299); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram_heading"


    // $ANTLR start "ruleprogram_heading"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:176:1: ruleprogram_heading returns [EObject current=null] : (otherlv_0= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS this_identifier_list_3= ruleidentifier_list this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) this_SEMICOLON_5= RULE_SEMICOLON ) ;
    public final EObject ruleprogram_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_IDENTIFIER_1=null;
        Token this_LEFT_PARENTHESIS_2=null;
        Token this_RIGHT_PARENTHESIS_4=null;
        Token this_SEMICOLON_5=null;
        EObject this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:179:28: ( (otherlv_0= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS this_identifier_list_3= ruleidentifier_list this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) this_SEMICOLON_5= RULE_SEMICOLON ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:180:1: (otherlv_0= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS this_identifier_list_3= ruleidentifier_list this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) this_SEMICOLON_5= RULE_SEMICOLON )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:180:1: (otherlv_0= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS this_identifier_list_3= ruleidentifier_list this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) this_SEMICOLON_5= RULE_SEMICOLON )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:180:3: otherlv_0= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS this_identifier_list_3= ruleidentifier_list this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) this_SEMICOLON_5= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleprogram_heading336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProgram_headingAccess().getProgramKeyword_0());
                  
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading347); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_1, grammarAccess.getProgram_headingAccess().getIDENTIFIERTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:188:1: (this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS this_identifier_list_3= ruleidentifier_list this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:188:2: this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS this_identifier_list_3= ruleidentifier_list this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS
            {
            this_LEFT_PARENTHESIS_2=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleprogram_heading358); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_2, grammarAccess.getProgram_headingAccess().getLEFT_PARENTHESISTerminalRuleCall_2_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_2_1()); 
                  
            }
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading379);
            this_identifier_list_3=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_identifier_list_3; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RIGHT_PARENTHESIS_4=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleprogram_heading389); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_4, grammarAccess.getProgram_headingAccess().getRIGHT_PARENTHESISTerminalRuleCall_2_2()); 
                  
            }

            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleprogram_heading400); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_5, grammarAccess.getProgram_headingAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram_heading"


    // $ANTLR start "entryRuleblock"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:217:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:218:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:219:2: iv_ruleblock= ruleblock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock435);
            iv_ruleblock=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleblock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock445); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:226:1: ruleblock returns [EObject current=null] : ( ( (lv_declarationPart_0_0= ruleDeclarationPart ) ) ( (lv_statementPart_1_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_declarationPart_0_0 = null;

        EObject lv_statementPart_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:229:28: ( ( ( (lv_declarationPart_0_0= ruleDeclarationPart ) ) ( (lv_statementPart_1_0= rulestatement_part ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:230:1: ( ( (lv_declarationPart_0_0= ruleDeclarationPart ) ) ( (lv_statementPart_1_0= rulestatement_part ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:230:1: ( ( (lv_declarationPart_0_0= ruleDeclarationPart ) ) ( (lv_statementPart_1_0= rulestatement_part ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:230:2: ( (lv_declarationPart_0_0= ruleDeclarationPart ) ) ( (lv_statementPart_1_0= rulestatement_part ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:230:2: ( (lv_declarationPart_0_0= ruleDeclarationPart ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:231:1: (lv_declarationPart_0_0= ruleDeclarationPart )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:231:1: (lv_declarationPart_0_0= ruleDeclarationPart )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:232:3: lv_declarationPart_0_0= ruleDeclarationPart
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBlockAccess().getDeclarationPartDeclarationPartParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclarationPart_in_ruleblock491);
            lv_declarationPart_0_0=ruleDeclarationPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBlockRule());
              	        }
                     		set(
                     			current, 
                     			"declarationPart",
                      		lv_declarationPart_0_0, 
                      		"DeclarationPart");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:248:2: ( (lv_statementPart_1_0= rulestatement_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:249:1: (lv_statementPart_1_0= rulestatement_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:249:1: (lv_statementPart_1_0= rulestatement_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:250:3: lv_statementPart_1_0= rulestatement_part
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBlockAccess().getStatementPartStatement_partParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock512);
            lv_statementPart_1_0=rulestatement_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBlockRule());
              	        }
                     		set(
                     			current, 
                     			"statementPart",
                      		lv_statementPart_1_0, 
                      		"statement_part");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRuleDeclarationPart"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:274:1: entryRuleDeclarationPart returns [EObject current=null] : iv_ruleDeclarationPart= ruleDeclarationPart EOF ;
    public final EObject entryRuleDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationPart = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:275:2: (iv_ruleDeclarationPart= ruleDeclarationPart EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:276:2: iv_ruleDeclarationPart= ruleDeclarationPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationPartRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarationPart_in_entryRuleDeclarationPart548);
            iv_ruleDeclarationPart=ruleDeclarationPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationPart558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationPart"


    // $ANTLR start "ruleDeclarationPart"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:283:1: ruleDeclarationPart returns [EObject current=null] : ( ( (lv_labelDeclarationPart_0_0= rulelabel_declaration_part ) )? ( (lv_constantDefinitionPart_1_0= ruleconstant_definition_part ) )? ( (lv_typeDefinitionPart_2_0= ruletype_definition_part ) )? ( (lv_variableDeclarationPart_3_0= rulevariable_declaration_part ) )? ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part ) ) ) ;
    public final EObject ruleDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject lv_labelDeclarationPart_0_0 = null;

        EObject lv_constantDefinitionPart_1_0 = null;

        EObject lv_typeDefinitionPart_2_0 = null;

        EObject lv_variableDeclarationPart_3_0 = null;

        EObject lv_procedureAndFunctionDeclarationPart_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:286:28: ( ( ( (lv_labelDeclarationPart_0_0= rulelabel_declaration_part ) )? ( (lv_constantDefinitionPart_1_0= ruleconstant_definition_part ) )? ( (lv_typeDefinitionPart_2_0= ruletype_definition_part ) )? ( (lv_variableDeclarationPart_3_0= rulevariable_declaration_part ) )? ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:287:1: ( ( (lv_labelDeclarationPart_0_0= rulelabel_declaration_part ) )? ( (lv_constantDefinitionPart_1_0= ruleconstant_definition_part ) )? ( (lv_typeDefinitionPart_2_0= ruletype_definition_part ) )? ( (lv_variableDeclarationPart_3_0= rulevariable_declaration_part ) )? ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:287:1: ( ( (lv_labelDeclarationPart_0_0= rulelabel_declaration_part ) )? ( (lv_constantDefinitionPart_1_0= ruleconstant_definition_part ) )? ( (lv_typeDefinitionPart_2_0= ruletype_definition_part ) )? ( (lv_variableDeclarationPart_3_0= rulevariable_declaration_part ) )? ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:287:2: ( (lv_labelDeclarationPart_0_0= rulelabel_declaration_part ) )? ( (lv_constantDefinitionPart_1_0= ruleconstant_definition_part ) )? ( (lv_typeDefinitionPart_2_0= ruletype_definition_part ) )? ( (lv_variableDeclarationPart_3_0= rulevariable_declaration_part ) )? ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:287:2: ( (lv_labelDeclarationPart_0_0= rulelabel_declaration_part ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==45) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:288:1: (lv_labelDeclarationPart_0_0= rulelabel_declaration_part )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:288:1: (lv_labelDeclarationPart_0_0= rulelabel_declaration_part )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:289:3: lv_labelDeclarationPart_0_0= rulelabel_declaration_part
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationPartAccess().getLabelDeclarationPartLabel_declaration_partParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruleDeclarationPart604);
                    lv_labelDeclarationPart_0_0=rulelabel_declaration_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclarationPartRule());
                      	        }
                             		set(
                             			current, 
                             			"labelDeclarationPart",
                              		lv_labelDeclarationPart_0_0, 
                              		"label_declaration_part");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:305:3: ( (lv_constantDefinitionPart_1_0= ruleconstant_definition_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==46) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:306:1: (lv_constantDefinitionPart_1_0= ruleconstant_definition_part )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:306:1: (lv_constantDefinitionPart_1_0= ruleconstant_definition_part )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:307:3: lv_constantDefinitionPart_1_0= ruleconstant_definition_part
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationPartAccess().getConstantDefinitionPartConstant_definition_partParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_ruleDeclarationPart626);
                    lv_constantDefinitionPart_1_0=ruleconstant_definition_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclarationPartRule());
                      	        }
                             		set(
                             			current, 
                             			"constantDefinitionPart",
                              		lv_constantDefinitionPart_1_0, 
                              		"constant_definition_part");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:323:3: ( (lv_typeDefinitionPart_2_0= ruletype_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:324:1: (lv_typeDefinitionPart_2_0= ruletype_definition_part )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:324:1: (lv_typeDefinitionPart_2_0= ruletype_definition_part )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:325:3: lv_typeDefinitionPart_2_0= ruletype_definition_part
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationPartAccess().getTypeDefinitionPartType_definition_partParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_definition_part_in_ruleDeclarationPart648);
                    lv_typeDefinitionPart_2_0=ruletype_definition_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclarationPartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeDefinitionPart",
                              		lv_typeDefinitionPart_2_0, 
                              		"type_definition_part");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:341:3: ( (lv_variableDeclarationPart_3_0= rulevariable_declaration_part ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==48) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:342:1: (lv_variableDeclarationPart_3_0= rulevariable_declaration_part )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:342:1: (lv_variableDeclarationPart_3_0= rulevariable_declaration_part )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:343:3: lv_variableDeclarationPart_3_0= rulevariable_declaration_part
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationPartAccess().getVariableDeclarationPartVariable_declaration_partParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_part_in_ruleDeclarationPart670);
                    lv_variableDeclarationPart_3_0=rulevariable_declaration_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclarationPartRule());
                      	        }
                             		set(
                             			current, 
                             			"variableDeclarationPart",
                              		lv_variableDeclarationPart_3_0, 
                              		"variable_declaration_part");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:359:3: ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:360:1: (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:360:1: (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:361:3: lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedure_and_function_declaration_part
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationPartAccess().getProcedureAndFunctionDeclarationPartProcedure_and_function_declaration_partParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_ruleDeclarationPart692);
            lv_procedureAndFunctionDeclarationPart_4_0=ruleprocedure_and_function_declaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationPartRule());
              	        }
                     		set(
                     			current, 
                     			"procedureAndFunctionDeclarationPart",
                      		lv_procedureAndFunctionDeclarationPart_4_0, 
                      		"procedure_and_function_declaration_part");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationPart"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:385:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:386:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:387:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            }
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part728);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelabel_declaration_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part738); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:394:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (this_COMMA_2= RULE_COMMA ( (lv_labels_3_0= rulelabel ) ) )* this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_COMMA_2=null;
        Token this_SEMICOLON_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:397:28: ( (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (this_COMMA_2= RULE_COMMA ( (lv_labels_3_0= rulelabel ) ) )* this_SEMICOLON_4= RULE_SEMICOLON ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:398:1: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (this_COMMA_2= RULE_COMMA ( (lv_labels_3_0= rulelabel ) ) )* this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:398:1: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (this_COMMA_2= RULE_COMMA ( (lv_labels_3_0= rulelabel ) ) )* this_SEMICOLON_4= RULE_SEMICOLON )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:398:3: otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (this_COMMA_2= RULE_COMMA ( (lv_labels_3_0= rulelabel ) ) )* this_SEMICOLON_4= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_rulelabel_declaration_part775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:402:1: ( (lv_labels_1_0= rulelabel ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:403:1: (lv_labels_1_0= rulelabel )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:403:1: (lv_labels_1_0= rulelabel )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:404:3: lv_labels_1_0= rulelabel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part796);
            lv_labels_1_0=rulelabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
              	        }
                     		add(
                     			current, 
                     			"labels",
                      		lv_labels_1_0, 
                      		"label");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:420:2: (this_COMMA_2= RULE_COMMA ( (lv_labels_3_0= rulelabel ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:420:3: this_COMMA_2= RULE_COMMA ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulelabel_declaration_part808); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getLabel_declaration_partAccess().getCOMMATerminalRuleCall_2_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:424:1: ( (lv_labels_3_0= rulelabel ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:425:1: (lv_labels_3_0= rulelabel )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:425:1: (lv_labels_3_0= rulelabel )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:426:3: lv_labels_3_0= rulelabel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part828);
            	    lv_labels_3_0=rulelabel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"labels",
            	              		lv_labels_3_0, 
            	              		"label");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulelabel_declaration_part841); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_4, grammarAccess.getLabel_declaration_partAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:454:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:455:2: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:456:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            }
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part876);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_definition_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part886); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:463:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( (lv_constantDefinitions_1_0= ruleconstant_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_constantDefinitions_3_0= ruleconstant_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )* ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SEMICOLON_2=null;
        Token this_SEMICOLON_4=null;
        EObject lv_constantDefinitions_1_0 = null;

        EObject lv_constantDefinitions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:466:28: ( (otherlv_0= 'const' ( (lv_constantDefinitions_1_0= ruleconstant_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_constantDefinitions_3_0= ruleconstant_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:467:1: (otherlv_0= 'const' ( (lv_constantDefinitions_1_0= ruleconstant_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_constantDefinitions_3_0= ruleconstant_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:467:1: (otherlv_0= 'const' ( (lv_constantDefinitions_1_0= ruleconstant_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_constantDefinitions_3_0= ruleconstant_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:467:3: otherlv_0= 'const' ( (lv_constantDefinitions_1_0= ruleconstant_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_constantDefinitions_3_0= ruleconstant_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )*
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleconstant_definition_part923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:471:1: ( (lv_constantDefinitions_1_0= ruleconstant_definition ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:1: (lv_constantDefinitions_1_0= ruleconstant_definition )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:1: (lv_constantDefinitions_1_0= ruleconstant_definition )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:473:3: lv_constantDefinitions_1_0= ruleconstant_definition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstantDefinitionsConstant_definitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part944);
            lv_constantDefinitions_1_0=ruleconstant_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
              	        }
                     		add(
                     			current, 
                     			"constantDefinitions",
                      		lv_constantDefinitions_1_0, 
                      		"constant_definition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleconstant_definition_part955); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_2, grammarAccess.getConstant_definition_partAccess().getSEMICOLONTerminalRuleCall_2()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:493:1: ( ( (lv_constantDefinitions_3_0= ruleconstant_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_IDENTIFIER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:493:2: ( (lv_constantDefinitions_3_0= ruleconstant_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:493:2: ( (lv_constantDefinitions_3_0= ruleconstant_definition ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:494:1: (lv_constantDefinitions_3_0= ruleconstant_definition )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:494:1: (lv_constantDefinitions_3_0= ruleconstant_definition )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:495:3: lv_constantDefinitions_3_0= ruleconstant_definition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstantDefinitionsConstant_definitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part976);
            	    lv_constantDefinitions_3_0=ruleconstant_definition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constantDefinitions",
            	              		lv_constantDefinitions_3_0, 
            	              		"constant_definition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleconstant_definition_part987); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_4, grammarAccess.getConstant_definition_partAccess().getSEMICOLONTerminalRuleCall_3_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:523:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:524:2: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:525:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            }
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition1024);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_definition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition1034); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:532:1: ruleconstant_definition returns [EObject current=null] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_constant_2= ruleconstant ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token this_IDENTIFIER_0=null;
        Token this_IG_1=null;
        EObject this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:535:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_constant_2= ruleconstant ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:536:1: (this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_constant_2= ruleconstant )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:536:1: (this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_constant_2= ruleconstant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:536:2: this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_constant_2= ruleconstant
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition1070); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getConstant_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                  
            }
            this_IG_1=(Token)match(input,RULE_IG,FOLLOW_RULE_IG_in_ruleconstant_definition1080); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IG_1, grammarAccess.getConstant_definitionAccess().getIGTerminalRuleCall_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition1101);
            this_constant_2=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_constant_2; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:561:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:562:2: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:563:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_definition_partRule()); 
            }
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part1136);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_definition_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part1146); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:570:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( (lv_typeDefinitions_1_0= ruletype_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_typeDefinitions_3_0= ruletype_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )* ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SEMICOLON_2=null;
        Token this_SEMICOLON_4=null;
        EObject lv_typeDefinitions_1_0 = null;

        EObject lv_typeDefinitions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:573:28: ( (otherlv_0= 'type' ( (lv_typeDefinitions_1_0= ruletype_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_typeDefinitions_3_0= ruletype_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:574:1: (otherlv_0= 'type' ( (lv_typeDefinitions_1_0= ruletype_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_typeDefinitions_3_0= ruletype_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:574:1: (otherlv_0= 'type' ( (lv_typeDefinitions_1_0= ruletype_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_typeDefinitions_3_0= ruletype_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:574:3: otherlv_0= 'type' ( (lv_typeDefinitions_1_0= ruletype_definition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_typeDefinitions_3_0= ruletype_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )*
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruletype_definition_part1183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:578:1: ( (lv_typeDefinitions_1_0= ruletype_definition ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:579:1: (lv_typeDefinitions_1_0= ruletype_definition )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:579:1: (lv_typeDefinitions_1_0= ruletype_definition )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:580:3: lv_typeDefinitions_1_0= ruletype_definition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getType_definition_partAccess().getTypeDefinitionsType_definitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part1204);
            lv_typeDefinitions_1_0=ruletype_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getType_definition_partRule());
              	        }
                     		add(
                     			current, 
                     			"typeDefinitions",
                      		lv_typeDefinitions_1_0, 
                      		"type_definition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruletype_definition_part1215); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_2, grammarAccess.getType_definition_partAccess().getSEMICOLONTerminalRuleCall_2()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:600:1: ( ( (lv_typeDefinitions_3_0= ruletype_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_IDENTIFIER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:600:2: ( (lv_typeDefinitions_3_0= ruletype_definition ) ) this_SEMICOLON_4= RULE_SEMICOLON
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:600:2: ( (lv_typeDefinitions_3_0= ruletype_definition ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:601:1: (lv_typeDefinitions_3_0= ruletype_definition )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:601:1: (lv_typeDefinitions_3_0= ruletype_definition )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:602:3: lv_typeDefinitions_3_0= ruletype_definition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getType_definition_partAccess().getTypeDefinitionsType_definitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part1236);
            	    lv_typeDefinitions_3_0=ruletype_definition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeDefinitions",
            	              		lv_typeDefinitions_3_0, 
            	              		"type_definition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruletype_definition_part1247); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_4, grammarAccess.getType_definition_partAccess().getSEMICOLONTerminalRuleCall_3_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:630:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:631:2: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:632:2: iv_ruletype_definition= ruletype_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_definitionRule()); 
            }
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition1284);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_definition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition1294); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:639:1: ruletype_definition returns [EObject current=null] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_type_2= ruletype ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token this_IDENTIFIER_0=null;
        Token this_IG_1=null;
        EObject this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:642:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_type_2= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:643:1: (this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_type_2= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:643:1: (this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_type_2= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:643:2: this_IDENTIFIER_0= RULE_IDENTIFIER this_IG_1= RULE_IG this_type_2= ruletype
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype_definition1330); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getType_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                  
            }
            this_IG_1=(Token)match(input,RULE_IG,FOLLOW_RULE_IG_in_ruletype_definition1340); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IG_1, grammarAccess.getType_definitionAccess().getIGTerminalRuleCall_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getType_definitionAccess().getTypeParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruletype_in_ruletype_definition1361);
            this_type_2=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_type_2; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRulevariable_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:668:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:669:2: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:670:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part1396);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part1406); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:677:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variableDeclarations_1_0= rulevariable_declaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_variableDeclarations_3_0= rulevariable_declaration ) ) this_SEMICOLON_4= RULE_SEMICOLON )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SEMICOLON_2=null;
        Token this_SEMICOLON_4=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:680:28: ( (otherlv_0= 'var' ( (lv_variableDeclarations_1_0= rulevariable_declaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_variableDeclarations_3_0= rulevariable_declaration ) ) this_SEMICOLON_4= RULE_SEMICOLON )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:681:1: (otherlv_0= 'var' ( (lv_variableDeclarations_1_0= rulevariable_declaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_variableDeclarations_3_0= rulevariable_declaration ) ) this_SEMICOLON_4= RULE_SEMICOLON )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:681:1: (otherlv_0= 'var' ( (lv_variableDeclarations_1_0= rulevariable_declaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_variableDeclarations_3_0= rulevariable_declaration ) ) this_SEMICOLON_4= RULE_SEMICOLON )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:681:3: otherlv_0= 'var' ( (lv_variableDeclarations_1_0= rulevariable_declaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ( ( (lv_variableDeclarations_3_0= rulevariable_declaration ) ) this_SEMICOLON_4= RULE_SEMICOLON )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulevariable_declaration_part1443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:685:1: ( (lv_variableDeclarations_1_0= rulevariable_declaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:686:1: (lv_variableDeclarations_1_0= rulevariable_declaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:686:1: (lv_variableDeclarations_1_0= rulevariable_declaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:687:3: lv_variableDeclarations_1_0= rulevariable_declaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariableDeclarationsVariable_declarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1464);
            lv_variableDeclarations_1_0=rulevariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
              	        }
                     		add(
                     			current, 
                     			"variableDeclarations",
                      		lv_variableDeclarations_1_0, 
                      		"variable_declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulevariable_declaration_part1475); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_2, grammarAccess.getVariable_declaration_partAccess().getSEMICOLONTerminalRuleCall_2()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:707:1: ( ( (lv_variableDeclarations_3_0= rulevariable_declaration ) ) this_SEMICOLON_4= RULE_SEMICOLON )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_IDENTIFIER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:707:2: ( (lv_variableDeclarations_3_0= rulevariable_declaration ) ) this_SEMICOLON_4= RULE_SEMICOLON
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:707:2: ( (lv_variableDeclarations_3_0= rulevariable_declaration ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:708:1: (lv_variableDeclarations_3_0= rulevariable_declaration )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:708:1: (lv_variableDeclarations_3_0= rulevariable_declaration )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:709:3: lv_variableDeclarations_3_0= rulevariable_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariableDeclarationsVariable_declarationParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1496);
            	    lv_variableDeclarations_3_0=rulevariable_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variableDeclarations",
            	              		lv_variableDeclarations_3_0, 
            	              		"variable_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulevariable_declaration_part1507); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_4, grammarAccess.getVariable_declaration_partAccess().getSEMICOLONTerminalRuleCall_3_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:737:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:738:2: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:739:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration1544);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration1554); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_declaration"


    // $ANTLR start "rulevariable_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:746:1: rulevariable_declaration returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_declaration() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:749:28: ( ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:750:1: ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:750:1: ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:750:2: ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:750:2: ( (lv_identifierList_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:751:1: (lv_identifierList_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:751:1: (lv_identifierList_0_0= ruleidentifier_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:752:3: lv_identifierList_0_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getIdentifierListIdentifier_listParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_declaration1600);
            lv_identifierList_0_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"identifierList",
                      		lv_identifierList_0_0, 
                      		"identifier_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulevariable_declaration1611); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_1, grammarAccess.getVariable_declarationAccess().getCOLONTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:772:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:773:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:773:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:774:3: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_rulevariable_declaration1631);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declaration"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:798:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:799:2: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:800:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            }
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part1667);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_and_function_declaration_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part1677); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:807:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( () ( ( ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) ) | ( (lv_functionDeclarations_2_0= rulefunction_declaration ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )* ) ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_3=null;
        EObject lv_procedureDeclarations_1_0 = null;

        EObject lv_functionDeclarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:810:28: ( ( () ( ( ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) ) | ( (lv_functionDeclarations_2_0= rulefunction_declaration ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:811:1: ( () ( ( ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) ) | ( (lv_functionDeclarations_2_0= rulefunction_declaration ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:811:1: ( () ( ( ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) ) | ( (lv_functionDeclarations_2_0= rulefunction_declaration ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:811:2: () ( ( ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) ) | ( (lv_functionDeclarations_2_0= rulefunction_declaration ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:811:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:812:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_and_function_declaration_partAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:2: ( ( ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) ) | ( (lv_functionDeclarations_2_0= rulefunction_declaration ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=49 && LA11_0<=50)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:3: ( ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) ) | ( (lv_functionDeclarations_2_0= rulefunction_declaration ) ) ) this_SEMICOLON_3= RULE_SEMICOLON
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:3: ( ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) ) | ( (lv_functionDeclarations_2_0= rulefunction_declaration ) ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==49) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==50) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:4: ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) )
            	            {
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:4: ( (lv_procedureDeclarations_1_0= ruleprocedure_declaration ) )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:818:1: (lv_procedureDeclarations_1_0= ruleprocedure_declaration )
            	            {
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:818:1: (lv_procedureDeclarations_1_0= ruleprocedure_declaration )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:819:3: lv_procedureDeclarations_1_0= ruleprocedure_declaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedureDeclarationsProcedure_declarationParserRuleCall_1_0_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part1734);
            	            lv_procedureDeclarations_1_0=ruleprocedure_declaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"procedureDeclarations",
            	                      		lv_procedureDeclarations_1_0, 
            	                      		"procedure_declaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:836:6: ( (lv_functionDeclarations_2_0= rulefunction_declaration ) )
            	            {
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:836:6: ( (lv_functionDeclarations_2_0= rulefunction_declaration ) )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:837:1: (lv_functionDeclarations_2_0= rulefunction_declaration )
            	            {
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:837:1: (lv_functionDeclarations_2_0= rulefunction_declaration )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:838:3: lv_functionDeclarations_2_0= rulefunction_declaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionDeclarationsFunction_declarationParserRuleCall_1_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part1761);
            	            lv_functionDeclarations_2_0=rulefunction_declaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"functionDeclarations",
            	                      		lv_functionDeclarations_2_0, 
            	                      		"function_declaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleprocedure_and_function_declaration_part1773); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_3, grammarAccess.getProcedure_and_function_declaration_partAccess().getSEMICOLONTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:866:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:867:2: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:868:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration1810);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_declaration1820); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:875:1: ruleprocedure_declaration returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_block_4_0= ruleblock ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_SEMICOLON_3=null;
        EObject lv_formalParameterList_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:878:28: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_block_4_0= ruleblock ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:879:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_block_4_0= ruleblock ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:879:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_block_4_0= ruleblock ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:879:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_block_4_0= ruleblock ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleprocedure_declaration1857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProcedure_declarationAccess().getProcedureKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:883:1: ( (lv_name_1_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:884:1: (lv_name_1_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:884:1: (lv_name_1_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:885:3: lv_name_1_0= RULE_IDENTIFIER
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_declaration1874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getProcedure_declarationAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProcedure_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:901:2: ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LEFT_PARENTHESIS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:902:1: (lv_formalParameterList_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:902:1: (lv_formalParameterList_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:903:3: lv_formalParameterList_2_0= ruleformal_parameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProcedure_declarationAccess().getFormalParameterListFormal_parameter_listParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_ruleprocedure_declaration1900);
                    lv_formalParameterList_2_0=ruleformal_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"formalParameterList",
                              		lv_formalParameterList_2_0, 
                              		"formal_parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleprocedure_declaration1912); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getProcedure_declarationAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:923:1: ( (lv_block_4_0= ruleblock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:924:1: (lv_block_4_0= ruleblock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:924:1: (lv_block_4_0= ruleblock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:925:3: lv_block_4_0= ruleblock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_ruleprocedure_declaration1932);
            lv_block_4_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_4_0, 
                      		"block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRulefunction_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:949:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:950:2: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:951:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            }
            pushFollow(FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration1968);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_declaration1978); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:958:1: rulefunction_declaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_COLON_3= RULE_COLON ( (lv_type_4_0= ruletype ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (lv_block_6_0= ruleblock ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_COLON_3=null;
        Token this_SEMICOLON_5=null;
        EObject lv_formalParameterList_2_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_block_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:961:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_COLON_3= RULE_COLON ( (lv_type_4_0= ruletype ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (lv_block_6_0= ruleblock ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:962:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_COLON_3= RULE_COLON ( (lv_type_4_0= ruletype ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (lv_block_6_0= ruleblock ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:962:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_COLON_3= RULE_COLON ( (lv_type_4_0= ruletype ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (lv_block_6_0= ruleblock ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:962:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )? this_COLON_3= RULE_COLON ( (lv_type_4_0= ruletype ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (lv_block_6_0= ruleblock ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_rulefunction_declaration2015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunction_declarationAccess().getFunctionKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:966:1: ( (lv_name_1_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:967:1: (lv_name_1_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:967:1: (lv_name_1_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:968:3: lv_name_1_0= RULE_IDENTIFIER
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_declaration2032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunction_declarationAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunction_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:984:2: ( (lv_formalParameterList_2_0= ruleformal_parameter_list ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LEFT_PARENTHESIS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:985:1: (lv_formalParameterList_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:985:1: (lv_formalParameterList_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:986:3: lv_formalParameterList_2_0= ruleformal_parameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getFormalParameterListFormal_parameter_listParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_rulefunction_declaration2058);
                    lv_formalParameterList_2_0=ruleformal_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"formalParameterList",
                              		lv_formalParameterList_2_0, 
                              		"formal_parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulefunction_declaration2070); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_3, grammarAccess.getFunction_declarationAccess().getCOLONTerminalRuleCall_3()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1006:1: ( (lv_type_4_0= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1007:1: (lv_type_4_0= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1007:1: (lv_type_4_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1008:3: lv_type_4_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_rulefunction_declaration2090);
            lv_type_4_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefunction_declaration2101); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_5, grammarAccess.getFunction_declarationAccess().getSEMICOLONTerminalRuleCall_5()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1028:1: ( (lv_block_6_0= ruleblock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1029:1: (lv_block_6_0= ruleblock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1029:1: (lv_block_6_0= ruleblock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1030:3: lv_block_6_0= ruleblock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_rulefunction_declaration2121);
            lv_block_6_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_6_0, 
                      		"block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_declaration"


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1054:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1055:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1056:2: iv_rulestatement_part= rulestatement_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_partRule()); 
            }
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part2157);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part2167); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1063:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' this_statement_sequence_1= rulestatement_sequence otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1066:28: ( (otherlv_0= 'begin' this_statement_sequence_1= rulestatement_sequence otherlv_2= 'end' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1067:1: (otherlv_0= 'begin' this_statement_sequence_1= rulestatement_sequence otherlv_2= 'end' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1067:1: (otherlv_0= 'begin' this_statement_sequence_1= rulestatement_sequence otherlv_2= 'end' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1067:3: otherlv_0= 'begin' this_statement_sequence_1= rulestatement_sequence otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_rulestatement_part2204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part2226);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_statement_sequence_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,52,FOLLOW_52_in_rulestatement_part2237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRuleprocedure_heading"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1092:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1093:2: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1094:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            }
            pushFollow(FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading2273);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_heading; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_heading2283); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1101:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_FormalParameterList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1104:28: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1105:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1105:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1105:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleprocedure_heading2320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1109:1: ( (lv_name_1_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1110:1: (lv_name_1_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1110:1: (lv_name_1_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1111:3: lv_name_1_0= RULE_IDENTIFIER
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_heading2337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProcedure_headingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1127:2: ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LEFT_PARENTHESIS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1128:1: (lv_FormalParameterList_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1128:1: (lv_FormalParameterList_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1129:3: lv_FormalParameterList_2_0= ruleformal_parameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProcedure_headingAccess().getFormalParameterListFormal_parameter_listParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading2363);
                    lv_FormalParameterList_2_0=ruleformal_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                      	        }
                             		set(
                             			current, 
                             			"FormalParameterList",
                              		lv_FormalParameterList_2_0, 
                              		"formal_parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRulefunction_heading"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1153:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1154:2: (iv_rulefunction_heading= rulefunction_heading EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1155:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_headingRule()); 
            }
            pushFollow(FOLLOW_rulefunction_heading_in_entryRulefunction_heading2400);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_heading; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_heading2410); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1162:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_id1_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_id2_4_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id1_1_0=null;
        Token this_SEMICOLON_3=null;
        Token lv_id2_4_0=null;
        EObject lv_FormalParameterList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1165:28: ( (otherlv_0= 'function' ( (lv_id1_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_id2_4_0= RULE_IDENTIFIER ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1166:1: (otherlv_0= 'function' ( (lv_id1_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_id2_4_0= RULE_IDENTIFIER ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1166:1: (otherlv_0= 'function' ( (lv_id1_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_id2_4_0= RULE_IDENTIFIER ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1166:3: otherlv_0= 'function' ( (lv_id1_1_0= RULE_IDENTIFIER ) ) ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )? this_SEMICOLON_3= RULE_SEMICOLON ( (lv_id2_4_0= RULE_IDENTIFIER ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_rulefunction_heading2447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1170:1: ( (lv_id1_1_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1171:1: (lv_id1_1_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1171:1: (lv_id1_1_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1172:3: lv_id1_1_0= RULE_IDENTIFIER
            {
            lv_id1_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_heading2464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id1_1_0, grammarAccess.getFunction_headingAccess().getId1IDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunction_headingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id1",
                      		lv_id1_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1188:2: ( (lv_FormalParameterList_2_0= ruleformal_parameter_list ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LEFT_PARENTHESIS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1189:1: (lv_FormalParameterList_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1189:1: (lv_FormalParameterList_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1190:3: lv_FormalParameterList_2_0= ruleformal_parameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunction_headingAccess().getFormalParameterListFormal_parameter_listParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_rulefunction_heading2490);
                    lv_FormalParameterList_2_0=ruleformal_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                      	        }
                             		set(
                             			current, 
                             			"FormalParameterList",
                              		lv_FormalParameterList_2_0, 
                              		"formal_parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefunction_heading2502); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getFunction_headingAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1210:1: ( (lv_id2_4_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1211:1: (lv_id2_4_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1211:1: (lv_id2_4_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1212:3: lv_id2_4_0= RULE_IDENTIFIER
            {
            lv_id2_4_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_heading2518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id2_4_0, grammarAccess.getFunction_headingAccess().getId2IDENTIFIERTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunction_headingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id2",
                      		lv_id2_4_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1238:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1239:2: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1240:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list2561);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformal_parameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_list2571); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1247:1: ruleformal_parameter_list returns [EObject current=null] : (this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_FormalParameterSections_1_0= ruleformal_parameter_section ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_FormalParameterSections_3_0= ruleformal_parameter_section ) ) )* this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_PARENTHESIS_0=null;
        Token this_SEMICOLON_2=null;
        Token this_RIGHT_PARENTHESIS_4=null;
        EObject lv_FormalParameterSections_1_0 = null;

        EObject lv_FormalParameterSections_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1250:28: ( (this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_FormalParameterSections_1_0= ruleformal_parameter_section ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_FormalParameterSections_3_0= ruleformal_parameter_section ) ) )* this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1251:1: (this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_FormalParameterSections_1_0= ruleformal_parameter_section ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_FormalParameterSections_3_0= ruleformal_parameter_section ) ) )* this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1251:1: (this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_FormalParameterSections_1_0= ruleformal_parameter_section ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_FormalParameterSections_3_0= ruleformal_parameter_section ) ) )* this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1251:2: this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_FormalParameterSections_1_0= ruleformal_parameter_section ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_FormalParameterSections_3_0= ruleformal_parameter_section ) ) )* this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS
            {
            this_LEFT_PARENTHESIS_0=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleformal_parameter_list2607); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_0, grammarAccess.getFormal_parameter_listAccess().getLEFT_PARENTHESISTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1255:1: ( (lv_FormalParameterSections_1_0= ruleformal_parameter_section ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1256:1: (lv_FormalParameterSections_1_0= ruleformal_parameter_section )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1256:1: (lv_FormalParameterSections_1_0= ruleformal_parameter_section )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1257:3: lv_FormalParameterSections_1_0= ruleformal_parameter_section
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormalParameterSectionsFormal_parameter_sectionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list2627);
            lv_FormalParameterSections_1_0=ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
              	        }
                     		add(
                     			current, 
                     			"FormalParameterSections",
                      		lv_FormalParameterSections_1_0, 
                      		"formal_parameter_section");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1273:2: (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_FormalParameterSections_3_0= ruleformal_parameter_section ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_SEMICOLON) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1273:3: this_SEMICOLON_2= RULE_SEMICOLON ( (lv_FormalParameterSections_3_0= ruleformal_parameter_section ) )
            	    {
            	    this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleformal_parameter_list2639); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_2, grammarAccess.getFormal_parameter_listAccess().getSEMICOLONTerminalRuleCall_2_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1277:1: ( (lv_FormalParameterSections_3_0= ruleformal_parameter_section ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1278:1: (lv_FormalParameterSections_3_0= ruleformal_parameter_section )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1278:1: (lv_FormalParameterSections_3_0= ruleformal_parameter_section )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1279:3: lv_FormalParameterSections_3_0= ruleformal_parameter_section
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormalParameterSectionsFormal_parameter_sectionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list2659);
            	    lv_FormalParameterSections_3_0=ruleformal_parameter_section();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"FormalParameterSections",
            	              		lv_FormalParameterSections_3_0, 
            	              		"formal_parameter_section");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            this_RIGHT_PARENTHESIS_4=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleformal_parameter_list2672); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_4, grammarAccess.getFormal_parameter_listAccess().getRIGHT_PARENTHESISTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1307:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1308:2: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1309:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section2707);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformal_parameter_section; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_section2717); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1316:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_valueParameterSection_0_0= rulevalue_parameter_section ) ) | ( (lv_variableParamenterSection_1_0= rulevariable_parameter_section ) ) | ( (lv_procedureHeading_2_0= ruleprocedure_heading ) ) | ( (lv_functionHeading_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_valueParameterSection_0_0 = null;

        EObject lv_variableParamenterSection_1_0 = null;

        EObject lv_procedureHeading_2_0 = null;

        EObject lv_functionHeading_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1319:28: ( ( ( (lv_valueParameterSection_0_0= rulevalue_parameter_section ) ) | ( (lv_variableParamenterSection_1_0= rulevariable_parameter_section ) ) | ( (lv_procedureHeading_2_0= ruleprocedure_heading ) ) | ( (lv_functionHeading_3_0= rulefunction_heading ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1320:1: ( ( (lv_valueParameterSection_0_0= rulevalue_parameter_section ) ) | ( (lv_variableParamenterSection_1_0= rulevariable_parameter_section ) ) | ( (lv_procedureHeading_2_0= ruleprocedure_heading ) ) | ( (lv_functionHeading_3_0= rulefunction_heading ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1320:1: ( ( (lv_valueParameterSection_0_0= rulevalue_parameter_section ) ) | ( (lv_variableParamenterSection_1_0= rulevariable_parameter_section ) ) | ( (lv_procedureHeading_2_0= ruleprocedure_heading ) ) | ( (lv_functionHeading_3_0= rulefunction_heading ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt17=1;
                }
                break;
            case 48:
                {
                alt17=2;
                }
                break;
            case 49:
                {
                alt17=3;
                }
                break;
            case 50:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1320:2: ( (lv_valueParameterSection_0_0= rulevalue_parameter_section ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1320:2: ( (lv_valueParameterSection_0_0= rulevalue_parameter_section ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1321:1: (lv_valueParameterSection_0_0= rulevalue_parameter_section )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1321:1: (lv_valueParameterSection_0_0= rulevalue_parameter_section )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1322:3: lv_valueParameterSection_0_0= rulevalue_parameter_section
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueParameterSectionValue_parameter_sectionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section2763);
                    lv_valueParameterSection_0_0=rulevalue_parameter_section();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      	        }
                             		set(
                             			current, 
                             			"valueParameterSection",
                              		lv_valueParameterSection_0_0, 
                              		"value_parameter_section");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1339:6: ( (lv_variableParamenterSection_1_0= rulevariable_parameter_section ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1339:6: ( (lv_variableParamenterSection_1_0= rulevariable_parameter_section ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1340:1: (lv_variableParamenterSection_1_0= rulevariable_parameter_section )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1340:1: (lv_variableParamenterSection_1_0= rulevariable_parameter_section )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1341:3: lv_variableParamenterSection_1_0= rulevariable_parameter_section
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableParamenterSectionVariable_parameter_sectionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section2790);
                    lv_variableParamenterSection_1_0=rulevariable_parameter_section();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      	        }
                             		set(
                             			current, 
                             			"variableParamenterSection",
                              		lv_variableParamenterSection_1_0, 
                              		"variable_parameter_section");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1358:6: ( (lv_procedureHeading_2_0= ruleprocedure_heading ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1358:6: ( (lv_procedureHeading_2_0= ruleprocedure_heading ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1359:1: (lv_procedureHeading_2_0= ruleprocedure_heading )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1359:1: (lv_procedureHeading_2_0= ruleprocedure_heading )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1360:3: lv_procedureHeading_2_0= ruleprocedure_heading
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureHeadingProcedure_headingParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section2817);
                    lv_procedureHeading_2_0=ruleprocedure_heading();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      	        }
                             		set(
                             			current, 
                             			"procedureHeading",
                              		lv_procedureHeading_2_0, 
                              		"procedure_heading");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1377:6: ( (lv_functionHeading_3_0= rulefunction_heading ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1377:6: ( (lv_functionHeading_3_0= rulefunction_heading ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1378:1: (lv_functionHeading_3_0= rulefunction_heading )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1378:1: (lv_functionHeading_3_0= rulefunction_heading )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1379:3: lv_functionHeading_3_0= rulefunction_heading
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionHeadingFunction_headingParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefunction_heading_in_ruleformal_parameter_section2844);
                    lv_functionHeading_3_0=rulefunction_heading();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      	        }
                             		set(
                             			current, 
                             			"functionHeading",
                              		lv_functionHeading_3_0, 
                              		"function_heading");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1403:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1404:2: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1405:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section2880);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevalue_parameter_section; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue_parameter_section2890); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1412:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_parameterType_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_parameterType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1415:28: ( ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_parameterType_2_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1416:1: ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_parameterType_2_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1416:1: ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_parameterType_2_0= ruleparameter_type ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1416:2: ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_parameterType_2_0= ruleparameter_type ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1416:2: ( (lv_identifierList_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1417:1: (lv_identifierList_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1417:1: (lv_identifierList_0_0= ruleidentifier_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1418:3: lv_identifierList_0_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifierListIdentifier_listParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section2936);
            lv_identifierList_0_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
              	        }
                     		set(
                     			current, 
                     			"identifierList",
                      		lv_identifierList_0_0, 
                      		"identifier_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulevalue_parameter_section2947); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_1, grammarAccess.getValue_parameter_sectionAccess().getCOLONTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1438:1: ( (lv_parameterType_2_0= ruleparameter_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1439:1: (lv_parameterType_2_0= ruleparameter_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1439:1: (lv_parameterType_2_0= ruleparameter_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1440:3: lv_parameterType_2_0= ruleparameter_type
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getParameterTypeParameter_typeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparameter_type_in_rulevalue_parameter_section2967);
            lv_parameterType_2_0=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_2_0, 
                      		"parameter_type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRulevariable_parameter_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1464:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1465:2: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1466:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section3003);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_parameter_section; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_parameter_section3013); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1473:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_COLON_2= RULE_COLON ( (lv_parameterType_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_COLON_2=null;
        EObject lv_identifierList_1_0 = null;

        EObject lv_parameterType_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1476:28: ( (otherlv_0= 'var' ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_COLON_2= RULE_COLON ( (lv_parameterType_3_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1477:1: (otherlv_0= 'var' ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_COLON_2= RULE_COLON ( (lv_parameterType_3_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1477:1: (otherlv_0= 'var' ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_COLON_2= RULE_COLON ( (lv_parameterType_3_0= ruleparameter_type ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1477:3: otherlv_0= 'var' ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_COLON_2= RULE_COLON ( (lv_parameterType_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulevariable_parameter_section3050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1481:1: ( (lv_identifierList_1_0= ruleidentifier_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1482:1: (lv_identifierList_1_0= ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1482:1: (lv_identifierList_1_0= ruleidentifier_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1483:3: lv_identifierList_1_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifierListIdentifier_listParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section3071);
            lv_identifierList_1_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
              	        }
                     		set(
                     			current, 
                     			"identifierList",
                      		lv_identifierList_1_0, 
                      		"identifier_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulevariable_parameter_section3082); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_2, grammarAccess.getVariable_parameter_sectionAccess().getCOLONTerminalRuleCall_2()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1503:1: ( (lv_parameterType_3_0= ruleparameter_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1504:1: (lv_parameterType_3_0= ruleparameter_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1504:1: (lv_parameterType_3_0= ruleparameter_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1505:3: lv_parameterType_3_0= ruleparameter_type
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getParameterTypeParameter_typeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparameter_type_in_rulevariable_parameter_section3102);
            lv_parameterType_3_0=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_3_0, 
                      		"parameter_type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1529:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1530:2: (iv_ruleparameter_type= ruleparameter_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1531:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_typeRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_type_in_entryRuleparameter_type3138);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_type3148); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1538:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_1_0= ruleconformant_array_schema ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_conformantArraySchema_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1541:28: ( ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_1_0= ruleconformant_array_schema ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1542:1: ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_1_0= ruleconformant_array_schema ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1542:1: ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_1_0= ruleconformant_array_schema ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_IDENTIFIER) ) {
                alt18=1;
            }
            else if ( (LA18_0==53||LA18_0==55) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1542:2: ( (lv_id_0_0= RULE_IDENTIFIER ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1542:2: ( (lv_id_0_0= RULE_IDENTIFIER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1543:1: (lv_id_0_0= RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1543:1: (lv_id_0_0= RULE_IDENTIFIER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1544:3: lv_id_0_0= RULE_IDENTIFIER
                    {
                    lv_id_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleparameter_type3190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_0_0, grammarAccess.getParameter_typeAccess().getIdIDENTIFIERTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameter_typeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_0_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1561:6: ( (lv_conformantArraySchema_1_0= ruleconformant_array_schema ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1561:6: ( (lv_conformantArraySchema_1_0= ruleconformant_array_schema ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1562:1: (lv_conformantArraySchema_1_0= ruleconformant_array_schema )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1562:1: (lv_conformantArraySchema_1_0= ruleconformant_array_schema )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1563:3: lv_conformantArraySchema_1_0= ruleconformant_array_schema
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameter_typeAccess().getConformantArraySchemaConformant_array_schemaParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleparameter_type3222);
                    lv_conformantArraySchema_1_0=ruleconformant_array_schema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"conformantArraySchema",
                              		lv_conformantArraySchema_1_0, 
                              		"conformant_array_schema");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1587:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1588:2: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1589:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            }
            pushFollow(FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema3258);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconformant_array_schema; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconformant_array_schema3268); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1596:1: ruleconformant_array_schema returns [EObject current=null] : (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_Schema_1= ruleunpacked_conformant_array_Schema ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject this_packed_conformant_array_schema_0 = null;

        EObject this_unpacked_conformant_array_Schema_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1599:28: ( (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_Schema_1= ruleunpacked_conformant_array_Schema ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1600:1: (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_Schema_1= ruleunpacked_conformant_array_Schema )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1600:1: (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_Schema_1= ruleunpacked_conformant_array_Schema )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            else if ( (LA19_0==55) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1601:5: this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPacked_conformant_array_schemaParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema3315);
                    this_packed_conformant_array_schema_0=rulepacked_conformant_array_schema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_packed_conformant_array_schema_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1611:5: this_unpacked_conformant_array_Schema_1= ruleunpacked_conformant_array_Schema
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpacked_conformant_array_SchemaParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleunpacked_conformant_array_Schema_in_ruleconformant_array_schema3342);
                    this_unpacked_conformant_array_Schema_1=ruleunpacked_conformant_array_Schema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_unpacked_conformant_array_Schema_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1627:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1628:2: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1629:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            }
            pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema3377);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepacked_conformant_array_schema; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepacked_conformant_array_schema3387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1636:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'packed array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecification_2_0= rulebound_specification ) ) this_RIGHT_BRACKETS_3= RULE_RIGHT_BRACKETS otherlv_4= 'of' ( (lv_id_5_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject rulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKETS_1=null;
        Token this_RIGHT_BRACKETS_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        EObject lv_boundSpecification_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1639:28: ( (otherlv_0= 'packed array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecification_2_0= rulebound_specification ) ) this_RIGHT_BRACKETS_3= RULE_RIGHT_BRACKETS otherlv_4= 'of' ( (lv_id_5_0= RULE_IDENTIFIER ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1640:1: (otherlv_0= 'packed array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecification_2_0= rulebound_specification ) ) this_RIGHT_BRACKETS_3= RULE_RIGHT_BRACKETS otherlv_4= 'of' ( (lv_id_5_0= RULE_IDENTIFIER ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1640:1: (otherlv_0= 'packed array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecification_2_0= rulebound_specification ) ) this_RIGHT_BRACKETS_3= RULE_RIGHT_BRACKETS otherlv_4= 'of' ( (lv_id_5_0= RULE_IDENTIFIER ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1640:3: otherlv_0= 'packed array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecification_2_0= rulebound_specification ) ) this_RIGHT_BRACKETS_3= RULE_RIGHT_BRACKETS otherlv_4= 'of' ( (lv_id_5_0= RULE_IDENTIFIER ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_rulepacked_conformant_array_schema3424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedArrayKeyword_0());
                  
            }
            this_LEFT_BRACKETS_1=(Token)match(input,RULE_LEFT_BRACKETS,FOLLOW_RULE_LEFT_BRACKETS_in_rulepacked_conformant_array_schema3435); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACKETS_1, grammarAccess.getPacked_conformant_array_schemaAccess().getLEFT_BRACKETSTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1648:1: ( (lv_boundSpecification_2_0= rulebound_specification ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1649:1: (lv_boundSpecification_2_0= rulebound_specification )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1649:1: (lv_boundSpecification_2_0= rulebound_specification )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1650:3: lv_boundSpecification_2_0= rulebound_specification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundSpecificationBound_specificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema3455);
            lv_boundSpecification_2_0=rulebound_specification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
              	        }
                     		set(
                     			current, 
                     			"boundSpecification",
                      		lv_boundSpecification_2_0, 
                      		"bound_specification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RIGHT_BRACKETS_3=(Token)match(input,RULE_RIGHT_BRACKETS,FOLLOW_RULE_RIGHT_BRACKETS_in_rulepacked_conformant_array_schema3466); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACKETS_3, grammarAccess.getPacked_conformant_array_schemaAccess().getRIGHT_BRACKETSTerminalRuleCall_3()); 
                  
            }
            otherlv_4=(Token)match(input,54,FOLLOW_54_in_rulepacked_conformant_array_schema3477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_4());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1674:1: ( (lv_id_5_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1675:1: (lv_id_5_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1675:1: (lv_id_5_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1676:3: lv_id_5_0= RULE_IDENTIFIER
            {
            lv_id_5_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepacked_conformant_array_schema3494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_5_0, grammarAccess.getPacked_conformant_array_schemaAccess().getIdIDENTIFIERTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPacked_conformant_array_schemaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_5_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRuleunpacked_conformant_array_Schema"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1700:1: entryRuleunpacked_conformant_array_Schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_Schema= ruleunpacked_conformant_array_Schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_Schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_Schema = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1701:2: (iv_ruleunpacked_conformant_array_Schema= ruleunpacked_conformant_array_Schema EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1702:2: iv_ruleunpacked_conformant_array_Schema= ruleunpacked_conformant_array_Schema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpacked_conformant_array_SchemaRule()); 
            }
            pushFollow(FOLLOW_ruleunpacked_conformant_array_Schema_in_entryRuleunpacked_conformant_array_Schema3535);
            iv_ruleunpacked_conformant_array_Schema=ruleunpacked_conformant_array_Schema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunpacked_conformant_array_Schema; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_conformant_array_Schema3545); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_conformant_array_Schema"


    // $ANTLR start "ruleunpacked_conformant_array_Schema"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1709:1: ruleunpacked_conformant_array_Schema returns [EObject current=null] : (otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecifications_2_0= rulebound_specification ) ) (this_SEMICOLON_3= RULE_SEMICOLON ( (lv_boundSpecifications_4_0= rulebound_specification ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( ( (lv_id_7_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_8_0= ruleconformant_array_schema ) ) ) ) ;
    public final EObject ruleunpacked_conformant_array_Schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKETS_1=null;
        Token this_SEMICOLON_3=null;
        Token this_RIGHT_BRACKETS_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        EObject lv_boundSpecifications_2_0 = null;

        EObject lv_boundSpecifications_4_0 = null;

        EObject lv_conformantArraySchema_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1712:28: ( (otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecifications_2_0= rulebound_specification ) ) (this_SEMICOLON_3= RULE_SEMICOLON ( (lv_boundSpecifications_4_0= rulebound_specification ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( ( (lv_id_7_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_8_0= ruleconformant_array_schema ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1713:1: (otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecifications_2_0= rulebound_specification ) ) (this_SEMICOLON_3= RULE_SEMICOLON ( (lv_boundSpecifications_4_0= rulebound_specification ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( ( (lv_id_7_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_8_0= ruleconformant_array_schema ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1713:1: (otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecifications_2_0= rulebound_specification ) ) (this_SEMICOLON_3= RULE_SEMICOLON ( (lv_boundSpecifications_4_0= rulebound_specification ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( ( (lv_id_7_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_8_0= ruleconformant_array_schema ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1713:3: otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_boundSpecifications_2_0= rulebound_specification ) ) (this_SEMICOLON_3= RULE_SEMICOLON ( (lv_boundSpecifications_4_0= rulebound_specification ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( ( (lv_id_7_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_8_0= ruleconformant_array_schema ) ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleunpacked_conformant_array_Schema3582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_SchemaAccess().getArrayKeyword_0());
                  
            }
            this_LEFT_BRACKETS_1=(Token)match(input,RULE_LEFT_BRACKETS,FOLLOW_RULE_LEFT_BRACKETS_in_ruleunpacked_conformant_array_Schema3593); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACKETS_1, grammarAccess.getUnpacked_conformant_array_SchemaAccess().getLEFT_BRACKETSTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1721:1: ( (lv_boundSpecifications_2_0= rulebound_specification ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1722:1: (lv_boundSpecifications_2_0= rulebound_specification )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1722:1: (lv_boundSpecifications_2_0= rulebound_specification )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1723:3: lv_boundSpecifications_2_0= rulebound_specification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_SchemaAccess().getBoundSpecificationsBound_specificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_Schema3613);
            lv_boundSpecifications_2_0=rulebound_specification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_SchemaRule());
              	        }
                     		add(
                     			current, 
                     			"boundSpecifications",
                      		lv_boundSpecifications_2_0, 
                      		"bound_specification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1739:2: (this_SEMICOLON_3= RULE_SEMICOLON ( (lv_boundSpecifications_4_0= rulebound_specification ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SEMICOLON) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1739:3: this_SEMICOLON_3= RULE_SEMICOLON ( (lv_boundSpecifications_4_0= rulebound_specification ) )
            	    {
            	    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleunpacked_conformant_array_Schema3625); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_3, grammarAccess.getUnpacked_conformant_array_SchemaAccess().getSEMICOLONTerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1743:1: ( (lv_boundSpecifications_4_0= rulebound_specification ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1744:1: (lv_boundSpecifications_4_0= rulebound_specification )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1744:1: (lv_boundSpecifications_4_0= rulebound_specification )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1745:3: lv_boundSpecifications_4_0= rulebound_specification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_SchemaAccess().getBoundSpecificationsBound_specificationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_Schema3645);
            	    lv_boundSpecifications_4_0=rulebound_specification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_SchemaRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"boundSpecifications",
            	              		lv_boundSpecifications_4_0, 
            	              		"bound_specification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            this_RIGHT_BRACKETS_5=(Token)match(input,RULE_RIGHT_BRACKETS,FOLLOW_RULE_RIGHT_BRACKETS_in_ruleunpacked_conformant_array_Schema3658); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACKETS_5, grammarAccess.getUnpacked_conformant_array_SchemaAccess().getRIGHT_BRACKETSTerminalRuleCall_4()); 
                  
            }
            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleunpacked_conformant_array_Schema3669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_SchemaAccess().getOfKeyword_5());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1769:1: ( ( (lv_id_7_0= RULE_IDENTIFIER ) ) | ( (lv_conformantArraySchema_8_0= ruleconformant_array_schema ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_IDENTIFIER) ) {
                alt21=1;
            }
            else if ( (LA21_0==53||LA21_0==55) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1769:2: ( (lv_id_7_0= RULE_IDENTIFIER ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1769:2: ( (lv_id_7_0= RULE_IDENTIFIER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1770:1: (lv_id_7_0= RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1770:1: (lv_id_7_0= RULE_IDENTIFIER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1771:3: lv_id_7_0= RULE_IDENTIFIER
                    {
                    lv_id_7_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleunpacked_conformant_array_Schema3687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_7_0, grammarAccess.getUnpacked_conformant_array_SchemaAccess().getIdIDENTIFIERTerminalRuleCall_6_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnpacked_conformant_array_SchemaRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_7_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1788:6: ( (lv_conformantArraySchema_8_0= ruleconformant_array_schema ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1788:6: ( (lv_conformantArraySchema_8_0= ruleconformant_array_schema ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1789:1: (lv_conformantArraySchema_8_0= ruleconformant_array_schema )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1789:1: (lv_conformantArraySchema_8_0= ruleconformant_array_schema )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1790:3: lv_conformantArraySchema_8_0= ruleconformant_array_schema
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_SchemaAccess().getConformantArraySchemaConformant_array_schemaParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleunpacked_conformant_array_Schema3719);
                    lv_conformantArraySchema_8_0=ruleconformant_array_schema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_SchemaRule());
                      	        }
                             		set(
                             			current, 
                             			"conformantArraySchema",
                              		lv_conformantArraySchema_8_0, 
                              		"conformant_array_schema");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_conformant_array_Schema"


    // $ANTLR start "entryRulebound_specification"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1814:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1815:2: (iv_rulebound_specification= rulebound_specification EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1816:2: iv_rulebound_specification= rulebound_specification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBound_specificationRule()); 
            }
            pushFollow(FOLLOW_rulebound_specification_in_entryRulebound_specification3756);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebound_specification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulebound_specification3766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1823:1: rulebound_specification returns [EObject current=null] : ( ( (lv_id1_0_0= RULE_IDENTIFIER ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_id2_2_0= RULE_IDENTIFIER ) ) this_COLON_3= RULE_COLON ( (lv_id3_4_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token lv_id1_0_0=null;
        Token this_DIAERESIS_1=null;
        Token lv_id2_2_0=null;
        Token this_COLON_3=null;
        Token lv_id3_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1826:28: ( ( ( (lv_id1_0_0= RULE_IDENTIFIER ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_id2_2_0= RULE_IDENTIFIER ) ) this_COLON_3= RULE_COLON ( (lv_id3_4_0= RULE_IDENTIFIER ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1827:1: ( ( (lv_id1_0_0= RULE_IDENTIFIER ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_id2_2_0= RULE_IDENTIFIER ) ) this_COLON_3= RULE_COLON ( (lv_id3_4_0= RULE_IDENTIFIER ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1827:1: ( ( (lv_id1_0_0= RULE_IDENTIFIER ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_id2_2_0= RULE_IDENTIFIER ) ) this_COLON_3= RULE_COLON ( (lv_id3_4_0= RULE_IDENTIFIER ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1827:2: ( (lv_id1_0_0= RULE_IDENTIFIER ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_id2_2_0= RULE_IDENTIFIER ) ) this_COLON_3= RULE_COLON ( (lv_id3_4_0= RULE_IDENTIFIER ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1827:2: ( (lv_id1_0_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1828:1: (lv_id1_0_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1828:1: (lv_id1_0_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1829:3: lv_id1_0_0= RULE_IDENTIFIER
            {
            lv_id1_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulebound_specification3808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id1_0_0, grammarAccess.getBound_specificationAccess().getId1IDENTIFIERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBound_specificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id1",
                      		lv_id1_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            this_DIAERESIS_1=(Token)match(input,RULE_DIAERESIS,FOLLOW_RULE_DIAERESIS_in_rulebound_specification3824); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DIAERESIS_1, grammarAccess.getBound_specificationAccess().getDIAERESISTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1849:1: ( (lv_id2_2_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1850:1: (lv_id2_2_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1850:1: (lv_id2_2_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1851:3: lv_id2_2_0= RULE_IDENTIFIER
            {
            lv_id2_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulebound_specification3840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id2_2_0, grammarAccess.getBound_specificationAccess().getId2IDENTIFIERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBound_specificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id2",
                      		lv_id2_2_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulebound_specification3856); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_3, grammarAccess.getBound_specificationAccess().getCOLONTerminalRuleCall_3()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1871:1: ( (lv_id3_4_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1872:1: (lv_id3_4_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1872:1: (lv_id3_4_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1873:3: lv_id3_4_0= RULE_IDENTIFIER
            {
            lv_id3_4_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulebound_specification3872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id3_4_0, grammarAccess.getBound_specificationAccess().getId3IDENTIFIERTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBound_specificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id3",
                      		lv_id3_4_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRulestatement_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1897:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1898:2: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1899:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            }
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence3913);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_sequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence3923); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1906:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1909:28: ( ( ( (lv_statements_0_0= rulestatement ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1910:1: ( ( (lv_statements_0_0= rulestatement ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1910:1: ( ( (lv_statements_0_0= rulestatement ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_statements_2_0= rulestatement ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1910:2: ( (lv_statements_0_0= rulestatement ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1910:2: ( (lv_statements_0_0= rulestatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1911:1: (lv_statements_0_0= rulestatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1911:1: (lv_statements_0_0= rulestatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1912:3: lv_statements_0_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence3969);
            lv_statements_0_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
              	        }
                     		add(
                     			current, 
                     			"statements",
                      		lv_statements_0_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1928:2: (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_statements_2_0= rulestatement ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SEMICOLON) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1928:3: this_SEMICOLON_1= RULE_SEMICOLON ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulestatement_sequence3981); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_1, grammarAccess.getStatement_sequenceAccess().getSEMICOLONTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1932:1: ( (lv_statements_2_0= rulestatement ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1933:1: (lv_statements_2_0= rulestatement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1933:1: (lv_statements_2_0= rulestatement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1934:3: lv_statements_2_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence4001);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1958:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1959:2: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1960:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement4039);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement4049); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1967:1: rulestatement returns [EObject current=null] : ( (this_label_0= rulelabel this_COLON_1= RULE_COLON )? ( ( (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        EObject this_label_0 = null;

        EObject lv_statement_2_1 = null;

        EObject lv_statement_2_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1970:28: ( ( (this_label_0= rulelabel this_COLON_1= RULE_COLON )? ( ( (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1971:1: ( (this_label_0= rulelabel this_COLON_1= RULE_COLON )? ( ( (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1971:1: ( (this_label_0= rulelabel this_COLON_1= RULE_COLON )? ( ( (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1971:2: (this_label_0= rulelabel this_COLON_1= RULE_COLON )? ( ( (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1971:2: (this_label_0= rulelabel this_COLON_1= RULE_COLON )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INTEGER_NUMBER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1972:5: this_label_0= rulelabel this_COLON_1= RULE_COLON
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulelabel_in_rulestatement4097);
                    this_label_0=rulelabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_label_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulestatement4107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_1, grammarAccess.getStatementAccess().getCOLONTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1984:3: ( ( (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1985:1: ( (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1985:1: ( (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1986:1: (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1986:1: (lv_statement_2_1= rulesimple_statement | lv_statement_2_2= rulestructured_statement )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENTIFIER||LA24_0==56||LA24_0==58) ) {
                alt24=1;
            }
            else if ( (LA24_0==51||LA24_0==59||LA24_0==61||LA24_0==63||LA24_0==66||(LA24_0>=69 && LA24_0<=70)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1987:3: lv_statement_2_1= rulesimple_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementSimple_statementParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement4131);
                    lv_statement_2_1=rulesimple_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_2_1, 
                              		"simple_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2002:8: lv_statement_2_2= rulestructured_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStructured_statementParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestructured_statement_in_rulestatement4150);
                    lv_statement_2_2=rulestructured_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_2_2, 
                              		"structured_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulesimple_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2028:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2029:2: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2030:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_statementRule()); 
            }
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement4189);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement4199); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2037:1: rulesimple_statement returns [EObject current=null] : (this_assignment_statement_0= ruleassignment_statement | this_procedure_statement_1= ruleprocedure_statement | this_goto_statement_2= rulegoto_statement ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject this_assignment_statement_0 = null;

        EObject this_procedure_statement_1 = null;

        EObject this_goto_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2040:28: ( (this_assignment_statement_0= ruleassignment_statement | this_procedure_statement_1= ruleprocedure_statement | this_goto_statement_2= rulegoto_statement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2041:1: (this_assignment_statement_0= ruleassignment_statement | this_procedure_statement_1= ruleprocedure_statement | this_goto_statement_2= rulegoto_statement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2041:1: (this_assignment_statement_0= ruleassignment_statement | this_procedure_statement_1= ruleprocedure_statement | this_goto_statement_2= rulegoto_statement )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt25=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==RULE_SEMICOLON||LA25_2==52||LA25_2==57||LA25_2==62||LA25_2==68) ) {
                    alt25=2;
                }
                else if ( (LA25_2==RULE_ASSIGNMENT_SIGN) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2042:5: this_assignment_statement_0= ruleassignment_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement4246);
                    this_assignment_statement_0=ruleassignment_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_assignment_statement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2052:5: this_procedure_statement_1= ruleprocedure_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimple_statementAccess().getProcedure_statementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleprocedure_statement_in_rulesimple_statement4273);
                    this_procedure_statement_1=ruleprocedure_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_procedure_statement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2062:5: this_goto_statement_2= rulegoto_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimple_statementAccess().getGoto_statementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulegoto_statement_in_rulesimple_statement4300);
                    this_goto_statement_2=rulegoto_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_goto_statement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2078:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2079:2: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2080:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            }
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement4335);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement4345); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2087:1: ruleassignment_statement returns [EObject current=null] : ( ( ( (lv_variable_0_0= 'variable' ) ) | ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token lv_identifier_1_0=null;
        Token this_ASSIGNMENT_SIGN_2=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2090:28: ( ( ( ( (lv_variable_0_0= 'variable' ) ) | ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression_3_0= ruleexpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2091:1: ( ( ( (lv_variable_0_0= 'variable' ) ) | ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2091:1: ( ( ( (lv_variable_0_0= 'variable' ) ) | ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression_3_0= ruleexpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2091:2: ( ( (lv_variable_0_0= 'variable' ) ) | ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression_3_0= ruleexpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2091:2: ( ( (lv_variable_0_0= 'variable' ) ) | ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==56) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_IDENTIFIER) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2091:3: ( (lv_variable_0_0= 'variable' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2091:3: ( (lv_variable_0_0= 'variable' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2092:1: (lv_variable_0_0= 'variable' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2092:1: (lv_variable_0_0= 'variable' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2093:3: lv_variable_0_0= 'variable'
                    {
                    lv_variable_0_0=(Token)match(input,56,FOLLOW_56_in_ruleassignment_statement4389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_variable_0_0, grammarAccess.getAssignment_statementAccess().getVariableVariableKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignment_statementRule());
                      	        }
                             		setWithLastConsumed(current, "variable", lv_variable_0_0, "variable");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2107:6: ( (lv_identifier_1_0= RULE_IDENTIFIER ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2107:6: ( (lv_identifier_1_0= RULE_IDENTIFIER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2108:1: (lv_identifier_1_0= RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2108:1: (lv_identifier_1_0= RULE_IDENTIFIER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2109:3: lv_identifier_1_0= RULE_IDENTIFIER
                    {
                    lv_identifier_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleassignment_statement4425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_1_0, grammarAccess.getAssignment_statementAccess().getIdentifierIDENTIFIERTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignment_statementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_1_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            this_ASSIGNMENT_SIGN_2=(Token)match(input,RULE_ASSIGNMENT_SIGN,FOLLOW_RULE_ASSIGNMENT_SIGN_in_ruleassignment_statement4442); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ASSIGNMENT_SIGN_2, grammarAccess.getAssignment_statementAccess().getASSIGNMENT_SIGNTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2129:1: ( (lv_expression_3_0= ruleexpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2130:1: (lv_expression_3_0= ruleexpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2130:1: (lv_expression_3_0= ruleexpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2131:3: lv_expression_3_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement4462);
            lv_expression_3_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRuleprocedure_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2155:1: entryRuleprocedure_statement returns [EObject current=null] : iv_ruleprocedure_statement= ruleprocedure_statement EOF ;
    public final EObject entryRuleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2156:2: (iv_ruleprocedure_statement= ruleprocedure_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2157:2: iv_ruleprocedure_statement= ruleprocedure_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_statementRule()); 
            }
            pushFollow(FOLLOW_ruleprocedure_statement_in_entryRuleprocedure_statement4498);
            iv_ruleprocedure_statement=ruleprocedure_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_statement4508); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_statement"


    // $ANTLR start "ruleprocedure_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2164:1: ruleprocedure_statement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_actualParameterList_1_0= 'ActualParameterList' ) )? ) ;
    public final EObject ruleprocedure_statement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_actualParameterList_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2167:28: ( ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_actualParameterList_1_0= 'ActualParameterList' ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2168:1: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_actualParameterList_1_0= 'ActualParameterList' ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2168:1: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_actualParameterList_1_0= 'ActualParameterList' ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2168:2: ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_actualParameterList_1_0= 'ActualParameterList' ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2168:2: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2169:1: (lv_name_0_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2169:1: (lv_name_0_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2170:3: lv_name_0_0= RULE_IDENTIFIER
            {
            lv_name_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_statement4550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getProcedure_statementAccess().getNameIDENTIFIERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProcedure_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2186:2: ( (lv_actualParameterList_1_0= 'ActualParameterList' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2187:1: (lv_actualParameterList_1_0= 'ActualParameterList' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2187:1: (lv_actualParameterList_1_0= 'ActualParameterList' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2188:3: lv_actualParameterList_1_0= 'ActualParameterList'
                    {
                    lv_actualParameterList_1_0=(Token)match(input,57,FOLLOW_57_in_ruleprocedure_statement4573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_actualParameterList_1_0, grammarAccess.getProcedure_statementAccess().getActualParameterListActualParameterListKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProcedure_statementRule());
                      	        }
                             		setWithLastConsumed(current, "actualParameterList", lv_actualParameterList_1_0, "ActualParameterList");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_statement"


    // $ANTLR start "entryRulegoto_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2209:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2210:2: (iv_rulegoto_statement= rulegoto_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2211:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoto_statementRule()); 
            }
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement4623);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulegoto_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement4633); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2218:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= 'goto' this_label_1= rulelabel ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_label_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2221:28: ( (otherlv_0= 'goto' this_label_1= rulelabel ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2222:1: (otherlv_0= 'goto' this_label_1= rulelabel )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2222:1: (otherlv_0= 'goto' this_label_1= rulelabel )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2222:3: otherlv_0= 'goto' this_label_1= rulelabel
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_rulegoto_statement4670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulelabel_in_rulegoto_statement4692);
            this_label_1=rulelabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_label_1; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRulestructured_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2243:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2244:2: (iv_rulestructured_statement= rulestructured_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2245:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructured_statementRule()); 
            }
            pushFollow(FOLLOW_rulestructured_statement_in_entryRulestructured_statement4727);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructured_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_statement4737); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2252:1: rulestructured_statement returns [EObject current=null] : (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject this_compound_statement_0 = null;

        EObject this_repetitive_statement_1 = null;

        EObject this_conditional_statement_2 = null;

        EObject this_with_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2255:28: ( (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2256:1: (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2256:1: (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt28=1;
                }
                break;
            case 59:
            case 61:
            case 63:
                {
                alt28=2;
                }
                break;
            case 66:
            case 69:
                {
                alt28=3;
                }
                break;
            case 70:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2257:5: this_compound_statement_0= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructured_statementAccess().getCompound_statementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestructured_statement4784);
                    this_compound_statement_0=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_compound_statement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2267:5: this_repetitive_statement_1= rulerepetitive_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitive_statementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rulestructured_statement4811);
                    this_repetitive_statement_1=rulerepetitive_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_repetitive_statement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2277:5: this_conditional_statement_2= ruleconditional_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructured_statementAccess().getConditional_statementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleconditional_statement_in_rulestructured_statement4838);
                    this_conditional_statement_2=ruleconditional_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_conditional_statement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2287:5: this_with_statement_3= rulewith_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructured_statementAccess().getWith_statementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulewith_statement_in_rulestructured_statement4865);
                    this_with_statement_3=rulewith_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_with_statement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2303:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2304:2: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2305:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompound_statementRule()); 
            }
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement4900);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompound_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement4910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2312:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statementSequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2315:28: ( (otherlv_0= 'begin' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2316:1: (otherlv_0= 'begin' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2316:1: (otherlv_0= 'begin' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2316:3: otherlv_0= 'begin' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_rulecompound_statement4947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2320:1: ( (lv_statementSequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2321:1: (lv_statementSequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2321:1: (lv_statementSequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2322:3: lv_statementSequence_1_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompound_statementAccess().getStatementSequenceStatement_sequenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_sequence_in_rulecompound_statement4968);
            lv_statementSequence_1_0=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompound_statementRule());
              	        }
                     		set(
                     			current, 
                     			"statementSequence",
                      		lv_statementSequence_1_0, 
                      		"statement_sequence");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_52_in_rulecompound_statement4980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2350:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2351:2: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2352:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            }
            pushFollow(FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement5016);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerepetitive_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerepetitive_statement5026); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2359:1: rulerepetitive_statement returns [EObject current=null] : (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject this_while_statement_0 = null;

        EObject this_repeat_statement_1 = null;

        EObject this_for_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2362:28: ( (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2363:1: (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2363:1: (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt29=1;
                }
                break;
            case 61:
                {
                alt29=2;
                }
                break;
            case 63:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2364:5: this_while_statement_0= rulewhile_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhile_statementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulewhile_statement_in_rulerepetitive_statement5073);
                    this_while_statement_0=rulewhile_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_while_statement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2374:5: this_repeat_statement_1= rulerepeat_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeat_statementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulerepeat_statement_in_rulerepetitive_statement5100);
                    this_repeat_statement_1=rulerepeat_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_repeat_statement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2384:5: this_for_statement_2= rulefor_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRepetitive_statementAccess().getFor_statementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulefor_statement_in_rulerepetitive_statement5127);
                    this_for_statement_2=rulefor_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_for_statement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulewhile_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2400:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2401:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2402:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement5162);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewhile_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement5172); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2409:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2412:28: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2413:1: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2413:1: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2413:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_rulewhile_statement5209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2417:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2418:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2418:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2419:3: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement5230);
            lv_expression_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_rulewhile_statement5242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2439:1: ( (lv_statement_3_0= rulestatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2440:1: (lv_statement_3_0= rulestatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2440:1: (lv_statement_3_0= rulestatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2441:3: lv_statement_3_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement5263);
            lv_statement_3_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_3_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulerepeat_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2465:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2466:2: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2467:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            }
            pushFollow(FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement5299);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerepeat_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerepeat_statement5309); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepeat_statement"


    // $ANTLR start "rulerepeat_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2474:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statementSequence_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2477:28: ( (otherlv_0= 'repeat' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2478:1: (otherlv_0= 'repeat' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2478:1: (otherlv_0= 'repeat' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2478:3: otherlv_0= 'repeat' ( (lv_statementSequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_rulerepeat_statement5346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2482:1: ( (lv_statementSequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2483:1: (lv_statementSequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2483:1: (lv_statementSequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2484:3: lv_statementSequence_1_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRepeat_statementAccess().getStatementSequenceStatement_sequenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_sequence_in_rulerepeat_statement5367);
            lv_statementSequence_1_0=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
              	        }
                     		set(
                     			current, 
                     			"statementSequence",
                      		lv_statementSequence_1_0, 
                      		"statement_sequence");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,62,FOLLOW_62_in_rulerepeat_statement5379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2504:1: ( (lv_expression_3_0= ruleexpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2505:1: (lv_expression_3_0= ruleexpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2505:1: (lv_expression_3_0= ruleexpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2506:3: lv_expression_3_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulerepeat_statement5400);
            lv_expression_3_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulefor_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2530:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2531:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2532:2: iv_rulefor_statement= rulefor_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement5436);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement5446); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2539:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_name_1_0= RULE_IDENTIFIER ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression1_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expression2_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_SIGN_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression1_3_0 = null;

        EObject lv_expression2_6_0 = null;

        EObject lv_statement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2542:28: ( (otherlv_0= 'for' ( (lv_name_1_0= RULE_IDENTIFIER ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression1_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expression2_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2543:1: (otherlv_0= 'for' ( (lv_name_1_0= RULE_IDENTIFIER ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression1_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expression2_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2543:1: (otherlv_0= 'for' ( (lv_name_1_0= RULE_IDENTIFIER ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression1_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expression2_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2543:3: otherlv_0= 'for' ( (lv_name_1_0= RULE_IDENTIFIER ) ) this_ASSIGNMENT_SIGN_2= RULE_ASSIGNMENT_SIGN ( (lv_expression1_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expression2_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_rulefor_statement5483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2547:1: ( (lv_name_1_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2548:1: (lv_name_1_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2548:1: (lv_name_1_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2549:3: lv_name_1_0= RULE_IDENTIFIER
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefor_statement5500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFor_statementAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFor_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            this_ASSIGNMENT_SIGN_2=(Token)match(input,RULE_ASSIGNMENT_SIGN,FOLLOW_RULE_ASSIGNMENT_SIGN_in_rulefor_statement5516); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ASSIGNMENT_SIGN_2, grammarAccess.getFor_statementAccess().getASSIGNMENT_SIGNTerminalRuleCall_2()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2569:1: ( (lv_expression1_3_0= ruleexpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2570:1: (lv_expression1_3_0= ruleexpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2570:1: (lv_expression1_3_0= ruleexpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2571:3: lv_expression1_3_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpression1ExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulefor_statement5536);
            lv_expression1_3_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression1",
                      		lv_expression1_3_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2587:2: (otherlv_4= 'to' | otherlv_5= 'downto' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==64) ) {
                alt30=1;
            }
            else if ( (LA30_0==65) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2587:4: otherlv_4= 'to'
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_64_in_rulefor_statement5549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFor_statementAccess().getToKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2592:7: otherlv_5= 'downto'
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_65_in_rulefor_statement5567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDowntoKeyword_4_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2596:2: ( (lv_expression2_6_0= ruleexpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2597:1: (lv_expression2_6_0= ruleexpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2597:1: (lv_expression2_6_0= ruleexpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2598:3: lv_expression2_6_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpression2ExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulefor_statement5589);
            lv_expression2_6_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression2",
                      		lv_expression2_6_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,60,FOLLOW_60_in_rulefor_statement5601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFor_statementAccess().getDoKeyword_6());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2618:1: ( (lv_statement_8_0= rulestatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2619:1: (lv_statement_8_0= rulestatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2619:1: (lv_statement_8_0= rulestatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2620:3: lv_statement_8_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement5622);
            lv_statement_8_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_8_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2644:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2645:2: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2646:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditional_statementRule()); 
            }
            pushFollow(FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement5658);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconditional_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_statement5668); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2653:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_ifStatement_0_0= ruleif_statement ) ) | ( (lv_caseStatement_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifStatement_0_0 = null;

        EObject lv_caseStatement_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2656:28: ( ( ( (lv_ifStatement_0_0= ruleif_statement ) ) | ( (lv_caseStatement_1_0= rulecase_statement ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2657:1: ( ( (lv_ifStatement_0_0= ruleif_statement ) ) | ( (lv_caseStatement_1_0= rulecase_statement ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2657:1: ( ( (lv_ifStatement_0_0= ruleif_statement ) ) | ( (lv_caseStatement_1_0= rulecase_statement ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==66) ) {
                alt31=1;
            }
            else if ( (LA31_0==69) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2657:2: ( (lv_ifStatement_0_0= ruleif_statement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2657:2: ( (lv_ifStatement_0_0= ruleif_statement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2658:1: (lv_ifStatement_0_0= ruleif_statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2658:1: (lv_ifStatement_0_0= ruleif_statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2659:3: lv_ifStatement_0_0= ruleif_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditional_statementAccess().getIfStatementIf_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleif_statement_in_ruleconditional_statement5714);
                    lv_ifStatement_0_0=ruleif_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"ifStatement",
                              		lv_ifStatement_0_0, 
                              		"if_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2676:6: ( (lv_caseStatement_1_0= rulecase_statement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2676:6: ( (lv_caseStatement_1_0= rulecase_statement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2677:1: (lv_caseStatement_1_0= rulecase_statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2677:1: (lv_caseStatement_1_0= rulecase_statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2678:3: lv_caseStatement_1_0= rulecase_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditional_statementAccess().getCaseStatementCase_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecase_statement_in_ruleconditional_statement5741);
                    lv_caseStatement_1_0=rulecase_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"caseStatement",
                              		lv_caseStatement_1_0, 
                              		"case_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2702:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2703:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2704:2: iv_ruleif_statement= ruleif_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement5777);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleif_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement5787); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2711:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= rulestatement ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_elseStatement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2714:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= rulestatement ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2715:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2715:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2715:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleif_statement5824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2719:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2720:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2720:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2721:3: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement5845);
            lv_expression_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleif_statement5857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2741:1: ( (lv_ifStatement_3_0= rulestatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2742:1: (lv_ifStatement_3_0= rulestatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2742:1: (lv_ifStatement_3_0= rulestatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2743:3: lv_ifStatement_3_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement5878);
            lv_ifStatement_3_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"ifStatement",
                      		lv_ifStatement_3_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2759:2: ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= rulestatement ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==68) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred1_InternalPascal()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2759:3: ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= rulestatement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2759:3: ( ( 'else' )=>otherlv_4= 'else' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2759:4: ( 'else' )=>otherlv_4= 'else'
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleif_statement5899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2764:2: ( (lv_elseStatement_5_0= rulestatement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2765:1: (lv_elseStatement_5_0= rulestatement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2765:1: (lv_elseStatement_5_0= rulestatement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2766:3: lv_elseStatement_5_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement5921);
                    lv_elseStatement_5_0=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_5_0, 
                              		"statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRulecase_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2790:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2791:2: (iv_rulecase_statement= rulecase_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2792:2: iv_rulecase_statement= rulecase_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCase_statementRule()); 
            }
            pushFollow(FOLLOW_rulecase_statement_in_entryRulecase_statement5959);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecase_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_statement5969); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2799:1: rulecase_statement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseLimbs_3_0= rulecase_limb ) ) (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_caseLimbs_5_0= rulecase_limb ) ) )* (this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'end' ) ;
    public final EObject rulecase_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_4=null;
        Token this_SEMICOLON_6=null;
        Token otherlv_7=null;
        EObject lv_expression_1_0 = null;

        EObject lv_caseLimbs_3_0 = null;

        EObject lv_caseLimbs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2802:28: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseLimbs_3_0= rulecase_limb ) ) (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_caseLimbs_5_0= rulecase_limb ) ) )* (this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'end' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2803:1: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseLimbs_3_0= rulecase_limb ) ) (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_caseLimbs_5_0= rulecase_limb ) ) )* (this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'end' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2803:1: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseLimbs_3_0= rulecase_limb ) ) (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_caseLimbs_5_0= rulecase_limb ) ) )* (this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'end' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2803:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseLimbs_3_0= rulecase_limb ) ) (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_caseLimbs_5_0= rulecase_limb ) ) )* (this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_rulecase_statement6006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2807:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2808:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2808:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2809:3: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulecase_statement6027);
            lv_expression_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,54,FOLLOW_54_in_rulecase_statement6039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2829:1: ( (lv_caseLimbs_3_0= rulecase_limb ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2830:1: (lv_caseLimbs_3_0= rulecase_limb )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2830:1: (lv_caseLimbs_3_0= rulecase_limb )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2831:3: lv_caseLimbs_3_0= rulecase_limb
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCase_statementAccess().getCaseLimbsCase_limbParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement6060);
            lv_caseLimbs_3_0=rulecase_limb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
              	        }
                     		add(
                     			current, 
                     			"caseLimbs",
                      		lv_caseLimbs_3_0, 
                      		"case_limb");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2847:2: (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_caseLimbs_5_0= rulecase_limb ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_SEMICOLON) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_IDENTIFIER||LA33_1==RULE_STRING1||(LA33_1>=RULE_INTEGER_NUMBER && LA33_1<=RULE_REAL_NUMBER)||(LA33_1>=71 && LA33_1<=72)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2847:3: this_SEMICOLON_4= RULE_SEMICOLON ( (lv_caseLimbs_5_0= rulecase_limb ) )
            	    {
            	    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulecase_statement6072); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_4, grammarAccess.getCase_statementAccess().getSEMICOLONTerminalRuleCall_4_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2851:1: ( (lv_caseLimbs_5_0= rulecase_limb ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2852:1: (lv_caseLimbs_5_0= rulecase_limb )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2852:1: (lv_caseLimbs_5_0= rulecase_limb )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2853:3: lv_caseLimbs_5_0= rulecase_limb
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCase_statementAccess().getCaseLimbsCase_limbParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement6092);
            	    lv_caseLimbs_5_0=rulecase_limb();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"caseLimbs",
            	              		lv_caseLimbs_5_0, 
            	              		"case_limb");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2869:4: (this_SEMICOLON_6= RULE_SEMICOLON )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_SEMICOLON) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2869:5: this_SEMICOLON_6= RULE_SEMICOLON
                    {
                    this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulecase_statement6106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_6, grammarAccess.getCase_statementAccess().getSEMICOLONTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_rulecase_statement6119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCase_statementAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_limb"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2885:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2886:2: (iv_rulecase_limb= rulecase_limb EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2887:2: iv_rulecase_limb= rulecase_limb EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCase_limbRule()); 
            }
            pushFollow(FOLLOW_rulecase_limb_in_entryRulecase_limb6155);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecase_limb; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_limb6165); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_limb"


    // $ANTLR start "rulecase_limb"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2894:1: rulecase_limb returns [EObject current=null] : ( ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        EObject lv_caseLabelList_0_0 = null;

        EObject lv_statement_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2897:28: ( ( ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON ( (lv_statement_2_0= rulestatement ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2898:1: ( ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON ( (lv_statement_2_0= rulestatement ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2898:1: ( ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON ( (lv_statement_2_0= rulestatement ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2898:2: ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON ( (lv_statement_2_0= rulestatement ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2898:2: ( (lv_caseLabelList_0_0= rulecase_label_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2899:1: (lv_caseLabelList_0_0= rulecase_label_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2899:1: (lv_caseLabelList_0_0= rulecase_label_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2900:3: lv_caseLabelList_0_0= rulecase_label_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCase_limbAccess().getCaseLabelListCase_label_listParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecase_label_list_in_rulecase_limb6211);
            lv_caseLabelList_0_0=rulecase_label_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCase_limbRule());
              	        }
                     		set(
                     			current, 
                     			"caseLabelList",
                      		lv_caseLabelList_0_0, 
                      		"case_label_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulecase_limb6222); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_1, grammarAccess.getCase_limbAccess().getCOLONTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2920:1: ( (lv_statement_2_0= rulestatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2921:1: (lv_statement_2_0= rulestatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2921:1: (lv_statement_2_0= rulestatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2922:3: lv_statement_2_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulecase_limb6242);
            lv_statement_2_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCase_limbRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_2_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2946:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2947:2: (iv_rulecase_label_list= rulecase_label_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2948:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCase_label_listRule()); 
            }
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list6278);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecase_label_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list6288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2955:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (this_COMMA_1= RULE_COMMA ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2958:28: ( ( ( (lv_constants_0_0= ruleconstant ) ) (this_COMMA_1= RULE_COMMA ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2959:1: ( ( (lv_constants_0_0= ruleconstant ) ) (this_COMMA_1= RULE_COMMA ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2959:1: ( ( (lv_constants_0_0= ruleconstant ) ) (this_COMMA_1= RULE_COMMA ( (lv_constants_2_0= ruleconstant ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2959:2: ( (lv_constants_0_0= ruleconstant ) ) (this_COMMA_1= RULE_COMMA ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2959:2: ( (lv_constants_0_0= ruleconstant ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2960:1: (lv_constants_0_0= ruleconstant )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2960:1: (lv_constants_0_0= ruleconstant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2961:3: lv_constants_0_0= ruleconstant
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list6334);
            lv_constants_0_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCase_label_listRule());
              	        }
                     		add(
                     			current, 
                     			"constants",
                      		lv_constants_0_0, 
                      		"constant");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2977:2: (this_COMMA_1= RULE_COMMA ( (lv_constants_2_0= ruleconstant ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_COMMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2977:3: this_COMMA_1= RULE_COMMA ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulecase_label_list6346); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getCase_label_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2981:1: ( (lv_constants_2_0= ruleconstant ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2982:1: (lv_constants_2_0= ruleconstant )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2982:1: (lv_constants_2_0= ruleconstant )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2983:3: lv_constants_2_0= ruleconstant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list6366);
            	    lv_constants_2_0=ruleconstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constants",
            	              		lv_constants_2_0, 
            	              		"constant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRulewith_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3007:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3008:2: (iv_rulewith_statement= rulewith_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3009:2: iv_rulewith_statement= rulewith_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWith_statementRule()); 
            }
            pushFollow(FOLLOW_rulewith_statement_in_entryRulewith_statement6404);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewith_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulewith_statement6414); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewith_statement"


    // $ANTLR start "rulewith_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3016:1: rulewith_statement returns [EObject current=null] : (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (this_COMMA_2= RULE_COMMA ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) ;
    public final EObject rulewith_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_COMMA_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3019:28: ( (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (this_COMMA_2= RULE_COMMA ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3020:1: (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (this_COMMA_2= RULE_COMMA ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3020:1: (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (this_COMMA_2= RULE_COMMA ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3020:3: otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (this_COMMA_2= RULE_COMMA ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_rulewith_statement6451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3024:1: ( (lv_variables_1_0= rulevariable ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3025:1: (lv_variables_1_0= rulevariable )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3025:1: (lv_variables_1_0= rulevariable )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3026:3: lv_variables_1_0= rulevariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulevariable_in_rulewith_statement6472);
            lv_variables_1_0=rulevariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_1_0, 
                      		"variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3042:2: (this_COMMA_2= RULE_COMMA ( (lv_variables_3_0= rulevariable ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_COMMA) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3042:3: this_COMMA_2= RULE_COMMA ( (lv_variables_3_0= rulevariable ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulewith_statement6484); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getWith_statementAccess().getCOMMATerminalRuleCall_2_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3046:1: ( (lv_variables_3_0= rulevariable ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3047:1: (lv_variables_3_0= rulevariable )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3047:1: (lv_variables_3_0= rulevariable )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3048:3: lv_variables_3_0= rulevariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulevariable_in_rulewith_statement6504);
            	    lv_variables_3_0=rulevariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_3_0, 
            	              		"variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_rulewith_statement6518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3068:1: ( (lv_statement_5_0= rulestatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3069:1: (lv_statement_5_0= rulestatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3069:1: (lv_statement_5_0= rulestatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3070:3: lv_statement_5_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWith_statementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulewith_statement6539);
            lv_statement_5_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_5_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRuleexpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3094:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3095:2: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3096:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression6575);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression6585); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3103:1: ruleexpression returns [EObject current=null] : ( ( (lv_simpleExpressions_0_0= rulesimple_expression ) ) ( ( (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR ) ) ( (lv_simpleExpressions_2_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_relational_operators_1_0=null;
        EObject lv_simpleExpressions_0_0 = null;

        EObject lv_simpleExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3106:28: ( ( ( (lv_simpleExpressions_0_0= rulesimple_expression ) ) ( ( (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR ) ) ( (lv_simpleExpressions_2_0= rulesimple_expression ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3107:1: ( ( (lv_simpleExpressions_0_0= rulesimple_expression ) ) ( ( (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR ) ) ( (lv_simpleExpressions_2_0= rulesimple_expression ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3107:1: ( ( (lv_simpleExpressions_0_0= rulesimple_expression ) ) ( ( (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR ) ) ( (lv_simpleExpressions_2_0= rulesimple_expression ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3107:2: ( (lv_simpleExpressions_0_0= rulesimple_expression ) ) ( ( (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR ) ) ( (lv_simpleExpressions_2_0= rulesimple_expression ) ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3107:2: ( (lv_simpleExpressions_0_0= rulesimple_expression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3108:1: (lv_simpleExpressions_0_0= rulesimple_expression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3108:1: (lv_simpleExpressions_0_0= rulesimple_expression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3109:3: lv_simpleExpressions_0_0= rulesimple_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionsSimple_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression6631);
            lv_simpleExpressions_0_0=rulesimple_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"simpleExpressions",
                      		lv_simpleExpressions_0_0, 
                      		"simple_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3125:2: ( ( (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR ) ) ( (lv_simpleExpressions_2_0= rulesimple_expression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_RELATIONALOPERATOR) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3125:3: ( (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR ) ) ( (lv_simpleExpressions_2_0= rulesimple_expression ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3125:3: ( (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3126:1: (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3126:1: (lv_relational_operators_1_0= RULE_RELATIONALOPERATOR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3127:3: lv_relational_operators_1_0= RULE_RELATIONALOPERATOR
                    {
                    lv_relational_operators_1_0=(Token)match(input,RULE_RELATIONALOPERATOR,FOLLOW_RULE_RELATIONALOPERATOR_in_ruleexpression6649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_relational_operators_1_0, grammarAccess.getExpressionAccess().getRelational_operatorsRELATIONALOPERATORTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"relational_operators",
                              		lv_relational_operators_1_0, 
                              		"RELATIONALOPERATOR");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3143:2: ( (lv_simpleExpressions_2_0= rulesimple_expression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3144:1: (lv_simpleExpressions_2_0= rulesimple_expression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3144:1: (lv_simpleExpressions_2_0= rulesimple_expression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3145:3: lv_simpleExpressions_2_0= rulesimple_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionsSimple_expressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression6675);
                    lv_simpleExpressions_2_0=rulesimple_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"simpleExpressions",
                              		lv_simpleExpressions_2_0, 
                              		"simple_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3169:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3170:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3171:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            }
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression6713);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression6723); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3178:1: rulesimple_expression returns [EObject current=null] : ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_terms_2_0= ruleterm ) ) (this_ADDITIONOPERATOR_3= RULE_ADDITIONOPERATOR ( (lv_terms_4_0= ruleterm ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_ADDITIONOPERATOR_3=null;
        EObject lv_terms_2_0 = null;

        EObject lv_terms_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3181:28: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_terms_2_0= ruleterm ) ) (this_ADDITIONOPERATOR_3= RULE_ADDITIONOPERATOR ( (lv_terms_4_0= ruleterm ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3182:1: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_terms_2_0= ruleterm ) ) (this_ADDITIONOPERATOR_3= RULE_ADDITIONOPERATOR ( (lv_terms_4_0= ruleterm ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3182:1: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_terms_2_0= ruleterm ) ) (this_ADDITIONOPERATOR_3= RULE_ADDITIONOPERATOR ( (lv_terms_4_0= ruleterm ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3182:2: (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_terms_2_0= ruleterm ) ) (this_ADDITIONOPERATOR_3= RULE_ADDITIONOPERATOR ( (lv_terms_4_0= ruleterm ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3182:2: (otherlv_0= '+' | otherlv_1= '-' )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==71) ) {
                alt38=1;
            }
            else if ( (LA38_0==72) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3182:4: otherlv_0= '+'
                    {
                    otherlv_0=(Token)match(input,71,FOLLOW_71_in_rulesimple_expression6761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSimple_expressionAccess().getPlusSignKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3187:7: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_rulesimple_expression6779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSimple_expressionAccess().getHyphenMinusKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3191:3: ( (lv_terms_2_0= ruleterm ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3192:1: (lv_terms_2_0= ruleterm )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3192:1: (lv_terms_2_0= ruleterm )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3193:3: lv_terms_2_0= ruleterm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleterm_in_rulesimple_expression6802);
            lv_terms_2_0=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
              	        }
                     		add(
                     			current, 
                     			"terms",
                      		lv_terms_2_0, 
                      		"term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3209:2: (this_ADDITIONOPERATOR_3= RULE_ADDITIONOPERATOR ( (lv_terms_4_0= ruleterm ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ADDITIONOPERATOR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3209:3: this_ADDITIONOPERATOR_3= RULE_ADDITIONOPERATOR ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    this_ADDITIONOPERATOR_3=(Token)match(input,RULE_ADDITIONOPERATOR,FOLLOW_RULE_ADDITIONOPERATOR_in_rulesimple_expression6814); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ADDITIONOPERATOR_3, grammarAccess.getSimple_expressionAccess().getADDITIONOPERATORTerminalRuleCall_2_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3213:1: ( (lv_terms_4_0= ruleterm ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3214:1: (lv_terms_4_0= ruleterm )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3214:1: (lv_terms_4_0= ruleterm )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3215:3: lv_terms_4_0= ruleterm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression6834);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"terms",
            	              		lv_terms_4_0, 
            	              		"term");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3239:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3240:2: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3241:2: iv_ruleterm= ruleterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm6872);
            iv_ruleterm=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm6882); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3248:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) (this_MULTIPLICATIONOPERATOR_1= RULE_MULTIPLICATIONOPERATOR ( (lv_factors_2_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token this_MULTIPLICATIONOPERATOR_1=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3251:28: ( ( ( (lv_factors_0_0= rulefactor ) ) (this_MULTIPLICATIONOPERATOR_1= RULE_MULTIPLICATIONOPERATOR ( (lv_factors_2_0= rulefactor ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3252:1: ( ( (lv_factors_0_0= rulefactor ) ) (this_MULTIPLICATIONOPERATOR_1= RULE_MULTIPLICATIONOPERATOR ( (lv_factors_2_0= rulefactor ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3252:1: ( ( (lv_factors_0_0= rulefactor ) ) (this_MULTIPLICATIONOPERATOR_1= RULE_MULTIPLICATIONOPERATOR ( (lv_factors_2_0= rulefactor ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3252:2: ( (lv_factors_0_0= rulefactor ) ) (this_MULTIPLICATIONOPERATOR_1= RULE_MULTIPLICATIONOPERATOR ( (lv_factors_2_0= rulefactor ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3252:2: ( (lv_factors_0_0= rulefactor ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3253:1: (lv_factors_0_0= rulefactor )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3253:1: (lv_factors_0_0= rulefactor )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3254:3: lv_factors_0_0= rulefactor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulefactor_in_ruleterm6928);
            lv_factors_0_0=rulefactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTermRule());
              	        }
                     		add(
                     			current, 
                     			"factors",
                      		lv_factors_0_0, 
                      		"factor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3270:2: (this_MULTIPLICATIONOPERATOR_1= RULE_MULTIPLICATIONOPERATOR ( (lv_factors_2_0= rulefactor ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_MULTIPLICATIONOPERATOR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3270:3: this_MULTIPLICATIONOPERATOR_1= RULE_MULTIPLICATIONOPERATOR ( (lv_factors_2_0= rulefactor ) )
            	    {
            	    this_MULTIPLICATIONOPERATOR_1=(Token)match(input,RULE_MULTIPLICATIONOPERATOR,FOLLOW_RULE_MULTIPLICATIONOPERATOR_in_ruleterm6940); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MULTIPLICATIONOPERATOR_1, grammarAccess.getTermAccess().getMULTIPLICATIONOPERATORTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3274:1: ( (lv_factors_2_0= rulefactor ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3275:1: (lv_factors_2_0= rulefactor )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3275:1: (lv_factors_2_0= rulefactor )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3276:3: lv_factors_2_0= rulefactor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm6960);
            	    lv_factors_2_0=rulefactor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTermRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"factors",
            	              		lv_factors_2_0, 
            	              		"factor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3300:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3301:2: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3302:2: iv_rulefactor= rulefactor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor6998);
            iv_rulefactor=rulefactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefactor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor7008); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3309:1: rulefactor returns [EObject current=null] : ( ( ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) ) ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_string_3_0= RULE_STRING1 ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_nil_5_0= 'nil' ) ) | ( (lv_id_6_0= RULE_IDENTIFIER ) ) | (this_LEFT_PARENTHESIS_7= RULE_LEFT_PARENTHESIS ( (lv_expression_8_0= ruleexpression ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS ) | (otherlv_10= 'not' ( (lv_factor_11_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_3_0=null;
        Token lv_nil_5_0=null;
        Token lv_id_6_0=null;
        Token this_LEFT_PARENTHESIS_7=null;
        Token this_RIGHT_PARENTHESIS_9=null;
        Token otherlv_10=null;
        EObject lv_functionDesignator_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_number_2_0 = null;

        EObject lv_set_4_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_factor_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3312:28: ( ( ( ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) ) ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_string_3_0= RULE_STRING1 ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_nil_5_0= 'nil' ) ) | ( (lv_id_6_0= RULE_IDENTIFIER ) ) | (this_LEFT_PARENTHESIS_7= RULE_LEFT_PARENTHESIS ( (lv_expression_8_0= ruleexpression ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS ) | (otherlv_10= 'not' ( (lv_factor_11_0= rulefactor ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3313:1: ( ( ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) ) ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_string_3_0= RULE_STRING1 ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_nil_5_0= 'nil' ) ) | ( (lv_id_6_0= RULE_IDENTIFIER ) ) | (this_LEFT_PARENTHESIS_7= RULE_LEFT_PARENTHESIS ( (lv_expression_8_0= ruleexpression ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS ) | (otherlv_10= 'not' ( (lv_factor_11_0= rulefactor ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3313:1: ( ( ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) ) ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_string_3_0= RULE_STRING1 ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_nil_5_0= 'nil' ) ) | ( (lv_id_6_0= RULE_IDENTIFIER ) ) | (this_LEFT_PARENTHESIS_7= RULE_LEFT_PARENTHESIS ( (lv_expression_8_0= ruleexpression ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS ) | (otherlv_10= 'not' ( (lv_factor_11_0= rulefactor ) ) ) )
            int alt41=8;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3313:2: ( ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) ) ( (lv_variable_1_0= rulevariable ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3313:2: ( ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) ) ( (lv_variable_1_0= rulevariable ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3313:3: ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) ) ( (lv_variable_1_0= rulevariable ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3313:3: ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3313:4: ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3318:1: (lv_functionDesignator_0_0= ruleFunctionDesignator )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3319:3: lv_functionDesignator_0_0= ruleFunctionDesignator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFactorAccess().getFunctionDesignatorFunctionDesignatorParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunctionDesignator_in_rulefactor7065);
                    lv_functionDesignator_0_0=ruleFunctionDesignator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFactorRule());
                      	        }
                             		set(
                             			current, 
                             			"functionDesignator",
                              		lv_functionDesignator_0_0, 
                              		"FunctionDesignator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3335:2: ( (lv_variable_1_0= rulevariable ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3336:1: (lv_variable_1_0= rulevariable )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3336:1: (lv_variable_1_0= rulevariable )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3337:3: lv_variable_1_0= rulevariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_in_rulefactor7086);
                    lv_variable_1_0=rulevariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFactorRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_1_0, 
                              		"variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3354:6: ( (lv_number_2_0= rulenumber ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3354:6: ( (lv_number_2_0= rulenumber ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3355:1: (lv_number_2_0= rulenumber )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3355:1: (lv_number_2_0= rulenumber )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3356:3: lv_number_2_0= rulenumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulenumber_in_rulefactor7114);
                    lv_number_2_0=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFactorRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_2_0, 
                              		"number");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3373:6: ( (lv_string_3_0= RULE_STRING1 ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3373:6: ( (lv_string_3_0= RULE_STRING1 ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3374:1: (lv_string_3_0= RULE_STRING1 )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3374:1: (lv_string_3_0= RULE_STRING1 )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3375:3: lv_string_3_0= RULE_STRING1
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING1,FOLLOW_RULE_STRING1_in_rulefactor7137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_3_0, grammarAccess.getFactorAccess().getStringSTRING1TerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFactorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_3_0, 
                              		"STRING1");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3392:6: ( (lv_set_4_0= ruleSet ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3392:6: ( (lv_set_4_0= ruleSet ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3393:1: (lv_set_4_0= ruleSet )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3393:1: (lv_set_4_0= ruleSet )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3394:3: lv_set_4_0= ruleSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSet_in_rulefactor7169);
                    lv_set_4_0=ruleSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFactorRule());
                      	        }
                             		set(
                             			current, 
                             			"set",
                              		lv_set_4_0, 
                              		"Set");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3411:6: ( (lv_nil_5_0= 'nil' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3411:6: ( (lv_nil_5_0= 'nil' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3412:1: (lv_nil_5_0= 'nil' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3412:1: (lv_nil_5_0= 'nil' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3413:3: lv_nil_5_0= 'nil'
                    {
                    lv_nil_5_0=(Token)match(input,73,FOLLOW_73_in_rulefactor7193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nil_5_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFactorRule());
                      	        }
                             		setWithLastConsumed(current, "nil", lv_nil_5_0, "nil");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3427:6: ( (lv_id_6_0= RULE_IDENTIFIER ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3427:6: ( (lv_id_6_0= RULE_IDENTIFIER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3428:1: (lv_id_6_0= RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3428:1: (lv_id_6_0= RULE_IDENTIFIER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3429:3: lv_id_6_0= RULE_IDENTIFIER
                    {
                    lv_id_6_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefactor7229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_6_0, grammarAccess.getFactorAccess().getIdIDENTIFIERTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFactorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_6_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3446:6: (this_LEFT_PARENTHESIS_7= RULE_LEFT_PARENTHESIS ( (lv_expression_8_0= ruleexpression ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3446:6: (this_LEFT_PARENTHESIS_7= RULE_LEFT_PARENTHESIS ( (lv_expression_8_0= ruleexpression ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3446:7: this_LEFT_PARENTHESIS_7= RULE_LEFT_PARENTHESIS ( (lv_expression_8_0= ruleexpression ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS
                    {
                    this_LEFT_PARENTHESIS_7=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_rulefactor7252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PARENTHESIS_7, grammarAccess.getFactorAccess().getLEFT_PARENTHESISTerminalRuleCall_6_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3450:1: ( (lv_expression_8_0= ruleexpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3451:1: (lv_expression_8_0= ruleexpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3451:1: (lv_expression_8_0= ruleexpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3452:3: lv_expression_8_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefactor7272);
                    lv_expression_8_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFactorRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_8_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_PARENTHESIS_9=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_rulefactor7283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PARENTHESIS_9, grammarAccess.getFactorAccess().getRIGHT_PARENTHESISTerminalRuleCall_6_2()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3473:6: (otherlv_10= 'not' ( (lv_factor_11_0= rulefactor ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3473:6: (otherlv_10= 'not' ( (lv_factor_11_0= rulefactor ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3473:8: otherlv_10= 'not' ( (lv_factor_11_0= rulefactor ) )
                    {
                    otherlv_10=(Token)match(input,74,FOLLOW_74_in_rulefactor7302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getNotKeyword_7_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3477:1: ( (lv_factor_11_0= rulefactor ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3478:1: (lv_factor_11_0= rulefactor )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3478:1: (lv_factor_11_0= rulefactor )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3479:3: lv_factor_11_0= rulefactor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefactor_in_rulefactor7323);
                    lv_factor_11_0=rulefactor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFactorRule());
                      	        }
                             		set(
                             			current, 
                             			"factor",
                              		lv_factor_11_0, 
                              		"factor");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulevariable"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3503:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3504:2: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3505:2: iv_rulevariable= rulevariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable7360);
            iv_rulevariable=rulevariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable7370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3512:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_variable1_1_0= ruleVariable1 ) )? ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable1_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3515:28: ( ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_variable1_1_0= ruleVariable1 ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3516:1: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_variable1_1_0= ruleVariable1 ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3516:1: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_variable1_1_0= ruleVariable1 ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3516:2: ( (lv_name_0_0= RULE_IDENTIFIER ) ) ( (lv_variable1_1_0= ruleVariable1 ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3516:2: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3517:1: (lv_name_0_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3517:1: (lv_name_0_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3518:3: lv_name_0_0= RULE_IDENTIFIER
            {
            lv_name_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable7412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDENTIFIERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3534:2: ( (lv_variable1_1_0= ruleVariable1 ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DOT||LA42_0==RULE_LEFT_BRACKETS||LA42_0==RULE_CARET) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3535:1: (lv_variable1_1_0= ruleVariable1 )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3535:1: (lv_variable1_1_0= ruleVariable1 )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3536:3: lv_variable1_1_0= ruleVariable1
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableAccess().getVariable1Variable1ParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable1_in_rulevariable7438);
                    lv_variable1_1_0=ruleVariable1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableRule());
                      	        }
                             		set(
                             			current, 
                             			"variable1",
                              		lv_variable1_1_0, 
                              		"Variable1");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleVariable1"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3560:1: entryRuleVariable1 returns [EObject current=null] : iv_ruleVariable1= ruleVariable1 EOF ;
    public final EObject entryRuleVariable1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable1 = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3561:2: (iv_ruleVariable1= ruleVariable1 EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3562:2: iv_ruleVariable1= ruleVariable1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable1Rule()); 
            }
            pushFollow(FOLLOW_ruleVariable1_in_entryRuleVariable17475);
            iv_ruleVariable1=ruleVariable1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable17485); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable1"


    // $ANTLR start "ruleVariable1"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3569:1: ruleVariable1 returns [EObject current=null] : ( ( (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) ( (lv_variable1_3_0= ruleVariable1 ) ) ) | ( (this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) ) ) ( (lv_variable1_6_0= ruleVariable1 ) ) ) | (this_CARET_7= RULE_CARET ( (lv_variable1_8_0= ruleVariable1 ) ) ) ) ;
    public final EObject ruleVariable1() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKETS_0=null;
        Token this_RIGHT_BRACKETS_2=null;
        Token this_DOT_4=null;
        Token lv_name_5_0=null;
        Token this_CARET_7=null;
        EObject lv_expressionList_1_0 = null;

        EObject lv_variable1_3_0 = null;

        EObject lv_variable1_6_0 = null;

        EObject lv_variable1_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3572:28: ( ( ( (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) ( (lv_variable1_3_0= ruleVariable1 ) ) ) | ( (this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) ) ) ( (lv_variable1_6_0= ruleVariable1 ) ) ) | (this_CARET_7= RULE_CARET ( (lv_variable1_8_0= ruleVariable1 ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3573:1: ( ( (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) ( (lv_variable1_3_0= ruleVariable1 ) ) ) | ( (this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) ) ) ( (lv_variable1_6_0= ruleVariable1 ) ) ) | (this_CARET_7= RULE_CARET ( (lv_variable1_8_0= ruleVariable1 ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3573:1: ( ( (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) ( (lv_variable1_3_0= ruleVariable1 ) ) ) | ( (this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) ) ) ( (lv_variable1_6_0= ruleVariable1 ) ) ) | (this_CARET_7= RULE_CARET ( (lv_variable1_8_0= ruleVariable1 ) ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_LEFT_BRACKETS:
                {
                alt43=1;
                }
                break;
            case RULE_DOT:
                {
                alt43=2;
                }
                break;
            case RULE_CARET:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3573:2: ( (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) ( (lv_variable1_3_0= ruleVariable1 ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3573:2: ( (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) ( (lv_variable1_3_0= ruleVariable1 ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3573:3: (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) ( (lv_variable1_3_0= ruleVariable1 ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3573:3: (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3573:4: this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_expressionList_1_0= ruleExpressionList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS
                    {
                    this_LEFT_BRACKETS_0=(Token)match(input,RULE_LEFT_BRACKETS,FOLLOW_RULE_LEFT_BRACKETS_in_ruleVariable17523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_BRACKETS_0, grammarAccess.getVariable1Access().getLEFT_BRACKETSTerminalRuleCall_0_0_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3577:1: ( (lv_expressionList_1_0= ruleExpressionList ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3578:1: (lv_expressionList_1_0= ruleExpressionList )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3578:1: (lv_expressionList_1_0= ruleExpressionList )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3579:3: lv_expressionList_1_0= ruleExpressionList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable1Access().getExpressionListExpressionListParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionList_in_ruleVariable17543);
                    lv_expressionList_1_0=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable1Rule());
                      	        }
                             		set(
                             			current, 
                             			"expressionList",
                              		lv_expressionList_1_0, 
                              		"ExpressionList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_BRACKETS_2=(Token)match(input,RULE_RIGHT_BRACKETS,FOLLOW_RULE_RIGHT_BRACKETS_in_ruleVariable17554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_BRACKETS_2, grammarAccess.getVariable1Access().getRIGHT_BRACKETSTerminalRuleCall_0_0_2()); 
                          
                    }

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3599:2: ( (lv_variable1_3_0= ruleVariable1 ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3600:1: (lv_variable1_3_0= ruleVariable1 )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3600:1: (lv_variable1_3_0= ruleVariable1 )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3601:3: lv_variable1_3_0= ruleVariable1
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable1Access().getVariable1Variable1ParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable1_in_ruleVariable17575);
                    lv_variable1_3_0=ruleVariable1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable1Rule());
                      	        }
                             		set(
                             			current, 
                             			"variable1",
                              		lv_variable1_3_0, 
                              		"Variable1");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3618:6: ( (this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) ) ) ( (lv_variable1_6_0= ruleVariable1 ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3618:6: ( (this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) ) ) ( (lv_variable1_6_0= ruleVariable1 ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3618:7: (this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) ) ) ( (lv_variable1_6_0= ruleVariable1 ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3618:7: (this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3618:8: this_DOT_4= RULE_DOT ( (lv_name_5_0= RULE_IDENTIFIER ) )
                    {
                    this_DOT_4=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariable17595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_4, grammarAccess.getVariable1Access().getDOTTerminalRuleCall_1_0_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3622:1: ( (lv_name_5_0= RULE_IDENTIFIER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3623:1: (lv_name_5_0= RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3623:1: (lv_name_5_0= RULE_IDENTIFIER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3624:3: lv_name_5_0= RULE_IDENTIFIER
                    {
                    lv_name_5_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleVariable17611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getVariable1Access().getNameIDENTIFIERTerminalRuleCall_1_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariable1Rule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3640:3: ( (lv_variable1_6_0= ruleVariable1 ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3641:1: (lv_variable1_6_0= ruleVariable1 )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3641:1: (lv_variable1_6_0= ruleVariable1 )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3642:3: lv_variable1_6_0= ruleVariable1
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable1Access().getVariable1Variable1ParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable1_in_ruleVariable17638);
                    lv_variable1_6_0=ruleVariable1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable1Rule());
                      	        }
                             		set(
                             			current, 
                             			"variable1",
                              		lv_variable1_6_0, 
                              		"Variable1");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3659:6: (this_CARET_7= RULE_CARET ( (lv_variable1_8_0= ruleVariable1 ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3659:6: (this_CARET_7= RULE_CARET ( (lv_variable1_8_0= ruleVariable1 ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3659:7: this_CARET_7= RULE_CARET ( (lv_variable1_8_0= ruleVariable1 ) )
                    {
                    this_CARET_7=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleVariable17657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_7, grammarAccess.getVariable1Access().getCARETTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3663:1: ( (lv_variable1_8_0= ruleVariable1 ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3664:1: (lv_variable1_8_0= ruleVariable1 )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3664:1: (lv_variable1_8_0= ruleVariable1 )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3665:3: lv_variable1_8_0= ruleVariable1
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable1Access().getVariable1Variable1ParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable1_in_ruleVariable17677);
                    lv_variable1_8_0=ruleVariable1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable1Rule());
                      	        }
                             		set(
                             			current, 
                             			"variable1",
                              		lv_variable1_8_0, 
                              		"Variable1");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable1"


    // $ANTLR start "entryRuleSet"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3689:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3690:2: (iv_ruleSet= ruleSet EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3691:2: iv_ruleSet= ruleSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetRule()); 
            }
            pushFollow(FOLLOW_ruleSet_in_entryRuleSet7714);
            iv_ruleSet=ruleSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet7724); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3698:1: ruleSet returns [EObject current=null] : (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_elementList_1_0= ruleElementList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKETS_0=null;
        Token this_RIGHT_BRACKETS_2=null;
        EObject lv_elementList_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3701:28: ( (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_elementList_1_0= ruleElementList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3702:1: (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_elementList_1_0= ruleElementList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3702:1: (this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_elementList_1_0= ruleElementList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3702:2: this_LEFT_BRACKETS_0= RULE_LEFT_BRACKETS ( (lv_elementList_1_0= ruleElementList ) ) this_RIGHT_BRACKETS_2= RULE_RIGHT_BRACKETS
            {
            this_LEFT_BRACKETS_0=(Token)match(input,RULE_LEFT_BRACKETS,FOLLOW_RULE_LEFT_BRACKETS_in_ruleSet7760); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACKETS_0, grammarAccess.getSetAccess().getLEFT_BRACKETSTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3706:1: ( (lv_elementList_1_0= ruleElementList ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3707:1: (lv_elementList_1_0= ruleElementList )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3707:1: (lv_elementList_1_0= ruleElementList )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3708:3: lv_elementList_1_0= ruleElementList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetAccess().getElementListElementListParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementList_in_ruleSet7780);
            lv_elementList_1_0=ruleElementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetRule());
              	        }
                     		set(
                     			current, 
                     			"elementList",
                      		lv_elementList_1_0, 
                      		"ElementList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RIGHT_BRACKETS_2=(Token)match(input,RULE_RIGHT_BRACKETS,FOLLOW_RULE_RIGHT_BRACKETS_in_ruleSet7791); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACKETS_2, grammarAccess.getSetAccess().getRIGHT_BRACKETSTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleElementList"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3736:1: entryRuleElementList returns [EObject current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final EObject entryRuleElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementList = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3737:2: (iv_ruleElementList= ruleElementList EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3738:2: iv_ruleElementList= ruleElementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementListRule()); 
            }
            pushFollow(FOLLOW_ruleElementList_in_entryRuleElementList7826);
            iv_ruleElementList=ruleElementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementList7836); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementList"


    // $ANTLR start "ruleElementList"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3745:1: ruleElementList returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleexpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) ) )* )? ) ;
    public final EObject ruleElementList() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3748:28: ( ( () ( ( (lv_expressions_1_0= ruleexpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) ) )* )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3749:1: ( () ( ( (lv_expressions_1_0= ruleexpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) ) )* )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3749:1: ( () ( ( (lv_expressions_1_0= ruleexpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) ) )* )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3749:2: () ( ( (lv_expressions_1_0= ruleexpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) ) )* )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3749:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3750:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementListAccess().getElementListAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3755:2: ( ( (lv_expressions_1_0= ruleexpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_IDENTIFIER && LA45_0<=RULE_LEFT_PARENTHESIS)||LA45_0==RULE_LEFT_BRACKETS||LA45_0==RULE_STRING1||(LA45_0>=RULE_INTEGER_NUMBER && LA45_0<=RULE_REAL_NUMBER)||(LA45_0>=71 && LA45_0<=74)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3755:3: ( (lv_expressions_1_0= ruleexpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3755:3: ( (lv_expressions_1_0= ruleexpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3756:1: (lv_expressions_1_0= ruleexpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3756:1: (lv_expressions_1_0= ruleexpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3757:3: lv_expressions_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementListAccess().getExpressionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleElementList7892);
                    lv_expressions_1_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementListRule());
                      	        }
                             		add(
                             			current, 
                             			"expressions",
                              		lv_expressions_1_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3773:2: (this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_COMMA) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3773:3: this_COMMA_2= RULE_COMMA ( (lv_expressions_3_0= ruleexpression ) )
                    	    {
                    	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleElementList7904); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_COMMA_2, grammarAccess.getElementListAccess().getCOMMATerminalRuleCall_1_1_0()); 
                    	          
                    	    }
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3777:1: ( (lv_expressions_3_0= ruleexpression ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3778:1: (lv_expressions_3_0= ruleexpression )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3778:1: (lv_expressions_3_0= ruleexpression )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3779:3: lv_expressions_3_0= ruleexpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getElementListAccess().getExpressionsExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleexpression_in_ruleElementList7924);
                    	    lv_expressions_3_0=ruleexpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getElementListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressions",
                    	              		lv_expressions_3_0, 
                    	              		"expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementList"


    // $ANTLR start "entryRuleFunctionDesignator"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3803:1: entryRuleFunctionDesignator returns [EObject current=null] : iv_ruleFunctionDesignator= ruleFunctionDesignator EOF ;
    public final EObject entryRuleFunctionDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDesignator = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3804:2: (iv_ruleFunctionDesignator= ruleFunctionDesignator EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3805:2: iv_ruleFunctionDesignator= ruleFunctionDesignator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDesignatorRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDesignator_in_entryRuleFunctionDesignator7964);
            iv_ruleFunctionDesignator=ruleFunctionDesignator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDesignator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDesignator7974); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDesignator"


    // $ANTLR start "ruleFunctionDesignator"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3812:1: ruleFunctionDesignator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= 'actualParameterList' )? ) ;
    public final EObject ruleFunctionDesignator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3815:28: ( ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= 'actualParameterList' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3816:1: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= 'actualParameterList' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3816:1: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= 'actualParameterList' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3816:2: ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= 'actualParameterList' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3816:2: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3817:1: (lv_name_0_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3817:1: (lv_name_0_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3818:3: lv_name_0_0= RULE_IDENTIFIER
            {
            lv_name_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleFunctionDesignator8016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFunctionDesignatorAccess().getNameIDENTIFIERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionDesignatorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3834:2: (otherlv_1= 'actualParameterList' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==75) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3834:4: otherlv_1= 'actualParameterList'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleFunctionDesignator8034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFunctionDesignatorAccess().getActualParameterListKeyword_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDesignator"


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3848:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3849:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3850:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype8074);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype8084); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3857:1: ruletype returns [EObject current=null] : ( ( (lv_simpleType_0_0= rulesimple_type ) ) | ( (lv_structuredType_1_0= rulestructured_type ) ) | ( (lv_pointerType_2_0= rulepointer_type ) ) | ( (lv_name_3_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_simpleType_0_0 = null;

        EObject lv_structuredType_1_0 = null;

        EObject lv_pointerType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3860:28: ( ( ( (lv_simpleType_0_0= rulesimple_type ) ) | ( (lv_structuredType_1_0= rulestructured_type ) ) | ( (lv_pointerType_2_0= rulepointer_type ) ) | ( (lv_name_3_0= RULE_IDENTIFIER ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3861:1: ( ( (lv_simpleType_0_0= rulesimple_type ) ) | ( (lv_structuredType_1_0= rulestructured_type ) ) | ( (lv_pointerType_2_0= rulepointer_type ) ) | ( (lv_name_3_0= RULE_IDENTIFIER ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3861:1: ( ( (lv_simpleType_0_0= rulesimple_type ) ) | ( (lv_structuredType_1_0= rulestructured_type ) ) | ( (lv_pointerType_2_0= rulepointer_type ) ) | ( (lv_name_3_0= RULE_IDENTIFIER ) ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_LEFT_PARENTHESIS:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt47=1;
                }
                break;
            case 55:
            case 80:
            case 81:
            case 82:
            case 83:
                {
                alt47=2;
                }
                break;
            case RULE_CARET:
                {
                alt47=3;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3861:2: ( (lv_simpleType_0_0= rulesimple_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3861:2: ( (lv_simpleType_0_0= rulesimple_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3862:1: (lv_simpleType_0_0= rulesimple_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3862:1: (lv_simpleType_0_0= rulesimple_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3863:3: lv_simpleType_0_0= rulesimple_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeSimple_typeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesimple_type_in_ruletype8130);
                    lv_simpleType_0_0=rulesimple_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"simpleType",
                              		lv_simpleType_0_0, 
                              		"simple_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3880:6: ( (lv_structuredType_1_0= rulestructured_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3880:6: ( (lv_structuredType_1_0= rulestructured_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3881:1: (lv_structuredType_1_0= rulestructured_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3881:1: (lv_structuredType_1_0= rulestructured_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3882:3: lv_structuredType_1_0= rulestructured_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getStructuredTypeStructured_typeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestructured_type_in_ruletype8157);
                    lv_structuredType_1_0=rulestructured_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"structuredType",
                              		lv_structuredType_1_0, 
                              		"structured_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3899:6: ( (lv_pointerType_2_0= rulepointer_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3899:6: ( (lv_pointerType_2_0= rulepointer_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3900:1: (lv_pointerType_2_0= rulepointer_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3900:1: (lv_pointerType_2_0= rulepointer_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3901:3: lv_pointerType_2_0= rulepointer_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getPointerTypePointer_typeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepointer_type_in_ruletype8184);
                    lv_pointerType_2_0=rulepointer_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"pointerType",
                              		lv_pointerType_2_0, 
                              		"pointer_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3918:6: ( (lv_name_3_0= RULE_IDENTIFIER ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3918:6: ( (lv_name_3_0= RULE_IDENTIFIER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3919:1: (lv_name_3_0= RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3919:1: (lv_name_3_0= RULE_IDENTIFIER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3920:3: lv_name_3_0= RULE_IDENTIFIER
                    {
                    lv_name_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype8207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getTypeAccess().getNameIDENTIFIERTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3944:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3945:2: (iv_rulesimple_type= rulesimple_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3946:2: iv_rulesimple_type= rulesimple_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_typeRule()); 
            }
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type8248);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type8258); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3953:1: rulesimple_type returns [EObject current=null] : ( ( ( ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) ) ) ( (lv_subrangeType_1_0= rulesubrange_type ) ) ) | ( (lv_enumeratedType_2_0= ruleenumerated_type ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_primitiveType_0_1=null;
        Token lv_primitiveType_0_2=null;
        Token lv_primitiveType_0_3=null;
        Token lv_primitiveType_0_4=null;
        EObject lv_subrangeType_1_0 = null;

        EObject lv_enumeratedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3956:28: ( ( ( ( ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) ) ) ( (lv_subrangeType_1_0= rulesubrange_type ) ) ) | ( (lv_enumeratedType_2_0= ruleenumerated_type ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:1: ( ( ( ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) ) ) ( (lv_subrangeType_1_0= rulesubrange_type ) ) ) | ( (lv_enumeratedType_2_0= ruleenumerated_type ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:1: ( ( ( ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) ) ) ( (lv_subrangeType_1_0= rulesubrange_type ) ) ) | ( (lv_enumeratedType_2_0= ruleenumerated_type ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==76) && (synpred3_InternalPascal())) {
                alt49=1;
            }
            else if ( (LA49_0==77) && (synpred3_InternalPascal())) {
                alt49=1;
            }
            else if ( (LA49_0==78) && (synpred3_InternalPascal())) {
                alt49=1;
            }
            else if ( (LA49_0==79) && (synpred3_InternalPascal())) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_LEFT_PARENTHESIS) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:2: ( ( ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) ) ) ( (lv_subrangeType_1_0= rulesubrange_type ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:2: ( ( ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) ) ) ( (lv_subrangeType_1_0= rulesubrange_type ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:3: ( ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) ) ) ( (lv_subrangeType_1_0= rulesubrange_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:3: ( ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:4: ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )=> ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3975:5: ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3976:1: ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3976:1: ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3977:1: (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3977:1: (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'char' | lv_primitiveType_0_3= 'integer' | lv_primitiveType_0_4= 'real' )
                    int alt48=4;
                    switch ( input.LA(1) ) {
                    case 76:
                        {
                        alt48=1;
                        }
                        break;
                    case 77:
                        {
                        alt48=2;
                        }
                        break;
                    case 78:
                        {
                        alt48=3;
                        }
                        break;
                    case 79:
                        {
                        alt48=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }

                    switch (alt48) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3978:3: lv_primitiveType_0_1= 'boolean'
                            {
                            lv_primitiveType_0_1=(Token)match(input,76,FOLLOW_76_in_rulesimple_type8369); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_1, grammarAccess.getSimple_typeAccess().getPrimitiveTypeBooleanKeyword_0_0_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimple_typeRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3990:8: lv_primitiveType_0_2= 'char'
                            {
                            lv_primitiveType_0_2=(Token)match(input,77,FOLLOW_77_in_rulesimple_type8398); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_2, grammarAccess.getSimple_typeAccess().getPrimitiveTypeCharKeyword_0_0_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimple_typeRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4002:8: lv_primitiveType_0_3= 'integer'
                            {
                            lv_primitiveType_0_3=(Token)match(input,78,FOLLOW_78_in_rulesimple_type8427); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_3, grammarAccess.getSimple_typeAccess().getPrimitiveTypeIntegerKeyword_0_0_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimple_typeRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4014:8: lv_primitiveType_0_4= 'real'
                            {
                            lv_primitiveType_0_4=(Token)match(input,79,FOLLOW_79_in_rulesimple_type8456); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_4, grammarAccess.getSimple_typeAccess().getPrimitiveTypeRealKeyword_0_0_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimple_typeRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_4, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4029:3: ( (lv_subrangeType_1_0= rulesubrange_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4030:1: (lv_subrangeType_1_0= rulesubrange_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4030:1: (lv_subrangeType_1_0= rulesubrange_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4031:3: lv_subrangeType_1_0= rulesubrange_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeTypeSubrange_typeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesubrange_type_in_rulesimple_type8494);
                    lv_subrangeType_1_0=rulesubrange_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"subrangeType",
                              		lv_subrangeType_1_0, 
                              		"subrange_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4048:6: ( (lv_enumeratedType_2_0= ruleenumerated_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4048:6: ( (lv_enumeratedType_2_0= ruleenumerated_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4049:1: (lv_enumeratedType_2_0= ruleenumerated_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4049:1: (lv_enumeratedType_2_0= ruleenumerated_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4050:3: lv_enumeratedType_2_0= ruleenumerated_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedTypeEnumerated_typeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleenumerated_type_in_rulesimple_type8522);
                    lv_enumeratedType_2_0=ruleenumerated_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"enumeratedType",
                              		lv_enumeratedType_2_0, 
                              		"enumerated_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRuleenumerated_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4074:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4075:2: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4076:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            }
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type8558);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenumerated_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type8568); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4083:1: ruleenumerated_type returns [EObject current=null] : (this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_PARENTHESIS_0=null;
        Token this_RIGHT_PARENTHESIS_2=null;
        EObject lv_identifierList_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4086:28: ( (this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4087:1: (this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4087:1: (this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4087:2: this_LEFT_PARENTHESIS_0= RULE_LEFT_PARENTHESIS ( (lv_identifierList_1_0= ruleidentifier_list ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS
            {
            this_LEFT_PARENTHESIS_0=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleenumerated_type8604); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_0, grammarAccess.getEnumerated_typeAccess().getLEFT_PARENTHESISTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4091:1: ( (lv_identifierList_1_0= ruleidentifier_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4092:1: (lv_identifierList_1_0= ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4092:1: (lv_identifierList_1_0= ruleidentifier_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4093:3: lv_identifierList_1_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifierListIdentifier_listParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleenumerated_type8624);
            lv_identifierList_1_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
              	        }
                     		set(
                     			current, 
                     			"identifierList",
                      		lv_identifierList_1_0, 
                      		"identifier_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RIGHT_PARENTHESIS_2=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleenumerated_type8635); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_2, grammarAccess.getEnumerated_typeAccess().getRIGHT_PARENTHESISTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulesubrange_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4121:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4122:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4123:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            }
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type8670);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesubrange_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type8680); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4130:1: rulesubrange_type returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_constant2_2_0= ruleconstant ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token this_DIAERESIS_1=null;
        EObject lv_constant_0_0 = null;

        EObject lv_constant2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4133:28: ( ( ( (lv_constant_0_0= ruleconstant ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_constant2_2_0= ruleconstant ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4134:1: ( ( (lv_constant_0_0= ruleconstant ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_constant2_2_0= ruleconstant ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4134:1: ( ( (lv_constant_0_0= ruleconstant ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_constant2_2_0= ruleconstant ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4134:2: ( (lv_constant_0_0= ruleconstant ) ) this_DIAERESIS_1= RULE_DIAERESIS ( (lv_constant2_2_0= ruleconstant ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4134:2: ( (lv_constant_0_0= ruleconstant ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4135:1: (lv_constant_0_0= ruleconstant )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4135:1: (lv_constant_0_0= ruleconstant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4136:3: lv_constant_0_0= ruleconstant
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantConstantParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type8726);
            lv_constant_0_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
              	        }
                     		set(
                     			current, 
                     			"constant",
                      		lv_constant_0_0, 
                      		"constant");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_DIAERESIS_1=(Token)match(input,RULE_DIAERESIS,FOLLOW_RULE_DIAERESIS_in_rulesubrange_type8737); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DIAERESIS_1, grammarAccess.getSubrange_typeAccess().getDIAERESISTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4156:1: ( (lv_constant2_2_0= ruleconstant ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4157:1: (lv_constant2_2_0= ruleconstant )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4157:1: (lv_constant2_2_0= ruleconstant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4158:3: lv_constant2_2_0= ruleconstant
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstant2ConstantParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type8757);
            lv_constant2_2_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
              	        }
                     		set(
                     			current, 
                     			"constant2",
                      		lv_constant2_2_0, 
                      		"constant");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRulestructured_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4182:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4183:2: (iv_rulestructured_type= rulestructured_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4184:2: iv_rulestructured_type= rulestructured_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructured_typeRule()); 
            }
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type8793);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructured_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type8803); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4191:1: rulestructured_type returns [EObject current=null] : ( (otherlv_0= 'packed' )? ( (lv_unpackedStructuredType_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_unpackedStructuredType_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4194:28: ( ( (otherlv_0= 'packed' )? ( (lv_unpackedStructuredType_1_0= ruleunpacked_structured_type ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4195:1: ( (otherlv_0= 'packed' )? ( (lv_unpackedStructuredType_1_0= ruleunpacked_structured_type ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4195:1: ( (otherlv_0= 'packed' )? ( (lv_unpackedStructuredType_1_0= ruleunpacked_structured_type ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4195:2: (otherlv_0= 'packed' )? ( (lv_unpackedStructuredType_1_0= ruleunpacked_structured_type ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4195:2: (otherlv_0= 'packed' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==80) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4195:4: otherlv_0= 'packed'
                    {
                    otherlv_0=(Token)match(input,80,FOLLOW_80_in_rulestructured_type8841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getStructured_typeAccess().getPackedKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4199:3: ( (lv_unpackedStructuredType_1_0= ruleunpacked_structured_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4200:1: (lv_unpackedStructuredType_1_0= ruleunpacked_structured_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4200:1: (lv_unpackedStructuredType_1_0= ruleunpacked_structured_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4201:3: lv_unpackedStructuredType_1_0= ruleunpacked_structured_type
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructured_typeAccess().getUnpackedStructuredTypeUnpacked_structured_typeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rulestructured_type8864);
            lv_unpackedStructuredType_1_0=ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructured_typeRule());
              	        }
                     		set(
                     			current, 
                     			"unpackedStructuredType",
                      		lv_unpackedStructuredType_1_0, 
                      		"unpacked_structured_type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4225:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4226:2: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4227:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            }
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type8900);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunpacked_structured_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type8910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4234:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_arrayType_0_0= rulearray_type ) ) | ( (lv_recordType_1_0= rulerecord_type ) ) | ( (lv_setType_2_0= ruleset_type ) ) | ( (lv_fileType_3_0= rulefile_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_arrayType_0_0 = null;

        EObject lv_recordType_1_0 = null;

        EObject lv_setType_2_0 = null;

        EObject lv_fileType_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4237:28: ( ( ( (lv_arrayType_0_0= rulearray_type ) ) | ( (lv_recordType_1_0= rulerecord_type ) ) | ( (lv_setType_2_0= ruleset_type ) ) | ( (lv_fileType_3_0= rulefile_type ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4238:1: ( ( (lv_arrayType_0_0= rulearray_type ) ) | ( (lv_recordType_1_0= rulerecord_type ) ) | ( (lv_setType_2_0= ruleset_type ) ) | ( (lv_fileType_3_0= rulefile_type ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4238:1: ( ( (lv_arrayType_0_0= rulearray_type ) ) | ( (lv_recordType_1_0= rulerecord_type ) ) | ( (lv_setType_2_0= ruleset_type ) ) | ( (lv_fileType_3_0= rulefile_type ) ) )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt51=1;
                }
                break;
            case 81:
                {
                alt51=2;
                }
                break;
            case 82:
                {
                alt51=3;
                }
                break;
            case 83:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4238:2: ( (lv_arrayType_0_0= rulearray_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4238:2: ( (lv_arrayType_0_0= rulearray_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4239:1: (lv_arrayType_0_0= rulearray_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4239:1: (lv_arrayType_0_0= rulearray_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4240:3: lv_arrayType_0_0= rulearray_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArrayTypeArray_typeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulearray_type_in_ruleunpacked_structured_type8956);
                    lv_arrayType_0_0=rulearray_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"arrayType",
                              		lv_arrayType_0_0, 
                              		"array_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4257:6: ( (lv_recordType_1_0= rulerecord_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4257:6: ( (lv_recordType_1_0= rulerecord_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4258:1: (lv_recordType_1_0= rulerecord_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4258:1: (lv_recordType_1_0= rulerecord_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4259:3: lv_recordType_1_0= rulerecord_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecordTypeRecord_typeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulerecord_type_in_ruleunpacked_structured_type8983);
                    lv_recordType_1_0=rulerecord_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"recordType",
                              		lv_recordType_1_0, 
                              		"record_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4276:6: ( (lv_setType_2_0= ruleset_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4276:6: ( (lv_setType_2_0= ruleset_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4277:1: (lv_setType_2_0= ruleset_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4277:1: (lv_setType_2_0= ruleset_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4278:3: lv_setType_2_0= ruleset_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSetTypeSet_typeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleset_type_in_ruleunpacked_structured_type9010);
                    lv_setType_2_0=ruleset_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"setType",
                              		lv_setType_2_0, 
                              		"set_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4295:6: ( (lv_fileType_3_0= rulefile_type ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4295:6: ( (lv_fileType_3_0= rulefile_type ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4296:1: (lv_fileType_3_0= rulefile_type )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4296:1: (lv_fileType_3_0= rulefile_type )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4297:3: lv_fileType_3_0= rulefile_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFileTypeFile_typeParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefile_type_in_ruleunpacked_structured_type9037);
                    lv_fileType_3_0=rulefile_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"fileType",
                              		lv_fileType_3_0, 
                              		"file_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4321:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4322:2: (iv_rulearray_type= rulearray_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4323:2: iv_rulearray_type= rulearray_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArray_typeRule()); 
            }
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type9073);
            iv_rulearray_type=rulearray_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearray_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type9083); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4330:1: rulearray_type returns [EObject current=null] : (otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_simpleTypes_2_0= rulesimple_type ) ) (this_COMMA_3= RULE_COMMA ( (lv_simpleTypes_4_0= rulesimple_type ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKETS_1=null;
        Token this_COMMA_3=null;
        Token this_RIGHT_BRACKETS_5=null;
        Token otherlv_6=null;
        EObject lv_simpleTypes_2_0 = null;

        EObject lv_simpleTypes_4_0 = null;

        EObject lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4333:28: ( (otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_simpleTypes_2_0= rulesimple_type ) ) (this_COMMA_3= RULE_COMMA ( (lv_simpleTypes_4_0= rulesimple_type ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4334:1: (otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_simpleTypes_2_0= rulesimple_type ) ) (this_COMMA_3= RULE_COMMA ( (lv_simpleTypes_4_0= rulesimple_type ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4334:1: (otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_simpleTypes_2_0= rulesimple_type ) ) (this_COMMA_3= RULE_COMMA ( (lv_simpleTypes_4_0= rulesimple_type ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4334:3: otherlv_0= 'array' this_LEFT_BRACKETS_1= RULE_LEFT_BRACKETS ( (lv_simpleTypes_2_0= rulesimple_type ) ) (this_COMMA_3= RULE_COMMA ( (lv_simpleTypes_4_0= rulesimple_type ) ) )* this_RIGHT_BRACKETS_5= RULE_RIGHT_BRACKETS otherlv_6= 'of' ( (lv_type_7_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_rulearray_type9120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
                  
            }
            this_LEFT_BRACKETS_1=(Token)match(input,RULE_LEFT_BRACKETS,FOLLOW_RULE_LEFT_BRACKETS_in_rulearray_type9131); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACKETS_1, grammarAccess.getArray_typeAccess().getLEFT_BRACKETSTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4342:1: ( (lv_simpleTypes_2_0= rulesimple_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4343:1: (lv_simpleTypes_2_0= rulesimple_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4343:1: (lv_simpleTypes_2_0= rulesimple_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4344:3: lv_simpleTypes_2_0= rulesimple_type
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArray_typeAccess().getSimpleTypesSimple_typeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesimple_type_in_rulearray_type9151);
            lv_simpleTypes_2_0=rulesimple_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
              	        }
                     		add(
                     			current, 
                     			"simpleTypes",
                      		lv_simpleTypes_2_0, 
                      		"simple_type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4360:2: (this_COMMA_3= RULE_COMMA ( (lv_simpleTypes_4_0= rulesimple_type ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4360:3: this_COMMA_3= RULE_COMMA ( (lv_simpleTypes_4_0= rulesimple_type ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulearray_type9163); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getArray_typeAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4364:1: ( (lv_simpleTypes_4_0= rulesimple_type ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4365:1: (lv_simpleTypes_4_0= rulesimple_type )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4365:1: (lv_simpleTypes_4_0= rulesimple_type )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4366:3: lv_simpleTypes_4_0= rulesimple_type
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArray_typeAccess().getSimpleTypesSimple_typeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulesimple_type_in_rulearray_type9183);
            	    lv_simpleTypes_4_0=rulesimple_type();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"simpleTypes",
            	              		lv_simpleTypes_4_0, 
            	              		"simple_type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            this_RIGHT_BRACKETS_5=(Token)match(input,RULE_RIGHT_BRACKETS,FOLLOW_RULE_RIGHT_BRACKETS_in_rulearray_type9196); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACKETS_5, grammarAccess.getArray_typeAccess().getRIGHT_BRACKETSTerminalRuleCall_4()); 
                  
            }
            otherlv_6=(Token)match(input,54,FOLLOW_54_in_rulearray_type9207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4390:1: ( (lv_type_7_0= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4391:1: (lv_type_7_0= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4391:1: (lv_type_7_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4392:3: lv_type_7_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_rulearray_type9228);
            lv_type_7_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_7_0, 
                      		"type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRulerecord_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4416:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4417:2: (iv_rulerecord_type= rulerecord_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4418:2: iv_rulerecord_type= rulerecord_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecord_typeRule()); 
            }
            pushFollow(FOLLOW_rulerecord_type_in_entryRulerecord_type9264);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecord_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_type9274); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4425:1: rulerecord_type returns [EObject current=null] : (otherlv_0= 'record' ( (lv_fieldlist_1_0= rulefield_list ) ) otherlv_2= 'end' ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fieldlist_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4428:28: ( (otherlv_0= 'record' ( (lv_fieldlist_1_0= rulefield_list ) ) otherlv_2= 'end' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4429:1: (otherlv_0= 'record' ( (lv_fieldlist_1_0= rulefield_list ) ) otherlv_2= 'end' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4429:1: (otherlv_0= 'record' ( (lv_fieldlist_1_0= rulefield_list ) ) otherlv_2= 'end' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4429:3: otherlv_0= 'record' ( (lv_fieldlist_1_0= rulefield_list ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_rulerecord_type9311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecord_typeAccess().getRecordKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4433:1: ( (lv_fieldlist_1_0= rulefield_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4434:1: (lv_fieldlist_1_0= rulefield_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4434:1: (lv_fieldlist_1_0= rulefield_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4435:3: lv_fieldlist_1_0= rulefield_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecord_typeAccess().getFieldlistField_listParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulefield_list_in_rulerecord_type9332);
            lv_fieldlist_1_0=rulefield_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecord_typeRule());
              	        }
                     		set(
                     			current, 
                     			"fieldlist",
                      		lv_fieldlist_1_0, 
                      		"field_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_52_in_rulerecord_type9344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRecord_typeAccess().getEndKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRuleset_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4463:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4464:2: (iv_ruleset_type= ruleset_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4465:2: iv_ruleset_type= ruleset_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSet_typeRule()); 
            }
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type9380);
            iv_ruleset_type=ruleset_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleset_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type9390); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4472:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4475:28: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4476:1: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4476:1: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4476:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleset_type9427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleset_type9439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4484:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4485:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4485:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4486:3: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_ruleset_type9460);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSet_typeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulefile_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4510:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4511:2: (iv_rulefile_type= rulefile_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4512:2: iv_rulefile_type= rulefile_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFile_typeRule()); 
            }
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type9496);
            iv_rulefile_type=rulefile_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefile_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type9506); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefile_type"


    // $ANTLR start "rulefile_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4519:1: rulefile_type returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4522:28: ( (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4523:1: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4523:1: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4523:3: otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_rulefile_type9543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,54,FOLLOW_54_in_rulefile_type9555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4531:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4532:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4532:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4533:3: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_rulefile_type9576);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFile_typeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulepointer_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4557:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4558:2: (iv_rulepointer_type= rulepointer_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4559:2: iv_rulepointer_type= rulepointer_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointer_typeRule()); 
            }
            pushFollow(FOLLOW_rulepointer_type_in_entryRulepointer_type9612);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepointer_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepointer_type9622); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4566:1: rulepointer_type returns [EObject current=null] : (this_CARET_0= RULE_CARET ( (lv_name_1_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4569:28: ( (this_CARET_0= RULE_CARET ( (lv_name_1_0= RULE_IDENTIFIER ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4570:1: (this_CARET_0= RULE_CARET ( (lv_name_1_0= RULE_IDENTIFIER ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4570:1: (this_CARET_0= RULE_CARET ( (lv_name_1_0= RULE_IDENTIFIER ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4570:2: this_CARET_0= RULE_CARET ( (lv_name_1_0= RULE_IDENTIFIER ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulepointer_type9658); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CARET_0, grammarAccess.getPointer_typeAccess().getCARETTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4574:1: ( (lv_name_1_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4575:1: (lv_name_1_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4575:1: (lv_name_1_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4576:3: lv_name_1_0= RULE_IDENTIFIER
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepointer_type9674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPointer_typeAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPointer_typeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulefield_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4600:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4601:2: (iv_rulefield_list= rulefield_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4602:2: iv_rulefield_list= rulefield_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_listRule()); 
            }
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list9715);
            iv_rulefield_list=rulefield_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list9725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4609:1: rulefield_list returns [EObject current=null] : ( () ( ( ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? ) | ( (lv_variantPart_4_0= rulevariant_part ) ) ) (this_SEMICOLON_5= RULE_SEMICOLON )? )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_2=null;
        Token this_SEMICOLON_5=null;
        EObject lv_fixedPart_1_0 = null;

        EObject lv_variantPart_3_0 = null;

        EObject lv_variantPart_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4612:28: ( ( () ( ( ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? ) | ( (lv_variantPart_4_0= rulevariant_part ) ) ) (this_SEMICOLON_5= RULE_SEMICOLON )? )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4613:1: ( () ( ( ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? ) | ( (lv_variantPart_4_0= rulevariant_part ) ) ) (this_SEMICOLON_5= RULE_SEMICOLON )? )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4613:1: ( () ( ( ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? ) | ( (lv_variantPart_4_0= rulevariant_part ) ) ) (this_SEMICOLON_5= RULE_SEMICOLON )? )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4613:2: () ( ( ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? ) | ( (lv_variantPart_4_0= rulevariant_part ) ) ) (this_SEMICOLON_5= RULE_SEMICOLON )? )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4613:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4614:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getField_listAccess().getField_listAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4619:2: ( ( ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? ) | ( (lv_variantPart_4_0= rulevariant_part ) ) ) (this_SEMICOLON_5= RULE_SEMICOLON )? )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_IDENTIFIER||LA56_0==69) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4619:3: ( ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? ) | ( (lv_variantPart_4_0= rulevariant_part ) ) ) (this_SEMICOLON_5= RULE_SEMICOLON )?
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4619:3: ( ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? ) | ( (lv_variantPart_4_0= rulevariant_part ) ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_IDENTIFIER) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==69) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4619:4: ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4619:4: ( ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )? )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4619:5: ( (lv_fixedPart_1_0= rulefixed_part ) ) (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )?
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4619:5: ( (lv_fixedPart_1_0= rulefixed_part ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4620:1: (lv_fixedPart_1_0= rulefixed_part )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4620:1: (lv_fixedPart_1_0= rulefixed_part )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4621:3: lv_fixedPart_1_0= rulefixed_part
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_listAccess().getFixedPartFixed_partParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulefixed_part_in_rulefield_list9783);
                            lv_fixedPart_1_0=rulefixed_part();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_listRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"fixedPart",
                                      		lv_fixedPart_1_0, 
                                      		"fixed_part");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4637:2: (this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) ) )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==RULE_SEMICOLON) ) {
                                int LA53_1 = input.LA(2);

                                if ( (LA53_1==69) ) {
                                    alt53=1;
                                }
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4637:3: this_SEMICOLON_2= RULE_SEMICOLON ( (lv_variantPart_3_0= rulevariant_part ) )
                                    {
                                    this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefield_list9795); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_SEMICOLON_2, grammarAccess.getField_listAccess().getSEMICOLONTerminalRuleCall_1_0_0_1_0()); 
                                          
                                    }
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4641:1: ( (lv_variantPart_3_0= rulevariant_part ) )
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4642:1: (lv_variantPart_3_0= rulevariant_part )
                                    {
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4642:1: (lv_variantPart_3_0= rulevariant_part )
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4643:3: lv_variantPart_3_0= rulevariant_part
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getField_listAccess().getVariantPartVariant_partParserRuleCall_1_0_0_1_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_rulevariant_part_in_rulefield_list9815);
                                    lv_variantPart_3_0=rulevariant_part();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getField_listRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"variantPart",
                                              		lv_variantPart_3_0, 
                                              		"variant_part");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4660:6: ( (lv_variantPart_4_0= rulevariant_part ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4660:6: ( (lv_variantPart_4_0= rulevariant_part ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4661:1: (lv_variantPart_4_0= rulevariant_part )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4661:1: (lv_variantPart_4_0= rulevariant_part )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4662:3: lv_variantPart_4_0= rulevariant_part
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_listAccess().getVariantPartVariant_partParserRuleCall_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariant_part_in_rulefield_list9845);
                            lv_variantPart_4_0=rulevariant_part();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_listRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"variantPart",
                                      		lv_variantPart_4_0, 
                                      		"variant_part");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4678:3: (this_SEMICOLON_5= RULE_SEMICOLON )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_SEMICOLON) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4678:4: this_SEMICOLON_5= RULE_SEMICOLON
                            {
                            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefield_list9858); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SEMICOLON_5, grammarAccess.getField_listAccess().getSEMICOLONTerminalRuleCall_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4690:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4691:2: (iv_rulefixed_part= rulefixed_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4692:2: iv_rulefixed_part= rulefixed_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixed_partRule()); 
            }
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part9897);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefixed_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part9907); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4699:1: rulefixed_part returns [EObject current=null] : ( ( (lv_recordSections_0_0= rulerecord_section ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_recordSections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        EObject lv_recordSections_0_0 = null;

        EObject lv_recordSections_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4702:28: ( ( ( (lv_recordSections_0_0= rulerecord_section ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_recordSections_2_0= rulerecord_section ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4703:1: ( ( (lv_recordSections_0_0= rulerecord_section ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_recordSections_2_0= rulerecord_section ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4703:1: ( ( (lv_recordSections_0_0= rulerecord_section ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_recordSections_2_0= rulerecord_section ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4703:2: ( (lv_recordSections_0_0= rulerecord_section ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_recordSections_2_0= rulerecord_section ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4703:2: ( (lv_recordSections_0_0= rulerecord_section ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4704:1: (lv_recordSections_0_0= rulerecord_section )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4704:1: (lv_recordSections_0_0= rulerecord_section )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4705:3: lv_recordSections_0_0= rulerecord_section
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFixed_partAccess().getRecordSectionsRecord_sectionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part9953);
            lv_recordSections_0_0=rulerecord_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFixed_partRule());
              	        }
                     		add(
                     			current, 
                     			"recordSections",
                      		lv_recordSections_0_0, 
                      		"record_section");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4721:2: (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_recordSections_2_0= rulerecord_section ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_SEMICOLON) ) {
                    int LA57_1 = input.LA(2);

                    if ( (LA57_1==RULE_IDENTIFIER) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4721:3: this_SEMICOLON_1= RULE_SEMICOLON ( (lv_recordSections_2_0= rulerecord_section ) )
            	    {
            	    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefixed_part9965); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_1, grammarAccess.getFixed_partAccess().getSEMICOLONTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4725:1: ( (lv_recordSections_2_0= rulerecord_section ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4726:1: (lv_recordSections_2_0= rulerecord_section )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4726:1: (lv_recordSections_2_0= rulerecord_section )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4727:3: lv_recordSections_2_0= rulerecord_section
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFixed_partAccess().getRecordSectionsRecord_sectionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part9985);
            	    lv_recordSections_2_0=rulerecord_section();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"recordSections",
            	              		lv_recordSections_2_0, 
            	              		"record_section");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulerecord_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4751:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4752:2: (iv_rulerecord_section= rulerecord_section EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4753:2: iv_rulerecord_section= rulerecord_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            }
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section10023);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecord_section; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section10033); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4760:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4763:28: ( ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4764:1: ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4764:1: ( ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4764:2: ( (lv_identifierList_0_0= ruleidentifier_list ) ) this_COLON_1= RULE_COLON ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4764:2: ( (lv_identifierList_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4765:1: (lv_identifierList_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4765:1: (lv_identifierList_0_0= ruleidentifier_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4766:3: lv_identifierList_0_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifierListIdentifier_listParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleidentifier_list_in_rulerecord_section10079);
            lv_identifierList_0_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
              	        }
                     		set(
                     			current, 
                     			"identifierList",
                      		lv_identifierList_0_0, 
                      		"identifier_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulerecord_section10090); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_1, grammarAccess.getRecord_sectionAccess().getCOLONTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4786:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4787:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4787:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4788:3: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_rulerecord_section10110);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4812:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4813:2: (iv_rulevariant_part= rulevariant_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4814:2: iv_rulevariant_part= rulevariant_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariant_partRule()); 
            }
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part10146);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariant_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part10156); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4821:1: rulevariant_part returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tagfield_1_0= ruletag_field ) ) ( (lv_id_2_0= RULE_IDENTIFIER ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (this_SEMICOLON_5= RULE_SEMICOLON ( (lv_variants_6_0= rulevariant ) ) )* ) ;
    public final EObject rulevariant_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token this_SEMICOLON_5=null;
        EObject lv_tagfield_1_0 = null;

        EObject lv_variants_4_0 = null;

        EObject lv_variants_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4824:28: ( (otherlv_0= 'case' ( (lv_tagfield_1_0= ruletag_field ) ) ( (lv_id_2_0= RULE_IDENTIFIER ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (this_SEMICOLON_5= RULE_SEMICOLON ( (lv_variants_6_0= rulevariant ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4825:1: (otherlv_0= 'case' ( (lv_tagfield_1_0= ruletag_field ) ) ( (lv_id_2_0= RULE_IDENTIFIER ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (this_SEMICOLON_5= RULE_SEMICOLON ( (lv_variants_6_0= rulevariant ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4825:1: (otherlv_0= 'case' ( (lv_tagfield_1_0= ruletag_field ) ) ( (lv_id_2_0= RULE_IDENTIFIER ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (this_SEMICOLON_5= RULE_SEMICOLON ( (lv_variants_6_0= rulevariant ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4825:3: otherlv_0= 'case' ( (lv_tagfield_1_0= ruletag_field ) ) ( (lv_id_2_0= RULE_IDENTIFIER ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (this_SEMICOLON_5= RULE_SEMICOLON ( (lv_variants_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_rulevariant_part10193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4829:1: ( (lv_tagfield_1_0= ruletag_field ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4830:1: (lv_tagfield_1_0= ruletag_field )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4830:1: (lv_tagfield_1_0= ruletag_field )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4831:3: lv_tagfield_1_0= ruletag_field
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariant_partAccess().getTagfieldTag_fieldParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletag_field_in_rulevariant_part10214);
            lv_tagfield_1_0=ruletag_field();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
              	        }
                     		set(
                     			current, 
                     			"tagfield",
                      		lv_tagfield_1_0, 
                      		"tag_field");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4847:2: ( (lv_id_2_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4848:1: (lv_id_2_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4848:1: (lv_id_2_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4849:3: lv_id_2_0= RULE_IDENTIFIER
            {
            lv_id_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariant_part10231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_2_0, grammarAccess.getVariant_partAccess().getIdIDENTIFIERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariant_partRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_2_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_rulevariant_part10248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4869:1: ( (lv_variants_4_0= rulevariant ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4870:1: (lv_variants_4_0= rulevariant )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4870:1: (lv_variants_4_0= rulevariant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4871:3: lv_variants_4_0= rulevariant
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulevariant_in_rulevariant_part10269);
            lv_variants_4_0=rulevariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
              	        }
                     		add(
                     			current, 
                     			"variants",
                      		lv_variants_4_0, 
                      		"variant");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4887:2: (this_SEMICOLON_5= RULE_SEMICOLON ( (lv_variants_6_0= rulevariant ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_SEMICOLON) ) {
                    int LA58_1 = input.LA(2);

                    if ( (LA58_1==RULE_IDENTIFIER||LA58_1==RULE_STRING1||(LA58_1>=RULE_INTEGER_NUMBER && LA58_1<=RULE_REAL_NUMBER)||(LA58_1>=71 && LA58_1<=72)) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4887:3: this_SEMICOLON_5= RULE_SEMICOLON ( (lv_variants_6_0= rulevariant ) )
            	    {
            	    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulevariant_part10281); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_5, grammarAccess.getVariant_partAccess().getSEMICOLONTerminalRuleCall_5_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4891:1: ( (lv_variants_6_0= rulevariant ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4892:1: (lv_variants_6_0= rulevariant )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4892:1: (lv_variants_6_0= rulevariant )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4893:3: lv_variants_6_0= rulevariant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulevariant_in_rulevariant_part10301);
            	    lv_variants_6_0=rulevariant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variants",
            	              		lv_variants_6_0, 
            	              		"variant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4917:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4918:2: (iv_ruletag_field= ruletag_field EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4919:2: iv_ruletag_field= ruletag_field EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTag_fieldRule()); 
            }
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field10339);
            iv_ruletag_field=ruletag_field();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletag_field; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field10349); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4926:1: ruletag_field returns [EObject current=null] : ( () ( ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_COLON_2= RULE_COLON )? ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token this_COLON_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4929:28: ( ( () ( ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_COLON_2= RULE_COLON )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4930:1: ( () ( ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_COLON_2= RULE_COLON )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4930:1: ( () ( ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_COLON_2= RULE_COLON )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4930:2: () ( ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_COLON_2= RULE_COLON )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4930:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4931:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTag_fieldAccess().getTag_fieldAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4936:2: ( ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_COLON_2= RULE_COLON )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_IDENTIFIER) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_COLON) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4936:3: ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_COLON_2= RULE_COLON
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4936:3: ( (lv_id_1_0= RULE_IDENTIFIER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4937:1: (lv_id_1_0= RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4937:1: (lv_id_1_0= RULE_IDENTIFIER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4938:3: lv_id_1_0= RULE_IDENTIFIER
                    {
                    lv_id_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletag_field10401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_1_0, grammarAccess.getTag_fieldAccess().getIdIDENTIFIERTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTag_fieldRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }

                    this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruletag_field10417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_2, grammarAccess.getTag_fieldAccess().getCOLONTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4966:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4967:2: (iv_rulevariant= rulevariant EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4968:2: iv_rulevariant= rulevariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariantRule()); 
            }
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant10454);
            iv_rulevariant=rulevariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant10464); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4975:1: rulevariant returns [EObject current=null] : ( ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_fieldList_3_0= rulefield_list ) ) this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        Token this_LEFT_PARENTHESIS_2=null;
        Token this_RIGHT_PARENTHESIS_4=null;
        EObject lv_caseLabelList_0_0 = null;

        EObject lv_fieldList_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4978:28: ( ( ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_fieldList_3_0= rulefield_list ) ) this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4979:1: ( ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_fieldList_3_0= rulefield_list ) ) this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4979:1: ( ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_fieldList_3_0= rulefield_list ) ) this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4979:2: ( (lv_caseLabelList_0_0= rulecase_label_list ) ) this_COLON_1= RULE_COLON this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_fieldList_3_0= rulefield_list ) ) this_RIGHT_PARENTHESIS_4= RULE_RIGHT_PARENTHESIS
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4979:2: ( (lv_caseLabelList_0_0= rulecase_label_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4980:1: (lv_caseLabelList_0_0= rulecase_label_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4980:1: (lv_caseLabelList_0_0= rulecase_label_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:4981:3: lv_caseLabelList_0_0= rulecase_label_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariantAccess().getCaseLabelListCase_label_listParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecase_label_list_in_rulevariant10510);
            lv_caseLabelList_0_0=rulecase_label_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariantRule());
              	        }
                     		set(
                     			current, 
                     			"caseLabelList",
                      		lv_caseLabelList_0_0, 
                      		"case_label_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulevariant10521); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_1, grammarAccess.getVariantAccess().getCOLONTerminalRuleCall_1()); 
                  
            }
            this_LEFT_PARENTHESIS_2=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_rulevariant10531); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_2, grammarAccess.getVariantAccess().getLEFT_PARENTHESISTerminalRuleCall_2()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5005:1: ( (lv_fieldList_3_0= rulefield_list ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5006:1: (lv_fieldList_3_0= rulefield_list )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5006:1: (lv_fieldList_3_0= rulefield_list )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5007:3: lv_fieldList_3_0= rulefield_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariantAccess().getFieldListField_listParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulefield_list_in_rulevariant10551);
            lv_fieldList_3_0=rulefield_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariantRule());
              	        }
                     		set(
                     			current, 
                     			"fieldList",
                      		lv_fieldList_3_0, 
                      		"field_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RIGHT_PARENTHESIS_4=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_rulevariant10562); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_4, grammarAccess.getVariantAccess().getRIGHT_PARENTHESISTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRulefield_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5035:1: entryRulefield_identifier returns [String current=null] : iv_rulefield_identifier= rulefield_identifier EOF ;
    public final String entryRulefield_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5036:2: (iv_rulefield_identifier= rulefield_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5037:2: iv_rulefield_identifier= rulefield_identifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_identifierRule()); 
            }
            pushFollow(FOLLOW_rulefield_identifier_in_entryRulefield_identifier10598);
            iv_rulefield_identifier=rulefield_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_identifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_identifier10609); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefield_identifier"


    // $ANTLR start "rulefield_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5044:1: rulefield_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulefield_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5047:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5048:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefield_identifier10648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getField_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_identifier"


    // $ANTLR start "entryRulevariable_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5065:1: entryRulevariable_identifier returns [String current=null] : iv_rulevariable_identifier= rulevariable_identifier EOF ;
    public final String entryRulevariable_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5066:2: (iv_rulevariable_identifier= rulevariable_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5067:2: iv_rulevariable_identifier= rulevariable_identifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_identifierRule()); 
            }
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier10695);
            iv_rulevariable_identifier=rulevariable_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_identifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier10706); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_identifier"


    // $ANTLR start "rulevariable_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5074:1: rulevariable_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulevariable_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5077:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5078:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier10745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getVariable_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_identifier"


    // $ANTLR start "entryRuleprocedure_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5095:1: entryRuleprocedure_identifier returns [String current=null] : iv_ruleprocedure_identifier= ruleprocedure_identifier EOF ;
    public final String entryRuleprocedure_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5096:2: (iv_ruleprocedure_identifier= ruleprocedure_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5097:2: iv_ruleprocedure_identifier= ruleprocedure_identifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_identifierRule()); 
            }
            pushFollow(FOLLOW_ruleprocedure_identifier_in_entryRuleprocedure_identifier10792);
            iv_ruleprocedure_identifier=ruleprocedure_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_identifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_identifier10803); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_identifier"


    // $ANTLR start "ruleprocedure_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5104:1: ruleprocedure_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleprocedure_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5107:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5108:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_identifier10842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getProcedure_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_identifier"


    // $ANTLR start "entryRuleExpressionList"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5127:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5128:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5129:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList10890);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList10900); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5136:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5139:28: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5140:1: ( ( (lv_expressions_0_0= ruleexpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5140:1: ( ( (lv_expressions_0_0= ruleexpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5140:2: ( (lv_expressions_0_0= ruleexpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5140:2: ( (lv_expressions_0_0= ruleexpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5141:1: (lv_expressions_0_0= ruleexpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5141:1: (lv_expressions_0_0= ruleexpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5142:3: lv_expressions_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleExpressionList10946);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_0_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5158:2: (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_COMMA) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5158:3: this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleExpressionList10958); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getExpressionListAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5162:1: ( (lv_expressions_2_0= ruleexpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5163:1: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5163:1: (lv_expressions_2_0= ruleexpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5164:3: lv_expressions_2_0= ruleexpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexpression_in_ruleExpressionList10978);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5188:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5189:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5190:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            }
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list11016);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifier_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list11026); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5197:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_ids_0_0= RULE_IDENTIFIER ) ) (this_COMMA_1= RULE_COMMA ( (lv_ids_2_0= RULE_IDENTIFIER ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_ids_0_0=null;
        Token this_COMMA_1=null;
        Token lv_ids_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5200:28: ( ( ( (lv_ids_0_0= RULE_IDENTIFIER ) ) (this_COMMA_1= RULE_COMMA ( (lv_ids_2_0= RULE_IDENTIFIER ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5201:1: ( ( (lv_ids_0_0= RULE_IDENTIFIER ) ) (this_COMMA_1= RULE_COMMA ( (lv_ids_2_0= RULE_IDENTIFIER ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5201:1: ( ( (lv_ids_0_0= RULE_IDENTIFIER ) ) (this_COMMA_1= RULE_COMMA ( (lv_ids_2_0= RULE_IDENTIFIER ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5201:2: ( (lv_ids_0_0= RULE_IDENTIFIER ) ) (this_COMMA_1= RULE_COMMA ( (lv_ids_2_0= RULE_IDENTIFIER ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5201:2: ( (lv_ids_0_0= RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5202:1: (lv_ids_0_0= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5202:1: (lv_ids_0_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5203:3: lv_ids_0_0= RULE_IDENTIFIER
            {
            lv_ids_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list11068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_ids_0_0, grammarAccess.getIdentifier_listAccess().getIdsIDENTIFIERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifier_listRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"ids",
                      		lv_ids_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5219:2: (this_COMMA_1= RULE_COMMA ( (lv_ids_2_0= RULE_IDENTIFIER ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5219:3: this_COMMA_1= RULE_COMMA ( (lv_ids_2_0= RULE_IDENTIFIER ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleidentifier_list11085); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getIdentifier_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5223:1: ( (lv_ids_2_0= RULE_IDENTIFIER ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5224:1: (lv_ids_2_0= RULE_IDENTIFIER )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5224:1: (lv_ids_2_0= RULE_IDENTIFIER )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5225:3: lv_ids_2_0= RULE_IDENTIFIER
            	    {
            	    lv_ids_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list11101); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_ids_2_0, grammarAccess.getIdentifier_listAccess().getIdsIDENTIFIERTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getIdentifier_listRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"ids",
            	              		lv_ids_2_0, 
            	              		"IDENTIFIER");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5249:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5250:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5251:2: iv_rulenumber= rulenumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber11144);
            iv_rulenumber=rulenumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber11154); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5258:1: rulenumber returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5261:28: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5262:1: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5262:1: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INTEGER_NUMBER) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_REAL_NUMBER) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5262:2: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5262:2: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5263:1: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5263:1: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5264:3: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulenumber11196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_integer_0_0, grammarAccess.getNumberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"integer",
                              		lv_integer_0_0, 
                              		"INTEGER_NUMBER");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5281:6: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5281:6: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5282:1: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5282:1: (lv_real_1_0= RULE_REAL_NUMBER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5283:3: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_rulenumber11224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_real_1_0, grammarAccess.getNumberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"real",
                              		lv_real_1_0, 
                              		"REAL_NUMBER");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5307:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5308:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5309:2: iv_rulelabel= rulelabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel11265);
            iv_rulelabel=rulelabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel11275); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5316:1: rulelabel returns [EObject current=null] : ( (lv_int_0_0= RULE_INTEGER_NUMBER ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5319:28: ( ( (lv_int_0_0= RULE_INTEGER_NUMBER ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5320:1: ( (lv_int_0_0= RULE_INTEGER_NUMBER ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5320:1: ( (lv_int_0_0= RULE_INTEGER_NUMBER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5321:1: (lv_int_0_0= RULE_INTEGER_NUMBER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5321:1: (lv_int_0_0= RULE_INTEGER_NUMBER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5322:3: lv_int_0_0= RULE_INTEGER_NUMBER
            {
            lv_int_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel11316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_int_0_0, grammarAccess.getLabelAccess().getIntINTEGER_NUMBERTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"int",
                      		lv_int_0_0, 
                      		"INTEGER_NUMBER");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRuledigit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5348:1: entryRuledigit_sequence returns [String current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final String entryRuledigit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5349:2: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5350:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            }
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence11359);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledigit_sequence.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence11370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledigit_sequence"


    // $ANTLR start "ruledigit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5357:1: ruledigit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE ) ;
    public final AntlrDatatypeRuleToken ruledigit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNSIGNED_DIGIT_SEQUENCE_1=null;
        AntlrDatatypeRuleToken this_sign_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5360:28: ( ( (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5361:1: ( (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5361:1: ( (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5361:2: (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5361:2: (this_sign_0= rulesign )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=71 && LA63_0<=72)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5362:5: this_sign_0= rulesign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulesign_in_ruledigit_sequence11418);
                    this_sign_0=rulesign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_sign_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            this_UNSIGNED_DIGIT_SEQUENCE_1=(Token)match(input,RULE_UNSIGNED_DIGIT_SEQUENCE,FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_ruledigit_sequence11440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_UNSIGNED_DIGIT_SEQUENCE_1, grammarAccess.getDigit_sequenceAccess().getUNSIGNED_DIGIT_SEQUENCETerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledigit_sequence"


    // $ANTLR start "entryRulesign"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5387:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5388:2: (iv_rulesign= rulesign EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5389:2: iv_rulesign= rulesign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignRule()); 
            }
            pushFollow(FOLLOW_rulesign_in_entryRulesign11486);
            iv_rulesign=rulesign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesign11497); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5396:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5399:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5400:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5400:1: (kw= '+' | kw= '-' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==71) ) {
                alt64=1;
            }
            else if ( (LA64_0==72) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5401:2: kw= '+'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_rulesign11535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5408:2: kw= '-'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_rulesign11554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesign"


    // $ANTLR start "entryRuleconstant"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5421:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5422:2: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5423:2: iv_ruleconstant= ruleconstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant11594);
            iv_ruleconstant=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant11604); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5430:1: ruleconstant returns [EObject current=null] : ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_name_2_0= RULE_IDENTIFIER ) ) | ( (lv_number_3_0= rulenumber ) ) ) ) | ( (lv_string_4_0= RULE_STRING1 ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_string_4_0=null;
        EObject lv_number_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5433:28: ( ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_name_2_0= RULE_IDENTIFIER ) ) | ( (lv_number_3_0= rulenumber ) ) ) ) | ( (lv_string_4_0= RULE_STRING1 ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5434:1: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_name_2_0= RULE_IDENTIFIER ) ) | ( (lv_number_3_0= rulenumber ) ) ) ) | ( (lv_string_4_0= RULE_STRING1 ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5434:1: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_name_2_0= RULE_IDENTIFIER ) ) | ( (lv_number_3_0= rulenumber ) ) ) ) | ( (lv_string_4_0= RULE_STRING1 ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_IDENTIFIER||(LA67_0>=RULE_INTEGER_NUMBER && LA67_0<=RULE_REAL_NUMBER)||(LA67_0>=71 && LA67_0<=72)) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_STRING1) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5434:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_name_2_0= RULE_IDENTIFIER ) ) | ( (lv_number_3_0= rulenumber ) ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5434:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_name_2_0= RULE_IDENTIFIER ) ) | ( (lv_number_3_0= rulenumber ) ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5434:3: (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_name_2_0= RULE_IDENTIFIER ) ) | ( (lv_number_3_0= rulenumber ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5434:3: (otherlv_0= '+' | otherlv_1= '-' )?
                    int alt65=3;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==71) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==72) ) {
                        alt65=2;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5434:5: otherlv_0= '+'
                            {
                            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleconstant11643); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getPlusSignKeyword_0_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5439:7: otherlv_1= '-'
                            {
                            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleconstant11661); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getHyphenMinusKeyword_0_0_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5443:3: ( ( (lv_name_2_0= RULE_IDENTIFIER ) ) | ( (lv_number_3_0= rulenumber ) ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_IDENTIFIER) ) {
                        alt66=1;
                    }
                    else if ( ((LA66_0>=RULE_INTEGER_NUMBER && LA66_0<=RULE_REAL_NUMBER)) ) {
                        alt66=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5443:4: ( (lv_name_2_0= RULE_IDENTIFIER ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5443:4: ( (lv_name_2_0= RULE_IDENTIFIER ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5444:1: (lv_name_2_0= RULE_IDENTIFIER )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5444:1: (lv_name_2_0= RULE_IDENTIFIER )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5445:3: lv_name_2_0= RULE_IDENTIFIER
                            {
                            lv_name_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant11681); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_2_0, grammarAccess.getConstantAccess().getNameIDENTIFIERTerminalRuleCall_0_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getConstantRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_2_0, 
                                      		"IDENTIFIER");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5462:6: ( (lv_number_3_0= rulenumber ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5462:6: ( (lv_number_3_0= rulenumber ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5463:1: (lv_number_3_0= rulenumber )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5463:1: (lv_number_3_0= rulenumber )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5464:3: lv_number_3_0= rulenumber
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant11713);
                            lv_number_3_0=rulenumber();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getConstantRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"number",
                                      		lv_number_3_0, 
                                      		"number");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5481:6: ( (lv_string_4_0= RULE_STRING1 ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5481:6: ( (lv_string_4_0= RULE_STRING1 ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5482:1: (lv_string_4_0= RULE_STRING1 )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5482:1: (lv_string_4_0= RULE_STRING1 )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5483:3: lv_string_4_0= RULE_STRING1
                    {
                    lv_string_4_0=(Token)match(input,RULE_STRING1,FOLLOW_RULE_STRING1_in_ruleconstant11738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_4_0, grammarAccess.getConstantAccess().getStringSTRING1TerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_4_0, 
                              		"STRING1");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant"

    // $ANTLR start synpred1_InternalPascal
    public final void synpred1_InternalPascal_fragment() throws RecognitionException {   
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2759:4: ( 'else' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2759:6: 'else'
        {
        match(input,68,FOLLOW_68_in_synpred1_InternalPascal5891); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalPascal

    // $ANTLR start synpred2_InternalPascal
    public final void synpred2_InternalPascal_fragment() throws RecognitionException {   
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3313:4: ( ( ruleFunctionDesignator ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3314:1: ( ruleFunctionDesignator )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3314:1: ( ruleFunctionDesignator )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3315:1: ruleFunctionDesignator
        {
        pushFollow(FOLLOW_ruleFunctionDesignator_in_synpred2_InternalPascal7048);
        ruleFunctionDesignator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalPascal

    // $ANTLR start synpred3_InternalPascal
    public final void synpred3_InternalPascal_fragment() throws RecognitionException {   
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:4: ( ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:5: ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3957:5: ( ( ( 'boolean' | 'char' | 'integer' | 'real' ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3958:1: ( ( 'boolean' | 'char' | 'integer' | 'real' ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3958:1: ( ( 'boolean' | 'char' | 'integer' | 'real' ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:3959:1: ( 'boolean' | 'char' | 'integer' | 'real' )
        {
        if ( (input.LA(1)>=76 && input.LA(1)<=79) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPascal

    // Delegated rules

    public final boolean synpred3_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA41_eotS =
        "\13\uffff";
    static final String DFA41_eofS =
        "\1\uffff\1\12\11\uffff";
    static final String DFA41_minS =
        "\2\5\11\uffff";
    static final String DFA41_maxS =
        "\1\112\1\113\11\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\2\1\1\6";
    static final String DFA41_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\1\6\5\uffff\1\4\6\uffff\1\3\1\uffff\2\2\62\uffff\1\5\1"+
            "\7",
            "\1\11\1\uffff\3\12\3\uffff\1\12\2\uffff\3\12\41\uffff\1\12"+
            "\1\uffff\1\12\5\uffff\1\12\1\uffff\1\12\1\uffff\2\12\1\uffff"+
            "\2\12\6\uffff\1\10",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "3313:1: ( ( ( ( ( ruleFunctionDesignator ) )=> (lv_functionDesignator_0_0= ruleFunctionDesignator ) ) ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_string_3_0= RULE_STRING1 ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_nil_5_0= 'nil' ) ) | ( (lv_id_6_0= RULE_IDENTIFIER ) ) | (this_LEFT_PARENTHESIS_7= RULE_LEFT_PARENTHESIS ( (lv_expression_8_0= ruleexpression ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS ) | (otherlv_10= 'not' ( (lv_factor_11_0= rulefactor ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_1==75) && (synpred2_InternalPascal())) {s = 8;}

                        else if ( (LA41_1==RULE_IDENTIFIER) && (synpred2_InternalPascal())) {s = 9;}

                        else if ( (LA41_1==EOF||(LA41_1>=RULE_RIGHT_PARENTHESIS && LA41_1<=RULE_COMMA)||LA41_1==RULE_RIGHT_BRACKETS||(LA41_1>=RULE_RELATIONALOPERATOR && LA41_1<=RULE_MULTIPLICATIONOPERATOR)||LA41_1==52||LA41_1==54||LA41_1==60||LA41_1==62||(LA41_1>=64 && LA41_1<=65)||(LA41_1>=67 && LA41_1<=68)) ) {s = 10;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_ruleModel130 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_ruleprogram222 = new BitSet(new long[]{0x0007E00000000000L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleprogram254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleprogram_heading336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleprogram_heading358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading379 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleprogram_heading389 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleprogram_heading400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationPart_in_ruleblock491 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationPart_in_entryRuleDeclarationPart548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationPart558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruleDeclarationPart604 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_ruleDeclarationPart626 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_ruleDeclarationPart648 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_ruleDeclarationPart670 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_ruleDeclarationPart692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulelabel_declaration_part775 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part796 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulelabel_declaration_part808 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part828 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulelabel_declaration_part841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleconstant_definition_part923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part944 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleconstant_definition_part955 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part976 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleconstant_definition_part987 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition1070 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_IG_in_ruleconstant_definition1080 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part1136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruletype_definition_part1183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part1204 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruletype_definition_part1215 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part1236 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruletype_definition_part1247 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype_definition1330 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_IG_in_ruletype_definition1340 = new BitSet(new long[]{0x0080000000100060L,0x00000000000FF000L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulevariable_declaration_part1443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1464 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulevariable_declaration_part1475 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1496 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulevariable_declaration_part1507 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_declaration1600 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulevariable_declaration1611 = new BitSet(new long[]{0x0080000000100060L,0x00000000000FF000L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_declaration1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part1667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part1734 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part1761 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleprocedure_and_function_declaration_part1773 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration1810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_declaration1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleprocedure_declaration1857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_declaration1874 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_ruleprocedure_declaration1900 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleprocedure_declaration1912 = new BitSet(new long[]{0x0007E00000000000L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprocedure_declaration1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_declaration1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulefunction_declaration2015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_declaration2032 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_rulefunction_declaration2058 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulefunction_declaration2070 = new BitSet(new long[]{0x0080000000100060L,0x00000000000FF000L});
    public static final BitSet FOLLOW_ruletype_in_rulefunction_declaration2090 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefunction_declaration2101 = new BitSet(new long[]{0x0007E00000000000L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunction_declaration2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulestatement_part2204 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part2226 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_rulestatement_part2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading2273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_heading2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleprocedure_heading2320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_heading2337 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_entryRulefunction_heading2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_heading2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulefunction_heading2447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_heading2464 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_rulefunction_heading2490 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefunction_heading2502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_heading2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list2561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_list2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleformal_parameter_list2607 = new BitSet(new long[]{0x0007000000000020L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list2627 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleformal_parameter_list2639 = new BitSet(new long[]{0x0007000000000020L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list2659 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleformal_parameter_list2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_section2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_ruleformal_parameter_section2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue_parameter_section2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section2936 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulevalue_parameter_section2947 = new BitSet(new long[]{0x00A0000000000020L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevalue_parameter_section2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section3003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_parameter_section3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulevariable_parameter_section3050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section3071 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulevariable_parameter_section3082 = new BitSet(new long[]{0x00A0000000000020L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevariable_parameter_section3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_type_in_entryRuleparameter_type3138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_type3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleparameter_type3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleparameter_type3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema3258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconformant_array_schema3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_Schema_in_ruleconformant_array_schema3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema3377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepacked_conformant_array_schema3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulepacked_conformant_array_schema3424 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKETS_in_rulepacked_conformant_array_schema3435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema3455 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKETS_in_rulepacked_conformant_array_schema3466 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulepacked_conformant_array_schema3477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepacked_conformant_array_schema3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_Schema_in_entryRuleunpacked_conformant_array_Schema3535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_conformant_array_Schema3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleunpacked_conformant_array_Schema3582 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKETS_in_ruleunpacked_conformant_array_Schema3593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_Schema3613 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleunpacked_conformant_array_Schema3625 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_Schema3645 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKETS_in_ruleunpacked_conformant_array_Schema3658 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleunpacked_conformant_array_Schema3669 = new BitSet(new long[]{0x00A0000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleunpacked_conformant_array_Schema3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleunpacked_conformant_array_Schema3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebound_specification_in_entryRulebound_specification3756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebound_specification3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulebound_specification3808 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_DIAERESIS_in_rulebound_specification3824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulebound_specification3840 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulebound_specification3856 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulebound_specification3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence3913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence3969 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulestatement_sequence3981 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence4001 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement4039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rulestatement4097 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulestatement4107 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_rulestatement4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement4189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_statement_in_rulesimple_statement4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_rulesimple_statement4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement4335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleassignment_statement4389 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleassignment_statement4425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ASSIGNMENT_SIGN_in_ruleassignment_statement4442 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_statement_in_entryRuleprocedure_statement4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_statement4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_statement4550 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleprocedure_statement4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement4623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulegoto_statement4670 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rulelabel_in_rulegoto_statement4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_entryRulestructured_statement4727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_statement4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestructured_statement4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rulestructured_statement4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_rulestructured_statement4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_rulestructured_statement4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement4900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulecompound_statement4947 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulecompound_statement4968 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_rulecompound_statement4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement5016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepetitive_statement5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulerepetitive_statement5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rulerepetitive_statement5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulerepetitive_statement5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement5162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulewhile_statement5209 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement5230 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulewhile_statement5242 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement5299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepeat_statement5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulerepeat_statement5346 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulerepeat_statement5367 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_rulerepeat_statement5379 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_rulerepeat_statement5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement5436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulefor_statement5483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefor_statement5500 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ASSIGNMENT_SIGN_in_rulefor_statement5516 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement5536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_rulefor_statement5549 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_65_in_rulefor_statement5567 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement5589 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulefor_statement5601 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement5658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_statement5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_ruleconditional_statement5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_ruleconditional_statement5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement5777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleif_statement5824 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement5845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleif_statement5857 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleif_statement5899 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_entryRulecase_statement5959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_statement5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulecase_statement6006 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecase_statement6027 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulecase_statement6039 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement6060 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulecase_statement6072 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement6092 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulecase_statement6106 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_rulecase_statement6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_entryRulecase_limb6155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_limb6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulecase_limb6211 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulecase_limb6222 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_in_rulecase_limb6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list6278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list6334 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulecase_label_list6346 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list6366 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rulewith_statement_in_entryRulewith_statement6404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewith_statement6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulewith_statement6451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement6472 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulewith_statement6484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement6504 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_60_in_rulewith_statement6518 = new BitSet(new long[]{0xAD08000000200020L,0x0000000000000064L});
    public static final BitSet FOLLOW_rulestatement_in_rulewith_statement6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression6575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression6631 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_RELATIONALOPERATOR_in_ruleexpression6649 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression6713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulesimple_expression6761 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_72_in_rulesimple_expression6779 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression6802 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_ADDITIONOPERATOR_in_rulesimple_expression6814 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression6834 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm6872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm6882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm6928 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATIONOPERATOR_in_ruleterm6940 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm6960 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor6998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDesignator_in_rulefactor7065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING1_in_rulefactor7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_rulefactor7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulefactor7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefactor7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_rulefactor7252 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefactor7272 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_rulefactor7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulefactor7302 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_rulefactor_in_rulefactor7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable7360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable7412 = new BitSet(new long[]{0x0000000000101012L});
    public static final BitSet FOLLOW_ruleVariable1_in_rulevariable7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable1_in_entryRuleVariable17475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable17485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKETS_in_ruleVariable17523 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleVariable17543 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKETS_in_ruleVariable17554 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_ruleVariable1_in_ruleVariable17575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariable17595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleVariable17611 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_ruleVariable1_in_ruleVariable17638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleVariable17657 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_ruleVariable1_in_ruleVariable17677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_entryRuleSet7714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKETS_in_ruleSet7760 = new BitSet(new long[]{0x0000000000683060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleElementList_in_ruleSet7780 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKETS_in_ruleSet7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementList_in_entryRuleElementList7826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementList7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleElementList7892 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleElementList7904 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleElementList7924 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleFunctionDesignator_in_entryRuleFunctionDesignator7964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDesignator7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleFunctionDesignator8016 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleFunctionDesignator8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype8074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruletype8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_ruletype8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_ruletype8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type8248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulesimple_type8369 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_77_in_rulesimple_type8398 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_78_in_rulesimple_type8427 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_79_in_rulesimple_type8456 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rulesimple_type8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rulesimple_type8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type8558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type8568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleenumerated_type8604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleenumerated_type8624 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleenumerated_type8635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type8670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type8726 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_DIAERESIS_in_rulesubrange_type8737 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type8793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulestructured_type8841 = new BitSet(new long[]{0x0080000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rulestructured_type8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type8900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_ruleunpacked_structured_type8956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_ruleunpacked_structured_type8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_ruleunpacked_structured_type9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_ruleunpacked_structured_type9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type9073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulearray_type9120 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKETS_in_rulearray_type9131 = new BitSet(new long[]{0x0000000000000040L,0x000000000000F000L});
    public static final BitSet FOLLOW_rulesimple_type_in_rulearray_type9151 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulearray_type9163 = new BitSet(new long[]{0x0000000000000040L,0x000000000000F000L});
    public static final BitSet FOLLOW_rulesimple_type_in_rulearray_type9183 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKETS_in_rulearray_type9196 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulearray_type9207 = new BitSet(new long[]{0x0080000000100060L,0x00000000000FF000L});
    public static final BitSet FOLLOW_ruletype_in_rulearray_type9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_entryRulerecord_type9264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_type9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulerecord_type9311 = new BitSet(new long[]{0x0010000000000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_rulefield_list_in_rulerecord_type9332 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_rulerecord_type9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type9380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleset_type9427 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleset_type9439 = new BitSet(new long[]{0x0080000000100060L,0x00000000000FF000L});
    public static final BitSet FOLLOW_ruletype_in_ruleset_type9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type9496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rulefile_type9543 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulefile_type9555 = new BitSet(new long[]{0x0080000000100060L,0x00000000000FF000L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_type9576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_entryRulepointer_type9612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepointer_type9622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulepointer_type9658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepointer_type9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list9715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list9725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rulefield_list9783 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefield_list9795 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list9815 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list9845 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefield_list9858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part9897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part9907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part9953 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefixed_part9965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part9985 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section10023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section10033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulerecord_section10079 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulerecord_section10090 = new BitSet(new long[]{0x0080000000100060L,0x00000000000FF000L});
    public static final BitSet FOLLOW_ruletype_in_rulerecord_section10110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part10146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulevariant_part10193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruletag_field_in_rulevariant_part10214 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariant_part10231 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulevariant_part10248 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part10269 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulevariant_part10281 = new BitSet(new long[]{0x0000000000680020L,0x0000000000000180L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part10301 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field10339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field10349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletag_field10401 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruletag_field10417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant10454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant10464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulevariant10510 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulevariant10521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_rulevariant10531 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000020L});
    public static final BitSet FOLLOW_rulefield_list_in_rulevariant10551 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_rulevariant10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_identifier_in_entryRulefield_identifier10598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_identifier10609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefield_identifier10648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier10695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier10706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier10745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_identifier_in_entryRuleprocedure_identifier10792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_identifier10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_identifier10842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList10890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList10900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleExpressionList10946 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleExpressionList10958 = new BitSet(new long[]{0x0000000000681060L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleExpressionList10978 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list11016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list11068 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleidentifier_list11085 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list11101 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber11144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulenumber11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_rulenumber11224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel11265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence11359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruledigit_sequence11418 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_ruledigit_sequence11440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign11486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulesign11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulesign11554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant11594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant11604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleconstant11643 = new BitSet(new long[]{0x0000000000600020L,0x0000000000000180L});
    public static final BitSet FOLLOW_72_in_ruleconstant11661 = new BitSet(new long[]{0x0000000000600020L,0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING1_in_ruleconstant11738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_synpred1_InternalPascal5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDesignator_in_synpred2_InternalPascal7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalPascal8299 = new BitSet(new long[]{0x0000000000000002L});

}