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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "'declaration_part'", "'statement_part'", "'simple_type'", "'structured_type'", "'pointer_type'", "'type_identifier'", "','", "'+'", "'-'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'"
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:76:1: ruleModel returns [EObject current=null] : ( (lv_programs_0_0= ruleprogram ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_programs_0_0 = null;


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

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:81:1: (lv_programs_0_0= ruleprogram )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:81:1: (lv_programs_0_0= ruleprogram )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:82:3: lv_programs_0_0= ruleprogram
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleprogram_in_ruleModel130);
            	    lv_programs_0_0=ruleprogram();

            	    state._fsp--;


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


    // $ANTLR start "entryRuleprogram"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:108:1: entryRuleprogram returns [String current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final String entryRuleprogram() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:109:2: (iv_ruleprogram= ruleprogram EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:110:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram169);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram180); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:117:1: ruleprogram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleprogram() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_program_heading_0 = null;

        AntlrDatatypeRuleToken this_block_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:120:28: ( (this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:121:1: (this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:121:1: (this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:122:5: this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.'
            {
             
                    newCompositeNode(grammarAccess.getProgramAccess().getProgram_headingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleprogram_heading_in_ruleprogram227);
            this_program_heading_0=ruleprogram_heading();

            state._fsp--;


            		current.merge(this_program_heading_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleblock_in_ruleprogram254);
            this_block_1=ruleblock();

            state._fsp--;


            		current.merge(this_block_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,11,FOLLOW_11_in_ruleprogram272); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
                

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
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:157:1: entryRuleprogram_heading returns [String current=null] : iv_ruleprogram_heading= ruleprogram_heading EOF ;
    public final String entryRuleprogram_heading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram_heading = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:158:2: (iv_ruleprogram_heading= ruleprogram_heading EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:159:2: iv_ruleprogram_heading= ruleprogram_heading EOF
            {
             newCompositeNode(grammarAccess.getProgram_headingRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading313);
            iv_ruleprogram_heading=ruleprogram_heading();

            state._fsp--;

             current =iv_ruleprogram_heading.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading324); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:166:1: ruleprogram_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleprogram_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_1 = null;

        AntlrDatatypeRuleToken this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:169:28: ( (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:170:1: (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:170:1: (kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:171:2: kw= 'program' this_identifier_1= ruleidentifier kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' kw= ';'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleprogram_heading362); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifierParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_ruleprogram_heading384);
            this_identifier_1=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleprogram_heading402); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading424);
            this_identifier_list_3=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleprogram_heading442); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_4()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleprogram_heading455); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:224:1: entryRuleblock returns [String current=null] : iv_ruleblock= ruleblock EOF ;
    public final String entryRuleblock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblock = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:225:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:226:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock496);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock507); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:233:1: ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) ;
    public final AntlrDatatypeRuleToken ruleblock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_statement_part_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:236:28: ( (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:237:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:237:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:238:5: this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part
            {
             
                    newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledeclaration_part_in_ruleblock554);
            this_declaration_part_0=ruledeclaration_part();

            state._fsp--;


            		current.merge(this_declaration_part_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock581);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:267:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:268:2: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:269:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part627);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part638); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:276:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'declaration_part' ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:279:28: (kw= 'declaration_part' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:281:2: kw= 'declaration_part'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruledeclaration_part675); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:294:1: entryRulestatement_part returns [String current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final String entryRulestatement_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:295:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:296:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part715);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part726); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:303:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'statement_part' ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:306:28: (kw= 'statement_part' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:308:2: kw= 'statement_part'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_rulestatement_part763); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:333:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:334:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:335:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype815);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype826); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:342:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:345:28: ( (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:346:1: (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:346:1: (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:347:2: kw= 'simple_type'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruletype864); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getSimple_typeKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:354:2: kw= 'structured_type'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruletype883); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStructured_typeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:361:2: kw= 'pointer_type'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruletype902); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getPointer_typeKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:368:2: kw= 'type_identifier'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruletype921); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:383:1: entryRuleidentifier returns [String current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final String entryRuleidentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:384:2: (iv_ruleidentifier= ruleidentifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:385:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleidentifier_in_entryRuleidentifier964);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier975); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:392:1: ruleidentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_letter_0= ruleletter this_identifier2_1= ruleidentifier2 ) ;
    public final AntlrDatatypeRuleToken ruleidentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_letter_0 = null;

        AntlrDatatypeRuleToken this_identifier2_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:395:28: ( (this_letter_0= ruleletter this_identifier2_1= ruleidentifier2 ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:396:1: (this_letter_0= ruleletter this_identifier2_1= ruleidentifier2 )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:396:1: (this_letter_0= ruleletter this_identifier2_1= ruleidentifier2 )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:397:5: this_letter_0= ruleletter this_identifier2_1= ruleidentifier2
            {
             
                    newCompositeNode(grammarAccess.getIdentifierAccess().getLetterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleletter_in_ruleidentifier1022);
            this_letter_0=ruleletter();

            state._fsp--;


            		current.merge(this_letter_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getIdentifierAccess().getIdentifier2ParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier2_in_ruleidentifier1049);
            this_identifier2_1=ruleidentifier2();

            state._fsp--;


            		current.merge(this_identifier2_1);
                
             
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
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleidentifier2"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:426:1: entryRuleidentifier2 returns [String current=null] : iv_ruleidentifier2= ruleidentifier2 EOF ;
    public final String entryRuleidentifier2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier2 = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:427:2: (iv_ruleidentifier2= ruleidentifier2 EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:428:2: iv_ruleidentifier2= ruleidentifier2 EOF
            {
             newCompositeNode(grammarAccess.getIdentifier2Rule()); 
            pushFollow(FOLLOW_ruleidentifier2_in_entryRuleidentifier21095);
            iv_ruleidentifier2=ruleidentifier2();

            state._fsp--;

             current =iv_ruleidentifier2.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier21106); 

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
    // $ANTLR end "entryRuleidentifier2"


    // $ANTLR start "ruleidentifier2"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:435:1: ruleidentifier2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_letter_0= ruleletter | this_digit_1= ruledigit )* ;
    public final AntlrDatatypeRuleToken ruleidentifier2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_letter_0 = null;

        AntlrDatatypeRuleToken this_digit_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:438:28: ( (this_letter_0= ruleletter | this_digit_1= ruledigit )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:439:1: (this_letter_0= ruleletter | this_digit_1= ruledigit )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:439:1: (this_letter_0= ruleletter | this_digit_1= ruledigit )*
            loop3:
            do {
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
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:440:5: this_letter_0= ruleletter
            	    {
            	     
            	            newCompositeNode(grammarAccess.getIdentifier2Access().getLetterParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleletter_in_ruleidentifier21153);
            	    this_letter_0=ruleletter();

            	    state._fsp--;


            	    		current.merge(this_letter_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:452:5: this_digit_1= ruledigit
            	    {
            	     
            	            newCompositeNode(grammarAccess.getIdentifier2Access().getDigitParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruledigit_in_ruleidentifier21186);
            	    this_digit_1=ruledigit();

            	    state._fsp--;


            	    		current.merge(this_digit_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleidentifier2"


    // $ANTLR start "entryRulefield_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:470:1: entryRulefield_identifier returns [String current=null] : iv_rulefield_identifier= rulefield_identifier EOF ;
    public final String entryRulefield_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:471:2: (iv_rulefield_identifier= rulefield_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:2: iv_rulefield_identifier= rulefield_identifier EOF
            {
             newCompositeNode(grammarAccess.getField_identifierRule()); 
            pushFollow(FOLLOW_rulefield_identifier_in_entryRulefield_identifier1233);
            iv_rulefield_identifier=rulefield_identifier();

            state._fsp--;

             current =iv_rulefield_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_identifier1244); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:479:1: rulefield_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken rulefield_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:482:28: (this_identifier_0= ruleidentifier )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:484:5: this_identifier_0= ruleidentifier
            {
             
                    newCompositeNode(grammarAccess.getField_identifierAccess().getIdentifierParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_rulefield_identifier1290);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:504:1: entryRulevariable_identifier returns [String current=null] : iv_rulevariable_identifier= rulevariable_identifier EOF ;
    public final String entryRulevariable_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:505:2: (iv_rulevariable_identifier= rulevariable_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:506:2: iv_rulevariable_identifier= rulevariable_identifier EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier1337);
            iv_rulevariable_identifier=rulevariable_identifier();

            state._fsp--;

             current =iv_rulevariable_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier1348); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:513:1: rulevariable_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken rulevariable_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:516:28: (this_identifier_0= ruleidentifier )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:518:5: this_identifier_0= ruleidentifier
            {
             
                    newCompositeNode(grammarAccess.getVariable_identifierAccess().getIdentifierParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_rulevariable_identifier1394);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:544:1: entryRuleidentifier_list returns [String current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final String entryRuleidentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:545:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:546:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list1447);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list1458); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:553:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_identifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:556:28: ( (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:557:1: (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:557:1: (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:558:5: this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )*
            {
             
                    newCompositeNode(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_in_ruleidentifier_list1505);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:568:1: (kw= ',' this_identifier_2= ruleidentifier )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:569:2: kw= ',' this_identifier_2= ruleidentifier
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleidentifier_list1524); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getIdentifier_listAccess().getIdentifierParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleidentifier_in_ruleidentifier_list1546);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:593:1: entryRuleinteger_number returns [String current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final String entryRuleinteger_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinteger_number = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:594:2: (iv_ruleinteger_number= ruleinteger_number EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:595:2: iv_ruleinteger_number= ruleinteger_number EOF
            {
             newCompositeNode(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number1594);
            iv_ruleinteger_number=ruleinteger_number();

            state._fsp--;

             current =iv_ruleinteger_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number1605); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:602:1: ruleinteger_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_digit_sequence_0= ruledigit_sequence ;
    public final AntlrDatatypeRuleToken ruleinteger_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_sequence_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:605:28: (this_digit_sequence_0= ruledigit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:607:5: this_digit_sequence_0= ruledigit_sequence
            {
             
                    newCompositeNode(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number1651);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:627:1: entryRuleunsigned_digit_sequence returns [String current=null] : iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF ;
    public final String entryRuleunsigned_digit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_digit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:628:2: (iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:629:2: iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_digit_sequenceRule()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence1698);
            iv_ruleunsigned_digit_sequence=ruleunsigned_digit_sequence();

            state._fsp--;

             current =iv_ruleunsigned_digit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_digit_sequence1709); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:636:1: ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_digit_0= ruledigit (this_digit_1= ruledigit )* ) ;
    public final AntlrDatatypeRuleToken ruleunsigned_digit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_0 = null;

        AntlrDatatypeRuleToken this_digit_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:639:28: ( (this_digit_0= ruledigit (this_digit_1= ruledigit )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:640:1: (this_digit_0= ruledigit (this_digit_1= ruledigit )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:640:1: (this_digit_0= ruledigit (this_digit_1= ruledigit )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:641:5: this_digit_0= ruledigit (this_digit_1= ruledigit )*
            {
             
                    newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1756);
            this_digit_0=ruledigit();

            state._fsp--;


            		current.merge(this_digit_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:651:1: (this_digit_1= ruledigit )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=77 && LA5_0<=86)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:652:5: this_digit_1= ruledigit
            	    {
            	     
            	            newCompositeNode(grammarAccess.getUnsigned_digit_sequenceAccess().getDigitParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1784);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:670:1: entryRuledigit_sequence returns [String current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final String entryRuledigit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:671:2: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:672:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
             newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence1832);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;

             current =iv_ruledigit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence1843); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:679:1: ruledigit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) ;
    public final AntlrDatatypeRuleToken ruledigit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_sign_0 = null;

        AntlrDatatypeRuleToken this_unsigned_digit_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:682:28: ( ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:683:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:683:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:683:2: (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:683:2: (this_sign_0= rulesign )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=23 && LA6_0<=24)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:684:5: this_sign_0= rulesign
                    {
                     
                            newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesign_in_ruledigit_sequence1891);
                    this_sign_0=rulesign();

                    state._fsp--;


                    		current.merge(this_sign_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence1920);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:713:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:714:2: (iv_rulesign= rulesign EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:715:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign1966);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign1977); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:722:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:725:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:726:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:726:1: (kw= '+' | kw= '-' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:727:2: kw= '+'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulesign2015); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:734:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulesign2034); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:747:1: entryRuleletter returns [String current=null] : iv_ruleletter= ruleletter EOF ;
    public final String entryRuleletter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleletter = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:748:2: (iv_ruleletter= ruleletter EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:749:2: iv_ruleletter= ruleletter EOF
            {
             newCompositeNode(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_ruleletter_in_entryRuleletter2075);
            iv_ruleletter=ruleletter();

            state._fsp--;

             current =iv_ruleletter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletter2086); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:756:1: ruleletter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' ) ;
    public final AntlrDatatypeRuleToken ruleletter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:759:28: ( (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:760:1: (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:760:1: (kw= 'A' | kw= 'B' | kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'H' | kw= 'I' | kw= 'J' | kw= 'K' | kw= 'L' | kw= 'M' | kw= 'N' | kw= 'O' | kw= 'P' | kw= 'Q' | kw= 'R' | kw= 'S' | kw= 'T' | kw= 'U' | kw= 'V' | kw= 'W' | kw= 'X' | kw= 'Y' | kw= 'Z' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' | kw= 'g' | kw= 'h' | kw= 'i' | kw= 'j' | kw= 'k' | kw= 'l' | kw= 'm' | kw= 'n' | kw= 'o' | kw= 'p' | kw= 'q' | kw= 'r' | kw= 's' | kw= 't' | kw= 'u' | kw= 'v' | kw= 'w' | kw= 'x' | kw= 'y' | kw= 'z' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:761:2: kw= 'A'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleletter2124); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:768:2: kw= 'B'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleletter2143); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:775:2: kw= 'C'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleletter2162); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:782:2: kw= 'D'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleletter2181); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:789:2: kw= 'E'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleletter2200); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:796:2: kw= 'F'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleletter2219); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:803:2: kw= 'G'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleletter2238); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:810:2: kw= 'H'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleletter2257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:2: kw= 'I'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleletter2276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:824:2: kw= 'J'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleletter2295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:831:2: kw= 'K'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleletter2314); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:838:2: kw= 'L'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleletter2333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:845:2: kw= 'M'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleletter2352); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:852:2: kw= 'N'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleletter2371); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:859:2: kw= 'O'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleletter2390); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:866:2: kw= 'P'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleletter2409); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:873:2: kw= 'Q'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleletter2428); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:880:2: kw= 'R'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleletter2447); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:887:2: kw= 'S'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleletter2466); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:894:2: kw= 'T'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleletter2485); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:901:2: kw= 'U'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleletter2504); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:908:2: kw= 'V'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleletter2523); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:915:2: kw= 'W'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleletter2542); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:922:2: kw= 'X'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleletter2561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:929:2: kw= 'Y'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleletter2580); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:936:2: kw= 'Z'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleletter2599); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getZKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:943:2: kw= 'a'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleletter2618); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getAKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:950:2: kw= 'b'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleletter2637); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getBKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:957:2: kw= 'c'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleletter2656); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getCKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:964:2: kw= 'd'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleletter2675); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getDKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:971:2: kw= 'e'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleletter2694); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getEKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:978:2: kw= 'f'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleletter2713); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getFKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:985:2: kw= 'g'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleletter2732); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getGKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:992:2: kw= 'h'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleletter2751); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getHKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:999:2: kw= 'i'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleletter2770); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getIKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1006:2: kw= 'j'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleletter2789); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getJKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1013:2: kw= 'k'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleletter2808); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getKKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1020:2: kw= 'l'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleletter2827); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getLKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1027:2: kw= 'm'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleletter2846); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getMKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1034:2: kw= 'n'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleletter2865); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getNKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1041:2: kw= 'o'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleletter2884); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getOKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1048:2: kw= 'p'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleletter2903); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getPKeyword_41()); 
                        

                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1055:2: kw= 'q'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleletter2922); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getQKeyword_42()); 
                        

                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1062:2: kw= 'r'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleletter2941); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getRKeyword_43()); 
                        

                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1069:2: kw= 's'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleletter2960); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getSKeyword_44()); 
                        

                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1076:2: kw= 't'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleletter2979); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getTKeyword_45()); 
                        

                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1083:2: kw= 'u'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleletter2998); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getUKeyword_46()); 
                        

                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1090:2: kw= 'v'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleletter3017); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getVKeyword_47()); 
                        

                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1097:2: kw= 'w'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleletter3036); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getWKeyword_48()); 
                        

                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1104:2: kw= 'x'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleletter3055); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getXKeyword_49()); 
                        

                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1111:2: kw= 'y'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleletter3074); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetterAccess().getYKeyword_50()); 
                        

                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1118:2: kw= 'z'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleletter3093); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1131:1: entryRuledigit returns [String current=null] : iv_ruledigit= ruledigit EOF ;
    public final String entryRuledigit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1132:2: (iv_ruledigit= ruledigit EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1133:2: iv_ruledigit= ruledigit EOF
            {
             newCompositeNode(grammarAccess.getDigitRule()); 
            pushFollow(FOLLOW_ruledigit_in_entryRuledigit3134);
            iv_ruledigit=ruledigit();

            state._fsp--;

             current =iv_ruledigit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit3145); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1140:1: ruledigit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) ;
    public final AntlrDatatypeRuleToken ruledigit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1143:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1144:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1144:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1145:2: kw= '0'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruledigit3183); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1152:2: kw= '1'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruledigit3202); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1159:2: kw= '2'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruledigit3221); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1166:2: kw= '3'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruledigit3240); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1173:2: kw= '4'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruledigit3259); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1180:2: kw= '5'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruledigit3278); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1187:2: kw= '6'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruledigit3297); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1194:2: kw= '7'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruledigit3316); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1201:2: kw= '8'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruledigit3335); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1208:2: kw= '9'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruledigit3354); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1221:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1222:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1223:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel3395);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel3406); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1230:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_integer_number_0= ruleinteger_number ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_integer_number_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1233:28: (this_integer_number_0= ruleinteger_number )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1235:5: this_integer_number_0= ruleinteger_number
            {
             
                    newCompositeNode(grammarAccess.getLabelAccess().getInteger_numberParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleinteger_number_in_rulelabel3452);
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
    public static final BitSet FOLLOW_ruleprogram_in_ruleModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_ruleprogram227 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleprogram272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleprogram_heading362 = new BitSet(new long[]{0xFFFFFFFFFE000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleprogram_heading384 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleprogram_heading402 = new BitSet(new long[]{0xFFFFFFFFFE000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading424 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleprogram_heading442 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleprogram_heading455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock554 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruledeclaration_part675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulestatement_part763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruletype864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruletype883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruletype902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruletype921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_entryRuleidentifier964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_ruleidentifier1022 = new BitSet(new long[]{0xFFFFFFFFFE000000L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_ruleidentifier2_in_ruleidentifier1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier2_in_entryRuleidentifier21095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier21106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_ruleidentifier21153 = new BitSet(new long[]{0xFFFFFFFFFE000002L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_ruledigit_in_ruleidentifier21186 = new BitSet(new long[]{0xFFFFFFFFFE000002L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_rulefield_identifier_in_entryRulefield_identifier1233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_identifier1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rulefield_identifier1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_rulevariable_identifier1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleidentifier_list1505 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleidentifier_list1524 = new BitSet(new long[]{0xFFFFFFFFFE000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleidentifier_in_ruleidentifier_list1546 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number1594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence1698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_digit_sequence1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1756 = new BitSet(new long[]{0xFFFFFFFFFE000002L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_ruledigit_in_ruleunsigned_digit_sequence1784 = new BitSet(new long[]{0xFFFFFFFFFE000002L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruledigit_sequence1891 = new BitSet(new long[]{0xFFFFFFFFFE000000L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign1966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulesign2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulesign2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletter_in_entryRuleletter2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletter2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleletter2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleletter2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleletter2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleletter2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleletter2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleletter2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleletter2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleletter2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleletter2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleletter2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleletter2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleletter2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleletter2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleletter2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleletter2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleletter2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleletter2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleletter2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleletter2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleletter2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleletter2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleletter2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleletter2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleletter2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleletter2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleletter2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleletter2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleletter2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleletter2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleletter2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleletter2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleletter2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleletter2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleletter2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleletter2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleletter2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleletter2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleletter2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleletter2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleletter2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleletter2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleletter2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleletter2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleletter2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleletter2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleletter2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleletter2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleletter3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleletter3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleletter3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleletter3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleletter3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_entryRuledigit3134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruledigit3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruledigit3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruledigit3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruledigit3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruledigit3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruledigit3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruledigit3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruledigit3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruledigit3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruledigit3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel3395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rulelabel3452 = new BitSet(new long[]{0x0000000000000002L});

}