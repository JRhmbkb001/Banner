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

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
		
public class ZcbcrseController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public ZcbcrseController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.COPY_END
		    :ZCBCRSE_TERM_CODE_TO := :SCBCRKY_TERM_CODE_END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.COPY_END
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COPY_END", fireInSearch=false)
		public void zcbcrse_CopyEnd()
		{
			
				getFormModel().getZcbcrseCtrlBlock().setZcbcrseTermCodeTo(getFormModel().getKeyBlock().getScbcrkyTermCodeEnd());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.KEY-CREREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void zcbcrse_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.KEY-DUPREC
		    IF :KB_TERM_CODE_EFF = :ZCBCRSE_TERM_CODE_FROM OR (
      :KB_TERM_CODE_EFF IS NULL AND :ZCBCRSE_TERM_CODE_FROM
       IS NULL ) THEN
      EXECUTE_TRIGGER( 'INVALID_DUP' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   :CRSE_INSERT := 'Y' ;
--
   :ZCBCRSE_EFF_TERM := :ZCBCRSE_EFF_TERM ;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
   COMMIT_FORM ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;
   EXECUTE_QUERY ;
--
   :CRSE_INSERT := 'N' ;

    SET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void zcbcrse_CopyRecord()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				if ( getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom()) || (getFormModel().getKeyBlock().getKbTermCodeEff().isNull() && getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().isNull()) )
				{
					executeAction("INVALID_DUP");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				zcbcrseElement.setCrseInsert(toStr("Y"));
				// 
				zcbcrseElement.setZcbcrseEffTerm(zcbcrseElement.getZcbcrseEffTerm());
				// 
				// F2J_WARNING_DONE : Please validate if you need to surround the message level manipulation with a try/finally block
				try{
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					commitTask();
				}finally{
					// F2J_WARNING_DONE : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					executeQuery(); 
					zcbcrseElement.setCrseInsert(toStr("N"));
					setItemEnabled("ZCBCRSE_ENDCOPY_LBT", false);
				}
				
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.PRE-INSERT
		 :ZCBCRSE_EFF_TERM := :KB_TERM_CODE_EFF ; 
:ZCBCRSE_SUBJ_CODE := :KB_SUBJ_CODE;
:ZCBCRSE_CRSE_NUMB := :KB_CRSE_NUMB;

   IF :ZCBCRSE_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :ZCBCRSE_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
      NULL ;
   ELSE
      EXECUTE_TRIGGER( 'INVALID_INSERT' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
:ZCBCRSE_USER_ID := :GLOBAL.USER_ID;
:ZCBCRSE_DATA_ORIGIN := 'ZCACRSE';
:ZCBCRSE_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,'DD-MON-YYYY') ;
:ZCBCRSE_EFF_TERM := :KB_TERM_CODE_EFF ;
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void zcbcrse_BeforeRowInsert(RowAdapterEvent args)
		{
			
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)args.getRow();


				zcbcrseElement.setZcbcrseEffTerm(getFormModel().getKeyBlock().getKbTermCodeEff());
				zcbcrseElement.setZcbcrseSubjCode(getFormModel().getKeyBlock().getKbSubjCode());
				zcbcrseElement.setZcbcrseCrseNumb(getFormModel().getKeyBlock().getKbCrseNumb());
				if ( getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
				}
				else {
					executeAction("INVALID_INSERT");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				zcbcrseElement.setZcbcrseUserId(getGlobal("USER_ID"));
				zcbcrseElement.setZcbcrseDataOrigin(toStr("ZCACRSE"));
				zcbcrseElement.setZcbcrseActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), "DD-MON-YYYY"));
				zcbcrseElement.setZcbcrseEffTerm(getFormModel().getKeyBlock().getKbTermCodeEff());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.PRE-QUERY
		    :ZCBCRSE_TERM_CODE_FROM := :KB_TERM_CODE_EFF ;

   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(ZCBCRSE_EFF_TERM)
         FROM   ZCBCRSE
         WHERE  ZCBCRSE_EFF_TERM > :KB_TERM_CODE_EFF
           AND  ZCBCRSE_CRSE_NUMB = :KB_CRSE_NUMB
           AND  ZCBCRSE_SUBJ_CODE = :KB_SUBJ_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCBCRSE_TERM_CODE_TO ;
   END ;
