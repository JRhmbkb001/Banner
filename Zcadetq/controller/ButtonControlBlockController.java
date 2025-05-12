package net.hedtech.ucdavis.ps.banner.student.Zcadetq.controller;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.action.*;
import static net.hedtech.general.common.forms.services.BaseTaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;

import net.hedtech.general.common.forms.controller.DefaultBlockController;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.ucdavis.ps.banner.student.Zcadetq.model.*;
import net.hedtech.ucdavis.ps.banner.student.Zcadetq.*;
import net.hedtech.ucdavis.ps.banner.student.Zcadetq.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public ZcadetqTask getTask() {
		return (ZcadetqTask)super.getTask();
	}

	public ZcadetqModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_LEVL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRTST_LEVL_CODE_LBT")
		@Before
		public void scrrtstLevlCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_MIN_GRDE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRTST_MIN_GRDE_BTN")
		@Before
		public void scrrtstMinGrdeBtn_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST_MIN_GRDE_BTN.WHEN-BUTTON-PRESSED
		 GO_ITEM('SCRRTST_MIN_GRDE');
DO_KEY('LIST_VALUES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_MIN_GRDE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SCRRTST_MIN_GRDE_BTN")
		public void scrrtstMinGrdeBtn_buttonClick()
		{
			
				goItem(toStr("SCRRTST_MIN_GRDE"));
				executeAction(KeyFunction.LIST_VALUES);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_SUBJ_CODE_PREQ_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRTST_SUBJ_CODE_PREQ_LBT")
		@Before
		public void scrrtstSubjCodePreqLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_TESC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRTST_TESC_CODE_LBT")
		@Before
		public void scrrtstTescCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRFEES_DETL_CODE_LBT")
		@Before
		public void scrfeesDetlCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_SUBJ_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCACRSE_SUBJ_CODE_LBT")
		@Before
		public void scacrseSubjCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_CRSE_NUMB_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCACRSE_CRSE_NUMB_LBT")
		@Before
		public void scacrseCrseNumbLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVTERM_CODE_LBT")
		@Before
		public void stvtermCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_COLL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCBCRSE_COLL_CODE_LBT")
		@Before
		public void scbcrseCollCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_DEPT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCBCRSE_DEPT_CODE_LBT")
		@Before
		public void scbcrseDeptCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_CSTA_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCBCRSE_CSTA_CODE_LBT")
		@Before
		public void scbcrseCstaCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_APRV_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCBCRSE_APRV_CODE_LBT")
		@Before
		public void scbcrseAprvCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCBCRSE_SUBJ_CODE_XLIST_LBT")
		@Before
		public void zcbcrseSubjCodeXlistLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRLEVL_LEVL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRLEVL_LEVL_CODE_LBT")
		@Before
		public void scrlevlLevlCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD_GMOD_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRGMOD_GMOD_CODE_LBT")
		@Before
		public void scrgmodGmodCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_SCHD_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_SCHD_CODE_LBT")
		@Before
		public void scrschdSchdCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_1_ROLLBACK_BTN")
		@Before
		public void scrschd1RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_2_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_2_ROLLBACK_BTN")
		@Before
		public void scrschd2RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_3_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_3_ROLLBACK_BTN")
		@Before
		public void scrschd3RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_1_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_1_SAVE_BTN")
		@Before
		public void scrschd1SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_3_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_3_SAVE_BTN")
		@Before
		public void scrschd3SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_2_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_2_SAVE_BTN")
		@Before
		public void scrschd2SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_1_EXIT_BTN")
		@Before
		public void scrschd1ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_2_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_2_EXIT_BTN")
		@Before
		public void scrschd2ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_3_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_3_EXIT_BTN")
		@Before
		public void scrschd3ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCREQIV_SUBJ_CODE_EQIV_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCREQIV_SUBJ_CODE_EQIV_LBT")
		@Before
		public void screqivSubjCodeEqivLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRDUPR_SUBJ_CODE_LBT")
		@Before
		public void zcrduprSubjCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRCORQ_SUBJ_CODE_CORQ_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRCORQ_SUBJ_CODE_CORQ_LBT")
		@Before
		public void scrcorqSubjCodeCorqLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRGECO_SUBJ_CODE_COCRSE_LBT")
		@Before
		public void zcrgecoSubjCodeCocrseLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRATTR_ATTR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRATTR_ATTR_CODE_LBT")
		@Before
		public void scrattrAttrCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_COLL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRCOL_COLL_CODE_LBT")
		@Before
		public void scrrcolCollCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCLS_CLAS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRCLS_CLAS_CODE_LBT")
		@Before
		public void scrrclsClasCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ_MAJR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRMAJ_MAJR_CODE_LBT")
		@Before
		public void scrrmajMajrCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_LEVL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRLVL_LEVL_CODE_LBT")
		@Before
		public void scrrlvlLevlCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_REPS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCBCRSE_REPS_CODE_LBT")
		@Before
		public void scbcrseRepsCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEG_DEGC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRDEG_DEGC_CODE_LBT")
		@Before
		public void scrrdegDegcCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRATT_ATTS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRATT_ATTS_CODE_LBT")
		@Before
		public void scrrattAttsCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_PROGRAM_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRPRG_PROGRAM_LBT")
		@Before
		public void scrrprgProgramLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_DEPT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRDEP_DEPT_CODE_LBT")
		@Before
		public void scrrdepDeptCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCAM_CAMP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRCAM_CAMP_CODE_LBT")
		@Before
		public void scrrcamCampCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCHR_CHRT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRRCHR_CHRT_CODE_LBT")
		@Before
		public void scrrchrChrtCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
	
	
}
