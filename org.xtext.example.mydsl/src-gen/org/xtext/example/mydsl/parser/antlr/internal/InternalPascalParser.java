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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_DIGIT", "RULE_STRING", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "'label'", "','", "'const'", "'='", "'type'", "'var'", "':'", "'procedure_declaration'", "'function_declaration'", "'begin'", "'end'", "'statement'", "'simple_type'", "'structured_type'", "'pointer_type'", "'type_identifier'", "'E'", "'e'", "'+'", "'-'"
    };
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=8;
    public static final int RULE_WS=12;
    public static final int RULE_DIGIT=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_LETTER=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==15) ) {
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
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleprogram272); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:166:1: ruleprogram_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleprogram_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:169:28: ( (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:170:1: (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:170:1: (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:171:2: kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleprogram_heading362); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading377); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getProgram_headingAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:183:1: (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:184:2: kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleprogram_heading396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading418);
                    this_identifier_list_3=ruleidentifier_list();

                    state._fsp--;


                    		current.merge(this_identifier_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleprogram_heading436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_2_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,18,FOLLOW_18_in_ruleprogram_heading451); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getSemicolonKeyword_3()); 
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:220:1: entryRuleblock returns [String current=null] : iv_ruleblock= ruleblock EOF ;
    public final String entryRuleblock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblock = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:221:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:222:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock492);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock503); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:229:1: ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) ;
    public final AntlrDatatypeRuleToken ruleblock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_statement_part_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:232:28: ( (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:233:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:233:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:234:5: this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part
            {
             
                    newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledeclaration_part_in_ruleblock550);
            this_declaration_part_0=ruledeclaration_part();

            state._fsp--;


            		current.merge(this_declaration_part_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock577);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:263:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:264:2: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:265:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part623);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part634); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:272:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part ) ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_label_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_constant_definition_part_1 = null;

        AntlrDatatypeRuleToken this_type_definition_part_2 = null;

        AntlrDatatypeRuleToken this_variable_declaration_part_3 = null;

        AntlrDatatypeRuleToken this_procedure_and_function_declaration_part_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:275:28: ( ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:276:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:276:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:276:2: (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:276:2: (this_label_declaration_part_0= rulelabel_declaration_part )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:277:5: this_label_declaration_part_0= rulelabel_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part682);
                    this_label_declaration_part_0=rulelabel_declaration_part();

                    state._fsp--;


                    		current.merge(this_label_declaration_part_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:287:3: (this_constant_definition_part_1= ruleconstant_definition_part )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:288:5: this_constant_definition_part_1= ruleconstant_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_definition_partParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part712);
                    this_constant_definition_part_1=ruleconstant_definition_part();

                    state._fsp--;


                    		current.merge(this_constant_definition_part_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:298:3: (this_type_definition_part_2= ruletype_definition_part )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:299:5: this_type_definition_part_2= ruletype_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_definition_partParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruletype_definition_part_in_ruledeclaration_part742);
                    this_type_definition_part_2=ruletype_definition_part();

                    state._fsp--;


                    		current.merge(this_type_definition_part_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:309:3: (this_variable_declaration_part_3= rulevariable_declaration_part )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:310:5: this_variable_declaration_part_3= rulevariable_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulevariable_declaration_part_in_ruledeclaration_part772);
                    this_variable_declaration_part_3=rulevariable_declaration_part();

                    state._fsp--;


                    		current.merge(this_variable_declaration_part_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_and_function_declaration_partParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_ruledeclaration_part801);
            this_procedure_and_function_declaration_part_4=ruleprocedure_and_function_declaration_part();

            state._fsp--;


            		current.merge(this_procedure_and_function_declaration_part_4);
                
             
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
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:339:1: entryRulelabel_declaration_part returns [String current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final String entryRulelabel_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:340:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:341:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part847);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part858); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:348:1: rulelabel_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulelabel_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_1 = null;

        AntlrDatatypeRuleToken this_label_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:351:28: ( (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:352:1: (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:352:1: (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:353:2: kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_rulelabel_declaration_part896); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part918);
            this_label_1=rulelabel();

            state._fsp--;


            		current.merge(this_label_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:369:1: (kw= ',' this_label_3= rulelabel )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:370:2: kw= ',' this_label_3= rulelabel
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_rulelabel_declaration_part937); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part959);
            	    this_label_3=rulelabel();

            	    state._fsp--;


            	    		current.merge(this_label_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            kw=(Token)match(input,18,FOLLOW_18_in_rulelabel_declaration_part979); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 
                

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
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:400:1: entryRuleconstant_definition_part returns [String current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final String entryRuleconstant_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:401:2: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:402:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part1020);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part1031); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:409:1: ruleconstant_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_definition_1 = null;

        AntlrDatatypeRuleToken this_constant_definition_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:412:28: ( (kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:413:1: (kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:413:1: (kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:414:2: kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )*
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleconstant_definition_part1069); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part1091);
            this_constant_definition_1=ruleconstant_definition();

            state._fsp--;


            		current.merge(this_constant_definition_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruleconstant_definition_part1109); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_2()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:436:1: (this_constant_definition_3= ruleconstant_definition kw= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_IDENTIFIER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:437:5: this_constant_definition_3= ruleconstant_definition kw= ';'
            	    {
            	     
            	            newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part1132);
            	    this_constant_definition_3=ruleconstant_definition();

            	    state._fsp--;


            	    		current.merge(this_constant_definition_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleconstant_definition_part1150); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_3_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:461:1: entryRuleconstant_definition returns [String current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final String entryRuleconstant_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:462:2: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:463:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition1193);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition1204); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:470:1: ruleconstant_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:473:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:474:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:474:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:474:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition1244); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getConstant_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,22,FOLLOW_22_in_ruleconstant_definition1262); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition1284);
            this_constant_2=ruleconstant();

            state._fsp--;


            		current.merge(this_constant_2);
                
             
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
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:506:1: entryRuletype_definition_part returns [String current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final String entryRuletype_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:507:2: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:508:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part1330);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part1341); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:515:1: ruletype_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken ruletype_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_definition_1 = null;

        AntlrDatatypeRuleToken this_type_definition_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:518:28: ( (kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:519:1: (kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:519:1: (kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:520:2: kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )*
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruletype_definition_part1379); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part1401);
            this_type_definition_1=ruletype_definition();

            state._fsp--;


            		current.merge(this_type_definition_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruletype_definition_part1419); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_2()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:542:1: (this_type_definition_3= ruletype_definition kw= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_IDENTIFIER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:543:5: this_type_definition_3= ruletype_definition kw= ';'
            	    {
            	     
            	            newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part1442);
            	    this_type_definition_3=ruletype_definition();

            	    state._fsp--;


            	    		current.merge(this_type_definition_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruletype_definition_part1460); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_3_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:567:1: entryRuletype_definition returns [String current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final String entryRuletype_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:568:2: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:569:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition1503);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition1514); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:576:1: ruletype_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruletype_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:579:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:580:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:580:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:580:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype_definition1554); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getType_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,22,FOLLOW_22_in_ruletype_definition1572); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getType_definitionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruletype_definition1594);
            this_type_2=ruletype();

            state._fsp--;


            		current.merge(this_type_2);
                
             
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
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRulevariable_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:612:1: entryRulevariable_declaration_part returns [String current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final String entryRulevariable_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:613:2: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:614:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part1640);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part1651); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:621:1: rulevariable_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken rulevariable_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_declaration_1 = null;

        AntlrDatatypeRuleToken this_variable_declaration_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:624:28: ( (kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:625:1: (kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:625:1: (kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:626:2: kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )*
            {
            kw=(Token)match(input,24,FOLLOW_24_in_rulevariable_declaration_part1689); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1711);
            this_variable_declaration_1=rulevariable_declaration();

            state._fsp--;


            		current.merge(this_variable_declaration_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,18,FOLLOW_18_in_rulevariable_declaration_part1729); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:648:1: (this_variable_declaration_3= rulevariable_declaration kw= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_IDENTIFIER) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:649:5: this_variable_declaration_3= rulevariable_declaration kw= ';'
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1752);
            	    this_variable_declaration_3=rulevariable_declaration();

            	    state._fsp--;


            	    		current.merge(this_variable_declaration_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,18,FOLLOW_18_in_rulevariable_declaration_part1770); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:673:1: entryRulevariable_declaration returns [String current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final String entryRulevariable_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:674:2: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:675:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
             newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration1813);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;

             current =iv_rulevariable_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration1824); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:682:1: rulevariable_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulevariable_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:685:28: ( (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:686:1: (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:686:1: (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:687:5: this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype
            {
             
                    newCompositeNode(grammarAccess.getVariable_declarationAccess().getIdentifier_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_declaration1871);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,25,FOLLOW_25_in_rulevariable_declaration1889); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulevariable_declaration1911);
            this_type_2=ruletype();

            state._fsp--;


            		current.merge(this_type_2);
                
             
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
    // $ANTLR end "rulevariable_declaration"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:722:1: entryRuleprocedure_and_function_declaration_part returns [String current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final String entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:723:2: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:724:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part1957);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part1968); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:731:1: ruleprocedure_and_function_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';' )* ;
    public final AntlrDatatypeRuleToken ruleprocedure_and_function_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:734:28: ( ( (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:735:1: ( (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:735:1: ( (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:735:2: (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';'
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:735:2: (kw= 'procedure_declaration' | kw= 'function_declaration' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==26) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==27) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:736:2: kw= 'procedure_declaration'
            	            {
            	            kw=(Token)match(input,26,FOLLOW_26_in_ruleprocedure_and_function_declaration_part2007); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_declarationKeyword_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:743:2: kw= 'function_declaration'
            	            {
            	            kw=(Token)match(input,27,FOLLOW_27_in_ruleprocedure_and_function_declaration_part2026); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getProcedure_and_function_declaration_partAccess().getFunction_declarationKeyword_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleprocedure_and_function_declaration_part2040); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:762:1: entryRulestatement_part returns [String current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final String entryRulestatement_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:763:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:764:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part2082);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part2093); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:771:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' ) ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:774:28: ( (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:775:1: (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:775:1: (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:776:2: kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_rulestatement_part2131); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part2153);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,29,FOLLOW_29_in_rulestatement_part2171); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
                

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
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:806:1: entryRulestatement_sequence returns [String current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final String entryRulestatement_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:807:2: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:808:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence2212);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence2223); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:815:1: rulestatement_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_statement_0= rulestatement (this_statement_1= rulestatement )* ) ;
    public final AntlrDatatypeRuleToken rulestatement_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_statement_0 = null;

        AntlrDatatypeRuleToken this_statement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:818:28: ( (this_statement_0= rulestatement (this_statement_1= rulestatement )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:819:1: (this_statement_0= rulestatement (this_statement_1= rulestatement )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:819:1: (this_statement_0= rulestatement (this_statement_1= rulestatement )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:820:5: this_statement_0= rulestatement (this_statement_1= rulestatement )*
            {
             
                    newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence2270);
            this_statement_0=rulestatement();

            state._fsp--;


            		current.merge(this_statement_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:830:1: (this_statement_1= rulestatement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:831:5: this_statement_1= rulestatement
            	    {
            	     
            	            newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence2298);
            	    this_statement_1=rulestatement();

            	    state._fsp--;


            	    		current.merge(this_statement_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:849:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:850:2: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:851:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement2346);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement2357); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:858:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'statement' kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:861:28: ( (kw= 'statement' kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:862:1: (kw= 'statement' kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:862:1: (kw= 'statement' kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:863:2: kw= 'statement' kw= ';'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_rulestatement2395); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatementAccess().getStatementKeyword_0()); 
                
            kw=(Token)match(input,18,FOLLOW_18_in_rulestatement2408); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_1()); 
                

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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:890:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:891:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:892:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype2457);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype2468); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:899:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:902:28: ( (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:903:1: (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:903:1: (kw= 'simple_type' | kw= 'structured_type' | kw= 'pointer_type' | kw= 'type_identifier' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            case 34:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:904:2: kw= 'simple_type'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruletype2506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getSimple_typeKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:911:2: kw= 'structured_type'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruletype2525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStructured_typeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:918:2: kw= 'pointer_type'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruletype2544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getPointer_typeKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:925:2: kw= 'type_identifier'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruletype2563); 

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


    // $ANTLR start "entryRulefield_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:942:1: entryRulefield_identifier returns [String current=null] : iv_rulefield_identifier= rulefield_identifier EOF ;
    public final String entryRulefield_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:943:2: (iv_rulefield_identifier= rulefield_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:944:2: iv_rulefield_identifier= rulefield_identifier EOF
            {
             newCompositeNode(grammarAccess.getField_identifierRule()); 
            pushFollow(FOLLOW_rulefield_identifier_in_entryRulefield_identifier2608);
            iv_rulefield_identifier=rulefield_identifier();

            state._fsp--;

             current =iv_rulefield_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_identifier2619); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:951:1: rulefield_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulefield_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:954:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:955:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefield_identifier2658); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getField_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
                

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


    // $ANTLR start "entryRuleconstant_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:970:1: entryRuleconstant_identifier returns [String current=null] : iv_ruleconstant_identifier= ruleconstant_identifier EOF ;
    public final String entryRuleconstant_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:971:2: (iv_ruleconstant_identifier= ruleconstant_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:972:2: iv_ruleconstant_identifier= ruleconstant_identifier EOF
            {
             newCompositeNode(grammarAccess.getConstant_identifierRule()); 
            pushFollow(FOLLOW_ruleconstant_identifier_in_entryRuleconstant_identifier2703);
            iv_ruleconstant_identifier=ruleconstant_identifier();

            state._fsp--;

             current =iv_ruleconstant_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_identifier2714); 

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
    // $ANTLR end "entryRuleconstant_identifier"


    // $ANTLR start "ruleconstant_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:979:1: ruleconstant_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleconstant_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:982:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:983:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant_identifier2753); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getConstant_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleconstant_identifier"


    // $ANTLR start "entryRulevariable_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:998:1: entryRulevariable_identifier returns [String current=null] : iv_rulevariable_identifier= rulevariable_identifier EOF ;
    public final String entryRulevariable_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:999:2: (iv_rulevariable_identifier= rulevariable_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1000:2: iv_rulevariable_identifier= rulevariable_identifier EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier2798);
            iv_rulevariable_identifier=rulevariable_identifier();

            state._fsp--;

             current =iv_rulevariable_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier2809); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1007:1: rulevariable_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulevariable_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1010:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1011:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier2848); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getVariable_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1034:1: entryRuleidentifier_list returns [String current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final String entryRuleidentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1035:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1036:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list2901);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list2912); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1043:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1046:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1047:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1047:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1047:6: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list2952); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1054:1: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1055:2: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleidentifier_list2971); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            	        
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list2986); 

            	    		current.merge(this_IDENTIFIER_2);
            	        
            	     
            	        newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1075:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1076:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1077:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber3034);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber3045); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1084:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_integer_number_0 = null;

        AntlrDatatypeRuleToken this_real_number_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1087:28: ( (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1088:1: (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1088:1: (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1089:5: this_integer_number_0= ruleinteger_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getInteger_numberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleinteger_number_in_rulenumber3092);
                    this_integer_number_0=ruleinteger_number();

                    state._fsp--;


                    		current.merge(this_integer_number_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1101:5: this_real_number_1= rulereal_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getReal_numberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulereal_number_in_rulenumber3125);
                    this_real_number_1=rulereal_number();

                    state._fsp--;


                    		current.merge(this_real_number_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleinteger_number"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1119:1: entryRuleinteger_number returns [String current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final String entryRuleinteger_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinteger_number = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1120:2: (iv_ruleinteger_number= ruleinteger_number EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1121:2: iv_ruleinteger_number= ruleinteger_number EOF
            {
             newCompositeNode(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number3171);
            iv_ruleinteger_number=ruleinteger_number();

            state._fsp--;

             current =iv_ruleinteger_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number3182); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1128:1: ruleinteger_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_digit_sequence_0= ruledigit_sequence ;
    public final AntlrDatatypeRuleToken ruleinteger_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_sequence_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1131:28: (this_digit_sequence_0= ruledigit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1133:5: this_digit_sequence_0= ruledigit_sequence
            {
             
                    newCompositeNode(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number3228);
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


    // $ANTLR start "entryRulereal_number"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1151:1: entryRulereal_number returns [String current=null] : iv_rulereal_number= rulereal_number EOF ;
    public final String entryRulereal_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulereal_number = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1152:2: (iv_rulereal_number= rulereal_number EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1153:2: iv_rulereal_number= rulereal_number EOF
            {
             newCompositeNode(grammarAccess.getReal_numberRule()); 
            pushFollow(FOLLOW_rulereal_number_in_entryRulereal_number3273);
            iv_rulereal_number=rulereal_number();

            state._fsp--;

             current =iv_rulereal_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereal_number3284); 

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
    // $ANTLR end "entryRulereal_number"


    // $ANTLR start "rulereal_number"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1160:1: rulereal_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) ) ;
    public final AntlrDatatypeRuleToken rulereal_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_digit_sequence_0 = null;

        AntlrDatatypeRuleToken this_unsigned_digit_sequence_2 = null;

        AntlrDatatypeRuleToken this_scale_factor_3 = null;

        AntlrDatatypeRuleToken this_digit_sequence_4 = null;

        AntlrDatatypeRuleToken this_scale_factor_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1163:28: ( ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1164:1: ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1164:1: ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1164:2: (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )? this_scale_factor_3= rulescale_factor )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1164:2: (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )? this_scale_factor_3= rulescale_factor )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1165:5: this_digit_sequence_0= ruledigit_sequence kw= '.' (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )? this_scale_factor_3= rulescale_factor
                    {
                     
                            newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequenceParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruledigit_sequence_in_rulereal_number3332);
                    this_digit_sequence_0=ruledigit_sequence();

                    state._fsp--;


                    		current.merge(this_digit_sequence_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,14,FOLLOW_14_in_rulereal_number3350); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReal_numberAccess().getFullStopKeyword_0_1()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1181:1: (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_DIGIT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1182:5: this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence
                            {
                             
                                    newCompositeNode(grammarAccess.getReal_numberAccess().getUnsigned_digit_sequenceParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_rulereal_number3373);
                            this_unsigned_digit_sequence_2=ruleunsigned_digit_sequence();

                            state._fsp--;


                            		current.merge(this_unsigned_digit_sequence_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getReal_numberAccess().getScale_factorParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_rulescale_factor_in_rulereal_number3402);
                    this_scale_factor_3=rulescale_factor();

                    state._fsp--;


                    		current.merge(this_scale_factor_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1204:6: (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1204:6: (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1205:5: this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor
                    {
                     
                            newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequenceParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruledigit_sequence_in_rulereal_number3437);
                    this_digit_sequence_4=ruledigit_sequence();

                    state._fsp--;


                    		current.merge(this_digit_sequence_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getReal_numberAccess().getScale_factorParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulescale_factor_in_rulereal_number3464);
                    this_scale_factor_5=rulescale_factor();

                    state._fsp--;


                    		current.merge(this_scale_factor_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


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
    // $ANTLR end "rulereal_number"


    // $ANTLR start "entryRulescale_factor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1234:1: entryRulescale_factor returns [String current=null] : iv_rulescale_factor= rulescale_factor EOF ;
    public final String entryRulescale_factor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulescale_factor = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1235:2: (iv_rulescale_factor= rulescale_factor EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1236:2: iv_rulescale_factor= rulescale_factor EOF
            {
             newCompositeNode(grammarAccess.getScale_factorRule()); 
            pushFollow(FOLLOW_rulescale_factor_in_entryRulescale_factor3511);
            iv_rulescale_factor=rulescale_factor();

            state._fsp--;

             current =iv_rulescale_factor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulescale_factor3522); 

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
    // $ANTLR end "entryRulescale_factor"


    // $ANTLR start "rulescale_factor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1243:1: rulescale_factor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence ) ;
    public final AntlrDatatypeRuleToken rulescale_factor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_digit_sequence_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1246:28: ( ( (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1247:1: ( (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1247:1: ( (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1247:2: (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1247:2: (kw= 'E' | kw= 'e' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1248:2: kw= 'E'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_rulescale_factor3561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScale_factorAccess().getEKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1255:2: kw= 'e'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulescale_factor3580); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScale_factorAccess().getEKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getScale_factorAccess().getDigit_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruledigit_sequence_in_rulescale_factor3603);
            this_digit_sequence_2=ruledigit_sequence();

            state._fsp--;


            		current.merge(this_digit_sequence_2);
                
             
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
    // $ANTLR end "rulescale_factor"


    // $ANTLR start "entryRuleunsigned_digit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1279:1: entryRuleunsigned_digit_sequence returns [String current=null] : iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF ;
    public final String entryRuleunsigned_digit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_digit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1280:2: (iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1281:2: iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_digit_sequenceRule()); 
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence3649);
            iv_ruleunsigned_digit_sequence=ruleunsigned_digit_sequence();

            state._fsp--;

             current =iv_ruleunsigned_digit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_digit_sequence3660); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1288:1: ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_0= RULE_DIGIT (this_DIGIT_1= RULE_DIGIT )* ) ;
    public final AntlrDatatypeRuleToken ruleunsigned_digit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;
        Token this_DIGIT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1291:28: ( (this_DIGIT_0= RULE_DIGIT (this_DIGIT_1= RULE_DIGIT )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1292:1: (this_DIGIT_0= RULE_DIGIT (this_DIGIT_1= RULE_DIGIT )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1292:1: (this_DIGIT_0= RULE_DIGIT (this_DIGIT_1= RULE_DIGIT )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1292:6: this_DIGIT_0= RULE_DIGIT (this_DIGIT_1= RULE_DIGIT )*
            {
            this_DIGIT_0=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleunsigned_digit_sequence3700); 

            		current.merge(this_DIGIT_0);
                
             
                newLeafNode(this_DIGIT_0, grammarAccess.getUnsigned_digit_sequenceAccess().getDIGITTerminalRuleCall_0()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1299:1: (this_DIGIT_1= RULE_DIGIT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_DIGIT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1299:6: this_DIGIT_1= RULE_DIGIT
            	    {
            	    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleunsigned_digit_sequence3721); 

            	    		current.merge(this_DIGIT_1);
            	        
            	     
            	        newLeafNode(this_DIGIT_1, grammarAccess.getUnsigned_digit_sequenceAccess().getDIGITTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1314:1: entryRuledigit_sequence returns [String current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final String entryRuledigit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1315:2: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1316:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
             newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence3769);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;

             current =iv_ruledigit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence3780); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1323:1: ruledigit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) ;
    public final AntlrDatatypeRuleToken ruledigit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_sign_0 = null;

        AntlrDatatypeRuleToken this_unsigned_digit_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1326:28: ( ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1327:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1327:1: ( (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1327:2: (this_sign_0= rulesign )? this_unsigned_digit_sequence_1= ruleunsigned_digit_sequence
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1327:2: (this_sign_0= rulesign )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=37 && LA21_0<=38)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1328:5: this_sign_0= rulesign
                    {
                     
                            newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesign_in_ruledigit_sequence3828);
                    this_sign_0=rulesign();

                    state._fsp--;


                    		current.merge(this_sign_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence3857);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1357:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1358:2: (iv_rulesign= rulesign EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1359:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign3903);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign3914); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1366:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1369:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1370:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1370:1: (kw= '+' | kw= '-' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            else if ( (LA22_0==38) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1371:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulesign3952); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1378:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulesign3971); 

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


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1391:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1392:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1393:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel4012);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel4023); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1400:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_integer_number_0= ruleinteger_number ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_integer_number_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1403:28: (this_integer_number_0= ruleinteger_number )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1405:5: this_integer_number_0= ruleinteger_number
            {
             
                    newCompositeNode(grammarAccess.getLabelAccess().getInteger_numberParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleinteger_number_in_rulelabel4069);
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


    // $ANTLR start "entryRuleconstant"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1423:1: entryRuleconstant returns [String current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final String entryRuleconstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1424:2: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1425:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant4114);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant4125); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1432:1: ruleconstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleconstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_sign_0 = null;

        AntlrDatatypeRuleToken this_constant_identifier_1 = null;

        AntlrDatatypeRuleToken this_number_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1435:28: ( ( ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1436:1: ( ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1436:1: ( ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_IDENTIFIER && LA25_0<=RULE_DIGIT)||(LA25_0>=37 && LA25_0<=38)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1436:2: ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1436:2: ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1436:3: (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1436:3: (this_sign_0= rulesign )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==37) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==38) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1437:5: this_sign_0= rulesign
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getSignParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_rulesign_in_ruleconstant4174);
                            this_sign_0=rulesign();

                            state._fsp--;


                            		current.merge(this_sign_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1447:3: (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_IDENTIFIER) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==RULE_DIGIT||(LA24_0>=37 && LA24_0<=38)) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1448:5: this_constant_identifier_1= ruleconstant_identifier
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getConstant_identifierParserRuleCall_0_1_0()); 
                                
                            pushFollow(FOLLOW_ruleconstant_identifier_in_ruleconstant4204);
                            this_constant_identifier_1=ruleconstant_identifier();

                            state._fsp--;


                            		current.merge(this_constant_identifier_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1460:5: this_number_2= rulenumber
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant4237);
                            this_number_2=rulenumber();

                            state._fsp--;


                            		current.merge(this_number_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1471:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant4265); 

                    		current.merge(this_STRING_3);
                        
                     
                        newLeafNode(this_STRING_3, grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleconstant"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA16_eotS =
        "\7\uffff";
    static final String DFA16_eofS =
        "\3\uffff\2\5\2\uffff";
    static final String DFA16_minS =
        "\5\5\2\uffff";
    static final String DFA16_maxS =
        "\1\46\2\5\2\44\2\uffff";
    static final String DFA16_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\7\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\3\37\uffff\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\4\10\uffff\1\6\3\uffff\1\5\20\uffff\2\6",
            "\1\4\10\uffff\1\6\3\uffff\1\5\20\uffff\2\6",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1088:1: (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number )";
        }
    }
    static final String DFA18_eotS =
        "\7\uffff";
    static final String DFA18_eofS =
        "\7\uffff";
    static final String DFA18_minS =
        "\5\5\2\uffff";
    static final String DFA18_maxS =
        "\1\46\2\5\2\44\2\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\7\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\3\37\uffff\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\4\10\uffff\1\5\24\uffff\2\6",
            "\1\4\10\uffff\1\5\24\uffff\2\6",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1164:1: ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_unsigned_digit_sequence_2= ruleunsigned_digit_sequence )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_ruleModel130 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_ruleprogram227 = new BitSet(new long[]{0x000000000DA80000L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleprogram272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleprogram_heading362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading377 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleprogram_heading396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading418 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleprogram_heading436 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleprogram_heading451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock550 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part682 = new BitSet(new long[]{0x000000000DA00000L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part712 = new BitSet(new long[]{0x000000000D800000L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_ruledeclaration_part742 = new BitSet(new long[]{0x000000000D000000L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_ruledeclaration_part772 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_ruledeclaration_part801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulelabel_declaration_part896 = new BitSet(new long[]{0x0000006000000020L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part918 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20_in_rulelabel_declaration_part937 = new BitSet(new long[]{0x0000006000000020L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part959 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_rulelabel_declaration_part979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleconstant_definition_part1069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part1091 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleconstant_definition_part1109 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part1132 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleconstant_definition_part1150 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition1193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition1244 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleconstant_definition1262 = new BitSet(new long[]{0x0000006000000070L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruletype_definition_part1379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part1401 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruletype_definition_part1419 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part1442 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruletype_definition_part1460 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype_definition1554 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruletype_definition1572 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulevariable_declaration_part1689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1711 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulevariable_declaration_part1729 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulevariable_declaration_part1770 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration1813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_declaration1871 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulevariable_declaration1889 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_declaration1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleprocedure_and_function_declaration_part2007 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27_in_ruleprocedure_and_function_declaration_part2026 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleprocedure_and_function_declaration_part2040 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part2082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulestatement_part2131 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part2153 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulestatement_part2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence2212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence2270 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence2298 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulestatement2395 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype2457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruletype2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruletype2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruletype2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruletype2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_identifier_in_entryRulefield_identifier2608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_identifier2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefield_identifier2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_identifier_in_entryRuleconstant_identifier2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_identifier2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant_identifier2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier2798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list2901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list2952 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleidentifier_list2971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list2986 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber3034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rulenumber3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_number_in_rulenumber3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number3171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_number_in_entryRulereal_number3273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal_number3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rulereal_number3332 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulereal_number3350 = new BitSet(new long[]{0x0000007800000020L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_rulereal_number3373 = new BitSet(new long[]{0x0000007800000020L});
    public static final BitSet FOLLOW_rulescale_factor_in_rulereal_number3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rulereal_number3437 = new BitSet(new long[]{0x0000007800000020L});
    public static final BitSet FOLLOW_rulescale_factor_in_rulereal_number3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescale_factor_in_entryRulescale_factor3511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulescale_factor3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulescale_factor3561 = new BitSet(new long[]{0x0000006000000020L});
    public static final BitSet FOLLOW_36_in_rulescale_factor3580 = new BitSet(new long[]{0x0000006000000020L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rulescale_factor3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_entryRuleunsigned_digit_sequence3649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_digit_sequence3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleunsigned_digit_sequence3700 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleunsigned_digit_sequence3721 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence3769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruledigit_sequence3828 = new BitSet(new long[]{0x0000006000000020L});
    public static final BitSet FOLLOW_ruleunsigned_digit_sequence_in_ruledigit_sequence3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign3903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulesign3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulesign3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel4012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rulelabel4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant4114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruleconstant4174 = new BitSet(new long[]{0x0000006000000030L});
    public static final BitSet FOLLOW_ruleconstant_identifier_in_ruleconstant4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant4265 = new BitSet(new long[]{0x0000000000000002L});

}