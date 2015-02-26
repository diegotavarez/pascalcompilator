package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
    public static final int T__68=68;
    public static final int RULE_GREATER_THAN_SIGN=28;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_EQUALS_SIGN=24;
    public static final int RULE_ID=38;
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
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int RULE_CARET=20;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_GREATER_OR_EQUALS_SIGN=29;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_COMMA=9;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=23;
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
    public static final int T__76=76;
    public static final int RULE_WS=37;
    public static final int T__75=75;
    public static final int RULE_DIGIT=32;
    public static final int T__74=74;
    public static final int RULE_IG=10;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int RULE_LEFT_BRACKETS=12;
    public static final int T__77=77;
    public static final int RULE_INTEGER_NUMBER=21;

    // delegates
    // delegators

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g"; }

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:11:7: ( 'program' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:11:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:12:7: ( 'label' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:12:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:13:7: ( 'const' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:13:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:14:7: ( 'type' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:14:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:15:7: ( 'var' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:15:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:16:7: ( 'procedure' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:16:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:17:7: ( 'function' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:17:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:18:7: ( 'begin' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:18:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:19:7: ( 'end' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:19:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:20:7: ( 'packed array' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:20:9: 'packed array'
            {
            match("packed array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:21:7: ( 'of' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:21:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:22:7: ( 'array' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:22:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:23:7: ( 'variable' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:23:9: 'variable'
            {
            match("variable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:24:7: ( 'ActualParameterList' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:24:9: 'ActualParameterList'
            {
            match("ActualParameterList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:25:7: ( 'goto' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:25:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:26:7: ( 'while' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:26:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:27:7: ( 'do' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:27:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:28:7: ( 'repeat' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:28:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:29:7: ( 'until' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:29:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:30:7: ( 'for' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:30:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:31:7: ( 'to' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:31:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:32:7: ( 'downto' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:32:9: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:33:7: ( 'if' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:33:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:34:7: ( 'then' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:34:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:35:7: ( 'else' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:35:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:36:7: ( 'case' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:36:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:37:7: ( 'with' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:37:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:38:7: ( '+' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:38:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:39:7: ( '-' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:40:7: ( 'nil' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:40:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:41:7: ( 'not' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:41:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:42:7: ( 'actualParameterList' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:42:9: 'actualParameterList'
            {
            match("actualParameterList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:43:7: ( 'boolean' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:43:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:44:7: ( 'char' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:44:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:45:7: ( 'integer' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:45:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:46:7: ( 'real' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:46:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:47:7: ( 'packed' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:47:9: 'packed'
            {
            match("packed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:48:7: ( 'record' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:48:9: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:49:7: ( 'set' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:49:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:50:7: ( 'file' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:50:9: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "RULE_UNSIGNED_DIGIT_SEQUENCE"
    public final void mRULE_UNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED_DIGIT_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5506:30: ( '0' .. '9' ( '0' .. '9' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5506:32: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5506:41: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5506:42: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_RELATIONALOPERATOR"
    public final void mRULE_RELATIONALOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_RELATIONALOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:25: ( ( RULE_EQUALS_SIGN | RULE_DIFFERENT_SIGN | RULE_LESS_THAN_SIGN | RULE_LESS_OR_EQUALS_SIGN | RULE_GREATER_THAN_SIGN | RULE_GREATER_OR_EQUALS_SIGN | 'in' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:27: ( RULE_EQUALS_SIGN | RULE_DIFFERENT_SIGN | RULE_LESS_THAN_SIGN | RULE_LESS_OR_EQUALS_SIGN | RULE_GREATER_THAN_SIGN | RULE_GREATER_OR_EQUALS_SIGN | 'in' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:27: ( RULE_EQUALS_SIGN | RULE_DIFFERENT_SIGN | RULE_LESS_THAN_SIGN | RULE_LESS_OR_EQUALS_SIGN | RULE_GREATER_THAN_SIGN | RULE_GREATER_OR_EQUALS_SIGN | 'in' )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:28: RULE_EQUALS_SIGN
                    {
                    mRULE_EQUALS_SIGN(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:45: RULE_DIFFERENT_SIGN
                    {
                    mRULE_DIFFERENT_SIGN(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:65: RULE_LESS_THAN_SIGN
                    {
                    mRULE_LESS_THAN_SIGN(); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:85: RULE_LESS_OR_EQUALS_SIGN
                    {
                    mRULE_LESS_OR_EQUALS_SIGN(); 

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:110: RULE_GREATER_THAN_SIGN
                    {
                    mRULE_GREATER_THAN_SIGN(); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:133: RULE_GREATER_OR_EQUALS_SIGN
                    {
                    mRULE_GREATER_OR_EQUALS_SIGN(); 

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5508:161: 'in'
                    {
                    match("in"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RELATIONALOPERATOR"

    // $ANTLR start "RULE_ADDITIONOPERATOR"
    public final void mRULE_ADDITIONOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_ADDITIONOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5510:23: ( ( '+' | '-' | 'or' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5510:25: ( '+' | '-' | 'or' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5510:25: ( '+' | '-' | 'or' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt3=1;
                }
                break;
            case '-':
                {
                alt3=2;
                }
                break;
            case 'o':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5510:26: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5510:30: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5510:34: 'or'
                    {
                    match("or"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDITIONOPERATOR"

    // $ANTLR start "RULE_MULTIPLICATIONOPERATOR"
    public final void mRULE_MULTIPLICATIONOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICATIONOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5512:29: ( ( RULE_MULTIP_SIGN | RULE_DIV_SIGN | 'div' | 'mod' | 'and' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5512:31: ( RULE_MULTIP_SIGN | RULE_DIV_SIGN | 'div' | 'mod' | 'and' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5512:31: ( RULE_MULTIP_SIGN | RULE_DIV_SIGN | 'div' | 'mod' | 'and' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt4=1;
                }
                break;
            case '/':
                {
                alt4=2;
                }
                break;
            case 'd':
                {
                alt4=3;
                }
                break;
            case 'm':
                {
                alt4=4;
                }
                break;
            case 'a':
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5512:32: RULE_MULTIP_SIGN
                    {
                    mRULE_MULTIP_SIGN(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5512:49: RULE_DIV_SIGN
                    {
                    mRULE_DIV_SIGN(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5512:63: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5512:69: 'mod'
                    {
                    match("mod"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5512:75: 'and'
                    {
                    match("and"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICATIONOPERATOR"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5514:21: ( ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5514:23: ( '+' | '-' )? ( RULE_DIGIT )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5514:23: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5514:34: ( RULE_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5514:34: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_REAL_NUMBER"
    public final void mRULE_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:18: ( ( '+' | '-' )? ( RULE_DIGIT )+ ( RULE_DOT ( RULE_DIGIT )* ( RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+ )? | RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+ ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:20: ( '+' | '-' )? ( RULE_DIGIT )+ ( RULE_DOT ( RULE_DIGIT )* ( RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+ )? | RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+ )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:20: ( '+' | '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:31: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:31: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:43: ( RULE_DOT ( RULE_DIGIT )* ( RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+ )? | RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+ )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='.') ) {
                alt15=1;
            }
            else if ( (LA15_0=='E'||LA15_0=='e') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:44: RULE_DOT ( RULE_DIGIT )* ( RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+ )?
                    {
                    mRULE_DOT(); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:53: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:53: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:65: ( RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+ )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:66: RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+
                            {
                            mRULE_EXPOENTE(); 
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:80: ( '+' | '-' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0=='+'||LA10_0=='-') ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:91: ( RULE_DIGIT )+
                            int cnt11=0;
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:91: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt11 >= 1 ) break loop11;
                                        EarlyExitException eee =
                                            new EarlyExitException(11, input);
                                        throw eee;
                                }
                                cnt11++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:105: RULE_EXPOENTE ( '+' | '-' )? ( RULE_DIGIT )+
                    {
                    mRULE_EXPOENTE(); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:119: ( '+' | '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='+'||LA13_0=='-') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:130: ( RULE_DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5516:130: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_NUMBER"

    // $ANTLR start "RULE_STRING1"
    public final void mRULE_STRING1() throws RecognitionException {
        try {
            int _type = RULE_STRING1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5518:14: ( RULE_ASPASSIMPLES RULE_STRINGCHARACTER ( RULE_STRINGCHARACTER )* RULE_ASPASSIMPLES )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5518:16: RULE_ASPASSIMPLES RULE_STRINGCHARACTER ( RULE_STRINGCHARACTER )* RULE_ASPASSIMPLES
            {
            mRULE_ASPASSIMPLES(); 
            mRULE_STRINGCHARACTER(); 
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5518:55: ( RULE_STRINGCHARACTER )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\'') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='\'') ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5518:55: RULE_STRINGCHARACTER
            	    {
            	    mRULE_STRINGCHARACTER(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            mRULE_ASPASSIMPLES(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING1"

    // $ANTLR start "RULE_STRINGCHARACTER"
    public final void mRULE_STRINGCHARACTER() throws RecognitionException {
        try {
            int _type = RULE_STRINGCHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5520:22: ( ( '\\'\\'' | ( RULE_LETTER | RULE_DIGIT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5520:24: ( '\\'\\'' | ( RULE_LETTER | RULE_DIGIT ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5520:24: ( '\\'\\'' | ( RULE_LETTER | RULE_DIGIT ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\'') ) {
                alt17=1;
            }
            else if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||(LA17_0>='a' && LA17_0<='z')) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5520:25: '\\'\\''
                    {
                    match("''"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5520:32: ( RULE_LETTER | RULE_DIGIT )
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRINGCHARACTER"

    // $ANTLR start "RULE_DIFFERENT_SIGN"
    public final void mRULE_DIFFERENT_SIGN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5522:30: ( '<>' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5522:32: '<>'
            {
            match("<>"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIFFERENT_SIGN"

    // $ANTLR start "RULE_LESS_THAN_SIGN"
    public final void mRULE_LESS_THAN_SIGN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5524:30: ( '<' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5524:32: '<'
            {
            match('<'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_THAN_SIGN"

    // $ANTLR start "RULE_LESS_OR_EQUALS_SIGN"
    public final void mRULE_LESS_OR_EQUALS_SIGN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5526:35: ( '<=' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5526:37: '<='
            {
            match("<="); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_OR_EQUALS_SIGN"

    // $ANTLR start "RULE_GREATER_THAN_SIGN"
    public final void mRULE_GREATER_THAN_SIGN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5528:33: ( '>' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5528:35: '>'
            {
            match('>'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER_THAN_SIGN"

    // $ANTLR start "RULE_GREATER_OR_EQUALS_SIGN"
    public final void mRULE_GREATER_OR_EQUALS_SIGN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5530:38: ( '>=' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5530:40: '>='
            {
            match(">="); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER_OR_EQUALS_SIGN"

    // $ANTLR start "RULE_MULTIP_SIGN"
    public final void mRULE_MULTIP_SIGN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5532:27: ( '*' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5532:29: '*'
            {
            match('*'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIP_SIGN"

    // $ANTLR start "RULE_DIV_SIGN"
    public final void mRULE_DIV_SIGN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5534:24: ( '/' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5534:26: '/'
            {
            match('/'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIV_SIGN"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5536:16: ( ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5536:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5538:12: ( ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5538:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5540:10: ( '.' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5540:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5542:12: ( ':' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5542:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_ASSIGNMENT_SIGN"
    public final void mRULE_ASSIGNMENT_SIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGNMENT_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5544:22: ( ':=' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5544:24: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGNMENT_SIGN"

    // $ANTLR start "RULE_LEFT_PARENTHESIS"
    public final void mRULE_LEFT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RULE_LEFT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5546:23: ( '(' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5546:25: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_PARENTHESIS"

    // $ANTLR start "RULE_RIGHT_PARENTHESIS"
    public final void mRULE_RIGHT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5548:24: ( ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5548:26: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_PARENTHESIS"

    // $ANTLR start "RULE_LEFT_BRACKETS"
    public final void mRULE_LEFT_BRACKETS() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5550:20: ( '[' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5550:22: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACKETS"

    // $ANTLR start "RULE_RIGHT_BRACKETS"
    public final void mRULE_RIGHT_BRACKETS() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5552:21: ( ']' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5552:23: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACKETS"

    // $ANTLR start "RULE_DIAERESIS"
    public final void mRULE_DIAERESIS() throws RecognitionException {
        try {
            int _type = RULE_DIAERESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5554:16: ( '..' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5554:18: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIAERESIS"

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5556:12: ( '^' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5556:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARET"

    // $ANTLR start "RULE_ASPASSIMPLES"
    public final void mRULE_ASPASSIMPLES() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5558:28: ( '\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5558:30: '\\''
            {
            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASPASSIMPLES"

    // $ANTLR start "RULE_EQUALS_SIGN"
    public final void mRULE_EQUALS_SIGN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5560:27: ( '==' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5560:29: '=='
            {
            match("=="); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS_SIGN"

    // $ANTLR start "RULE_IG"
    public final void mRULE_IG() throws RecognitionException {
        try {
            int _type = RULE_IG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5562:9: ( '=' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5562:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IG"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5564:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5564:24: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5566:21: ( '0' .. '9' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5566:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_EXPOENTE"
    public final void mRULE_EXPOENTE() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5568:24: ( ( 'E' | 'e' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5568:26: ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPOENTE"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5570:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5570:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5570:43: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5572:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5572:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5572:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5574:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5574:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5574:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5574:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5574:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5576:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5576:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5576:12: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5576:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\"') ) {
                alt25=1;
            }
            else if ( (LA25_0=='\'') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5578:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5580:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5580:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5580:24: ( options {greedy=false; } : . )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='*') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='/') ) {
                        alt26=2;
                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<=')')||(LA26_0>='+' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5580:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5582:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5582:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5582:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5582:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5582:40: ( ( '\\r' )? '\\n' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5582:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5582:41: ( '\\r' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='\r') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5582:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5584:16: ( . )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:5584:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:8: ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_RELATIONALOPERATOR | RULE_ADDITIONOPERATOR | RULE_MULTIPLICATIONOPERATOR | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_STRING1 | RULE_STRINGCHARACTER | RULE_SEMICOLON | RULE_COMMA | RULE_DOT | RULE_COLON | RULE_ASSIGNMENT_SIGN | RULE_LEFT_PARENTHESIS | RULE_RIGHT_PARENTHESIS | RULE_LEFT_BRACKETS | RULE_RIGHT_BRACKETS | RULE_DIAERESIS | RULE_CARET | RULE_IG | RULE_IDENTIFIER | RULE_WS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt30=68;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:10: T__44
                {
                mT__44(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:16: T__45
                {
                mT__45(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:22: T__46
                {
                mT__46(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:28: T__47
                {
                mT__47(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:34: T__48
                {
                mT__48(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:40: T__49
                {
                mT__49(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:46: T__50
                {
                mT__50(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:52: T__51
                {
                mT__51(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:58: T__52
                {
                mT__52(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:64: T__53
                {
                mT__53(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:70: T__54
                {
                mT__54(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:76: T__55
                {
                mT__55(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:82: T__56
                {
                mT__56(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:88: T__57
                {
                mT__57(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:94: T__58
                {
                mT__58(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:100: T__59
                {
                mT__59(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:106: T__60
                {
                mT__60(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:112: T__61
                {
                mT__61(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:118: T__62
                {
                mT__62(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:124: T__63
                {
                mT__63(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:130: T__64
                {
                mT__64(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:136: T__65
                {
                mT__65(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:142: T__66
                {
                mT__66(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:148: T__67
                {
                mT__67(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:154: T__68
                {
                mT__68(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:160: T__69
                {
                mT__69(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:166: T__70
                {
                mT__70(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:172: T__71
                {
                mT__71(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:178: T__72
                {
                mT__72(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:184: T__73
                {
                mT__73(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:190: T__74
                {
                mT__74(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:196: T__75
                {
                mT__75(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:202: T__76
                {
                mT__76(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:208: T__77
                {
                mT__77(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:214: T__78
                {
                mT__78(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:220: T__79
                {
                mT__79(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:226: T__80
                {
                mT__80(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:232: T__81
                {
                mT__81(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:238: T__82
                {
                mT__82(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:244: T__83
                {
                mT__83(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:250: RULE_UNSIGNED_DIGIT_SEQUENCE
                {
                mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:279: RULE_RELATIONALOPERATOR
                {
                mRULE_RELATIONALOPERATOR(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:303: RULE_ADDITIONOPERATOR
                {
                mRULE_ADDITIONOPERATOR(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:325: RULE_MULTIPLICATIONOPERATOR
                {
                mRULE_MULTIPLICATIONOPERATOR(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:353: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:373: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:390: RULE_STRING1
                {
                mRULE_STRING1(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:403: RULE_STRINGCHARACTER
                {
                mRULE_STRINGCHARACTER(); 

                }
                break;
            case 49 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:424: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 50 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:439: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 51 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:450: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 52 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:459: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 53 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:470: RULE_ASSIGNMENT_SIGN
                {
                mRULE_ASSIGNMENT_SIGN(); 

                }
                break;
            case 54 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:491: RULE_LEFT_PARENTHESIS
                {
                mRULE_LEFT_PARENTHESIS(); 

                }
                break;
            case 55 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:513: RULE_RIGHT_PARENTHESIS
                {
                mRULE_RIGHT_PARENTHESIS(); 

                }
                break;
            case 56 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:536: RULE_LEFT_BRACKETS
                {
                mRULE_LEFT_BRACKETS(); 

                }
                break;
            case 57 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:555: RULE_RIGHT_BRACKETS
                {
                mRULE_RIGHT_BRACKETS(); 

                }
                break;
            case 58 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:575: RULE_DIAERESIS
                {
                mRULE_DIAERESIS(); 

                }
                break;
            case 59 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:590: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 60 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:601: RULE_IG
                {
                mRULE_IG(); 

                }
                break;
            case 61 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:609: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 62 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:625: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 63 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:633: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 64 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:641: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 65 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:650: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 66 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:662: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 67 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:678: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 68 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalPascal.g:1:694: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA2_eotS =
        "\2\uffff\1\7\1\11\6\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\74\1\uffff\2\75\6\uffff";
    static final String DFA2_maxS =
        "\1\151\1\uffff\1\76\1\75\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\7\1\2\1\4\1\3\1\6\1\5";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1\1\3\52\uffff\1\4",
            "",
            "\1\6\1\5",
            "\1\10",
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
            return "5508:27: ( RULE_EQUALS_SIGN | RULE_DIFFERENT_SIGN | RULE_LESS_THAN_SIGN | RULE_LESS_OR_EQUALS_SIGN | RULE_GREATER_THAN_SIGN | RULE_GREATER_OR_EQUALS_SIGN | 'in' )";
        }
    }
    static final String DFA30_eotS =
        "\1\uffff\21\56\1\117\1\120\2\56\1\124\1\130\3\uffff\1\131\1\56"+
        "\1\53\1\56\2\uffff\1\143\1\145\4\uffff\1\152\1\154\1\uffff\1\53"+
        "\1\uffff\2\154\1\uffff\6\154\1\165\11\154\1\177\1\u0080\7\154\1"+
        "\u0089\3\154\1\u008f\1\127\1\u0091\2\uffff\3\154\1\uffff\1\124\6"+
        "\uffff\1\154\1\56\20\uffff\7\154\1\uffff\1\154\1\u00a3\1\154\1\u00a5"+
        "\3\154\1\u00a9\1\154\2\uffff\2\154\1\131\5\154\1\uffff\1\131\4\154"+
        "\1\uffff\1\154\1\uffff\1\u00b7\1\u00b8\1\u00b9\1\131\3\uffff\5\154"+
        "\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\154\1\uffff\1\154\1\uffff\1\u00c5"+
        "\2\154\1\uffff\1\u00c8\3\154\1\u00cc\1\154\1\u00ce\2\154\1\u00d1"+
        "\3\154\3\uffff\3\154\1\u00d8\1\u00d9\4\uffff\2\154\1\uffff\1\u00dc"+
        "\1\154\1\uffff\1\u00de\2\154\1\uffff\1\u00e1\1\uffff\2\154\1\uffff"+
        "\1\154\1\u00e5\3\154\1\u00ea\2\uffff\2\154\1\uffff\1\154\1\uffff"+
        "\2\154\1\uffff\1\u00f0\1\u00f1\1\u00f2\1\uffff\1\154\1\u00f4\1\154"+
        "\2\uffff\2\154\1\u00f8\2\154\3\uffff\1\u00fb\1\uffff\1\154\1\u00fd"+
        "\1\u00fe\1\uffff\2\154\1\uffff\1\u0101\2\uffff\2\154\1\uffff\22"+
        "\154\1\u0116\1\u0117\2\uffff";
    static final String DFA30_eofS =
        "\u0118\uffff";
    static final String DFA30_minS =
        "\1\0\25\60\1\56\1\75\3\uffff\1\52\1\60\1\0\1\60\2\uffff\1\56\1"+
        "\75\4\uffff\1\101\1\60\1\uffff\1\0\1\uffff\2\60\1\uffff\37\60\1"+
        "\56\2\uffff\3\60\1\uffff\1\56\6\uffff\1\60\1\47\1\0\17\uffff\7\60"+
        "\1\uffff\11\60\2\uffff\10\60\1\uffff\5\60\1\uffff\1\60\1\uffff\4"+
        "\60\2\uffff\1\0\12\60\1\uffff\1\60\1\uffff\3\60\1\uffff\15\60\3"+
        "\uffff\5\60\4\uffff\2\60\1\uffff\2\60\1\uffff\3\60\1\uffff\1\60"+
        "\1\uffff\2\60\1\uffff\5\60\1\40\2\uffff\2\60\1\uffff\1\60\1\uffff"+
        "\2\60\1\uffff\3\60\1\uffff\3\60\2\uffff\5\60\3\uffff\1\60\1\uffff"+
        "\3\60\1\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1\uffff\24\60\2\uffff";
    static final String DFA30_maxS =
        "\1\uffff\21\172\2\71\2\172\1\145\1\75\3\uffff\1\57\1\172\1\uffff"+
        "\1\172\2\uffff\1\56\1\75\4\uffff\2\172\1\uffff\1\uffff\1\uffff\2"+
        "\172\1\uffff\37\172\1\145\2\uffff\3\172\1\uffff\1\145\6\uffff\1"+
        "\172\1\47\1\uffff\17\uffff\7\172\1\uffff\11\172\2\uffff\10\172\1"+
        "\uffff\5\172\1\uffff\1\172\1\uffff\4\172\2\uffff\1\uffff\12\172"+
        "\1\uffff\1\172\1\uffff\3\172\1\uffff\15\172\3\uffff\5\172\4\uffff"+
        "\2\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\1"+
        "\uffff\6\172\2\uffff\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\3"+
        "\172\1\uffff\3\172\2\uffff\5\172\3\uffff\1\172\1\uffff\3\172\1\uffff"+
        "\2\172\1\uffff\1\172\2\uffff\2\172\1\uffff\24\172\2\uffff";
    static final String DFA30_acceptS =
        "\30\uffff\2\52\1\54\4\uffff\1\61\1\62\2\uffff\1\66\1\67\1\70\1"+
        "\71\2\uffff\1\76\1\uffff\1\104\2\uffff\1\60\40\uffff\1\34\1\35\3"+
        "\uffff\1\51\1\uffff\1\56\1\52\1\74\1\54\1\102\1\103\3\uffff\1\101"+
        "\1\61\1\62\1\72\1\63\1\65\1\64\1\66\1\67\1\70\1\71\1\73\1\77\1\75"+
        "\1\76\7\uffff\1\25\11\uffff\1\13\1\53\10\uffff\1\21\5\uffff\1\27"+
        "\1\uffff\1\55\4\uffff\2\57\13\uffff\1\5\1\uffff\1\24\3\uffff\1\11"+
        "\15\uffff\1\36\1\37\1\47\5\uffff\1\32\1\42\1\4\1\30\2\uffff\1\50"+
        "\2\uffff\1\31\3\uffff\1\17\1\uffff\1\33\2\uffff\1\44\6\uffff\1\2"+
        "\1\3\2\uffff\1\10\1\uffff\1\14\2\uffff\1\20\3\uffff\1\23\3\uffff"+
        "\1\12\1\45\5\uffff\1\26\1\22\1\46\1\uffff\1\1\3\uffff\1\41\2\uffff"+
        "\1\43\1\uffff\1\15\1\7\2\uffff\1\6\24\uffff\1\40\1\16";
    static final String DFA30_specialS =
        "\1\1\34\uffff\1\2\14\uffff\1\4\63\uffff\1\3\71\uffff\1\0\177\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\53\2\51\2\53\1\51\22\53\1\51\1\53\1\52\4\53\1\35\1\43\1"+
            "\44\1\32\1\22\1\40\1\23\1\41\1\33\12\26\1\42\1\37\1\30\1\27"+
            "\1\31\2\53\1\13\31\36\1\45\1\53\1\46\1\47\1\50\1\53\1\12\1\7"+
            "\1\3\1\16\1\10\1\6\1\14\1\36\1\21\2\36\1\2\1\34\1\24\1\11\1"+
            "\1\1\36\1\17\1\25\1\4\1\20\1\5\1\15\3\36\uff85\53",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\55\20\57\1\54"+
            "\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\60\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\62\6\57\1\63\6"+
            "\57\1\61\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\66\6\57\1"+
            "\65\11\57\1\64\1\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\67\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\72\5\57"+
            "\1\71\5\57\1\70\5\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\73\11\57"+
            "\1\74\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\76\1\57"+
            "\1\75\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\77\13\57"+
            "\1\100\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\102\12\57"+
            "\1\103\3\57\1\101\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\104\27\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\105\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\106\1\107"+
            "\21\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\111\5\57"+
            "\1\110\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\112\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\113\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\114\7\57"+
            "\1\115\14\57",
            "\12\116",
            "\12\116",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\121\5\57"+
            "\1\122\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\123\25\57",
            "\1\126\1\uffff\12\125\13\uffff\1\126\37\uffff\1\126",
            "\1\127",
            "",
            "",
            "",
            "\1\132\4\uffff\1\133",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\134\13\57",
            "\47\137\1\135\10\137\12\136\7\137\32\136\6\137\32\136\uff85"+
            "\137",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\142",
            "\1\144",
            "",
            "",
            "",
            "",
            "\32\153\4\uffff\1\153\1\uffff\32\153",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\0\137",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\156\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\157\27\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\160\30\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\161\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\162\7\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\163\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\164\12\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\166\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\167\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\170\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\171\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\172\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\173\23\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\174\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\175\26\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\176\7\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0081\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0082\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u0083\26"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0084\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0085\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0086\21"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0087\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\26\57\1\u0088\3"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u008a\4"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u008c\1\57\1\u008d"+
            "\14\57\1\u008b\12\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u008e\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0090\6"+
            "\57",
            "\1\126\1\uffff\12\116\13\uffff\1\126\37\uffff\1\126",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0092\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0093\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0094\6"+
            "\57",
            "",
            "\1\126\1\uffff\12\125\13\uffff\1\126\37\uffff\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u0095\26"+
            "\57",
            "\1\u0096",
            "\47\137\1\u0097\10\137\12\u0098\7\137\32\u0098\6\137\32\u0098"+
            "\uff85\137",
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
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u009a\3\57"+
            "\1\u0099\23\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\12\57\1\u009b\17"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u009c\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u009d\7"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u009e\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u009f\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a0\25"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00a1\14"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00a2\21"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00a4\27"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a6\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00a7\21"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00a8\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00aa\25"+
            "\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00ab\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00ac\5"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00ad\5"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00ae\13"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00af\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u00b0\22"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00b1\14"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b2\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00b3\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00b4\13"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b5\21"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b6\25"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\47\137\1\u0097\10\137\12\u0098\7\137\32\u0098\6\137\32\u0098"+
            "\uff85\137",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00ba\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00bb\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00bc\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00bd\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00be\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00c3\31\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00c4\6"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00c6\14"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c7\25"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u00c9\1"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00ca\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00cb\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00cd\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00cf\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00d0\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00d2\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00d3\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u00d4\23"+
            "\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00d5\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00d6\26"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00d7\26"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00da\30"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00db\21"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00dd\31\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00df\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00e0\16"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00e2\13"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00e3\6"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00e4\26"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00e6\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00e7\15"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00e8\5"+
            "\57",
            "\1\u00e9\17\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00eb\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00ec\13"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00ed\14"+
            "\57",
            "",
            "\12\57\7\uffff\17\57\1\u00ee\12\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\12\57\7\uffff\17\57\1\u00ef\12\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00f3\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00f5\10"+
            "\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00f6\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00f7\14"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00f9\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00fa\31\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00fc\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00ff\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0100\10"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u0102\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u0103\31\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0104\15"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0105\15"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0106\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0107\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0108\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0109\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u010a\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u010b\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u010c\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u010d\10"+
            "\57",
            "\12\57\7\uffff\13\57\1\u010e\16\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\12\57\7\uffff\13\57\1\u010f\16\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0110\21"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0111\21"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0112\7"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0113\7"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0114\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0115\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_RELATIONALOPERATOR | RULE_ADDITIONOPERATOR | RULE_MULTIPLICATIONOPERATOR | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_STRING1 | RULE_STRINGCHARACTER | RULE_SEMICOLON | RULE_COMMA | RULE_DOT | RULE_COLON | RULE_ASSIGNMENT_SIGN | RULE_LEFT_PARENTHESIS | RULE_RIGHT_PARENTHESIS | RULE_LEFT_BRACKETS | RULE_RIGHT_BRACKETS | RULE_DIAERESIS | RULE_CARET | RULE_IG | RULE_IDENTIFIER | RULE_WS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_152 = input.LA(1);

                        s = -1;
                        if ( (LA30_152=='\'') ) {s = 151;}

                        else if ( ((LA30_152>='0' && LA30_152<='9')||(LA30_152>='A' && LA30_152<='Z')||(LA30_152>='a' && LA30_152<='z')) ) {s = 152;}

                        else if ( ((LA30_152>='\u0000' && LA30_152<='&')||(LA30_152>='(' && LA30_152<='/')||(LA30_152>=':' && LA30_152<='@')||(LA30_152>='[' && LA30_152<='`')||(LA30_152>='{' && LA30_152<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='p') ) {s = 1;}

                        else if ( (LA30_0=='l') ) {s = 2;}

                        else if ( (LA30_0=='c') ) {s = 3;}

                        else if ( (LA30_0=='t') ) {s = 4;}

                        else if ( (LA30_0=='v') ) {s = 5;}

                        else if ( (LA30_0=='f') ) {s = 6;}

                        else if ( (LA30_0=='b') ) {s = 7;}

                        else if ( (LA30_0=='e') ) {s = 8;}

                        else if ( (LA30_0=='o') ) {s = 9;}

                        else if ( (LA30_0=='a') ) {s = 10;}

                        else if ( (LA30_0=='A') ) {s = 11;}

                        else if ( (LA30_0=='g') ) {s = 12;}

                        else if ( (LA30_0=='w') ) {s = 13;}

                        else if ( (LA30_0=='d') ) {s = 14;}

                        else if ( (LA30_0=='r') ) {s = 15;}

                        else if ( (LA30_0=='u') ) {s = 16;}

                        else if ( (LA30_0=='i') ) {s = 17;}

                        else if ( (LA30_0=='+') ) {s = 18;}

                        else if ( (LA30_0=='-') ) {s = 19;}

                        else if ( (LA30_0=='n') ) {s = 20;}

                        else if ( (LA30_0=='s') ) {s = 21;}

                        else if ( ((LA30_0>='0' && LA30_0<='9')) ) {s = 22;}

                        else if ( (LA30_0=='=') ) {s = 23;}

                        else if ( (LA30_0=='<') ) {s = 24;}

                        else if ( (LA30_0=='>') ) {s = 25;}

                        else if ( (LA30_0=='*') ) {s = 26;}

                        else if ( (LA30_0=='/') ) {s = 27;}

                        else if ( (LA30_0=='m') ) {s = 28;}

                        else if ( (LA30_0=='\'') ) {s = 29;}

                        else if ( ((LA30_0>='B' && LA30_0<='Z')||LA30_0=='h'||(LA30_0>='j' && LA30_0<='k')||LA30_0=='q'||(LA30_0>='x' && LA30_0<='z')) ) {s = 30;}

                        else if ( (LA30_0==';') ) {s = 31;}

                        else if ( (LA30_0==',') ) {s = 32;}

                        else if ( (LA30_0=='.') ) {s = 33;}

                        else if ( (LA30_0==':') ) {s = 34;}

                        else if ( (LA30_0=='(') ) {s = 35;}

                        else if ( (LA30_0==')') ) {s = 36;}

                        else if ( (LA30_0=='[') ) {s = 37;}

                        else if ( (LA30_0==']') ) {s = 38;}

                        else if ( (LA30_0=='^') ) {s = 39;}

                        else if ( (LA30_0=='_') ) {s = 40;}

                        else if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {s = 41;}

                        else if ( (LA30_0=='\"') ) {s = 42;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\u001F')||LA30_0=='!'||(LA30_0>='#' && LA30_0<='&')||(LA30_0>='?' && LA30_0<='@')||LA30_0=='\\'||LA30_0=='`'||(LA30_0>='{' && LA30_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_29 = input.LA(1);

                        s = -1;
                        if ( (LA30_29=='\'') ) {s = 93;}

                        else if ( ((LA30_29>='0' && LA30_29<='9')||(LA30_29>='A' && LA30_29<='Z')||(LA30_29>='a' && LA30_29<='z')) ) {s = 94;}

                        else if ( ((LA30_29>='\u0000' && LA30_29<='&')||(LA30_29>='(' && LA30_29<='/')||(LA30_29>=':' && LA30_29<='@')||(LA30_29>='[' && LA30_29<='`')||(LA30_29>='{' && LA30_29<='\uFFFF')) ) {s = 95;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_94 = input.LA(1);

                        s = -1;
                        if ( (LA30_94=='\'') ) {s = 151;}

                        else if ( ((LA30_94>='0' && LA30_94<='9')||(LA30_94>='A' && LA30_94<='Z')||(LA30_94>='a' && LA30_94<='z')) ) {s = 152;}

                        else if ( ((LA30_94>='\u0000' && LA30_94<='&')||(LA30_94>='(' && LA30_94<='/')||(LA30_94>=':' && LA30_94<='@')||(LA30_94>='[' && LA30_94<='`')||(LA30_94>='{' && LA30_94<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_42 = input.LA(1);

                        s = -1;
                        if ( ((LA30_42>='\u0000' && LA30_42<='\uFFFF')) ) {s = 95;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}