package org.xtext.lisa.patientdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPatientDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_EMAIL=6;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalPatientDslLexer() {;} 
    public InternalPatientDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPatientDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPatientDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:11:7: ( 'private' )
            // InternalPatientDsl.g:11:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:12:7: ( 'compulsory' )
            // InternalPatientDsl.g:12:9: 'compulsory'
            {
            match("compulsory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:13:7: ( 'patient' )
            // InternalPatientDsl.g:13:9: 'patient'
            {
            match("patient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:14:7: ( 'insuranceType' )
            // InternalPatientDsl.g:14:9: 'insuranceType'
            {
            match("insuranceType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:15:7: ( 'insuranceNumber' )
            // InternalPatientDsl.g:15:9: 'insuranceNumber'
            {
            match("insuranceNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:16:7: ( 'email' )
            // InternalPatientDsl.g:16:9: 'email'
            {
            match("email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:17:7: ( 'phoneNumber' )
            // InternalPatientDsl.g:17:9: 'phoneNumber'
            {
            match("phoneNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_EMAIL"
    public final void mRULE_EMAIL() throws RecognitionException {
        try {
            int _type = RULE_EMAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:553:12: ( RULE_ID '@' RULE_ID '.' RULE_ID )
            // InternalPatientDsl.g:553:14: RULE_ID '@' RULE_ID '.' RULE_ID
            {
            mRULE_ID(); 
            match('@'); 
            mRULE_ID(); 
            match('.'); 
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EMAIL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:555:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPatientDsl.g:555:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPatientDsl.g:555:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPatientDsl.g:555:11: '^'
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

            // InternalPatientDsl.g:555:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPatientDsl.g:
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
            	    break loop2;
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
            // InternalPatientDsl.g:557:10: ( ( '0' .. '9' )+ )
            // InternalPatientDsl.g:557:12: ( '0' .. '9' )+
            {
            // InternalPatientDsl.g:557:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPatientDsl.g:557:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalPatientDsl.g:559:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPatientDsl.g:559:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPatientDsl.g:559:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPatientDsl.g:559:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPatientDsl.g:559:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPatientDsl.g:559:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPatientDsl.g:559:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPatientDsl.g:559:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPatientDsl.g:559:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPatientDsl.g:559:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPatientDsl.g:559:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalPatientDsl.g:561:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPatientDsl.g:561:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPatientDsl.g:561:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPatientDsl.g:561:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalPatientDsl.g:563:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPatientDsl.g:563:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPatientDsl.g:563:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPatientDsl.g:563:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalPatientDsl.g:563:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPatientDsl.g:563:41: ( '\\r' )? '\\n'
                    {
                    // InternalPatientDsl.g:563:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPatientDsl.g:563:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:565:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPatientDsl.g:565:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPatientDsl.g:565:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPatientDsl.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPatientDsl.g:567:16: ( . )
            // InternalPatientDsl.g:567:18: .
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
        // InternalPatientDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_EMAIL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=15;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPatientDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalPatientDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalPatientDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalPatientDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalPatientDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalPatientDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalPatientDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalPatientDsl.g:1:52: RULE_EMAIL
                {
                mRULE_EMAIL(); 

                }
                break;
            case 9 :
                // InternalPatientDsl.g:1:63: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // InternalPatientDsl.g:1:71: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // InternalPatientDsl.g:1:80: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // InternalPatientDsl.g:1:92: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // InternalPatientDsl.g:1:108: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // InternalPatientDsl.g:1:124: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // InternalPatientDsl.g:1:132: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\21\1\14\1\21\1\uffff\3\14\2\uffff\4\21\2\uffff\4\21\5\uffff\21\21\1\63\5\21\1\uffff\1\71\1\72\3\21\2\uffff\7\21\1\106\2\21\1\111\1\uffff\2\21\1\uffff\2\21\1\116\1\21\1\uffff\1\21\1\121\1\uffff";
    static final String DFA12_eofS =
        "\122\uffff";
    static final String DFA12_minS =
        "\1\0\4\60\1\101\1\60\1\uffff\2\0\1\52\2\uffff\4\60\2\uffff\4\60\5\uffff\27\60\1\uffff\5\60\2\uffff\13\60\1\uffff\2\60\1\uffff\4\60\1\uffff\2\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\6\172\1\uffff\2\uffff\1\57\2\uffff\4\172\2\uffff\4\172\5\uffff\27\172\1\uffff\5\172\2\uffff\13\172\1\uffff\2\172\1\uffff\4\172\1\uffff\2\172\1\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\12\3\uffff\1\16\1\17\4\uffff\1\11\1\10\4\uffff\1\12\1\13\1\14\1\15\1\16\27\uffff\1\6\5\uffff\1\1\1\3\13\uffff\1\2\2\uffff\1\7\4\uffff\1\4\2\uffff\1\5";
    static final String DFA12_specialS =
        "\1\0\7\uffff\1\1\1\2\110\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\10\4\14\1\11\7\14\1\12\12\7\7\14\32\6\3\14\1\5\1\6\1\14\2\6\1\2\1\6\1\4\3\6\1\3\6\6\1\1\12\6\uff85\14",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\1\16\6\20\1\17\11\20\1\15\10\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\16\20\1\23\13\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\15\20\1\24\14\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\14\20\1\25\15\20",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\0\30",
            "\0\30",
            "\1\31\4\uffff\1\32",
            "",
            "",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\10\20\1\34\21\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\23\20\1\35\6\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\16\20\1\36\13\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\14\20\1\37\15\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\22\20\1\40\7\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\1\41\31\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "",
            "",
            "",
            "",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\25\20\1\42\4\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\10\20\1\43\21\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\15\20\1\44\14\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\17\20\1\45\12\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\24\20\1\46\5\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\10\20\1\47\21\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\1\50\31\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\4\20\1\51\25\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\4\20\1\52\25\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\24\20\1\53\5\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\21\20\1\54\10\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\13\20\1\55\16\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\23\20\1\56\6\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\15\20\1\57\14\20",
            "\12\20\6\uffff\1\22\15\20\1\60\14\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\13\20\1\61\16\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\1\62\31\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\4\20\1\64\25\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\23\20\1\65\6\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\24\20\1\66\5\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\22\20\1\67\7\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\15\20\1\70\14\20",
            "",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\14\20\1\73\15\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\16\20\1\74\13\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\2\20\1\75\27\20",
            "",
            "",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\1\20\1\76\30\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\21\20\1\77\10\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\4\20\1\100\25\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\4\20\1\101\25\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\30\20\1\102\1\20",
            "\12\20\6\uffff\1\22\15\20\1\104\5\20\1\103\6\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\21\20\1\105\10\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\30\20\1\107\1\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\24\20\1\110\5\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\17\20\1\112\12\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\14\20\1\113\15\20",
            "",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\4\20\1\114\25\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\1\20\1\115\30\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\4\20\1\117\25\20",
            "",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\21\20\1\120\10\20",
            "\12\20\6\uffff\1\22\32\20\4\uffff\1\20\1\uffff\32\20",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_EMAIL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='c') ) {s = 2;}

                        else if ( (LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='e') ) {s = 4;}

                        else if ( (LA12_0=='^') ) {s = 5;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||LA12_0=='d'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='z')) ) {s = 6;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 7;}

                        else if ( (LA12_0=='\"') ) {s = 8;}

                        else if ( (LA12_0=='\'') ) {s = 9;}

                        else if ( (LA12_0=='/') ) {s = 10;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 11;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_8 = input.LA(1);

                        s = -1;
                        if ( ((LA12_8>='\u0000' && LA12_8<='\uFFFF')) ) {s = 24;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_9 = input.LA(1);

                        s = -1;
                        if ( ((LA12_9>='\u0000' && LA12_9<='\uFFFF')) ) {s = 24;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}