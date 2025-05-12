package net.hedtech.ucdavis.ps.banner.student.Zcacrse.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GecoCtrlBlock extends SimpleBusinessObject
{
	public GecoCtrlBlock() {
		super();
	}

	public GecoCtrlBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getZcrgecoTermCodeFrom() {
		return toStr(super.getValue("ZCRGECO_TERM_CODE_FROM"));
	}
	
	public void setZcrgecoTermCodeFrom(NString value) {
		super.setValue("ZCRGECO_TERM_CODE_FROM", value);
	}
	


	public NString getZcrgecoTermCodeTo() {
		return toStr(super.getValue("ZCRGECO_TERM_CODE_TO"));
	}
	
	public void setZcrgecoTermCodeTo(NString value) {
		super.setValue("ZCRGECO_TERM_CODE_TO", value);
	}
	



}




