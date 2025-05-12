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
		
public class RmajCtrlBlockController extends DefaultBlockController {


	
	public RmajCtrlBlockController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.KEY-EXEQRY
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RMAJ_CTRL_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void rmajCtrlBlock_ExecuteQuery()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.KEY-ENTQRY
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RMAJ_CTRL_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void rmajCtrlBlock_Search()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}
		
		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void rmajCtrlBlock_recordChange()
		{
			RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)this.getFormModel().getRmajCtrlBlock().getRowAdapter(true);
			ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
			
			if (getRecordStatus().equals("NEW") || getRecordStatus().equals("INSERT"))
			{
				rmajCtrlBlockElement.setScrrmajEffTerm1(scbcrseElement.getScbcrseEffTerm());
				executeAction("FETCH_TO_TERM");
			}
		
		}

		
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.KEY-NXTREC
		   
IF NVL(:fos_all,'N')!='Y' THEN
	  IF :scrrmaj.scrrmaj_majr_code IS NULL AND :rmaj_ctrl_block.scrrmaj_lfst_code IS NOT NULL THEN
	  		NEXT_BLOCK;	  			  		
	  ELSE
	  		IF :rmaj_ctrl_block.scrrmaj_lfst_code IS NOT NULL THEN	  		
	  		  NEXT_RECORD;
	  		END IF;
	  END IF;		
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RMAJ_CTRL_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD, fireInSearch=false)
		public void rmajCtrlBlock_NextRecord()
		{
			

				
				ScrrmajAdapter scrrmajElement = (ScrrmajAdapter)this.getFormModel().getScrrmaj().getRowAdapter(true);
				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)this.getFormModel().getRmajCtrlBlock().getRowAdapter(true);


				if ( isNull(rmajCtrlBlockElement.getFosAll(), "N").notEquals("Y") )
				{
					if ( scrrmajElement.getScrrmajMajrCode().isNull() && rmajCtrlBlockElement.getScrrmajLfstCode().isNotNull() )
					{
						nextBlock();
					}
					else {
						if ( rmajCtrlBlockElement.getScrrmajLfstCode().isNotNull() )
						{
							nextRecord();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.KEY-PRVREC
		 
IF (NVL(:FOS_ALL,'N')='N') AND (:SCRRMAJ_LFST_CODE IS NULL) THEN
	 CLEAR_RECORD;
ELSE  
	 IF :SCRRMAJ.SCRRMAJ_MAJR_CODE IS NULL THEN
	 		NEXT_BLOCK;	  			  		
	 ELSE
	  	PREVIOUS_RECORD;
	 END IF;		  
END IF;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RMAJ_CTRL_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD, fireInSearch=false)
		public void rmajCtrlBlock_PreviousRecord()
		{
			

				
				ScrrmajAdapter scrrmajElement = (ScrrmajAdapter)this.getFormModel().getScrrmaj().getRowAdapter(true);
				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)this.getFormModel().getRmajCtrlBlock().getRowAdapter(true);


				if ( (isNull(rmajCtrlBlockElement.getFosAll(), "N").equals("N")) && (rmajCtrlBlockElement.getScrrmajLfstCode().isNull()) )
				{
					clearRecord();
				}
				else {
					if ( scrrmajElement.getScrrmajMajrCode().isNull() )
					{
						nextBlock();
					}
					else {
						previousRecord();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.PRE-QUERY
		 :RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM := :SCBCRSE.SCBCRSE_EFF_TERM ;
:parameter.p_fos_from_term:=:RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRRMAJ_EFF_TERM)
         FROM   SCRRMAJ
         WHERE  SCRRMAJ_EFF_TERM > :KEY_BLOCK.STVTERM_CODE
           AND  SCRRMAJ_CRSE_NUMB = :SCACRSE_CRSE_NUMB
           AND  SCRRMAJ_SUBJ_CODE = :SCACRSE_SUBJ_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRRMAJ_TERM_CODE_TO ;
   END ;
   
   :parameter.p_fos_to_term:=:SCRRMAJ_TERM_CODE_TO;
--
   IF G$_NCHK(NOT (:SCRRMAJ_TERM_CODE_TO = :RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM
      OR  :SCRRMAJ_TERM_CODE_TO IS NULL)) THEN
      RETURN ;
   END IF ;
--
   << NXTSTEP >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :SCRRMAJ_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;		      
   
   << PTI_STEP_001 >>
   IF (:SCRRMAJ_TERM_CODE_TO IS NULL) THEN
      :SCRRMAJ_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
   
   :parameter.p_fos_to_term:=:SCRRMAJ_TERM_CODE_TO;
   
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RMAJ_CTRL_BLOCK.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void rmajCtrlBlock_BeforeQuery(QueryEvent args)
		{
				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)this.getFormModel().getRmajCtrlBlock().getRowAdapter(true);
				Ref<NString> termCode = new Ref<NString>(rmajCtrlBlockElement.getScrrmajTermCodeTo());
				
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				rmajCtrlBlockElement.setScrrmajEffTerm1(scbcrseElement.getScbcrseEffTerm());
				this.getFormModel().setParam("P_FOS_FROM_TERM",rmajCtrlBlockElement.getScrrmajEffTerm1());
				{
					String sqlptiCursor = "SELECT MIN(SCRRMAJ_EFF_TERM) " +
	" FROM SCRRMAJ " +
	" WHERE SCRRMAJ_EFF_TERM > :KEY_BLOCK_STVTERM_CODE AND SCRRMAJ_CRSE_NUMB = :SCACRSE_CRSE_NUMB AND SCRRMAJ_SUBJ_CODE = :SCACRSE_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.addParameter("SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							rmajCtrlBlockElement.setScrrmajTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				this.getFormModel().setParam("P_FOS_TO_TERM",rmajCtrlBlockElement.getScrrmajTermCodeTo());
				// 
				if ( getTask().getGoqrpls().gNchk(!(rmajCtrlBlockElement.getScrrmajTermCodeTo().equals(rmajCtrlBlockElement.getScrrmajEffTerm1()) || rmajCtrlBlockElement.getScrrmajTermCodeTo().isNull())).getValue() )
				{
					return ;
				}
				 NXTSTEP:;
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode ).getValue() )
				{
					rmajCtrlBlockElement.setScrrmajTermCodeTo(termCode.val);
					if ((rmajCtrlBlockElement.getScrrmajTermCodeTo().isNull()) || (rmajCtrlBlockElement.getScrrmajTermCodeTo().isEmpty()))
					{
						rmajCtrlBlockElement.setScrrmajTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
					}
				}
				rmajCtrlBlockElement.setScrrmajTermCodeTo(termCode.val);	
				
				this.getFormModel().setParam("P_FOS_TO_TERM",rmajCtrlBlockElement.getScrrmajTermCodeTo());
			}

		
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.POST-QUERY
		 :SCRRMAJ_MAJOR_IND:=:SCRRMAJ_MAJOR_IND_1;

  IF :scrrmaj_lfst_code IS NULL THEN
     DECLARE
       CURSOR cur_rec IS SELECT 'X'
                         FROM   scrrmaj
                         WHERE  scrrmaj_subj_code = :key_block.scacrse_subj_code 
        								    AND scrrmaj_crse_numb = :key_block.scacrse_crse_numb        								    
        								    AND scrrmaj_majr_code IS NOT NULL
        								    AND  scrrmaj_rec_type='2'
        								    AND scrrmaj_eff_term = (
               																			 select max(scrrmaj_eff_term) 
																					           from scrrmaj 
																					           where scrrmaj_eff_term <= :KEY_BLOCK.STVTERM_CODE 
																						         and scrrmaj_subj_code = :key_block.scacrse_subj_code 
																						         and scrrmaj_crse_numb = :key_block.scacrse_crse_numb
                       															);
     tmp_value			VARCHAR2(10);
     BEGIN
   	   OPEN cur_rec;
   	   FETCH cur_rec INTO tmp_value;
   	   CLOSE cur_rec;
   	   IF tmp_value IS NULL THEN
   	     :fos_all						 :='N';    
   	   ELSE
   	   	 :fos_all						 :='Y';    
   	   	 :RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM := NVL(:RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM_1,
   	   	                                               :SCBCRSE.SCBCRSE_EFF_TERM);				 
   	   END IF;
   	 EXCEPTION
   	    WHEN OTHERS THEN
          NULL;  	
   	 END;    
   ELSE
     :RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM := NVL(:RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM_1, 
                                               :SCBCRSE.SCBCRSE_EFF_TERM);		 
   END IF;

:rec_type:='2'; 

EXECUTE_TRIGGER('FETCH_TO_TERM');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RMAJ_CTRL_BLOCK.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void rmajCtrlBlock_AfterQuery(RowAdapterEvent args)
		{
			
				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)args.getRow();
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				int rowCount = 0;
				rmajCtrlBlockElement.setScrrmajMajorInd1(rmajCtrlBlockElement.getScrrmajMajorInd());
				if ( rmajCtrlBlockElement.getScrrmajLfstCode().isNull() )
				{
					{
						String sqlcurRec = "SELECT 'X' " +
	" FROM scrrmaj " +
	" WHERE scrrmaj_subj_code = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND scrrmaj_crse_numb = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND scrrmaj_majr_code IS NOT NULL AND scrrmaj_rec_type = '2' AND scrrmaj_eff_term = (SELECT max(scrrmaj_eff_term) " +
		" FROM scrrmaj " +
		" WHERE scrrmaj_eff_term <= :KEY_BLOCK_STVTERM_CODE AND scrrmaj_subj_code = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND scrrmaj_crse_numb = :KEY_BLOCK_SCACRSE_CRSE_NUMB ) ";
						DataCursor curRec = new DataCursor(sqlcurRec);
						NString tmpValue = NString.getNull();
						try {
							try
							{
								//Setting query parameters
								curRec.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
								curRec.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
								curRec.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
								curRec.open();
								ResultSet curRecResults = curRec.fetchInto();
								if ( curRecResults != null ) {
									tmpValue = curRecResults.getStr(0);
								}
								if ( tmpValue.isNull() )
								{
									rmajCtrlBlockElement.setFosAll(toStr("N"));
								}
								else {
									rmajCtrlBlockElement.setFosAll(toStr("Y"));
									rmajCtrlBlockElement.setScrrmajEffTerm1(isNull(rmajCtrlBlockElement.getScrrmajEffTerm(), scbcrseElement.getScbcrseEffTerm()));
								}
							}
							catch(Exception  e)
							{
							}
						}
						finally{
							curRec.close();
						}
					}
				}
				else {
					rmajCtrlBlockElement.setScrrmajEffTerm1(isNull(rmajCtrlBlockElement.getScrrmajEffTerm(), scbcrseElement.getScbcrseEffTerm()));
				}
				rmajCtrlBlockElement.setRecType(toStr("2"));
				executeAction("FETCH_TO_TERM");
			}

		
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.ON-POPULATE-DETAILS
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
    :RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM := :SCBCRSE.SCBCRSE_EFF_TERM;				 
    EXECUTE_TRIGGER('FETCH_TO_TERM');
    RETURN;
  END IF; 
  --
  -- Begin SCRRMAJ detail program section
  --
  IF ( (:RMAJ_CTRL_BLOCK.SCRRMAJ_SUBJ_CODE_1 is not null) or (:RMAJ_CTRL_BLOCK.SCRRMAJ_CRSE_NUMB_1 is not null) or (:RMAJ_CTRL_BLOCK.REC_TYPE is not null) or (:RMAJ_CTRL_BLOCK.SCRRMAJ_LFST_CODE is not null) ) THEN   
    rel_id := Find_Relation('RMAJ_CTRL_BLOCK.RMAJ_CTRL_BLOCK_SCRRMAJ');   
    Query_Master_Details(rel_id, 'SCRRMAJ');   
  END IF;
  --
  -- End SCRRMAJ detail program section
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
		 * RMAJ_CTRL_BLOCK.ON-POPULATE-DETAILS
		 *
		 *
		 *</p>
		 * @param args
		*/

		//@PopulateDetails
		public void rmajCtrlBlock_PopulateDetails(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation declare section
				// 
				 //F2J_MASTER_DETAIL_LOGIC : This Trigger was commented out because it contains Master-Detail logic. See documentation for details.

//				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)args.getRow();
//				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
//
//
//				{
//					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
//					NString recstat = getRecordStatus();
//					NString startitm = getCursorItem();
//					org.jdesktop.databuffer.DataRelation relId = null;
//					if ((recstat.equals("NEW") || recstat.equals("INSERT")))
//					{
//						rmajCtrlBlockElement.setScrrmajEffTerm(scbcrseElement.getScbcrseEffTerm());
//						executeAction("FETCH_TO_TERM");
//						return ;
//					}
//					// 
//					//  Begin SCRRMAJ detail program section
//					// 
//					if (((rmajCtrlBlockElement.getScrrmajSubjCode1().isNotNull()) || (rmajCtrlBlockElement.getScrrmajCrseNumb1().isNotNull()) || (rmajCtrlBlockElement.getRecType().isNotNull()) || (rmajCtrlBlockElement.getScrrmajLfstCode().isNotNull())))
//					{
//						// F2J_NOT_SUPPORTED : Call to built-in "FIND_RELATION" was removed because it is not supported. See documentation for details.
//						//						relId = SupportClasses.FORMS40.FindRelation("RMAJ_CTRL_BLOCK.RMAJ_CTRL_BLOCK_SCRRMAJ");
//						////
//						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_RELATION' was removed because it is not supported. See documentation for details.");
//						
//						this.getTask().getServices().queryMasterDetails(relId, toStr("SCRRMAJ"));
//					}
//					// 
//					//  End SCRRMAJ detail program section
//					// 
//					if ((getCursorItem().notEquals(startitm)))
//					{
//						goItem(startitm);
//						this.getTask().getServices().checkPackageFailure();
//					}
//				}
//

			}

		
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.ON-CHECK-DELETE-MASTER
		 --
