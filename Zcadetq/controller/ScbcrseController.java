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

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class ScbcrseController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ScbcrseController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCBCRSE.POST-QUERY
		    IF SELECT_SCBCRKY_1 (:SCBCRSE.SCBCRSE_SUBJ_CODE,
      :SCBCRSE.SCBCRSE_CRSE_NUMB, :SCBCRSE.SCBCRKY_TERM_CODE_END
      ) THEN
      RETURN ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scbcrse_AfterQuery(RowAdapterEvent args)
		{
			
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)args.getRow();
				Ref<NString> termCode = new Ref<NString>(scbcrseElement.getScbcrkyTermCodeEnd());

				if ( this.getTask().getServices().selectScbcrky1(scbcrseElement.getScbcrseSubjCode(), scbcrseElement.getScbcrseCrseNumb(), termCode).getValue() )
				{	
					scbcrseElement.setScbcrkyTermCodeEnd(termCode.val);
					return ;
				}
				scbcrseElement.setScbcrkyTermCodeEnd(termCode.val);
			}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE.KEY-PRVBLK
		 	GO_BLOCK('ZCRDUPC');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void scbcrse_PreviousBlock()
		{
			
				goBlock(toStr("ZCRDUPC"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scbcrse_BeforeQuery(QueryEvent args)
		{
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_EFF_TERM.KEY-DUPREC
		 NEXT_BLOCK;
CREATE_RECORD;
DUPLICATE_RECORD;
:SCBCRSE_EFF_TERM := :KEY_BLOCK.STVTERM_CODE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_EFF_TERM.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", item="SCBCRSE_EFF_TERM", function=KeyFunction.DUPLICATE_RECORD, fireInSearch=false)
		public void scbcrseEffTerm_CopyRecord()
		{
			

				
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				nextBlock();
				createRecord();
				duplicateRecord();
				scbcrseElement.setScbcrseEffTerm(getFormModel().getKeyBlock().getStvtermCode());
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_COLL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCBCRSE_COLL_CODE")
		public void scbcrseCollCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_COLL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCBCRSE_COLL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scbcrseCollCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_COLL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCBCRSE_COLL_CODE")
		public void scbcrseCollCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_COLL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCBCRSE_COLL_CODE")
		public void scbcrseCollCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_COLL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCBCRSE_COLL_CODE", function=KeyFunction.NEXT_ITEM)
		public void scbcrseCollCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_COLL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCBCRSE_COLL_CODE", function=KeyFunction.ITEM_OUT)
		public void scbcrseCollCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_COLL_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVCOLL_DESC
         FROM   STVCOLL
         WHERE  :SCBCRSE.SCBCRSE_COLL_CODE = STVCOLL_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :COLLEGE_DESCRIPTION ;
   END ;
--
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
		 * SCBCRSE_COLL_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCBCRSE_COLL_CODE")
		public void scbcrseCollCode_PostChange()
		{
			

				
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT STVCOLL_DESC " +
	" FROM STVCOLL " +
	" WHERE :SCBCRSE_SCBCRSE_COLL_CODE = STVCOLL_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCBCRSE_SCBCRSE_COLL_CODE", scbcrseElement.getScbcrseCollCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								scbcrseElement.setCollegeDescription(ptiCursorResults.getStr(0));
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
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
		 * COLLEGE_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="COLLEGE_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void collegeDescription_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_DEPT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCBCRSE_DEPT_CODE")
		public void scbcrseDeptCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_DEPT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCBCRSE_DEPT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scbcrseDeptCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_DEPT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCBCRSE_DEPT_CODE")
		public void scbcrseDeptCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_DEPT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCBCRSE_DEPT_CODE")
		public void scbcrseDeptCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_DEPT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCBCRSE_DEPT_CODE", function=KeyFunction.NEXT_ITEM)
		public void scbcrseDeptCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_DEPT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCBCRSE_DEPT_CODE", function=KeyFunction.ITEM_OUT)
		public void scbcrseDeptCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_DEPT_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVDEPT_DESC
         FROM   STVDEPT
         WHERE  :SCBCRSE.SCBCRSE_DEPT_CODE = STVDEPT_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :DEPARTMENT_DESCRIPTION ;
   END ;
--
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
		 * SCBCRSE_DEPT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCBCRSE_DEPT_CODE")
		public void scbcrseDeptCode_PostChange()
		{
			

				
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT STVDEPT_DESC " +
	" FROM STVDEPT " +
	" WHERE :SCBCRSE_SCBCRSE_DEPT_CODE = STVDEPT_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCBCRSE_SCBCRSE_DEPT_CODE", scbcrseElement.getScbcrseDeptCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								scbcrseElement.setDepartmentDescription(ptiCursorResults.getStr(0));
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
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
		 * DEPARTMENT_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="DEPARTMENT_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void departmentDescription_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_CSTA_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCBCRSE_CSTA_CODE")
		public void scbcrseCstaCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_CSTA_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCBCRSE_CSTA_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scbcrseCstaCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_CSTA_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCBCRSE_CSTA_CODE")
		public void scbcrseCstaCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_CSTA_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCBCRSE_CSTA_CODE")
		public void scbcrseCstaCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_CSTA_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCBCRSE_CSTA_CODE", function=KeyFunction.NEXT_ITEM)
		public void scbcrseCstaCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_CSTA_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCBCRSE_CSTA_CODE", function=KeyFunction.ITEM_OUT)
		public void scbcrseCstaCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_CSTA_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVCSTA_DESC
         FROM   STVCSTA
         WHERE  :SCBCRSE_CSTA_CODE = STVCSTA_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :STATUS_DESCRIPTION ;
   END ;
--
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
		 * SCBCRSE_CSTA_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCBCRSE_CSTA_CODE")
		public void scbcrseCstaCode_PostChange()
		{
			

				
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT STVCSTA_DESC " +
	" FROM STVCSTA " +
	" WHERE :SCBCRSE_CSTA_CODE = STVCSTA_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCBCRSE_CSTA_CODE", scbcrseElement.getScbcrseCstaCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								scbcrseElement.setStatusDescription(ptiCursorResults.getStr(0));
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
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
		 * STATUS_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STATUS_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void statusDescription_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_REPS_CODE.WHEN-MOUSE-DOUBLECLICK
		BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_REPS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCBCRSE_REPS_CODE")
		public void scbcrseRepsCode_doubleClick()
		{
			
				getTask().getGoqrpls().getGSearch().whenMouseClick();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_REPS_CODE.WHEN-NEW-ITEM-INSTANCE
		BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_REPS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCBCRSE_REPS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scbcrseRepsCode_itemChange()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_REPS_CODE.G$_SEARCH_PARAMETERS
		BEGIN
  G$_SEARCH.PARAMETERS('','','');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_REPS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCBCRSE_REPS_CODE")
		public void scbcrseRepsCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr(""), toStr(""), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_REPS_CODE.G$_SEARCH_OPTIONS
		BEGIN
  DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_REPS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCBCRSE_REPS_CODE")
		public void scbcrseRepsCode_GSearchOptions()
		{
			
				executeAction(KeyFunction.LIST_VALUES);
			}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_REPS_CODE.KEY-NEXT-ITEM
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
		 * SCBCRSE_REPS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCBCRSE_REPS_CODE", function=KeyFunction.NEXT_ITEM)
		public void scbcrseRepsCode_keyNexItem()
		{
			
				getTask().getGoqrpls().getGSearch().codeKeyNextItem();
				getTask().getGoqrpls().gCheckFailure();
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_REPS_CODE.POST-TEXT-ITEM
		BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCBCRSE_REPS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCBCRSE_REPS_CODE", function=KeyFunction.ITEM_OUT)
		public void scbcrseRepsCode_itemOut()
		{
			
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SCBCRSE_REPS_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVREPS_CODE
         FROM   STVREPS
         WHERE  :SCBCRSE_REPS_CODE = STVREPS_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCBCRSE_REPS_CODE ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('SCACRSE-0131', 'FORM','*ERROR* Invalid code, press LIST for valid codes.') , TRUE);
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
		 * SCBCRSE_REPS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCBCRSE_REPS_CODE")
		public void scbcrseRepsCode_PostChange()
		{
			

				
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
						String sqlptiCursor = "SELECT STVREPS_CODE " +
	" FROM STVREPS " +
	" WHERE :SCBCRSE_REPS_CODE = STVREPS_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCBCRSE_REPS_CODE", scbcrseElement.getScbcrseRepsCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								scbcrseElement.setScbcrseRepsCode(ptiCursorResults.getStr(0));
							}
							getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("SCACRSE-0131"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
	
	
}
