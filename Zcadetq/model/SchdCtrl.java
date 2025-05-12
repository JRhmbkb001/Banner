package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SchdCtrl extends SimpleBusinessObject
{
	public SchdCtrl() {
		super();
	}

	public SchdCtrl(SimpleBusinessObjectConfiguration configuration, String name) {
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
	



}




