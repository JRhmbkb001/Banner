package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class LevlCtrl extends SimpleBusinessObject
{
	public LevlCtrl() {
		super();
	}

	public LevlCtrl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getScrlevlTermCodeFrom() {
		return toStr(super.getValue("SCRLEVL_TERM_CODE_FROM"));
	}
	
	public void setScrlevlTermCodeFrom(NString value) {
		super.setValue("SCRLEVL_TERM_CODE_FROM", value);
	}
	


	public NString getScrlevlTermCodeTo() {
		return toStr(super.getValue("SCRLEVL_TERM_CODE_TO"));
	}
	
	public void setScrlevlTermCodeTo(NString value) {
		super.setValue("SCRLEVL_TERM_CODE_TO", value);
	}
	



}




