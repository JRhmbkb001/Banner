package net.hedtech.ucdavis.ps.banner.student.Zcacrse.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class ZcbcrseCtrlBlock extends SimpleBusinessObject
{
	public ZcbcrseCtrlBlock() {
		super();
	}

	public ZcbcrseCtrlBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getZcbcrseTermCodeFrom() {
		return toStr(super.getValue("ZCBCRSE_TERM_CODE_FROM"));
	}
	
	public void setZcbcrseTermCodeFrom(NString value) {
		super.setValue("ZCBCRSE_TERM_CODE_FROM", value);
	}
	


	public NString getZcbcrseTermCodeTo() {
		return toStr(super.getValue("ZCBCRSE_TERM_CODE_TO"));
	}
	
	public void setZcbcrseTermCodeTo(NString value) {
		super.setValue("ZCBCRSE_TERM_CODE_TO", value);
	}
	



}




