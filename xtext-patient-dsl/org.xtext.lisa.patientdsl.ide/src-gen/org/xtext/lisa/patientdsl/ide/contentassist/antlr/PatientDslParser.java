/*
 * generated by Xtext 2.33.0
 */
package org.xtext.lisa.patientdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.lisa.patientdsl.ide.contentassist.antlr.internal.InternalPatientDslParser;
import org.xtext.lisa.patientdsl.services.PatientDslGrammarAccess;

public class PatientDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PatientDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PatientDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInsuranceTypeAccess().getAlternatives(), "rule__InsuranceType__Alternatives");
			builder.put(grammarAccess.getPatientAccess().getGroup(), "rule__Patient__Group__0");
			builder.put(grammarAccess.getPatientAccess().getGroup_6(), "rule__Patient__Group_6__0");
			builder.put(grammarAccess.getPatientAccess().getGroup_7(), "rule__Patient__Group_7__0");
			builder.put(grammarAccess.getModelAccess().getPatientsAssignment(), "rule__Model__PatientsAssignment");
			builder.put(grammarAccess.getPatientAccess().getNameAssignment_1(), "rule__Patient__NameAssignment_1");
			builder.put(grammarAccess.getPatientAccess().getInsuranceTypeAssignment_3(), "rule__Patient__InsuranceTypeAssignment_3");
			builder.put(grammarAccess.getPatientAccess().getInsuranceNumberAssignment_5(), "rule__Patient__InsuranceNumberAssignment_5");
			builder.put(grammarAccess.getPatientAccess().getEmailAssignment_6_1(), "rule__Patient__EmailAssignment_6_1");
			builder.put(grammarAccess.getPatientAccess().getPhoneNumberAssignment_7_1(), "rule__Patient__PhoneNumberAssignment_7_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PatientDslGrammarAccess grammarAccess;

	@Override
	protected InternalPatientDslParser createParser() {
		InternalPatientDslParser result = new InternalPatientDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PatientDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PatientDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
