package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class AttrCtrl extends SimpleBusinessObject
{
	public AttrCtrl() {
		super();
	}

	public AttrCtrl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getScrattrTermCodeFrom() {
		return toStr(super.getValue("SCRATTR_TERM_CODE_FROM"));
	}
	
	public void setScrattrTermCodeFrom(NString value) {
		super.setValue("SCRATTR_TERM_CODE_FROM", value);
	}
	


	public NString getScrattrTermCodeTo() {
		return toStr(super.getValue("SCRATTR_TERM_CODE_TO"));
	}
	
	public void setScrattrTermCodeTo(NString value) {
		super.setValue("SCRATTR_TERM_CODE_TO", value);
	}
	



}




