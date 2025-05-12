package net.hedtech.ucdavis.ps.banner.student.Zcacrse.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class KeyBlock extends SimpleBusinessObject
{
	public KeyBlock() {
		super();
	}

	public KeyBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getKbSubjCode() {
		return toStr(super.getValue("KB_SUBJ_CODE"));
	}
	
	public void setKbSubjCode(NString value) {
		super.setValue("KB_SUBJ_CODE", value);
	}
	


	public NString getSubjDescription() {
		return toStr(super.getValue("SUBJ_DESCRIPTION"));
	}
	
	public void setSubjDescription(NString value) {
		super.setValue("SUBJ_DESCRIPTION", value);
	}
	


	public NString getCrseTitle() {
		return toStr(super.getValue("CRSE_TITLE"));
	}
	
	public void setCrseTitle(NString value) {
		super.setValue("CRSE_TITLE", value);
	}
	


	public NString getKbCrseNumb() {
		return toStr(super.getValue("KB_CRSE_NUMB"));
	}
	
	public void setKbCrseNumb(NString value) {
		super.setValue("KB_CRSE_NUMB", value);
	}
	


	public NString getKbTermCodeEff() {
		return toStr(super.getValue("KB_TERM_CODE_EFF"));
	}
	
	public void setKbTermCodeEff(NString value) {
		super.setValue("KB_TERM_CODE_EFF", value);
	}
	


	public NString getSubjCode() {
		return toStr(super.getValue("SUBJ_CODE"));
	}
	
	public void setSubjCode(NString value) {
		super.setValue("SUBJ_CODE", value);
	}
	


	public NString getScbcrkyTermCodeEnd() {
		return toStr(super.getValue("SCBCRKY_TERM_CODE_END"));
	}
	
	public void setScbcrkyTermCodeEnd(NString value) {
		super.setValue("SCBCRKY_TERM_CODE_END", value);
	}
	


	public NString getDeleteSw() {
		return toStr(super.getValue("DELETE_SW"));
	}
	
	public void setDeleteSw(NString value) {
		super.setValue("DELETE_SW", value);
	}
	


	public NInteger getSchdAdd() {
		return toInt(super.getValue("SCHD_ADD"));
	}
	
	public void setSchdAdd(NInteger value) {
		super.setValue("SCHD_ADD", value);
	}
	


	public NString getCourseAdd() {
		return toStr(super.getValue("COURSE_ADD"));
	}
	
	public void setCourseAdd(NString value) {
		super.setValue("COURSE_ADD", value);
	}
	



}




