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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_STRING", "RULE_LETTER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "'label'", "','", "'const'", "'='", "'type'", "'var'", "':'", "'procedure_declaration'", "'function_declaration'", "'begin'", "'end'", "'statement'", "'TESTE'", "'..'", "'packed'", "'array'", "'[ '", "' ]'", "'of'", "'record'", "'set'", "'file'", "'^'", "'case'", "'E'", "'e'", "'+'", "'-'"
    };
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=5;
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
    public static final int RULE_STRING=6;
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

                if ( (LA1_0==16) ) {
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:106:1: entryRuleprogram returns [String current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final String entryRuleprogram() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:107:2: (iv_ruleprogram= ruleprogram EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:108:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram167);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram178); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:115:1: ruleprogram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleprogram() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_program_heading_0 = null;

        AntlrDatatypeRuleToken this_block_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:118:28: ( (this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:1: (this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:119:1: (this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:120:5: this_program_heading_0= ruleprogram_heading this_block_1= ruleblock kw= '.'
            {
             
                    newCompositeNode(grammarAccess.getProgramAccess().getProgram_headingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleprogram_heading_in_ruleprogram225);
            this_program_heading_0=ruleprogram_heading();

            state._fsp--;


            		current.merge(this_program_heading_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleblock_in_ruleprogram252);
            this_block_1=ruleblock();

            state._fsp--;


            		current.merge(this_block_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleprogram270); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:155:1: entryRuleprogram_heading returns [String current=null] : iv_ruleprogram_heading= ruleprogram_heading EOF ;
    public final String entryRuleprogram_heading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram_heading = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:156:2: (iv_ruleprogram_heading= ruleprogram_heading EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:157:2: iv_ruleprogram_heading= ruleprogram_heading EOF
            {
             newCompositeNode(grammarAccess.getProgram_headingRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading311);
            iv_ruleprogram_heading=ruleprogram_heading();

            state._fsp--;

             current =iv_ruleprogram_heading.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading322); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:164:1: ruleprogram_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleprogram_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:167:28: ( (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:168:1: (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:168:1: (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:169:2: kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleprogram_heading360); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_headingAccess().getProgramKeyword_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading375); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getProgram_headingAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:181:1: (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:182:2: kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleprogram_heading394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifier_listParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading416);
                    this_identifier_list_3=ruleidentifier_list();

                    state._fsp--;


                    		current.merge(this_identifier_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleprogram_heading434); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_2_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_19_in_ruleprogram_heading449); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:218:1: entryRuleblock returns [String current=null] : iv_ruleblock= ruleblock EOF ;
    public final String entryRuleblock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblock = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:219:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:220:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock490);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock501); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:227:1: ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) ;
    public final AntlrDatatypeRuleToken ruleblock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_statement_part_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:230:28: ( (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:231:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:231:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:232:5: this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part
            {
             
                    newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledeclaration_part_in_ruleblock548);
            this_declaration_part_0=ruledeclaration_part();

            state._fsp--;


            		current.merge(this_declaration_part_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock575);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:261:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:262:2: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:263:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part621);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part632); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:270:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part ) ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_label_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_constant_definition_part_1 = null;

        AntlrDatatypeRuleToken this_type_definition_part_2 = null;

        AntlrDatatypeRuleToken this_variable_declaration_part_3 = null;

        AntlrDatatypeRuleToken this_procedure_and_function_declaration_part_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:273:28: ( ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:274:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:274:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:274:2: (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:274:2: (this_label_declaration_part_0= rulelabel_declaration_part )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:275:5: this_label_declaration_part_0= rulelabel_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part680);
                    this_label_declaration_part_0=rulelabel_declaration_part();

                    state._fsp--;


                    		current.merge(this_label_declaration_part_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:285:3: (this_constant_definition_part_1= ruleconstant_definition_part )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:286:5: this_constant_definition_part_1= ruleconstant_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_definition_partParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part710);
                    this_constant_definition_part_1=ruleconstant_definition_part();

                    state._fsp--;


                    		current.merge(this_constant_definition_part_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:296:3: (this_type_definition_part_2= ruletype_definition_part )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:297:5: this_type_definition_part_2= ruletype_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_definition_partParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruletype_definition_part_in_ruledeclaration_part740);
                    this_type_definition_part_2=ruletype_definition_part();

                    state._fsp--;


                    		current.merge(this_type_definition_part_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:307:3: (this_variable_declaration_part_3= rulevariable_declaration_part )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:308:5: this_variable_declaration_part_3= rulevariable_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulevariable_declaration_part_in_ruledeclaration_part770);
                    this_variable_declaration_part_3=rulevariable_declaration_part();

                    state._fsp--;


                    		current.merge(this_variable_declaration_part_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_and_function_declaration_partParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_ruledeclaration_part799);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:337:1: entryRulelabel_declaration_part returns [String current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final String entryRulelabel_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:338:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:339:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part845);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part856); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:346:1: rulelabel_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulelabel_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_1 = null;

        AntlrDatatypeRuleToken this_label_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:349:28: ( (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:350:1: (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:350:1: (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:351:2: kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_rulelabel_declaration_part894); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part916);
            this_label_1=rulelabel();

            state._fsp--;


            		current.merge(this_label_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:367:1: (kw= ',' this_label_3= rulelabel )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:368:2: kw= ',' this_label_3= rulelabel
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_rulelabel_declaration_part935); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part957);
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

            kw=(Token)match(input,19,FOLLOW_19_in_rulelabel_declaration_part977); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:398:1: entryRuleconstant_definition_part returns [String current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final String entryRuleconstant_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:399:2: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:400:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part1018);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part1029); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:407:1: ruleconstant_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_definition_1 = null;

        AntlrDatatypeRuleToken this_constant_definition_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:410:28: ( (kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:411:1: (kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:411:1: (kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:412:2: kw= 'const' this_constant_definition_1= ruleconstant_definition kw= ';' (this_constant_definition_3= ruleconstant_definition kw= ';' )*
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleconstant_definition_part1067); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part1089);
            this_constant_definition_1=ruleconstant_definition();

            state._fsp--;


            		current.merge(this_constant_definition_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleconstant_definition_part1107); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_2()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:434:1: (this_constant_definition_3= ruleconstant_definition kw= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_IDENTIFIER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:435:5: this_constant_definition_3= ruleconstant_definition kw= ';'
            	    {
            	     
            	            newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part1130);
            	    this_constant_definition_3=ruleconstant_definition();

            	    state._fsp--;


            	    		current.merge(this_constant_definition_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleconstant_definition_part1148); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:459:1: entryRuleconstant_definition returns [String current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final String entryRuleconstant_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:460:2: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:461:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition1191);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition1202); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:468:1: ruleconstant_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:471:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:472:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition1242); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getConstant_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,23,FOLLOW_23_in_ruleconstant_definition1260); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition1282);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:504:1: entryRuletype_definition_part returns [String current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final String entryRuletype_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:505:2: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:506:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part1328);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part1339); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:513:1: ruletype_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken ruletype_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_definition_1 = null;

        AntlrDatatypeRuleToken this_type_definition_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:516:28: ( (kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:517:1: (kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:517:1: (kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:518:2: kw= 'type' this_type_definition_1= ruletype_definition kw= ';' (this_type_definition_3= ruletype_definition kw= ';' )*
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruletype_definition_part1377); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part1399);
            this_type_definition_1=ruletype_definition();

            state._fsp--;


            		current.merge(this_type_definition_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruletype_definition_part1417); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_2()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:540:1: (this_type_definition_3= ruletype_definition kw= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_IDENTIFIER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:541:5: this_type_definition_3= ruletype_definition kw= ';'
            	    {
            	     
            	            newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part1440);
            	    this_type_definition_3=ruletype_definition();

            	    state._fsp--;


            	    		current.merge(this_type_definition_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruletype_definition_part1458); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:565:1: entryRuletype_definition returns [String current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final String entryRuletype_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:566:2: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:567:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition1501);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition1512); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:574:1: ruletype_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruletype_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:577:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:578:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:578:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:578:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype_definition1552); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getType_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,23,FOLLOW_23_in_ruletype_definition1570); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getType_definitionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruletype_definition1592);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:610:1: entryRulevariable_declaration_part returns [String current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final String entryRulevariable_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:611:2: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:612:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part1638);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part1649); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:619:1: rulevariable_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken rulevariable_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_declaration_1 = null;

        AntlrDatatypeRuleToken this_variable_declaration_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:622:28: ( (kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:623:1: (kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:623:1: (kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:624:2: kw= 'var' this_variable_declaration_1= rulevariable_declaration kw= ';' (this_variable_declaration_3= rulevariable_declaration kw= ';' )*
            {
            kw=(Token)match(input,25,FOLLOW_25_in_rulevariable_declaration_part1687); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1709);
            this_variable_declaration_1=rulevariable_declaration();

            state._fsp--;


            		current.merge(this_variable_declaration_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,19,FOLLOW_19_in_rulevariable_declaration_part1727); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:646:1: (this_variable_declaration_3= rulevariable_declaration kw= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_IDENTIFIER) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:647:5: this_variable_declaration_3= rulevariable_declaration kw= ';'
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1750);
            	    this_variable_declaration_3=rulevariable_declaration();

            	    state._fsp--;


            	    		current.merge(this_variable_declaration_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,19,FOLLOW_19_in_rulevariable_declaration_part1768); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:671:1: entryRulevariable_declaration returns [String current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final String entryRulevariable_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:672:2: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:673:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
             newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration1811);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;

             current =iv_rulevariable_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration1822); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:680:1: rulevariable_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulevariable_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:683:28: ( (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:684:1: (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:684:1: (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:685:5: this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype
            {
             
                    newCompositeNode(grammarAccess.getVariable_declarationAccess().getIdentifier_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_declaration1869);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,26,FOLLOW_26_in_rulevariable_declaration1887); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulevariable_declaration1909);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:720:1: entryRuleprocedure_and_function_declaration_part returns [String current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final String entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:721:2: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:722:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part1955);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part1966); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:729:1: ruleprocedure_and_function_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';' )* ;
    public final AntlrDatatypeRuleToken ruleprocedure_and_function_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:732:28: ( ( (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:733:1: ( (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:733:1: ( (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:733:2: (kw= 'procedure_declaration' | kw= 'function_declaration' ) kw= ';'
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:733:2: (kw= 'procedure_declaration' | kw= 'function_declaration' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==27) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==28) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:734:2: kw= 'procedure_declaration'
            	            {
            	            kw=(Token)match(input,27,FOLLOW_27_in_ruleprocedure_and_function_declaration_part2005); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_declarationKeyword_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:741:2: kw= 'function_declaration'
            	            {
            	            kw=(Token)match(input,28,FOLLOW_28_in_ruleprocedure_and_function_declaration_part2024); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getProcedure_and_function_declaration_partAccess().getFunction_declarationKeyword_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleprocedure_and_function_declaration_part2038); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:760:1: entryRulestatement_part returns [String current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final String entryRulestatement_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:761:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:762:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part2080);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part2091); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:769:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' ) ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:772:28: ( (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:773:1: (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:773:1: (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:774:2: kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_rulestatement_part2129); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part2151);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,30,FOLLOW_30_in_rulestatement_part2169); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:804:1: entryRulestatement_sequence returns [String current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final String entryRulestatement_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:805:2: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:806:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence2210);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence2221); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:813:1: rulestatement_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_statement_0= rulestatement (this_statement_1= rulestatement )* ) ;
    public final AntlrDatatypeRuleToken rulestatement_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_statement_0 = null;

        AntlrDatatypeRuleToken this_statement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:816:28: ( (this_statement_0= rulestatement (this_statement_1= rulestatement )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:1: (this_statement_0= rulestatement (this_statement_1= rulestatement )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:817:1: (this_statement_0= rulestatement (this_statement_1= rulestatement )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:818:5: this_statement_0= rulestatement (this_statement_1= rulestatement )*
            {
             
                    newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence2268);
            this_statement_0=rulestatement();

            state._fsp--;


            		current.merge(this_statement_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:828:1: (this_statement_1= rulestatement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:829:5: this_statement_1= rulestatement
            	    {
            	     
            	            newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence2296);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:847:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:848:2: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:849:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement2344);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement2355); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:856:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'statement' kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:859:28: ( (kw= 'statement' kw= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:860:1: (kw= 'statement' kw= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:860:1: (kw= 'statement' kw= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:861:2: kw= 'statement' kw= ';'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_rulestatement2393); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatementAccess().getStatementKeyword_0()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_rulestatement2406); 

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


    // $ANTLR start "entryRulecase_label_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:880:1: entryRulecase_label_list returns [String current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final String entryRulecase_label_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_label_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:881:2: (iv_rulecase_label_list= rulecase_label_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:882:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list2447);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list2458); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:889:1: rulecase_label_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )* ) ;
    public final AntlrDatatypeRuleToken rulecase_label_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_0 = null;

        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:892:28: ( (this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:893:1: (this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:893:1: (this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:894:5: this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )*
            {
             
                    newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list2505);
            this_constant_0=ruleconstant();

            state._fsp--;


            		current.merge(this_constant_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:904:1: (kw= ',' this_constant_2= ruleconstant )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:905:2: kw= ',' this_constant_2= ruleconstant
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_rulecase_label_list2524); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list2546);
            	    this_constant_2=ruleconstant();

            	    state._fsp--;


            	    		current.merge(this_constant_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:937:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:938:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:939:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype2602);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype2613); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:946:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type | this_type_identifier_3= ruletype_identifier | kw= 'TESTE' ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_simple_type_0 = null;

        AntlrDatatypeRuleToken this_structured_type_1 = null;

        AntlrDatatypeRuleToken this_pointer_type_2 = null;

        AntlrDatatypeRuleToken this_type_identifier_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:949:28: ( (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type | this_type_identifier_3= ruletype_identifier | kw= 'TESTE' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:950:1: (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type | this_type_identifier_3= ruletype_identifier | kw= 'TESTE' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:950:1: (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type | this_type_identifier_3= ruletype_identifier | kw= 'TESTE' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_UNSIGNED_DIGIT_SEQUENCE:
            case RULE_STRING:
            case 17:
            case 46:
            case 47:
                {
                alt15=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==33) ) {
                    alt15=1;
                }
                else if ( (LA15_2==EOF||(LA15_2>=18 && LA15_2<=19)||LA15_2==30) ) {
                    alt15=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
            case 35:
            case 39:
            case 40:
            case 41:
                {
                alt15=2;
                }
                break;
            case 42:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:951:5: this_simple_type_0= rulesimple_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimple_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesimple_type_in_ruletype2660);
                    this_simple_type_0=rulesimple_type();

                    state._fsp--;


                    		current.merge(this_simple_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:963:5: this_structured_type_1= rulestructured_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructured_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulestructured_type_in_ruletype2693);
                    this_structured_type_1=rulestructured_type();

                    state._fsp--;


                    		current.merge(this_structured_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:975:5: this_pointer_type_2= rulepointer_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPointer_typeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulepointer_type_in_ruletype2726);
                    this_pointer_type_2=rulepointer_type();

                    state._fsp--;


                    		current.merge(this_pointer_type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:987:5: this_type_identifier_3= ruletype_identifier
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getType_identifierParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruletype_identifier_in_ruletype2759);
                    this_type_identifier_3=ruletype_identifier();

                    state._fsp--;


                    		current.merge(this_type_identifier_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:999:2: kw= 'TESTE'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruletype2783); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getTESTEKeyword_4()); 
                        

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


    // $ANTLR start "entryRulesimple_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1012:1: entryRulesimple_type returns [String current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final String entryRulesimple_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1013:2: (iv_rulesimple_type= rulesimple_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1014:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type2824);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type2835); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1021:1: rulesimple_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type ) ;
    public final AntlrDatatypeRuleToken rulesimple_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_subrange_type_0 = null;

        AntlrDatatypeRuleToken this_enumerated_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1024:28: ( (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1025:1: (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1025:1: (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_IDENTIFIER && LA16_0<=RULE_STRING)||(LA16_0>=46 && LA16_0<=47)) ) {
                alt16=1;
            }
            else if ( (LA16_0==17) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1026:5: this_subrange_type_0= rulesubrange_type
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrange_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesubrange_type_in_rulesimple_type2882);
                    this_subrange_type_0=rulesubrange_type();

                    state._fsp--;


                    		current.merge(this_subrange_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1038:5: this_enumerated_type_1= ruleenumerated_type
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumerated_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleenumerated_type_in_rulesimple_type2915);
                    this_enumerated_type_1=ruleenumerated_type();

                    state._fsp--;


                    		current.merge(this_enumerated_type_1);
                        
                     
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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRuleenumerated_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1056:1: entryRuleenumerated_type returns [String current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final String entryRuleenumerated_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenumerated_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1057:2: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1058:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type2961);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type2972); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1065:1: ruleenumerated_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleenumerated_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1068:28: ( (kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1069:1: (kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1069:1: (kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1070:2: kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleenumerated_type3010); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifier_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleenumerated_type3032);
            this_identifier_list_1=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruleenumerated_type3050); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 
                

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
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulesubrange_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1100:1: entryRulesubrange_type returns [String current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final String entryRulesubrange_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesubrange_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1101:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1102:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type3091);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type3102); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1109:1: rulesubrange_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_lower_bound_0= rulelower_bound kw= '..' this_upper_bound_2= ruleupper_bound ) ;
    public final AntlrDatatypeRuleToken rulesubrange_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_lower_bound_0 = null;

        AntlrDatatypeRuleToken this_upper_bound_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1112:28: ( (this_lower_bound_0= rulelower_bound kw= '..' this_upper_bound_2= ruleupper_bound ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1113:1: (this_lower_bound_0= rulelower_bound kw= '..' this_upper_bound_2= ruleupper_bound )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1113:1: (this_lower_bound_0= rulelower_bound kw= '..' this_upper_bound_2= ruleupper_bound )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1114:5: this_lower_bound_0= rulelower_bound kw= '..' this_upper_bound_2= ruleupper_bound
            {
             
                    newCompositeNode(grammarAccess.getSubrange_typeAccess().getLower_boundParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulelower_bound_in_rulesubrange_type3149);
            this_lower_bound_0=rulelower_bound();

            state._fsp--;


            		current.merge(this_lower_bound_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,33,FOLLOW_33_in_rulesubrange_type3167); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getSubrange_typeAccess().getUpper_boundParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleupper_bound_in_rulesubrange_type3189);
            this_upper_bound_2=ruleupper_bound();

            state._fsp--;


            		current.merge(this_upper_bound_2);
                
             
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
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRulelower_bound"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1149:1: entryRulelower_bound returns [String current=null] : iv_rulelower_bound= rulelower_bound EOF ;
    public final String entryRulelower_bound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelower_bound = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1150:2: (iv_rulelower_bound= rulelower_bound EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1151:2: iv_rulelower_bound= rulelower_bound EOF
            {
             newCompositeNode(grammarAccess.getLower_boundRule()); 
            pushFollow(FOLLOW_rulelower_bound_in_entryRulelower_bound3235);
            iv_rulelower_bound=rulelower_bound();

            state._fsp--;

             current =iv_rulelower_bound.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelower_bound3246); 

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
    // $ANTLR end "entryRulelower_bound"


    // $ANTLR start "rulelower_bound"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1158:1: rulelower_bound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_constant_0= ruleconstant ;
    public final AntlrDatatypeRuleToken rulelower_bound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_constant_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1161:28: (this_constant_0= ruleconstant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1163:5: this_constant_0= ruleconstant
            {
             
                    newCompositeNode(grammarAccess.getLower_boundAccess().getConstantParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleconstant_in_rulelower_bound3292);
            this_constant_0=ruleconstant();

            state._fsp--;


            		current.merge(this_constant_0);
                
             
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
    // $ANTLR end "rulelower_bound"


    // $ANTLR start "entryRuleupper_bound"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1181:1: entryRuleupper_bound returns [String current=null] : iv_ruleupper_bound= ruleupper_bound EOF ;
    public final String entryRuleupper_bound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleupper_bound = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1182:2: (iv_ruleupper_bound= ruleupper_bound EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1183:2: iv_ruleupper_bound= ruleupper_bound EOF
            {
             newCompositeNode(grammarAccess.getUpper_boundRule()); 
            pushFollow(FOLLOW_ruleupper_bound_in_entryRuleupper_bound3337);
            iv_ruleupper_bound=ruleupper_bound();

            state._fsp--;

             current =iv_ruleupper_bound.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleupper_bound3348); 

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
    // $ANTLR end "entryRuleupper_bound"


    // $ANTLR start "ruleupper_bound"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1190:1: ruleupper_bound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_constant_0= ruleconstant ;
    public final AntlrDatatypeRuleToken ruleupper_bound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_constant_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1193:28: (this_constant_0= ruleconstant )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1195:5: this_constant_0= ruleconstant
            {
             
                    newCompositeNode(grammarAccess.getUpper_boundAccess().getConstantParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleconstant_in_ruleupper_bound3394);
            this_constant_0=ruleconstant();

            state._fsp--;


            		current.merge(this_constant_0);
                
             
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
    // $ANTLR end "ruleupper_bound"


    // $ANTLR start "entryRulestructured_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1213:1: entryRulestructured_type returns [String current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final String entryRulestructured_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1214:2: (iv_rulestructured_type= rulestructured_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1215:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type3439);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type3450); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1222:1: rulestructured_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'packed' )? this_unpacked_structured_type_1= ruleunpacked_structured_type ) ;
    public final AntlrDatatypeRuleToken rulestructured_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_unpacked_structured_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1225:28: ( ( (kw= 'packed' )? this_unpacked_structured_type_1= ruleunpacked_structured_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1226:1: ( (kw= 'packed' )? this_unpacked_structured_type_1= ruleunpacked_structured_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1226:1: ( (kw= 'packed' )? this_unpacked_structured_type_1= ruleunpacked_structured_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1226:2: (kw= 'packed' )? this_unpacked_structured_type_1= ruleunpacked_structured_type
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1226:2: (kw= 'packed' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1227:2: kw= 'packed'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulestructured_type3489); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructured_typeAccess().getPackedKeyword_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getStructured_typeAccess().getUnpacked_structured_typeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rulestructured_type3513);
            this_unpacked_structured_type_1=ruleunpacked_structured_type();

            state._fsp--;


            		current.merge(this_unpacked_structured_type_1);
                
             
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
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1251:1: entryRuleunpacked_structured_type returns [String current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final String entryRuleunpacked_structured_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunpacked_structured_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1252:2: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1253:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type3559);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type3570); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1260:1: ruleunpacked_structured_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_array_type_0= rulearray_type | this_record_type_1= rulerecord_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type ) ;
    public final AntlrDatatypeRuleToken ruleunpacked_structured_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_array_type_0 = null;

        AntlrDatatypeRuleToken this_record_type_1 = null;

        AntlrDatatypeRuleToken this_set_type_2 = null;

        AntlrDatatypeRuleToken this_file_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1263:28: ( (this_array_type_0= rulearray_type | this_record_type_1= rulerecord_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1264:1: (this_array_type_0= rulearray_type | this_record_type_1= rulerecord_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1264:1: (this_array_type_0= rulearray_type | this_record_type_1= rulerecord_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 40:
                {
                alt18=3;
                }
                break;
            case 41:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1265:5: this_array_type_0= rulearray_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArray_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulearray_type_in_ruleunpacked_structured_type3617);
                    this_array_type_0=rulearray_type();

                    state._fsp--;


                    		current.merge(this_array_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1277:5: this_record_type_1= rulerecord_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecord_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerecord_type_in_ruleunpacked_structured_type3650);
                    this_record_type_1=rulerecord_type();

                    state._fsp--;


                    		current.merge(this_record_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1289:5: this_set_type_2= ruleset_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSet_typeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleset_type_in_ruleunpacked_structured_type3683);
                    this_set_type_2=ruleset_type();

                    state._fsp--;


                    		current.merge(this_set_type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1301:5: this_file_type_3= rulefile_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFile_typeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulefile_type_in_ruleunpacked_structured_type3716);
                    this_file_type_3=rulefile_type();

                    state._fsp--;


                    		current.merge(this_file_type_3);
                        
                     
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
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1319:1: entryRulearray_type returns [String current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final String entryRulearray_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearray_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1320:2: (iv_rulearray_type= rulearray_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1321:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type3762);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type3773); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1328:1: rulearray_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'array' kw= '[ ' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ' ]' kw= 'of' this_element_type_7= ruleelement_type ) ;
    public final AntlrDatatypeRuleToken rulearray_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_index_type_2 = null;

        AntlrDatatypeRuleToken this_index_type_4 = null;

        AntlrDatatypeRuleToken this_element_type_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1331:28: ( (kw= 'array' kw= '[ ' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ' ]' kw= 'of' this_element_type_7= ruleelement_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1332:1: (kw= 'array' kw= '[ ' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ' ]' kw= 'of' this_element_type_7= ruleelement_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1332:1: (kw= 'array' kw= '[ ' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ' ]' kw= 'of' this_element_type_7= ruleelement_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1333:2: kw= 'array' kw= '[ ' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ' ]' kw= 'of' this_element_type_7= ruleelement_type
            {
            kw=(Token)match(input,35,FOLLOW_35_in_rulearray_type3811); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getArrayKeyword_0()); 
                
            kw=(Token)match(input,36,FOLLOW_36_in_rulearray_type3824); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getLeftSquareBracketSpaceKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleindex_type_in_rulearray_type3846);
            this_index_type_2=ruleindex_type();

            state._fsp--;


            		current.merge(this_index_type_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1355:1: (kw= ',' this_index_type_4= ruleindex_type )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1356:2: kw= ',' this_index_type_4= ruleindex_type
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_rulearray_type3865); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleindex_type_in_rulearray_type3887);
            	    this_index_type_4=ruleindex_type();

            	    state._fsp--;


            	    		current.merge(this_index_type_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            kw=(Token)match(input,37,FOLLOW_37_in_rulearray_type3907); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getSpaceRightSquareBracketKeyword_4()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_rulearray_type3920); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getOfKeyword_5()); 
                
             
                    newCompositeNode(grammarAccess.getArray_typeAccess().getElement_typeParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleelement_type_in_rulearray_type3942);
            this_element_type_7=ruleelement_type();

            state._fsp--;


            		current.merge(this_element_type_7);
                
             
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
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuleindex_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1403:1: entryRuleindex_type returns [String current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final String entryRuleindex_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleindex_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1404:2: (iv_ruleindex_type= ruleindex_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1405:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_ruleindex_type_in_entryRuleindex_type3988);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex_type3999); 

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
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1412:1: ruleindex_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_simple_type_0= rulesimple_type ;
    public final AntlrDatatypeRuleToken ruleindex_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_simple_type_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1415:28: (this_simple_type_0= rulesimple_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1417:5: this_simple_type_0= rulesimple_type
            {
             
                    newCompositeNode(grammarAccess.getIndex_typeAccess().getSimple_typeParserRuleCall()); 
                
            pushFollow(FOLLOW_rulesimple_type_in_ruleindex_type4045);
            this_simple_type_0=rulesimple_type();

            state._fsp--;


            		current.merge(this_simple_type_0);
                
             
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
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRuleelement_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1435:1: entryRuleelement_type returns [String current=null] : iv_ruleelement_type= ruleelement_type EOF ;
    public final String entryRuleelement_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelement_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1436:2: (iv_ruleelement_type= ruleelement_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1437:2: iv_ruleelement_type= ruleelement_type EOF
            {
             newCompositeNode(grammarAccess.getElement_typeRule()); 
            pushFollow(FOLLOW_ruleelement_type_in_entryRuleelement_type4090);
            iv_ruleelement_type=ruleelement_type();

            state._fsp--;

             current =iv_ruleelement_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_type4101); 

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
    // $ANTLR end "entryRuleelement_type"


    // $ANTLR start "ruleelement_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1444:1: ruleelement_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_type_0= ruletype ;
    public final AntlrDatatypeRuleToken ruleelement_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_type_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1447:28: (this_type_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1449:5: this_type_0= ruletype
            {
             
                    newCompositeNode(grammarAccess.getElement_typeAccess().getTypeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruletype_in_ruleelement_type4147);
            this_type_0=ruletype();

            state._fsp--;


            		current.merge(this_type_0);
                
             
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
    // $ANTLR end "ruleelement_type"


    // $ANTLR start "entryRulerecord_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1467:1: entryRulerecord_type returns [String current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final String entryRulerecord_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecord_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1468:2: (iv_rulerecord_type= rulerecord_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1469:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_rulerecord_type_in_entryRulerecord_type4192);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_type4203); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1476:1: rulerecord_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'record' this_field_list_1= rulefield_list kw= 'end' ) ;
    public final AntlrDatatypeRuleToken rulerecord_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_field_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1479:28: ( (kw= 'record' this_field_list_1= rulefield_list kw= 'end' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1480:1: (kw= 'record' this_field_list_1= rulefield_list kw= 'end' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1480:1: (kw= 'record' this_field_list_1= rulefield_list kw= 'end' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1481:2: kw= 'record' this_field_list_1= rulefield_list kw= 'end'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_rulerecord_type4241); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRecord_typeAccess().getRecordKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getRecord_typeAccess().getField_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulefield_list_in_rulerecord_type4263);
            this_field_list_1=rulefield_list();

            state._fsp--;


            		current.merge(this_field_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,30,FOLLOW_30_in_rulerecord_type4281); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRecord_typeAccess().getEndKeyword_2()); 
                

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
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRuleset_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1511:1: entryRuleset_type returns [String current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final String entryRuleset_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1512:2: (iv_ruleset_type= ruleset_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1513:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type4322);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type4333); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1520:1: ruleset_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'set' kw= 'of' this_base_type_2= rulebase_type ) ;
    public final AntlrDatatypeRuleToken ruleset_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_base_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1523:28: ( (kw= 'set' kw= 'of' this_base_type_2= rulebase_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1524:1: (kw= 'set' kw= 'of' this_base_type_2= rulebase_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1524:1: (kw= 'set' kw= 'of' this_base_type_2= rulebase_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1525:2: kw= 'set' kw= 'of' this_base_type_2= rulebase_type
            {
            kw=(Token)match(input,40,FOLLOW_40_in_ruleset_type4371); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSet_typeAccess().getSetKeyword_0()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_ruleset_type4384); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSet_typeAccess().getOfKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getSet_typeAccess().getBase_typeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulebase_type_in_ruleset_type4406);
            this_base_type_2=rulebase_type();

            state._fsp--;


            		current.merge(this_base_type_2);
                
             
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
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulebase_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1555:1: entryRulebase_type returns [String current=null] : iv_rulebase_type= rulebase_type EOF ;
    public final String entryRulebase_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebase_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1556:2: (iv_rulebase_type= rulebase_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1557:2: iv_rulebase_type= rulebase_type EOF
            {
             newCompositeNode(grammarAccess.getBase_typeRule()); 
            pushFollow(FOLLOW_rulebase_type_in_entryRulebase_type4452);
            iv_rulebase_type=rulebase_type();

            state._fsp--;

             current =iv_rulebase_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebase_type4463); 

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
    // $ANTLR end "entryRulebase_type"


    // $ANTLR start "rulebase_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1564:1: rulebase_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_type_0= ruletype ;
    public final AntlrDatatypeRuleToken rulebase_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_type_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1567:28: (this_type_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1569:5: this_type_0= ruletype
            {
             
                    newCompositeNode(grammarAccess.getBase_typeAccess().getTypeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruletype_in_rulebase_type4509);
            this_type_0=ruletype();

            state._fsp--;


            		current.merge(this_type_0);
                
             
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
    // $ANTLR end "rulebase_type"


    // $ANTLR start "entryRulefile_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1587:1: entryRulefile_type returns [String current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final String entryRulefile_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefile_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1588:2: (iv_rulefile_type= rulefile_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1589:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type4554);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type4565); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1596:1: rulefile_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'file' kw= 'of' this_file_component_type_2= rulefile_component_type ) ;
    public final AntlrDatatypeRuleToken rulefile_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_file_component_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1599:28: ( (kw= 'file' kw= 'of' this_file_component_type_2= rulefile_component_type ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1600:1: (kw= 'file' kw= 'of' this_file_component_type_2= rulefile_component_type )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1600:1: (kw= 'file' kw= 'of' this_file_component_type_2= rulefile_component_type )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1601:2: kw= 'file' kw= 'of' this_file_component_type_2= rulefile_component_type
            {
            kw=(Token)match(input,41,FOLLOW_41_in_rulefile_type4603); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFile_typeAccess().getFileKeyword_0()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_rulefile_type4616); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFile_typeAccess().getOfKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getFile_typeAccess().getFile_component_typeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulefile_component_type_in_rulefile_type4638);
            this_file_component_type_2=rulefile_component_type();

            state._fsp--;


            		current.merge(this_file_component_type_2);
                
             
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
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulefile_component_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1631:1: entryRulefile_component_type returns [String current=null] : iv_rulefile_component_type= rulefile_component_type EOF ;
    public final String entryRulefile_component_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefile_component_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1632:2: (iv_rulefile_component_type= rulefile_component_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1633:2: iv_rulefile_component_type= rulefile_component_type EOF
            {
             newCompositeNode(grammarAccess.getFile_component_typeRule()); 
            pushFollow(FOLLOW_rulefile_component_type_in_entryRulefile_component_type4684);
            iv_rulefile_component_type=rulefile_component_type();

            state._fsp--;

             current =iv_rulefile_component_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_component_type4695); 

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
    // $ANTLR end "entryRulefile_component_type"


    // $ANTLR start "rulefile_component_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1640:1: rulefile_component_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_type_0= ruletype ;
    public final AntlrDatatypeRuleToken rulefile_component_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_type_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1643:28: (this_type_0= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1645:5: this_type_0= ruletype
            {
             
                    newCompositeNode(grammarAccess.getFile_component_typeAccess().getTypeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruletype_in_rulefile_component_type4741);
            this_type_0=ruletype();

            state._fsp--;


            		current.merge(this_type_0);
                
             
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
    // $ANTLR end "rulefile_component_type"


    // $ANTLR start "entryRulepointer_type"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1663:1: entryRulepointer_type returns [String current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final String entryRulepointer_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepointer_type = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1664:2: (iv_rulepointer_type= rulepointer_type EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1665:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_rulepointer_type_in_entryRulepointer_type4786);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepointer_type4797); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1672:1: rulepointer_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '^' this_type_identifier_1= ruletype_identifier ) ;
    public final AntlrDatatypeRuleToken rulepointer_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_identifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1675:28: ( (kw= '^' this_type_identifier_1= ruletype_identifier ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1676:1: (kw= '^' this_type_identifier_1= ruletype_identifier )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1676:1: (kw= '^' this_type_identifier_1= ruletype_identifier )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1677:2: kw= '^' this_type_identifier_1= ruletype_identifier
            {
            kw=(Token)match(input,42,FOLLOW_42_in_rulepointer_type4835); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getPointer_typeAccess().getType_identifierParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletype_identifier_in_rulepointer_type4857);
            this_type_identifier_1=ruletype_identifier();

            state._fsp--;


            		current.merge(this_type_identifier_1);
                
             
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
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulefield_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1701:1: entryRulefield_list returns [String current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final String entryRulefield_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1702:2: (iv_rulefield_list= rulefield_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1703:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list4903);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list4914); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1710:1: rulefield_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )? )? ;
    public final AntlrDatatypeRuleToken rulefield_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_fixed_part_0 = null;

        AntlrDatatypeRuleToken this_variant_part_2 = null;

        AntlrDatatypeRuleToken this_variant_part_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1713:28: ( ( ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )? )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1714:1: ( ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )? )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1714:1: ( ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_IDENTIFIER||LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1714:2: ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )?
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1714:2: ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_IDENTIFIER) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==43) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1714:3: (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1714:3: (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1715:5: this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )?
                            {
                             
                                    newCompositeNode(grammarAccess.getField_listAccess().getFixed_partParserRuleCall_0_0_0()); 
                                
                            pushFollow(FOLLOW_rulefixed_part_in_rulefield_list4963);
                            this_fixed_part_0=rulefixed_part();

                            state._fsp--;


                            		current.merge(this_fixed_part_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1725:1: (kw= ';' this_variant_part_2= rulevariant_part )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==19) ) {
                                int LA20_1 = input.LA(2);

                                if ( (LA20_1==43) ) {
                                    alt20=1;
                                }
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1726:2: kw= ';' this_variant_part_2= rulevariant_part
                                    {
                                    kw=(Token)match(input,19,FOLLOW_19_in_rulefield_list4982); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 
                                        
                                     
                                            newCompositeNode(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_0_1_1()); 
                                        
                                    pushFollow(FOLLOW_rulevariant_part_in_rulefield_list5004);
                                    this_variant_part_2=rulevariant_part();

                                    state._fsp--;


                                    		current.merge(this_variant_part_2);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1744:5: this_variant_part_3= rulevariant_part
                            {
                             
                                    newCompositeNode(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_rulevariant_part_in_rulefield_list5040);
                            this_variant_part_3=rulevariant_part();

                            state._fsp--;


                            		current.merge(this_variant_part_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1754:2: (kw= ';' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==19) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1755:2: kw= ';'
                            {
                            kw=(Token)match(input,19,FOLLOW_19_in_rulefield_list5060); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getField_listAccess().getSemicolonKeyword_1()); 
                                

                            }
                            break;

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
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1768:1: entryRulefixed_part returns [String current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final String entryRulefixed_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefixed_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1769:2: (iv_rulefixed_part= rulefixed_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1770:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part5104);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part5115); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1777:1: rulefixed_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )* ) ;
    public final AntlrDatatypeRuleToken rulefixed_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_record_section_0 = null;

        AntlrDatatypeRuleToken this_record_section_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1780:28: ( (this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1781:1: (this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1781:1: (this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1782:5: this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )*
            {
             
                    newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part5162);
            this_record_section_0=rulerecord_section();

            state._fsp--;


            		current.merge(this_record_section_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1792:1: (kw= ';' this_record_section_2= rulerecord_section )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_IDENTIFIER) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1793:2: kw= ';' this_record_section_2= rulerecord_section
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_rulefixed_part5181); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part5203);
            	    this_record_section_2=rulerecord_section();

            	    state._fsp--;


            	    		current.merge(this_record_section_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulerecord_section"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1817:1: entryRulerecord_section returns [String current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final String entryRulerecord_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecord_section = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1818:2: (iv_rulerecord_section= rulerecord_section EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1819:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section5251);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section5262); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1826:1: rulerecord_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulerecord_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1829:28: ( (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1830:1: (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1830:1: (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1831:5: this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype
            {
             
                    newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifier_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulerecord_section5309);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,26,FOLLOW_26_in_rulerecord_section5327); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulerecord_section5349);
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
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1866:1: entryRulevariant_part returns [String current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final String entryRulevariant_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariant_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1867:2: (iv_rulevariant_part= rulevariant_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1868:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part5395);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part5406); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1875:1: rulevariant_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'case' this_tag_field_1= ruletag_field this_type_identifier_2= ruletype_identifier kw= 'of' this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )* ) ;
    public final AntlrDatatypeRuleToken rulevariant_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_tag_field_1 = null;

        AntlrDatatypeRuleToken this_type_identifier_2 = null;

        AntlrDatatypeRuleToken this_variant_4 = null;

        AntlrDatatypeRuleToken this_variant_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1878:28: ( (kw= 'case' this_tag_field_1= ruletag_field this_type_identifier_2= ruletype_identifier kw= 'of' this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1879:1: (kw= 'case' this_tag_field_1= ruletag_field this_type_identifier_2= ruletype_identifier kw= 'of' this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1879:1: (kw= 'case' this_tag_field_1= ruletag_field this_type_identifier_2= ruletype_identifier kw= 'of' this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1880:2: kw= 'case' this_tag_field_1= ruletag_field this_type_identifier_2= ruletype_identifier kw= 'of' this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )*
            {
            kw=(Token)match(input,43,FOLLOW_43_in_rulevariant_part5444); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariant_partAccess().getCaseKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getTag_fieldParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletag_field_in_rulevariant_part5466);
            this_tag_field_1=ruletag_field();

            state._fsp--;


            		current.merge(this_tag_field_1);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getType_identifierParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_identifier_in_rulevariant_part5493);
            this_type_identifier_2=ruletype_identifier();

            state._fsp--;


            		current.merge(this_type_identifier_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,38,FOLLOW_38_in_rulevariant_part5511); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariant_partAccess().getOfKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulevariant_in_rulevariant_part5533);
            this_variant_4=rulevariant();

            state._fsp--;


            		current.merge(this_variant_4);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1924:1: (kw= ';' this_variant_6= rulevariant )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    int LA25_1 = input.LA(2);

                    if ( ((LA25_1>=RULE_IDENTIFIER && LA25_1<=RULE_STRING)||(LA25_1>=46 && LA25_1<=47)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1925:2: kw= ';' this_variant_6= rulevariant
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_rulevariant_part5552); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_5_1()); 
            	        
            	    pushFollow(FOLLOW_rulevariant_in_rulevariant_part5574);
            	    this_variant_6=rulevariant();

            	    state._fsp--;


            	    		current.merge(this_variant_6);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1949:1: entryRuletag_field returns [String current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final String entryRuletag_field() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletag_field = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1950:2: (iv_ruletag_field= ruletag_field EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1951:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field5622);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field5633); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1958:1: ruletag_field returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' )? ;
    public final AntlrDatatypeRuleToken ruletag_field() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1961:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1962:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1962:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_IDENTIFIER) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==26) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1962:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':'
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletag_field5673); 

                    		current.merge(this_IDENTIFIER_0);
                        
                     
                        newLeafNode(this_IDENTIFIER_0, grammarAccess.getTag_fieldAccess().getIDENTIFIERTerminalRuleCall_0()); 
                        
                    kw=(Token)match(input,26,FOLLOW_26_in_ruletag_field5691); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTag_fieldAccess().getColonKeyword_1()); 
                        

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
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1983:1: entryRulevariant returns [String current=null] : iv_rulevariant= rulevariant EOF ;
    public final String entryRulevariant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariant = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1984:2: (iv_rulevariant= rulevariant EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1985:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant5733);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant5744); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1992:1: rulevariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulevariant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_case_label_list_0 = null;

        AntlrDatatypeRuleToken this_field_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1995:28: ( (this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1996:1: (this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1996:1: (this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1997:5: this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')'
            {
             
                    newCompositeNode(grammarAccess.getVariantAccess().getCase_label_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecase_label_list_in_rulevariant5791);
            this_case_label_list_0=rulecase_label_list();

            state._fsp--;


            		current.merge(this_case_label_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,26,FOLLOW_26_in_rulevariant5809); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getColonKeyword_1()); 
                
            kw=(Token)match(input,17,FOLLOW_17_in_rulevariant5822); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getVariantAccess().getField_listParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulefield_list_in_rulevariant5844);
            this_field_list_3=rulefield_list();

            state._fsp--;


            		current.merge(this_field_list_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,18,FOLLOW_18_in_rulevariant5862); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4()); 
                

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
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRulefield_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2046:1: entryRulefield_identifier returns [String current=null] : iv_rulefield_identifier= rulefield_identifier EOF ;
    public final String entryRulefield_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2047:2: (iv_rulefield_identifier= rulefield_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2048:2: iv_rulefield_identifier= rulefield_identifier EOF
            {
             newCompositeNode(grammarAccess.getField_identifierRule()); 
            pushFollow(FOLLOW_rulefield_identifier_in_entryRulefield_identifier5905);
            iv_rulefield_identifier=rulefield_identifier();

            state._fsp--;

             current =iv_rulefield_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_identifier5916); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2055:1: rulefield_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulefield_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2058:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2059:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefield_identifier5955); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2074:1: entryRuleconstant_identifier returns [String current=null] : iv_ruleconstant_identifier= ruleconstant_identifier EOF ;
    public final String entryRuleconstant_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2075:2: (iv_ruleconstant_identifier= ruleconstant_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2076:2: iv_ruleconstant_identifier= ruleconstant_identifier EOF
            {
             newCompositeNode(grammarAccess.getConstant_identifierRule()); 
            pushFollow(FOLLOW_ruleconstant_identifier_in_entryRuleconstant_identifier6000);
            iv_ruleconstant_identifier=ruleconstant_identifier();

            state._fsp--;

             current =iv_ruleconstant_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_identifier6011); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2083:1: ruleconstant_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleconstant_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2086:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2087:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant_identifier6050); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2102:1: entryRulevariable_identifier returns [String current=null] : iv_rulevariable_identifier= rulevariable_identifier EOF ;
    public final String entryRulevariable_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2103:2: (iv_rulevariable_identifier= rulevariable_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2104:2: iv_rulevariable_identifier= rulevariable_identifier EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier6095);
            iv_rulevariable_identifier=rulevariable_identifier();

            state._fsp--;

             current =iv_rulevariable_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier6106); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2111:1: rulevariable_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulevariable_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2114:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2115:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier6145); 

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


    // $ANTLR start "entryRuletype_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2130:1: entryRuletype_identifier returns [String current=null] : iv_ruletype_identifier= ruletype_identifier EOF ;
    public final String entryRuletype_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_identifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2131:2: (iv_ruletype_identifier= ruletype_identifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2132:2: iv_ruletype_identifier= ruletype_identifier EOF
            {
             newCompositeNode(grammarAccess.getType_identifierRule()); 
            pushFollow(FOLLOW_ruletype_identifier_in_entryRuletype_identifier6190);
            iv_ruletype_identifier=ruletype_identifier();

            state._fsp--;

             current =iv_ruletype_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_identifier6201); 

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
    // $ANTLR end "entryRuletype_identifier"


    // $ANTLR start "ruletype_identifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2139:1: ruletype_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruletype_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2142:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2143:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype_identifier6240); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getType_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruletype_identifier"


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2164:1: entryRuleidentifier_list returns [String current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final String entryRuleidentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2165:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2166:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list6291);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list6302); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2173:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2176:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2177:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2177:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2177:6: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list6342); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2184:1: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2185:2: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleidentifier_list6361); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            	        
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list6376); 

            	    		current.merge(this_IDENTIFIER_2);
            	        
            	     
            	        newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2205:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2206:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2207:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber6424);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber6435); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2214:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_integer_number_0 = null;

        AntlrDatatypeRuleToken this_real_number_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2217:28: ( (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2218:1: (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2218:1: (this_integer_number_0= ruleinteger_number | this_real_number_1= rulereal_number )
            int alt28=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==15||(LA28_3>=44 && LA28_3<=45)) ) {
                        alt28=2;
                    }
                    else if ( (LA28_3==EOF||(LA28_3>=18 && LA28_3<=19)||LA28_3==21||LA28_3==26||LA28_3==30||LA28_3==33||LA28_3==37) ) {
                        alt28=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==15||(LA28_3>=44 && LA28_3<=45)) ) {
                        alt28=2;
                    }
                    else if ( (LA28_3==EOF||(LA28_3>=18 && LA28_3<=19)||LA28_3==21||LA28_3==26||LA28_3==30||LA28_3==33||LA28_3==37) ) {
                        alt28=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNSIGNED_DIGIT_SEQUENCE:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==15||(LA28_3>=44 && LA28_3<=45)) ) {
                    alt28=2;
                }
                else if ( (LA28_3==EOF||(LA28_3>=18 && LA28_3<=19)||LA28_3==21||LA28_3==26||LA28_3==30||LA28_3==33||LA28_3==37) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2219:5: this_integer_number_0= ruleinteger_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getInteger_numberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleinteger_number_in_rulenumber6482);
                    this_integer_number_0=ruleinteger_number();

                    state._fsp--;


                    		current.merge(this_integer_number_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2231:5: this_real_number_1= rulereal_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getReal_numberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulereal_number_in_rulenumber6515);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2249:1: entryRuleinteger_number returns [String current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final String entryRuleinteger_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinteger_number = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2250:2: (iv_ruleinteger_number= ruleinteger_number EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2251:2: iv_ruleinteger_number= ruleinteger_number EOF
            {
             newCompositeNode(grammarAccess.getInteger_numberRule()); 
            pushFollow(FOLLOW_ruleinteger_number_in_entryRuleinteger_number6561);
            iv_ruleinteger_number=ruleinteger_number();

            state._fsp--;

             current =iv_ruleinteger_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteger_number6572); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2258:1: ruleinteger_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_digit_sequence_0= ruledigit_sequence ;
    public final AntlrDatatypeRuleToken ruleinteger_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_digit_sequence_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2261:28: (this_digit_sequence_0= ruledigit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2263:5: this_digit_sequence_0= ruledigit_sequence
            {
             
                    newCompositeNode(grammarAccess.getInteger_numberAccess().getDigit_sequenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleinteger_number6618);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2281:1: entryRulereal_number returns [String current=null] : iv_rulereal_number= rulereal_number EOF ;
    public final String entryRulereal_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulereal_number = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2282:2: (iv_rulereal_number= rulereal_number EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2283:2: iv_rulereal_number= rulereal_number EOF
            {
             newCompositeNode(grammarAccess.getReal_numberRule()); 
            pushFollow(FOLLOW_rulereal_number_in_entryRulereal_number6663);
            iv_rulereal_number=rulereal_number();

            state._fsp--;

             current =iv_rulereal_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereal_number6674); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2290:1: rulereal_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) ) ;
    public final AntlrDatatypeRuleToken rulereal_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_UNSIGNED_DIGIT_SEQUENCE_2=null;
        AntlrDatatypeRuleToken this_digit_sequence_0 = null;

        AntlrDatatypeRuleToken this_scale_factor_3 = null;

        AntlrDatatypeRuleToken this_digit_sequence_4 = null;

        AntlrDatatypeRuleToken this_scale_factor_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2293:28: ( ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2294:1: ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2294:1: ( (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE )? this_scale_factor_3= rulescale_factor ) | (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor ) )
            int alt30=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                    int LA30_3 = input.LA(3);

                    if ( (LA30_3==15) ) {
                        alt30=1;
                    }
                    else if ( ((LA30_3>=44 && LA30_3<=45)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                    int LA30_3 = input.LA(3);

                    if ( (LA30_3==15) ) {
                        alt30=1;
                    }
                    else if ( ((LA30_3>=44 && LA30_3<=45)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNSIGNED_DIGIT_SEQUENCE:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==15) ) {
                    alt30=1;
                }
                else if ( ((LA30_3>=44 && LA30_3<=45)) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2294:2: (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE )? this_scale_factor_3= rulescale_factor )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2294:2: (this_digit_sequence_0= ruledigit_sequence kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE )? this_scale_factor_3= rulescale_factor )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2295:5: this_digit_sequence_0= ruledigit_sequence kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE )? this_scale_factor_3= rulescale_factor
                    {
                     
                            newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequenceParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruledigit_sequence_in_rulereal_number6722);
                    this_digit_sequence_0=ruledigit_sequence();

                    state._fsp--;


                    		current.merge(this_digit_sequence_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_rulereal_number6740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReal_numberAccess().getFullStopKeyword_0_1()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2311:1: (this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_UNSIGNED_DIGIT_SEQUENCE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2311:6: this_UNSIGNED_DIGIT_SEQUENCE_2= RULE_UNSIGNED_DIGIT_SEQUENCE
                            {
                            this_UNSIGNED_DIGIT_SEQUENCE_2=(Token)match(input,RULE_UNSIGNED_DIGIT_SEQUENCE,FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_rulereal_number6756); 

                            		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_2);
                                
                             
                                newLeafNode(this_UNSIGNED_DIGIT_SEQUENCE_2, grammarAccess.getReal_numberAccess().getUNSIGNED_DIGIT_SEQUENCETerminalRuleCall_0_2()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getReal_numberAccess().getScale_factorParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_rulescale_factor_in_rulereal_number6785);
                    this_scale_factor_3=rulescale_factor();

                    state._fsp--;


                    		current.merge(this_scale_factor_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2330:6: (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2330:6: (this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2331:5: this_digit_sequence_4= ruledigit_sequence this_scale_factor_5= rulescale_factor
                    {
                     
                            newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequenceParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruledigit_sequence_in_rulereal_number6820);
                    this_digit_sequence_4=ruledigit_sequence();

                    state._fsp--;


                    		current.merge(this_digit_sequence_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getReal_numberAccess().getScale_factorParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulescale_factor_in_rulereal_number6847);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2360:1: entryRulescale_factor returns [String current=null] : iv_rulescale_factor= rulescale_factor EOF ;
    public final String entryRulescale_factor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulescale_factor = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2361:2: (iv_rulescale_factor= rulescale_factor EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2362:2: iv_rulescale_factor= rulescale_factor EOF
            {
             newCompositeNode(grammarAccess.getScale_factorRule()); 
            pushFollow(FOLLOW_rulescale_factor_in_entryRulescale_factor6894);
            iv_rulescale_factor=rulescale_factor();

            state._fsp--;

             current =iv_rulescale_factor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulescale_factor6905); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2369:1: rulescale_factor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence ) ;
    public final AntlrDatatypeRuleToken rulescale_factor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_digit_sequence_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2372:28: ( ( (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2373:1: ( (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2373:1: ( (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2373:2: (kw= 'E' | kw= 'e' ) this_digit_sequence_2= ruledigit_sequence
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2373:2: (kw= 'E' | kw= 'e' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            else if ( (LA31_0==45) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2374:2: kw= 'E'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulescale_factor6944); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScale_factorAccess().getEKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2381:2: kw= 'e'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_rulescale_factor6963); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScale_factorAccess().getEKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getScale_factorAccess().getDigit_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruledigit_sequence_in_rulescale_factor6986);
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


    // $ANTLR start "entryRuledigit_sequence"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2405:1: entryRuledigit_sequence returns [String current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final String entryRuledigit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit_sequence = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2406:2: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2407:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
             newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence7032);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;

             current =iv_ruledigit_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence7043); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2414:1: ruledigit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE ) ;
    public final AntlrDatatypeRuleToken ruledigit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNSIGNED_DIGIT_SEQUENCE_1=null;
        AntlrDatatypeRuleToken this_sign_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2417:28: ( ( (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2418:1: ( (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2418:1: ( (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2418:2: (this_sign_0= rulesign )? this_UNSIGNED_DIGIT_SEQUENCE_1= RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2418:2: (this_sign_0= rulesign )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=46 && LA32_0<=47)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2419:5: this_sign_0= rulesign
                    {
                     
                            newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesign_in_ruledigit_sequence7091);
                    this_sign_0=rulesign();

                    state._fsp--;


                    		current.merge(this_sign_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_UNSIGNED_DIGIT_SEQUENCE_1=(Token)match(input,RULE_UNSIGNED_DIGIT_SEQUENCE,FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_ruledigit_sequence7113); 

            		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_1);
                
             
                newLeafNode(this_UNSIGNED_DIGIT_SEQUENCE_1, grammarAccess.getDigit_sequenceAccess().getUNSIGNED_DIGIT_SEQUENCETerminalRuleCall_1()); 
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2444:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2445:2: (iv_rulesign= rulesign EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2446:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign7159);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign7170); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2453:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2456:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2457:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2457:1: (kw= '+' | kw= '-' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            else if ( (LA33_0==47) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2458:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_rulesign7208); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2465:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_rulesign7227); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2478:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2479:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2480:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel7268);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel7279); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2487:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_integer_number_0= ruleinteger_number ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_integer_number_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2490:28: (this_integer_number_0= ruleinteger_number )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2492:5: this_integer_number_0= ruleinteger_number
            {
             
                    newCompositeNode(grammarAccess.getLabelAccess().getInteger_numberParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleinteger_number_in_rulelabel7325);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2510:1: entryRuleconstant returns [String current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final String entryRuleconstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2511:2: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2512:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant7370);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant7381); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2519:1: ruleconstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleconstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_sign_0 = null;

        AntlrDatatypeRuleToken this_constant_identifier_1 = null;

        AntlrDatatypeRuleToken this_number_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2522:28: ( ( ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2523:1: ( ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2523:1: ( ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_IDENTIFIER && LA36_0<=RULE_UNSIGNED_DIGIT_SEQUENCE)||(LA36_0>=46 && LA36_0<=47)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_STRING) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2523:2: ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2523:2: ( (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2523:3: (this_sign_0= rulesign )? (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2523:3: (this_sign_0= rulesign )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==46) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==47) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2524:5: this_sign_0= rulesign
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getSignParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_rulesign_in_ruleconstant7430);
                            this_sign_0=rulesign();

                            state._fsp--;


                            		current.merge(this_sign_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2534:3: (this_constant_identifier_1= ruleconstant_identifier | this_number_2= rulenumber )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_IDENTIFIER) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_UNSIGNED_DIGIT_SEQUENCE||(LA35_0>=46 && LA35_0<=47)) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2535:5: this_constant_identifier_1= ruleconstant_identifier
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getConstant_identifierParserRuleCall_0_1_0()); 
                                
                            pushFollow(FOLLOW_ruleconstant_identifier_in_ruleconstant7460);
                            this_constant_identifier_1=ruleconstant_identifier();

                            state._fsp--;


                            		current.merge(this_constant_identifier_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2547:5: this_number_2= rulenumber
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant7493);
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:2558:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant7521); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_ruleModel130 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_ruleprogram225 = new BitSet(new long[]{0x000000001B500000L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram252 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleprogram270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_in_entryRuleprogram_heading311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleprogram_heading360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading375 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleprogram_heading394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading416 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleprogram_heading434 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleprogram_heading449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock548 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part680 = new BitSet(new long[]{0x000000001B400000L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part710 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_ruledeclaration_part740 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_ruledeclaration_part770 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_ruledeclaration_part799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulelabel_declaration_part894 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part916 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_21_in_rulelabel_declaration_part935 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part957 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_rulelabel_declaration_part977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleconstant_definition_part1067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part1089 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleconstant_definition_part1107 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part1130 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleconstant_definition_part1148 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition1242 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleconstant_definition1260 = new BitSet(new long[]{0x0000C00000000070L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruletype_definition_part1377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part1399 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruletype_definition_part1417 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part1440 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruletype_definition_part1458 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype_definition1552 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruletype_definition1570 = new BitSet(new long[]{0x0000C78D00020070L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulevariable_declaration_part1687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1709 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulevariable_declaration_part1727 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulevariable_declaration_part1750 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulevariable_declaration_part1768 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_declaration1869 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulevariable_declaration1887 = new BitSet(new long[]{0x0000C78D00020070L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_declaration1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part1955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleprocedure_and_function_declaration_part2005 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28_in_ruleprocedure_and_function_declaration_part2024 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleprocedure_and_function_declaration_part2038 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulestatement_part2129 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part2151 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulestatement_part2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence2210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence2268 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence2296 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement2344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulestatement2393 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulestatement2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list2505 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rulecase_label_list2524 = new BitSet(new long[]{0x0000C00000000070L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list2546 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype2602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruletype2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_ruletype2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_ruletype2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_identifier_in_ruletype2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruletype2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type2824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rulesimple_type2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rulesimple_type2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type2961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleenumerated_type3010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleenumerated_type3032 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleenumerated_type3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelower_bound_in_rulesubrange_type3149 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulesubrange_type3167 = new BitSet(new long[]{0x0000C00000000070L});
    public static final BitSet FOLLOW_ruleupper_bound_in_rulesubrange_type3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelower_bound_in_entryRulelower_bound3235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelower_bound3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulelower_bound3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleupper_bound_in_entryRuleupper_bound3337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleupper_bound3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleupper_bound3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type3439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulestructured_type3489 = new BitSet(new long[]{0x0000038C00000000L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rulestructured_type3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type3559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_ruleunpacked_structured_type3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_ruleunpacked_structured_type3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_ruleunpacked_structured_type3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_ruleunpacked_structured_type3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type3762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulearray_type3811 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulearray_type3824 = new BitSet(new long[]{0x0000C00000020070L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type3846 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_21_in_rulearray_type3865 = new BitSet(new long[]{0x0000C00000020070L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type3887 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_37_in_rulearray_type3907 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulearray_type3920 = new BitSet(new long[]{0x0000C78D00020070L});
    public static final BitSet FOLLOW_ruleelement_type_in_rulearray_type3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_entryRuleindex_type3988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex_type3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruleindex_type4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_type_in_entryRuleelement_type4090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_type4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleelement_type4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_entryRulerecord_type4192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_type4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulerecord_type4241 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rulefield_list_in_rulerecord_type4263 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulerecord_type4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleset_type4371 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleset_type4384 = new BitSet(new long[]{0x0000C78D00020070L});
    public static final BitSet FOLLOW_rulebase_type_in_ruleset_type4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebase_type_in_entryRulebase_type4452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebase_type4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rulebase_type4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type4554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulefile_type4603 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulefile_type4616 = new BitSet(new long[]{0x0000C78D00020070L});
    public static final BitSet FOLLOW_rulefile_component_type_in_rulefile_type4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_component_type_in_entryRulefile_component_type4684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_component_type4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_component_type4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_entryRulepointer_type4786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepointer_type4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulepointer_type4835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletype_identifier_in_rulepointer_type4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list4903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rulefield_list4963 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulefield_list4982 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list5004 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list5040 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulefield_list5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part5104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part5162 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulefixed_part5181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part5203 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section5251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulerecord_section5309 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulerecord_section5327 = new BitSet(new long[]{0x0000C78D00020070L});
    public static final BitSet FOLLOW_ruletype_in_rulerecord_section5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part5395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulevariant_part5444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletag_field_in_rulevariant_part5466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletype_identifier_in_rulevariant_part5493 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulevariant_part5511 = new BitSet(new long[]{0x0000C00000000070L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part5533 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulevariant_part5552 = new BitSet(new long[]{0x0000C00000000070L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part5574 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field5622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletag_field5673 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruletag_field5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant5733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulevariant5791 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulevariant5809 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulevariant5822 = new BitSet(new long[]{0x0000080000040010L});
    public static final BitSet FOLLOW_rulefield_list_in_rulevariant5844 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulevariant5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_identifier_in_entryRulefield_identifier5905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_identifier5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefield_identifier5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_identifier_in_entryRuleconstant_identifier6000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_identifier6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant_identifier6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier6095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_identifier_in_entryRuletype_identifier6190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_identifier6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype_identifier6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list6291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list6342 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleidentifier_list6361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list6376 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber6424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rulenumber6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_number_in_rulenumber6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_entryRuleinteger_number6561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteger_number6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleinteger_number6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_number_in_entryRulereal_number6663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal_number6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rulereal_number6722 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulereal_number6740 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_rulereal_number6756 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_rulescale_factor_in_rulereal_number6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rulereal_number6820 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_rulescale_factor_in_rulereal_number6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescale_factor_in_entryRulescale_factor6894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulescale_factor6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulescale_factor6944 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_45_in_rulescale_factor6963 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rulescale_factor6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence7032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruledigit_sequence7091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_UNSIGNED_DIGIT_SEQUENCE_in_ruledigit_sequence7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign7159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulesign7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulesign7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel7268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteger_number_in_rulelabel7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant7370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_ruleconstant7430 = new BitSet(new long[]{0x0000C00000000030L});
    public static final BitSet FOLLOW_ruleconstant_identifier_in_ruleconstant7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant7521 = new BitSet(new long[]{0x0000000000000002L});

}