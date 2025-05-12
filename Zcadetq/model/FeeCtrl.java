package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class FeeCtrl extends SimpleBusinessObject
{
	public FeeCtrl() {
		super();
	}

	public FeeCtrl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getScrfeesTermCodeFrom() {
		return toStr(super.getValue("SCRFEES_TERM_CODE_FROM"));
	}
	
	public void setScrfeesTermCodeFrom(NString value) {
		super.setValue("SCRFEES_TERM_CODE_FROM", value);
	}
	


	public NString getScrfeesTermCodeTo() {
		return toStr(super.getValue("SCRFEES_TERM_CODE_TO"));
	}
	
	public void setScrfeesTermCodeTo(NString value) {
		super.setValue("SCRFEES_TERM_CODE_TO", value);
	}
	



}




