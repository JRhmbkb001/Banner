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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;

import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.ucdavis.ps.banner.student.Zcacrse.model.*;
import net.hedtech.ucdavis.ps.banner.student.Zcacrse.*;
import net.hedtech.ucdavis.ps.banner.student.Zcacrse.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;

public class ZcacrseFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public ZcacrseFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public ZcacrseTask getTask() {
		return (ZcacrseTask)super.getTask();
	}
	
	
	public ZcacrseModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Zcacrse_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Zcacrse_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.BANNER_XE_SEND_CONTEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BANNER_XE_SEND_CONTEXT")
		public void Zcacrse_BannerXeSendContext()
		{
			
			getGApplFormClass().bannerXeSendContext();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-CUSTOM-JAVASCRIPT-EVENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-CUSTOM-JAVASCRIPT-EVENT")
		public void Zcacrse_WhenCustomJavascriptEvent()
		{
			
			getGApplFormClass().whenCustomJavascriptEvent();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Zcacrse_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Zcacrse_PreFormTrg()
		{
			
			getGFormClass().preFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Zcacrse_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Zcacrse_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Zcacrse_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Zcacrse_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Zcacrse_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Zcacrse_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Zcacrse_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Zcacrse_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Zcacrse_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Zcacrse_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@ActionTrigger(action="ON_ERROR")
		public void Zcacrse_OnError(Exception args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.ON-ROLLBACK
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnRollback
		public void Zcacrse_OnRollback(EventObject args)
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Zcacrse_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.ON-SELECT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@QueryExecute
		public void Zcacrse_QueryExecute(EventObject args)
		{
			
			getGFormClass().queryExecute(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Zcacrse_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Zcacrse_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Zcacrse_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Zcacrse_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.WHEN_NEW_BLOCK_INSTANCE_TRG
		 BEGIN
	
IF :CHECK_KEYS = 'Y' THEN
  :CHECK_KEYS := 'N';
  GO_BLOCK ('KEY_BLOCK');

  EXECUTE_TRIGGER( 'VALIDATE_KEY' ) ;
  G$_CHECK_FAILURE ;
  
  :SYSTEM.MESSAGE_LEVEL := '5';

  GO_BLOCK('ZCBCRSE');
  
	EXECUTE_QUERY;
	
	IF :ZCBCRSE_TERM_CODE_FROM = :KB_TERM_CODE_EFF 
		 OR (:ZCBCRSE_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF IS NULL) THEN
			NULL;
	ELSE
		 IF GET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED) = 'FALSE' THEN
        SET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED,PROPERTY_ON);
     END IF;
	END IF;	
	
  GO_BLOCK('SCRSCHD');

	EXECUTE_QUERY;
	
	IF :SCRSCHD_TERM_CODE_FROM = :KB_TERM_CODE_EFF 
		 OR (:SCRSCHD_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF IS NULL) THEN
 		 NULL;
	ELSE
		 IF GET_ITEM_PROPERTY('SCRSCHD_7_COPY_BTN',ENABLED) = 'FALSE' THEN
        SET_ITEM_PROPERTY('SCRSCHD_7_COPY_BTN',ENABLED,PROPERTY_ON);
     END IF;
	END IF;	
	
	GO_BLOCK('ZCRGECO');
	
	EXECUTE_QUERY;

	IF :ZCRGECO_TERM_CODE_FROM = :KB_TERM_CODE_EFF 
		 OR (:ZCRGECO_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF IS NULL) THEN
 		 NULL;
	ELSE
		 IF GET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED) = 'FALSE' THEN
        SET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED,PROPERTY_ON);
     END IF;
	END IF;	
	
  GO_BLOCK('ZCRDUPC');
  EXECUTE_QUERY;
	
	IF (:ZCRDUPC_TERM_CODE_FROM = :KB_TERM_CODE_EFF
		  OR (:ZCRDUPC_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF IS NULL)  )THEN
		  NULL;
	ELSE
		  IF GET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT', ENABLED) = 'FALSE' THEN
		  	SET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT', ENABLED, PROPERTY_ON);
		  END IF;
	END IF;
	
	GO_BLOCK('ZCBCRSE');
	
  :CHECK_KEYS := 'N';
  EXECUTE_TRIGGER ('DISABLE_KEYS');
  EXECUTE_TRIGGER ('ENABLE_TABS');
  G$_CHECK_FAILURE;
  
  :SYSTEM.MESSAGE_LEVEL := '0';
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Zcacrse_WhenNewBlockInstanceTrg()
		{
			
				if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
				{
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					goBlock(toStr("KEY_BLOCK"));
					executeAction("VALIDATE_KEY");
					getTask().getGoqrpls().gCheckFailure();
					try {
						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
						goBlock(toStr("ZCBCRSE"));
						executeQuery();
						if ( getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
						{
						}
						else {
							if ( getItemEnabled("ZCBCRSE_ENDCOPY_LBT").equals("FALSE") )
							{
								setItemEnabled("ZCBCRSE_ENDCOPY_LBT", true);
							}
						}
						goBlock(toStr("SCRSCHD"));
						executeQuery();
						if ( getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
						{
						}
						else {
							if ( getItemEnabled("SCRSCHD_7_COPY_BTN").equals("FALSE") )
							{
								setItemEnabled("SCRSCHD_7_COPY_BTN", true);
							}
						}
						goBlock(toStr("ZCRGECO"));
						executeQuery();
						if ( getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
						{
						}
						else {
							if ( getItemEnabled("ZCRGECO_ENDCOPY_LBT").equals("FALSE") )
							{
								setItemEnabled("ZCRGECO_ENDCOPY_LBT", true);
							}
						}
						goBlock(toStr("ZCRDUPC"));
						executeQuery();
						if ((getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull())))
						{
						}
						else {
							if ( getItemEnabled("ZCRDUPC_ENDCOPY_LBT").equals("FALSE") )
							{
								setItemEnabled("ZCRDUPC_ENDCOPY_LBT", true);
							}
						}
						goBlock(toStr("ZCBCRSE"));
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
						executeAction("DISABLE_KEYS");
						executeAction("ENABLE_TABS");
						getTask().getGoqrpls().gCheckFailure();
					}finally{
						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					}
					
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Zcacrse_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Zcacrse_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Zcacrse_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Zcacrse_WhenWindowActivatedTrg()
		{
			
			getGFormClass().whenWindowActivatedTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Zcacrse_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.KEY-CLRFRM
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_CLRFRM;
  G$_CHECK_FAILURE;
--
-- 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
--         procedure to control the behavior of the current form
--         when it has been invoked as part of a Workflow activity
--         and a user attempts to rollback the form.
--
--         If Workflow is not installed or is not enabled at
--         a client site, or if the current form has not
--         been invoked as part of a Workflow activity, the
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform
--         any Workflow function.
--
  IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
    G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_ROLLBACK');
  END IF;

--
  
  :GLOBAL.VALUE := 'KEY-CLRFRM';
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--   
   SET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SCRSCHD_7_COPY_BTN',ENABLED,PROPERTY_OFF);   
   SET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);
--
   EXECUTE_TRIGGER('ENABLE_KEYS') ;
   G$_CHECK_FAILURE ;   
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ; 
   
   EXECUTE_TRIGGER('DISABLE_TABS');
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM, fireInSearch=false)
		public void Zcacrse_ClearTask()
		{
			
				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyClrfrm();
				getTask().getGoqrpls().gCheckFailure();
				// 
				//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
				//          procedure to control the behavior of the current form
				//          when it has been invoked as part of a Workflow activity
				//          and a user attempts to rollback the form.
				// 
				//          If Workflow is not installed or is not enabled at
				//          a client site, or if the current form has not
				//          been invoked as part of a Workflow activity, the
				//          G$_WF_DRIVER.WF_EXECUTE procedure will not perform
				//          any Workflow function.
				// 
				if ( isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y") )
				{
					getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_ROLLBACK"));
				}
				// 
				setGlobal("VALUE", toStr("KEY-CLRFRM"));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				//    
				setItemEnabled("ZCBCRSE_ENDCOPY_LBT", false);
				setItemEnabled("SCRSCHD_7_COPY_BTN", false);
				setItemEnabled("ZCRGECO_ENDCOPY_LBT", false);
				// 
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("DISABLE_TABS");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Zcacrse_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Zcacrse_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2, fireInSearch=false)
		public void Zcacrse_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-F6
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F6", function=KeyFunction.KEY_F6)
		public void Zcacrse_F6()
		{
			
			getGApplFormClass().f6();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN, fireInSearch=false)
		public void Zcacrse_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP, fireInSearch=false)
		public void Zcacrse_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Zcacrse_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Zcacrse_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK, fireInSearch=false)
		public void Zcacrse_NextBlock()
		{
			
			getGFormClass().nextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK, fireInSearch=false)
		public void Zcacrse_PreviousBlock()
		{
			
			getGFormClass().previousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Zcacrse_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Zcacrse_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Zcacrse_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Zcacrse_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Zcacrse_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Zcacrse_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Zcacrse_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Zcacrse_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Zcacrse_Exit()
		{
			
			getGFormClass().exit();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Zcacrse_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Zcacrse_KeyNxtkey()
		{
			
			getGFormClass().keyNxtkey();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Zcacrse_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Zcacrse_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.SAVE_KEYS
		    :GLOBAL.KEY_SUBJECT := :KB_SUBJ_CODE ;
--
   :GLOBAL.KEY_COURSE := :KB_CRSE_NUMB ;
--
   :GLOBAL.KEY_TERM := :KB_TERM_CODE_EFF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Zcacrse_SaveKeys()
		{
			
				setGlobal("KEY_SUBJECT", getFormModel().getKeyBlock().getKbSubjCode());
				// 
				setGlobal("KEY_COURSE", getFormModel().getKeyBlock().getKbCrseNumb());
				// 
				setGlobal("KEY_TERM", getFormModel().getKeyBlock().getKbTermCodeEff());
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Zcacrse_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY", fireInSearch=false)
		public void Zcacrse_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Zcacrse_CheckKeys()
		{
			
			getGApplFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Zcacrse_recordChange()
		{
			
			getGApplFormClass().recordChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.LOAD_FORM_HEADER
		 BEGIN
  :CURRENT_FORM := :SYSTEM.CURRENT_FORM ;
  :CURRENT_DATE := TO_CHAR(SYSDATE, 'DD-MON-YYYY') ;
  :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ;
  :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
  EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
  G$_CHECK_FAILURE ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER", fireInSearch=false)
		public void Zcacrse_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentDate(toChar(DbManager.getDBDateTime(), "DD-MON-YYYY"));
				getFormModel().getFormHeader().setCurrentTime(toChar(DbManager.getDBDateTime(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				executeAction("LOAD_CURRENT_RELEASE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '7.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Zcacrse_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.WHEN-NEW-FORM-INSTANCE
		 BEGIN
   G$_SET_INST_PROPERTY;
   G$_SET_WIN_PROPERTY;
--   
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   
   SET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SCRSCHD_7_COPY_BTN',ENABLED,PROPERTY_OFF);      
   SET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);
   
   EXECUTE_TRIGGER('DISABLE_TABS');   
   HIDE_VIEW('ZCRDUPS_1_CANVAS');
END;
		*/
		/*
		 *<p>
		 *The KEY-STARTUP trigger loads the form header information and goes to the
		 *next block.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Zcacrse_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				//    
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				setItemEnabled("ZCBCRSE_ENDCOPY_LBT", false);
				setItemEnabled("SCRSCHD_7_COPY_BTN", false);
				setItemEnabled("ZCRGECO_ENDCOPY_LBT", false);
				executeAction("DISABLE_TABS");
				hideView("ZCRDUPS_1_CANVAS");
				hideView("ZCRDUPS_2_CANVAS");
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.GLOBAL_COPY
		    :KB_SUBJ_CODE := :GLOBAL.KEY_SUBJECT ;

   :KB_CRSE_NUMB := :GLOBAL.KEY_COURSE ;
--
   :KB_TERM_CODE_EFF := :GLOBAL.KEY_TERM ;
   
   IF :KB_SUBJ_CODE IS NOT NULL  THEN
      NEXT_FIELD ;
      NEXT_FIELD;
      NEXT_FIELD ;
   END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY", fireInSearch=false)
		public void Zcacrse_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setKbSubjCode(getGlobal("KEY_SUBJECT"));
				getFormModel().getKeyBlock().setKbCrseNumb(getGlobal("KEY_COURSE"));
				// 
				getFormModel().getKeyBlock().setKbTermCodeEff(getGlobal("KEY_TERM"));
				if ( getFormModel().getKeyBlock().getKbSubjCode().isNotNull() )
				{
					nextItem();
					nextItem();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('KB_CRSE_NUMB',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('KB_CRSE_NUMB',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('KB_CRSE_NUMB',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('KB_SUBJ_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('KB_SUBJ_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('KB_SUBJ_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('KB_TERM_CODE_EFF',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('KB_TERM_CODE_EFF',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('KB_TERM_CODE_EFF',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('KB_SUBJ_CODE_LBT',ENABLED) = 'FALSE' THEN
SET_ITEM_PROPERTY('KB_SUBJ_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('KB_TERM_CODE_EFF_LBT',ENABLED) = 'FALSE' THEN
SET_ITEM_PROPERTY('KB_TERM_CODE_EFF_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('KB_CRSE_NUMB_LBT',ENABLED) = 'FALSE' THEN
SET_ITEM_PROPERTY('KB_CRSE_NUMB_LBT',ENABLED,PROPERTY_ON);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS", fireInSearch=false)
		public void Zcacrse_EnableKeys()
		{
			
				if ( getItemEnabled("KB_CRSE_NUMB").equals("FALSE") )
				{
					setItemEnabled("KB_CRSE_NUMB", true);
					setItemNavigable("KB_CRSE_NUMB", true);
				}
				if ( getItemEnabled("KB_SUBJ_CODE").equals("FALSE") )
				{
					setItemEnabled("KB_SUBJ_CODE", true);
					setItemNavigable("KB_SUBJ_CODE", true);
				}
				if ( getItemEnabled("KB_TERM_CODE_EFF").equals("FALSE") )
				{
					setItemEnabled("KB_TERM_CODE_EFF", true);
					setItemNavigable("KB_TERM_CODE_EFF", true);
				}
				if ( getItemEnabled("KB_SUBJ_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("KB_SUBJ_CODE_LBT", true);
				}
				if ( getItemEnabled("KB_TERM_CODE_EFF_LBT").equals("FALSE") )
				{
					setItemEnabled("KB_TERM_CODE_EFF_LBT", true);
				}
				if ( getItemEnabled("KB_CRSE_NUMB_LBT").equals("FALSE") )
				{
					setItemEnabled("KB_CRSE_NUMB_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.DISABLE_KEYS
		 SET_ITEM_PROPERTY('KB_CRSE_NUMB',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('KB_SUBJ_CODE',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('KB_TERM_CODE_EFF',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('KB_SUBJ_CODE_LBT',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('KB_TERM_CODE_EFF_LBT',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('KB_CRSE_NUMB_LBT',ENABLED,PROPERTY_OFF);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS", fireInSearch=false)
		public void Zcacrse_DisableKeys()
		{
			
				setItemEnabled("KB_CRSE_NUMB", false);
				setItemEnabled("KB_SUBJ_CODE", false);
				setItemEnabled("KB_TERM_CODE_EFF", false);
				setItemEnabled("KB_SUBJ_CODE_LBT", false);
				setItemEnabled("KB_TERM_CODE_EFF_LBT", false);
				setItemEnabled("KB_CRSE_NUMB_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.VALIDATE_KEY
		    IF :KB_SUBJ_CODE IS NULL  THEN
      EXECUTE_TRIGGER( 'KEY_NULL' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      IF :KB_CRSE_NUMB IS NULL  THEN
         EXECUTE_TRIGGER( 'KEY_NULL' ) ;
         G$_CHECK_FAILURE ;
      ELSE
         IF :KB_TERM_CODE_EFF IS NULL  THEN
            EXECUTE_TRIGGER( 'KEY_NULL' ) ;
            G$_CHECK_FAILURE ;
         END IF ;
      END IF ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.VALIDATE_KEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_KEY", fireInSearch=false)
		public void Zcacrse_ValidateKey()
		{
			
				if ( getFormModel().getKeyBlock().getKbSubjCode().isNull() )
				{
					executeAction("KEY_NULL");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					if ( getFormModel().getKeyBlock().getKbCrseNumb().isNull() )
					{
						executeAction("KEY_NULL");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						if ( getFormModel().getKeyBlock().getKbTermCodeEff().isNull() )
						{
							executeAction("KEY_NULL");
							getTask().getGoqrpls().gCheckFailure();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.KEY_NULL
		    MESSAGE(
       G$_NLS.Get('ZCACRSE-0039', 'FORM','*ERROR* Valid subject, course, & term must be entered.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.KEY_NULL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NULL", fireInSearch=false)
		public void Zcacrse_KeyNull()
		{
			
				errorMessage(GNls.Fget(toStr("ZCACRSE-0039"), toStr("FORM"), toStr("*ERROR* Valid subject, course, & term must be entered.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.INVALID_FUNCTION_MSG
		    MESSAGE(
 G$_NLS.Get('ZCACRSE-0042', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') 
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG", fireInSearch=false)
		public void Zcacrse_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("ZCACRSE-0042"), toStr("FORM"), toStr("*ERROR* Invalid function;")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.INVALID_INSERT
		    MESSAGE(
 G$_NLS.Get('ZCACRSE-0041', 'FORM','*ERROR* Cannot insert if from term not equal to key block term.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.INVALID_INSERT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_INSERT", fireInSearch=false)
		public void Zcacrse_InvalidInsert()
		{
			
				errorMessage(GNls.Fget(toStr("ZCACRSE-0041"), toStr("FORM"), toStr("*ERROR* Cannot insert if from term not equal to key block term.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.INVALID_UPDATE
		    MESSAGE(
       G$_NLS.Get('ZCACRSE-0040', 'FORM','*ERROR* Cannot update unless from term equals key term.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.INVALID_UPDATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_UPDATE", fireInSearch=false)
		public void Zcacrse_InvalidUpdate()
		{
			
				errorMessage(GNls.Fget(toStr("ZCACRSE-0040"), toStr("FORM"), toStr("*ERROR* Cannot update unless from term equals key term.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.INVALID_CREATE
		    MESSAGE(
 G$_NLS.Get('ZCACRSE-0045', 'FORM','*ERROR* Cannot create record unless from term equal key block term.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.INVALID_CREATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_CREATE", fireInSearch=false)
		public void Zcacrse_InvalidCreate()
		{
			
				errorMessage(GNls.Fget(toStr("ZCACRSE-0045"), toStr("FORM"), toStr("*ERROR* Cannot create record unless from term equal key block term.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.INVALID_DELETE
		    MESSAGE(
 G$_NLS.Get('ZCACRSE-0044', 'FORM','*ERROR* Cannot delete unless from term equal key block term.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.INVALID_DELETE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_DELETE", fireInSearch=false)
		public void Zcacrse_InvalidDelete()
		{
			
				errorMessage(GNls.Fget(toStr("ZCACRSE-0044"), toStr("FORM"), toStr("*ERROR* Cannot delete unless from term equal key block term.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.INVALID_DUP
		    MESSAGE(
 G$_NLS.Get('ZCACRSE-0061', 'FORM','*ERROR* Cannot duplicate data unless from term equal to key block term.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.INVALID_DUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_DUP", fireInSearch=false)
		public void Zcacrse_InvalidDup()
		{
			
				errorMessage(GNls.Fget(toStr("ZCACRSE-0061"), toStr("FORM"), toStr("*ERROR* Cannot duplicate data unless from term equal to key block term.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.CHECK_DELETE_SW
		 G$_CHECK_VALUE ((:KEY_BLOCK.DELETE_SW = 'Y'),
    G$_NLS.Get('ZCACRSE-0053', 'FORM','*ERROR* You must COMMIT changes before leaving block.') , TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.CHECK_DELETE_SW
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_DELETE_SW", fireInSearch=false)
		public void Zcacrse_CheckDeleteSw()
		{
			
				getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getDeleteSw().equals("Y"))), GNls.Fget(toStr("ZCACRSE-0053"), toStr("FORM"), toStr("*ERROR* You must COMMIT changes before leaving block.")), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.WHEN-TAB-PAGE-CHANGED
		 IF :GLOBAL.VALUE = 'KEY-CLRFRM' THEN
   RETURN;
END IF;

DECLARE 
	tp_nm  VARCHAR2(30) := null; 
BEGIN

	tp_nm := GET_CANVAS_PROPERTY('ZCACRSE_TAB_2_CANVAS', 	TOPMOST_TAB_PAGE);
		
	CASE tp_nm 
	WHEN 'ZCBCRSE_PAGE' THEN
		  GO_ITEM('ZCBCRSE_SUBJ_CODE_XLIST');
		 	g$_check_failure;		  
	WHEN 'ZCRDUPC_PAGE' THEN 
			GO_BLOCK('ZCRDUPC');
			EXECUTE_QUERY;
		  GO_ITEM('ZCRDUPC_TYPE');
		  G$_CHECK_FAILURE;
  ELSE 
	  GO_ITEM('ZCBCRSE_SUBJ_CODE_XLIST');
	 	show_view('ZCACRSE_TAB_2_CANVAS');
	  G$_CHECK_FAILURE;
  END CASE;
END;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Zcacrse_tabChange()
		{
			
//				if ( getGlobal("VALUE").equals("KEY-CLRFRM") )
//				{
//					return ;
//				}
				{
					NString tpNm = NString.getNull();
					tpNm = getCanvasTopMostTabPage("ZCACRSE_TAB_2_CANVAS");
					if (tpNm.equals("ZCBCRSE_PAGE"))
					{
						goItem(toStr("ZCBCRSE_SUBJ_CODE_XLIST"));
						getTask().getGoqrpls().gCheckFailure();
					}
					else if (tpNm.equals("ZCRDUPC_PAGE"))
					{
						goBlock(toStr("ZCRDUPC"));
						executeQuery();
						goItem(toStr("ZCRDUPC_TYPE"));
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						goItem(toStr("ZCBCRSE_SUBJ_CODE_XLIST"));
						showView("ZCACRSE_TAB_2_CANVAS");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.DISABLE_TABS
		 DECLARE 
	page_id  TAB_PAGE;
BEGIN 
 
	page_id := FIND_TAB_PAGE('ZCRDUPC_PAGE');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'TRUE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_false);
	END IF;	
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.DISABLE_TABS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_TABS")
		public void Zcacrse_DisableTabs()
		{
			
				{
					TabPageDescriptor pageId = null;
					pageId = findTabPage("ZCRDUPC_PAGE");
					if ( getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCACRSE.ENABLE_TABS
		 DECLARE 
	page_id  TAB_PAGE;
BEGIN 
	page_id := FIND_TAB_PAGE('ZCBCRSE_PAGE');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_true);
	END IF;
	
	page_id := FIND_TAB_PAGE('ZCRDUPC_PAGE');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_true);
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCACRSE.ENABLE_TABS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_TABS")
		public void Zcacrse_EnableTabs()
		{
			
				{
					TabPageDescriptor pageId = null;
					pageId = findTabPage("ZCBCRSE_PAGE");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
					pageId = findTabPage("ZCRDUPC_PAGE");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
				}
			}

		
	
}
	
