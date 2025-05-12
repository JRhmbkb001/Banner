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
		
public class ScrtextController extends DefaultBlockController {


	
	public ScrtextController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRTEXT.PRE-QUERY
		    :TEXT_CTRL.SCRTEXT_TERM_CODE_FROM :=
      :SCBCRSE.SCBCRSE_EFF_TERM ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRTEXT_EFF_TERM)
         FROM   SCRTEXT
         WHERE  SCRTEXT_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE
           AND  SCRTEXT_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCRTEXT_EFF_TERM > :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :TEXT_CTRL.SCRTEXT_TERM_CODE_TO ;
   END ;
--
   IF :TEXT_CTRL.SCRTEXT_TERM_CODE_TO IN (
      :TEXT_CTRL.SCRTEXT_TERM_CODE_FROM) OR
      :TEXT_CTRL.SCRTEXT_TERM_CODE_TO IS NULL  OR (
      :TEXT_CTRL.SCRTEXT_TERM_CODE_TO IS NULL AND
      :TEXT_CTRL.SCRTEXT_TERM_CODE_FROM IS NULL ) THEN
      GOTO GET_SCBCRKY ;
   ELSE
      RETURN ;
   END IF ;
--
   << GET_SCBCRKY >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :TEXT_CTRL.SCRTEXT_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;
--
	 << PTI_STEP_001 >>
   IF :TEXT_CTRL.SCRTEXT_TERM_CODE_TO IS NULL  THEN
      :TEXT_CTRL.SCRTEXT_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRTEXT.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrtext_BeforeQuery(QueryEvent args)
		{
			
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
				Ref<NString> termCode = new Ref<NString>(getFormModel().getTextCtrl().getScrtextTermCodeTo());

				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				getFormModel().getTextCtrl().setScrtextTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				{
					String sqlptiCursor = "SELECT MIN(SCRTEXT_EFF_TERM) " +
	" FROM SCRTEXT " +
	" WHERE SCRTEXT_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND SCRTEXT_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRTEXT_EFF_TERM > :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getTextCtrl().setScrtextTermCodeTo(termCode.getValue());
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if (! (in(getFormModel().getTextCtrl().getScrtextTermCodeTo(), getFormModel().getTextCtrl().getScrtextTermCodeFrom()).getValue() || getFormModel().getTextCtrl().getScrtextTermCodeTo().isNull() || (getFormModel().getTextCtrl().getScrtextTermCodeTo().isNull() && getFormModel().getTextCtrl().getScrtextTermCodeFrom().isNull()) ))
						return ;
				
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					getFormModel().getTextCtrl().setScrtextTermCodeTo(termCode.val);
				}
					getFormModel().getTextCtrl().setScrtextTermCodeTo(termCode.val);
				if ( getFormModel().getTextCtrl().getScrtextTermCodeTo().isNull() )
				{
					getFormModel().getTextCtrl().setScrtextTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRTEXT.POST-QUERY
		    :TEXT_CTRL.SCRTEXT_TERM_CODE_FROM :=
      :SCRTEXT.SCRTEXT_EFF_TERM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRTEXT.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrtext_AfterQuery(RowAdapterEvent args)
		{
			
				ScrtextAdapter scrtextElement = (ScrtextAdapter)args.getRow();


				getFormModel().getTextCtrl().setScrtextTermCodeFrom(scrtextElement.getScrtextEffTerm());
			}

		
	
	
}
