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

    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class ZcrdupcController extends DefaultBlockController {


	
	public ZcrdupcController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.ON-CHECK-DELETE-MASTER
		 --
-- Begin default relation declare section
--
DECLARE
  Dummy_Define VARCHAR2(1);
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
						zcrduprCur.open();
						ResultSet zcrduprCurResults = zcrduprCur.fetchInto();
						if ( zcrduprCurResults != null ) {
							dummyDefine = zcrduprCurResults.getStr(0);
						}
						if ((zcrduprCur.found()))
						{
							errorMessage("Cannot delete master record when matching detail records exist.");
							throw new ApplicationException();
						}
						// 
						//  End ZCRDUPR detail program section
						// 
						// 
						//  Begin ZCRDUPS detail program section
						// 
						//Setting query parameters
						zcrdupsCur.addParameter("ZCRDUPC_ZCRDUPC_RULE", zcrdupcElement.getZcrdupcRule());
						zcrdupsCur.open();
						ResultSet zcrdupsCurResults = zcrdupsCur.fetchInto();
						if ( zcrdupsCurResults != null ) {
							dummyDefine = zcrdupsCurResults.getStr(0);
						}
						if ((zcrdupsCur.found()))
						{
							errorMessage("Cannot delete master record when matching detail records exist.");
							throw new ApplicationException();
						}
					}
					finally{
						zcrduprCur.close();
						zcrdupsCur.close();
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

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.KEY-NXTBLK
		 IF (   :ZCRDUPC.ZCRDUPC_TYPE IS NULL
    OR :ZCRDUPC.ZCRDUPC_TYPE = 'ANY')
AND :ZCRDUPC.ZCRDUPC_RULE IS NULL
AND :ZCRDUPC.ZCRDUPC_UNITS IS NULL
AND :SYSTEM.CURSOR_RECORD = 1 THEN
  :SYSTEM.MESSAGE_LEVEL := '5' ;
  GO_BLOCK('SCBCRSE');
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
			

				
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);


				if ( (zcrdupcElement.getZcrdupcType().isNull() || zcrdupcElement.getZcrdupcType().equals("ANY")) && zcrdupcElement.getZcrdupcRule().isNull() && zcrdupcElement.getZcrdupcUnits().isNull() && getCursorRecord().equals(1) )
				{
					try {
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
						goBlock(toStr("SCBCRSE"));
					} finally {
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					}
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

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.PRE-QUERY
		    :ZCRDUPC_TERM_CODE_FROM := :STVTERM_CODE;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(ZCRDUPC_TERM_CODE_EFF)
         FROM   ZCRDUPC
         WHERE  ZCRDUPC_TERM_CODE_EFF > :STVTERM_CODE
           AND  ZCRDUPC_CRSE_NUMB = :SCACRSE_CRSE_NUMB
           AND  ZCRDUPC_SUBJ_CODE = :SCACRSE_SUBJ_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCRDUPC_TERM_CODE_TO ;
   END ;
--

   IF :ZCRDUPC_TERM_CODE_TO = :ZCRDUPC_TERM_CODE_FROM OR 
   		:ZCRDUPC_TERM_CODE_TO IS NULL OR (
      :ZCRDUPC_TERM_CODE_TO IS NULL AND :ZCRDUPC_TERM_CODE_FROM
      IS NULL ) THEN
	    IF (SELECT_SCBCRKY_1( :KEY_BLOCK.SCACRSE_SUBJ_CODE,
	    	                    :KEY_BLOCK.SCACRSE_CRSE_NUMB,
	    	                    :ZCRDUPC_TERM_CODE_TO)) THEN
	    	 RAISE FORM_TRIGGER_FAILURE;
	    END IF;
   END IF ;
   
   IF :ZCRDUPC_TERM_CODE_TO IS NULL THEN
   		:ZCRDUPC_TERM_CODE_TO := :TERM_CODE_END;
   END IF;
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
               
				Ref<NString> termCode = new Ref<NString>(getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo());

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeFrom(getFormModel().getKeyBlock().getStvtermCode());
				{
					String sqlptiCursor = "SELECT MIN(ZCRDUPC_TERM_CODE_EFF) " +
	" FROM ZCRDUPC " +
	" WHERE ZCRDUPC_TERM_CODE_EFF > :STVTERM_CODE AND ZCRDUPC_CRSE_NUMB = :SCACRSE_CRSE_NUMB AND ZCRDUPC_SUBJ_CODE = :SCACRSE_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.addParameter("SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
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
				if ( getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().equals(getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom()) || getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().isNull() || (getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().isNull() && getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeFrom().isNull()) )
				{
					if ((this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue()))
					{
						getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeTo(termCode.val);
						throw new ApplicationException();
					}
				}
						
					getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeTo(termCode.val);
						
				if ( getFormModel().getDupcCtrlBlock().getZcrdupcTermCodeTo().isNull() )
				{
					getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
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


				getFormModel().getDupcCtrlBlock().setZcrdupcTermCodeFrom(zcrdupcElement.getZcrdupcTermCodeEff());
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPC.KEY-PRVBLK
		 	set_canvas_property('ZCADETQ_2_TAB_CANVAS', TOPMOST_TAB_PAGE, 'RESTRICTION'); 
	go_block('SCRRCHR_1');
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
			
				setCanvasTopMostTabPage("ZCADETQ_2_TAB_CANVAS", "RESTRICTION");
				goBlock(toStr("SCRRCHR_1"));
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
			

				
				ZcrdupcAdapter zcrdupcElement = (ZcrdupcAdapter)this.getFormModel().getZcrdupc().getRowAdapter(true);


				if ( zcrdupcElement.getZcrdupcType().equals("DYN") )
				{
					showView("ZCRDUPS_1_CANVAS");
				}
				else {
					hideView("ZCRDUPS_1_CANVAS");
				}
			}

		
	
	
}
