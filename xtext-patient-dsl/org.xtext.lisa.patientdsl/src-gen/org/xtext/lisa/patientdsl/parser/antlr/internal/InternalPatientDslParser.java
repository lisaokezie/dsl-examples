package org.xtext.lisa.patientdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.lisa.patientdsl.services.PatientDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPatientDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_EMAIL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'patient'", "'insuranceType'", "'insuranceNumber'", "'email'", "'phoneNumber'", "'private'", "'compulsory'"
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

        public InternalPatientDslParser(TokenStream input, PatientDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PatientDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPatientDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPatientDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalPatientDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPatientDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_patients_0_0= rulePatient ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_patients_0_0 = null;



        	enterRule();

        try {
            // InternalPatientDsl.g:78:2: ( ( (lv_patients_0_0= rulePatient ) )* )
            // InternalPatientDsl.g:79:2: ( (lv_patients_0_0= rulePatient ) )*
            {
            // InternalPatientDsl.g:79:2: ( (lv_patients_0_0= rulePatient ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPatientDsl.g:80:3: (lv_patients_0_0= rulePatient )
            	    {
            	    // InternalPatientDsl.g:80:3: (lv_patients_0_0= rulePatient )
            	    // InternalPatientDsl.g:81:4: lv_patients_0_0= rulePatient
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getPatientsPatientParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_patients_0_0=rulePatient();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"patients",
            	    					lv_patients_0_0,
            	    					"org.xtext.lisa.patientdsl.PatientDsl.Patient");
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


    // $ANTLR start "entryRulePatient"
    // InternalPatientDsl.g:101:1: entryRulePatient returns [EObject current=null] : iv_rulePatient= rulePatient EOF ;
    public final EObject entryRulePatient() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatient = null;


        try {
            // InternalPatientDsl.g:101:48: (iv_rulePatient= rulePatient EOF )
            // InternalPatientDsl.g:102:2: iv_rulePatient= rulePatient EOF
            {
             newCompositeNode(grammarAccess.getPatientRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatient=rulePatient();

            state._fsp--;

             current =iv_rulePatient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatient"


    // $ANTLR start "rulePatient"
    // InternalPatientDsl.g:108:1: rulePatient returns [EObject current=null] : (otherlv_0= 'patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'insuranceType' ( (lv_insuranceType_3_0= ruleInsuranceType ) ) otherlv_4= 'insuranceNumber' ( (lv_insuranceNumber_5_0= RULE_INT ) ) (otherlv_6= 'email' ( (lv_email_7_0= RULE_EMAIL ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePatient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_insuranceNumber_5_0=null;
        Token otherlv_6=null;
        Token lv_email_7_0=null;
        Token otherlv_8=null;
        Token lv_phoneNumber_9_0=null;
        Enumerator lv_insuranceType_3_0 = null;



        	enterRule();

        try {
            // InternalPatientDsl.g:114:2: ( (otherlv_0= 'patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'insuranceType' ( (lv_insuranceType_3_0= ruleInsuranceType ) ) otherlv_4= 'insuranceNumber' ( (lv_insuranceNumber_5_0= RULE_INT ) ) (otherlv_6= 'email' ( (lv_email_7_0= RULE_EMAIL ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= RULE_STRING ) ) )? ) )
            // InternalPatientDsl.g:115:2: (otherlv_0= 'patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'insuranceType' ( (lv_insuranceType_3_0= ruleInsuranceType ) ) otherlv_4= 'insuranceNumber' ( (lv_insuranceNumber_5_0= RULE_INT ) ) (otherlv_6= 'email' ( (lv_email_7_0= RULE_EMAIL ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= RULE_STRING ) ) )? )
            {
            // InternalPatientDsl.g:115:2: (otherlv_0= 'patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'insuranceType' ( (lv_insuranceType_3_0= ruleInsuranceType ) ) otherlv_4= 'insuranceNumber' ( (lv_insuranceNumber_5_0= RULE_INT ) ) (otherlv_6= 'email' ( (lv_email_7_0= RULE_EMAIL ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= RULE_STRING ) ) )? )
            // InternalPatientDsl.g:116:3: otherlv_0= 'patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'insuranceType' ( (lv_insuranceType_3_0= ruleInsuranceType ) ) otherlv_4= 'insuranceNumber' ( (lv_insuranceNumber_5_0= RULE_INT ) ) (otherlv_6= 'email' ( (lv_email_7_0= RULE_EMAIL ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPatientAccess().getPatientKeyword_0());
            		
            // InternalPatientDsl.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPatientDsl.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPatientDsl.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalPatientDsl.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatientAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPatientAccess().getInsuranceTypeKeyword_2());
            		
            // InternalPatientDsl.g:142:3: ( (lv_insuranceType_3_0= ruleInsuranceType ) )
            // InternalPatientDsl.g:143:4: (lv_insuranceType_3_0= ruleInsuranceType )
            {
            // InternalPatientDsl.g:143:4: (lv_insuranceType_3_0= ruleInsuranceType )
            // InternalPatientDsl.g:144:5: lv_insuranceType_3_0= ruleInsuranceType
            {

            					newCompositeNode(grammarAccess.getPatientAccess().getInsuranceTypeInsuranceTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_insuranceType_3_0=ruleInsuranceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatientRule());
            					}
            					set(
            						current,
            						"insuranceType",
            						lv_insuranceType_3_0,
            						"org.xtext.lisa.patientdsl.PatientDsl.InsuranceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPatientAccess().getInsuranceNumberKeyword_4());
            		
            // InternalPatientDsl.g:165:3: ( (lv_insuranceNumber_5_0= RULE_INT ) )
            // InternalPatientDsl.g:166:4: (lv_insuranceNumber_5_0= RULE_INT )
            {
            // InternalPatientDsl.g:166:4: (lv_insuranceNumber_5_0= RULE_INT )
            // InternalPatientDsl.g:167:5: lv_insuranceNumber_5_0= RULE_INT
            {
            lv_insuranceNumber_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_insuranceNumber_5_0, grammarAccess.getPatientAccess().getInsuranceNumberINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"insuranceNumber",
            						lv_insuranceNumber_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPatientDsl.g:183:3: (otherlv_6= 'email' ( (lv_email_7_0= RULE_EMAIL ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPatientDsl.g:184:4: otherlv_6= 'email' ( (lv_email_7_0= RULE_EMAIL ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getPatientAccess().getEmailKeyword_6_0());
                    			
                    // InternalPatientDsl.g:188:4: ( (lv_email_7_0= RULE_EMAIL ) )
                    // InternalPatientDsl.g:189:5: (lv_email_7_0= RULE_EMAIL )
                    {
                    // InternalPatientDsl.g:189:5: (lv_email_7_0= RULE_EMAIL )
                    // InternalPatientDsl.g:190:6: lv_email_7_0= RULE_EMAIL
                    {
                    lv_email_7_0=(Token)match(input,RULE_EMAIL,FOLLOW_11); 

                    						newLeafNode(lv_email_7_0, grammarAccess.getPatientAccess().getEmailEMAILTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"email",
                    							lv_email_7_0,
                    							"org.xtext.lisa.patientdsl.PatientDsl.EMAIL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPatientDsl.g:207:3: (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPatientDsl.g:208:4: otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getPatientAccess().getPhoneNumberKeyword_7_0());
                    			
                    // InternalPatientDsl.g:212:4: ( (lv_phoneNumber_9_0= RULE_STRING ) )
                    // InternalPatientDsl.g:213:5: (lv_phoneNumber_9_0= RULE_STRING )
                    {
                    // InternalPatientDsl.g:213:5: (lv_phoneNumber_9_0= RULE_STRING )
                    // InternalPatientDsl.g:214:6: lv_phoneNumber_9_0= RULE_STRING
                    {
                    lv_phoneNumber_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_phoneNumber_9_0, grammarAccess.getPatientAccess().getPhoneNumberSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"phoneNumber",
                    							lv_phoneNumber_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "rulePatient"


    // $ANTLR start "ruleInsuranceType"
    // InternalPatientDsl.g:235:1: ruleInsuranceType returns [Enumerator current=null] : ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'compulsory' ) ) ;
    public final Enumerator ruleInsuranceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPatientDsl.g:241:2: ( ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'compulsory' ) ) )
            // InternalPatientDsl.g:242:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'compulsory' ) )
            {
            // InternalPatientDsl.g:242:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'compulsory' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPatientDsl.g:243:3: (enumLiteral_0= 'private' )
                    {
                    // InternalPatientDsl.g:243:3: (enumLiteral_0= 'private' )
                    // InternalPatientDsl.g:244:4: enumLiteral_0= 'private'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getInsuranceTypeAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInsuranceTypeAccess().getPRIVATEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPatientDsl.g:251:3: (enumLiteral_1= 'compulsory' )
                    {
                    // InternalPatientDsl.g:251:3: (enumLiteral_1= 'compulsory' )
                    // InternalPatientDsl.g:252:4: enumLiteral_1= 'compulsory'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getInsuranceTypeAccess().getCOMPULSORYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInsuranceTypeAccess().getCOMPULSORYEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleInsuranceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});

}