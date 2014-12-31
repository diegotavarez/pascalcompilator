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

        AntlrDatatypeRuleToken lv_greetings_0_0 = null;


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

                if ( ((LA1_0>=11 && LA1_0<=62)) ) {
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:106:1: entryRuleGreeting returns [String current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final String entryRuleGreeting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting167);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting178); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:115:1: ruleGreeting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken ruleGreeting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:118:28: (this_identifier_0= ruleidentifier )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:120:5: this_identifier_0= ruleidentifier
            {
             
                    newCompositeNode(grammarAccess.getGreetingAccess().getIdentifierParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_ruleGreeting224);
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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleinteger_number"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:140:1: entryRuleinteger_number returns [String current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final String entryRuleinteger_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinteger_number = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:141:2: (iv_ruleinteger_number= ruleinteger_number EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:142:2: iv_ruleinteger_number= ruleinteger_number EOF
            {
             newCompositeNode(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number271);
            iv_ruleinteger_number=ruleinteger_number();

            state._fsp--;

             current =iv_ruleinteger_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number282); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:149:1: ruleinteger_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_digit_sequence_0= ruledigit_sequence ;
    public final AntlrDatatypeRuleToken ruleinteger_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_sequence_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:152:28: (this_digit_sequence_0= ruledigit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:154:5: this_digit_sequence_0= ruledigit_sequence
            {
             
                    newCompositeNode(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number328);
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


    // $ANTLR start "entryRuleidentifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:172:1: entryRuleidentifier returns [String current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final String entryRuleidentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:173:2: (iv_ruleidentifier= ruleidentifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:174:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleidentifier_in_entryRuleidentifier373);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier384); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:181:1: ruleidentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? ) ;
    public final AntlrDatatypeRuleToken ruleidentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_letter_0 = null;

        AntlrDatatypeRuleToken this_letter_1 = null;

        AntlrDatatypeRuleToken this_digit_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:184:28: ( (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:185:1: (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:185:1: (this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:186:5: this_letter_0= ruleletter (this_letter_1= ruleletter | this_digit_2= ruledigit )?
            {
             
                    newCompositeNode(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleletter_in_ruleidentifier431);
            this_letter_0=ruleletter();

            state._fsp--;


            		current.merge(this_letter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:196:1: (this_letter_1= ruleletter | this_digit_2= ruledigit )?
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:197:5: this_letter_1= ruleletter
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleletter_in_ruleidentifier459);
                    this_letter_1=ruleletter();

                    state._fsp--;


                    		current.merge(this_letter_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:209:5: this_digit_2= ruledigit
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifierAccess().getDigitParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruledigit_in_ruleidentifier492);
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


    // $ANTLR start "entryRuleletter"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:227:1: entryRuleletter returns [String current=null] : iv_ruleletter= ruleletter EOF ;
    public final String entryRuleletter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleletter = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:228:2: (iv_ruleletter= ruleletter EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:229:2: iv_ruleletter= ruleletter EOF
            {
             newCompositeNode(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_ruleletter_in_entryRuleletter540);
            iv_ruleletter=ruleletter();

            state._fsp--;

             current =iv_ruleletter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletter551); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:236:1: ruleletter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' ) ;
    public final AntlrDatatypeRuleToken ruleletter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:239:28: ( (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:240:1: (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:240:1: (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:241:2: kw= 'A'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleletter589); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:248:2: kw= 'B'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleletter608); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:255:2: kw= 'C'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleletter627); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:262:2: kw= 'D'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleletter646); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:269:2: kw= 'E'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleletter665); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:276:2: kw= 'F'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleletter684); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:283:2: kw= 'G'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleletter703); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:290:2: kw= 'H'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleletter722); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:297:2: kw= 'I'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleletter741); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:304:2: kw= 'J'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleletter760); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:311:2: kw= 'K'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleletter779); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:318:2: kw= 'L'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleletter798); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:325:2: kw= 'M'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleletter817); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:332:2: kw= 'N'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleletter836); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:339:2: kw= 'O'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleletter855); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:346:2: kw= 'P'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleletter874); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:353:2: kw= 'Q'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleletter893); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:360:2: kw= 'R'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleletter912); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:367:2: kw= 'S'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleletter931); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:374:2: kw= 'T'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleletter950); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:381:2: kw= 'U'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleletter969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:388:2: kw= 'V'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleletter988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:395:2: kw= 'W'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleletter1007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:402:2: kw= 'X'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleletter1026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:409:2: kw= 'Y'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleletter1045); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:416:2: kw= 'Z'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleletter1064); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getZKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:423:2: kw= 'a'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleletter1083); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:430:2: kw= 'b'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleletter1102); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:437:2: kw= 'c'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleletter1121); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:444:2: kw= 'd'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleletter1140); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:451:2: kw= 'e'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleletter1159); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:458:2: kw= 'f'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleletter1178); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:465:2: kw= 'g'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleletter1197); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:2: kw= 'h'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleletter1216); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:479:2: kw= 'i'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleletter1235); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:486:2: kw= 'j'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleletter1254); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:493:2: kw= 'k'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleletter1273); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:500:2: kw= 'l'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleletter1292); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:507:2: kw= 'm'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleletter1311); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:514:2: kw= 'n'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleletter1330); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:521:2: kw= 'o'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleletter1349); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:528:2: kw= 'p'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleletter1368); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_41()); 
                        

                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:535:2: kw= 'q'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleletter1387); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_42()); 
                        

                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:542:2: kw= 'r'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleletter1406); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_43()); 
                        

                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:549:2: kw= 's'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleletter1425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_44()); 
                        

                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:556:2: kw= 't'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleletter1444); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_45()); 
                        

                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:563:2: kw= 'u'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleletter1463); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_46()); 
                        

                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:570:2: kw= 'v'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleletter1482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_47()); 
                        

                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:577:2: kw= 'w'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleletter1501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_48()); 
                        

                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:584:2: kw= 'x'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleletter1520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_49()); 
                        

                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:591:2: kw= 'y'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleletter1539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_50()); 
                        

                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:598:2: kw= 'z'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleletter1558); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:611:1: entryRuledigit returns [String current=null] : iv_ruledigit= ruledigit EOF ;
    public final String entryRuledigit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:612:2: (iv_ruledigit= ruledigit EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:613:2: iv_ruledigit= ruledigit EOF
            {
             newCompositeNode(grammarAccess.getDigitRule()); 
            pushFollow(FOLLOW_ruledigit_in_entryRuledigit1599);
            iv_ruledigit=ruledigit();

            state._fsp--;

             current =iv_ruledigit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit1610); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:620:1: ruledigit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) ;
    public final AntlrDatatypeRuleToken ruledigit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:623:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:624:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:624:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:625:2: kw= '0'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruledigit1648); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:632:2: kw= '1'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruledigit1667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:639:2: kw= '2'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruledigit1686); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:646:2: kw= '3'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruledigit1705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:653:2: kw= '4'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruledigit1724); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:660:2: kw= '5'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruledigit1743); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:667:2: kw= '6'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruledigit1762); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:674:2: kw= '7'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruledigit1781); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:681:2: kw= '8'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruledigit1800); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:688:2: kw= '9'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruledigit1819); 

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


    // $ANTLR start "entryRuledigit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:701:1: entryRuledigit_sequence returns [String current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final String entryRuledigit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:702:2: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:703:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
             newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence1860);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;

             current =iv_ruledigit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence1871); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:710:1: ruledigit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) ;
    public final AntlrDatatypeRuleToken ruledigit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_sign_0 = null;

        AntlrDatatypeRuleToken this_unsigned_digit_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:713:28: ( ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:714:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:714:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:714:2: (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:714:2: (this_sign_0= rulesign )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=73 && LA5_0<=74)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:715:5: this_sign_0= rulesign
                    {
                     
                            newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesign_in_ruledigit_sequence1919);
                    this_sign_0=rulesign();

                    state._fsp--;


                    		current.merge(this_sign_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence1948);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:744:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:745:2: (iv_rulesign= rulesign EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:746:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign1994);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign2005); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:753:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:756:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:757:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:757:1: (kw= '+' | kw= '-' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==73) ) {
                alt6=1;
            }
            else if ( (LA6_0==74) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:758:2: kw= '+'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_rulesign2043); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:765:2: kw= '-'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_rulesign2062); 

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


    // $ANTLR start "entryRuleunsigned_digit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:778:1: entryRuleunsigned_digit_sequence returns [String current=null] : iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF ;
    public final String entryRuleunsigned_digit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_digit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:779:2: (iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:780:2: iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_digit_sequenceRule()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence2103);
            iv_ruleunsigned_digit_sequence=ruleunsigned_digit_sequence();

            state._fsp--;

             current =iv_ruleunsigned_digit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_digit_sequence2114); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:787:1: ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_digit_0= ruledigit (this_digit_1= ruledigit )* ) ;
    public final AntlrDatatypeRuleToken ruleunsigned_digit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_0 = null;

        AntlrDatatypeRuleToken this_digit_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:790:28: ( (this_digit_0= ruledigit (this_digit_1= ruledigit )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:791:1: (this_digit_0= ruledigit (this_digit_1= ruledigit )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:791:1: (this_digit_0= ruledigit (this_digit_1= ruledigit )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:792:5: this_digit_0= ruledigit (this_digit_1= ruledigit )*
            {
             
                    newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledigit_in_ruleunsigned_digit_sequence2161);
            this_digit_0=ruledigit();

            state._fsp--;


            		current.merge(this_digit_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:802:1: (this_digit_1= ruledigit )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=63 && LA7_0<=72)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:803:5: this_digit_1= ruledigit
            	    {
            	     
            	            newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruledigit_in_ruleunsigned_digit_sequence2189);
            	    this_digit_1=ruledigit();

            	    state._fsp--;


            	    		current.merge(this_digit_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\67\uffff";
    static final String DFA2_eofS =
        "\1\66\66\uffff";
    static final String DFA2_minS =
        "\1\13\66\uffff";
    static final String DFA2_maxS =
        "\1\110\66\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\64\1\1\2\1\3";
    static final String DFA2_specialS =
        "\67\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
            "\1\62\1\63\1\64\12\65",
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
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "196:1: (this_letter_1= ruleletter | this_digit_2= ruledigit )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x7FFFFFFFFFFFF802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleGreeting224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_entryRuleidentifier373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_ruleidentifier431 = new BitSet(new long[]{0xFFFFFFFFFFFFF800L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleletter_in_ruleidentifier459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_ruleidentifier492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_entryRuleletter540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletter551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleletter589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleletter608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleletter627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleletter646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleletter665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleletter684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleletter703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleletter722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleletter741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleletter760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleletter779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleletter798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleletter817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleletter836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleletter855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleletter874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleletter893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleletter912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleletter931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleletter950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleletter969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleletter988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleletter1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleletter1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleletter1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleletter1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleletter1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleletter1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleletter1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleletter1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleletter1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleletter1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleletter1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleletter1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleletter1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleletter1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleletter1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleletter1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleletter1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleletter1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleletter1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleletter1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleletter1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleletter1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleletter1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleletter1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleletter1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleletter1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleletter1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleletter1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleletter1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleletter1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_entryRuledigit1599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruledigit1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruledigit1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruledigit1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruledigit1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruledigit1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruledigit1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruledigit1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruledigit1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruledigit1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruledigit1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruledigit_sequence1919 = new BitSet(new long[]{0x8000000000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign1994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulesign2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulesign2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_digit_sequence2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_ruleunsigned_digit_sequence2161 = new BitSet(new long[]{0x8000000000000002L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruledigit_in_ruleunsigned_digit_sequence2189 = new BitSet(new long[]{0x8000000000000002L,0x00000000000001FFL});

}