package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class EqivCtrl extends SimpleBusinessObject
{
	public EqivCtrl() {
		super();
	}

	public EqivCtrl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getScreqivTermCodeFrom() {
		return toStr(super.getValue("SCREQIV_TERM_CODE_FROM"));
	}
	
	public void setScreqivTermCodeFrom(NString value) {
		super.setValue("SCREQIV_TERM_CODE_FROM", value);
	}
	


	public NString getScreqivTermCodeTo() {
		return toStr(super.getValue("SCREQIV_TERM_CODE_TO"));
	}
	
	public void setScreqivTermCodeTo(NString value) {
		super.setValue("SCREQIV_TERM_CODE_TO", value);
	}
	



}