-- Begin default relation declare section
--
DECLARE
  Dummy_Define CHAR(1);
  --
  -- Begin SCRRMAJ detail declare section
  --
  CURSOR SCRRMAJ_cur IS      
    SELECT 1 FROM SCRRMAJ S     
    WHERE S.SCRRMAJ_SUBJ_CODE = :RMAJ_CTRL_BLOCK.SCRRMAJ_SUBJ_CODE_1 and S.SCRRMAJ_CRSE_NUMB = :RMAJ_CTRL_BLOCK.SCRRMAJ_CRSE_NUMB_1 and S.SCRRMAJ_REC_TYPE = :RMAJ_CTRL_BLOCK.REC_TYPE and S.scrrmaj_lfst_code = :RMAJ_CTRL_BLOCK.SCRRMAJ_LFST_CODE;
  --
  -- End SCRRMAJ detail declare section
  --
--
-- End default relation declare section
--
--
-- Begin default relation program section
--
BEGIN
  --
  -- Begin SCRRMAJ detail program section
  --
  OPEN SCRRMAJ_cur;     
  FETCH SCRRMAJ_cur INTO Dummy_Define;     
  IF ( SCRRMAJ_cur%found ) THEN     
    Message(
            G$_NLS.Get('SCARRES-0026', 'FORM','*ERROR* Cannot delete master record when matching detail records exist.') 
           );
    CLOSE SCRRMAJ_cur;     
    RAISE Form_Trigger_Failure;     
  END IF;
  CLOSE SCRRMAJ_cur;
  --
  -- End SCRRMAJ detail program section
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
		 * RMAJ_CTRL_BLOCK.ON-CHECK-DELETE-MASTER
		 *
		 *
		 *</p>
		 * @param args
		*/

		@DeleteDetails
		public void rmajCtrlBlock_DeleteDetails(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation declare section
				// 
				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)args.getRow();


				int rowCount = 0;
				{
					NString dummyDefine = NString.getNull();
					String sqlscrrmajCur = "SELECT 1 " +
	" FROM SCRRMAJ S " +
	" WHERE S.SCRRMAJ_SUBJ_CODE = :RMAJ_CTRL_BLOCK_SCRRMAJ_SUBJ_CODE_1 AND S.SCRRMAJ_CRSE_NUMB = :RMAJ_CTRL_BLOCK_SCRRMAJ_CRSE_NUMB_1 AND S.SCRRMAJ_REC_TYPE = :RMAJ_CTRL_BLOCK_REC_TYPE AND S.scrrmaj_lfst_code = :RMAJ_CTRL_BLOCK_SCRRMAJ_LFST_CODE ";
					DataCursor scrrmajCur = new DataCursor(sqlscrrmajCur);
					try {
						// 
						//  Begin SCRRMAJ detail program section
						// 
						//Setting query parameters
						scrrmajCur.addParameter("RMAJ_CTRL_BLOCK_SCRRMAJ_SUBJ_CODE_1", rmajCtrlBlockElement.getScrrmajSubjCode());
						scrrmajCur.addParameter("RMAJ_CTRL_BLOCK_SCRRMAJ_CRSE_NUMB_1", rmajCtrlBlockElement.getScrrmajCrseNumb());
						scrrmajCur.addParameter("RMAJ_CTRL_BLOCK_REC_TYPE", rmajCtrlBlockElement.getRecType());
						scrrmajCur.addParameter("RMAJ_CTRL_BLOCK_SCRRMAJ_LFST_CODE", rmajCtrlBlockElement.getScrrmajLfstCode());
						scrrmajCur.open();
						ResultSet scrrmajCurResults = scrrmajCur.fetchInto();
						if ( scrrmajCurResults != null ) {
							dummyDefine = scrrmajCurResults.getStr(0);
						}
						if ((scrrmajCur.found()))
						{
							errorMessage(GNls.Fget(toStr("SCARRES-0026"), toStr("FORM"), toStr("*ERROR* Cannot delete master record when matching detail records exist.")));
							throw new ApplicationException();
						}
					}
					finally{
						scrrmajCur.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER RMAJ_CTRL_BLOCK.FETCH_TO_TERM
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRRMAJ_EFF_TERM)
         FROM   SCRRMAJ
         WHERE  SCRRMAJ_EFF_TERM > :KEY_BLOCK.STVTERM_CODE
           AND  SCRRMAJ_CRSE_NUMB = :SCACRSE_CRSE_NUMB
           AND  SCRRMAJ_SUBJ_CODE = :SCACRSE_SUBJ_CODE 
           AND  ((:RMAJ_CTRL_BLOCK.SCRRMAJ_LFST_CODE IS NOT NULL
           AND    SCRRMAJ_LFST_CODE=:RMAJ_CTRL_BLOCK.SCRRMAJ_LFST_CODE)
           OR    (:RMAJ_CTRL_BLOCK.SCRRMAJ_LFST_CODE IS NULL AND SCRRMAJ_LFST_CODE IS NULL));
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRRMAJ_TERM_CODE_TO ;
   END ;
   
--
   IF G$_NCHK(NOT (:SCRRMAJ_TERM_CODE_TO = :RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM
      OR  :SCRRMAJ_TERM_CODE_TO IS NULL)) THEN
      RETURN;
   END IF;
		--
		   << NXTSTEP >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :SCRRMAJ_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;		   
		--
		   << PTI_STEP_001 >>
		   IF (:SCRRMAJ_TERM_CODE_TO IS NULL) THEN
		      :SCRRMAJ_TERM_CODE_TO := :TERM_CODE_END ;
		   END IF ;   
   
   

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RMAJ_CTRL_BLOCK.FETCH_TO_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FETCH_TO_TERM")
		public void rmajCtrlBlock_FetchToTerm()
		{
			

				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)this.getFormModel().getRmajCtrlBlock().getRowAdapter(true);
				Ref<NString> termCode = new Ref<NString>(rmajCtrlBlockElement.getScrrmajTermCodeTo());
				

				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT MIN(SCRRMAJ_EFF_TERM) " +
	" FROM SCRRMAJ " +
	" WHERE SCRRMAJ_EFF_TERM > :KEY_BLOCK_STVTERM_CODE AND SCRRMAJ_CRSE_NUMB = :SCACRSE_CRSE_NUMB AND SCRRMAJ_SUBJ_CODE = :SCACRSE_SUBJ_CODE AND ((:RMAJ_CTRL_BLOCK_SCRRMAJ_LFST_CODE IS NOT NULL AND SCRRMAJ_LFST_CODE = :RMAJ_CTRL_BLOCK_SCRRMAJ_LFST_CODE) OR (:RMAJ_CTRL_BLOCK_SCRRMAJ_LFST_CODE IS NULL AND SCRRMAJ_LFST_CODE IS NULL)) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.addParameter("SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("RMAJ_CTRL_BLOCK_SCRRMAJ_LFST_CODE", rmajCtrlBlockElement.getScrrmajLfstCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							rmajCtrlBlockElement.setScrrmajTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( getTask().getGoqrpls().gNchk((rmajCtrlBlockElement.getScrrmajTermCodeTo().equalsN(rmajCtrlBlockElement.getScrrmajEffTerm1()).not() || rmajCtrlBlockElement.getScrrmajTermCodeTo().isNull())).not() )
					return ;
				
				 
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					rmajCtrlBlockElement.setScrrmajTermCodeTo(termCode.val);
					if ((rmajCtrlBlockElement.getScrrmajTermCodeTo().isNull()))
					{
						rmajCtrlBlockElement.setScrrmajTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
					}
				}
				rmajCtrlBlockElement.setScrrmajTermCodeTo(termCode.val);
					
			}

		
		/* Original PL/SQL code code for TRIGGER FOS_ALL.WHEN-CHECKBOX-CHANGED
		 
IF :rmaj_ctrl_block.fos_all='Y' THEN
		IF :SYSTEM.TRIGGER_RECORD=1 AND :SYSTEM.LAST_RECORD='TRUE' AND :scrrmaj.scrrmaj_majr_code IS NULL THEN			
		  :rmaj_ctrl_block.scrrmaj_lfst_code:=null;
		  IF :KEY_BLOCK.STVTERM_CODE <> :RMAJ_CTRL_BLOCK.SCRRMAJ_EFF_TERM THEN
		  	:rmaj_ctrl_block.fos_all:='N';
		  	SET_ITEM_PROPERTY('SCRRMAJ_LFST_CODE_LBT',ENABLED,PROPERTY_TRUE);		  
		  ELSE
		    NEXT_BLOCK;
		  END IF;
		ELSE
		  ------------------------------------------------------------------------------
			IF :rmaj_ctrl_block.scrrmaj_lfst_code IS NULL THEN
         IF :scrrmaj.scrrmaj_majr_code IS NOT NULL OR GET_BLOCK_PROPERTY('SCRRMAJ',STATUS) IN ('CHANGED','INSERT') THEN				  	
            NULL;
         END IF;
      ELSE
		     :rmaj_ctrl_block.fos_all:='N';		     
      END IF;                                                                 
      ------------------------------------------------------------------------------
      IF :SYSTEM.TRIGGER_RECORD > 1 THEN
        :rmaj_ctrl_block.fos_all:='N';		     
      END IF;	
      ------------------------------------------------------------------------------
      IF :rmaj_ctrl_block.fos_all='N' THEN
        SET_ITEM_PROPERTY('SCRRMAJ_LFST_CODE_LBT',ENABLED,PROPERTY_TRUE);	
      ELSE	  
        SET_ITEM_PROPERTY('SCRRMAJ_LFST_CODE_LBT',ENABLED,PROPERTY_FALSE);	
      END IF;
      ------------------------------------------------------------------------------
		END IF;		
ELSE
    SET_ITEM_PROPERTY('SCRRMAJ_LFST_CODE_LBT',ENABLED,PROPERTY_TRUE); 
END IF;


IF :rmaj_ctrl_block.scrrmaj_lfst_code IS NOT NULL THEN
  NEXT_ITEM;
END IF;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOS_ALL.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="FOS_ALL")
		public void fosAll_checkBoxChange()
		{
			

				
				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)this.getFormModel().getRmajCtrlBlock().getRowAdapter(true);
				ScrrmajAdapter scrrmajElement = (ScrrmajAdapter)this.getFormModel().getScrrmaj().getRowAdapter(true);


				if ( rmajCtrlBlockElement.getFosAll().equals("Y") )
				{
					if ( getTriggerRecord().equals(1) && isInLastRecord(true) && scrrmajElement.getScrrmajMajrCode().isNull() )
					{
						rmajCtrlBlockElement.setScrrmajLfstCode(toStr(null));
						if ( getFormModel().getKeyBlock().getStvtermCode().notEquals(rmajCtrlBlockElement.getScrrmajEffTerm1()) )
						{
							rmajCtrlBlockElement.setFosAll(toStr("N"));
							setItemEnabled("SCRRMAJ_LFST_CODE_LBT", true);
						}
						else {
							nextBlock();
						}
					}
					else {
						// ----------------------------------------------------------------------------
						if ( rmajCtrlBlockElement.getScrrmajLfstCode().isNull() )
						{
							if ( scrrmajElement.getScrrmajMajrCode().isNotNull() || in(getBlockStatus("SCRRMAJ"), "CHANGED", "INSERT").getValue() )
							{
							}
						}
						else {
							rmajCtrlBlockElement.setFosAll(toStr("N"));
						}
						// ----------------------------------------------------------------------------
						if ( toNumber(getTriggerRecord()).greater(1) )
						{
							rmajCtrlBlockElement.setFosAll(toStr("N"));
						}
						// ----------------------------------------------------------------------------
						if ( rmajCtrlBlockElement.getFosAll().equals("N") )
						{
							setItemEnabled("SCRRMAJ_LFST_CODE_LBT", true);
						}
						else {
							setItemEnabled("SCRRMAJ_LFST_CODE_LBT", false);
						}
					}
				}
				else {
					setItemEnabled("SCRRMAJ_LFST_CODE_LBT", true);
				}
				if ( rmajCtrlBlockElement.getScrrmajLfstCode().isNotNull() )
				{
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOS_ALL.KEY-NEXT-ITEM
		 
IF NVL(:fos_all,'N')='Y' THEN
  NEXT_BLOCK;
ELSE
  NEXT_ITEM;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOS_ALL.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FOS_ALL", function=KeyFunction.NEXT_ITEM)
		public void fosAll_keyNexItem()
		{
			

				
				RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter)this.getFormModel().getRmajCtrlBlock().getRowAdapter(true);


				if ( isNull(rmajCtrlBlockElement.getFosAll(), "N").equals("Y") )
				{
					nextBlock();
				}
				else {
					nextItem();
				}
			}

		
	
	
}
