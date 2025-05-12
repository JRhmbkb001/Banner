package net.hedtech.ucdavis.ps.banner.student.Zcacrse.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SchdCtrlBlock extends SimpleBusinessObject
{
	public SchdCtrlBlock() {
		super();
	}

	public SchdCtrlBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getScrschdTermCodeFrom() {
		return toStr(super.getValue("SCRSCHD_TERM_CODE_FROM"));
	}
	
	public void setScrschdTermCodeFrom(NString value) {
		super.setValue("SCRSCHD_TERM_CODE_FROM", value);
	}
	


	public NString getScrschdTermCodeTo() {
		return toStr(super.getValue("SCRSCHD_TERM_CODE_TO"));
	}
	
	public void setScrschdTermCodeTo(NString value) {
		super.setValue("SCRSCHD_TERM_CODE_TO", value);
	}
	


	public NNumber getSchdCount() {
		return toNumber(super.getValue("SCHD_COUNT"));
	}
	
	public void setSchdCount(NNumber value) {
		super.setValue("SCHD_COUNT", value);
	}
	



}




