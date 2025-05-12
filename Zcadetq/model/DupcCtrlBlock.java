package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class DupcCtrlBlock extends SimpleBusinessObject
{
	public DupcCtrlBlock() {
		super();
	}

	public DupcCtrlBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getZcrdupcTermCodeFrom() {
		return toStr(super.getValue("ZCRDUPC_TERM_CODE_FROM"));
	}
	
	public void setZcrdupcTermCodeFrom(NString value) {
		super.setValue("ZCRDUPC_TERM_CODE_FROM", value);
	}
	


	public NString getZcrdupcTermCodeTo() {
		return toStr(super.getValue("ZCRDUPC_TERM_CODE_TO"));
	}
	
	public void setZcrdupcTermCodeTo(NString value) {
		super.setValue("ZCRDUPC_TERM_CODE_TO", value);
	}
	



}




