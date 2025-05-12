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

import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.ucdavis.ps.banner.student.Zcadetq.model.*;
import net.hedtech.ucdavis.ps.banner.student.Zcadetq.*;
import net.hedtech.ucdavis.ps.banner.student.Zcadetq.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;

public class ZcadetqFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public ZcadetqFormController (ITask task) {
		super(task);
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
		 * ZCADETQ.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Zcadetq_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Zcadetq_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.BANNER_XE_SEND_CONTEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BANNER_XE_SEND_CONTEXT")
		public void Zcadetq_BannerXeSendContext()
		{
			
			getGFormClass().bannerXeSendContext();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-CUSTOM-JAVASCRIPT-EVENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-CUSTOM-JAVASCRIPT-EVENT")
		public void Zcadetq_WhenCustomJavascriptEvent()
		{
			
			getGFormClass().whenCustomJavascriptEvent();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Zcadetq_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Zcadetq_PreFormTrg()
		{
			
			getGFormClass().preFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Zcadetq_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Zcadetq_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Zcadetq_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Zcadetq_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Zcadetq_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Zcadetq_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Zcadetq_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Zcadetq_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Zcadetq_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Zcadetq_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Zcadetq_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.ON-ROLLBACK
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnRollback
		public void Zcadetq_OnRollback(EventObject args)
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Zcadetq_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.ON-SELECT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@QueryExecute
		public void Zcadetq_QueryExecute(EventObject args)
		{
			
			getGFormClass().queryExecute(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Zcadetq_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Zcadetq_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Zcadetq_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Zcadetq_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Zcadetq_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Zcadetq_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Zcadetq_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Zcadetq_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Zcadetq_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Zcadetq_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2, fireInSearch=false)
		public void Zcadetq_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-F6
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F6", function=KeyFunction.KEY_F6)
		public void Zcadetq_F6()
		{
			
			getGFormClass().f6();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN, fireInSearch=false)
		public void Zcadetq_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP, fireInSearch=false)
		public void Zcadetq_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Zcadetq_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Zcadetq_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK, fireInSearch=false)
		public void Zcadetq_NextBlock()
		{
			
			getGFormClass().nextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK, fireInSearch=false)
		public void Zcadetq_PreviousBlock()
		{
			
			getGFormClass().previousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Zcadetq_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Zcadetq_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Zcadetq_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Zcadetq_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Zcadetq_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Zcadetq_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Zcadetq_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Zcadetq_KeyNxtkey()
		{
			
			getGFormClass().keyNxtkey();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Zcadetq_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Zcadetq_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY", fireInSearch=false)
		public void Zcadetq_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Zcadetq_CheckKeys()
		{
			
			getGInqFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD, fireInSearch=false)
		public void Zcadetq_ClearRecord()
		{
			
			getGInqFormClass().clearRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE, fireInSearch=false)
		public void Zcadetq_Save()
		{
			
			getGInqFormClass().save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD, fireInSearch=false)
		public void Zcadetq_CreateRecord()
		{
			
			getGInqFormClass().createRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD, fireInSearch=false)
		public void Zcadetq_DeleteRecord()
		{
			
			getGInqFormClass().deleteRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM, fireInSearch=false)
		public void Zcadetq_KeyDupItem()
		{
			
			getGInqFormClass().keyDupItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD, fireInSearch=false)
		public void Zcadetq_CopyRecord()
		{
			
			getGInqFormClass().copyRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Zcadetq_recordChange()
		{
			
			getGInqFormClass().recordChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.CLOSE_WINDOWS
		 SET_WINDOW_PROPERTY('ZCRGECO_WINDOW',VISIBLE,PROPERTY_OFF);
SET_WINDOW_PROPERTY('SCRSCHD_WINDOW',VISIBLE,PROPERTY_OFF);



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.CLOSE_WINDOWS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLOSE_WINDOWS")
		public void Zcadetq_CloseWindows()
		{
			
				hideView("ZCRGECO_WINDOW");
				hideView("SCRSCHD_WINDOW");
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.WHEN_WINDOW_ACTIVATED_TRG
		 IF :GLOBAL.VALUE = 'KEY-CLRFRM' THEN
   RETURN;
END IF;
--
IF :SYSTEM.EVENT_WINDOW IS NULL THEN
    G$_SET_INST_PROPERTY;
    G$_SET_WIN_PROPERTY;
END IF;

IF :SYSTEM.EVENT_WINDOW IS NOT NULL
   AND :SYSTEM.EVENT_WINDOW = 'MAIN_WINDOW' THEN
      IF  :SYSTEM.CURRENT_BLOCK = 'KEY_BLOCK' THEN
         G$_DETERMINE_CURSOR_LOCATION ('KEY_BLOCK.SCACRSE_SUBJ_CODE');
      ELSE
         G$_DETERMINE_CURSOR_LOCATION('SCBCRSE.SCBCRSE_TITLE');
      END IF;
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Zcadetq_WhenWindowActivatedTrg()
		{
			
				if ( getGlobal("VALUE").equals("KEY-CLRFRM") )
				{
					return ;
				}
				// 
				if ( getCurrentWindow()== null )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
				}
				if ( getCurrentWindow()!= null && getCurrentWindow().equals("MAIN_WINDOW") )
				{
					if ( getCurrentBlock().equals("KEY_BLOCK") )
					{
						getTask().getGoqrpls().gDetermineCursorLocation(toStr("KEY_BLOCK.SCACRSE_SUBJ_CODE"));
					}
					else {
						getTask().getGoqrpls().gDetermineCursorLocation(toStr("SCBCRSE.SCBCRSE_TITLE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.WHEN_NEW_BLOCK_INSTANCE_TRG
		 DECLARE
CURR_BLOCK_NAME 	VARCHAR2(255);
BEGIN
CURR_BLOCK_NAME := :SYSTEM.CURSOR_BLOCK;

IF (CURR_BLOCK_NAME = 'KEY_BLOCK') THEN
	HIDE_VIEW('RESTRICTION_CANVAS');
END IF;		 

IF (:CHECK_KEYS = 'Y') THEN 
   :CHECK_KEYS := 'N';
   GO_BLOCK ('KEY_BLOCK');
   EXECUTE_TRIGGER ('CHECK_KEYS');
   G$_CHECK_FAILURE;   
   
	 :SYSTEM.MESSAGE_LEVEL := '25';
	 
	 GO_BLOCK('SCBCRSE');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('ZCBCRSE');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;	 

	 GO_BLOCK('SCRLEVL');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRGMOD');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRSCHD');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRTEXT');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	
	 GO_BLOCK('SCREQIV');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('ZCRGECO');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRATTR');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRRTST');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRFEES');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
 
	 GO_BLOCK('SCRRCOL_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRCOL_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('RMAJ_CTRL_BLOCK');                -- SRF 3504
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRRCLS_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRCLS_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRLVL_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRLVL_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRRDEG_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRDEG_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRRPRG_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRRPRG_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;	 

	 GO_BLOCK('SCRRCAM_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRCAM_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

-- SRF 3504
	 GO_BLOCK('SCRRDEP_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRDEP_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

	 GO_BLOCK('SCRRATT_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRATT_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;	 

	 GO_BLOCK('SCRRCHR_1');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;
	 
	 GO_BLOCK('SCRRCHR_2');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;	 
-- END SRF 3504	 

   GO_BLOCK('SCBCRSE');
	 IF (:SYSTEM.BLOCK_STATUS = 'NEW') THEN
	 		EXECUTE_QUERY;
	 END IF;

   :SYSTEM.MESSAGE_LEVEL := '0';
   
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER ('DISABLE_KEYS');
   EXECUTE_TRIGGER ('ENABLE_TABS');
   G$_CHECK_FAILURE;
END IF;

END;   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Zcadetq_WhenNewBlockInstanceTrg()
		{
			
				{
					NString currBlockName = NString.getNull();
					NString currentTopMostPage = getCanvasTopMostTabPage(toStr("RESTRICTION_CANVAS")); 
					currBlockName = toStr(getCursorBlock());
					if ((currBlockName.equals("KEY_BLOCK")))
					{
						hideView("RESTRICTION_CANVAS");
					}
					if ((getFormModel().getButtonControlBlock().getCheckKeys().equals("Y")))
					{
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
						goBlock(toStr("KEY_BLOCK"));
						executeAction("CHECK_KEYS");
						getTask().getGoqrpls().gCheckFailure();
						try {
							MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("25"));
							
							
//							goBlock(toStr("SCBCRSE"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("ZCBCRSE"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRLEVL"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRTEXT"));
//							if ((getBlockStatus().equals("NEW"))) {	
//								executeQuery();
//							}
//							goBlock(toStr("SCRGMOD"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRSCHD"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCREQIV"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							
//							goBlock(toStr("ZCRGECO"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRATTR"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRTST"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRFEES"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRCOL_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRCOL_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//								goBlock("SCRRCLS_2");
//								executeQuery();
//							}
//							goBlock(toStr("RMAJ_CTRL_BLOCK"));
//							//  SRF 3504
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRCLS_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRCLS_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRLVL_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRLVL_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRDEG_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRDEG_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRPRG_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRPRG_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRCAM_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRCAM_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							//  SRF 3504
//							goBlock(toStr("SCRRDEP_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRDEP_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRATT_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRATT_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRCHR_1"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							goBlock(toStr("SCRRCHR_2"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							}
//							//  END SRF 3504	 
//							goBlock(toStr("SCBCRSE"));
//							if ((getBlockStatus().equals("NEW"))) {
//								executeQuery();
//							} 
							this.getTask().getServices().loadBlock(toStr("SCBCRSE"));
							this.getTask().getServices().loadBlock(toStr("ZCBCRSE"));
							this.getTask().getServices().loadBlock(toStr("SCRLEVL"));
							this.getTask().getServices().loadBlock(toStr("SCRTEXT"));
							this.getTask().getServices().loadBlock(toStr("SCRGMOD"));
							this.getTask().getServices().loadBlock(toStr("SCRSCHD"));
							this.getTask().getServices().loadBlock(toStr("SCREQIV"));
							this.getTask().getServices().loadBlock(toStr("ZCRGECO"));						
							this.getTask().getServices().loadBlock(toStr("SCRATTR"));							
							this.getTask().getServices().loadBlock(toStr("SCRRTST"));						
							this.getTask().getServices().loadBlock(toStr("SCRFEES"));													
							this.getTask().getServices().loadBlock(toStr("SCRRCOL_1"));						
							this.getTask().getServices().loadBlock(toStr("SCRRCOL_2"));							
							this.getTask().getServices().loadBlock(toStr("RMAJ_CTRL_BLOCK"));						
							this.getTask().getServices().loadBlock(toStr("SCRRCLS_1"));							
							this.getTask().getServices().loadBlock(toStr("SCRRCLS_2"));							
							this.getTask().getServices().loadBlock(toStr("SCRRLVL_1"));						
							this.getTask().getServices().loadBlock(toStr("SCRRLVL_2"));						
							this.getTask().getServices().loadBlock(toStr("SCRRDEG_1"));							
							this.getTask().getServices().loadBlock(toStr("SCRRDEG_2"));							
							this.getTask().getServices().loadBlock(toStr("SCRRPRG_1"));							
							this.getTask().getServices().loadBlock(toStr("SCRRPRG_2"));							
							this.getTask().getServices().loadBlock(toStr("SCRRCAM_1"));						
							this.getTask().getServices().loadBlock(toStr("SCRRCAM_2"));							
							this.getTask().getServices().loadBlock(toStr("SCRRDEP_1"));							
							this.getTask().getServices().loadBlock(toStr("SCRRDEP_2"));							
							this.getTask().getServices().loadBlock(toStr("SCRRATT_1"));											
							this.getTask().getServices().loadBlock(toStr("SCRRATT_2"));							
							this.getTask().getServices().loadBlock(toStr("SCRRCHR_1"));						
							this.getTask().getServices().loadBlock(toStr("SCRRCHR_2"));
							this.getTask().getServices().loadBlock(toStr("SCBCRSE"));
						} finally {
							
							MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
						}
						if(findItem(getCurrentItem()).getPage() == null || !findItem(getCurrentItem()).getPage().getParent().equals("RESTRICTION_CANVAS"))
	                        setCanvasTopMostTabPage("RESTRICTION_CANVAS", currentTopMostPage);
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
						executeAction("DISABLE_KEYS");
						executeAction("ENABLE_TABS");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.WHEN_NEW_ITEM_TRIG
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN_NEW_ITEM_TRIG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_ITEM_TRIG")
		public void Zcadetq_WhenNewItemTrig()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '7.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Zcadetq_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.VALIDATE_KEY
		 IF :KEY_BLOCK.SCACRSE_SUBJ_CODE IS NULL OR
   :KEY_BLOCK.SCACRSE_CRSE_NUMB IS NULL OR 
   :KEY_BLOCK.STVTERM_CODE      IS NULL THEN
   EXECUTE_TRIGGER('KEY_NULL');
   G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.VALIDATE_KEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_KEY", fireInSearch=false)
		public void Zcadetq_ValidateKey()
		{
			
				if ( getFormModel().getKeyBlock().getScacrseSubjCode().isNull() || getFormModel().getKeyBlock().getScacrseCrseNumb().isNull() || getFormModel().getKeyBlock().getStvtermCode().isNull() )
				{
					executeAction("KEY_NULL");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.SAVE_KEYS
		 :GLOBAL.KEY_TERM    := :KEY_BLOCK.STVTERM_CODE;
:GLOBAL.KEY_SUBJECT := :KEY_BLOCK.SCACRSE_SUBJ_CODE;
:GLOBAL.KEY_COURSE  := :SCACRSE_CRSE_NUMB;
:GLOBAL.KEY_TERM    := :KEY_BLOCK.STVTERM_CODE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS", fireInSearch=false)
		public void Zcadetq_SaveKeys()
		{
			
				setGlobal("KEY_TERM", getFormModel().getKeyBlock().getStvtermCode());
				setGlobal("KEY_SUBJECT", getFormModel().getKeyBlock().getScacrseSubjCode());
				setGlobal("KEY_COURSE", getFormModel().getKeyBlock().getScacrseCrseNumb());
				setGlobal("KEY_TERM", getFormModel().getKeyBlock().getStvtermCode());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.QRY_ALL
		 IF SELECT_SCBCRSE_3 THEN
   MESSAGE('*ERROR* VALID SUBJECT, COURSE AND TERM MUST BE ENTERED.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;

IF :KEY_BLOCK.SCACRSE_SUBJ_CODE IS NULL AND
   :KEY_BLOCK.SCACRSE_CRSE_NUMB IS NULL AND
   :KEY_BLOCK.STVTERM_CODE      IS NULL THEN
   MESSAGE('*ERROR* VALID SUBJECT, COURSE AND TERM MUST BE ENTERED.');
   RAISE FORM_TRIGGER_FAILURE;     
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.QRY_ALL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="QRY_ALL", fireInSearch=false)
		public void Zcadetq_QryAll()
		{
			
				if ( this.getTask().getServices().selectScbcrse3().getValue() )
				{
					errorMessage("*ERROR* VALID SUBJECT, COURSE AND TERM MUST BE ENTERED.");
					throw new ApplicationException();
				}
				if ( getFormModel().getKeyBlock().getScacrseSubjCode().isNull() && getFormModel().getKeyBlock().getScacrseCrseNumb().isNull() && getFormModel().getKeyBlock().getStvtermCode().isNull() )
				{
					errorMessage("*ERROR* VALID SUBJECT, COURSE AND TERM MUST BE ENTERED.");
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.MENU_TRIGGER
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   05-Oct-2005 04:55 PM
 ******************************************</multilinecomment>

:HOLD_CURRENT_BLOCK_FIELD := :SYSTEM.CURSOR_FIELD;
NULL;

EXECUTE_TRIGGER('SAVE_KEYS');
G$_CHECK_FAILURE;

IF :GLOBAL.SECRSYS = 'Y' THEN
   EXECUTE_TRIGGER('CALL_CURRENT');
   G$_CHECK_FAILURE;
ELSE
-- CALL_FORM(:SYSTEM.CURRENT_BLOCK,NO_HIDE,DO_REPLACE,QUERY_ONLY);
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:SYSTEM.CURRENT_BLOCK,'QUERY_NOHIDE');
END IF;

GO_FIELD(:HOLD_CURRENT_BLOCK_FIELD);
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *This trigger will execute the menu and determine if the answer will move to
		 *the key block.  If so, the current keys is saved, the form cleared, the
		 *header information is filled, and the cursor is moved to the key block with
		 *the current keys.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.MENU_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MENU_TRIGGER", fireInSearch=false)
		public void Zcadetq_MenuTrigger()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 05-Oct-2005 04:55 PM
				// ******************************************
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 05-Oct-2005 04:55 PM
				// ******************************************
				getFormModel().getFormHeader().setHoldCurrentBlockField(toStr(getCursorField()));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				if ( getGlobal("SECRSYS").equals("Y") )
				{
					executeAction("CALL_CURRENT");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					//  CALL_FORM(:SYSTEM.CURRENT_BLOCK,NO_HIDE,DO_REPLACE,QUERY_ONLY);
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr(getCurrentBlock()), toStr("QUERY_NOHIDE"));
				}
				goField(getFormModel().getFormHeader().getHoldCurrentBlockField());
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.LOAD_FORM_HEADER
		 :CURRENT_FORM        := :SYSTEM.CURRENT_FORM;
:CURRENT_DATE        := TO_CHAR(SYSDATE,'DD-MON-YYYY');
:CURRENT_TIME        := TO_CHAR(SYSDATE,'HH24:MI:SS');
:CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
:CURRENT_RELEASE     := '3.1';
EXECUTE_TRIGGER ('LOAD_CURRENT_RELEASE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER", fireInSearch=false)
		public void Zcadetq_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentDate(toChar(DbManager.getDBDateTime(), "DD-MON-YYYY"));
				getFormModel().getFormHeader().setCurrentTime(toChar(DbManager.getDBDateTime(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentRelease(toStr("3.1"));
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.LIST_VALUES_COPY
		 -- LIST VALUES SHOULD RETURN VALUES ONLY IN KEY_BLOCK.

IF :SYSTEM.CURRENT_BLOCK = 'KEY_BLOCK' THEN  
  COPY(SUBSTR( :GLOBAL.VALUE, 1, TO_NUMBER(
        FIELD_CHARACTERISTIC( :SYSTEM.cursor_FIELD, FIELD_LENGTH)
         )),:SYSTEM.cursor_FIELD);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Zcadetq_ListValuesCopy()
		{
			
				//  LIST VALUES SHOULD RETURN VALUES ONLY IN KEY_BLOCK.
				//  LIST VALUES SHOULD RETURN VALUES ONLY IN KEY_BLOCK.
				if ( getCurrentBlock().equals("KEY_BLOCK") )
				{
					copy(substring(getGlobal("VALUE"), toInt(1), toNumber(getItemMaxLength(getCursorField()))),getCursorField());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.KEY_NULL
		 MESSAGE('*ERROR* VALID SUBJECT, COURSE, AND TERM MUST BE ENTERED.');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY_NULL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NULL", fireInSearch=false)
		public void Zcadetq_KeyNull()
		{
			
				errorMessage("*ERROR* VALID SUBJECT, COURSE, AND TERM MUST BE ENTERED.");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.INVALID_FUNCTION_MSG
		 MESSAGE('*ERROR* INVALID FUNCTION; PRESS SHOW KEYS FOR VALID FUNCTIONS.');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG", fireInSearch=false)
		public void Zcadetq_InvalidFunctionMsg()
		{
			
				errorMessage("*ERROR* INVALID FUNCTION.");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.GLOBAL_COPY
		 :KEY_BLOCK.SCACRSE_SUBJ_CODE := :GLOBAL.KEY_SUBJECT;

IF :KEY_BLOCK.SCACRSE_SUBJ_CODE IS NOT NULL THEN
   NEXT_FIELD;
   PREVIOUS_FIELD;
END IF;

:SCACRSE_CRSE_NUMB := :GLOBAL.KEY_COURSE;
:KEY_BLOCK.STVTERM_CODE := :GLOBAL.KEY_TERM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY", fireInSearch=false)
		public void Zcadetq_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setScacrseSubjCode(getGlobal("KEY_SUBJECT"));
				if ( getFormModel().getKeyBlock().getScacrseSubjCode().isNotNull() )
				{
					nextItem();
					previousItem();
				}
				getFormModel().getKeyBlock().setScacrseCrseNumb(getGlobal("KEY_COURSE"));
				getFormModel().getKeyBlock().setStvtermCode(getGlobal("KEY_TERM"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('SCACRSE_CRSE_NUMB',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SCACRSE_CRSE_NUMB',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SCACRSE_CRSE_NUMB',NAVIGABLE,PROPERTY_ON);
END IF;

IF GET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE_LBT',ENABLED) = 'FALSE' THEN
SET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE',NAVIGABLE,PROPERTY_ON);
END IF;

IF GET_ITEM_PROPERTY('STVTERM_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('STVTERM_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('STVTERM_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('STVTERM_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('STVTERM_CODE_LBT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('STVTERM_CODE_LBT',NAVIGABLE,PROPERTY_ON);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS", fireInSearch=false)
		public void Zcadetq_EnableKeys()
		{
			
				if ( getItemEnabled("SCACRSE_CRSE_NUMB").equals("FALSE") )
				{
					setItemEnabled("SCACRSE_CRSE_NUMB", true);
					setItemNavigable("SCACRSE_CRSE_NUMB", true);
				}
				if ( getItemEnabled("SCACRSE_SUBJ_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("SCACRSE_SUBJ_CODE_LBT", true);
				}
				if ( getItemEnabled("SCACRSE_SUBJ_CODE").equals("FALSE") )
				{
					setItemEnabled("SCACRSE_SUBJ_CODE", true);
					setItemNavigable("SCACRSE_SUBJ_CODE", true);
				}
				if ( getItemEnabled("STVTERM_CODE").equals("FALSE") )
				{
					setItemEnabled("STVTERM_CODE", true);
					setItemNavigable("STVTERM_CODE", true);
				}
				if ( getItemEnabled("STVTERM_CODE_LBT").equals("FALSE") )
				{
//					setItemEnabled("STVTERM_CODE_LBT", true);
//					SETITEMNAVIGABLE("STVTERM_CODE_LBT", TRUE);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.DISABLE_KEYS
		 SET_ITEM_PROPERTY('SCACRSE_CRSE_NUMB',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('SCACRSE_CRSE_NUMB',NAVIGABLE,PROPERTY_OFF);

SET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE',NAVIGABLE,PROPERTY_OFF);

SET_ITEM_PROPERTY('STVTERM_CODE',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('STVTERM_CODE',NAVIGABLE,PROPERTY_OFF);

SET_ITEM_PROPERTY('STVTERM_CODE_LBT',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('STVTERM_CODE_LBT',NAVIGABLE,PROPERTY_OFF);

SET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE_LBT',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('SCACRSE_SUBJ_CODE_LBT',NAVIGABLE,PROPERTY_OFF);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS", fireInSearch=false)
		public void Zcadetq_DisableKeys()
		{
			
				setItemEnabled("SCACRSE_CRSE_NUMB", false);
				setItemNavigable("SCACRSE_CRSE_NUMB", false);
				setItemEnabled("SCACRSE_SUBJ_CODE", false);
				setItemNavigable("SCACRSE_SUBJ_CODE", false);
				setItemEnabled("STVTERM_CODE", false);
				setItemNavigable("STVTERM_CODE", false);
//				setItemEnabled("STVTERM_CODE_LBT", false);
				setItemNavigable("STVTERM_CODE_LBT", false);
				setItemEnabled("SCACRSE_SUBJ_CODE_LBT", false);
				setItemNavigable("SCACRSE_SUBJ_CODE_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.CALL_CURRENT
		 :GLOBAL.SECRFRM := :SYSTEM.CURRENT_BLOCK;
--Obsolete
--CALL_FORM('GUQSECR',NO_HIDE,DO_REPLACE,NO_QUERY_ONLY);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.CALL_CURRENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_CURRENT", fireInSearch=false)
		public void Zcadetq_CallCurrent()
		{
			
				setGlobal("SECRFRM", toStr(getCurrentBlock()));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.ALL_MSG
		 MESSAGE('*ERROR* COURSE, LEVEL, GRADE, & SCHEDULE BLOCKS ARE REQUIRED ON ADD.');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.ALL_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ALL_MSG", fireInSearch=false)
		public void Zcadetq_AllMsg()
		{
			
				errorMessage("*ERROR* COURSE, LEVEL, GRADE, & SCHEDULE BLOCKS ARE REQUIRED ON ADD.");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.WHEN-NEW-FORM-INSTANCE
		 EXECUTE_TRIGGER('LOAD_FORM_HEADER');
G$_CHECK_FAILURE;
g$_set_win_property;
EXECUTE_TRIGGER('GLOBAL_COPY');
G$_CHECK_FAILURE;
G$_SET_INST_PROPERTY;

EXECUTE_TRIGGER('DISABLE_TABS');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Zcadetq_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				executeAction("DISABLE_TABS");
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.KEY-NXTREC
		 IF :SYSTEM.CURRENT_BLOCK IN ( 'SCRLEVL', 'SCRGMOD', 'SCRSCHD',
   'SCRTEXT', 'SCREQIV', 'SCRCORQ', 'ZCRGECO', 'SCRATTR',
   'SCRRCOL_2', 'SCRRCLS_2', 'SCRRMAJ', 'SCRRLVL_2', 'SCRFEES')
THEN
   IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
      MESSAGE ('AT LAST RECORD');
   ELSE
       NEXT_RECORD;
   END IF;
ELSE
   EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
   RETURN;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD, fireInSearch=false)
		public void Zcadetq_NextRecord()
		{
			
				if ( in(getCurrentBlock(), "SCRLEVL", "SCRGMOD", "SCRSCHD", "SCRTEXT", "SCREQIV", "SCRCORQ", "ZCRGECO", "SCRATTR", "SCRRCOL_2", "SCRRCLS_2", "SCRRMAJ", "SCRRLVL_2", "SCRFEES").getValue() )
				{
					if ( isInLastRecord(true) )
					{
						infoMessage("AT LAST RECORD");
					}
					else {
						nextRecord();
					}
				}
				else {
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.KEY-PRVREC
		 IF :SYSTEM.CURRENT_BLOCK IN ( 'SCRLEVL', 'SCRGMOD', 'SCRSCHD',
   'SCRTEXT', 'SCREQIV', 'SCRCORQ', 'ZCRGECO', 'SCRATTR',
   'SCRRCOL_2', 'SCRRCLS_2', 'SCRRMAJ', 'SCRRLVL_2', 'SCRFEES')
THEN
   IF :SYSTEM.CURSOR_RECORD = '1' THEN
      MESSAGE ('AT FIRST_RECORD');
   ELSE
      PREVIOUS_RECORD;
   END IF;
ELSE
   EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
   RETURN;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD, fireInSearch=false)
		public void Zcadetq_PreviousRecord()
		{
			
				if ( in(getCurrentBlock(), "SCRLEVL", "SCRGMOD", "SCRSCHD", "SCRTEXT", "SCREQIV", "SCRCORQ", "ZCRGECO", "SCRATTR", "SCRRCOL_2", "SCRRCLS_2", "SCRRMAJ", "SCRRLVL_2", "SCRFEES").getValue() )
				{
//					if ( getCursorRecord().equals("1") )
					if( isInFirstRecord(true))
					{
						infoMessage("AT FIRST_RECORD");
						
					}
					else {
						previousRecord();
					}
				}
				else {
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.KEY-NEXT-ITEM
		    :FORM_HEADER.CALLFLD := :SYSTEM.CURRENT_BLOCK ;
--
   IF :FORM_HEADER.CALLFLD IN ( 'SCRRCOL_1', 'SCRRCLS_1',
      'RMAJ_CTRL_BLOCK', 'SCRRLVL_1') THEN                    -- SRF 3504
      NEXT_BLOCK ;
      G$_CHECK_FAILURE ;
   ELSIF :FORM_HEADER.CALLFLD IN ( 'SCRRCOL_2', 'SCRRCLS_2',
      'SCRRMAJ', 'SCRRLVL_2') THEN
      PREVIOUS_BLOCK ;
      G$_CHECK_FAILURE ;
   ELSE
      NEXT_FIELD ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM, fireInSearch=false)
		public void Zcadetq_keyNexItem()
		{
			
				getFormModel().getFormHeader().setCallfld(toStr(getCurrentBlock()));
				// 
				if ( in(getFormModel().getFormHeader().getCallfld(), "SCRRCOL_1", "SCRRCLS_1", "RMAJ_CTRL_BLOCK", "SCRRLVL_1").getValue() )
				{
					//  SRF 3504
					nextBlock();
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( in(getFormModel().getFormHeader().getCallfld(), "SCRRCOL_2", "SCRRCLS_2", "SCRRMAJ", "SCRRLVL_2").getValue() ) {
					previousBlock();
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.KEY-EXIT
		 :GLOBAL.VALUE := '';
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT, fireInSearch=false)
		public void Zcadetq_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.KEY-CLRFRM
		 EXECUTE_TRIGGER('SAVE_KEYS');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('ENABLE_KEYS');
G$_CHECK_FAILURE;

CLEAR_FORM(NO_COMMIT);
G$_CHECK_FAILURE;

EXECUTE_TRIGGER('LOAD_FORM_HEADER');
G$_CHECK_FAILURE;

EXECUTE_TRIGGER('GLOBAL_COPY');
G$_CHECK_FAILURE;

hide_view('restriction_canvas'); 
G$_CHECK_FAILURE ;
SET_CANVAS_PROPERTY('ZCADETQ_2_TAB_CANVAS',TOPMOST_TAB_PAGE,'SCBCRSE');
G$_CHECK_FAILURE ;

EXECUTE_TRIGGER('DISABLE_TABS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM, fireInSearch=false)
		public void Zcadetq_ClearTask()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask(TaskServices.NO_COMMIT);
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				hideView("restriction_canvas");
				getTask().getGoqrpls().gCheckFailure();
				setCanvasTopMostTabPage("ZCADETQ_2_TAB_CANVAS", "SCBCRSE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("DISABLE_TABS");
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.WHEN-TAB-PAGE-CHANGED
		 IF :GLOBAL.VALUE = 'KEY-CLRFRM' THEN
   RETURN;
END IF;

DECLARE 
	tp_nm  VARCHAR2(30) := null; 
	ctp_nm  VARCHAR2(30) := null;

	tp_id  TAB_PAGE;
	tb_lb VARCHAR2(30) := null;
	page_id TAB_PAGE;
	save_item  VARCHAR2(30) := NULL; 
BEGIN

	tp_nm := GET_CANVAS_PROPERTY('ZCADETQ_2_TAB_CANVAS', 	TOPMOST_TAB_PAGE);
	
	if (:system.current_block in ('SCRRCOL_1', 'SCRRCOL_2', 'RMAJ_CTRL_BLOCK', 'SCRRMAJ', -- SRF 3504
			'SCRRCLS_1', 'SCRRCLS_2', 'SCRRLVL_1', 'SCRRLVL_2', 'SCRRDEG_1', 'SCRRDEG_2',
			'SCRRCAM_1', 'SCRRCAM_2', 'SCRRDEP_1', 'SCRRDEP_2', 'SCRRATT_1', 'SCRRATT_2',    -- SRF 3504
			'SCRRCHR_1', 'SCRRCHR_2') ) then                                                 -- SRF 3504
			set_canvas_property('ZCADETQ_2_TAB_CANVAS', TOPMOST_TAB_PAGE, 'RESTRICTION');
	end if;
	
	CASE tp_nm 
	WHEN 'SCBCRSE' THEN
		  GO_ITEM('SCBCRSE_TITLE');
     	hide_view('RESTRICTION_CANVAS');
		 	g$_check_failure;		  
	WHEN 'SCRLEVL' THEN 
		  GO_ITEM('SCRLEVL_LEVL_CODE');
      hide_view('RESTRICTION_CANVAS');
		  G$_CHECK_FAILURE;
	WHEN 'ZCRGECO' THEN 
	   GO_ITEM('SCRRTST_CONNECTOR');
	   hide_view('RESTRICTION_CANVAS');
	   G$_CHECK_FAILURE;
	WHEN 'RESTRICTION' THEN 
	    	ctp_nm := GET_CANVAS_PROPERTY('RESTRICTION_CANVAS', TOPMOST_TAB_PAGE);
	      IF ctp_nm =  'RESTRICTION1_TAB' THEN
	        go_block('SCRRCOL_1');
	      ELSIF ctp_nm = 'RESTRICTION2_TAB' THEN         -- SRF 3504
	        go_block('SCRRDEG_1');
	      ELSE                                           -- SRF 3504
	      	go_block('SCRRATT_1');                       -- SRF 3504
	      END IF; 
  WHEN 'ZCRDUPC' THEN
  	 GO_ITEM('ZCRDUPC_TYPE');
  	 hide_view('RESTRICTION_CANVAS');
	   G$_CHECK_FAILURE;
  ELSE 
	  GO_ITEM('SCBCRSE_CRSE_TITLE');
    hide_view('RESTRICTION_CANVAS');
	 	
	 	show_view('ZCADETQ_2_TAB_CANVAS');
	  G$_CHECK_FAILURE;
		  
END CASE;
END;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Zcadetq_tabChange()
		{
			
				if ( getGlobal("VALUE").equals("KEY-CLRFRM") )
				{
					return ;
				}
				{
					NString tpNm = NString.getNull();
					NString ctpNm = NString.getNull();
					TabPageDescriptor tpId = null;
					NString tbLb = NString.getNull();
					TabPageDescriptor pageId = null;
					NString saveItem = NString.getNull();
					tpNm = getCanvasTopMostTabPage("ZCADETQ_2_TAB_CANVAS");
					if ((in(getCurrentBlock(), "SCRRCOL_1", "SCRRCOL_2", "RMAJ_CTRL_BLOCK", "SCRRMAJ", "SCRRCLS_1", "SCRRCLS_2", "SCRRLVL_1", "SCRRLVL_2", "SCRRDEG_1", "SCRRDEG_2", "SCRRCAM_1", "SCRRCAM_2", "SCRRDEP_1", "SCRRDEP_2", "SCRRATT_1", "SCRRATT_2", "SCRRCHR_1", "SCRRCHR_2").getValue()))
					{
						//  SRF 3504
						setCanvasTopMostTabPage("ZCADETQ_2_TAB_CANVAS", "RESTRICTION");
					}
					if (tpNm.equals("SCBCRSE"))
					{
						goItem(toStr("SCBCRSE_TITLE"));
						hideView("RESTRICTION_CANVAS");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if (tpNm.equals("SCRLEVL"))
					{
						
						goItem(toStr("SCRLEVL_LEVL_CODE"));
						hideView("RESTRICTION_CANVAS");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if (tpNm.equals("ZCRGECO"))
					{
						goItem(toStr("SCRRTST_CONNECTOR"));
						hideView("RESTRICTION_CANVAS");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if (tpNm.equals("RESTRICTION"))
					{
						ctpNm = getCanvasTopMostTabPage("RESTRICTION_CANVAS");
						if ( ctpNm.equals("RESTRICTION1_TAB") )
						{
							goBlock(toStr("SCRRCOL_1"));
						}
						else if ( ctpNm.equals("RESTRICTION2_TAB") ) {
							//  SRF 3504
							goBlock(toStr("SCRRDEG_1"));
						}
						else {
							//  SRF 3504
							goBlock(toStr("SCRRATT_1"));
						}
					}
					else if (tpNm.equals("ZCRDUPC"))
					{
						goItem(toStr("ZCRDUPC_TYPE"));
						hideView("RESTRICTION_CANVAS");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						goItem(toStr("SCBCRSE_CRSE_TITLE"));
						hideView("RESTRICTION_CANVAS");
						showView("ZCADETQ_2_TAB_CANVAS");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.DISABLE_TABS
		 DECLARE 
	page_id  TAB_PAGE;
BEGIN 
 
	page_id := FIND_TAB_PAGE('SCRLEVL');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'TRUE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_false);
	END IF;
	
	page_id := FIND_TAB_PAGE('ZCRGECO');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'TRUE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_false);
	END IF;
	
	page_id := FIND_TAB_PAGE('RESTRICTION');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'TRUE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_false);
	END IF;

	page_id := FIND_TAB_PAGE('ZCRDUPC');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'TRUE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_false);
	END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.DISABLE_TABS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_TABS")
		public void Zcadetq_DisableTabs()
		{
			
				{
					TabPageDescriptor pageId = null;
					pageId = findTabPage("SCRLEVL");
					if ( getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, false);
					}
					pageId = findTabPage("ZCRGECO");
					if ( getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, false);
					}
					pageId = findTabPage("RESTRICTION");
					if ( getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, false);
					}
					pageId = findTabPage("ZCRDUPC");
					if ( getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCADETQ.ENABLE_TABS
		 DECLARE 
	page_id  TAB_PAGE;
BEGIN 
	page_id := FIND_TAB_PAGE('SCBCRSE');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_true);
	END IF;
	
	page_id := FIND_TAB_PAGE('SCRLEVL');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_true);
	END IF;
	
	page_id := FIND_TAB_PAGE('ZCRGECO');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_true);
	END IF;
	
	page_id := FIND_TAB_PAGE('RESTRICTION');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_true);
	END IF;
	
	page_id := FIND_TAB_PAGE('ZCRDUPC');
	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
		SET_TAB_PAGE_PROPERTY(page_id, ENABLED, property_true);
	END IF;	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCADETQ.ENABLE_TABS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_TABS")
		public void Zcadetq_EnableTabs()
		{
			
				{
					TabPageDescriptor pageId = null;
					pageId = findTabPage("SCBCRSE");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
					pageId = findTabPage("SCRLEVL");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
					pageId = findTabPage("ZCRGECO");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
					pageId = findTabPage("RESTRICTION");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
					pageId = findTabPage("ZCRDUPC");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
				}
			}

		
	
}
	
