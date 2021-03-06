package com.reprezen.kaizen.oasparser.ovl3;

import java.util.Collection;

import javax.annotation.Generated;

import com.fasterxml.jackson.databind.JsonNode;
import com.reprezen.jsonoverlay.AbstractJsonOverlay;
import com.reprezen.jsonoverlay.ChildListOverlay;
import com.reprezen.jsonoverlay.JsonOverlay;
import com.reprezen.jsonoverlay.OverlayFactory;
import com.reprezen.jsonoverlay.PropertiesOverlay;
import com.reprezen.jsonoverlay.ReferenceRegistry;
import com.reprezen.jsonoverlay.StringOverlay;
import com.reprezen.kaizen.oasparser.model3.SecurityParameter;

public class SecurityParameterImpl extends PropertiesOverlay<SecurityParameter> implements SecurityParameter {

	@Override
	protected JsonNode fixJson(JsonNode json) {
		return json.isMissingNode() ? jsonArray() : json;
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public SecurityParameterImpl(JsonNode json, JsonOverlay<?> parent, ReferenceRegistry refReg) {
		super(json, parent, refReg);
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public SecurityParameterImpl(SecurityParameter securityParameter, JsonOverlay<?> parent, ReferenceRegistry refReg) {
		super(securityParameter, parent, refReg);
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	private ChildListOverlay<String> parameters;

	// Parameter
	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Collection<String> getParameters() {
		return parameters._get();
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public boolean hasParameters() {
		return parameters._isPresent();
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public String getParameter(int index) {
		return parameters._get(index);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setParameters(Collection<String> parameters) {
		this.parameters._set(parameters);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setParameter(int index, String parameter) {
		parameters._set(index, parameter);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void addParameter(String parameter) {
		parameters._add(parameter);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void insertParameter(int index, String parameter) {
		parameters._insert(index, parameter);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void removeParameter(int index) {
		parameters._remove(index);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	protected void elaborateChildren() {
		super.elaborateChildren();
		parameters = createChildList("", this, StringOverlay.factory);
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public static OverlayFactory<SecurityParameter> factory = new OverlayFactory<SecurityParameter>() {

		@Override
		protected Class<? extends AbstractJsonOverlay<? super SecurityParameter>> getOverlayClass() {
			return SecurityParameterImpl.class;
		}

		@Override
		public JsonOverlay<SecurityParameter> _create(SecurityParameter securityParameter, JsonOverlay<?> parent,
				ReferenceRegistry refReg) {
			AbstractJsonOverlay<?> overlay;
			overlay = new SecurityParameterImpl(securityParameter, parent, refReg);
			@SuppressWarnings("unchecked")
			JsonOverlay<SecurityParameter> castOverlay = (JsonOverlay<SecurityParameter>) overlay;
			return castOverlay;
		}

		@Override
		public JsonOverlay<SecurityParameter> _create(JsonNode json, JsonOverlay<?> parent, ReferenceRegistry refReg) {
			AbstractJsonOverlay<?> overlay;
			overlay = new SecurityParameterImpl(json, parent, refReg);
			@SuppressWarnings("unchecked")
			JsonOverlay<SecurityParameter> castOverlay = (JsonOverlay<SecurityParameter>) overlay;
			return castOverlay;
		}
	};

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	private static Class<? extends SecurityParameter> getSubtypeOf(SecurityParameter securityParameter) {
		return SecurityParameter.class;
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	private static Class<? extends SecurityParameter> getSubtypeOf(JsonNode json) {
		return SecurityParameter.class;
	}
}
