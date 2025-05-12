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
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.errorMessage;
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
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
		
public class ZcrdupsController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public ZcrdupsController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER ZCRDUPS.KEY-PRVBLK
		 GO_BLOCK('ZCRDUPC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void zcrdups_PreviousBlock()
		{
			
				goBlock(toStr("ZCRDUPC"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPS.WHEN-NEW-BLOCK-INSTANCE
		 IF :ZCRDUPC.ZCRDUPC_UNITS IS NULL THEN
  GO_ITEM('ZCRDUPC.ZCRDUPC_UNITS');
END IF;
IF (:KB_TERM_CODE_EFF != :ZCRDUPC_TERM_CODE_FROM) 
THEN MESSAGE(G$_NLS.Get('ZCACRSE-8006','FORM',
'*ERROR* Cannot update unless From term equal Key Block term.'),NO_ACKNOWLEDGE) ;
  go_block('ZCRDUPC');
END IF ;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void zcrdups_blockChange()
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

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPS.KEY-NXTBLK
		 :SYSTEM.MESSAGE_LEVEL := '5' ;
GO_BLOCK('ZCBCRSE');
:SYSTEM.MESSAGE_LEVEL := '0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void zcrdups_NextBlock()
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
		 * ZCRDUPS_TERM_CODE_START.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRDUPS_TERM_CODE_START")
		public void zcrdupsTermCodeStart_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_START.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPS_TERM_CODE_START", function=KeyFunction.ITEM_CHANGE)
		public void zcrdupsTermCodeStart_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_START.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRDUPS_TERM_CODE_START")
		public void zcrdupsTermCodeStart_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_START.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRDUPS_TERM_CODE_START")
		public void zcrdupsTermCodeStart_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_START.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRDUPS_TERM_CODE_START", function=KeyFunction.NEXT_ITEM)
		public void zcrdupsTermCodeStart_keyNexItem()
		{
			try {
				getGCodeClass().nextItem();
			}catch(Exception e) {
				setCanvasTopMostTabPage("ZCACRSE_TAB_2_CANVAS", "ZCRDUPC_PAGE");
				throw new ApplicationException(e);
			}
			setCanvasTopMostTabPage("ZCACRSE_TAB_2_CANVAS", "ZCRDUPC_PAGE");
			
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_START.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRDUPS_TERM_CODE_START", function=KeyFunction.ITEM_OUT)
		public void zcrdupsTermCodeStart_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPS_TERM_CODE_START.WHEN-VALIDATE-ITEM
		 IF (:ZCRDUPS_TERM_CODE_END IS NOT NULL AND :ZCRDUPS_TERM_CODE_START IS NOT NULL) THEN
   IF :ZCRDUPS_TERM_CODE_END < :ZCRDUPS_TERM_CODE_START THEN
      MESSAGE(G$_NLS.Get('ZCACRSE-8017','FORM',
          '*Error*  Invalid value for Term code end'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_START.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRDUPS_TERM_CODE_START")
		public void zcrdupsTermCodeStart_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupsAdapter zcrdupsElement = (ZcrdupsAdapter)this.getFormModel().getZcrdups().getRowAdapter(true);


				if ((zcrdupsElement.getZcrdupsTermCodeEnd().isNotNull() && zcrdupsElement.getZcrdupsTermCodeStart().isNotNull()))
				{
					if ( zcrdupsElement.getZcrdupsTermCodeEnd().lesser(zcrdupsElement.getZcrdupsTermCodeStart()) )
					{
						errorMessage(GNls.Fget(toStr("ZCACRSE-8017"), toStr("FORM"), toStr("*Error*  Invalid value for Term code end")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPS_TERM_CODE_START.POST-CHANGE
		 IF :ZCRDUPS_TERM_CODE_START IS NOT NULL THEN
	IF (GB_STVTERM.F_CODE_EXISTS(:ZCRDUPS_TERM_CODE_START) <> 'Y') THEN
     MESSAGE(G$_NLS.Get('ZCACRSE-8018', 'FORM','*ERROR* Invalid code, press LIST for valid codes.'));
	END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_START.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCRDUPS_TERM_CODE_START")
		public void zcrdupsTermCodeStart_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupsAdapter zcrdupsElement = (ZcrdupsAdapter)this.getFormModel().getZcrdups().getRowAdapter(true);


				if ( zcrdupsElement.getZcrdupsTermCodeStart().isNotNull() )
				{
					if ((GbStvterm.fCodeExists(zcrdupsElement.getZcrdupsTermCodeStart()).notEquals("Y")))
					{
						errorMessage(GNls.Fget(toStr("ZCACRSE-8018"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRDUPS_TERM_CODE_END")
		public void zcrdupsTermCodeEnd_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPS_TERM_CODE_END", function=KeyFunction.ITEM_CHANGE)
		public void zcrdupsTermCodeEnd_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRDUPS_TERM_CODE_END")
		public void zcrdupsTermCodeEnd_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRDUPS_TERM_CODE_END")
		public void zcrdupsTermCodeEnd_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRDUPS_TERM_CODE_END", function=KeyFunction.NEXT_ITEM)
		public void zcrdupsTermCodeEnd_keyNexItem()
		{
			try {
			getGCodeClass().nextItem();
			}catch(Exception e) {
				setCanvasTopMostTabPage("ZCACRSE_TAB_2_CANVAS", "ZCRDUPC_PAGE");
			throw new ApplicationException(e);
		}
		setCanvasTopMostTabPage("ZCACRSE_TAB_2_CANVAS", "ZCRDUPC_PAGE");
		}

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void zcrdupsController_keyNexItem()
		{
			try {
				nextItem();
			}catch(Exception e) {
				setCanvasTopMostTabPage("ZCACRSE_TAB_2_CANVAS", "ZCRDUPC_PAGE");
				throw new ApplicationException(e);
			}
			setCanvasTopMostTabPage("ZCACRSE_TAB_2_CANVAS", "ZCRDUPC_PAGE");
				
		}
		
		@ActionTrigger(action="KEY-PREVIOUS-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void zcrduprController_keyPreviousItem()
		{
			try {
				previousItem();
				
			}catch (Exception e) {
				setCanvasTopMostTabPage("ZCACRSE_TAB_2_CANVAS", "ZCRDUPC_PAGE");
				throw new ApplicationException(e);
			}
		}
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRDUPS_TERM_CODE_END", function=KeyFunction.ITEM_OUT)
		public void zcrdupsTermCodeEnd_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPS_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 IF (:ZCRDUPS_TERM_CODE_END IS NOT NULL AND :ZCRDUPS_TERM_CODE_START IS NOT NULL) THEN
   IF :ZCRDUPS_TERM_CODE_END < :ZCRDUPS_TERM_CODE_START THEN
      MESSAGE(G$_NLS.Get('ZCACRSE-8018','FORM',
          '*Error*  Invalid value for Term code end'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRDUPS_TERM_CODE_END")
		public void zcrdupsTermCodeEnd_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupsAdapter zcrdupsElement = (ZcrdupsAdapter)this.getFormModel().getZcrdups().getRowAdapter(true);


				if ((zcrdupsElement.getZcrdupsTermCodeEnd().isNotNull() && zcrdupsElement.getZcrdupsTermCodeStart().isNotNull()))
				{
					if ( zcrdupsElement.getZcrdupsTermCodeEnd().lesser(zcrdupsElement.getZcrdupsTermCodeStart()) )
					{
						errorMessage(GNls.Fget(toStr("ZCACRSE-8018"), toStr("FORM"), toStr("*Error*  Invalid value for Term code end")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPS_TERM_CODE_END.POST-CHANGE
		 IF :ZCRDUPS_TERM_CODE_END IS NOT NULL THEN
	IF (GB_STVTERM.F_CODE_EXISTS(:ZCRDUPS_TERM_CODE_END) <> 'Y') THEN
     MESSAGE(G$_NLS.Get('ZCACRSE-8020', 'FORM','*ERROR* Invalid code, press LIST for valid codes.'));
	END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCRDUPS_TERM_CODE_END")
		public void zcrdupsTermCodeEnd_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupsAdapter zcrdupsElement = (ZcrdupsAdapter)this.getFormModel().getZcrdups().getRowAdapter(true);


				if ( zcrdupsElement.getZcrdupsTermCodeEnd().isNotNull() )
				{
					if ((GbStvterm.fCodeExists(zcrdupsElement.getZcrdupsTermCodeEnd()).notEquals("Y")))
					{
						errorMessage(GNls.Fget(toStr("ZCACRSE-8020"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void zcrdups_AfterQuery(RowAdapterEvent args)
		{
			
				// F2J_INFO : Empty AfterQuery automatically generated for POST-CHANGE support. Do not remove.
		}

		@ActionTrigger(function=KeyFunction.DELETE_RECORD)
		public void deleteRecordAction()
		{
			List<ItemDescriptor> a = findBlock(getCurrentBlock()).getItems();
			List<String> b = new ArrayList<String>();
			try {
				
				for (ItemDescriptor c : a) {
					if(c.getRequired()) {
						b.add(c.getId());
						c.setRequired(false);
					}
				}
				deleteRecord();
			}catch(Exception e) {
				for (String c : b) {
					setItemRequired(c, true);
				}
				throw new ApplicationException(e);
			}
			for (String c : b) {
				setItemRequired(c, true);
			}
		}
		
	
	
}
