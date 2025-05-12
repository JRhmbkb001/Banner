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

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class ScrfeesController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ScrfeesController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRFEES.PRE-QUERY
		    :FEE_CTRL.SCRFEES_TERM_CODE_FROM := :SCBCRSE.SCBCRSE_EFF_TERM
       ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRFEES_EFF_TERM)
         FROM   SCRFEES
         WHERE  SCRFEES_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE
           AND  SCRFEES_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCRFEES_EFF_TERM > :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :FEE_CTRL.SCRFEES_TERM_CODE_TO ;
   END ;
--
   IF :FEE_CTRL.SCRFEES_TERM_CODE_TO IN (
      :FEE_CTRL.SCRFEES_TERM_CODE_FROM) OR
      :FEE_CTRL.SCRFEES_TERM_CODE_TO IS NULL  OR (
      :FEE_CTRL.SCRFEES_TERM_CODE_TO IS NULL AND
      :FEE_CTRL.SCRFEES_TERM_CODE_FROM IS NULL ) THEN
      GOTO GET_SCBCRKY ;
   ELSE
      RETURN ;
   END IF ;
--
   << GET_SCBCRKY >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :FEE_CTRL.SCRFEES_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;
--
	 << PTI_STEP_001 >>
   IF :FEE_CTRL.SCRFEES_TERM_CODE_TO IS NULL  THEN
      :FEE_CTRL.SCRFEES_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrfees_BeforeQuery(QueryEvent args)
		{
			
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
				Ref<NString> termCode = new Ref<NString>(scbcrseElement.getScbcrkyTermCodeEnd());
				

				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				getFormModel().getFeeCtrl().setScrfeesTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				{
					String sqlptiCursor = "SELECT MIN(SCRFEES_EFF_TERM) " +
	" FROM SCRFEES " +
	" WHERE SCRFEES_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND SCRFEES_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRFEES_EFF_TERM > :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getFeeCtrl().setScrfeesTermCodeTo(termCode.val);
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if (! in(getFormModel().getFeeCtrl().getScrfeesTermCodeTo(), getFormModel().getFeeCtrl().getScrfeesTermCodeFrom()).getValue() || getFormModel().getFeeCtrl().getScrfeesTermCodeTo().isNull() || (getFormModel().getFeeCtrl().getScrfeesTermCodeTo().isNull() && getFormModel().getFeeCtrl().getScrfeesTermCodeFrom().isNull()) )
					return;
				 
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					getFormModel().getFeeCtrl().setScrfeesTermCodeTo(termCode.val);
				}
				getFormModel().getFeeCtrl().setScrfeesTermCodeTo(termCode.val);
				if ( getFormModel().getFeeCtrl().getScrfeesTermCodeTo().isNull() )
				{
					getFormModel().getFeeCtrl().setScrfeesTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRFEES.POST-QUERY
		    :FEE_CTRL.SCRFEES_TERM_CODE_FROM := :SCRFEES.SCRFEES_EFF_TERM
       ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrfees_AfterQuery(RowAdapterEvent args)
		{
			
				ScrfeesAdapter scrfeesElement = (ScrfeesAdapter)args.getRow();


				getFormModel().getFeeCtrl().setScrfeesTermCodeFrom(scrfeesElement.getScrfeesEffTerm());
			}

		
		/* Original PL/SQL code code for TRIGGER SCRFEES.KEY-NXTBLK
		 
	set_canvas_property('ZCADETQ_2_TAB_CANVAS', TOPMOST_TAB_PAGE, 'RESTRICTION'); 
	go_block('SCRRCOL_1');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void scrfees_NextBlock()
		{
			
				setCanvasTopMostTabPage("ZCADETQ_2_TAB_CANVAS", "RESTRICTION");
				goBlock(toStr("SCRRCOL_1"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRFEES_DETL_CODE")
		public void scrfeesDetlCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRFEES_DETL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scrfeesDetlCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRFEES_DETL_CODE")
		public void scrfeesDetlCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRFEES_DETL_CODE")
		public void scrfeesDetlCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRFEES_DETL_CODE", function=KeyFunction.NEXT_ITEM)
		public void scrfeesDetlCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRFEES_DETL_CODE", function=KeyFunction.ITEM_OUT)
		public void scrfeesDetlCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCRFEES_DETL_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT TBBDETC_DESC
         FROM   TBBDETC
         WHERE  TBBDETC_DETAIL_CODE =
            :SCRFEES.SCRFEES_DETL_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRFEES.TBBDETC_DESC ;
   END ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCRFEES_DETL_CODE")
		public void scrfeesDetlCode_PostChange()
		{
			

				
				ScrfeesAdapter scrfeesElement = (ScrfeesAdapter)this.getFormModel().getScrfees().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT TBBDETC_DESC " +
	" FROM TBBDETC " +
	" WHERE TBBDETC_DETAIL_CODE = :SCRFEES_SCRFEES_DETL_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCRFEES_SCRFEES_DETL_CODE", scrfeesElement.getScrfeesDetlCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								scrfeesElement.setTbbdetcDesc(ptiCursorResults.getStr(0));
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRFEES_DETL_CODE.KEY-LISTVAL
		 G$_COPY_FLD_ATTR;
--CALL_FORM('TSADETC',NO_HIDE,DO_REPLACE,QUERY_ONLY);
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'TSADETC','QUERY_NOHIDE');
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
NEXT_FIELD;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRFEES_DETL_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SCRFEES_DETL_CODE", function=KeyFunction.LIST_VALUES, fireInSearch=false)
		public void scrfeesDetlCode_ListValues()
		{
			
				getTask().getGoqrpls().gCopyFldAttr();
				// CALL_FORM('TSADETC',NO_HIDE,DO_REPLACE,QUERY_ONLY);
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("TSADETC"), toStr("QUERY_NOHIDE"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBDETC_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TBBDETC_DESC", function=KeyFunction.ITEM_CHANGE)
		public void tbbdetcDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
	
	
}
