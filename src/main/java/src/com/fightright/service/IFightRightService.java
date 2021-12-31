package src.com.fightright.service;

import java.util.List;

import src.com.fightright.model.CaseProcessing;
import src.com.fightright.model.CaseProcessingResponse;
import src.com.fightright.model.District;
import src.com.fightright.model.PoliceStation;
import src.com.fightright.model.State;

public interface IFightRightService {

	List<State> getAllStates();

	List<District> getAllDistricts();

	List<District> getAllDistricts(long id);

	List<PoliceStation> getAllPoliceStations();

	List<PoliceStation> getAllPoliceStations(long id);

	CaseProcessingResponse addCaseProcessing(CaseProcessing caseProcessing);

	List<CaseProcessing> getAllCaseProcessing();

}
