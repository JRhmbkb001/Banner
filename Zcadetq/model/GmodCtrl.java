package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GmodCtrl extends SimpleBusinessObject
{
	public GmodCtrl() {
		super();
	}

	public GmodCtrl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getScrgmodTermCodeFrom() {
		return toStr(super.getValue("SCRGMOD_TERM_CODE_FROM"));
	}
	
	public void setScrgmodTermCodeFrom(NString value) {
		super.setValue("SCRGMOD_TERM_CODE_FROM", value);
	}
	


	public NString getScrgmodTermCodeTo() {
		return toStr(super.getValue("SCRGMOD_TERM_CODE_TO"));
	}
	
	public void setScrgmodTermCodeTo(NString value) {
		super.setValue("SCRGMOD_TERM_CODE_TO", value);
	}
	



}




