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

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'program'", "'('", "')'", "';'", "'declaration_part'", "'statement_part'", "'simple_type'", "'structured_type'", "'pointer_type'", "'type_identifier'", "','", "'+'", "'-'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'"
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:79:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=25 && LA1_0<=76)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:82:3: lv_greetings_0_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_0_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:115:1: ruleGreeting returns [EObject current=null] : ( ruleidentifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:118:28: ( ( ruleidentifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:1: ( ruleidentifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:1: ( ruleidentifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:120:5: ruleidentifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
             
                    newCompositeNode(grammarAccess.getGreetingAccess().getIdentifierParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_ruleGreeting217);
            ruleidentifier();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:127:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:128:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:128:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:129:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting233); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleGreeting250); 

                	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleprogram_heading"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:159:1: entryRuleprogram_heading returns [String current=null] : iv_ruleprogram_heading= ruleprogram_heading EOF ;
    public final String entryRuleprogram_heading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram_heading = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:160:2: (iv_ruleprogram_heading= ruleprogram_heading EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:161:2: iv_ruleprogram_heading= ruleprogram_heading EOF
            {
             newCompositeNode(grammarAccess.getProgram_headingRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading289);
            iv_ruleprogram_heading=ruleprogram_heading();

            state._fsp--;

             current =iv_ruleprogram_heading.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading300); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:168:1: ruleprogram_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleprogram_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_1 = null;

        AntlrDatatypeRuleToken this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:171:28: ( (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:172:1: (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:172:1: (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:173:2: kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleprogram_heading338); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifierParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_ruleprogram_heading360);
            this_identifier_1=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleprogram_heading378); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading400);
            this_identifier_list_3=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleprogram_heading418); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_4()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleprogram_heading431); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getSemicolonKeyword_5()); 
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:226:1: entryRuleblock returns [String current=null] : iv_ruleblock= ruleblock EOF ;
    public final String entryRuleblock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblock = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:227:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:228:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock472);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock483); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:235:1: ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) ;
    public final AntlrDatatypeRuleToken ruleblock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_statement_part_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:238:28: ( (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:239:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:239:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:240:5: this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part
            {
             
                    newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledeclaration_part_in_ruleblock530);
            this_declaration_part_0=ruledeclaration_part();

            state._fsp--;


            		current.merge(this_declaration_part_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock557);
            this_statement_part_1=rulestatement_part();

            state._fsp--;


            		current.merge(this_statement_part_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuledeclaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:269:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:270:2: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:271:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part603);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part614); 

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
    // $ANTLR end "entryRuledeclaration_part"


    // $ANTLR start "ruledeclaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:278:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'declaration_part' ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:281:28: (kw= 'declaration_part' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:283:2: kw= 'declaration_part'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruledeclaration_part651); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclaration_partAccess().getDeclaration_partKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:296:1: entryRulestatement_part returns [String current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final String entryRulestatement_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:297:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:298:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part691);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part702); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:305:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'statement_part' ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:308:28: (kw= 'statement_part' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:310:2: kw= 'statement_part'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_rulestatement_part739); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_partAccess().getStatement_partKeyword()); 
                

            }

             leaveRule(); 
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


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:335:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:336:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:337:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype791);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype802); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:344:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:347:28: ( (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:348:1: (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:348:1: (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:349:2: kw= 'simple_type'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruletype840); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getSimple_typeKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:356:2: kw= 'structured_type'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruletype859); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStructured_typeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:363:2: kw= 'pointer_type'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruletype878); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getPointer_typeKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:370:2: kw= 'type_identifier'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruletype897); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getType_identifierKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleidentifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:385:1: entryRuleidentifier returns [String current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final String entryRuleidentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:386:2: (iv_ruleidentifier= ruleidentifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:387:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleidentifier_in_entryRuleidentifier940);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier951); 

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
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:394:1: ruleidentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? ) ;
    public final AntlrDatatypeRuleToken ruleidentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_letter_0 = null;

        AntlrDatatypeRuleToken this_letter_1 = null;

        AntlrDatatypeRuleToken this_digit_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:397:28: ( (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:398:1: (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:398:1: (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:399:5: this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )?
            {
             
                    newCompositeNode(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleletter_in_ruleidentifier998);
            this_letter_0=ruleletter();

            state._fsp--;


            		current.merge(this_letter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:409:1: (this_letter_1= ruleletter | this_digit_2= ruledigit )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=25 && LA3_0<=76)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=77 && LA3_0<=86)) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:410:5: this_letter_1= ruleletter
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleletter_in_ruleidentifier1026);
                    this_letter_1=ruleletter();

                    state._fsp--;


                    		current.merge(this_letter_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:422:5: this_digit_2= ruledigit
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifierAccess().getDigitParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruledigit_in_ruleidentifier1059);
                    this_digit_2=ruledigit();

                    state._fsp--;


                    		current.merge(this_digit_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRulefield_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:440:1: entryRulefield_identifier returns [String current=null] : iv_rulefield_identifier= rulefield_identifier EOF ;
    public final String entryRulefield_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:441:2: (iv_rulefield_identifier= rulefield_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:442:2: iv_rulefield_identifier= rulefield_identifier EOF
            {
             newCompositeNode(grammarAccess.getField_identifierRule()); 
            pushFollow(FOLLOW_rulefield_identifier_in_entryRulefield_identifier1107);
            iv_rulefield_identifier=rulefield_identifier();

            state._fsp--;

             current =iv_rulefield_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_identifier1118); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:449:1: rulefield_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken rulefield_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:452:28: (this_identifier_0= ruleidentifier )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:454:5: this_identifier_0= ruleidentifier
            {
             
                    newCompositeNode(grammarAccess.getField_identifierAccess().getIdentifierParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_rulefield_identifier1164);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:474:1: entryRulevariable_identifier returns [String current=null] : iv_rulevariable_identifier= rulevariable_identifier EOF ;
    public final String entryRulevariable_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:475:2: (iv_rulevariable_identifier= rulevariable_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:476:2: iv_rulevariable_identifier= rulevariable_identifier EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier1211);
            iv_rulevariable_identifier=rulevariable_identifier();

            state._fsp--;

             current =iv_rulevariable_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier1222); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:483:1: rulevariable_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken rulevariable_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:486:28: (this_identifier_0= ruleidentifier )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:488:5: this_identifier_0= ruleidentifier
            {
             
                    newCompositeNode(grammarAccess.getVariable_identifierAccess().getIdentifierParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_rulevariable_identifier1268);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:514:1: entryRuleidentifier_list returns [String current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final String entryRuleidentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:515:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:516:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list1321);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list1332); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:523:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_identifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:526:28: ( (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:527:1: (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:527:1: (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:528:5: this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )*
            {
             
                    newCompositeNode(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_ruleidentifier_list1379);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:538:1: (kw= ',' this_identifier_2= ruleidentifier )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:539:2: kw= ',' this_identifier_2= ruleidentifier
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleidentifier_list1398); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleidentifier_in_ruleidentifier_list1420);
            	    this_identifier_2=ruleidentifier();

            	    state._fsp--;


            	    		current.merge(this_identifier_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleinteger_number"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:563:1: entryRuleinteger_number returns [String current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final String entryRuleinteger_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinteger_number = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:564:2: (iv_ruleinteger_number= ruleinteger_number EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:565:2: iv_ruleinteger_number= ruleinteger_number EOF
            {
             newCompositeNode(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number1468);
            iv_ruleinteger_number=ruleinteger_number();

            state._fsp--;

             current =iv_ruleinteger_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number1479); 

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
    // $ANTLR end "entryRuleinteger_number"


    // $ANTLR start "ruleinteger_number"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:572:1: ruleinteger_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_digit_sequence_0= ruledigit_sequence ;
    public final AntlrDatatypeRuleToken ruleinteger_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_sequence_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:575:28: (this_digit_sequence_0= ruledigit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:577:5: this_digit_sequence_0= ruledigit_sequence
            {
             
                    newCompositeNode(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number1525);
            this_digit_sequence_0=ruledigit_sequence();

            state._fsp--;


            		current.merge(this_digit_sequence_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinteger_number"


    // $ANTLR start "entryRuleunsigned_digit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:597:1: entryRuleunsigned_digit_sequence returns [String current=null] : iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF ;
    public final String entryRuleunsigned_digit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_digit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:598:2: (iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:599:2: iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_digit_sequenceRule()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence1572);
            iv_ruleunsigned_digit_sequence=ruleunsigned_digit_sequence();

            state._fsp--;

             current =iv_ruleunsigned_digit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_digit_sequence1583); 

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
    // $ANTLR end "entryRuleunsigned_digit_sequence"


    // $ANTLR start "ruleunsigned_digit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:606:1: ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_digit_0= ruledigit (this_digit_1= ruledigit )* ) ;
    public final AntlrDatatypeRuleToken ruleunsigned_digit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_0 = null;

        AntlrDatatypeRuleToken this_digit_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:609:28: ( (this_digit_0= ruledigit (this_digit_1= ruledigit )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:610:1: (this_digit_0= ruledigit (this_digit_1= ruledigit )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:610:1: (this_digit_0= ruledigit (this_digit_1= ruledigit )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:611:5: this_digit_0= ruledigit (this_digit_1= ruledigit )*
            {
             
                    newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1630);
            this_digit_0=ruledigit();

            state._fsp--;


            		current.merge(this_digit_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:621:1: (this_digit_1= ruledigit )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=77 && LA5_0<=86)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:622:5: this_digit_1= ruledigit
            	    {
            	     
            	            newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1658);
            	    this_digit_1=ruledigit();

            	    state._fsp--;


            	    		current.merge(this_digit_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_digit_sequence"


    // $ANTLR start "entryRuledigit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:640:1: entryRuledigit_sequence returns [String current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final String entryRuledigit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:641:2: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:642:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
             newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence1706);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;

             current =iv_ruledigit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence1717); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:649:1: ruledigit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) ;
    public final AntlrDatatypeRuleToken ruledigit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_sign_0 = null;

        AntlrDatatypeRuleToken this_unsigned_digit_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:652:28: ( ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:653:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:653:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:653:2: (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:653:2: (this_sign_0= rulesign )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=23 && LA6_0<=24)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:654:5: this_sign_0= rulesign
                    {
                     
                            newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesign_in_ruledigit_sequence1765);
                    this_sign_0=rulesign();

                    state._fsp--;


                    		current.merge(this_sign_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence1794);
            this_unsigned_digit_sequence_1=ruleunsigned_digit_sequence();

            state._fsp--;


            		current.merge(this_unsigned_digit_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:683:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:684:2: (iv_rulesign= rulesign EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:685:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign1840);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign1851); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:692:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:695:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:696:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:696:1: (kw= '+' | kw= '-' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:697:2: kw= '+'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulesign1889); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:704:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulesign1908); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleletter"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:717:1: entryRuleletter returns [String current=null] : iv_ruleletter= ruleletter EOF ;
    public final String entryRuleletter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleletter = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:718:2: (iv_ruleletter= ruleletter EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:719:2: iv_ruleletter= ruleletter EOF
            {
             newCompositeNode(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_ruleletter_in_entryRuleletter1949);
            iv_ruleletter=ruleletter();

            state._fsp--;

             current =iv_ruleletter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletter1960); 

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
    // $ANTLR end "entryRuleletter"


    // $ANTLR start "ruleletter"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:726:1: ruleletter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' ) ;
    public final AntlrDatatypeRuleToken ruleletter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:729:28: ( (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:730:1: (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:730:1: (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' )
            int alt8=52;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case 28:
                {
                alt8=4;
                }
                break;
            case 29:
                {
                alt8=5;
                }
                break;
            case 30:
                {
                alt8=6;
                }
                break;
            case 31:
                {
                alt8=7;
                }
                break;
            case 32:
                {
                alt8=8;
                }
                break;
            case 33:
                {
                alt8=9;
                }
                break;
            case 34:
                {
                alt8=10;
                }
                break;
            case 35:
                {
                alt8=11;
                }
                break;
            case 36:
                {
                alt8=12;
                }
                break;
            case 37:
                {
                alt8=13;
                }
                break;
            case 38:
                {
                alt8=14;
                }
                break;
            case 39:
                {
                alt8=15;
                }
                break;
            case 40:
                {
                alt8=16;
                }
                break;
            case 41:
                {
                alt8=17;
                }
                break;
            case 42:
                {
                alt8=18;
                }
                break;
            case 43:
                {
                alt8=19;
                }
                break;
            case 44:
                {
                alt8=20;
                }
                break;
            case 45:
                {
                alt8=21;
                }
                break;
            case 46:
                {
                alt8=22;
                }
                break;
            case 47:
                {
                alt8=23;
                }
                break;
            case 48:
                {
                alt8=24;
                }
                break;
            case 49:
                {
                alt8=25;
                }
                break;
            case 50:
                {
                alt8=26;
                }
                break;
            case 51:
                {
                alt8=27;
                }
                break;
            case 52:
                {
                alt8=28;
                }
                break;
            case 53:
                {
                alt8=29;
                }
                break;
            case 54:
                {
                alt8=30;
                }
                break;
            case 55:
                {
                alt8=31;
                }
                break;
            case 56:
                {
                alt8=32;
                }
                break;
            case 57:
                {
                alt8=33;
                }
                break;
            case 58:
                {
                alt8=34;
                }
                break;
            case 59:
                {
                alt8=35;
                }
                break;
            case 60:
                {
                alt8=36;
                }
                break;
            case 61:
                {
                alt8=37;
                }
                break;
            case 62:
                {
                alt8=38;
                }
                break;
            case 63:
                {
                alt8=39;
                }
                break;
            case 64:
                {
                alt8=40;
                }
                break;
            case 65:
                {
                alt8=41;
                }
                break;
            case 66:
                {
                alt8=42;
                }
                break;
            case 67:
                {
                alt8=43;
                }
                break;
            case 68:
                {
                alt8=44;
                }
                break;
            case 69:
                {
                alt8=45;
                }
                break;
            case 70:
                {
                alt8=46;
                }
                break;
            case 71:
                {
                alt8=47;
                }
                break;
            case 72:
                {
                alt8=48;
                }
                break;
            case 73:
                {
                alt8=49;
                }
                break;
            case 74:
                {
                alt8=50;
                }
                break;
            case 75:
                {
                alt8=51;
                }
                break;
            case 76:
                {
                alt8=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:731:2: kw= 'A'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleletter1998); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:738:2: kw= 'B'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleletter2017); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:745:2: kw= 'C'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleletter2036); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:752:2: kw= 'D'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleletter2055); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:759:2: kw= 'E'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleletter2074); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:766:2: kw= 'F'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleletter2093); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:773:2: kw= 'G'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleletter2112); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:780:2: kw= 'H'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleletter2131); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:787:2: kw= 'I'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleletter2150); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:794:2: kw= 'J'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleletter2169); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:801:2: kw= 'K'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleletter2188); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:808:2: kw= 'L'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleletter2207); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:815:2: kw= 'M'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleletter2226); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:822:2: kw= 'N'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleletter2245); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:829:2: kw= 'O'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleletter2264); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:836:2: kw= 'P'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleletter2283); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:843:2: kw= 'Q'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleletter2302); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:850:2: kw= 'R'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleletter2321); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:857:2: kw= 'S'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleletter2340); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:864:2: kw= 'T'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleletter2359); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:871:2: kw= 'U'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleletter2378); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:878:2: kw= 'V'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleletter2397); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:885:2: kw= 'W'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleletter2416); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:892:2: kw= 'X'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleletter2435); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:899:2: kw= 'Y'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleletter2454); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:906:2: kw= 'Z'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleletter2473); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getZKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:913:2: kw= 'a'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleletter2492); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:920:2: kw= 'b'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleletter2511); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:927:2: kw= 'c'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleletter2530); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:934:2: kw= 'd'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleletter2549); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:941:2: kw= 'e'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleletter2568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:948:2: kw= 'f'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleletter2587); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:955:2: kw= 'g'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleletter2606); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:962:2: kw= 'h'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleletter2625); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:969:2: kw= 'i'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleletter2644); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:976:2: kw= 'j'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleletter2663); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:983:2: kw= 'k'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleletter2682); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:990:2: kw= 'l'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleletter2701); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:997:2: kw= 'm'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleletter2720); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1004:2: kw= 'n'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleletter2739); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1011:2: kw= 'o'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleletter2758); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1018:2: kw= 'p'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleletter2777); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_41()); 
                        

                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1025:2: kw= 'q'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleletter2796); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_42()); 
                        

                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1032:2: kw= 'r'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleletter2815); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_43()); 
                        

                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1039:2: kw= 's'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleletter2834); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_44()); 
                        

                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1046:2: kw= 't'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleletter2853); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_45()); 
                        

                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1053:2: kw= 'u'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleletter2872); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_46()); 
                        

                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1060:2: kw= 'v'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleletter2891); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_47()); 
                        

                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1067:2: kw= 'w'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleletter2910); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_48()); 
                        

                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1074:2: kw= 'x'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleletter2929); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_49()); 
                        

                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1081:2: kw= 'y'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleletter2948); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_50()); 
                        

                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1088:2: kw= 'z'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleletter2967); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getZKeyword_51()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleletter"


    // $ANTLR start "entryRuledigit"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1101:1: entryRuledigit returns [String current=null] : iv_ruledigit= ruledigit EOF ;
    public final String entryRuledigit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1102:2: (iv_ruledigit= ruledigit EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1103:2: iv_ruledigit= ruledigit EOF
            {
             newCompositeNode(grammarAccess.getDigitRule()); 
            pushFollow(FOLLOW_ruledigit_in_entryRuledigit3008);
            iv_ruledigit=ruledigit();

            state._fsp--;

             current =iv_ruledigit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit3019); 

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
    // $ANTLR end "entryRuledigit"


    // $ANTLR start "ruledigit"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1110:1: ruledigit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) ;
    public final AntlrDatatypeRuleToken ruledigit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1113:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1114:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1114:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt9=1;
                }
                break;
            case 78:
                {
                alt9=2;
                }
                break;
            case 79:
                {
                alt9=3;
                }
                break;
            case 80:
                {
                alt9=4;
                }
                break;
            case 81:
                {
                alt9=5;
                }
                break;
            case 82:
                {
                alt9=6;
                }
                break;
            case 83:
                {
                alt9=7;
                }
                break;
            case 84:
                {
                alt9=8;
                }
                break;
            case 85:
                {
                alt9=9;
                }
                break;
            case 86:
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1115:2: kw= '0'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruledigit3057); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1122:2: kw= '1'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruledigit3076); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1129:2: kw= '2'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruledigit3095); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1136:2: kw= '3'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruledigit3114); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1143:2: kw= '4'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruledigit3133); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1150:2: kw= '5'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruledigit3152); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1157:2: kw= '6'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruledigit3171); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1164:2: kw= '7'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruledigit3190); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1171:2: kw= '8'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruledigit3209); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1178:2: kw= '9'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruledigit3228); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitNineKeyword_9()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledigit"


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1191:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1192:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1193:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel3269);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel3280); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1200:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_integer_number_0= ruleinteger_number ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_integer_number_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1203:28: (this_integer_number_0= ruleinteger_number )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1205:5: this_integer_number_0= ruleinteger_number
            {
             
                    newCompositeNode(grammarAccess.getLabelAccess().getInteger_numberParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleinteger_number_in_rulelabel3326);
            this_integer_number_0=ruleinteger_number();

            state._fsp--;


            		current.merge(this_integer_number_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0xFFFFFFFFFE000002L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleGreeting217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting233 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleGreeting250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleprogram_heading338 = new BitSet(new long[]{0xFFFFFFFFFE002000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleprogram_heading360 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleprogram_heading378 = new BitSet(new long[]{0xFFFFFFFFFE400000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading400 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleprogram_heading418 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleprogram_heading431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock530 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruledeclaration_part651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulestatement_part739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruletype840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruletype859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruletype878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruletype897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_entryRuleidentifier940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_ruleidentifier998 = new BitSet(new long[]{0xFFFFFFFFFE000000L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_ruleletter_in_ruleidentifier1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_ruleidentifier1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_identifier_in_entryRulefield_identifier1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_identifier1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rulefield_identifier1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rulevariable_identifier1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleidentifier_list1379 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleidentifier_list1398 = new BitSet(new long[]{0xFFFFFFFFFE400000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleidentifier_list1420 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number1468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_digit_sequence1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1630 = new BitSet(new long[]{0x0000000000000002L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1658 = new BitSet(new long[]{0x0000000000000002L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence1706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruledigit_sequence1765 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign1840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulesign1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulesign1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_entryRuleletter1949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletter1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleletter1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleletter2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleletter2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleletter2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleletter2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleletter2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleletter2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleletter2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleletter2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleletter2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleletter2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleletter2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleletter2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleletter2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleletter2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleletter2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleletter2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleletter2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleletter2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleletter2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleletter2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleletter2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleletter2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleletter2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleletter2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleletter2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleletter2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleletter2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleletter2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleletter2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleletter2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleletter2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleletter2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleletter2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleletter2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleletter2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleletter2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleletter2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleletter2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleletter2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleletter2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleletter2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleletter2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleletter2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleletter2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleletter2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleletter2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleletter2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleletter2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleletter2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleletter2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleletter2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_entryRuledigit3008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruledigit3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruledigit3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruledigit3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruledigit3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruledigit3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruledigit3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruledigit3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruledigit3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruledigit3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruledigit3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel3269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rulelabel3326 = new BitSet(new long[]{0x0000000000000002L});

}