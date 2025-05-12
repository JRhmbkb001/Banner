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
import static morphis.foundations.core.util.globals.Globals.setGlobal;

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

import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
		
public class ZcrgecoController extends DefaultBlockController {

	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ZcrgecoController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER ZCRGECO.WHEN-VALIDATE-RECORD
		 IF U_VALID_SUBJ_CRSE(:ZCRGECO_SUBJ_CODE_COCRSE, :ZCRGECO_CRSE_NUMB_COCRSE)
    THEN RETURN;
END IF;

MESSAGE(G$_NLS.Get('ZCACRSE-8001', 'FORM', 
  '*ERROR* Selected SUBJECT/COURSE combination is invalid'));
pause;
RAISE FORM_TRIGGER_FAILURE; 
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void zcrgeco_WhenValidateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				if ( this.getTask().getServices().uValidSubjCrse(zcrgecoElement.getZcrgecoSubjCodeCocrse(), zcrgecoElement.getZcrgecoCrseNumbCocrse()).getValue() )
				{
					return ;
				}
				errorMessage(GNls.Fget(toStr("ZCACRSE-8001"), toStr("FORM"), toStr("*ERROR* Selected SUBJECT/COURSE combination is invalid")));
				// F2J_NOT_SUPPORTED : Call to built-in "PAUSE" was removed because it is not supported. See documentation for details.
				//				SupportClasses.SQLFORMS.Pause();
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'PAUSE' was removed because it is not supported. See documentation for details.");
				
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.PRE-QUERY
		    :ZCRGECO_TERM_CODE_FROM := :KB_TERM_CODE_EFF ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(ZCRGECO_EFF_TERM)
         FROM   ZCRGECO
         WHERE  ZCRGECO_EFF_TERM > :KB_TERM_CODE_EFF
           AND  ZCRGECO_CRSE_NUMB = :KB_CRSE_NUMB
           AND  ZCRGECO_SUBJ_CODE = :KB_SUBJ_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCRGECO_TERM_CODE_TO ;
   END ;
--
   IF :ZCRGECO_TERM_CODE_TO = :ZCRGECO_TERM_CODE_FROM OR (
      :ZCRGECO_TERM_CODE_TO IS NULL AND :ZCRGECO_TERM_CODE_FROM
      IS NULL ) THEN
      EXECUTE_TRIGGER( 'FIND_TO_TERM' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :ZCRGECO_TERM_CODE_TO IS NULL  THEN
      EXECUTE_TRIGGER( 'FIND_TO_TERM' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void zcrgeco_BeforeQuery(QueryEvent args)
		{
			
				int rowCount = 0;
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_SUBJ_CODE", this.getFormModel().getKeyBlock().getKbSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_CRSE_NUMB", this.getFormModel().getKeyBlock().getKbCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_TERM_CODE_EFF", this.getFormModel().getKeyBlock().getKbTermCodeEff()));             


           
				getFormModel().getGecoCtrlBlock().setZcrgecoTermCodeFrom(getFormModel().getKeyBlock().getKbTermCodeEff());
				{
					String sqlptiCursor = "SELECT MIN(ZCRGECO_EFF_TERM) " +
	" FROM ZCRGECO " +
	" WHERE ZCRGECO_EFF_TERM > :KB_TERM_CODE_EFF AND ZCRGECO_CRSE_NUMB = :KB_CRSE_NUMB AND ZCRGECO_SUBJ_CODE = :KB_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
						ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
						ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getGecoCtrlBlock().setZcrgecoTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeTo().equals(getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom()) || (getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeTo().isNull() && getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().isNull()) )
				{
					executeAction("FIND_TO_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeTo().isNull() ) {
					try {
						executeAction("FIND_TO_TERM");
						getTask().getGoqrpls().gCheckFailure();
					} catch (Exception e) {
						
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.POST-QUERY
		    :ZCRGECO_TERM_CODE_FROM := :ZCRGECO_EFF_TERM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void zcrgeco_AfterQuery(RowAdapterEvent args)
		{
			
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)args.getRow();


				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				getFormModel().getGecoCtrlBlock().setZcrgecoTermCodeFrom(zcrgecoElement.getZcrgecoEffTerm());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.PRE-INSERT
		    :ZCRGECO.ZCRGECO_EFF_TERM :=
      :KB_TERM_CODE_EFF ;
--
   :ZCRGECO.ZCRGECO_SUBJ_CODE :=
      :KB_SUBJ_CODE ;
--
   :ZCRGECO.ZCRGECO_CRSE_NUMB :=
      :KB_CRSE_NUMB ;
--
   IF :ZCRGECO_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :ZCRGECO_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
      NULL ;
   ELSE
      EXECUTE_TRIGGER( 'INVALID_INSERT' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
:ZCRGECO_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,'DD-MON-YYYY') ;
--
:ZCRGECO_EFF_TERM := :KB_TERM_CODE_EFF ;
--
:ZCRGECO_TYPE := 'G';
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void zcrgeco_BeforeRowInsert(RowAdapterEvent args)
		{
			
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)args.getRow();


				zcrgecoElement.setZcrgecoEffTerm(getFormModel().getKeyBlock().getKbTermCodeEff());
				// 
				zcrgecoElement.setZcrgecoSubjCode(getFormModel().getKeyBlock().getKbSubjCode());
				// 
				zcrgecoElement.setZcrgecoCrseNumb(getFormModel().getKeyBlock().getKbCrseNumb());
				// 
				if ( getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
				}
				else {
					executeAction("INVALID_INSERT");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				zcrgecoElement.setZcrgecoActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), "DD-MON-YYYY"));
				// 
				zcrgecoElement.setZcrgecoEffTerm(getFormModel().getKeyBlock().getKbTermCodeEff());
				// 
				zcrgecoElement.setZcrgecoType(toStr("G"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.PRE-BLOCK
		    IF :ZCRGECO_TERM_CODE_FROM <> :KB_TERM_CODE_EFF AND
      :ZCRGECO_TERM_CODE_TO   <> :KB_TERM_CODE_EFF THEN
      IF GET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED) = 'FALSE' THEN
         SET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED,PROPERTY_ON);
      END IF;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void zcrgeco_blockIn()
		{
			
				if ( getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().notEquals(getFormModel().getKeyBlock().getKbTermCodeEff()) && getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeTo().notEquals(getFormModel().getKeyBlock().getKbTermCodeEff()) )
				{
					if ( getItemEnabled("ZCRGECO_ENDCOPY_LBT").equals("FALSE") )
					{
						setItemEnabled("ZCRGECO_ENDCOPY_LBT", true);
					}
				}
				hideView("ZCRDUPS_2_CANVAS");
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.PRE-UPDATE
		    IF :END_GECO = 'Y' THEN
      EXECUTE_TRIGGER( 'END_GECO_TERM' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      IF :ZCRGECO_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
         :ZCRGECO_TERM_CODE_FROM IS NULL AND
         :KB_TERM_CODE_EFF IS NULL ) THEN
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
		 * ZCRGECO.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void zcrgeco_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)args.getRow();


				if ( zcrgecoElement.getEndGeco().equals("Y") )
				{
					executeAction("END_GECO_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					if ( getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
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

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.KEY-CREREC
		    IF :ZCRGECO_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :ZCRGECO_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
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
		 * ZCRGECO.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD, fireInSearch=false)
		public void zcrgeco_CreateRecord()
		{
			
				if ( getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
					createRecord();
				}
				else {
					executeAction("INVALID_CREATE");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.KEY-DELREC
		    IF :ZCRGECO_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :ZCRGECO_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
      DELETE_RECORD ;
   ELSE
      EXECUTE_TRIGGER( 'INVALID_DELETE' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD, fireInSearch=false)
		public void zcrgeco_DeleteRecord()
		{
			
				if ( getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
					try{
						setFormValidationEnabled(false);
						deleteRecord();
					}finally {
						setFormValidationEnabled(true);
					}
				}
				else {
					executeAction("INVALID_DELETE");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.KEY-DUP-ITEM
		    G$_CHECK_VALUE (NOT (:ZCRGECO_TERM_CODE_FROM <
      :KB_TERM_CODE_EFF
     AND  :ZCRGECO_TERM_CODE_TO > :KB_TERM_CODE_EFF),
      '*ERROR* EFFECTIVE TERM MUST BE BETWEEN FROM & TO TERMS TO' ||
         ' END GE CO-REQUISITES.', TRUE, TRUE);
--
   :END_GECO := 'Y' ;
--
   :ZCRGECO_EFF_TERM := :ZCRGECO_EFF_TERM ;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
   COMMIT_FORM ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;
--
   :END_GECO := 'N' ;

   :ZCRGECO_TERM_CODE_TO := :KB_TERM_CODE_EFF ;
--
   SET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM, fireInSearch=false)
		public void zcrgeco_KeyDupItem()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				getTask().getGoqrpls().gCheckValue(!(getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().lesser(getFormModel().getKeyBlock().getKbTermCodeEff()) && getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeTo().greater(getFormModel().getKeyBlock().getKbTermCodeEff())), toStr("*ERROR* EFFECTIVE TERM MUST BE BETWEEN FROM & TO TERMS TO").append(" END GE CO-REQUISITES."), toBool(NBool.True), toBool(NBool.True));
				// 
				zcrgecoElement.setEndGeco(toStr("Y"));
				// 
				zcrgecoElement.setZcrgecoEffTerm(zcrgecoElement.getZcrgecoEffTerm());
				// 
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				commitTask();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				// 
				zcrgecoElement.setEndGeco(toStr("N"));
				getFormModel().getGecoCtrlBlock().setZcrgecoTermCodeTo(getFormModel().getKeyBlock().getKbTermCodeEff());
				// 
				setItemEnabled("ZCRGECO_ENDCOPY_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.KEY-DUPREC
		    IF :KB_TERM_CODE_EFF = :ZCRGECO_TERM_CODE_FROM OR (
      :KB_TERM_CODE_EFF IS NULL AND :ZCRGECO_TERM_CODE_FROM
       IS NULL ) THEN
      EXECUTE_TRIGGER( 'INVALID_DUP' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   :GECO_INSERT := 'Y' ;
--
   :ZCRGECO_EFF_TERM := :ZCRGECO_EFF_TERM ;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
   COMMIT_FORM ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;
   EXECUTE_QUERY ;
--
   :GECO_INSERT := 'N' ;

    SET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD, fireInSearch=false)
		public void zcrgeco_CopyRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				if ( getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom()) || (getFormModel().getKeyBlock().getKbTermCodeEff().isNull() && getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().isNull()) )
				{
					executeAction("INVALID_DUP");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				zcrgecoElement.setGecoInsert(toStr("Y"));
				// 
				zcrgecoElement.setZcrgecoEffTerm(zcrgecoElement.getZcrgecoEffTerm());
				// 
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				commitTask();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				executeQuery();
				// 
				zcrgecoElement.setGecoInsert(toStr("N"));
				setItemEnabled("ZCRGECO_ENDCOPY_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.POST-BLOCK
		   SET_ITEM_PROPERTY('ZCRGECO_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void zcrgeco_blockOut()
		{
			
				setItemEnabled("ZCRGECO_ENDCOPY_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.KEY-NXTREC
		    NEXT_RECORD ;
--
   IF :ZCRGECO_SUBJ_CODE_COCRSE IS NULL  THEN
      IF :KB_TERM_CODE_EFF = :ZCRGECO_TERM_CODE_FROM OR (
         :KB_TERM_CODE_EFF IS NULL AND
         :ZCRGECO_TERM_CODE_FROM IS NULL ) THEN
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
		 * ZCRGECO.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD, fireInSearch=false)
		public void zcrgeco_NextRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				nextRecord();
				// 
				if ( zcrgecoElement.getZcrgecoSubjCodeCocrse().isNull() )
				{
					if ( getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom()) || (getFormModel().getKeyBlock().getKbTermCodeEff().isNull() && getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom().isNull()) )
					{
					}
					else {
						previousRecord();
						executeAction("INVALID_INSERT");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.KEY-PRVBLK
		    GO_BLOCK( 'SCRSCHD' ) ;
   EXECUTE_QUERY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK, fireInSearch=false)
		public void zcrgeco_PreviousBlock()
		{
			
				goBlock(toStr("SCRSCHD"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.END_GECO_TERM
		 --
   INSERT INTO ZCRGECO
   (
			ZCRGECO_SUBJ_CODE,
			ZCRGECO_CRSE_NUMB,
			ZCRGECO_EFF_TERM,
			ZCRGECO_SUBJ_CODE_COCRSE,
			ZCRGECO_CRSE_NUMB_COCRSE,
			ZCRGECO_TYPE,
			ZCRGECO_ACTIVITY_DATE,
			ZCRGECO_GE_VERSION
   )
   VALUES ( :KB_SUBJ_CODE, :KB_CRSE_NUMB,
      :KB_TERM_CODE_EFF, '', '', '', SYSDATE, :ZCRGECO_GE_VERSION);
   G$_CHECK_VALUE (SQL%NOTFOUND, NULL, TRUE);
--
   :ZCRGECO_TERM_CODE_TO := :KB_TERM_CODE_EFF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.END_GECO_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="END_GECO_TERM", fireInSearch=false)
		public void zcrgeco_EndGecoTerm()
		{
			
				// 

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				int rowCount = 0;
				// 
				String sql1 = "INSERT INTO ZCRGECO " +
	"(ZCRGECO_SUBJ_CODE, ZCRGECO_CRSE_NUMB, ZCRGECO_EFF_TERM, ZCRGECO_SUBJ_CODE_COCRSE, ZCRGECO_CRSE_NUMB_COCRSE, ZCRGECO_TYPE, ZCRGECO_ACTIVITY_DATE, ZCRGECO_GE_VERSION)" +
	"VALUES (:KB_SUBJ_CODE, :KB_CRSE_NUMB, :KB_TERM_CODE_EFF, '', '', '', SYSDATE, :ZCRGECO_GE_VERSION)";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				command1.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				command1.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
				command1.addParameter("ZCRGECO_GE_VERSION", zcrgecoElement.getZcrgecoGeVersion());
				rowCount = command1.execute();
				getTask().getGoqrpls().gCheckValue(rowCount == 0, toStr(null), toBool(NBool.True));
				// 
				getFormModel().getGecoCtrlBlock().setZcrgecoTermCodeTo(getFormModel().getKeyBlock().getKbTermCodeEff());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.FIND_TO_TERM
		    IF SELECT_SCBCRKY_3 (:ZCRGECO_TERM_CODE_TO) THEN
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.FIND_TO_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FIND_TO_TERM", fireInSearch=false)
		public void zcrgeco_FindToTerm()
		{
				Ref<NString> ovar1_ref = new Ref<NString>(getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeTo());
				this.getTask().getServices().selectScbcrky3(ovar1_ref).getValue();
				getFormModel().getGecoCtrlBlock().setZcrgecoTermCodeTo(ovar1_ref.val);
				if (  getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeTo().isNull() )
				{
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.INSERT_TRIG
		    IF :GECO_INSERT = 'Y' THEN
      NULL ;
   ELSIF :GECO_INSERT IS NULL  THEN
      EXECUTE_TRIGGER( 'INVALID_UPDATE' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   INSERT INTO ZCRGECO
   (
			ZCRGECO_SUBJ_CODE,
			ZCRGECO_CRSE_NUMB,
			ZCRGECO_EFF_TERM,
			ZCRGECO_SUBJ_CODE_COCRSE,
			ZCRGECO_CRSE_NUMB_COCRSE,
			ZCRGECO_TYPE,
			ZCRGECO_ACTIVITY_DATE,
			ZCRGECO_GE_VERSION
   )
   SELECT ZCRGECO_SUBJ_CODE, ZCRGECO_CRSE_NUMB,
      :KB_TERM_CODE_EFF, ZCRGECO_SUBJ_CODE_COCRSE,
      ZCRGECO_CRSE_NUMB_COCRSE, ZCRGECO_TYPE, SYSDATE, ZCRGECO_GE_VERSION
   FROM   ZCRGECO
   WHERE  ZCRGECO_SUBJ_CODE = :KB_SUBJ_CODE
     AND  ZCRGECO_CRSE_NUMB = :KB_CRSE_NUMB
     AND  ZCRGECO_EFF_TERM = :ZCRGECO_TERM_CODE_FROM;
G$_CHECK_VALUE (SQL%NOTFOUND, NULL, TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.INSERT_TRIG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INSERT_TRIG", fireInSearch=false)
		public void zcrgeco_InsertTrig()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				int rowCount = 0;
				if ( zcrgecoElement.getGecoInsert().equals("Y") )
				{
				}
				else if ( zcrgecoElement.getGecoInsert().isNull() ) {
					executeAction("INVALID_UPDATE");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				String sql1 = "INSERT INTO ZCRGECO " +
	"(ZCRGECO_SUBJ_CODE, ZCRGECO_CRSE_NUMB, ZCRGECO_EFF_TERM, ZCRGECO_SUBJ_CODE_COCRSE, ZCRGECO_CRSE_NUMB_COCRSE, ZCRGECO_TYPE, ZCRGECO_ACTIVITY_DATE, ZCRGECO_GE_VERSION)" +
	"SELECT ZCRGECO_SUBJ_CODE, ZCRGECO_CRSE_NUMB, :KB_TERM_CODE_EFF, ZCRGECO_SUBJ_CODE_COCRSE, ZCRGECO_CRSE_NUMB_COCRSE, ZCRGECO_TYPE, SYSDATE, ZCRGECO_GE_VERSION " +
	" FROM ZCRGECO " +
	" WHERE ZCRGECO_SUBJ_CODE = :KB_SUBJ_CODE AND ZCRGECO_CRSE_NUMB = :KB_CRSE_NUMB AND ZCRGECO_EFF_TERM = :ZCRGECO_TERM_CODE_FROM ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
				command1.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				command1.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				command1.addParameter("ZCRGECO_TERM_CODE_FROM", getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom());
				rowCount = command1.execute();
				getTask().getGoqrpls().gCheckValue(rowCount == 0, toStr(null), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.UPDATE_TRIG
		 :ZCRGECO_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,'DD-MON-YYYY') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.UPDATE_TRIG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_TRIG", fireInSearch=false)
		public void zcrgeco_UpdateTrig()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				zcrgecoElement.setZcrgecoActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), "DD-MON-YYYY"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_doubleClick()
		{
			
				getTask().getGoqrpls().getGSearch().whenMouseClick();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRGECO_SUBJ_CODE_COCRSE", function=KeyFunction.ITEM_CHANGE)
		public void zcrgecoSubjCodeCocrse_itemChange()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('STVSUBJ_CODE', 'STVSUBJ_DESC', ''); -- SRF 2608
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVSUBJ_CODE"), toStr("STVSUBJ_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.G$_SEARCH_OPTIONS
		 BEGIN
  DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_GSearchOptions()
		{
			
				executeAction(KeyFunction.LIST_VALUES);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.KEY-NEXT-ITEM
		 BEGIN
  G$_SEARCH.CODE_KEY_NEXT_ITEM;
  G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRGECO_SUBJ_CODE_COCRSE", function=KeyFunction.NEXT_ITEM)
		public void zcrgecoSubjCodeCocrse_keyNexItem()
		{
			
				getTask().getGoqrpls().getGSearch().codeKeyNextItem();
				getTask().getGoqrpls().gCheckFailure();
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRGECO_SUBJ_CODE_COCRSE", function=KeyFunction.ITEM_OUT)
		public void zcrgecoSubjCodeCocrse_itemOut()
		{
			
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.WHEN-VALIDATE-ITEM
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO L_UPDATE ;
   END IF ;
   IF (:KB_TERM_CODE_EFF = :ZCRGECO_TERM_CODE_FROM) THEN
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
         SELECT ZCRGECO_SUBJ_CODE_COCRSE
         FROM   ZCRGECO
         WHERE  ROWID = :ZCRGECO.ROWID ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCRGECO_SUBJ_CODE_COCRSE ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO PTI_END_TRIGGER ;
      ELSE
         MESSAGE(
'*ERROR* CANNOT UPDATE UNLESS FROM TERM EQUALS KEY BLOCK TERM.' ) ;
         GOTO PTI_END_TRIGGER ;
      END IF ;
   END ;
   
   IF (:ZCRGECO_SUBJ_CODE_COCRSE IS NOT NULL) THEN
   	  IF (GB_STVSUBJ.F_CODE_EXISTS(:ZCRGECO_SUBJ_CODE_COCRSE) <> 'Y') THEN
        MESSAGE(
           '*ERROR* INVALID CODE; PRESS LIST FOR VALID CODES' ) ;
        RAISE FORM_TRIGGER_FAILURE ;
		  END IF;   	  	
   END IF;

--
   << L_UPDATE >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;

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
		 * ZCRGECO_SUBJ_CODE_COCRSE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")) || (getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom())))
					{
						
					}
					
					else {
						NO_UPDATE:;
						if ((getGlobal("QUERY_MODE").equals("1")))
						{
							 
						}else{
							String sqlptiCursor = "SELECT ZCRGECO_SUBJ_CODE_COCRSE " +
			" FROM ZCRGECO " +
			" WHERE ROWID = :ZCRGECO_ROWID ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("ZCRGECO_ROWID", zcrgecoElement.getROWID());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									zcrgecoElement.setZcrgecoSubjCodeCocrse(ptiCursorResults.getStr(0));
								}
								if ( ptiCursor.notFound() )
								{
									
								}
								else {
									errorMessage("*ERROR* CANNOT UPDATE UNLESS FROM TERM EQUALS KEY BLOCK TERM.");
								}
							}
							finally{
								ptiCursor.close();
							}
							
							if ((zcrgecoElement.getZcrgecoSubjCodeCocrse().isNotNull()))
							{
								if ((GbStvsubj.fCodeExists(zcrgecoElement.getZcrgecoSubjCodeCocrse()).notEquals("Y")))
								{
									errorMessage("*ERROR* INVALID CODE; PRESS LIST FOR VALID CODES");
									throw new ApplicationException();
								}
							}
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

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.KEY-LISTVAL
		 :SYSTEM.MESSAGE_LEVEL := '15';
:GLOBAL.SCBCRKY_SUBJ_CODE := NULL;
:GLOBAL.SCBCRKY_CRSE_NUMB := NULL;

G$_DISPLAY_LOV('ZCRGECO_SUBJ_CODE_COCRSE','STVSUBJ_LOV') ;
IF (:GLOBAL.VALUE IS NULL) THEN
    RETURN;
ELSE
    :ZCRGECO_SUBJ_CODE_COCRSE := :GLOBAL.VALUE;
    :ZCRGECO_CRSE_NUMB_COCRSE := :GLOBAL.SCBCRKY_CRSE_NUMB;
    NEXT_ITEM;
END IF;
:SYSTEM.MESSAGE_LEVEL := '0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ZCRGECO_SUBJ_CODE_COCRSE", function=KeyFunction.LIST_VALUES)
		public void zcrgecoSubjCodeCocrse_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("15"));
				setGlobal("SCBCRKY_SUBJ_CODE", toStr(null));
				setGlobal("SCBCRKY_CRSE_NUMB", toStr(null));
				getTask().getGoqrpls().gDisplayLov(toStr("ZCRGECO_SUBJ_CODE_COCRSE"), toStr("STVSUBJ_LOV"));
				if ((getGlobal("VALUE").isNull()))
				{
					return ;
				}
				else {
					zcrgecoElement.setZcrgecoSubjCodeCocrse(getGlobal("VALUE"));
					zcrgecoElement.setZcrgecoCrseNumbCocrse(getGlobal("SCBCRKY_CRSE_NUMB"));
					nextItem();
				}
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.POST-CHANGE
		 :ZCRGECO_SUBJ_CODE_COCRSE_DESC := 
   GB_STVSUBJ.F_GET_DESCRIPTION(:ZCRGECO_SUBJ_CODE_COCRSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				zcrgecoElement.setZcrgecoSubjCodeCocrseDesc(GbStvsubj.fGetDescription(zcrgecoElement.getZcrgecoSubjCodeCocrse()));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRGECO_SUBJ_CODE_COCRSE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void zcrgecoSubjCodeCocrseDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_CRSE_NUMB_COCRSE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_CRSE_NUMB_COCRSE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRGECO_CRSE_NUMB_COCRSE")
		public void zcrgecoCrseNumbCocrse_doubleClick()
		{
			
				getTask().getGoqrpls().getGSearch().whenMouseClick();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_CRSE_NUMB_COCRSE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_CRSE_NUMB_COCRSE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRGECO_CRSE_NUMB_COCRSE", function=KeyFunction.ITEM_CHANGE)
		public void zcrgecoCrseNumbCocrse_itemChange()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_CRSE_NUMB_COCRSE.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('','','');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_CRSE_NUMB_COCRSE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRGECO_CRSE_NUMB_COCRSE")
		public void zcrgecoCrseNumbCocrse_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr(""), toStr(""), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_CRSE_NUMB_COCRSE.G$_SEARCH_OPTIONS
		 BEGIN
  DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_CRSE_NUMB_COCRSE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRGECO_CRSE_NUMB_COCRSE")
		public void zcrgecoCrseNumbCocrse_GSearchOptions()
		{
			
				executeAction(KeyFunction.LIST_VALUES);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_CRSE_NUMB_COCRSE.KEY-NEXT-ITEM
		 BEGIN
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_CRSE_NUMB_COCRSE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRGECO_CRSE_NUMB_COCRSE", function=KeyFunction.NEXT_ITEM)
		public void zcrgecoCrseNumbCocrse_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_CRSE_NUMB_COCRSE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_CRSE_NUMB_COCRSE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRGECO_CRSE_NUMB_COCRSE", function=KeyFunction.ITEM_OUT)
		public void zcrgecoCrseNumbCocrse_itemOut()
		{
			
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_CRSE_NUMB_COCRSE.WHEN-VALIDATE-ITEM
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO L_UPDATE ;
   END IF ;
   IF (:KB_TERM_CODE_EFF = :ZCRGECO_TERM_CODE_FROM) THEN
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
         SELECT ZCRGECO_CRSE_NUMB_COCRSE
         FROM   ZCRGECO
         WHERE  ROWID = :ZCRGECO.ROWID ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCRGECO_CRSE_NUMB_COCRSE ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO VALIDATE_COURSE ;
      ELSE
         MESSAGE(G$_NLS.Get('ZCACRSE-8002', 'FORM', 
'*ERROR* CANNOT UPDATE UNLESS FROM TERM EQUALS KEY BLOCK TERM.' ) );
         GOTO PTI_END_TRIGGER ;
      END IF ;
   END ;
--
   << L_UPDATE >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_002 ;
   END IF ;
   G$_CHECK_VALUE ((:KB_SUBJ_CODE = :ZCRGECO_SUBJ_CODE_COCRSE
     AND  :KB_CRSE_NUMB = :ZCRGECO_CRSE_NUMB_COCRSE),
G$_NLS.Get('ZCACRSE-8003', 'FORM', 
'*ERROR* A COURSE CANNOT BE A GE CO-REQUISITE TO ITSELF.'),
          TRUE);
--
   << PTI_STEP_002 >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_003 ;
   END IF ;
   IF SELECT_SCRRTST_5 (:KB_SUBJ_CODE,
      :KB_CRSE_NUMB, :KB_SUBJ_CODE,
      :KB_CRSE_NUMB, :ZCRGECO_SUBJ_CODE_COCRSE,
      :ZCRGECO_CRSE_NUMB_COCRSE) THEN
      GOTO PTI_STEP_003 ;
   END IF ;
         MESSAGE(G$_NLS.Get('ZCACRSE-8004', 'FORM', 
'*ERROR* COURSE IS ALREADY A PRE-REQUISITE; IT CANNOT' ||
           ' BE A GE CO-REQUISITE.' )) ;
   RAISE FORM_TRIGGER_FAILURE ;
--
   << PTI_STEP_003 >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   IF SELECT_SCREQIV_3 (:ZCRGECO_SUBJ_CODE_COCRSE,
      :ZCRGECO_CRSE_NUMB_COCRSE) THEN
      GOTO VALIDATE_COURSE ;
   END IF ;
   MESSAGE(
   G$_NLS.Get('ZCACRSE-8005', 'FORM', 
'*ERROR* COURSE ALREADY AN EQUIVALENT; IT CANNOT BE' ||
           ' A GE CO-REQUISITE.' ) );

   RAISE FORM_TRIGGER_FAILURE ;
--
   << VALIDATE_COURSE >>
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCBCRKY
         WHERE  SCBCRKY_SUBJ_CODE = :ZCRGECO_SUBJ_CODE_COCRSE
           AND  SCBCRKY_CRSE_NUMB = :ZCRGECO_CRSE_NUMB_COCRSE ;
      PTI_TEMP CHAR(255);
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, 
   G$_NLS.Get('ZCACRSE-8006', 'FORM', 
'*ERROR* COURSE DOES NOT EXIST.') , TRUE);
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
		 * ZCRGECO_CRSE_NUMB_COCRSE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRGECO_CRSE_NUMB_COCRSE")
		public void zcrgecoCrseNumbCocrse_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")) || (getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getGecoCtrlBlock().getZcrgecoTermCodeFrom())))
					{
						 L_UPDATE:;
						if ((getGlobal("QUERY_MODE").equals("1")))
						{
							 
						}else{
							getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getKbSubjCode().equals(zcrgecoElement.getZcrgecoSubjCodeCocrse()) && getFormModel().getKeyBlock().getKbCrseNumb().equals(zcrgecoElement.getZcrgecoCrseNumbCocrse()))), GNls.Fget(toStr("ZCACRSE-8003"), toStr("FORM"), toStr("*ERROR* A COURSE CANNOT BE A GE CO-REQUISITE TO ITSELF.")), toBool(NBool.True));
						}
						
						 PTI_STEP_002:;
						if ((getGlobal("QUERY_MODE").equals("1")) || (this.getTask().getServices().selectScrrtst5(getFormModel().getKeyBlock().getKbSubjCode(), getFormModel().getKeyBlock().getKbCrseNumb(), getFormModel().getKeyBlock().getKbSubjCode(), getFormModel().getKeyBlock().getKbCrseNumb(), zcrgecoElement.getZcrgecoSubjCodeCocrse(), zcrgecoElement.getZcrgecoCrseNumbCocrse()).getValue() ))
						{
							
						}else{
							errorMessage(GNls.Fget(toStr("ZCACRSE-8004"), toStr("FORM"), toStr("*ERROR* COURSE IS ALREADY A PRE-REQUISITE; IT CANNOT").append(" BE A GE CO-REQUISITE.")));
							throw new ApplicationException();
						}
						if ((getGlobal("QUERY_MODE").equals("1")))
						{
							setGlobal("QUERY_MODE", toStr("0"));
							return;
						}
						if ( this.getTask().getServices().selectScreqiv3(zcrgecoElement.getZcrgecoSubjCodeCocrse(), zcrgecoElement.getZcrgecoCrseNumbCocrse()).getValue() )
						{
							
						}else{
							errorMessage(GNls.Fget(toStr("ZCACRSE-8005"), toStr("FORM"), toStr("*ERROR* COURSE ALREADY AN EQUIVALENT; IT CANNOT BE").append(" A GE CO-REQUISITE.")));
							throw new ApplicationException();
						}
						
					}
					
					else {
						NO_UPDATE:;
						if ((getGlobal("QUERY_MODE").equals("1")))
						{
							setGlobal("QUERY_MODE", toStr("0"));
							return;
						}
						{
							String sqlptiCursor = "SELECT ZCRGECO_CRSE_NUMB_COCRSE " +
		" FROM ZCRGECO " +
		" WHERE ROWID = :ZCRGECO_ROWID ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("ZCRGECO_ROWID", zcrgecoElement.getROWID());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									zcrgecoElement.setZcrgecoCrseNumbCocrse(ptiCursorResults.getStr(0));
								}
								if ( ptiCursor.notFound() )
								{
									 
								}
								else {
									errorMessage(GNls.Fget(toStr("ZCACRSE-8002"), toStr("FORM"), toStr("*ERROR* CANNOT UPDATE UNLESS FROM TERM EQUALS KEY BLOCK TERM.")));
									setGlobal("QUERY_MODE", toStr("0"));
									return;
								}
							}
							finally{
								ptiCursor.close();
							}
						}
					}
					 
					
					 
					
					VALIDATE_COURSE:;
					{
						String sqlptiCursor = "SELECT 'X' " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :ZCRGECO_SUBJ_CODE_COCRSE AND SCBCRKY_CRSE_NUMB = :ZCRGECO_CRSE_NUMB_COCRSE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						NString ptiTemp = NString.getNull();
						try {
							//Setting query parameters
							ptiCursor.addParameter("ZCRGECO_SUBJ_CODE_COCRSE", zcrgecoElement.getZcrgecoSubjCodeCocrse());
							ptiCursor.addParameter("ZCRGECO_CRSE_NUMB_COCRSE", zcrgecoElement.getZcrgecoCrseNumbCocrse());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("ZCACRSE-8006"), toStr("FORM"), toStr("*ERROR* COURSE DOES NOT EXIST.")), toBool(NBool.True));
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

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_GE_VERSION.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_GE_VERSION.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRGECO_GE_VERSION")
		public void zcrgecoGeVersion_doubleClick()
		{
			
				getTask().getGoqrpls().getGSearch().whenMouseClick();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_GE_VERSION.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_GE_VERSION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRGECO_GE_VERSION", function=KeyFunction.ITEM_CHANGE)
		public void zcrgecoGeVersion_itemChange()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_GE_VERSION.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('','','');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_GE_VERSION.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRGECO_GE_VERSION")
		public void zcrgecoGeVersion_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr(""), toStr(""), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_GE_VERSION.G$_SEARCH_OPTIONS
		 BEGIN
  DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_GE_VERSION.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRGECO_GE_VERSION")
		public void zcrgecoGeVersion_GSearchOptions()
		{
			
				executeAction(KeyFunction.LIST_VALUES);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_GE_VERSION.KEY-NEXT-ITEM
		 BEGIN
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_GE_VERSION.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRGECO_GE_VERSION", function=KeyFunction.NEXT_ITEM)
		public void zcrgecoGeVersion_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_GE_VERSION.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_GE_VERSION.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRGECO_GE_VERSION", function=KeyFunction.ITEM_OUT)
		public void zcrgecoGeVersion_itemOut()
		{
			
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_GE_VERSION.WHEN-VALIDATE-ITEM
		 DECLARE
    DUMMY VARCHAR2(1) := NULL;
BEGIN
    IF :ZCRGECO_GE_VERSION IS NOT NULL THEN
        SELECT DISTINCT ZGRGEAR_GE_VERSION
        INTO DUMMY
        FROM ZGRGEAR
        WHERE ZGRGEAR_GE_VERSION = :ZCRGECO_GE_VERSION;
    END IF;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            MESSAGE('INVALID GE VERSION');
            RAISE FORM_TRIGGER_FAILURE;
        WHEN OTHERS THEN
            MESSAGE('UNEXPECTED EXCEPTION OCCURED');
            RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_GE_VERSION.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRGECO_GE_VERSION")
		public void zcrgecoGeVersion_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				int rowCount = 0;
				{
					NString dummy = NString.getNull();
					try
					{
						if ( zcrgecoElement.getZcrgecoGeVersion().isNotNull() )
						{
							String sql1 = "SELECT DISTINCT ZGRGEAR_GE_VERSION " +
	" FROM ZGRGEAR " +
	" WHERE ZGRGEAR_GE_VERSION = :ZCRGECO_GE_VERSION ";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("ZCRGECO_GE_VERSION", zcrgecoElement.getZcrgecoGeVersion());
							ResultSet results1 = command1.executeQuery();
							rowCount = command1.getRowCount();
							if ( results1.hasData() ) {
								dummy = results1.getStr(0);
							}
							results1.close();
						}
					}
					catch(NoDataFoundException e)
					{
						errorMessage("INVALID GE VERSION");
						throw new ApplicationException();
					}
					catch(Exception  e)
					{
						errorMessage("UNEXPECTED EXCEPTION OCCURED");
						throw new ApplicationException();
					}
				}
			}

		
	
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_buttonClick()
		{
			ZcrgecoAdapter zcrgecElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);
			
			setGlobal("VALUE",NString.getNull());
			goItem("ZCRGECO_SUBJ_CODE_COCRSE");
			executeAction("LIST_VALUES");
			/*listValues();
			if(getGlobal("VALUE").isNotNull()){
				zcrgecElement.setZcrgecoSubjCodeCocrse((getGlobal("VALUE")));
				keyNexItem();
			}*/
		}
		
		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRGECO_CRSE_NUMB_COCRSE")
		public void zcrgecoCrseNumbCocrse_buttonClick()
		{
			ZcrgecoAdapter zcrgecElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);
			
			setGlobal("VALUE",NString.getNull());
			goItem("ZCRGECO_CRSE_NUMB_COCRSE");
			listValues();
			if(getGlobal("VALUE").isNotNull()){
				zcrgecElement.setZcrgecoCrseNumbCocrse((getGlobal("VALUE")));
				//keyNexItem();
			}
		}
		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ZCRGECO_GE_VERSION")
		public void zcrgecoGeVersion_buttonClick()
		{
			ZcrgecoAdapter zcrgecElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);
			
			setGlobal("VALUE",NString.getNull());
			goItem("ZCRGECO_GE_VERSION");
			listValues();
			if(getGlobal("VALUE").isNotNull()){
				zcrgecElement.setZcrgecoGeVersion((getGlobal("VALUE")));
				//keyNexItem();
			}
		}
		
}
