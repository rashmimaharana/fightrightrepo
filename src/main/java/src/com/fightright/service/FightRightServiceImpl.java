package src.com.fightright.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.com.fightright.dao.IFightRightDao;
import src.com.fightright.model.CaseProcessing;
import src.com.fightright.model.CaseProcessingResponse;
import src.com.fightright.model.District;
import src.com.fightright.model.PoliceStation;
import src.com.fightright.model.State;

@Service
public class FightRightServiceImpl implements IFightRightService {

	@Autowired
	IFightRightDao fightRightDao;

	@Override
	public List<State> getAllStates() {
		return fightRightDao.getAllStates();
	}

	@Override
	public List<District> getAllDistricts() {
		return fightRightDao.getAllDistricts();
	}

	@Override
	public List<District> getAllDistricts(long id) {
		return fightRightDao.getAllDistricts(id);
	}

	@Override
	public List<PoliceStation> getAllPoliceStations() {
		return fightRightDao.getAllPoliceStations();
	}

	@Override
	public List<PoliceStation> getAllPoliceStations(long id) {
		return fightRightDao.getAllPoliceStations(id);
	}

	@Override
	public CaseProcessingResponse addCaseProcessing(CaseProcessing caseProcessing) {
		return fightRightDao.addCaseProcessing(caseProcessing);
	}

	@Override
	public List<CaseProcessing> getAllCaseProcessing() {
		return fightRightDao.getAllCaseProcessing();
	}

}
