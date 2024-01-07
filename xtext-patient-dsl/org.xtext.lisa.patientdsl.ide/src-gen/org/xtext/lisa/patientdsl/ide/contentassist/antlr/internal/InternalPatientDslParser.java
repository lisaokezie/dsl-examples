package org.xtext.lisa.patientdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.lisa.patientdsl.services.PatientDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPatientDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_EMAIL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'compulsory'", "'patient'", "'insuranceType'", "'insuranceNumber'", "'email'", "'phoneNumber'"
    };
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


        public InternalPatientDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPatientDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPatientDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPatientDsl.g"; }


    	private PatientDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(PatientDslGrammarAccess grammarAccess) {
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
    // InternalPatientDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPatientDsl.g:54:1: ( ruleModel EOF )
            // InternalPatientDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPatientDsl.g:62:1: ruleModel : ( ( rule__Model__PatientsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:66:2: ( ( ( rule__Model__PatientsAssignment )* ) )
            // InternalPatientDsl.g:67:2: ( ( rule__Model__PatientsAssignment )* )
            {
            // InternalPatientDsl.g:67:2: ( ( rule__Model__PatientsAssignment )* )
            // InternalPatientDsl.g:68:3: ( rule__Model__PatientsAssignment )*
            {
             before(grammarAccess.getModelAccess().getPatientsAssignment()); 
            // InternalPatientDsl.g:69:3: ( rule__Model__PatientsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPatientDsl.g:69:4: rule__Model__PatientsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__PatientsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPatientsAssignment()); 

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


    // $ANTLR start "entryRulePatient"
    // InternalPatientDsl.g:78:1: entryRulePatient : rulePatient EOF ;
    public final void entryRulePatient() throws RecognitionException {
        try {
            // InternalPatientDsl.g:79:1: ( rulePatient EOF )
            // InternalPatientDsl.g:80:1: rulePatient EOF
            {
             before(grammarAccess.getPatientRule()); 
            pushFollow(FOLLOW_1);
            rulePatient();

            state._fsp--;

             after(grammarAccess.getPatientRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatient"


    // $ANTLR start "rulePatient"
    // InternalPatientDsl.g:87:1: rulePatient : ( ( rule__Patient__Group__0 ) ) ;
    public final void rulePatient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:91:2: ( ( ( rule__Patient__Group__0 ) ) )
            // InternalPatientDsl.g:92:2: ( ( rule__Patient__Group__0 ) )
            {
            // InternalPatientDsl.g:92:2: ( ( rule__Patient__Group__0 ) )
            // InternalPatientDsl.g:93:3: ( rule__Patient__Group__0 )
            {
             before(grammarAccess.getPatientAccess().getGroup()); 
            // InternalPatientDsl.g:94:3: ( rule__Patient__Group__0 )
            // InternalPatientDsl.g:94:4: rule__Patient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getGroup()); 

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
    // $ANTLR end "rulePatient"


    // $ANTLR start "ruleInsuranceType"
    // InternalPatientDsl.g:103:1: ruleInsuranceType : ( ( rule__InsuranceType__Alternatives ) ) ;
    public final void ruleInsuranceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:107:1: ( ( ( rule__InsuranceType__Alternatives ) ) )
            // InternalPatientDsl.g:108:2: ( ( rule__InsuranceType__Alternatives ) )
            {
            // InternalPatientDsl.g:108:2: ( ( rule__InsuranceType__Alternatives ) )
            // InternalPatientDsl.g:109:3: ( rule__InsuranceType__Alternatives )
            {
             before(grammarAccess.getInsuranceTypeAccess().getAlternatives()); 
            // InternalPatientDsl.g:110:3: ( rule__InsuranceType__Alternatives )
            // InternalPatientDsl.g:110:4: rule__InsuranceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InsuranceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInsuranceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInsuranceType"


    // $ANTLR start "rule__InsuranceType__Alternatives"
    // InternalPatientDsl.g:118:1: rule__InsuranceType__Alternatives : ( ( ( 'private' ) ) | ( ( 'compulsory' ) ) );
    public final void rule__InsuranceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:122:1: ( ( ( 'private' ) ) | ( ( 'compulsory' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPatientDsl.g:123:2: ( ( 'private' ) )
                    {
                    // InternalPatientDsl.g:123:2: ( ( 'private' ) )
                    // InternalPatientDsl.g:124:3: ( 'private' )
                    {
                     before(grammarAccess.getInsuranceTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // InternalPatientDsl.g:125:3: ( 'private' )
                    // InternalPatientDsl.g:125:4: 'private'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getInsuranceTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatientDsl.g:129:2: ( ( 'compulsory' ) )
                    {
                    // InternalPatientDsl.g:129:2: ( ( 'compulsory' ) )
                    // InternalPatientDsl.g:130:3: ( 'compulsory' )
                    {
                     before(grammarAccess.getInsuranceTypeAccess().getCOMPULSORYEnumLiteralDeclaration_1()); 
                    // InternalPatientDsl.g:131:3: ( 'compulsory' )
                    // InternalPatientDsl.g:131:4: 'compulsory'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getInsuranceTypeAccess().getCOMPULSORYEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__InsuranceType__Alternatives"


    // $ANTLR start "rule__Patient__Group__0"
    // InternalPatientDsl.g:139:1: rule__Patient__Group__0 : rule__Patient__Group__0__Impl rule__Patient__Group__1 ;
    public final void rule__Patient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:143:1: ( rule__Patient__Group__0__Impl rule__Patient__Group__1 )
            // InternalPatientDsl.g:144:2: rule__Patient__Group__0__Impl rule__Patient__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Patient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__1();

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
    // $ANTLR end "rule__Patient__Group__0"


    // $ANTLR start "rule__Patient__Group__0__Impl"
    // InternalPatientDsl.g:151:1: rule__Patient__Group__0__Impl : ( 'patient' ) ;
    public final void rule__Patient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:155:1: ( ( 'patient' ) )
            // InternalPatientDsl.g:156:1: ( 'patient' )
            {
            // InternalPatientDsl.g:156:1: ( 'patient' )
            // InternalPatientDsl.g:157:2: 'patient'
            {
             before(grammarAccess.getPatientAccess().getPatientKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatientKeyword_0()); 

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
    // $ANTLR end "rule__Patient__Group__0__Impl"


    // $ANTLR start "rule__Patient__Group__1"
    // InternalPatientDsl.g:166:1: rule__Patient__Group__1 : rule__Patient__Group__1__Impl rule__Patient__Group__2 ;
    public final void rule__Patient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:170:1: ( rule__Patient__Group__1__Impl rule__Patient__Group__2 )
            // InternalPatientDsl.g:171:2: rule__Patient__Group__1__Impl rule__Patient__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Patient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__2();

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
    // $ANTLR end "rule__Patient__Group__1"


    // $ANTLR start "rule__Patient__Group__1__Impl"
    // InternalPatientDsl.g:178:1: rule__Patient__Group__1__Impl : ( ( rule__Patient__NameAssignment_1 ) ) ;
    public final void rule__Patient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:182:1: ( ( ( rule__Patient__NameAssignment_1 ) ) )
            // InternalPatientDsl.g:183:1: ( ( rule__Patient__NameAssignment_1 ) )
            {
            // InternalPatientDsl.g:183:1: ( ( rule__Patient__NameAssignment_1 ) )
            // InternalPatientDsl.g:184:2: ( rule__Patient__NameAssignment_1 )
            {
             before(grammarAccess.getPatientAccess().getNameAssignment_1()); 
            // InternalPatientDsl.g:185:2: ( rule__Patient__NameAssignment_1 )
            // InternalPatientDsl.g:185:3: rule__Patient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Patient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Patient__Group__1__Impl"


    // $ANTLR start "rule__Patient__Group__2"
    // InternalPatientDsl.g:193:1: rule__Patient__Group__2 : rule__Patient__Group__2__Impl rule__Patient__Group__3 ;
    public final void rule__Patient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:197:1: ( rule__Patient__Group__2__Impl rule__Patient__Group__3 )
            // InternalPatientDsl.g:198:2: rule__Patient__Group__2__Impl rule__Patient__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Patient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__3();

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
    // $ANTLR end "rule__Patient__Group__2"


    // $ANTLR start "rule__Patient__Group__2__Impl"
    // InternalPatientDsl.g:205:1: rule__Patient__Group__2__Impl : ( 'insuranceType' ) ;
    public final void rule__Patient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:209:1: ( ( 'insuranceType' ) )
            // InternalPatientDsl.g:210:1: ( 'insuranceType' )
            {
            // InternalPatientDsl.g:210:1: ( 'insuranceType' )
            // InternalPatientDsl.g:211:2: 'insuranceType'
            {
             before(grammarAccess.getPatientAccess().getInsuranceTypeKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getInsuranceTypeKeyword_2()); 

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
    // $ANTLR end "rule__Patient__Group__2__Impl"


    // $ANTLR start "rule__Patient__Group__3"
    // InternalPatientDsl.g:220:1: rule__Patient__Group__3 : rule__Patient__Group__3__Impl rule__Patient__Group__4 ;
    public final void rule__Patient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:224:1: ( rule__Patient__Group__3__Impl rule__Patient__Group__4 )
            // InternalPatientDsl.g:225:2: rule__Patient__Group__3__Impl rule__Patient__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Patient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__4();

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
    // $ANTLR end "rule__Patient__Group__3"


    // $ANTLR start "rule__Patient__Group__3__Impl"
    // InternalPatientDsl.g:232:1: rule__Patient__Group__3__Impl : ( ( rule__Patient__InsuranceTypeAssignment_3 ) ) ;
    public final void rule__Patient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:236:1: ( ( ( rule__Patient__InsuranceTypeAssignment_3 ) ) )
            // InternalPatientDsl.g:237:1: ( ( rule__Patient__InsuranceTypeAssignment_3 ) )
            {
            // InternalPatientDsl.g:237:1: ( ( rule__Patient__InsuranceTypeAssignment_3 ) )
            // InternalPatientDsl.g:238:2: ( rule__Patient__InsuranceTypeAssignment_3 )
            {
             before(grammarAccess.getPatientAccess().getInsuranceTypeAssignment_3()); 
            // InternalPatientDsl.g:239:2: ( rule__Patient__InsuranceTypeAssignment_3 )
            // InternalPatientDsl.g:239:3: rule__Patient__InsuranceTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Patient__InsuranceTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getInsuranceTypeAssignment_3()); 

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
    // $ANTLR end "rule__Patient__Group__3__Impl"


    // $ANTLR start "rule__Patient__Group__4"
    // InternalPatientDsl.g:247:1: rule__Patient__Group__4 : rule__Patient__Group__4__Impl rule__Patient__Group__5 ;
    public final void rule__Patient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:251:1: ( rule__Patient__Group__4__Impl rule__Patient__Group__5 )
            // InternalPatientDsl.g:252:2: rule__Patient__Group__4__Impl rule__Patient__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Patient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__5();

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
    // $ANTLR end "rule__Patient__Group__4"


    // $ANTLR start "rule__Patient__Group__4__Impl"
    // InternalPatientDsl.g:259:1: rule__Patient__Group__4__Impl : ( 'insuranceNumber' ) ;
    public final void rule__Patient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:263:1: ( ( 'insuranceNumber' ) )
            // InternalPatientDsl.g:264:1: ( 'insuranceNumber' )
            {
            // InternalPatientDsl.g:264:1: ( 'insuranceNumber' )
            // InternalPatientDsl.g:265:2: 'insuranceNumber'
            {
             before(grammarAccess.getPatientAccess().getInsuranceNumberKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getInsuranceNumberKeyword_4()); 

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
    // $ANTLR end "rule__Patient__Group__4__Impl"


    // $ANTLR start "rule__Patient__Group__5"
    // InternalPatientDsl.g:274:1: rule__Patient__Group__5 : rule__Patient__Group__5__Impl rule__Patient__Group__6 ;
    public final void rule__Patient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:278:1: ( rule__Patient__Group__5__Impl rule__Patient__Group__6 )
            // InternalPatientDsl.g:279:2: rule__Patient__Group__5__Impl rule__Patient__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Patient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__6();

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
    // $ANTLR end "rule__Patient__Group__5"


    // $ANTLR start "rule__Patient__Group__5__Impl"
    // InternalPatientDsl.g:286:1: rule__Patient__Group__5__Impl : ( ( rule__Patient__InsuranceNumberAssignment_5 ) ) ;
    public final void rule__Patient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:290:1: ( ( ( rule__Patient__InsuranceNumberAssignment_5 ) ) )
            // InternalPatientDsl.g:291:1: ( ( rule__Patient__InsuranceNumberAssignment_5 ) )
            {
            // InternalPatientDsl.g:291:1: ( ( rule__Patient__InsuranceNumberAssignment_5 ) )
            // InternalPatientDsl.g:292:2: ( rule__Patient__InsuranceNumberAssignment_5 )
            {
             before(grammarAccess.getPatientAccess().getInsuranceNumberAssignment_5()); 
            // InternalPatientDsl.g:293:2: ( rule__Patient__InsuranceNumberAssignment_5 )
            // InternalPatientDsl.g:293:3: rule__Patient__InsuranceNumberAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Patient__InsuranceNumberAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getInsuranceNumberAssignment_5()); 

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
    // $ANTLR end "rule__Patient__Group__5__Impl"


    // $ANTLR start "rule__Patient__Group__6"
    // InternalPatientDsl.g:301:1: rule__Patient__Group__6 : rule__Patient__Group__6__Impl rule__Patient__Group__7 ;
    public final void rule__Patient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:305:1: ( rule__Patient__Group__6__Impl rule__Patient__Group__7 )
            // InternalPatientDsl.g:306:2: rule__Patient__Group__6__Impl rule__Patient__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Patient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__7();

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
    // $ANTLR end "rule__Patient__Group__6"


    // $ANTLR start "rule__Patient__Group__6__Impl"
    // InternalPatientDsl.g:313:1: rule__Patient__Group__6__Impl : ( ( rule__Patient__Group_6__0 )? ) ;
    public final void rule__Patient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:317:1: ( ( ( rule__Patient__Group_6__0 )? ) )
            // InternalPatientDsl.g:318:1: ( ( rule__Patient__Group_6__0 )? )
            {
            // InternalPatientDsl.g:318:1: ( ( rule__Patient__Group_6__0 )? )
            // InternalPatientDsl.g:319:2: ( rule__Patient__Group_6__0 )?
            {
             before(grammarAccess.getPatientAccess().getGroup_6()); 
            // InternalPatientDsl.g:320:2: ( rule__Patient__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPatientDsl.g:320:3: rule__Patient__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Patient__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatientAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Patient__Group__6__Impl"


    // $ANTLR start "rule__Patient__Group__7"
    // InternalPatientDsl.g:328:1: rule__Patient__Group__7 : rule__Patient__Group__7__Impl ;
    public final void rule__Patient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:332:1: ( rule__Patient__Group__7__Impl )
            // InternalPatientDsl.g:333:2: rule__Patient__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Group__7__Impl();

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
    // $ANTLR end "rule__Patient__Group__7"


    // $ANTLR start "rule__Patient__Group__7__Impl"
    // InternalPatientDsl.g:339:1: rule__Patient__Group__7__Impl : ( ( rule__Patient__Group_7__0 )? ) ;
    public final void rule__Patient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:343:1: ( ( ( rule__Patient__Group_7__0 )? ) )
            // InternalPatientDsl.g:344:1: ( ( rule__Patient__Group_7__0 )? )
            {
            // InternalPatientDsl.g:344:1: ( ( rule__Patient__Group_7__0 )? )
            // InternalPatientDsl.g:345:2: ( rule__Patient__Group_7__0 )?
            {
             before(grammarAccess.getPatientAccess().getGroup_7()); 
            // InternalPatientDsl.g:346:2: ( rule__Patient__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPatientDsl.g:346:3: rule__Patient__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Patient__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatientAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Patient__Group__7__Impl"


    // $ANTLR start "rule__Patient__Group_6__0"
    // InternalPatientDsl.g:355:1: rule__Patient__Group_6__0 : rule__Patient__Group_6__0__Impl rule__Patient__Group_6__1 ;
    public final void rule__Patient__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:359:1: ( rule__Patient__Group_6__0__Impl rule__Patient__Group_6__1 )
            // InternalPatientDsl.g:360:2: rule__Patient__Group_6__0__Impl rule__Patient__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Patient__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group_6__1();

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
    // $ANTLR end "rule__Patient__Group_6__0"


    // $ANTLR start "rule__Patient__Group_6__0__Impl"
    // InternalPatientDsl.g:367:1: rule__Patient__Group_6__0__Impl : ( 'email' ) ;
    public final void rule__Patient__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:371:1: ( ( 'email' ) )
            // InternalPatientDsl.g:372:1: ( 'email' )
            {
            // InternalPatientDsl.g:372:1: ( 'email' )
            // InternalPatientDsl.g:373:2: 'email'
            {
             before(grammarAccess.getPatientAccess().getEmailKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getEmailKeyword_6_0()); 

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
    // $ANTLR end "rule__Patient__Group_6__0__Impl"


    // $ANTLR start "rule__Patient__Group_6__1"
    // InternalPatientDsl.g:382:1: rule__Patient__Group_6__1 : rule__Patient__Group_6__1__Impl ;
    public final void rule__Patient__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:386:1: ( rule__Patient__Group_6__1__Impl )
            // InternalPatientDsl.g:387:2: rule__Patient__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Group_6__1__Impl();

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
    // $ANTLR end "rule__Patient__Group_6__1"


    // $ANTLR start "rule__Patient__Group_6__1__Impl"
    // InternalPatientDsl.g:393:1: rule__Patient__Group_6__1__Impl : ( ( rule__Patient__EmailAssignment_6_1 ) ) ;
    public final void rule__Patient__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:397:1: ( ( ( rule__Patient__EmailAssignment_6_1 ) ) )
            // InternalPatientDsl.g:398:1: ( ( rule__Patient__EmailAssignment_6_1 ) )
            {
            // InternalPatientDsl.g:398:1: ( ( rule__Patient__EmailAssignment_6_1 ) )
            // InternalPatientDsl.g:399:2: ( rule__Patient__EmailAssignment_6_1 )
            {
             before(grammarAccess.getPatientAccess().getEmailAssignment_6_1()); 
            // InternalPatientDsl.g:400:2: ( rule__Patient__EmailAssignment_6_1 )
            // InternalPatientDsl.g:400:3: rule__Patient__EmailAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Patient__EmailAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getEmailAssignment_6_1()); 

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
    // $ANTLR end "rule__Patient__Group_6__1__Impl"


    // $ANTLR start "rule__Patient__Group_7__0"
    // InternalPatientDsl.g:409:1: rule__Patient__Group_7__0 : rule__Patient__Group_7__0__Impl rule__Patient__Group_7__1 ;
    public final void rule__Patient__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:413:1: ( rule__Patient__Group_7__0__Impl rule__Patient__Group_7__1 )
            // InternalPatientDsl.g:414:2: rule__Patient__Group_7__0__Impl rule__Patient__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Patient__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group_7__1();

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
    // $ANTLR end "rule__Patient__Group_7__0"


    // $ANTLR start "rule__Patient__Group_7__0__Impl"
    // InternalPatientDsl.g:421:1: rule__Patient__Group_7__0__Impl : ( 'phoneNumber' ) ;
    public final void rule__Patient__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:425:1: ( ( 'phoneNumber' ) )
            // InternalPatientDsl.g:426:1: ( 'phoneNumber' )
            {
            // InternalPatientDsl.g:426:1: ( 'phoneNumber' )
            // InternalPatientDsl.g:427:2: 'phoneNumber'
            {
             before(grammarAccess.getPatientAccess().getPhoneNumberKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPhoneNumberKeyword_7_0()); 

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
    // $ANTLR end "rule__Patient__Group_7__0__Impl"


    // $ANTLR start "rule__Patient__Group_7__1"
    // InternalPatientDsl.g:436:1: rule__Patient__Group_7__1 : rule__Patient__Group_7__1__Impl ;
    public final void rule__Patient__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:440:1: ( rule__Patient__Group_7__1__Impl )
            // InternalPatientDsl.g:441:2: rule__Patient__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Group_7__1__Impl();

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
    // $ANTLR end "rule__Patient__Group_7__1"


    // $ANTLR start "rule__Patient__Group_7__1__Impl"
    // InternalPatientDsl.g:447:1: rule__Patient__Group_7__1__Impl : ( ( rule__Patient__PhoneNumberAssignment_7_1 ) ) ;
    public final void rule__Patient__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:451:1: ( ( ( rule__Patient__PhoneNumberAssignment_7_1 ) ) )
            // InternalPatientDsl.g:452:1: ( ( rule__Patient__PhoneNumberAssignment_7_1 ) )
            {
            // InternalPatientDsl.g:452:1: ( ( rule__Patient__PhoneNumberAssignment_7_1 ) )
            // InternalPatientDsl.g:453:2: ( rule__Patient__PhoneNumberAssignment_7_1 )
            {
             before(grammarAccess.getPatientAccess().getPhoneNumberAssignment_7_1()); 
            // InternalPatientDsl.g:454:2: ( rule__Patient__PhoneNumberAssignment_7_1 )
            // InternalPatientDsl.g:454:3: rule__Patient__PhoneNumberAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Patient__PhoneNumberAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getPhoneNumberAssignment_7_1()); 

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
    // $ANTLR end "rule__Patient__Group_7__1__Impl"


    // $ANTLR start "rule__Model__PatientsAssignment"
    // InternalPatientDsl.g:463:1: rule__Model__PatientsAssignment : ( rulePatient ) ;
    public final void rule__Model__PatientsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:467:1: ( ( rulePatient ) )
            // InternalPatientDsl.g:468:2: ( rulePatient )
            {
            // InternalPatientDsl.g:468:2: ( rulePatient )
            // InternalPatientDsl.g:469:3: rulePatient
            {
             before(grammarAccess.getModelAccess().getPatientsPatientParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePatient();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPatientsPatientParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__PatientsAssignment"


    // $ANTLR start "rule__Patient__NameAssignment_1"
    // InternalPatientDsl.g:478:1: rule__Patient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Patient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:482:1: ( ( RULE_ID ) )
            // InternalPatientDsl.g:483:2: ( RULE_ID )
            {
            // InternalPatientDsl.g:483:2: ( RULE_ID )
            // InternalPatientDsl.g:484:3: RULE_ID
            {
             before(grammarAccess.getPatientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Patient__NameAssignment_1"


    // $ANTLR start "rule__Patient__InsuranceTypeAssignment_3"
    // InternalPatientDsl.g:493:1: rule__Patient__InsuranceTypeAssignment_3 : ( ruleInsuranceType ) ;
    public final void rule__Patient__InsuranceTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:497:1: ( ( ruleInsuranceType ) )
            // InternalPatientDsl.g:498:2: ( ruleInsuranceType )
            {
            // InternalPatientDsl.g:498:2: ( ruleInsuranceType )
            // InternalPatientDsl.g:499:3: ruleInsuranceType
            {
             before(grammarAccess.getPatientAccess().getInsuranceTypeInsuranceTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInsuranceType();

            state._fsp--;

             after(grammarAccess.getPatientAccess().getInsuranceTypeInsuranceTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Patient__InsuranceTypeAssignment_3"


    // $ANTLR start "rule__Patient__InsuranceNumberAssignment_5"
    // InternalPatientDsl.g:508:1: rule__Patient__InsuranceNumberAssignment_5 : ( RULE_INT ) ;
    public final void rule__Patient__InsuranceNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:512:1: ( ( RULE_INT ) )
            // InternalPatientDsl.g:513:2: ( RULE_INT )
            {
            // InternalPatientDsl.g:513:2: ( RULE_INT )
            // InternalPatientDsl.g:514:3: RULE_INT
            {
             before(grammarAccess.getPatientAccess().getInsuranceNumberINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getInsuranceNumberINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Patient__InsuranceNumberAssignment_5"


    // $ANTLR start "rule__Patient__EmailAssignment_6_1"
    // InternalPatientDsl.g:523:1: rule__Patient__EmailAssignment_6_1 : ( RULE_EMAIL ) ;
    public final void rule__Patient__EmailAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:527:1: ( ( RULE_EMAIL ) )
            // InternalPatientDsl.g:528:2: ( RULE_EMAIL )
            {
            // InternalPatientDsl.g:528:2: ( RULE_EMAIL )
            // InternalPatientDsl.g:529:3: RULE_EMAIL
            {
             before(grammarAccess.getPatientAccess().getEmailEMAILTerminalRuleCall_6_1_0()); 
            match(input,RULE_EMAIL,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getEmailEMAILTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Patient__EmailAssignment_6_1"


    // $ANTLR start "rule__Patient__PhoneNumberAssignment_7_1"
    // InternalPatientDsl.g:538:1: rule__Patient__PhoneNumberAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Patient__PhoneNumberAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatientDsl.g:542:1: ( ( RULE_STRING ) )
            // InternalPatientDsl.g:543:2: ( RULE_STRING )
            {
            // InternalPatientDsl.g:543:2: ( RULE_STRING )
            // InternalPatientDsl.g:544:3: RULE_STRING
            {
             before(grammarAccess.getPatientAccess().getPhoneNumberSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPhoneNumberSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Patient__PhoneNumberAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});

}