--
   IF :ZCBCRSE_TERM_CODE_TO = :ZCBCRSE_TERM_CODE_FROM OR (
      :ZCBCRSE_TERM_CODE_TO IS NULL AND :ZCBCRSE_TERM_CODE_FROM
      IS NULL ) THEN
      EXECUTE_TRIGGER( 'FIND_TO_TERM' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :ZCBCRSE_TERM_CODE_TO IS NULL THEN
   		EXECUTE_TRIGGER( 'FIND_TO_TERM' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void zcbcrse_BeforeQuery(QueryEvent args)
		{
			
				int rowCount = 0;
               // F2J_WARNING_DONE : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_KB_SUBJ_CODE", this.getFormModel().getKeyBlock().getKbSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_KB_CRSE_NUMB", this.getFormModel().getKeyBlock().getKbCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_TERM_CODE_EFF", this.getFormModel().getKeyBlock().getKbTermCodeEff()));             


           
				getFormModel().getZcbcrseCtrlBlock().setZcbcrseTermCodeFrom(getFormModel().getKeyBlock().getKbTermCodeEff());
				{
					String sqlptiCursor = "SELECT MIN(ZCBCRSE_EFF_TERM) " +
	" FROM ZCBCRSE " +
	" WHERE ZCBCRSE_EFF_TERM > :KB_TERM_CODE_EFF AND ZCBCRSE_CRSE_NUMB = :KB_CRSE_NUMB AND ZCBCRSE_SUBJ_CODE = :KB_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
						ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
						ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
						//F2J_WARNING_DONE_ : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getZcbcrseCtrlBlock().setZcbcrseTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeTo().equals(getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom()) || (getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeTo().isNull() && getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().isNull()) )
				{
					executeAction("FIND_TO_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeTo().isNull() ) {
					executeAction("FIND_TO_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.POST-QUERY
		 :ZCBCRSE_TERM_CODE_FROM := :ZCBCRSE.ZCBCRSE_EFF_TERM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void zcbcrse_AfterQuery(RowAdapterEvent args)
		{
			
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)args.getRow();


				// F2J_WARNING_DONE : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				getFormModel().getZcbcrseCtrlBlock().setZcbcrseTermCodeFrom(zcbcrseElement.getZcbcrseEffTerm());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.KEY-ENTQRY
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH, fireInSearch=false)
		public void zcbcrse_Search()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.KEY-NXTREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD, fireInSearch=false)
		public void zcbcrse_NextRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.KEY-NXTSET
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET", fireInSearch=false)
		public void zcbcrse_KeyNxtset()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.KEY-PRVREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD, fireInSearch=false)
		public void zcbcrse_PreviousRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.FIND_TO_TERM
		    IF SELECT_SCBCRKY_3 (:ZCBCRSE_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
--
   << PTI_STEP_001 >>
   IF :ZCBCRSE_TERM_CODE_TO IS NULL  THEN
      EXECUTE_TRIGGER( 'COPY_END' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.FIND_TO_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FIND_TO_TERM", fireInSearch=false)
		public void zcbcrse_FindToTerm()
		{
				Ref<NString> ovar1_ref = new Ref<NString>(getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeTo());
				this.getTask().getServices().selectScbcrky3(ovar1_ref).getValue();
				getFormModel().getZcbcrseCtrlBlock().setZcbcrseTermCodeTo(ovar1_ref.val);
				if ( getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeTo().isNull() )
				{
					executeAction("COPY_END");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.PRE-UPDATE
		    IF :END_CRSE = 'Y' THEN
      EXECUTE_TRIGGER( 'END_CRSE_TERM' ) ;
      G$_CHECK_FAILURE ;
   ELSE
     IF :ZCBCRSE_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :ZCBCRSE_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
         EXECUTE_TRIGGER( 'UPDATE_TRIG' ) ;
         G$_CHECK_FAILURE ;
      ELSE
         EXECUTE_TRIGGER( 'INSERT_TRIG' ) ;
         G$_CHECK_FAILURE ;
      END IF ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void zcbcrse_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)args.getRow();


				if ( zcbcrseElement.getEndCrse().equals("Y") )
				{
					executeAction("END_CRSE_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					if ( getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
					{
						executeAction("UPDATE_TRIG");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						executeAction("INSERT_TRIG");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.KEY-PRVBLK
		 	GO_BLOCK('ZCRDUPC');
	EXECUTE_QUERY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void zcbcrse_PreviousBlock()
		{
			
				goBlock(toStr("ZCRDUPC"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.END_CRSE_TERM
		 --
   INSERT INTO ZCBCRSE
   (
			ZCBCRSE_SUBJ_CODE,
			ZCBCRSE_CRSE_NUMB,
			ZCBCRSE_EFF_TERM,
			ZCBCRSE_SUBJ_CODE_XLIST,
			ZCBCRSE_CRSE_NUMB_XLIST,
			ZCBCRSE_DUPL_OVER_IND,
			ZCBCRSE_DATA_ORIGIN,
			ZCBCRSE_USER_ID,
			ZCBCRSE_ACTIVITY_DATE
   )
   VALUES ( :KB_SUBJ_CODE, :KB_CRSE_NUMB,
      :KB_TERM_CODE_EFF, '', '', '', 'ZCACRSE', 
      :GLOBAL.CURRENT_USER, SYSDATE);
   G$_CHECK_VALUE (SQL%NOTFOUND, NULL, TRUE);
--
   :ZCBCRSE_TERM_CODE_TO := :KB_TERM_CODE_EFF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.END_CRSE_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="END_CRSE_TERM", fireInSearch=false)
		public void zcbcrse_EndCrseTerm()
		{
			
				// 
				int rowCount = 0;
				// 
				String sql1 = "INSERT INTO ZCBCRSE " +
	"(ZCBCRSE_SUBJ_CODE, ZCBCRSE_CRSE_NUMB, ZCBCRSE_EFF_TERM, ZCBCRSE_SUBJ_CODE_XLIST, ZCBCRSE_CRSE_NUMB_XLIST, ZCBCRSE_DUPL_OVER_IND, ZCBCRSE_DATA_ORIGIN, ZCBCRSE_USER_ID, ZCBCRSE_ACTIVITY_DATE)" +
	"VALUES (:KB_SUBJ_CODE, :KB_CRSE_NUMB, :KB_TERM_CODE_EFF, '', '', '', 'ZCACRSE', :GLOBAL_CURRENT_USER, SYSDATE)";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				command1.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				command1.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
				command1.addParameter("GLOBAL_CURRENT_USER", getGlobal("CURRENT_USER"));
				rowCount = command1.execute();
				getTask().getGoqrpls().gCheckValue(rowCount == 0, toStr(null), toBool(NBool.True));
				// 
				getFormModel().getZcbcrseCtrlBlock().setZcbcrseTermCodeTo(getFormModel().getKeyBlock().getKbTermCodeEff());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.INSERT_TRIG
		    IF :CRSE_INSERT = 'Y' THEN
      NULL ;
   ELSIF :CRSE_INSERT IS NULL  THEN
      EXECUTE_TRIGGER( 'INVALID_UPDATE' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   INSERT INTO ZCBCRSE
   (
			ZCBCRSE_SUBJ_CODE,
			ZCBCRSE_CRSE_NUMB,
			ZCBCRSE_EFF_TERM,
			ZCBCRSE_SUBJ_CODE_XLIST,
			ZCBCRSE_CRSE_NUMB_XLIST,
			ZCBCRSE_DUPL_OVER_IND,
			ZCBCRSE_DATA_ORIGIN,
			ZCBCRSE_USER_ID,
			ZCBCRSE_ACTIVITY_DATE
   )
   SELECT ZCBCRSE_SUBJ_CODE, ZCBCRSE_CRSE_NUMB,
      :KB_TERM_CODE_EFF, ZCBCRSE_SUBJ_CODE_XLIST,
      ZCBCRSE_CRSE_NUMB_XLIST, ZCBCRSE_DUPL_OVER_IND,
      'ZCACRSE', :GLOBAL.CURRENT_USER, SYSDATE
   FROM   ZCBCRSE
   WHERE  ZCBCRSE_SUBJ_CODE = :KB_SUBJ_CODE
     AND  ZCBCRSE_CRSE_NUMB = :KB_CRSE_NUMB
     AND  ZCBCRSE_EFF_TERM = :ZCBCRSE_TERM_CODE_FROM;
G$_CHECK_VALUE (SQL%NOTFOUND, NULL, TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.INSERT_TRIG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INSERT_TRIG", fireInSearch=false)
		public void zcbcrse_InsertTrig()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				int rowCount = 0;
				if ( zcbcrseElement.getCrseInsert().equals("Y") )
				{
				}
				else if ( zcbcrseElement.getCrseInsert().isNull() ) {
					executeAction("INVALID_UPDATE");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				String sql1 = "INSERT INTO ZCBCRSE " +
	"(ZCBCRSE_SUBJ_CODE, ZCBCRSE_CRSE_NUMB, ZCBCRSE_EFF_TERM, ZCBCRSE_SUBJ_CODE_XLIST, ZCBCRSE_CRSE_NUMB_XLIST, ZCBCRSE_DUPL_OVER_IND, ZCBCRSE_DATA_ORIGIN, ZCBCRSE_USER_ID, ZCBCRSE_ACTIVITY_DATE)" +
	"SELECT ZCBCRSE_SUBJ_CODE, ZCBCRSE_CRSE_NUMB, :KB_TERM_CODE_EFF, ZCBCRSE_SUBJ_CODE_XLIST, ZCBCRSE_CRSE_NUMB_XLIST, ZCBCRSE_DUPL_OVER_IND, 'ZCACRSE', :GLOBAL_CURRENT_USER, SYSDATE " +
	" FROM ZCBCRSE " +
	" WHERE ZCBCRSE_SUBJ_CODE = :KB_SUBJ_CODE AND ZCBCRSE_CRSE_NUMB = :KB_CRSE_NUMB AND ZCBCRSE_EFF_TERM = :ZCBCRSE_TERM_CODE_FROM ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
				command1.addParameter("GLOBAL_CURRENT_USER", getGlobal("CURRENT_USER"));
				command1.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				command1.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				command1.addParameter("ZCBCRSE_TERM_CODE_FROM", getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom());
				rowCount = command1.execute();
				getTask().getGoqrpls().gCheckValue(rowCount == 0, toStr(null), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.UPDATE_TRIG
		 :ZCBCRSE_DATA_ORIGIN := 'ZCACRSE';
:ZCBCRSE_USER_ID := :GLOBAL.CURRENT_USER;
:ZCBCRSE_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,'DD-MON-YYYY') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.UPDATE_TRIG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_TRIG", fireInSearch=false)
		public void zcbcrse_UpdateTrig()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				zcbcrseElement.setZcbcrseDataOrigin(toStr("ZCACRSE"));
				zcbcrseElement.setZcbcrseUserId(getGlobal("CURRENT_USER"));
				zcbcrseElement.setZcbcrseActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), "DD-MON-YYYY"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.KEY-DUP-ITEM
		    G$_CHECK_VALUE (NOT (:ZCBCRSE_TERM_CODE_FROM <
      :KB_TERM_CODE_EFF
     AND  :ZCBCRSE_TERM_CODE_TO > :KB_TERM_CODE_EFF),
      '*ERROR* EFFECTIVE TERM MUST BE BETWEEN FROM & TO TERMS TO' ||
         ' END XLIST/DUP. OVERRIDE.', TRUE, TRUE);
--
   :END_CRSE := 'Y' ;
--
   :ZCBCRSE_EFF_TERM := :ZCBCRSE_EFF_TERM ;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
   COMMIT_FORM ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;
--
   :END_GECO := 'N' ;

   :ZCBCRSE_TERM_CODE_TO := :KB_TERM_CODE_EFF ;
--
   SET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void zcbcrse_KeyDupItem()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				getTask().getGoqrpls().gCheckValue(!(getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().lesser(getFormModel().getKeyBlock().getKbTermCodeEff()) && getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeTo().greater(getFormModel().getKeyBlock().getKbTermCodeEff())), toStr("*ERROR* EFFECTIVE TERM MUST BE BETWEEN FROM & TO TERMS TO").append(" END XLIST/DUP. OVERRIDE."), toBool(NBool.True), toBool(NBool.True));
				// 
				zcbcrseElement.setEndCrse(toStr("Y"));
				// 
				zcbcrseElement.setZcbcrseEffTerm(zcbcrseElement.getZcbcrseEffTerm());
				// 
				// F2J_WARNING_DONE : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				commitTask();
				// F2J_WARNING_DONE : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				// 
				zcrgecoElement.setEndGeco(toStr("N"));
				getFormModel().getZcbcrseCtrlBlock().setZcbcrseTermCodeTo(getFormModel().getKeyBlock().getKbTermCodeEff());
				// 
				setItemEnabled("ZCBCRSE_ENDCOPY_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.PRE-BLOCK
		    IF :ZCBCRSE_TERM_CODE_FROM <> :KB_TERM_CODE_EFF AND
      :ZCBCRSE_TERM_CODE_TO   <> :KB_TERM_CODE_EFF THEN
      IF GET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED) = 'FALSE' THEN
         SET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED,PROPERTY_ON);
      END IF;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void zcbcrse_blockIn()
		{
			
				if ( getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom().notEquals(getFormModel().getKeyBlock().getKbTermCodeEff()) && getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeTo().notEquals(getFormModel().getKeyBlock().getKbTermCodeEff()) )
				{
					if ( getItemEnabled("ZCBCRSE_ENDCOPY_LBT").equals("FALSE") )
					{
						setItemEnabled("ZCBCRSE_ENDCOPY_LBT", true);
					}
				}
				hideView("ZCRDUPS_2_CANVAS");
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE.POST-BLOCK
		   SET_ITEM_PROPERTY('ZCBCRSE_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void zcbcrse_blockOut()
		{
			
				setItemEnabled("ZCBCRSE_ENDCOPY_LBT", false);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCBCRSE_SUBJ_CODE_XLIST")
		public void zcbcrseSubjCodeXlist_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCBCRSE_SUBJ_CODE_XLIST", function=KeyFunction.ITEM_CHANGE)
		public void zcbcrseSubjCodeXlist_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCBCRSE_SUBJ_CODE_XLIST")
		public void zcbcrseSubjCodeXlist_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_SUBJ_CODE_XLIST.G$_SEARCH_OPTIONS
		 SET_WINDOW_PROPERTY('G$_OPT_WINDOW',POSITION,25*6,3*17);
G$_KEY_OPT_MENU('ZCBCRSE.ZCBCRSE_SUBJ_CODE_XLIST', 
                 G$_NLS.Get('ZCACRSE-0074', 'FORM','Valid Subject Codes') , 'LIST_VALUES',
                 G$_NLS.Get('ZCACRSE-0076', 'FORM','View Existing Courses') , 'COUNT_QUERY',
                 '','','','');
G$_CHECK_FAILURE;
:CHECK_KEYS := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCBCRSE_SUBJ_CODE_XLIST")
		public void zcbcrseSubjCodeXlist_GSearchOptions()
		{
			
				// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details.
				//				SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 25.multiply(6), 3.multiply(17));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details.");
				
				getTask().getGoqrpls().gKeyOptMenu(toStr("ZCBCRSE.ZCBCRSE_SUBJ_CODE_XLIST"), GNls.Fget(toStr("ZCACRSE-0074"), toStr("FORM"), toStr("Valid Subject Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("ZCACRSE-0076"), toStr("FORM"), toStr("View Existing Courses")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCBCRSE_SUBJ_CODE_XLIST", function=KeyFunction.NEXT_ITEM)
		public void zcbcrseSubjCodeXlist_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCBCRSE_SUBJ_CODE_XLIST", function=KeyFunction.ITEM_OUT)
		public void zcbcrseSubjCodeXlist_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_SUBJ_CODE_XLIST.KEY-CQUERY
		  :GLOBAL.SCBCRKY_SUBJ_CODE := '' ;
 :GLOBAL.SCBCRKY_CRSE_NUMB := '' ;

   DISPLAY_LOV2('ZCBCRSE_SUBJ_CODE_XLIST','USCQSUBJC_LOV') ;

   IF :GLOBAL.SCBCRKY_SUBJ_CODE is not null
   	   then :ZCBCRSE_SUBJ_CODE_XLIST := :GLOBAL.SCBCRKY_SUBJ_CODE ;
            :ZCBCRSE_CRSE_NUMB_XLIST := :GLOBAL.SCBCRKY_CRSE_NUMB ;
            GO_FIELD( 'ZCBCRSE.ZCBCRSE_CRSE_NUMB_XLIST' ) ;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ZCBCRSE_SUBJ_CODE_XLIST", function=KeyFunction.COUNT_QUERY)
		public void zcbcrseSubjCodeXlist_TotalResults()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				setGlobal("SCBCRKY_SUBJ_CODE", toStr(""));
				setGlobal("SCBCRKY_CRSE_NUMB", toStr(""));
				this.getTask().getServices().displayLov2(toStr("ZCBCRSE_SUBJ_CODE_XLIST"), toStr("USCQSUBJC_LOV"));
				if ( getGlobal("SCBCRKY_SUBJ_CODE").isNotNull() )
				{
					zcbcrseElement.setZcbcrseSubjCodeXlist(getGlobal("SCBCRKY_SUBJ_CODE"));
					zcbcrseElement.setZcbcrseCrseNumbXlist(getGlobal("SCBCRKY_CRSE_NUMB"));
					goField(toStr("ZCBCRSE.ZCBCRSE_CRSE_NUMB_XLIST"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_SUBJ_CODE_XLIST.POST-CHANGE
		 :ZCBCRSE_SUBJ_CODE_XLIST_DESC := 
   GB_STVSUBJ.F_GET_DESCRIPTION(:ZCBCRSE_SUBJ_CODE_XLIST);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_SUBJ_CODE_XLIST.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCBCRSE_SUBJ_CODE_XLIST")
		public void zcbcrseSubjCodeXlist_PostChange()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				zcbcrseElement.setZcbcrseSubjCodeXlistDesc(GbStvsubj.fGetDescription(zcbcrseElement.getZcbcrseSubjCodeXlist()));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_SUBJ_CODE_XLIST.WHEN-VALIDATE-ITEM
		    IF (:ZCBCRSE_SUBJ_CODE_XLIST IS NOT NULL) THEN
   	  IF GB_STVSUBJ.F_CODE_EXISTS(:ZCBCRSE_SUBJ_CODE_XLIST) <> 'Y' THEN
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
		 * ZCBCRSE_SUBJ_CODE_XLIST.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCBCRSE_SUBJ_CODE_XLIST")
		public void zcbcrseSubjCodeXlist_validate()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				if ((zcbcrseElement.getZcbcrseSubjCodeXlist().isNotNull()))
				{
					if ( GbStvsubj.fCodeExists(zcbcrseElement.getZcbcrseSubjCodeXlist()).notEquals("Y") )
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
		 * ZCBCRSE_SUBJ_CODE_XLIST_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCBCRSE_SUBJ_CODE_XLIST_DESC", function=KeyFunction.ITEM_CHANGE)
		public void zcbcrseSubjCodeXlistDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_CRSE_NUMB_XLIST.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCBCRSE_CRSE_NUMB_XLIST")
		public void zcbcrseCrseNumbXlist_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_CRSE_NUMB_XLIST.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCBCRSE_CRSE_NUMB_XLIST", function=KeyFunction.ITEM_CHANGE)
		public void zcbcrseCrseNumbXlist_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_CRSE_NUMB_XLIST.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('SCBCRKY_CRSE_NUMB','scbcrse_title',
  'where SCBCRKY_CRSE_NUMB = :ZCBCRSE_CRSE_NUMB_XLIST
   and SCBCRKY_SUBJ_CODE = :ZCBCRSE_SUBJ_CODE_XLIST
   and scbcrse_subj_code = scbcrky_subj_code
   and scbcrse_crse_numb = scbcrky_crse_numb
   and scbcrse_eff_term in (select max(SCBCRKY_TERM_CODE_START)
                         from scbcrky
                         where SCBCRKY_CRSE_NUMB = :ZCBCRSE_CRSE_NUMB_XLIST
                         and SCBCRKY_SUBJ_CODE = :ZCBCRSE_SUBJ_CODE_XLIST
                         and scbcrse_subj_code = scbcrky_subj_code
                         and scbcrse_crse_numb = scbcrky_crse_numb)');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_CRSE_NUMB_XLIST.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCBCRSE_CRSE_NUMB_XLIST")
		public void zcbcrseCrseNumbXlist_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("SCBCRKY_CRSE_NUMB"), toStr("scbcrse_title"), toStr("where SCBCRKY_CRSE_NUMB = :ZCBCRSE_CRSE_NUMB_XLIST\n   and SCBCRKY_SUBJ_CODE = :ZCBCRSE_SUBJ_CODE_XLIST\n   and scbcrse_subj_code = scbcrky_subj_code\n   and scbcrse_crse_numb = scbcrky_crse_numb\n   and scbcrse_eff_term in (select max(SCBCRKY_TERM_CODE_START)\n                         from scbcrky\n                         where SCBCRKY_CRSE_NUMB = :ZCBCRSE_CRSE_NUMB_XLIST\n                         and SCBCRKY_SUBJ_CODE = :ZCBCRSE_SUBJ_CODE_XLIST\n                         and scbcrse_subj_code = scbcrky_subj_code\n                         and scbcrse_crse_numb = scbcrky_crse_numb)"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_CRSE_NUMB_XLIST.G$_SEARCH_OPTIONS
		 BEGIN
  DO_KEY('LIST_VALUES');
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_CRSE_NUMB_XLIST.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCBCRSE_CRSE_NUMB_XLIST")
		public void zcbcrseCrseNumbXlist_GSearchOptions()
		{
			
				executeAction(KeyFunction.LIST_VALUES);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_CRSE_NUMB_XLIST.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCBCRSE_CRSE_NUMB_XLIST", function=KeyFunction.NEXT_ITEM)
		public void zcbcrseCrseNumbXlist_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_CRSE_NUMB_XLIST.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCBCRSE_CRSE_NUMB_XLIST", function=KeyFunction.ITEM_OUT)
		public void zcbcrseCrseNumbXlist_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_CRSE_NUMB_XLIST.KEY-CQUERY
		  :GLOBAL.SCBCRKY_SUBJ_CODE := '' ;
 :GLOBAL.SCBCRKY_CRSE_NUMB := '' ;

   DISPLAY_LOV2('ZCBCRSE_SUBJ_CODE_XLIST','USCQSUBJC_LOV') ;

   IF :GLOBAL.SCBCRKY_CRSE_NUMB IS NULL 
   	  THEN RETURN ;
   END IF ;
--
   GO_FIELD( 'ZCBCRSE.ZCBCRSE_CRSE_NUMB_XLIST' ) ;
   :ZCBCRSE_CRSE_NUMB_XLIST := :GLOBAL.SCBCRKY_CRSE_NUMB ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_CRSE_NUMB_XLIST.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ZCBCRSE_CRSE_NUMB_XLIST", function=KeyFunction.COUNT_QUERY)
		public void zcbcrseCrseNumbXlist_TotalResults()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				setGlobal("SCBCRKY_SUBJ_CODE", toStr(""));
				setGlobal("SCBCRKY_CRSE_NUMB", toStr(""));
				this.getTask().getServices().displayLov2(toStr("ZCBCRSE_SUBJ_CODE_XLIST"), toStr("USCQSUBJC_LOV"));
				if ( getGlobal("SCBCRKY_CRSE_NUMB").isNull() )
				{
					return ;
				}
				// 
				goField(toStr("ZCBCRSE.ZCBCRSE_CRSE_NUMB_XLIST"));
				zcbcrseElement.setZcbcrseCrseNumbXlist(getGlobal("SCBCRKY_CRSE_NUMB"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_CRSE_NUMB_XLIST.KEY-LISTVAL
		 GO_ITEM('ZCBCRSE_CRSE_NUMB_XLIST');
DO_KEY ('COUNT_QUERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_CRSE_NUMB_XLIST.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ZCBCRSE_CRSE_NUMB_XLIST", function=KeyFunction.LIST_VALUES)
		public void zcbcrseCrseNumbXlist_ListValues()
		{
			
				goItem(toStr("ZCBCRSE_CRSE_NUMB_XLIST"));
				executeAction(KeyFunction.COUNT_QUERY);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_CRSE_NUMB_XLIST.POST-CHANGE
		 DECLARE                                                                 
   PTI_INTO_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
      SELECT 'X'
      FROM   SCBCRSE
      WHERE  SCBCRSE_SUBJ_CODE = :ZCBCRSE_SUBJ_CODE_XLIST
      AND    SCBCRSE_CRSE_NUMB = :ZCBCRSE_CRSE_NUMB_XLIST ;                                                           
BEGIN
   G$_CHECK_QUERY_MODE ;
--                                                                         
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
       GOTO PTI_END_TRIGGER ;
   END IF ;

   OPEN PTI_CURSOR ;
   FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
   G$_CHECK_VALUE (
       PTI_CURSOR%NOTFOUND,                                 
       '*ERROR:  Invalid Course Number.', TRUE);                         
--                                                                         
   G$_CHECK_VALUE ( (
      :KEY_BLOCK.KB_SUBJ_CODE = :ZCBCRSE_SUBJ_CODE_XLIST AND
      :KEY_BLOCK.KB_CRSE_NUMB = :ZCBCRSE_CRSE_NUMB_XLIST ),                                         
      '*ERROR:  Subject and Course Number cannot cross list with itself.',
      TRUE );
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
		 * ZCBCRSE_CRSE_NUMB_XLIST.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCBCRSE_CRSE_NUMB_XLIST")
		public void zcbcrseCrseNumbXlist_PostChange()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				int rowCount = 0;
				{
					NString ptiIntoTemp = NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SCBCRSE " +
	" WHERE SCBCRSE_SUBJ_CODE = :ZCBCRSE_SUBJ_CODE_XLIST AND SCBCRSE_CRSE_NUMB = :ZCBCRSE_CRSE_NUMB_XLIST ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						try
						{
							getTask().getGoqrpls().gCheckQueryMode();
							//                                                                          
							if ((getGlobal("QUERY_MODE").equals("1")))
							{

							}else{
								//Setting query parameters
								ptiCursor.addParameter("ZCBCRSE_SUBJ_CODE_XLIST", zcbcrseElement.getZcbcrseSubjCodeXlist());
								ptiCursor.addParameter("ZCBCRSE_CRSE_NUMB_XLIST", zcbcrseElement.getZcbcrseCrseNumbXlist());
								//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									ptiIntoTemp = ptiCursorResults.getStr(0);
								}
								getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), toStr("*ERROR:  Invalid Course Number."), toBool(NBool.True));
								//                                                                          
								getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getKbSubjCode().equals(zcbcrseElement.getZcbcrseSubjCodeXlist()) && getFormModel().getKeyBlock().getKbCrseNumb().equals(zcbcrseElement.getZcbcrseCrseNumbXlist()))), toStr("*ERROR:  Subject and Course Number cannot cross list with itself."), toBool(NBool.True));
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
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCBCRSE_DUPL_OVER_IND.WHEN-VALIDATE-ITEM
		 begin
   G$_CHECK_QUERY_MODE;
   
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO L_UPDATE ;
   END IF ;
   IF (:KB_TERM_CODE_EFF = :ZCBCRSE_TERM_CODE_FROM) THEN
      GOTO L_UPDATE ;
   ELSE
      GOTO NO_UPDATE ;
   END IF ;

   << NO_UPDATE >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;   

   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT ZCBCRSE_DUPL_OVER_IND
         FROM   ZCBCRSE
         WHERE  ROWID = :ZCBCRSE.ROWID ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCBCRSE_DUPL_OVER_IND;
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
		NULL;   
   
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
		 * ZCBCRSE_DUPL_OVER_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCBCRSE_DUPL_OVER_IND")
		public void zcbcrseDuplOverInd_validate()
		{
			

				//F2J_WARNING_DONE : Caution, the variable may be null.
				ZcbcrseAdapter zcbcrseElement = (ZcbcrseAdapter)this.getFormModel().getZcbcrse().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
					}
					else{
						if ((getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getZcbcrseCtrlBlock().getZcbcrseTermCodeFrom())))
						{
							 
						}
						else {
							 NO_UPDATE:;
							if ((getGlobal("QUERY_MODE").equals("1")))
							{
								
							}else
							{
								String sqlptiCursor = "SELECT ZCBCRSE_DUPL_OVER_IND " +
			" FROM ZCBCRSE " +
			" WHERE ROWID = :ZCBCRSE_ROWID ";
								DataCursor ptiCursor = new DataCursor(sqlptiCursor);
								try {
									//Setting query parameters
									ptiCursor.addParameter("ZCBCRSE_ROWID", zcbcrseElement.getROWID());
									//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
									ptiCursor.open();
									ResultSet ptiCursorResults = ptiCursor.fetchInto();
									if ( ptiCursorResults != null ) {
										zcbcrseElement.setZcbcrseDuplOverInd(ptiCursorResults.getStr(0));
									}
									if ( ptiCursor.notFound() )
									{
										 
									}
									else {
										errorMessage(GNls.Fget(toStr("ZCACRSE-0156"), toStr("FORM"), toStr("*ERROR* Cannot update unless from term equal key block term.")));
									
									}
								}
								finally{
									ptiCursor.close();
								}
							}
						}
					}
					
					
					 L_UPDATE:;
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
		 * ZCBCRSE_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCBCRSE_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void zcbcrseActivityDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCBCRSE_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE, fireInSearch=false)
		public void zcbcrseActivityDate_itemChange()
		{
			
			getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCBCRSE_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCBCRSE_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT, fireInSearch=false)
		public void zcbcrseActivityDate_itemOut()
		{
			
			getGDateClass().itemOut();
		}

		
	
	
}
