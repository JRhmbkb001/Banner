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

    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;

public class ZcrdupcController extends DefaultBlockController {


	
	public ZcrdupcController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.KEY-DUP-ITEM
		   G$_CHECK_VALUE (NOT (:ZCRDUPC_TERM_CODE_FROM <
      :KB_TERM_CODE_EFF
     AND  :ZCRDUPC_TERM_CODE_TO > :KB_TERM_CODE_EFF),
      '*ERROR* EFFECTIVE TERM MUST BE BETWEEN FROM AND TO TERMS',
         TRUE, TRUE);
--
   :END_RULE := 'Y' ;
--
   set_block_property('zcrdupc',update_allowed,property_true);
   set_block_property('zcrdupc',delete_allowed,property_true);

   :ZCRDUPC_TERM_CODE_EFF := :ZCRDUPC_TERM_CODE_EFF ;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
   COMMIT_FORM ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;
--
   :END_RULE := 'N' ;
--
 set_block_property('zcrdupc',update_allowed,property_true);
 set_block_property('zcrdupc',delete_allowed,property_true);
 SET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM, fireInSearch=false)
		public void zcrdupc_KeyDupItem()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);


				getTask().getGoqrpls().gCheckValue(!(getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().lesser(getFormModel().getKeyBlock().getKbTermCodeEff()) && getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().greater(getFormModel().getKeyBlock().getKbTermCodeEff())), toStr("*ERROR* EFFECTIVE TERM MUST BE BETWEEN FROM AND TO TERMS"), toBool(NBool.True), toBool(NBool.True));
				// 
				zcrdupcElement.setEndRule(toStr("Y"));
				// 
				setBlockUpdateAllowed("zcrdupc", true);
				setBlockDeleteAllowed("zcrdupc", true);
				zcrdupcElement.setZcrdupcTermCodeEff(zcrdupcElement.getZcrdupcTermCodeEff());
				// 
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				try{
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					commitTask();
				}finally{
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					// 
					zcrdupcElement.setEndRule(toStr("N"));
					// 
					setBlockUpdateAllowed("zcrdupc", true);
					setBlockDeleteAllowed("zcrdupc", true);
					setItemEnabled("ZCRDUPC_ENDCOPY_LBT", false);
				}
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.WHEN-NEW-BLOCK-INSTANCE
		         IF :ZCRDUPC_TERM_CODE_FROM <> :KB_TERM_CODE_EFF AND
           :ZCRDUPC_TERM_CODE_TO   <> :KB_TERM_CODE_EFF THEN
           IF GET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT',ENABLED) = 'FALSE' THEN
              SET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT',ENABLED,PROPERTY_ON);
            END IF;
         END IF;


   IF (:KB_TERM_CODE_EFF != :ZCRDUPC_TERM_CODE_FROM) 
     THEN MESSAGE(G$_NLS.Get('ZCACRSE-8006','FORM',
     '*ERROR* Cannot update unless From term equal Key Block term.' ) );
          set_block_property('zcrdupc',update_allowed,property_false);
          set_block_property('zcrdupc',delete_allowed,property_false);
     ELSE 
          set_block_property('zcrdupc',update_allowed,property_true);
          set_block_property('zcrdupc',delete_allowed,property_true);
    END IF ;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void zcrdupc_blockChange()
		{
			
				if ( getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().notEquals(getFormModel().getKeyBlock().getKbTermCodeEff()) && getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().notEquals(getFormModel().getKeyBlock().getKbTermCodeEff()) )
				{
					if ( getItemEnabled("ZCRDUPC_ENDCOPY_LBT").equals("FALSE") )
					{
						setItemEnabled("ZCRDUPC_ENDCOPY_LBT", true);
					}
				}
				if ((getFormModel().getKeyBlock().getKbTermCodeEff().notEquals(getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom())))
				{
					errorMessage(GNls.Fget(toStr("ZCACRSE-8006"), toStr("FORM"), toStr("*ERROR* Cannot update unless From term equal Key Block term.")));
					setBlockUpdateAllowed("zcrdupc", false);
					setBlockDeleteAllowed("zcrdupc", false);
				}
				else {
					setBlockUpdateAllowed("zcrdupc", true);
					setBlockDeleteAllowed("zcrdupc", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.KEY-DUPREC
		    IF :KB_TERM_CODE_EFF = :ZCRDUPC_TERM_CODE_FROM OR (
      :KB_TERM_CODE_EFF IS NULL AND :ZCRDUPC_TERM_CODE_FROM
       IS NULL ) THEN
      EXECUTE_TRIGGER( 'INVALID_DUP' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   :RULE_INSERT := 'Y' ;
--
   set_block_property('zcrdupc',update_allowed,property_true);
   set_block_property('zcrdupc',delete_allowed,property_true);

   :ZCRDUPC_TERM_CODE_EFF := :ZCRDUPC_TERM_CODE_EFF ;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
   COMMIT_FORM ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;
   EXECUTE_QUERY ;
--
   :RULE_INSERT := 'N' ;
--
 set_block_property('zcrdupc',update_allowed,property_true);
 set_block_property('zcrdupc',delete_allowed,property_true);
 SET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD, fireInSearch=false)
		public void zcrdupc_CopyRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);


				if ( getFormModel().getKeyBlock().getKbTermCodeEff().equals(getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom()) || (getFormModel().getKeyBlock().getKbTermCodeEff().isNull() && getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().isNull()) )
				{
					executeAction("INVALID_DUP");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				zcrdupcElement.setRuleInsert(toStr("Y"));
				// 
				setBlockUpdateAllowed("zcrdupc", true);
				setBlockDeleteAllowed("zcrdupc", true);
				zcrdupcElement.setZcrdupcTermCodeEff(zcrdupcElement.getZcrdupcTermCodeEff());
				// 
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				commitTask();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				executeQuery();
				// 
				zcrdupcElement.setRuleInsert(toStr("N"));
				// 
				setBlockUpdateAllowed("zcrdupc", true);
				setBlockDeleteAllowed("zcrdupc", true);
				setItemEnabled("ZCRDUPC_ENDCOPY_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.KEY-PRVBLK
		 GO_BLOCK('ZCRGECO');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void zcrdupc_PreviousBlock()
		{
			
				goBlock(toStr("ZCRGECO"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.KEY-NXTBLK
		 IF (   :ZCRDUPC.ZCRDUPC_TYPE IS NULL
    OR :ZCRDUPC.ZCRDUPC_TYPE = 'ANY')
AND :ZCRDUPC.ZCRDUPC_RULE IS NULL
AND :ZCRDUPC.ZCRDUPC_UNITS IS NULL
AND :SYSTEM.CURSOR_RECORD = 1 THEN
  :SYSTEM.MESSAGE_LEVEL := '5' ;
  GO_BLOCK('ZCBCRSE');
  :SYSTEM.MESSAGE_LEVEL := '0';
ELSE
  IF :ZCRDUPC.ZCRDUPC_TYPE = 'DYN' THEN
    GO_BLOCK('ZCRDUPS');
  ELSE
    GO_BLOCK('ZCRDUPR');
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void zcrdupc_NextBlock()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);


				if ( (zcrdupcElement.getZcrdupcType().isNull() || zcrdupcElement.getZcrdupcType().equals("ANY")) && zcrdupcElement.getZcrdupcRule().isNull() && zcrdupcElement.getZcrdupcUnits().isNull() && getCursorRecord().equals(1) )
				{
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					goBlock(toStr("ZCBCRSE"));
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				}
				else {
					if ( zcrdupcElement.getZcrdupcType().equals("DYN") )
					{
						goBlock(toStr("ZCRDUPS"));
					}
					else {
						goBlock(toStr("ZCRDUPR"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.PRE-UPDATE
		    IF :END_RULE = 'Y' THEN
      EXECUTE_TRIGGER( 'END_RULE_TERM' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      IF :ZCRDUPC_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
         :ZCRDUPC_TERM_CODE_FROM IS NULL AND
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
		 * ZCRDUPC.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void zcrdupc_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)args.getRow();


				if ( zcrdupcElement.getEndRule().equals("Y") )
				{
					executeAction("END_RULE_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					if ( getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
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

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.PRE-INSERT
		    IF :ZCRDUPC_TERM_CODE_FROM = :KB_TERM_CODE_EFF OR (
      :ZCRDUPC_TERM_CODE_FROM IS NULL AND :KB_TERM_CODE_EFF
       IS NULL ) THEN
               :ZCRDUPC_RULE := U_SET_RULE_SEQNO;
        --       SELECT ZCRDUPC_RULE_SEQ.NEXTVAL INTO :ZCRDUPC_RULE
          --           FROM DUAL;
   ELSE
      EXECUTE_TRIGGER( 'INVALID_INSERT' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
:ZCRDUPC_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,'DD-MON-YYYY') ;
--
:ZCRDUPC_TERM_CODE_EFF := :KB_TERM_CODE_EFF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void zcrdupc_BeforeRowInsert(RowAdapterEvent args)
		{
			
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)args.getRow();


				if ( getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().equals(getFormModel().getKeyBlock().getKbTermCodeEff()) || (getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().isNull() && getFormModel().getKeyBlock().getKbTermCodeEff().isNull()) )
				{
					zcrdupcElement.setZcrdupcRule(this.getTask().getServices().uSetRuleSeqno());
				}
				else {
					executeAction("INVALID_INSERT");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				zcrdupcElement.setZcrdupcActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), "DD-MON-YYYY"));
				// 
				zcrdupcElement.setZcrdupcTermCodeEff(getFormModel().getKeyBlock().getKbTermCodeEff());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.POST-QUERY
		 :DUPC_CTRL_BLOCK.ZCRDUPC_TERM_CODE_FROM := :ZCRDUPC_TERM_CODE_EFF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void zcrdupc_AfterQuery(RowAdapterEvent args)
		{
			
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)args.getRow();


				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeFrom(zcrdupcElement.getZcrdupcTermCodeEff());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.PRE-QUERY
		    :ZCRDUPC_TERM_CODE_FROM := :KB_TERM_CODE_EFF ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(ZCRDUPC_TERM_CODE_EFF)
         FROM   ZCRDUPC
         WHERE  ZCRDUPC_TERM_CODE_EFF > :KB_TERM_CODE_EFF
           AND  ZCRDUPC_CRSE_NUMB = :KB_CRSE_NUMB
           AND  ZCRDUPC_SUBJ_CODE = :KB_SUBJ_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCRDUPC_TERM_CODE_TO ;
   END ;
--
   IF :ZCRDUPC_TERM_CODE_TO = :ZCRDUPC_TERM_CODE_FROM OR (
      :ZCRDUPC_TERM_CODE_TO IS NULL AND :ZCRDUPC_TERM_CODE_FROM
      IS NULL ) THEN
      EXECUTE_TRIGGER( 'FIND_TO_TERM' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :ZCRDUPC_TERM_CODE_TO IS NULL  THEN
      EXECUTE_TRIGGER( 'FIND_TO_TERM' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void zcrdupc_BeforeQuery(QueryEvent args)
		{
			
				int rowCount = 0;
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_SUBJ_CODE", this.getFormModel().getKeyBlock().getKbSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_CRSE_NUMB", this.getFormModel().getKeyBlock().getKbCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KB_TERM_CODE_EFF", this.getFormModel().getKeyBlock().getKbTermCodeEff()));             


           
				getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeFrom(getFormModel().getKeyBlock().getKbTermCodeEff());
				{
					String sqlptiCursor = "SELECT MIN(ZCRDUPC_TERM_CODE_EFF) " +
	" FROM ZCRDUPC " +
	" WHERE ZCRDUPC_TERM_CODE_EFF > :KB_TERM_CODE_EFF AND ZCRDUPC_CRSE_NUMB = :KB_CRSE_NUMB AND ZCRDUPC_SUBJ_CODE = :KB_SUBJ_CODE ";
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
							getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().equals(getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom()) || (getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().isNull() && getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().isNull()) )
				{
					executeAction("FIND_TO_TERM");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().isNull() ) {
					try{
						executeAction("FIND_TO_TERM");
						getTask().getGoqrpls().gCheckFailure();
					}catch(Exception e){
						
					}
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.POST-BLOCK
		 SET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT',ENABLED,PROPERTY_OFF);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void zcrdupc_blockOut()
		{
			
				setItemEnabled("ZCRDUPC_ENDCOPY_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.WHEN-NEW-RECORD-INSTANCE
		   IF :SYSTEM.RECORD_STATUS = 'CHANGED'
  or :SYSTEM.RECORD_STATUS = 'QUERY' THEN
    GO_FIELD('ZCRDUPC_UNITS');  
  ELSE
    GO_FIELD('ZCRDUPC_TYPE');
  END IF;

  IF :ZCRDUPC.ZCRDUPC_TYPE = 'DYN' THEN
    IF GET_BLOCK_PROPERTY('ZCRDUPR',STATUS) <> 'NEW' THEN
      GO_BLOCK('ZCRDUPR');
      CLEAR_BLOCK(NO_COMMIT);
      GO_BLOCK('ZCRDUPC');
    END IF;
    SHOW_VIEW('ZCRDUPS_1_CANVAS');
  ELSE
    IF GET_BLOCK_PROPERTY('ZCRDUPS',STATUS) <> 'NEW' THEN
      GO_BLOCK('ZCRDUPS');
      CLEAR_BLOCK(NO_COMMIT);
      GO_BLOCK('ZCRDUPC');
    END IF;
    HIDE_VIEW('ZCRDUPS_1_CANVAS');
  END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void zcrdupc_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);


				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( getRecordStatus().equals("CHANGED") || getRecordStatus().equals("QUERY") )
				{
					goField(toStr("ZCRDUPC_UNITS"));
				}
				else {
					goField(toStr("ZCRDUPC_TYPE"));
				}
				if ( zcrdupcElement.getZcrdupcType().equals("DYN") )
				{
					if ( !getBlockStatus("ZCRDUPR").equals("NEW") )
					{
						goBlock(toStr("ZCRDUPR"));
						clearBlock(TaskServices.NO_COMMIT);
						goBlock(toStr("ZCRDUPC"));
					}
					hideView("ZCRDUPS_2_CANVAS");
					showView("ZCRDUPS_1_CANVAS");
				}
				else {
					if ( !getBlockStatus("ZCRDUPS").equals("NEW") )
					{
						goBlock(toStr("ZCRDUPS"));
						clearBlock(TaskServices.NO_COMMIT);
						goBlock(toStr("ZCRDUPC"));
					}
					hideView("ZCRDUPS_1_CANVAS");
					showView("ZCRDUPS_2_CANVAS");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.INSERT_TRIG
		 DECLARE
      L_RULE number;
      CURSOR DUPC_CURSOR IS
         SELECT *
         FROM   ZCRDUPC
	 WHERE  ZCRDUPC_SUBJ_CODE     = :KB_SUBJ_CODE 
           AND  ZCRDUPC_CRSE_NUMB     = :KB_CRSE_NUMB 
           AND  ZCRDUPC_TERM_CODE_EFF = :ZCRDUPC_TERM_CODE_FROM ;
BEGIN
   IF :RULE_INSERT = 'Y' THEN
      NULL ;
   ELSIF :RULE_INSERT IS NULL  THEN
      EXECUTE_TRIGGER( 'INVALID_UPDATE' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
--
   
   FOR C1 IN DUPC_CURSOR LOOP
 
     L_RULE := U_SET_RULE_SEQNO;
  --   SELECT ZCRDUPC_RULE_SEQ.NEXTVAL INTO L_RULE FROM DUAL;

     INSERT INTO ZCRDUPC
     (
				ZCRDUPC_SUBJ_CODE,
				ZCRDUPC_CRSE_NUMB,
				ZCRDUPC_TERM_CODE_EFF,
				ZCRDUPC_TYPE,
				ZCRDUPC_UNITS,
				ZCRDUPC_RULE,
				ZCRDUPC_ACTIVITY_DATE
     )
     VALUES (
         C1.ZCRDUPC_SUBJ_CODE,
         C1.ZCRDUPC_CRSE_NUMB,
         :KB_TERM_CODE_EFF,
         C1.ZCRDUPC_TYPE,
         C1.ZCRDUPC_UNITS,
         L_RULE,
         SYSDATE );

    INSERT INTO ZCRDUPR
    (
			ZCRDUPR_DUPC_RULE,
			ZCRDUPR_SUBJ_CODE,
			ZCRDUPR_CRSE_NUMB,
			ZCRDUPR_TERM_CODE_START,
			ZCRDUPR_TERM_CODE_END,
			ZCRDUPR_GRDE_CODE_MIN,
			ZCRDUPR_ACTIVITY_DATE
    )
         SELECT L_RULE, ZCRDUPR_SUBJ_CODE, ZCRDUPR_CRSE_NUMB,
                ZCRDUPR_TERM_CODE_START, ZCRDUPR_TERM_CODE_END,
                ZCRDUPR_GRDE_CODE_MIN, SYSDATE
         FROM ZCRDUPR
         WHERE ZCRDUPR_DUPC_RULE = C1.ZCRDUPC_RULE;

 INSERT INTO ZCRDUPS
      (ZCRDUPS_DUPC_RULE, 
       ZCRDUPS_TERM_CODE_START, 
       ZCRDUPS_TERM_CODE_END ,
       ZCRDUPS_FROM_TABLE,
       ZCRDUPS_WHERE_PIDM ,
       ZCRDUPS_WHERE_TERM ,
       ZCRDUPS_WHERE_LEVL ,
       ZCRDUPS_WHERE_STMT,
       ZCRDUPS_DESCRIPTION ,
       ZCRDUPS_ACTIVITY_DATE )  
     SELECT L_RULE, 
            ZCRDUPS_TERM_CODE_START,
            ZCRDUPS_TERM_CODE_END, 
            ZCRDUPS_FROM_TABLE,
            ZCRDUPS_WHERE_PIDM, 
            ZCRDUPS_WHERE_TERM,
            ZCRDUPS_WHERE_LEVL, 
            ZCRDUPS_WHERE_STMT,
            ZCRDUPS_DESCRIPTION,
            SYSDATE
         FROM ZCRDUPS
         WHERE ZCRDUPS_DUPC_RULE = C1.ZCRDUPC_RULE;

 END LOOP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.INSERT_TRIG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INSERT_TRIG", fireInSearch=false)
		public void zcrdupc_InsertTrig()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber lRule = NNumber.getNull();
					String sqldupcCursor = "SELECT * " +
	" FROM ZCRDUPC " +
	" WHERE ZCRDUPC_SUBJ_CODE = :KB_SUBJ_CODE AND ZCRDUPC_CRSE_NUMB = :KB_CRSE_NUMB AND ZCRDUPC_TERM_CODE_EFF = :ZCRDUPC_TERM_CODE_FROM ";
					DataCursor dupcCursor = new DataCursor(sqldupcCursor);
					if ( zcrdupcElement.getRuleInsert().equals("Y") )
					{
					}
					else if ( zcrdupcElement.getRuleInsert().isNull() ) {
						executeAction("INVALID_UPDATE");
						getTask().getGoqrpls().gCheckFailure();
					}
					// 
					// 
					//Setting query parameters
					dupcCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
					dupcCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
					dupcCursor.addParameter("ZCRDUPC_TERM_CODE_FROM", getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom());
					try
					{
						dupcCursor.open();
						while (true)
						{
							TableRow c1 = dupcCursor.fetchRow();
							if ( dupcCursor.notFound() ) break;
							lRule = this.getTask().getServices().uSetRuleSeqno();
							//    SELECT ZCRDUPC_RULE_SEQ.NEXTVAL INTO L_RULE FROM DUAL;
							String sql1 = "INSERT INTO ZCRDUPC " +
	"(ZCRDUPC_SUBJ_CODE, ZCRDUPC_CRSE_NUMB, ZCRDUPC_TERM_CODE_EFF, ZCRDUPC_TYPE, ZCRDUPC_UNITS, ZCRDUPC_RULE, ZCRDUPC_ACTIVITY_DATE)" +
	"VALUES (:P_C1_ZCRDUPC_SUBJ_CODE, :P_C1_ZCRDUPC_CRSE_NUMB, :KB_TERM_CODE_EFF, :P_C1_ZCRDUPC_TYPE, :P_C1_ZCRDUPC_UNITS, :P_L_RULE, SYSDATE)";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("P_C1_ZCRDUPC_SUBJ_CODE", c1.getStr("ZCRDUPC_SUBJ_CODE"));
							command1.addParameter("P_C1_ZCRDUPC_CRSE_NUMB", c1.getStr("ZCRDUPC_CRSE_NUMB"));
							command1.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
							command1.addParameter("P_C1_ZCRDUPC_TYPE", c1.getStr("ZCRDUPC_TYPE"));
							command1.addParameter("P_C1_ZCRDUPC_UNITS", c1.getNumber("ZCRDUPC_UNITS"));
							command1.addParameter("P_L_RULE", lRule);
							rowCount = command1.execute();
							String sql2 = "INSERT INTO ZCRDUPR " +
	"(ZCRDUPR_DUPC_RULE, ZCRDUPR_SUBJ_CODE, ZCRDUPR_CRSE_NUMB, ZCRDUPR_TERM_CODE_START, ZCRDUPR_TERM_CODE_END, ZCRDUPR_GRDE_CODE_MIN, ZCRDUPR_ACTIVITY_DATE)" +
	"SELECT :P_L_RULE, ZCRDUPR_SUBJ_CODE, ZCRDUPR_CRSE_NUMB, ZCRDUPR_TERM_CODE_START, ZCRDUPR_TERM_CODE_END, ZCRDUPR_GRDE_CODE_MIN, SYSDATE " +
	" FROM ZCRDUPR " +
	" WHERE ZCRDUPR_DUPC_RULE = :P_C1_ZCRDUPC_RULE ";
							DataCommand command2 = new DataCommand(sql2);
							//Setting query parameters
							command2.addParameter("P_L_RULE", lRule);
							command2.addParameter("P_C1_ZCRDUPC_RULE", c1.getNumber("ZCRDUPC_RULE"));
							rowCount = command2.execute();
							String sql3 = "INSERT INTO ZCRDUPS " +
	"(ZCRDUPS_DUPC_RULE, ZCRDUPS_TERM_CODE_START, ZCRDUPS_TERM_CODE_END, ZCRDUPS_FROM_TABLE, ZCRDUPS_WHERE_PIDM, ZCRDUPS_WHERE_TERM, ZCRDUPS_WHERE_LEVL, ZCRDUPS_WHERE_STMT, ZCRDUPS_DESCRIPTION, ZCRDUPS_ACTIVITY_DATE)" +
	"SELECT :P_L_RULE, ZCRDUPS_TERM_CODE_START, ZCRDUPS_TERM_CODE_END, ZCRDUPS_FROM_TABLE, ZCRDUPS_WHERE_PIDM, ZCRDUPS_WHERE_TERM, ZCRDUPS_WHERE_LEVL, ZCRDUPS_WHERE_STMT, ZCRDUPS_DESCRIPTION, SYSDATE " +
	" FROM ZCRDUPS " +
	" WHERE ZCRDUPS_DUPC_RULE = :P_C1_ZCRDUPC_RULE ";
							DataCommand command3 = new DataCommand(sql3);
							//Setting query parameters
							command3.addParameter("P_L_RULE", lRule);
							command3.addParameter("P_C1_ZCRDUPC_RULE", c1.getNumber("ZCRDUPC_RULE"));
							rowCount = command3.execute();
						}
					}finally{
						dupcCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.UPDATE_TRIG
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.UPDATE_TRIG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_TRIG", fireInSearch=false)
		public void zcrdupc_UpdateTrig()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.END_RULE_TERM
		 DECLARE
  l_rule number;
--
BEGIN
   SELECT ZCRDUPC_RULE_SEQ.NEXTVAL INTO l_rule FROM DUAL;
   INSERT INTO ZCRDUPC
   (
			ZCRDUPC_SUBJ_CODE,
			ZCRDUPC_CRSE_NUMB,
			ZCRDUPC_TERM_CODE_EFF,
			ZCRDUPC_TYPE,
			ZCRDUPC_UNITS,
			ZCRDUPC_RULE,
			ZCRDUPC_ACTIVITY_DATE
   )
   VALUES ( :KB_SUBJ_CODE, :KB_CRSE_NUMB,
      :KB_TERM_CODE_EFF, NULL, 0, l_rule, SYSDATE ) ;
   G$_CHECK_VALUE (SQL%NOTFOUND, NULL, TRUE);
--
   :ZCRDUPC_TERM_CODE_TO := :KB_TERM_CODE_EFF ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.END_RULE_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="END_RULE_TERM", fireInSearch=false)
		public void zcrdupc_EndRuleTerm()
		{
			
				int rowCount = 0;
				{
					NNumber lRule = NNumber.getNull();
					String sql1 = "SELECT ZCRDUPC_RULE_SEQ.NEXTVAL " +
	" FROM DUAL ";
					DataCommand command1 = new DataCommand(sql1);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						lRule = results1.getNumber(0);
					}
					results1.close();
					String sql2 = "INSERT INTO ZCRDUPC " +
	"(ZCRDUPC_SUBJ_CODE, ZCRDUPC_CRSE_NUMB, ZCRDUPC_TERM_CODE_EFF, ZCRDUPC_TYPE, ZCRDUPC_UNITS, ZCRDUPC_RULE, ZCRDUPC_ACTIVITY_DATE)" +
	"VALUES (:KB_SUBJ_CODE, :KB_CRSE_NUMB, :KB_TERM_CODE_EFF, NULL, 0, :P_L_RULE, SYSDATE)";
					DataCommand command2 = new DataCommand(sql2);
					//Setting query parameters
					command2.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
					command2.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
					command2.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
					command2.addParameter("P_L_RULE", lRule);
					rowCount = command2.execute();
					getTask().getGoqrpls().gCheckValue(rowCount == 0, toStr(null), toBool(NBool.True));
					// 
					getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeTo(getFormModel().getKeyBlock().getKbTermCodeEff());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.PRE-BLOCK
		    IF :ZCRDUPC_TERM_CODE_FROM <> :KB_TERM_CODE_EFF AND
      :ZCRDUPC_TERM_CODE_TO   <> :KB_TERM_CODE_EFF THEN
      IF GET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT',ENABLED) = 'FALSE' THEN
         SET_ITEM_PROPERTY('ZCRDUPC_ENDCOPY_LBT',ENABLED,PROPERTY_ON);
      END IF;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void zcrdupc_blockIn()
		{
			
				if ( getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().notEquals(getFormModel().getKeyBlock().getKbTermCodeEff()) && getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().notEquals(getFormModel().getKeyBlock().getKbTermCodeEff()) )
				{
					if ( getItemEnabled("ZCRDUPC_ENDCOPY_LBT").equals("FALSE") )
					{
						setItemEnabled("ZCRDUPC_ENDCOPY_LBT", true);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.ON-POPULATE-DETAILS
		 --
-- Begin default relation declare section
--
DECLARE
  recstat     VARCHAR2(20) := :System.record_status;   
  startitm    VARCHAR2(61) := :System.cursor_item;   
  rel_id      Relation;
--
-- End default relation declare section
--
--
-- Begin default relation program section
--
BEGIN
  IF ( recstat = 'NEW' or recstat = 'INSERT' ) THEN   
    RETURN;
  END IF;
  --
  -- Begin ZCRDUPR detail program section
  --
  IF ( (:ZCRDUPC.ZCRDUPC_RULE is not null) ) THEN   
    rel_id := Find_Relation('ZCRDUPC.ZCRDUPC_ZCRDUPR');   
    Query_Master_Details(rel_id, 'ZCRDUPR');   
  END IF;
  --
  -- End ZCRDUPR detail program section
  --
  --
  -- Begin ZCRDUPS detail program section
  --
  IF ( (:ZCRDUPC.ZCRDUPC_RULE is not null) ) THEN   
    rel_id := Find_Relation('ZCRDUPC.ZCRDUPC_ZCRDUPS');   
    Query_Master_Details(rel_id, 'ZCRDUPS');   
  END IF;
  --
  -- End ZCRDUPS detail program section
  --

  IF ( :System.cursor_item <> startitm ) THEN     
     Go_Item(startitm);     
     Check_Package_Failure;     
  END IF;
END;
--
-- End default relation program section
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.ON-POPULATE-DETAILS
		 *
		 *
		 *</p>
		 * @param args
		*/

		//@PopulateDetails
		public void zcrdupc_PopulateDetails(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation declare section
				// 
				 //F2J_MASTER_DETAIL_LOGIC : This Trigger was commented out because it contains Master-Detail logic. See documentation for details.

//				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)args.getRow();
//
//
//				{
//					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
//					NString recstat = getRecordStatus();
//					NString startitm = getCursorItem();
//					org.jdesktop.databuffer.DataRelation relId = null;
//					if ((recstat.equals("NEW") || recstat.equals("INSERT")))
//					{
//						return ;
//					}
//					// 
//					//  Begin ZCRDUPR detail program section
//					// 
//					if ((((zcrdupcElement.getZcrdupcRule().isNotNull()))))
//					{
//						// F2J_NOT_SUPPORTED : Call to built-in "FIND_RELATION" was removed because it is not supported. See documentation for details.
//						//						relId = SupportClasses.FORMS40.FindRelation("ZCRDUPC.ZCRDUPC_ZCRDUPR");
//						////
//						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_RELATION' was removed because it is not supported. See documentation for details.");
//						
//						this.getTask().getServices().queryMasterDetails(relId, toStr("ZCRDUPR"));
//					}
//					// 
//					//  End ZCRDUPR detail program section
//					// 
//					// 
//					//  Begin ZCRDUPS detail program section
//					// 
//					if ((((zcrdupcElement.getZcrdupcRule().isNotNull()))))
//					{
//						// F2J_NOT_SUPPORTED : Call to built-in "FIND_RELATION" was removed because it is not supported. See documentation for details.
//						//						relId = SupportClasses.FORMS40.FindRelation("ZCRDUPC.ZCRDUPC_ZCRDUPS");
//						////
//						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_RELATION' was removed because it is not supported. See documentation for details.");
//						
//						this.getTask().getServices().queryMasterDetails(relId, toStr("ZCRDUPS"));
//					}
//					// 
//					//  End ZCRDUPS detail program section
//					// 
//					if ((getCursorItem().notEquals(startitm)))
//					{
//						goItem(startitm);
//						this.getTask().getServices().checkPackageFailure();
//					}
//				}
//

			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.ON-CHECK-DELETE-MASTER
		 --
-- Begin default relation declare section
--
DECLARE
  Dummy_Define CHAR(1);
  --
  -- Begin ZCRDUPR detail declare section
  --
  CURSOR ZCRDUPR_cur IS      
    SELECT 1 FROM ZCRDUPR Z     
    WHERE Z.ZCRDUPR_DUPC_RULE = :ZCRDUPC.ZCRDUPC_RULE;
  --
  -- End ZCRDUPR detail declare section
  --
  --
  -- Begin ZCRDUPS detail declare section
  --
  CURSOR ZCRDUPS_cur IS      
    SELECT 1 FROM ZCRDUPS Z     
    WHERE Z.ZCRDUPS_DUPC_RULE = :ZCRDUPC.ZCRDUPC_RULE;
  --
  -- End ZCRDUPS detail declare section
  --
--
-- End default relation declare section
--
--
-- Begin default relation program section
--
BEGIN
  --
  -- Begin ZCRDUPR detail program section
  --
  OPEN ZCRDUPR_cur;     
  FETCH ZCRDUPR_cur INTO Dummy_Define;     
  IF ( ZCRDUPR_cur%found ) THEN     
    Message('Cannot delete master record when matching detail records exist.');     
    CLOSE ZCRDUPR_cur;     
    RAISE Form_Trigger_Failure;     
  END IF;
  CLOSE ZCRDUPR_cur;
  --
  -- End ZCRDUPR detail program section
  --
  --
  -- Begin ZCRDUPS detail program section
  --
  OPEN ZCRDUPS_cur;     
  FETCH ZCRDUPS_cur INTO Dummy_Define;     
  IF ( ZCRDUPS_cur%found ) THEN     
    Message('Cannot delete master record when matching detail records exist.');     
    CLOSE ZCRDUPS_cur;     
    RAISE Form_Trigger_Failure;     
  END IF;
  CLOSE ZCRDUPS_cur;
  --
  -- End ZCRDUPS detail program section
  --
END;
--
-- End default relation program section
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.ON-CHECK-DELETE-MASTER
		 *
		 *
		 *</p>
		 * @param args
		*/

		@DeleteDetails
		public void zcrdupc_DeleteDetails(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation declare section
				// 
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)args.getRow();


				int rowCount = 0;
				{
					NString dummyDefine = NString.getNull();
					String sqlzcrduprCur = "SELECT 1 " +
	" FROM ZCRDUPR Z " +
	" WHERE Z.ZCRDUPR_DUPC_RULE = :ZCRDUPC_ZCRDUPC_RULE ";
					DataCursor zcrduprCur = new DataCursor(sqlzcrduprCur);
					String sqlzcrdupsCur = "SELECT 1 " +
	" FROM ZCRDUPS Z " +
	" WHERE Z.ZCRDUPS_DUPC_RULE = :ZCRDUPC_ZCRDUPC_RULE ";
					DataCursor zcrdupsCur = new DataCursor(sqlzcrdupsCur);
					try {
						// 
						//  Begin ZCRDUPR detail program section
						// 
						//Setting query parameters
						zcrduprCur.addParameter("ZCRDUPC_ZCRDUPC_RULE", zcrdupcElement.getZcrdupcRule());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable zcrduprCur.
						zcrduprCur.open();
						ResultSet zcrduprCurResults = zcrduprCur.fetchInto();
						if ( zcrduprCurResults != null ) {
							dummyDefine = zcrduprCurResults.getStr(0);
						}
						if ((zcrduprCur.found()))
						{
							errorMessage("Cannot delete master record when matching detail records exist.");
							zcrduprCur.close();
							throw new ApplicationException();
						}
						zcrduprCur.close();
						// 
						//  End ZCRDUPR detail program section
						// 
						// 
						//  Begin ZCRDUPS detail program section
						// 
						//Setting query parameters
						zcrdupsCur.addParameter("ZCRDUPC_ZCRDUPC_RULE", zcrdupcElement.getZcrdupcRule());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable zcrdupsCur.
						zcrdupsCur.open();
						ResultSet zcrdupsCurResults = zcrdupsCur.fetchInto();
						if ( zcrdupsCurResults != null ) {
							dummyDefine = zcrdupsCurResults.getStr(0);
						}
						if ((zcrdupsCur.found()))
						{
							errorMessage("Cannot delete master record when matching detail records exist.");
							zcrdupsCur.close();
							throw new ApplicationException();
						}
						zcrdupsCur.close();
					}
					finally{
						zcrduprCur.close();
						zcrdupsCur.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.FIND_TO_TERM
		    IF SELECT_SCBCRKY_3 (:ZCRDUPC_TERM_CODE_TO) THEN
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC.FIND_TO_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FIND_TO_TERM")
		public void zcrdupc_FindToTerm()
		{
			Ref<NString> ovar1_ref = new Ref<NString>(getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo());
			this.getTask().getServices().selectScbcrky3(ovar1_ref).getValue();
			getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeTo(ovar1_ref.val);
			if (  getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().isNull() )
			{
				throw new ApplicationException();
			}
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC_TYPE.WHEN-LIST-CHANGED
		 IF :ZCRDUPC.ZCRDUPC_TYPE = 'DYN' THEN
    SHOW_VIEW('ZCRDUPS_1_CANVAS');
  ELSE
    HIDE_VIEW('ZCRDUPS_1_CANVAS');
  END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPC_TYPE.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="ZCRDUPC_TYPE")
		public void zcrdupcType_listChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);

				
				if ( zcrdupcElement.getZcrdupcType().equals("DYN") )
				{
					showView("ZCRDUPS_1_CANVAS");
					hideView("ZCRDUPS_2_CANVAS");
				}
				else {
					showView("ZCRDUPS_2_CANVAS");
					hideView("ZCRDUPS_1_CANVAS");
				}
			}

		
	
	
}
