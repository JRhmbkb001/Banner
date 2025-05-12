package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;


import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;




















































public class ZcadetqModel extends FormModel {
	
	
	public ZcadetqModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public GSdkey getGSdkey() 
	{
		return (GSdkey) getBusinessObject("G$_SDKEY");
	}

	public IDBBusinessObject getGSdisp() 
	{
		return (IDBBusinessObject) getBusinessObject("G$_SDISP");
	}

	public GVpdiBlock getGVpdiBlock() 
	{
		return (GVpdiBlock) getBusinessObject("G$_VPDI_BLOCK");
	}

	public GNavBlock getGNavBlock() 
	{
		return (GNavBlock) getBusinessObject("G$_NAV_BLOCK");
	}

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public KeyBlock getKeyBlock() 
	{
		return (KeyBlock) getBusinessObject("KEY_BLOCK");
	}

	public IDBBusinessObject getScbcrse() 
	{
		return (IDBBusinessObject) getBusinessObject("SCBCRSE");
	}

	public GmodCtrl getGmodCtrl() 
	{
		return (GmodCtrl) getBusinessObject("GMOD_CTRL");
	}

	public IDBBusinessObject getScrgmod() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRGMOD");
	}

	public IDBBusinessObject getZcbcrse() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCBCRSE");
	}

	public SchdCtrl getSchdCtrl() 
	{
		return (SchdCtrl) getBusinessObject("SCHD_CTRL");
	}

	public IDBBusinessObject getScrschd() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRSCHD");
	}

	public LevlCtrl getLevlCtrl() 
	{
		return (LevlCtrl) getBusinessObject("LEVL_CTRL");
	}

	public IDBBusinessObject getScrlevl() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRLEVL");
	}

	public TextCtrl getTextCtrl() 
	{
		return (TextCtrl) getBusinessObject("TEXT_CTRL");
	}

	public IDBBusinessObject getScrtext() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRTEXT");
	}

	public GecoCtrl getGecoCtrl() 
	{
		return (GecoCtrl) getBusinessObject("GECO_CTRL");
	}

	public IDBBusinessObject getZcrgeco() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCRGECO");
	}

	public EqivCtrl getEqivCtrl() 
	{
		return (EqivCtrl) getBusinessObject("EQIV_CTRL");
	}

	public IDBBusinessObject getScreqiv() 
	{
		return (IDBBusinessObject) getBusinessObject("SCREQIV");
	}

	public AttrCtrl getAttrCtrl() 
	{
		return (AttrCtrl) getBusinessObject("ATTR_CTRL");
	}

	public IDBBusinessObject getScrattr() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRATTR");
	}

	public RtstCtrl getRtstCtrl() 
	{
		return (RtstCtrl) getBusinessObject("RTST_CTRL");
	}

	public IDBBusinessObject getScrrtst() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRTST");
	}

	public FeeCtrl getFeeCtrl() 
	{
		return (FeeCtrl) getBusinessObject("FEE_CTRL");
	}

	public IDBBusinessObject getScrfees() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRFEES");
	}

	public IDBBusinessObject getScrrcol1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRCOL_1");
	}

	public IDBBusinessObject getScrrcol2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRCOL_2");
	}

	public IDBBusinessObject getRmajCtrlBlock() 
	{
		return (IDBBusinessObject) getBusinessObject("RMAJ_CTRL_BLOCK");
	}

	public IDBBusinessObject getScrrmaj() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRMAJ");
	}

	public IDBBusinessObject getScrrcls1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRCLS_1");
	}

	public IDBBusinessObject getScrrcls2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRCLS_2");
	}

	public IDBBusinessObject getScrrlvl1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRLVL_1");
	}

	public IDBBusinessObject getScrrlvl2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRLVL_2");
	}

	public IDBBusinessObject getScrrdeg1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRDEG_1");
	}

	public IDBBusinessObject getScrrdeg2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRDEG_2");
	}

	public IDBBusinessObject getScrrprg1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRPRG_1");
	}

	public IDBBusinessObject getScrrprg2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRPRG_2");
	}

	public IDBBusinessObject getScrrcam1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRCAM_1");
	}

	public IDBBusinessObject getScrrcam2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRCAM_2");
	}

	public IDBBusinessObject getScrrdep1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRDEP_1");
	}

	public IDBBusinessObject getScrrdep2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRDEP_2");
	}

	public IDBBusinessObject getScrratt1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRATT_1");
	}

	public IDBBusinessObject getScrratt2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRATT_2");
	}

	public IDBBusinessObject getScrrchr1() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRCHR_1");
	}

	public IDBBusinessObject getScrrchr2() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRRCHR_2");
	}

	public DupcCtrlBlock getDupcCtrlBlock() 
	{
		return (DupcCtrlBlock) getBusinessObject("DUPC_CTRL_BLOCK");
	}

	public IDBBusinessObject getZcrdupc() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCRDUPC");
	}

	public IDBBusinessObject getZcrdupr() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCRDUPR");
	}

	public IDBBusinessObject getZcrdups() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCRDUPS");
	}

	public ButtonControlBlock getButtonControlBlock() 
	{
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}


}

		

