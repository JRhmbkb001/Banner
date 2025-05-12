package net.hedtech.ucdavis.ps.banner.student.Zcacrse.controller;
 
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
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.listValues;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.setFormValidationEnabled;
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.ucdavis.ps.banner.student.Zcacrse.model.*;
import net.hedtech.ucdavis.ps.banner.student.Zcacrse.*;
import net.hedtech.ucdavis.ps.banner.student.Zcacrse.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
		
public class ZcrduprController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ZcrduprController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public ZcacrseTask getTask() {
		return (ZcacrseTask)super.getTask();
	}

	public ZcacrseModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/* Original PL/SQL code code for TRIGGER ZCRDUPR.KEY-PRVBLK
		 GO_BLOCK('ZCRDUPC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void zcrdupr_PreviousBlock()
		{
			
				goBlock(toStr("ZCRDUPC"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR.WHEN-NEW-BLOCK-INSTANCE
		 IF :ZCRDUPC.ZCRDUPC_UNITS IS NULL THEN
  GO_ITEM('ZCRDUPC.ZCRDUPC_UNITS');
END IF;
IF (:KB_TERM_CODE_EFF <> :ZCRDUPC_TERM_CODE_FROM) 
THEN MESSAGE(G$_NLS.Get('ZCACRSE-8006','FORM',
'*ERROR* Cannot update unless From term equal Key Block term.'),NO_ACKNOWLEDGE) ;
  go_block('ZCRDUPC');
END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void zcrdupr_blockChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);


				if ( zcrdupcElement.getZcrdupcUnits().isNull() )
				{
					goItem(toStr("ZCRDUPC.ZCRDUPC_UNITS"));
				}
				if ((getFormModel().getKeyBlock().getKbTermCodeEff().notEquals(getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom())))
				{
					errorMessage(GNls.Fget(toStr("ZCACRSE-8006"), toStr("FORM"), toStr("*ERROR* Cannot update unless From term equal Key Block term.")));
					goBlock(toStr("ZCRDUPC"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR.KEY-NXTBLK
		 :SYSTEM.MESSAGE_LEVEL := '5' ;
GO_BLOCK('ZCBCRSE');
:SYSTEM.MESSAGE_LEVEL := '0';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void zcrdupr_NextBlock()
		{
			
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
			try{
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				goBlock(toStr("ZCBCRSE"));
			}finally{
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPR_SUBJ_CODE", function=KeyFunction.ITEM_CHANGE)
		public void zcrduprSubjCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRDUPR_SUBJ_CODE", function=KeyFunction.NEXT_ITEM)
		public void zcrduprSubjCode_keyNexItem()
		{
			if(((ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true)).getZcrduprSubjCode().isNotNull())
				getGCodeClass().nextItem();
			else{
				errorMessage("Invalid Subject value. This field is required");
				throw new ApplicationException();
			}
				
		}
		
		@ActionTrigger(action="KEY-PREVIOUS-ITEM", item="ZCRDUPR_SUBJ_CODE", function=KeyFunction.PREVIOUS_ITEM)
		public void zcrduprSubjCode_keyPreviousItem()
		{
			try {
				previousItem();
			}catch (Exception e) {
				
				ItemDescriptor item = findItem("ZCRDUPR_SUBJ_CODE");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
				
				throw new ApplicationException(e);
			}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRDUPR_SUBJ_CODE", function=KeyFunction.ITEM_OUT)
		public void zcrduprSubjCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_SUBJ_CODE.WHEN-VALIDATE-ITEM
		    IF (:ZCRDUPR_SUBJ_CODE IS NOT NULL) THEN
   	  IF GB_STVSUBJ.F_CODE_EXISTS(:ZCRDUPR_SUBJ_CODE) <> 'Y' THEN
         MESSAGE(
           '*ERROR* Invalid code. Press LIST for valid codes.' ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      END IF;
   END IF;
   

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				if ((zcrduprElement.getZcrduprSubjCode().isNotNull()))
				{
					if ( GbStvsubj.fCodeExists(zcrduprElement.getZcrduprSubjCode()).notEquals("Y") )
					{
						errorMessage("*ERROR* Invalid code. Press LIST for valid codes.");
						throw new ApplicationException();
					}
				}
			}

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_buttonClick()
		{
			ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);
			
			setGlobal("VALUE",NString.getNull());
			goItem("ZCRDUPR_SUBJ_CODE");
			listValues();
			if(getGlobal("VALUE").isNotNull()){
				zcrduprElement.setZcrduprSubjCode((getGlobal("VALUE")));
				keyNexItem();
			}
		}
		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRDUPR_CRSE_NUMB")
		public void zcrduprCrseNumb_buttonClick()
		{
			ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);
			goItem("ZCRDUPR_CRSE_NUMB");
			executeAction("LIST_VALUES");
		}
		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRDUPR_TERM_CODE_START")
		public void zcrduprTermCodeStart_buttonClick()
		{
			ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);
			setGlobal("VALUE",NString.getNull());
			goItem("ZCRDUPR_TERM_CODE_START");
			listValues();
			if(getGlobal("VALUE").isNotNull()){
				zcrduprElement.setZcrduprTermCodeStart((getGlobal("VALUE")));
			}
		}
		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRDUPR_TERM_CODE_END")
		public void zcrduprTermCodeEnd_buttonClick()
		{
			ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);
			setGlobal("VALUE",NString.getNull());
			goItem("ZCRDUPR_TERM_CODE_END");
			listValues();
			if(getGlobal("VALUE").isNotNull()){
				zcrduprElement.setZcrduprTermCodeEnd((getGlobal("VALUE")));
			}
		}
		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRDUPR_GRDE_CODE_MIN")
		public void zcrduprCrdeCodeMin_buttonClick()
		{
			ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);
			setGlobal("VALUE",NString.getNull());
			goItem("ZCRDUPR_GRDE_CODE_MIN");
			listValues();
			if(getGlobal("VALUE").isNotNull()){
				zcrduprElement.setZcrduprGrdeCodeMin(getGlobal("VALUE"));
			}
		}
		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_SUBJ_CODE.POST-CHANGE
		 :ZCRDUPR_SUBJ_CODE_DESC := 
   GB_STVSUBJ.F_GET_DESCRIPTION(:ZCRDUPR_SUBJ_CODE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				zcrduprElement.setZcrduprSubjCodeDesc(GbStvsubj.fGetDescription(zcrduprElement.getZcrduprSubjCode()));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPR_SUBJ_CODE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void zcrduprSubjCodeDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRDUPR_CRSE_NUMB")
		public void zcrduprCrseNumb_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPR_CRSE_NUMB", function=KeyFunction.ITEM_CHANGE)
		public void zcrduprCrseNumb_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_CRSE_NUMB.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('SCBCRKY_CRSE_NUMB','scbcrse_title',
  'where SCBCRKY_CRSE_NUMB = :ZCRDUPR_CRSE_NUMB
   and SCBCRKY_SUBJ_CODE = :ZCRDUPR_SUBJ_CODE
   and scbcrse_subj_code = scbcrky_subj_code
   and scbcrse_crse_numb = scbcrky_crse_numb
   and scbcrse_eff_term in (select max(SCBCRKY_TERM_CODE_START)
                         from scbcrky
                         where SCBCRKY_CRSE_NUMB = :ZCRDUPR_CRSE_NUMB
                         and SCBCRKY_SUBJ_CODE = :ZCRDUPR_SUBJ_CODE
                         and scbcrse_subj_code = scbcrky_subj_code
                         and scbcrse_crse_numb = scbcrky_crse_numb)');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRDUPR_CRSE_NUMB")
		public void zcrduprCrseNumb_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("SCBCRKY_CRSE_NUMB"), toStr("scbcrse_title"), toStr("where SCBCRKY_CRSE_NUMB = :ZCRDUPR_CRSE_NUMB\n   and SCBCRKY_SUBJ_CODE = :ZCRDUPR_SUBJ_CODE\n   and scbcrse_subj_code = scbcrky_subj_code\n   and scbcrse_crse_numb = scbcrky_crse_numb\n   and scbcrse_eff_term in (select max(SCBCRKY_TERM_CODE_START)\n                         from scbcrky\n                         where SCBCRKY_CRSE_NUMB = :ZCRDUPR_CRSE_NUMB\n                         and SCBCRKY_SUBJ_CODE = :ZCRDUPR_SUBJ_CODE\n                         and scbcrse_subj_code = scbcrky_subj_code\n                         and scbcrse_crse_numb = scbcrky_crse_numb)"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRDUPR_CRSE_NUMB")
		public void zcrduprCrseNumb_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRDUPR_CRSE_NUMB", function=KeyFunction.NEXT_ITEM)
		public void zcrduprCrseNumb_keyNexItem()
		{
			try {
				getGCodeClass().nextItem();
			}catch (Exception e) {
				
				ItemDescriptor item = findItem("ZCRDUPR_CRSE_NUMB");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
				
				throw new ApplicationException(e);
			}
			if(!TaskServices.getFormSuccess().getValue()) {
				ItemDescriptor item = findItem("ZCRDUPR_CRSE_NUMB");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
			}
		}
		
		@ActionTrigger(action="KEY-PREVIOUS-ITEM", item="ZCRDUPR_CRSE_NUMB", function=KeyFunction.PREVIOUS_ITEM)
		public void zcrduprCrseNumb_keyPreviousItem()
		{
			try {
				previousItem();
			}catch (Exception e) {
				
				ItemDescriptor item = findItem("ZCRDUPR_CRSE_NUMB");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
				
				throw new ApplicationException(e);
			}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRDUPR_CRSE_NUMB", function=KeyFunction.ITEM_OUT)
		public void zcrduprCrseNumb_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_CRSE_NUMB.KEY-CQUERY
		  :GLOBAL.SCBCRKY_SUBJ_CODE := '' ;
 :GLOBAL.SCBCRKY_CRSE_NUMB := '' ;

   DISPLAY_LOV2('ZCRDUPR_SUBJ_CODE','USCQSUBJD_LOV') ;

   IF :GLOBAL.SCBCRKY_CRSE_NUMB IS NULL 
   	  THEN RETURN ;
   END IF ;
--
   GO_FIELD( 'ZCRDUPR.ZCRDUPR_CRSE_NUMB' ) ;
   :ZCRDUPR_CRSE_NUMB := :GLOBAL.SCBCRKY_CRSE_NUMB ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ZCRDUPR_CRSE_NUMB", function=KeyFunction.COUNT_QUERY)
		public void zcrduprCrseNumb_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				setGlobal("SCBCRKY_SUBJ_CODE", toStr(""));
				setGlobal("SCBCRKY_CRSE_NUMB", toStr(""));
				this.getTask().getServices().displayLov2(toStr("ZCRDUPR_SUBJ_CODE"), toStr("USCQSUBJD_LOV"));
				if ( getGlobal("SCBCRKY_CRSE_NUMB").isNull() )
				{
					return ;
				}
				// 
				goField(toStr("ZCRDUPR.ZCRDUPR_CRSE_NUMB"));
				zcrduprElement.setZcrduprCrseNumb(getGlobal("SCBCRKY_CRSE_NUMB"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_CRSE_NUMB.KEY-LISTVAL
		 GO_ITEM('ZCRDUPR_CRSE_NUMB');
DO_KEY ('COUNT_QUERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ZCRDUPR_CRSE_NUMB", function=KeyFunction.LIST_VALUES)
		public void zcrduprCrseNumb_ListValues()
		{
			
				goItem(toStr("ZCRDUPR_CRSE_NUMB"));
				executeAction(KeyFunction.COUNT_QUERY);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_CRSE_NUMB.WHEN-VALIDATE-ITEM
		 IF NOT (:ZCRDUPR_CRSE_NUMB = '*' OR :ZCRDUPR_CRSE_NUMB = '%') THEN
   IF NOT U_VALID_SUBJ_CRSE (:ZCRDUPR_SUBJ_CODE, :ZCRDUPR_CRSE_NUMB) THEN
      MESSAGE(
'*ERROR* Invalid code. Press LIST for valid codes.' ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRDUPR_CRSE_NUMB")
		public void zcrduprCrseNumb_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				if ( !(zcrduprElement.getZcrduprCrseNumb().equals("*") || zcrduprElement.getZcrduprCrseNumb().equals("%")) )
				{
					if ( this.getTask().getServices().uValidSubjCrse(zcrduprElement.getZcrduprSubjCode(), zcrduprElement.getZcrduprCrseNumb()).not() )
					{
						errorMessage("*ERROR* Invalid code. Press LIST for valid codes.");
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRDUPR_TERM_CODE_START")
		public void zcrduprTermCodeStart_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPR_TERM_CODE_START", function=KeyFunction.ITEM_CHANGE)
		public void zcrduprTermCodeStart_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRDUPR_TERM_CODE_START")
		public void zcrduprTermCodeStart_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRDUPR_TERM_CODE_START")
		public void zcrduprTermCodeStart_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRDUPR_TERM_CODE_START", function=KeyFunction.NEXT_ITEM)
		public void zcrduprTermCodeStart_keyNexItem()
		{
			try {
				getGCodeClass().nextItem();
			}catch (Exception e) {
				
				ItemDescriptor item = findItem("ZCRDUPR_TERM_CODE_START");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
				
				throw new ApplicationException(e);
			}
			if(!TaskServices.getFormSuccess().getValue()) {
				ItemDescriptor item = findItem("ZCRDUPR_TERM_CODE_START");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
			}
		}
		
		@ActionTrigger(action="KEY-PREVIOUS-ITEM", item="ZCRDUPR_TERM_CODE_START", function=KeyFunction.PREVIOUS_ITEM)
		public void zcrduprTermCodeStart_keyPreviousItem()
		{
			try {
				previousItem();
			}catch (Exception e) {
				
				ItemDescriptor item = findItem("ZCRDUPR_TERM_CODE_START");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
				
				throw new ApplicationException(e);
			}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRDUPR_TERM_CODE_START", function=KeyFunction.ITEM_OUT)
		public void zcrduprTermCodeStart_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_TERM_CODE_START.WHEN-VALIDATE-ITEM
		 IF (:ZCRDUPR_TERM_CODE_END IS NOT NULL AND :ZCRDUPR_TERM_CODE_START IS NOT NULL) THEN
   IF :ZCRDUPR_TERM_CODE_END < :ZCRDUPR_TERM_CODE_START THEN
      MESSAGE(G$_NLS.Get('ZCACRSE-8010','FORM',
          '*Error*  Invalid value for Term code end'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRDUPR_TERM_CODE_START")
		public void zcrduprTermCodeStart_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				if ((zcrduprElement.getZcrduprTermCodeEnd().isNotNull() && zcrduprElement.getZcrduprTermCodeStart().isNotNull()))
				{
					if ( zcrduprElement.getZcrduprTermCodeEnd().lesser(zcrduprElement.getZcrduprTermCodeStart()) )
					{
						errorMessage(GNls.Fget(toStr("ZCACRSE-8010"), toStr("FORM"), toStr("*Error*  Invalid value for Term code end")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_TERM_CODE_START.POST-CHANGE
		 IF :ZCRDUPR_TERM_CODE_START IS NOT NULL THEN
	IF (GB_STVTERM.F_CODE_EXISTS(:ZCRDUPR_TERM_CODE_START) <> 'Y') THEN
     MESSAGE(G$_NLS.Get('ZCACRSE-8013', 'FORM','*ERROR* Invalid code, press LIST for valid codes.'));
	END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCRDUPR_TERM_CODE_START")
		public void zcrduprTermCodeStart_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				if ( zcrduprElement.getZcrduprTermCodeStart().isNotNull() )
				{
					if ((GbStvterm.fCodeExists(zcrduprElement.getZcrduprTermCodeStart()).notEquals("Y")))
					{
						errorMessage(GNls.Fget(toStr("ZCACRSE-8013"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRDUPR_TERM_CODE_END")
		public void zcrduprTermCodeEnd_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPR_TERM_CODE_END", function=KeyFunction.ITEM_CHANGE)
		public void zcrduprTermCodeEnd_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRDUPR_TERM_CODE_END")
		public void zcrduprTermCodeEnd_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRDUPR_TERM_CODE_END")
		public void zcrduprTermCodeEnd_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRDUPR_TERM_CODE_END", function=KeyFunction.NEXT_ITEM)
		public void zcrduprTermCodeEnd_keyNexItem()
		{
			
			try {
				getGCodeClass().nextItem();
			}catch (Exception e) {
				
				ItemDescriptor item = findItem("ZCRDUPR_TERM_CODE_END");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
				
				throw new ApplicationException(e);
			}
			if(!TaskServices.getFormSuccess().getValue()) {
				ItemDescriptor item = findItem("ZCRDUPR_TERM_CODE_END");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
			}
		}
		
		@ActionTrigger(action="KEY-PREVIOUS-ITEM", item="ZCRDUPR_TERM_CODE_END", function=KeyFunction.PREVIOUS_ITEM)
		public void zcrduprTermCodeEnd_keyPreviousItem()
		{
			try {
				previousItem();
			}catch (Exception e) {
				
				ItemDescriptor item = findItem("ZCRDUPR_TERM_CODE_END");
				if(item.getValidationMessage().equalsIgnoreCase("This Field is Required."))
					errorMessage(toStr("Invalid ").append(item.getPrompt().getPromptText()).append(" value. ").append(item.getValidationMessage()));
				
				throw new ApplicationException(e);
			}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRDUPR_TERM_CODE_END", function=KeyFunction.ITEM_OUT)
		public void zcrduprTermCodeEnd_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 IF (:ZCRDUPR_TERM_CODE_END IS NOT NULL AND :ZCRDUPR_TERM_CODE_START IS NOT NULL) THEN
   IF :ZCRDUPR_TERM_CODE_END < :ZCRDUPR_TERM_CODE_START THEN
      MESSAGE(G$_NLS.Get('ZCACRSE-8011','FORM',
          '*Error*  Invalid value for Term code end'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRDUPR_TERM_CODE_END")
		public void zcrduprTermCodeEnd_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				if ((zcrduprElement.getZcrduprTermCodeEnd().isNotNull() && zcrduprElement.getZcrduprTermCodeStart().isNotNull()))
				{
					if ( zcrduprElement.getZcrduprTermCodeEnd().lesser(zcrduprElement.getZcrduprTermCodeStart()) )
					{
						errorMessage(GNls.Fget(toStr("ZCACRSE-8011"), toStr("FORM"), toStr("*Error*  Invalid value for Term code end")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_TERM_CODE_END.POST-CHANGE
		 IF :ZCRDUPR_TERM_CODE_END IS NOT NULL THEN
	IF (GB_STVTERM.F_CODE_EXISTS(:ZCRDUPR_TERM_CODE_END) <> 'Y') THEN
     MESSAGE(G$_NLS.Get('ZCACRSE-8014', 'FORM','*ERROR* Invalid code, press LIST for valid codes.'));
	END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCRDUPR_TERM_CODE_END")
		public void zcrduprTermCodeEnd_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				if ( zcrduprElement.getZcrduprTermCodeEnd().isNotNull() )
				{
					if ((GbStvterm.fCodeExists(zcrduprElement.getZcrduprTermCodeEnd()).notEquals("Y")))
					{
						errorMessage(GNls.Fget(toStr("ZCACRSE-8014"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_GRDE_CODE_MIN.WHEN-VALIDATE-ITEM
		 
if :ZCRDUPR_GRDE_CODE_MIN is null
	    then return;
end if;

   DECLARE
      TEMP_VAR VARCHAR2(1);
      CURSOR PTI_CURSOR IS
         SELECT 'x'
         FROM   SHRGRDE
         WHERE  SHRGRDE_CODE = :ZCRDUPR_GRDE_CODE_MIN;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO TEMP_VAR;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
                     '*ERROR* Invalid code; Press <List> for valid codes.', TRUE);
   END ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_GRDE_CODE_MIN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRDUPR_GRDE_CODE_MIN")
		public void zcrduprGrdeCodeMin_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				int rowCount = 0;
				if ( zcrduprElement.getZcrduprGrdeCodeMin().isNull() )
				{
					return ;
				}
				{
					NString tempVar = NString.getNull();
					String sqlptiCursor = "SELECT 'x' " +
	" FROM SHRGRDE " +
	" WHERE SHRGRDE_CODE = :ZCRDUPR_GRDE_CODE_MIN ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("ZCRDUPR_GRDE_CODE_MIN", zcrduprElement.getZcrduprGrdeCodeMin());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							tempVar = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), toStr("*ERROR* Invalid code; Press <List> for valid codes."), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_GRDE_CODE_MIN.KEY-NEXT-ITEM
		 DECLARE

   L_SUBJECT VARCHAR2(10);
   L_START_TERM VARCHAR2(10);
   L_END_TERM VARCHAR2(10);
   L_GRADE VARCHAR2(10);

   CURSOR CRSE_CURSOR IS
      SELECT DISTINCT SCBCRSE_CRSE_NUMB
      FROM SCBCRSE
      WHERE SCBCRSE_SUBJ_CODE = L_SUBJECT;
      
BEGIN
   IF :ZCRDUPR_CRSE_NUMB = '*' OR :ZCRDUPR_CRSE_NUMB = '%' THEN
      L_SUBJECT := :ZCRDUPR_SUBJ_CODE;
      L_START_TERM := :ZCRDUPR_TERM_CODE_START;
      L_END_TERM := :ZCRDUPR_TERM_CODE_END;
      L_GRADE := :ZCRDUPR_GRDE_CODE_MIN;
      DELETE_RECORD;
      LAST_RECORD;
      FOR C1 IN CRSE_CURSOR LOOP
         CREATE_RECORD;
         :ZCRDUPR_SUBJ_CODE := L_SUBJECT;
         :ZCRDUPR_CRSE_NUMB := C1.SCBCRSE_CRSE_NUMB;
         :ZCRDUPR_TERM_CODE_START := L_START_TERM;
         :ZCRDUPR_TERM_CODE_END := L_END_TERM;
         :ZCRDUPR_GRDE_CODE_MIN := L_GRADE;
      END LOOP;
   END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_GRDE_CODE_MIN.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRDUPR_GRDE_CODE_MIN", function=KeyFunction.NEXT_ITEM)
		public void zcrduprGrdeCodeMin_keyNexItem()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				int rowCount = 0;
				{
					NString lSubject = NString.getNull();
					NString lStartTerm = NString.getNull();
					NString lEndTerm = NString.getNull();
					NString lGrade = NString.getNull();
					String sqlcrseCursor = "SELECT DISTINCT SCBCRSE_CRSE_NUMB " +
	" FROM SCBCRSE " +
	" WHERE SCBCRSE_SUBJ_CODE = :P_L_SUBJECT ";
					DataCursor crseCursor = new DataCursor(sqlcrseCursor);
					if ( zcrduprElement.getZcrduprCrseNumb().equals("*") || zcrduprElement.getZcrduprCrseNumb().equals("%") )
					{
						lSubject = zcrduprElement.getZcrduprSubjCode();
						lStartTerm = zcrduprElement.getZcrduprTermCodeStart();
						lEndTerm = zcrduprElement.getZcrduprTermCodeEnd();
						lGrade = zcrduprElement.getZcrduprGrdeCodeMin();
						deleteRecord();
						lastRecord();
						//Setting query parameters
						crseCursor.addParameter("P_L_SUBJECT", lSubject);
						try
						{
							crseCursor.open();
							while (true)
							{
								TableRow c1 = crseCursor.fetchRow();
								if ( crseCursor.notFound() ) break;
								createRecord();
								zcrduprElement.setZcrduprSubjCode(lSubject);
								zcrduprElement.setZcrduprCrseNumb(c1.getStr("SCBCRSE_CRSE_NUMB"));
								zcrduprElement.setZcrduprTermCodeStart(lStartTerm);
								zcrduprElement.setZcrduprTermCodeEnd(lEndTerm);
								zcrduprElement.setZcrduprGrdeCodeMin(lGrade);
							}
						}finally{
							crseCursor.close();
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void zcrdupr_AfterQuery(RowAdapterEvent args)
		{
			
				// F2J_INFO : Empty AfterQuery automatically generated for POST-CHANGE support. Do not remove.
		}

		
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD, fireInSearch=false)
		public void zcrdupr_DeleteRecord()
		{
			try{
					setFormValidationEnabled(false);
					deleteRecord();
			}finally {
					setFormValidationEnabled(true);
			}
		}

	
}
