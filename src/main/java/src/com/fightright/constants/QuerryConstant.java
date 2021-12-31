package src.com.fightright.constants;

public interface QuerryConstant {

	String GET_ALL_POLICE_STATIONS = "select * from police_station";

	String GET_ALL_POLICE_STATIONS_BY_DISTRICT = "select ps.* from police_station as ps "
			+ "inner join district dst on dst.id = ps.district_fk";

	String GET_ALL_POLICE_STATIONS_BY_DISTRICT_ID = "select police_station.* from police_station "
			+ "inner join district on district.id = police_station.district_fk where police_station.district_fk= ?";

	String GET_ALL_DISTRICTS = "select * from district";

	String GET_ALL_DISTRICTS_BY_STATE = "select dst.* from district as dst "
			+ "inner join state st on st.id = dst.state_fk";

	String GET_ALL_DISTRICTS_BY_STATE_ID = "select dst.* from district as dst "
			+ "inner join state st on st.id = dst.state_fk where dst.state_fk = ?";

	String GET_ALL_STATES = "select * from state";

	String INSERT_CASE_PROCESSING = "INSERT INTO case_processing(\r\n"
			+ "	my_fr_uuid, client_name, client_email, client_district, client_address_line_1, client_phone_no, "
			+ "client_police_station, client_address_line_2, client_state, client_pin_code, "
			+ "tenant_name, tenant_email, tenant_district, tenant_address_line_1, tenant_phone_no, "
			+ "tenant_police_station, tenant_address_line_2, tenant_state, tenant_pin_code, "
			+ "property_description, property_district, property_address_line_1, property_state, "
			+ "property_police_station, property_address_line_2, act_applicable, monthly_rent, "
			+ "resedential_commercial, tenure_date_from, additional_payables, sub_let, "
			+ "commencement_of_tenancy, bills_raised_receipted, rent_receipt_issued_name, "
			+ "special_rights, bill_amount, agreement_any, tenant_alive, "
			+ "rent_paid_to, violation, violation_date, status, active)\r\n"
			+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	String GET_ALL_CASE_PROCESSING = "select * from case_processing";
	
}
