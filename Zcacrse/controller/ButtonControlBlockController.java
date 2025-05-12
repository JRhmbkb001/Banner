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

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
		
public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER ZCRGECO_ENDCOPY_LBT.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_ENDCOPY_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRGECO_ENDCOPY_LBT")
		@Before
		public void zcrgecoEndcopyLbt_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_ENDCOPY_LBT.WHEN-BUTTON-PRESSED
		 IF :SYSTEM.CURRENT_BLOCK = 'ZCRGECO' THEN
  SET_WINDOW_PROPERTY('G$_OPT_WINDOW',POSITION,19,7);
  MAINTENANCE_OPTIONS('ZCRGECO_SUBJ_CODE_COCRSE',
                      'End Co-Requisite Course Data',
                      'Copy Co-Requisite Course Data');
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_ENDCOPY_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRGECO_ENDCOPY_LBT")
		public void zcrgecoEndcopyLbt_buttonClick()
		{
			
				if ( getCurrentBlock().equals("ZCRGECO") )
				{
					// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details.
					//					SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 19, 7);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details.");
					
					this.getTask().getServices().maintenanceOptions(toStr("ZCRGECO_SUBJ_CODE_COCRSE"), toStr("End Co-Requisite Course Data"), toStr("Copy Co-Requisite Course Data"));
					getTask().getGoqrpls().gCheckFailure();
				}
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
		 * ZCRGECO_CRSE_NUMB_COCRSE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRGECO_CRSE_NUMB_COCRSE_LBT")
		@Before
		public void zcrgecoCrseNumbCocrseLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_GE_VERSION_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRGECO_GE_VERSION_LBT")
		@Before
		public void zcrgecoGeVersionLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_CRSE_NUMB_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="KB_CRSE_NUMB_LBT")
		@Before
		public void kbCrseNumbLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER KB_CRSE_NUMB_LBT.WHEN-BUTTON-PRESSED
		 DO_KEY ('COUNT_QUERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_CRSE_NUMB_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="KB_CRSE_NUMB_LBT")
		public void kbCrseNumbLbt_buttonClick()
		{
			
				executeAction(KeyFunction.COUNT_QUERY);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="KB_TERM_CODE_EFF_LBT")
		@Before
		public void kbTermCodeEffLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER KB_TERM_CODE_EFF_LBT.WHEN-BUTTON-PRESSED
		 
SET_WINDOW_PROPERTY('G$_OPT_WINDOW',POSITION,25,3);
G$_KEY_OPT_MENU('KEY_BLOCK.KB_TERM_CODE_EFF', 
                 G$_NLS.Get('ZCACRSE-0172', 'FORM','Valid Terms for Course') , 'LIST_VALUES',
                 G$_NLS.Get('ZCACRSE-0174', 'FORM','View Existing Courses') , 'COUNT_QUERY',
                 '','','','');
G$_CHECK_FAILURE;
:CHECK_KEYS := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="KB_TERM_CODE_EFF_LBT", fireInSearch=false)
		public void kbTermCodeEffLbt_buttonClick()
		{
			
				// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details.
				//				SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 25, 3);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details.");
				
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.KB_TERM_CODE_EFF"), GNls.Fget(toStr("ZCACRSE-0172"), toStr("FORM"), toStr("Valid Terms for Course")), toStr("LIST_VALUES"), GNls.Fget(toStr("ZCACRSE-0174"), toStr("FORM"), toStr("View Existing Courses")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="KB_SUBJ_CODE_LBT")
		@Before
		public void kbSubjCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER KB_SUBJ_CODE_LBT.WHEN-BUTTON-PRESSED
		 SET_WINDOW_PROPERTY('G$_OPT_WINDOW',POSITION,25,3);
G$_KEY_OPT_MENU('KEY_BLOCK.KB_SUBJ_CODE', 
                 G$_NLS.Get('ZCACRSE-0177', 'FORM','Valid Subject Codes') , 'LIST_VALUES',
                 G$_NLS.Get('ZCACRSE-0179', 'FORM','View Existing Courses') , 'COUNT_QUERY',
                 '','','','');
G$_CHECK_FAILURE;
:CHECK_KEYS := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="KB_SUBJ_CODE_LBT", fireInSearch=false)
		public void kbSubjCodeLbt_buttonClick()
		{
			
				// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details.
				//				SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 25, 3);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details.");
				
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.KB_SUBJ_CODE"), GNls.Fget(toStr("ZCACRSE-0177"), toStr("FORM"), toStr("Valid Subject Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("ZCACRSE-0179"), toStr("FORM"), toStr("View Existing Courses")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
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
		 * ZCBCRSE_CRSE_NUMB_XLIST_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCBCRSE_CRSE_NUMB_XLIST_LBT")
		@Before
		public void zcbcrseCrseNumbXlistLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_CRSE_NUMB_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRDUPR_CRSE_NUMB_LBT")
		@Before
		public void zcrduprCrseNumbLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_START_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRDUPR_TERM_CODE_START_LBT")
		@Before
		public void zcrduprTermCodeStartLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRDUPR_TERM_CODE_END_LBT")
		@Before
		public void zcrduprTermCodeEndLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_GRDE_CODE_MIN_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRDUPR_GRDE_CODE_MIN_LBT")
		@Before
		public void zcrduprGrdeCodeMinLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_START_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRDUPS_TERM_CODE_START_LBT")
		@Before
		public void zcrdupsTermCodeStartLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPS_TERM_CODE_END_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRDUPS_TERM_CODE_END_LBT")
		@Before
		public void zcrdupsTermCodeEndLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_ENDCOPY_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCBCRSE_ENDCOPY_LBT")
		@Before
		public void zcbcrseEndcopyLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_ENDCOPY_LBT.WHEN-BUTTON-PRESSED
		 IF :SYSTEM.CURRENT_BLOCK = 'ZCBCRSE' THEN
  SET_WINDOW_PROPERTY('G$_OPT_WINDOW',POSITION,19,7);
  MAINTENANCE_OPTIONS('ZCBCRSE_SUBJ_CODE_XLIST',
                      'End XList/Dup. Override Data',
                      'Copy XList/Dup. Override Data');
  G$_CHECK_FAILURE;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_ENDCOPY_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCBCRSE_ENDCOPY_LBT", fireInSearch=false)
		public void zcbcrseEndcopyLbt_buttonClick()
		{
			
				if ( getCurrentBlock().equals("ZCBCRSE") )
				{
					// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details.
					//					SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 19, 7);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details.");
					
					this.getTask().getServices().maintenanceOptions(toStr("ZCBCRSE_SUBJ_CODE_XLIST"), toStr("End XList/Dup. Override Data"), toStr("Copy XList/Dup. Override Data"));
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_7_COPY_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SCRSCHD_7_COPY_BTN")
		@Before
		public void scrschd7CopyBtn_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD_7_COPY_BTN.WHEN-BUTTON-PRESSED
		 GO_BLOCK('SCRSCHD');
DO_KEY('DUPLICATE_RECORD');
SET_ITEM_PROPERTY('SCRSCHD_7_COPY_BTN',ENABLED,PROPERTY_OFF);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_7_COPY_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SCRSCHD_7_COPY_BTN", fireInSearch=false)
		public void scrschd7CopyBtn_buttonClick()
		{
			
				goBlock(toStr("SCRSCHD"));
				executeAction(KeyFunction.DUPLICATE_RECORD);
				setItemEnabled("SCRSCHD_7_COPY_BTN", false);
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
		 * ZCRDUPC_ENDCOPY_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ZCRDUPC_ENDCOPY_LBT")
		@Before
		public void zcrdupcEndcopyLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC_ENDCOPY_LBT.WHEN-BUTTON-PRESSED
		 IF :SYSTEM.CURRENT_BLOCK = 'ZCRDUPC' THEN
  SET_WINDOW_PROPERTY('G$_OPT_WINDOW',POSITION,19,7);
  MAINTENANCE_OPTIONS('ZCRDUPC.ZCRDUPC_UNITS',
                      'End Rules Data',
                      'Copy Rules Data');
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC_ENDCOPY_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRDUPC_ENDCOPY_LBT")
		public void zcrdupcEndcopyLbt_buttonClick()
		{
			
				if ( getCurrentBlock().equals("ZCRDUPC") )
				{
					// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details.
					//					SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 19, 7);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details.");
					
					this.getTask().getServices().maintenanceOptions(toStr("ZCRDUPC.ZCRDUPC_UNITS"), toStr("End Rules Data"), toStr("Copy Rules Data"));
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
	
	
}
