package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class RtstCtrl extends SimpleBusinessObject
{
	public RtstCtrl() {
		super();
	}

	public RtstCtrl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getScrrtstTermCodeFrom() {
		return toStr(super.getValue("SCRRTST_TERM_CODE_FROM"));
	}
	
	public void setScrrtstTermCodeFrom(NString value) {
		super.setValue("SCRRTST_TERM_CODE_FROM", value);
	}
	


	public NString getScrrtstTermCodeTo() {
		return toStr(super.getValue("SCRRTST_TERM_CODE_TO"));
	}
	
	public void setScrrtstTermCodeTo(NString value) {
		super.setValue("SCRRTST_TERM_CODE_TO", value);
	}
	



}




