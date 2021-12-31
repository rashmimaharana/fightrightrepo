package src.com.fightright.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseProcessing implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	/**
	 * Client/Claimant Info:
	 */
	@JsonProperty("my_fr_uuid")
	String myFrUuid;
	
	@JsonProperty("client_name")
	String clientName;

	@JsonProperty("client_email")
	String clientEmail;

	@JsonProperty("client_district")
	String clientDistrict;

	@JsonProperty("client_address_line_1")
	String clientAddressLine1;

	@JsonProperty("client_phone_no")
	String clientPhoneNo;

	@JsonProperty("client_police_station")
	String clientPoliceStation;

	@JsonProperty("client_address_line_2")
	String clientAddressLine2;

	@JsonProperty("client_state")
	String clientState;

	@JsonProperty("client_pin_code")
	String clientPinCode;

	/**
	 * Tenant Info:
	 * 
	 */
	@JsonProperty("tenant_name")
	String tenantName;

	@JsonProperty("tenant_email")
	String tenantEmail;

	@JsonProperty("tenant_district")
	String tenantDistrict;

	@JsonProperty("tenant_address_line_1")
	String tenantAddressLine1;

	@JsonProperty("tenant_phone_no")
	String tenantPhoneNo;

	@JsonProperty("tenant_police_station")
	String tenantPoliceStation;

	@JsonProperty("tenant_address_line_2")
	String tenantAddressLine2;

	@JsonProperty("tenant_state")
	String tenantState;

	@JsonProperty("tenant_pin_code")
	String tenantPinCode;

	/**
	 * Property description
	 * 
	 */

	@JsonProperty("property_description")
	String propertyDescription;

	@JsonProperty("property_district")
	String propertyDistrict;

	@JsonProperty("property_address_line_1")
	String propertyAddressLine1;

	@JsonProperty("property_state")
	String propertyState;

	@JsonProperty("property_police_station")
	String propertyPoliceStation;

	@JsonProperty("property_address_line_2")
	String propertyAddressLine2;

	/**
	 * Agreement details
	 * 
	 */
	@JsonProperty("act_applicable")
	String actApplicable;

	@JsonProperty("monthly_rent")
	int monthlyRent;

	@JsonProperty("resedential_commercial")
	String resedentialCommercial;

	@JsonProperty("tenure_date_from")
	@JsonFormat(pattern="yyyy-MM-dd")
	Date tenureDateFrom;

	@JsonProperty("additional_payables")
	String additionalPayables;

	@JsonProperty("sub_let")
	String subLet;

	@JsonProperty("commencement_of_tenancy")
	@JsonFormat(pattern="yyyy-MM-dd")
	Date commencementOfTenancy;

	@JsonProperty("bills_raised_receipted")
	String billsRaisedReceipted;

	@JsonProperty("rent_receipt_issued_name")
	String rentReceiptIssuedName;

	@JsonProperty("special_rights")
	String specialRights;

	@JsonProperty("bill_amount")
	int billAmount;

	@JsonProperty("agreement_any")
	String agreementAny;

	@JsonProperty("tenant_alive")
	String tenantAlive;

	@JsonProperty("rent_paid_to")
	String rentPaidTo;

	/**
	 * Violation of tenancy
	 * 
	 */

	@JsonProperty("violation")
	String violation;

	@JsonProperty("violation_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	Date violationDate;
	
	@JsonProperty("status")
	String status;
	
	@JsonProperty("active")
	String active;

}
