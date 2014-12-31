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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'program'", "'('", "')'", "';'", "'declaration_part'", "'statement_part'", "','", "'+'", "'-'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'"
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

                if ( (LA1_0==11) ) {
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:115:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:118:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGreeting213); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting230); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGreeting247); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:155:1: entryRuleprogram_heading returns [String current=null] : iv_ruleprogram_heading= ruleprogram_heading EOF ;
    public final String entryRuleprogram_heading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram_heading = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:156:2: (iv_ruleprogram_heading= ruleprogram_heading EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:157:2: iv_ruleprogram_heading= ruleprogram_heading EOF
            {
             newCompositeNode(grammarAccess.getProgram_headingRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading286);
            iv_ruleprogram_heading=ruleprogram_heading();

            state._fsp--;

             current =iv_ruleprogram_heading.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading297); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:164:1: ruleprogram_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleprogram_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_1 = null;

        AntlrDatatypeRuleToken this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:167:28: ( (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:168:1: (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:168:1: (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:169:2: kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';'
            {
            kw=(Token)match(input,13,FOLLOW_13_in_ruleprogram_heading335); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifierParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_ruleprogram_heading357);
            this_identifier_1=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleprogram_heading375); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading397);
            this_identifier_list_3=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleprogram_heading415); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_4()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleprogram_heading428); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:222:1: entryRuleblock returns [String current=null] : iv_ruleblock= ruleblock EOF ;
    public final String entryRuleblock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblock = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:223:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:224:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock469);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock480); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:231:1: ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) ;
    public final AntlrDatatypeRuleToken ruleblock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_statement_part_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:234:28: ( (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:235:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:235:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:236:5: this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part
            {
             
                    newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledeclaration_part_in_ruleblock527);
            this_declaration_part_0=ruledeclaration_part();

            state._fsp--;


            		current.merge(this_declaration_part_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock554);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:265:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:266:2: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:267:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part600);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part611); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:274:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'declaration_part' ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:277:28: (kw= 'declaration_part' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:279:2: kw= 'declaration_part'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruledeclaration_part648); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:292:1: entryRulestatement_part returns [String current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final String entryRulestatement_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:293:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:294:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part688);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part699); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:301:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'statement_part' ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:304:28: (kw= 'statement_part' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:306:2: kw= 'statement_part'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_rulestatement_part736); 

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


    // $ANTLR start "entryRuleidentifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:319:1: entryRuleidentifier returns [String current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final String entryRuleidentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:320:2: (iv_ruleidentifier= ruleidentifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:321:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleidentifier_in_entryRuleidentifier776);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier787); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:328:1: ruleidentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? ) ;
    public final AntlrDatatypeRuleToken ruleidentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_letter_0 = null;

        AntlrDatatypeRuleToken this_letter_1 = null;

        AntlrDatatypeRuleToken this_digit_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:331:28: ( (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:332:1: (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:332:1: (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:333:5: this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )?
            {
             
                    newCompositeNode(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleletter_in_ruleidentifier834);
            this_letter_0=ruleletter();

            state._fsp--;


            		current.merge(this_letter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:343:1: (this_letter_1= ruleletter | this_digit_2= ruledigit )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=22 && LA2_0<=73)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=74 && LA2_0<=83)) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:344:5: this_letter_1= ruleletter
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleletter_in_ruleidentifier862);
                    this_letter_1=ruleletter();

                    state._fsp--;


                    		current.merge(this_letter_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:356:5: this_digit_2= ruledigit
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifierAccess().getDigitParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruledigit_in_ruleidentifier895);
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


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:376:1: entryRuleidentifier_list returns [String current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final String entryRuleidentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:377:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:378:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list945);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list956); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:385:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_identifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:388:28: ( (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:389:1: (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:389:1: (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:390:5: this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )*
            {
             
                    newCompositeNode(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_ruleidentifier_list1003);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:400:1: (kw= ',' this_identifier_2= ruleidentifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:401:2: kw= ',' this_identifier_2= ruleidentifier
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleidentifier_list1022); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleidentifier_in_ruleidentifier_list1044);
            	    this_identifier_2=ruleidentifier();

            	    state._fsp--;


            	    		current.merge(this_identifier_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:425:1: entryRuleinteger_number returns [String current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final String entryRuleinteger_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinteger_number = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:426:2: (iv_ruleinteger_number= ruleinteger_number EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:427:2: iv_ruleinteger_number= ruleinteger_number EOF
            {
             newCompositeNode(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number1092);
            iv_ruleinteger_number=ruleinteger_number();

            state._fsp--;

             current =iv_ruleinteger_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number1103); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:434:1: ruleinteger_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_digit_sequence_0= ruledigit_sequence ;
    public final AntlrDatatypeRuleToken ruleinteger_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_sequence_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:437:28: (this_digit_sequence_0= ruledigit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:439:5: this_digit_sequence_0= ruledigit_sequence
            {
             
                    newCompositeNode(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number1149);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:459:1: entryRuleunsigned_digit_sequence returns [String current=null] : iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF ;
    public final String entryRuleunsigned_digit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_digit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:460:2: (iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:461:2: iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_digit_sequenceRule()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence1196);
            iv_ruleunsigned_digit_sequence=ruleunsigned_digit_sequence();

            state._fsp--;

             current =iv_ruleunsigned_digit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_digit_sequence1207); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:468:1: ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_digit_0= ruledigit (this_digit_1= ruledigit )* ) ;
    public final AntlrDatatypeRuleToken ruleunsigned_digit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_0 = null;

        AntlrDatatypeRuleToken this_digit_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:471:28: ( (this_digit_0= ruledigit (this_digit_1= ruledigit )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:1: (this_digit_0= ruledigit (this_digit_1= ruledigit )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:1: (this_digit_0= ruledigit (this_digit_1= ruledigit )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:473:5: this_digit_0= ruledigit (this_digit_1= ruledigit )*
            {
             
                    newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1254);
            this_digit_0=ruledigit();

            state._fsp--;


            		current.merge(this_digit_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:483:1: (this_digit_1= ruledigit )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=74 && LA4_0<=83)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:484:5: this_digit_1= ruledigit
            	    {
            	     
            	            newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1282);
            	    this_digit_1=ruledigit();

            	    state._fsp--;


            	    		current.merge(this_digit_1);
            	        
            	     
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
    // $ANTLR end "ruleunsigned_digit_sequence"


    // $ANTLR start "entryRuledigit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:502:1: entryRuledigit_sequence returns [String current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final String entryRuledigit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:503:2: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:504:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
             newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence1330);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;

             current =iv_ruledigit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence1341); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:511:1: ruledigit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) ;
    public final AntlrDatatypeRuleToken ruledigit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_sign_0 = null;

        AntlrDatatypeRuleToken this_unsigned_digit_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:514:28: ( ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:515:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:515:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:515:2: (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:515:2: (this_sign_0= rulesign )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=20 && LA5_0<=21)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:516:5: this_sign_0= rulesign
                    {
                     
                            newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesign_in_ruledigit_sequence1389);
                    this_sign_0=rulesign();

                    state._fsp--;


                    		current.merge(this_sign_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence1418);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:545:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:546:2: (iv_rulesign= rulesign EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:547:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign1464);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign1475); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:554:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:557:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:558:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:558:1: (kw= '+' | kw= '-' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:559:2: kw= '+'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_rulesign1513); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:566:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_rulesign1532); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:579:1: entryRuleletter returns [String current=null] : iv_ruleletter= ruleletter EOF ;
    public final String entryRuleletter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleletter = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:580:2: (iv_ruleletter= ruleletter EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:581:2: iv_ruleletter= ruleletter EOF
            {
             newCompositeNode(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_ruleletter_in_entryRuleletter1573);
            iv_ruleletter=ruleletter();

            state._fsp--;

             current =iv_ruleletter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletter1584); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:588:1: ruleletter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' ) ;
    public final AntlrDatatypeRuleToken ruleletter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:591:28: ( (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:592:1: (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:592:1: (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' )
            int alt7=52;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            case 28:
                {
                alt7=7;
                }
                break;
            case 29:
                {
                alt7=8;
                }
                break;
            case 30:
                {
                alt7=9;
                }
                break;
            case 31:
                {
                alt7=10;
                }
                break;
            case 32:
                {
                alt7=11;
                }
                break;
            case 33:
                {
                alt7=12;
                }
                break;
            case 34:
                {
                alt7=13;
                }
                break;
            case 35:
                {
                alt7=14;
                }
                break;
            case 36:
                {
                alt7=15;
                }
                break;
            case 37:
                {
                alt7=16;
                }
                break;
            case 38:
                {
                alt7=17;
                }
                break;
            case 39:
                {
                alt7=18;
                }
                break;
            case 40:
                {
                alt7=19;
                }
                break;
            case 41:
                {
                alt7=20;
                }
                break;
            case 42:
                {
                alt7=21;
                }
                break;
            case 43:
                {
                alt7=22;
                }
                break;
            case 44:
                {
                alt7=23;
                }
                break;
            case 45:
                {
                alt7=24;
                }
                break;
            case 46:
                {
                alt7=25;
                }
                break;
            case 47:
                {
                alt7=26;
                }
                break;
            case 48:
                {
                alt7=27;
                }
                break;
            case 49:
                {
                alt7=28;
                }
                break;
            case 50:
                {
                alt7=29;
                }
                break;
            case 51:
                {
                alt7=30;
                }
                break;
            case 52:
                {
                alt7=31;
                }
                break;
            case 53:
                {
                alt7=32;
                }
                break;
            case 54:
                {
                alt7=33;
                }
                break;
            case 55:
                {
                alt7=34;
                }
                break;
            case 56:
                {
                alt7=35;
                }
                break;
            case 57:
                {
                alt7=36;
                }
                break;
            case 58:
                {
                alt7=37;
                }
                break;
            case 59:
                {
                alt7=38;
                }
                break;
            case 60:
                {
                alt7=39;
                }
                break;
            case 61:
                {
                alt7=40;
                }
                break;
            case 62:
                {
                alt7=41;
                }
                break;
            case 63:
                {
                alt7=42;
                }
                break;
            case 64:
                {
                alt7=43;
                }
                break;
            case 65:
                {
                alt7=44;
                }
                break;
            case 66:
                {
                alt7=45;
                }
                break;
            case 67:
                {
                alt7=46;
                }
                break;
            case 68:
                {
                alt7=47;
                }
                break;
            case 69:
                {
                alt7=48;
                }
                break;
            case 70:
                {
                alt7=49;
                }
                break;
            case 71:
                {
                alt7=50;
                }
                break;
            case 72:
                {
                alt7=51;
                }
                break;
            case 73:
                {
                alt7=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:593:2: kw= 'A'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleletter1622); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:600:2: kw= 'B'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleletter1641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:607:2: kw= 'C'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleletter1660); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:614:2: kw= 'D'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleletter1679); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:621:2: kw= 'E'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleletter1698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:628:2: kw= 'F'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleletter1717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:635:2: kw= 'G'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleletter1736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:642:2: kw= 'H'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleletter1755); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:649:2: kw= 'I'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleletter1774); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:656:2: kw= 'J'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleletter1793); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:663:2: kw= 'K'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleletter1812); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:670:2: kw= 'L'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleletter1831); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:677:2: kw= 'M'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleletter1850); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:684:2: kw= 'N'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleletter1869); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:691:2: kw= 'O'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleletter1888); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:698:2: kw= 'P'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleletter1907); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:705:2: kw= 'Q'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleletter1926); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:712:2: kw= 'R'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleletter1945); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:719:2: kw= 'S'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleletter1964); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:726:2: kw= 'T'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleletter1983); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:733:2: kw= 'U'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleletter2002); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:740:2: kw= 'V'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleletter2021); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:747:2: kw= 'W'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleletter2040); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:754:2: kw= 'X'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleletter2059); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:761:2: kw= 'Y'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleletter2078); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:768:2: kw= 'Z'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleletter2097); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getZKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:775:2: kw= 'a'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleletter2116); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:782:2: kw= 'b'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleletter2135); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:789:2: kw= 'c'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleletter2154); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:796:2: kw= 'd'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleletter2173); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:803:2: kw= 'e'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleletter2192); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:810:2: kw= 'f'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleletter2211); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:2: kw= 'g'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleletter2230); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:824:2: kw= 'h'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleletter2249); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:831:2: kw= 'i'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleletter2268); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:838:2: kw= 'j'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleletter2287); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:845:2: kw= 'k'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleletter2306); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:852:2: kw= 'l'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleletter2325); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:859:2: kw= 'm'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleletter2344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:866:2: kw= 'n'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleletter2363); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:873:2: kw= 'o'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleletter2382); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:880:2: kw= 'p'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleletter2401); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_41()); 
                        

                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:887:2: kw= 'q'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleletter2420); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_42()); 
                        

                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:894:2: kw= 'r'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleletter2439); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_43()); 
                        

                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:901:2: kw= 's'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleletter2458); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_44()); 
                        

                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:908:2: kw= 't'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleletter2477); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_45()); 
                        

                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:915:2: kw= 'u'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleletter2496); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_46()); 
                        

                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:922:2: kw= 'v'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleletter2515); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_47()); 
                        

                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:929:2: kw= 'w'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleletter2534); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_48()); 
                        

                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:936:2: kw= 'x'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleletter2553); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_49()); 
                        

                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:943:2: kw= 'y'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleletter2572); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_50()); 
                        

                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:950:2: kw= 'z'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleletter2591); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:963:1: entryRuledigit returns [String current=null] : iv_ruledigit= ruledigit EOF ;
    public final String entryRuledigit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:964:2: (iv_ruledigit= ruledigit EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:965:2: iv_ruledigit= ruledigit EOF
            {
             newCompositeNode(grammarAccess.getDigitRule()); 
            pushFollow(FOLLOW_ruledigit_in_entryRuledigit2632);
            iv_ruledigit=ruledigit();

            state._fsp--;

             current =iv_ruledigit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit2643); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:972:1: ruledigit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) ;
    public final AntlrDatatypeRuleToken ruledigit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:975:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:976:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:976:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt8=1;
                }
                break;
            case 75:
                {
                alt8=2;
                }
                break;
            case 76:
                {
                alt8=3;
                }
                break;
            case 77:
                {
                alt8=4;
                }
                break;
            case 78:
                {
                alt8=5;
                }
                break;
            case 79:
                {
                alt8=6;
                }
                break;
            case 80:
                {
                alt8=7;
                }
                break;
            case 81:
                {
                alt8=8;
                }
                break;
            case 82:
                {
                alt8=9;
                }
                break;
            case 83:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:977:2: kw= '0'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruledigit2681); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:984:2: kw= '1'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruledigit2700); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:991:2: kw= '2'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruledigit2719); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:998:2: kw= '3'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruledigit2738); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1005:2: kw= '4'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruledigit2757); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1012:2: kw= '5'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruledigit2776); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1019:2: kw= '6'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruledigit2795); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1026:2: kw= '7'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruledigit2814); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1033:2: kw= '8'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruledigit2833); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1040:2: kw= '9'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruledigit2852); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGreeting213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGreeting247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleprogram_heading335 = new BitSet(new long[]{0xFFFFFFFFFFC00000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleprogram_heading357 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleprogram_heading375 = new BitSet(new long[]{0xFFFFFFFFFFC00000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading397 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleprogram_heading415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleprogram_heading428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock527 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruledeclaration_part648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulestatement_part736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_entryRuleidentifier776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_ruleidentifier834 = new BitSet(new long[]{0xFFFFFFFFFFC00002L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_ruleletter_in_ruleidentifier862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_ruleidentifier895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleidentifier_list1003 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleidentifier_list1022 = new BitSet(new long[]{0xFFFFFFFFFFC00000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleidentifier_list1044 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence1196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_digit_sequence1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1254 = new BitSet(new long[]{0x0000000000000002L,0x00000000000FFC00L});
    public static final BitSet FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1282 = new BitSet(new long[]{0x0000000000000002L,0x00000000000FFC00L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruledigit_sequence1389 = new BitSet(new long[]{0x0000000000000000L,0x00000000000FFC00L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulesign1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulesign1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_entryRuleletter1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletter1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleletter1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleletter1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleletter1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleletter1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleletter1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleletter1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleletter1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleletter1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleletter1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleletter1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleletter1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleletter1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleletter1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleletter1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleletter1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleletter1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleletter1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleletter1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleletter1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleletter1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleletter2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleletter2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleletter2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleletter2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleletter2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleletter2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleletter2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleletter2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleletter2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleletter2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleletter2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleletter2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleletter2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleletter2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleletter2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleletter2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleletter2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleletter2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleletter2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleletter2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleletter2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleletter2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleletter2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleletter2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleletter2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleletter2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleletter2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleletter2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleletter2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleletter2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleletter2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleletter2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_entryRuledigit2632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruledigit2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruledigit2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruledigit2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruledigit2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruledigit2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruledigit2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruledigit2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruledigit2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruledigit2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruledigit2852 = new BitSet(new long[]{0x0000000000000002L});

}