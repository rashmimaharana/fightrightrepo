package src.com.fightright.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import src.com.fightright.config.common.CommonUtility;
import src.com.fightright.constants.QuerryConstant;
import src.com.fightright.model.CaseProcessing;
import src.com.fightright.model.CaseProcessingResponse;
import src.com.fightright.model.District;
import src.com.fightright.model.PoliceStation;
import src.com.fightright.model.State;

@Repository
public class FightRightDaoImpl implements IFightRightDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<State> getAllStates() {
		return jdbcTemplate.query(QuerryConstant.GET_ALL_STATES,
				(rs, rowNum) -> State.builder().id(rs.getLong("id")).name(rs.getString("name")).build());
	}

	@Override
	public List<District> getAllDistricts() {
		return jdbcTemplate.query(QuerryConstant.GET_ALL_DISTRICTS, (rs, rowNum) -> District.builder()
				.id(rs.getLong("id")).state_fk(rs.getLong("state_fk")).name(rs.getString("name")).build());
	}

	@Override
	public List<District> getAllDistricts(long id) {
		return jdbcTemplate.query(QuerryConstant.GET_ALL_DISTRICTS_BY_STATE_ID, (rs, rowNum) -> District.builder()
				.id(rs.getLong("id")).state_fk(rs.getLong("state_fk")).name(rs.getString("name")).build(), id);
	}

	@Override
	public List<PoliceStation> getAllPoliceStations() {
		return jdbcTemplate.query(QuerryConstant.GET_ALL_POLICE_STATIONS,
				(rs, rowNum) -> new PoliceStation(rs.getLong("id"), rs.getLong("district_fk"), rs.getString("name")));
	}

	@Override
	public List<PoliceStation> getAllPoliceStations(long id) {
		return jdbcTemplate.query(QuerryConstant.GET_ALL_POLICE_STATIONS_BY_DISTRICT_ID,
				(rs, rowNum) -> new PoliceStation(rs.getLong("id"), rs.getLong("district_fk"), rs.getString("name")),
				id);
	}

	@Override
	public CaseProcessingResponse addCaseProcessing(CaseProcessing caseProcessing) {
		jdbcTemplate.update(QuerryConstant.INSERT_CASE_PROCESSING, 
				CommonUtility.getmyFrUUID(), caseProcessing.getClientName(),
				caseProcessing.getClientEmail(), caseProcessing.getClientDistrict(),
				caseProcessing.getClientAddressLine1(), caseProcessing.getClientPhoneNo(),
				caseProcessing.getClientPoliceStation(), caseProcessing.getClientAddressLine2(),
				caseProcessing.getClientState(), caseProcessing.getClientPinCode(), caseProcessing.getTenantName(),
				caseProcessing.getTenantEmail(), caseProcessing.getTenantDistrict(),
				caseProcessing.getTenantAddressLine1(), caseProcessing.getTenantPhoneNo(),
				caseProcessing.getTenantPoliceStation(), caseProcessing.getTenantAddressLine2(),
				caseProcessing.getTenantState(), caseProcessing.getTenantPinCode(),
				caseProcessing.getPropertyDescription(), caseProcessing.getPropertyDistrict(),
				caseProcessing.getPropertyAddressLine1(), caseProcessing.getPropertyState(),
				caseProcessing.getPropertyPoliceStation(), caseProcessing.getPropertyAddressLine2(),
				caseProcessing.getActApplicable(), caseProcessing.getMonthlyRent(),
				caseProcessing.getResedentialCommercial(), caseProcessing.getTenureDateFrom(),
				caseProcessing.getAdditionalPayables(), caseProcessing.getSubLet(),
				caseProcessing.getCommencementOfTenancy(), caseProcessing.getBillsRaisedReceipted(),
				caseProcessing.getRentReceiptIssuedName(), caseProcessing.getSpecialRights(),
				caseProcessing.getBillAmount(), caseProcessing.getAgreementAny(), caseProcessing.getTenantAlive(),
				caseProcessing.getRentPaidTo(), caseProcessing.getViolation(), caseProcessing.getViolationDate(),
				caseProcessing.getStatus(), caseProcessing.getActive());

		return CaseProcessingResponse.builder().message("Successfully saved the record").status("OK").build();

	}

	@Override
	public List<CaseProcessing> getAllCaseProcessing() {	
		return jdbcTemplate.query(QuerryConstant.GET_ALL_CASE_PROCESSING, (rs, rowNum) -> CaseProcessing.builder()
				.myFrUuid(rs.getString("my_fr_uuid"))
				.clientName(rs.getString("client_name"))
				.clientEmail(rs.getString("client_email"))
				.clientPhoneNo(rs.getString("client_phone_no"))
				.clientAddressLine1(rs.getString("client_address_line_1"))
				.clientAddressLine2(rs.getString("client_address_line_1"))
				.clientState(rs.getString("client_state"))
				.clientDistrict(rs.getString("client_district"))
				.clientPoliceStation(rs.getString("client_police_station"))
				.clientPinCode(rs.getString("client_pin_code"))
				.status(rs.getString("status"))
				.active(rs.getString("active"))
				.build());
	}
}
