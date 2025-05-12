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
		
public class ScrschdController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ScrschdController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRSCHD.PRE-QUERY
		    :SCRSCHD_TERM_CODE_FROM := :KB_TERM_CODE_EFF ;
--
   :SCHD_COUNT := '0' ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRSCHD_EFF_TERM)
         FROM   SCRSCHD
         WHERE  SCRSCHD_EFF_TERM > :KB_TERM_CODE_EFF
           AND  SCRSCHD_CRSE_NUMB = :KB_CRSE_NUMB
           AND  SCRSCHD_SUBJ_CODE = :KB_SUBJ_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRSCHD_TERM_CODE_TO ;
   END ;
--
   IF :SCRSCHD_TERM_CODE_TO = :SCRSCHD_TERM_CODE_FROM OR (
      :SCRSCHD_TERM_CODE_TO IS NULL AND :SCRSCHD_TERM_CODE_FROM
      IS NULL ) THEN
      EXECUTE_TRIGGER( 'FIND_TO_TERM' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :SCRSCHD_TERM_CODE_TO IS NULL  THEN
      EXECUTE_TRIGGER( 'FIND_TO_TERM' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrschd_BeforeQuery(QueryEvent args)
		{
			
				int rowCount = 0;
               // F2J_WARNING_DONE : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_SUBJ_CODE", this.getFormModel().getKeyBlock().getKbSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_CRSE_NUMB", this.getFormModel().getKeyBlock().getKbCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_TERM_CODE_EFF", this.getFormModel().getKeyBlock().getKbTermCodeEff()));             


           
				getFormModel().getSchdCtrlBlock().setScrschdTermCodeFrom(getFormModel().getKeyBlock().getKbTermCodeEff());
				// 
				getFormModel().getSchdCtrlBlock().setSchdCount(toNumber("0"));
				{
					String sqlptiCursor = "SELECT MIN(SCRSCHD_EFF_TERM) " +
	" FROM SCRSCHD " +
	" WHERE SCRSCHD_EFF_TERM > :KB_TERM_CODE_EFF AND SCRSCHD_CRSE_NUMB = :KB_CRSE_NUMB AND SCRSCHD_SUBJ_CODE = :KB_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
						ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
						ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
						//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getSchdCtrlBlock().setScrschdTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( getFormModel().getSchdCtrlBlock().getScrschdTermCodeTo().equals(getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom()) || (getFormModel().getSchdCtrlBlock().getScrschdTermCodeTo().isNull() && getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().isNull()) )
				{
					executeAction("FIND_TO_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getSchdCtrlBlock().getScrschdTermCodeTo().isNull() ) {
					executeAction("FIND_TO_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.PRE-INSERT
		 --
   IF :SCRSCHD_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :SCRSCHD_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
      NULL ;
   ELSE
      EXECUTE_TRIGGER( 'INVALID_INSERT' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
:SCRSCHD_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
--
   :SCRSCHD_EFF_TERM := :KB_TERM_CODE_EFF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void scrschd_BeforeRowInsert(RowAdapterEvent args)
		{
			
				// 
				ScrschdAdapter scrschdElement = (ScrschdAdapter)args.getRow();


				// 
				if ( getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
				}
				else {
					executeAction("INVALID_INSERT");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				scrschdElement.setScrschdActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				// 
				scrschdElement.setScrschdEffTerm(getFormModel().getKeyBlock().getKbTermCodeEff());
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.PRE-UPDATE
		 --
   IF :SCRSCHD_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :SCRSCHD_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
      EXECUTE_TRIGGER( 'UPDATE_TRIG' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      EXECUTE_TRIGGER( 'INSERT_TRIG' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void scrschd_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				// 
				// 
				if ( getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
					executeAction("UPDATE_TRIG");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("INSERT_TRIG");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.POST-QUERY
		    :SCRSCHD_TERM_CODE_FROM := :SCRSCHD_EFF_TERM ;
--
   :SCHD_COUNT := :SCHD_COUNT + 1 ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrschd_AfterQuery(RowAdapterEvent args)
		{
			
				ScrschdAdapter scrschdElement = (ScrschdAdapter)args.getRow();


				// F2J_WARNING_DONE : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				getFormModel().getSchdCtrlBlock().setScrschdTermCodeFrom(scrschdElement.getScrschdEffTerm());
				// 
				getFormModel().getSchdCtrlBlock().setSchdCount(getFormModel().getSchdCtrlBlock().getSchdCount().add(1));
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.POST-INSERT
		    :SCHD_COUNT := :SCHD_COUNT + 1 ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void scrschd_AfterRowInsert(RowAdapterEvent args)
		{
			
				getFormModel().getSchdCtrlBlock().setSchdCount(getFormModel().getSchdCtrlBlock().getSchdCount().add(1));
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.KEY-CLRREC
		    IF (:SCHD_ADD > 0) THEN
      :SCHD_ADD := :SCHD_ADD - 1 ;
   END IF ;
--
   CLEAR_RECORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD, fireInSearch=false)
		public void scrschd_ClearRecord()
		{
			
				if ((getFormModel().getKeyBlock().getSchdAdd().greater(0)))
				{
					getFormModel().getKeyBlock().setSchdAdd(getFormModel().getKeyBlock().getSchdAdd().subtract(1));
				}
				// 
				clearRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.KEY-CREREC
		    IF :SCRSCHD_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :SCRSCHD_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
      CREATE_RECORD ;
   ELSE
      EXECUTE_TRIGGER( 'INVALID_CREATE' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD, fireInSearch=false)
		public void scrschd_CreateRecord()
		{
			
				if ( getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
					createRecord();
				}
				else {
					executeAction("INVALID_CREATE");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.KEY-DELREC
		    IF :SCRSCHD_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :SCRSCHD_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
      NULL ;
   ELSE
      EXECUTE_TRIGGER( 'INVALID_DELETE' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SSBSECT
         WHERE  SSBSECT_SUBJ_CODE = :KB_SUBJ_CODE
           AND  SSBSECT_CRSE_NUMB = :KB_CRSE_NUMB
           AND  SSBSECT_SCHD_CODE = :SCRSCHD_SCHD_CODE
           AND  SSBSECT_TERM_CODE >= :SCRSCHD_TERM_CODE_FROM
           AND  SSBSECT_TERM_CODE < :SCRSCHD_TERM_CODE_TO ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%FOUND,
 G$_NLS.Get('ZCACRSE-0153', 'FORM','*ERROR* Section(s) exist with schedule code, cannot delete.') , TRUE);
   END ;
--
   IF SELECT_SCBCRKY_4 THEN
      GOTO DELETE_ON_ADD ;
   END IF ;
   GOTO CONT ;
--
   << DELETE_ON_ADD >>
   :SCHD_ADD := :SCHD_ADD - 1 ;
   GOTO DELREC ;
--
   << CONT >>
   IF (:SCHD_COUNT > 1) THEN
      GOTO SUB_DEL ;
   ELSE
      GOTO CHEKPREV ;
   END IF ;
--
   << CHEKPREV >>
   IF SELECT_DUAL_1 (:SCRSCHD_TERM_CODE_FROM) THEN
      GOTO SUB_DEL ;
   END IF ;
   MESSAGE(
 G$_NLS.Get('ZCACRSE-0154', 'FORM','*ERROR* Schedule code is required for course, cannot delete all rows.')  )
       ;
   RAISE FORM_TRIGGER_FAILURE ;
--
   << SUB_DEL >>
   :SCHD_COUNT := :SCHD_COUNT - 1 ;
--
   << DELREC >>
   DELETE_RECORD ;
--
   :KEY_BLOCK.DELETE_SW := 'Y' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD, fireInSearch=false)
		public void scrschd_DeleteRecord()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ScrschdAdapter scrschdElement = (ScrschdAdapter)this.getFormModel().getScrschd().getRowAdapter(true);


				int rowCount = 0;
				if ( getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
				}
				else {
					executeAction("INVALID_DELETE");
					getTask().getGoqrpls().gCheckFailure();
				}
				{
					NString ptiIntoTemp = NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SSBSECT " +
	" WHERE SSBSECT_SUBJ_CODE = :KB_SUBJ_CODE AND SSBSECT_CRSE_NUMB = :KB_CRSE_NUMB AND SSBSECT_SCHD_CODE = :SCRSCHD_SCHD_CODE AND SSBSECT_TERM_CODE >= :SCRSCHD_TERM_CODE_FROM AND SSBSECT_TERM_CODE < :SCRSCHD_TERM_CODE_TO ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
						ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
						ptiCursor.addParameter("SCRSCHD_SCHD_CODE", scrschdElement.getScrschdSchdCode());
						ptiCursor.addParameter("SCRSCHD_TERM_CODE_FROM", getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom());
						ptiCursor.addParameter("SCRSCHD_TERM_CODE_TO", getFormModel().getSchdCtrlBlock().getScrschdTermCodeTo());
						//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.found(), GNls.Fget(toStr("ZCACRSE-0153"), toStr("FORM"), toStr("*ERROR* Section(s) exist with schedule code, cannot delete.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( this.getTask().getServices().selectScbcrky4().getValue() )
				{
					getFormModel().getKeyBlock().setSchdAdd(getFormModel().getKeyBlock().getSchdAdd().subtract(1));
				}else{
					if ((getFormModel().getSchdCtrlBlock().getSchdCount().greater(1)))
					{
						 //goto SUB_DEL;
					}
					else {
						 CHEKPREV:;
						if ( this.getTask().getServices().selectDual1(getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom()).getValue() )
						{
							 //goto SUB_DEL;
						}else{
							errorMessage(GNls.Fget(toStr("ZCACRSE-0154"), toStr("FORM"), toStr("*ERROR* Schedule code is required for course, cannot delete all rows.")));
							throw new ApplicationException();
						}
						
					}
					
					 SUB_DEL:;
					getFormModel().getSchdCtrlBlock().setSchdCount(getFormModel().getSchdCtrlBlock().getSchdCount().subtract(1));
				}
				
				
				 DELREC:;
				deleteRecord();
				// 
				getFormModel().getKeyBlock().setDeleteSw(toStr("Y"));
			}

		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SCRSCHD_SCHD_CODE")
		public void scrschdSchdCodeLbt_buttonClick()
		{
			ScrschdAdapter scrschdElement = (ScrschdAdapter)this.getFormModel().getScrschd().getRowAdapter(true);
			
			goItem("SCRSCHD_SCHD_CODE");
			listValues();
			if(getGlobal("VALUE").isNotNull()){
				scrschdElement.setScrschdSchdCode(getGlobal("VALUE"));
				nextItem();
			}
		}
		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.KEY-DUPREC
		    IF :KB_TERM_CODE_EFF = :SCRSCHD_TERM_CODE_FROM OR (
      :KB_TERM_CODE_EFF IS NULL AND :SCRSCHD_TERM_CODE_FROM
       IS NULL ) THEN
      EXECUTE_TRIGGER( 'INVALID_DUP' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   :SCRSCHD_EFF_TERM := :SCRSCHD_EFF_TERM ;
--
   :SCHD_INSERT := 'Y' ;
--
   COMMIT_FORM ;
   EXECUTE_QUERY ;
--
   :SCHD_INSERT := 'N' ;
--
SET_ITEM_PROPERTY('SCRSCHD_7_COPY_BTN',ENABLED,PROPERTY_OFF);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD, fireInSearch=false)
		public void scrschd_CopyRecord()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ScrschdAdapter scrschdElement = (ScrschdAdapter)this.getFormModel().getScrschd().getRowAdapter(true);


				if ( getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom()) || (getFormModel().getKeyBlock().getKbTermCodeEff().isNull() && getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().isNull()) )
				{
					executeAction("INVALID_DUP");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				scrschdElement.setScrschdEffTerm(scrschdElement.getScrschdEffTerm());
				// 
				scrschdElement.setSchdInsert(toStr("Y"));
				// 
				commitTask();
				executeQuery();
				// 
				scrschdElement.setSchdInsert(toStr("N"));
				// 
				setItemEnabled("SCRSCHD_7_COPY_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.KEY-NXTBLK
		 	 EXECUTE_TRIGGER( 'CHECK_DELETE_SW' ) ;
   G$_CHECK_FAILURE ;
--   
   GO_BLOCK('ZCRGECO') ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK, fireInSearch=false)
		public void scrschd_NextBlock()
		{
			
				executeAction("CHECK_DELETE_SW");
				getTask().getGoqrpls().gCheckFailure();
				//    
				goBlock(toStr("ZCRGECO"));
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.KEY-NEXT-ITEM
		    NEXT_FIELD ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM, fireInSearch=false)
		public void scrschd_keyNexItem()
		{
			
				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'CHECK_DELETE_SW' ) ;
   G$_CHECK_FAILURE ;
--
   GO_BLOCK('ZCBCRSE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK, fireInSearch=false)
		public void scrschd_PreviousBlock()
		{
			
				executeAction("CHECK_DELETE_SW");
				getTask().getGoqrpls().gCheckFailure();
				// 
				goBlock(toStr("ZCBCRSE"));
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.KEY-PREV-ITEM
		 PREVIOUS_FIELD;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM, fireInSearch=false)
		public void scrschd_PreviousItem()
		{
			
				previousItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.WHEN-NEW-RECORD-INSTANCE
		 --   NEXT_RECORD ;
--
   IF :SCRSCHD_SCHD_CODE IS NULL  THEN
      IF :KB_TERM_CODE_EFF = :SCRSCHD_TERM_CODE_FROM OR (
         :KB_TERM_CODE_EFF IS NULL AND
         :SCRSCHD_TERM_CODE_FROM IS NULL ) THEN
         NULL ;
      ELSE
         PREVIOUS_RECORD ;
         EXECUTE_TRIGGER( 'INVALID_INSERT' ) ;
         G$_CHECK_FAILURE ;
      END IF ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE, fireInSearch=false)
		public void scrschd_recordChange()
		{
			
				//    NEXT_RECORD ;
				// 

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ScrschdAdapter scrschdElement = (ScrschdAdapter)this.getFormModel().getScrschd().getRowAdapter(true);


				//    NEXT_RECORD ;
				// 
				if ( scrschdElement.getScrschdSchdCode().isNull() )
				{
					if ( getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom()) || (getFormModel().getKeyBlock().getKbTermCodeEff().isNull() && getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom().isNull()) )
					{
					}
					else {
						previousRecord();
						executeAction("INVALID_INSERT");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.COPY_END
		    :SCRSCHD_TERM_CODE_TO := :SCBCRKY_TERM_CODE_END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.COPY_END
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COPY_END", fireInSearch=false)
		public void scrschd_CopyEnd()
		{
			
				getFormModel().getSchdCtrlBlock().setScrschdTermCodeTo(getFormModel().getKeyBlock().getScbcrkyTermCodeEnd());
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.FIND_TO_TERM
		    IF SELECT_SCBCRKY_3 (:SCRSCHD_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
--
   << PTI_STEP_001 >>
   IF :SCRSCHD_TERM_CODE_TO IS NULL  THEN
      EXECUTE_TRIGGER( 'COPY_END' ) ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.FIND_TO_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FIND_TO_TERM", fireInSearch=false)
		public void scrschd_FindToTerm()
		{
				Ref<NString> ovar1_ref = new Ref<NString>( getFormModel().getSchdCtrlBlock().getScrschdTermCodeTo());
				this.getTask().getServices().selectScbcrky3(ovar1_ref).getValue();
				getFormModel().getSchdCtrlBlock().setScrschdTermCodeTo(ovar1_ref.val);
				if ( getFormModel().getSchdCtrlBlock().getScrschdTermCodeTo().isNull() )
				{
					executeAction("COPY_END");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.INSERT_TRIG
		    IF :SCHD_INSERT = 'Y' THEN
      NULL ;
   ELSIF :SCHD_INSERT IS NULL  THEN
      EXECUTE_TRIGGER( 'INVALID_UPDATE' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
--
   INSERT INTO SCRSCHD
    (scrschd_subj_code, scrschd_crse_numb,
     scrschd_eff_term, scrschd_schd_code,
      scrschd_activity_date,
      SCRSCHD_WORKLOAD, SCRSCHD_MAX_ENRL, SCRSCHD_ADJ_WORKLOAD,
      SCRSCHD_SEQ, scrschd_insm_code)
   SELECT x.SCRSCHD_SUBJ_CODE, x.SCRSCHD_CRSE_NUMB,
      :KB_TERM_CODE_EFF, x.SCRSCHD_SCHD_CODE, SYSDATE,
      x.SCRSCHD_WORKLOAD, x.SCRSCHD_MAX_ENRL, x.SCRSCHD_ADJ_WORKLOAD,
      x.SCRSCHD_SEQ,x.scrschd_insm_code
   FROM   SCRSCHD x
   WHERE  x.SCRSCHD_SUBJ_CODE = :KB_SUBJ_CODE
     AND  x.SCRSCHD_CRSE_NUMB = :KB_CRSE_NUMB
     AND  x.SCRSCHD_EFF_TERM = :SCRSCHD_TERM_CODE_FROM ;
   G$_CHECK_VALUE (SQL%NOTFOUND, NULL, TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.INSERT_TRIG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INSERT_TRIG", fireInSearch=false)
		public void scrschd_InsertTrig()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ScrschdAdapter scrschdElement = (ScrschdAdapter)this.getFormModel().getScrschd().getRowAdapter(true);


				int rowCount = 0;
				if ( scrschdElement.getSchdInsert().equals("Y") )
				{
				}
				else if ( scrschdElement.getSchdInsert().isNull() ) {
					executeAction("INVALID_UPDATE");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				// 
				String sql1 = "INSERT INTO SCRSCHD " +
	"(scrschd_subj_code, scrschd_crse_numb, scrschd_eff_term, scrschd_schd_code, scrschd_activity_date, SCRSCHD_WORKLOAD, SCRSCHD_MAX_ENRL, SCRSCHD_ADJ_WORKLOAD, SCRSCHD_SEQ, scrschd_insm_code)" +
	"SELECT x.SCRSCHD_SUBJ_CODE, x.SCRSCHD_CRSE_NUMB, :KB_TERM_CODE_EFF, x.SCRSCHD_SCHD_CODE, SYSDATE, x.SCRSCHD_WORKLOAD, x.SCRSCHD_MAX_ENRL, x.SCRSCHD_ADJ_WORKLOAD, x.SCRSCHD_SEQ, x.scrschd_insm_code " +
	" FROM SCRSCHD x " +
	" WHERE x.SCRSCHD_SUBJ_CODE = :KB_SUBJ_CODE AND x.SCRSCHD_CRSE_NUMB = :KB_CRSE_NUMB AND x.SCRSCHD_EFF_TERM = :SCRSCHD_TERM_CODE_FROM ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
				command1.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				command1.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				command1.addParameter("SCRSCHD_TERM_CODE_FROM", getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom());
				rowCount = command1.execute();
				getTask().getGoqrpls().gCheckValue(rowCount == 0, toStr(null), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.UPDATE_TRIG
		 :SCRSCHD_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.UPDATE_TRIG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_TRIG", fireInSearch=false)
		public void scrschd_UpdateTrig()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ScrschdAdapter scrschdElement = (ScrschdAdapter)this.getFormModel().getScrschd().getRowAdapter(true);


				scrschdElement.setScrschdActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD.ON-INSERT
		 --
-- The SCBCRSE API may have already inserted this SCRSCHD row.  So, check 
-- for its existence before inserting.
--
DECLARE
	 DUMMY_VAR         VARCHAR2(1);
	 CURSOR PTI_CURSOR 
	 IS
	   SELECT 'X' FROM SCRSCHD
	    WHERE SCRSCHD_SCHD_CODE = :SCRSCHD_SCHD_CODE
	      AND SCRSCHD_EFF_TERM = :SCRSCHD_EFF_TERM
	      AND SCRSCHD_SUBJ_CODE = :SCRSCHD_SUBJ_CODE
	      AND SCRSCHD_CRSE_NUMB = :SCRSCHD_CRSE_NUMB;
BEGIN
	OPEN PTI_CURSOR;
	FETCH PTI_CURSOR INTO DUMMY_VAR;
	IF PTI_CURSOR%NOTFOUND THEN
		 INSERT_RECORD;
	END IF;
	CLOSE PTI_CURSOR;
END;
--
-- Do the following in either case (whether INSERT was done here or by SCBCRSE API).
--
   :SCHD_COUNT := :SCHD_COUNT + 1 ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void scrschd_RowInsert(RowAdapterEvent args)
		{
			
				// 
				//  The SCBCRSE API may have already inserted this SCRSCHD row.  So, check 
				//  for its existence before inserting.
				// 
				ScrschdAdapter scrschdElement = (ScrschdAdapter)args.getRow();


				int rowCount = 0;
				{
					NString dummyVar = NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SCRSCHD " +
	" WHERE SCRSCHD_SCHD_CODE = :SCRSCHD_SCHD_CODE AND SCRSCHD_EFF_TERM = :SCRSCHD_EFF_TERM AND SCRSCHD_SUBJ_CODE = :SCRSCHD_SUBJ_CODE AND SCRSCHD_CRSE_NUMB = :SCRSCHD_CRSE_NUMB ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SCRSCHD_SCHD_CODE", scrschdElement.getScrschdSchdCode());
						ptiCursor.addParameter("SCRSCHD_EFF_TERM", scrschdElement.getScrschdEffTerm());
						ptiCursor.addParameter("SCRSCHD_SUBJ_CODE", scrschdElement.getScrschdSubjCode());
						ptiCursor.addParameter("SCRSCHD_CRSE_NUMB", scrschdElement.getScrschdCrseNumb());
						//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							dummyVar = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							insertRecord(args.getRow());
						}
						ptiCursor.close();
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				//  Do the following in either case (whether INSERT was done here or by SCBCRSE API).
				// 
				getFormModel().getSchdCtrlBlock().setSchdCount(getFormModel().getSchdCtrlBlock().getSchdCount().add(1));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_SCHD_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRSCHD_SCHD_CODE")
		public void scrschdSchdCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_SCHD_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRSCHD_SCHD_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scrschdSchdCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_SCHD_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRSCHD_SCHD_CODE")
		public void scrschdSchdCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_SCHD_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRSCHD_SCHD_CODE")
		public void scrschdSchdCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_SCHD_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRSCHD_SCHD_CODE", function=KeyFunction.NEXT_ITEM)
		public void scrschdSchdCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRSCHD_SCHD_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRSCHD_SCHD_CODE", function=KeyFunction.ITEM_OUT)
		public void scrschdSchdCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCRSCHD_SCHD_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO L_UPDATE ;
   END IF ;
   IF (:KB_TERM_CODE_EFF = :SCRSCHD_TERM_CODE_FROM) THEN
      GOTO L_UPDATE ;
   ELSE
      GOTO NO_UPDATE ;
   END IF ;
--
   << NO_UPDATE >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT SCRSCHD_SCHD_CODE
         FROM   SCRSCHD
         WHERE  ROWID = :SCRSCHD.ROWID ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRSCHD_SCHD_CODE ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO PTI_END_TRIGGER ;
      ELSE
         MESSAGE(
 G$_NLS.Get('ZCACRSE-0156', 'FORM','*ERROR* Cannot update unless from term equal key block term.')  ) ;
         GOTO PTI_END_TRIGGER ;
      END IF ;
   END ;
--
   << L_UPDATE >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
   DECLARE
      insm_code         VARCHAR2(5);
      CURSOR PTI_CURSOR IS
         SELECT STVSCHD_INSM_CODE
         FROM   STVSCHD
         WHERE  STVSCHD_CODE = :SCRSCHD_SCHD_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO insm_code ;
      if pti_cursor%notfound then
          message( G$_NLS.Get('ZCACRSE-0157', 'FORM','*ERROR* Invalid code, press LIST for valid codes.') );
          raise form_trigger_failure;
      else
          :schd_add := :schd_add + 1;
      end if;
   END ;
--
   << PTI_STEP_001 >>
      null;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVSCHD_DESC
         FROM   STVSCHD
         WHERE  STVSCHD_CODE = :SCRSCHD_SCHD_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCHD_DESCRIPTION ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('ZCACRSE-0158', 'FORM','*ERROR* Invalid code, press LIST for valid codes.') , TRUE);
   END ;
--
   << PTI_END_TRIGGER >>
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
		 * SCRSCHD_SCHD_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCRSCHD_SCHD_CODE")
		public void scrschdSchdCode_PostChange()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ScrschdAdapter scrschdElement = (ScrschdAdapter)this.getFormModel().getScrschd().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						 
					}else{
						if ((getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getSchdCtrlBlock().getScrschdTermCodeFrom())))
						{
							 
						}
						else {
							 NO_UPDATE:;
							if ((getGlobal("QUERY_MODE").equals("1")))
							{
								setGlobal("QUERY_MODE", toStr("0"));
								return;
							}
							{
								String sqlptiCursor = "SELECT SCRSCHD_SCHD_CODE " +
			" FROM SCRSCHD " +
			" WHERE ROWID = :SCRSCHD_ROWID ";
								DataCursor ptiCursor = new DataCursor(sqlptiCursor);
								try {
									//Setting query parameters
									ptiCursor.addParameter("SCRSCHD_ROWID", scrschdElement.getROWID());
									//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
									ptiCursor.open();
									ResultSet ptiCursorResults = ptiCursor.fetchInto();
									if ( ptiCursorResults != null ) {
										scrschdElement.setScrschdSchdCode(ptiCursorResults.getStr(0));
									}
									if ( ptiCursor.notFound() )
									{
										setGlobal("QUERY_MODE", toStr("0"));
										return;
									}
									else {
										errorMessage(GNls.Fget(toStr("ZCACRSE-0156"), toStr("FORM"), toStr("*ERROR* Cannot update unless from term equal key block term.")));
										setGlobal("QUERY_MODE", toStr("0"));
										return;
									}
								}
								finally{
									ptiCursor.close();
								}
							}
						}
					}
					
					
					 L_UPDATE:;
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						
					}else
					{
						NString insmCode = NString.getNull();
						String sqlptiCursor = "SELECT STVSCHD_INSM_CODE " +
	" FROM STVSCHD " +
	" WHERE STVSCHD_CODE = :SCRSCHD_SCHD_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCRSCHD_SCHD_CODE", scrschdElement.getScrschdSchdCode());
							//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								insmCode = ptiCursorResults.getStr(0);
							}
							if ( ptiCursor.notFound() )
							{
								errorMessage(GNls.Fget(toStr("ZCACRSE-0157"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")));
								throw new ApplicationException();
							}
							else {
								getFormModel().getKeyBlock().setSchdAdd(getFormModel().getKeyBlock().getSchdAdd().add(1));
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					 PTI_STEP_001:;
					{
						String sqlptiCursor = "SELECT STVSCHD_DESC " +
	" FROM STVSCHD " +
	" WHERE STVSCHD_CODE = :SCRSCHD_SCHD_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCRSCHD_SCHD_CODE", scrschdElement.getScrschdSchdCode());
							//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								scrschdElement.setSchdDescription(ptiCursorResults.getStr(0));
							}
							getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("ZCACRSE-0158"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					 PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCHD_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCHD_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void schdDescription_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		@ValidationTrigger(item="SCRSCHD_SEQ")
		public void scrschdSeq_validate()
		{
			ScrschdAdapter scrschdElement = (ScrschdAdapter)this.getFormModel().getScrschd().getRowAdapter(true);
			try{
				if(scrschdElement.getScrschdSeq().isNotNull())
					Integer.parseInt(scrschdElement.getScrschdSeq().getValue());
			}catch(Exception e){
				errorMessage("Invalid Seq value. Value must be in range 1 to 9");
				throw new ApplicationException();
			}
			//getGoqolibGVpdiBlockController().vpdiCode_validate();
		}
	
	
}
