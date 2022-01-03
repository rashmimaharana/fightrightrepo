var caseProcessing = {};
var errorInForm = false;

function populateCaseProcessingData(){
	errorInForm = false;
	caseProcessing = {};
	caseProcessing.client_name = $("#client-name").val();
	caseProcessing.client_email = $("#client-email").val();
	caseProcessing.client_district = $("#client-district :selected").text();
	caseProcessing.client_address_line_1 = $("#client-address-line-1").val();
	caseProcessing.client_phone_no = $("#client-phone-no").val();
	caseProcessing.client_police_station = $("#client-police-station :selected").text();
	caseProcessing.client_address_line_2 = $("#client-address-line-2").val();
	caseProcessing.client_state = $("#client-state :selected").text();
	caseProcessing.client_pin_code = $("#client-pin-code").val();
	caseProcessing.tenant_name = $("#tenant-name").val();
	caseProcessing.tenant_email = $("#tenant-email").val();
	caseProcessing.tenant_district = $("#tenant-district :selected").text();
	caseProcessing.tenant_address_line_1 = $("#tenant-address-line-1").val();
	caseProcessing.tenant_phone_no = $("#tenant-phone-no").val();
	caseProcessing.tenant_police_station = $("#tenant-police-station :selected").text();
	caseProcessing.tenant_address_line_2 = $("#tenant-address-line-2").val();
	caseProcessing.tenant_state = $("#tenant-state :selected").text();
	caseProcessing.tenant_pin_code = $("#tenant-pin-code").val();
	caseProcessing.property_description = $("#property-description").val();
	caseProcessing.property_district = $("#property-district :selected").text();
	caseProcessing.property_address_line_1 = $("#property-address-line-1").val();
	caseProcessing.property_state = $("#property-state :selected").text();
	caseProcessing.property_police_station = $("#property-police-station :selected").text();
	caseProcessing.property_address_line_2 = $("#property-address-line-2").val();
	caseProcessing.act_applicable = $("#act-applicable").val();
	caseProcessing.monthly_rent = $("#monthly-rent").val();
	caseProcessing.resedential_commercial = $("#resedential-commercial").val();
	caseProcessing.tenure_date_from = $("#tenure-date-from").val();
	caseProcessing.additional_payables = $("#additional-payables").val();
	caseProcessing.sub_let = $("#sub-let").val();
	caseProcessing.commencement_of_tenancy = $("#commencement-of-tenancy").val();
	caseProcessing.bills_raised_receipted = $("#bills-raised-receipted").val();	
	caseProcessing.rent_receipt_issued_name = $("#rent-receipt-issued-name").val();
	caseProcessing.special_rights = $("#special-rights").val();
	caseProcessing.bill_amount = $("#bill-amount").val();
	caseProcessing.agreement_any = $("#agreement-if-any").val();
	caseProcessing.tenant_alive = $("#tenant-alive").val();
	caseProcessing.rent_paid_to = $("#rent-paid-to").val();
	caseProcessing.violation = $("#violation").val();
	caseProcessing.violation_date = $("#violation-date").val();
	caseProcessing.status = "";
	caseProcessing.active = "";
	
	console.log(JSON.stringify(caseProcessing));
}

function populatePreviewPage() {	
	$(".preview-case-processing").empty();	
	$("#client-name-preview").text(caseProcessing.client_name);
	$("#client-email-preview").text(caseProcessing.client_email);
	$("#client-district-preview").text(caseProcessing.client_district);
	$("#client-address-line-1-preview").text(caseProcessing.client_address_line_1);
	$("#client-phone-no-preview").text(caseProcessing.client_phone_no);
	$("#client-police-station-preview").text(caseProcessing.client_police_station);
	$("#client-address-line-2-preview").text(caseProcessing.client_address_line_2);
	$("#client-state-preview").text(caseProcessing.client_state);
	$("#client-pin-code-preview").text(caseProcessing.client_pin_code);
	$("#tenant-name-preview").text(caseProcessing.tenant_name);
	$("#tenant-email-preview").text(caseProcessing.tenant_email);
	$("#tenant-district-preview").text(caseProcessing.tenant_district);
	$("#tenant-address-line-1-preview").text(caseProcessing.tenant_address_line_1);
	$("#tenant-phone-no-preview").text(caseProcessing.tenant_phone_no);
	$("#tenant-police-station-preview").text(caseProcessing.tenant_police_station);
	$("#tenant-address-line-2-preview").text(caseProcessing.tenant_address_line_2);
	$("#tenant-state-preview").text(caseProcessing.tenant_state);
	$("#tenant-pin-code-preview").text(caseProcessing.tenant_pin_code);
	$("#property-description-preview").text(caseProcessing.property_description);
	$("#property-district-preview").text(caseProcessing.property_district);
	$("#property-address-line-1-preview").text(caseProcessing.property_address_line_1);
	$("#property-state-preview").text(caseProcessing.property_state);
	$("#property-police-station-preview").text(caseProcessing.property_police_station);
	$("#property-address-line-2-preview").text(caseProcessing.property_address_line_2);
	$("#act-applicable-preview").text(caseProcessing.act_applicable);
	$("#monthly-rent-preview").text(caseProcessing.monthly_rent);
	$("#resedential-commercial-preview").text(caseProcessing.resedential_commercial);
	$("#tenure-date-from-preview").text(caseProcessing.tenure_date_from);
	$("#additional-payables-preview").text(caseProcessing.additional_payables);
	$("#sub-let-preview").text(caseProcessing.sub_let);
	$("#commencement-of-tenancy-preview").text(caseProcessing.commencement_of_tenancy);
	$("#bills-raised-receipted-preview").text(caseProcessing.bills_raised_receipted);	
	$("#rent-receipt-issued-name-preview").text(caseProcessing.rent_receipt_issued_name);
	$("#special-rights-preview").text(caseProcessing.special_rights);
	$("#bill-amount-preview").text(caseProcessing.bill_amount);
	$("#agreement-if-any-preview").text(caseProcessing.agreement_any);
	$("#tenant-alive-preview").text(caseProcessing.tenant_alive);
	$("#rent-paid-to-preview").text(caseProcessing.rent_paid_to);
	$("#violation-preview").text(caseProcessing.violation);
	$("#violation-date-preview").text(caseProcessing.violation_date);
}

function populateStates() {

	emptyAllStateDropDown();
	emptyAllDistrictDropDown();
	emptyAllPoliceStationDropDown();

	$.ajax({
		url: '/getAllStates',
		type: 'GET',
		error: function() {
			console.log("error");
		},
		dataType: 'json',
		success: function(data) {
			var optionElem = "<option value=''>Select ...</option>";
			$.each(data, function(i, obj) {
				optionElem += "<option value='" + obj.id + "'>" + obj.name + "</option>"
			});
			$("#client-state").append(optionElem);
			$("#tenant-state").append(optionElem);
			$("#property-state").append(optionElem);
		}
	});
}

function onStateChange(obj) {
	emptyDistrictDropDown(obj.id);
	emptyPoliceStationDropDown(obj.id);
	populateDistrict(obj)
}

function onDistrictChange(obj) {
	emptyPoliceStationDropDown(obj.id);
	populatePoliceStation(obj)
}

function emptyDistrictDropDown(elem) {
	var id = elem.split("-")[0];
	$("#" + id + "-district").empty();
}

function emptyPoliceStationDropDown(elem) {
	var id = elem.split("-")[0];
	$("#"+ id +"-police-station").empty();
}

function populateDistrict(obj) {
	$.ajax({
		url: '/getAllDistrictsByState?id=' + obj.value,
		type: 'GET',
		error: function() {
			console.log("error");
		},
		dataType: 'json',
		success: function(data) {
			var optionElem = "<option value=''>Select ...</option>";
			$.each(data, function(i, obj) {
				optionElem += "<option value='" + obj.id + "'>" +  obj.name  + "</option>"
			});
			var id = obj.id.split("-")[0];
			$("#" + id + "-district").append(optionElem);
		}
	});

}

function populatePoliceStation(obj) {
	$.ajax({
		url: '/getAllPoliceStationsByDistrict?id=' + obj.value,
		type: 'GET',
		error: function() {
			console.log("error");
		},
		dataType: 'json',
		success: function(data) {
			var optionElem = "<option value=''>Select ...</option>";
			$.each(data, function(i, obj) {
				optionElem += "<option value='" + obj.id + "'>" + obj.name + "</option>"
			});
			var id = obj.id.split("-")[0];
			$("#" + id + "-police-station").append(optionElem);
		}
	});
}

function submitCaseProcessing(){
		$.ajax({
		url: '/addCaseProcessing',
		type: 'POST',
		dataType: 'json',
		contentType: 'application/json',
		data: JSON.stringify(caseProcessing),
		error: function() {
			console.log("error");
		},
		dataType: 'json',
		success: function(data) {
			$(".fight-right-content").hide();
			$("#previewModal").modal('hide');
			$("#my-assigned-task").show();
			populateCaseProcessing();
		}
	});
}

function populateCaseProcessing(){
		$.ajax({
		url: '/getCaseProcessing',
		type: 'GET',
		error: function() {
			console.log("error");
		},
		dataType: 'json',
		success: function(data) {				
			var tbodyElem = "";
			$.each(data, function(i, obj) {
				tbodyElem += "<tr>";
				tbodyElem += "<td><input type='checkbox' id='scales' name='scales'></td>";
				tbodyElem += "<td>"+obj.my_fr_uuid+"</td>"
				tbodyElem += "<td>"+obj.client_name+"</td>";
				tbodyElem += "<td>"+obj.client_email+"</td>";
				tbodyElem += "<td>"+obj.client_phone_no+"</td>";
				tbodyElem += "<td>"+obj.client_address_line_1+"<br>"+obj.client_address_line_2+"<br>"+obj.client_pin_code+"</td>";
				tbodyElem += "<td>"+obj.status+"</td>";
				tbodyElem += "<td><i class='far fa-square'></i></td>"
				tbodyElem += "</tr>";			
			});
			
			$("#my-assigned-task-tbody").empty();
			$("#my-assigned-task-tbody").append(tbodyElem);
			
			$('#dtBasicExample').DataTable({
							    "paging": true,
								"bDestroy": true,
							    "columnDefs": [ {
							        'targets': [0,6], 
							        'orderable': false,
							     }]
							  });
							$('.dataTables_length').addClass('bs-select');
			
			$(".fight-right-content").hide();
			$("#my-assigned-task").show();
		}
	});
}

function emptyAllStateDropDown() {
	$("#client-state").empty();
	$("#tenant-state").empty();
	$("#property-state").empty();
}

function emptyAllDistrictDropDown(elem) {
	$("#client-district").empty();
	$("#tenant-district").empty();
	$("#property-district").empty();
}

function emptyAllPoliceStationDropDown(elem) {
	$("#client-police-station").empty();
	$("#tenant-police-station").empty();
	$("#property-police-station").empty();
}

/**
validation logic starts here
 */
function validateName(elem, nameType) {
	var client_name = $(elem).val();
	if (client_name.length == 0) {
		$(elem).after('<span class="error">'+nameType+' Name is required</span>');
		addRemoveErrorClass(elem,true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem,false);
	}
}

function validatePinCode(elem) {
	var pinCodeRegx = /^(\d{6})$/;
	var value = $(elem).val();
	if (value.length == 0) {
		$(elem).after('<span class="error">Pin code is required</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		if (!pinCodeRegx.test(value)) {
			$(elem).after('<span class="error">Enter valid pincode</span>');
			addRemoveErrorClass(elem, true);
			errorInForm = true;
		} else {
			addRemoveErrorClass(elem, false);
		}
	}
}

function validatePhoneNo(elem) {
	var phoneRegex = /\(?([0-9]{3})\)?([ .-]?)([0-9]{3})\2([0-9]{4})/;
	var phone_no = $(elem).val();
	if (phone_no.length == 0) {
		$(elem).after('<span class="error">Phone no is required</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		if (!phoneRegex.test(phone_no)) {
			$('#phone_no').after('<br><span class="error">Enter valid phone no</span>');
			addRemoveErrorClass(elem, true);
			errorInForm = true;
		} else {
			addRemoveErrorClass(elem, false);
		}
	}
}

function validateEmail(elem) {
	var regEx = /^\w+([-+.'][^\s]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	var email = $(elem).val();
	if (email.length == 0) {
		$(elem).after('<span class="error">This field is required</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		if (!regEx.test(email)) {
			$(elem).after('<span class="error">Enter a valid email</span>');
			addRemoveErrorClass(elem, true);
			errorInForm = true;
		} else {
			addRemoveErrorClass(elem, false);
		}
	}
}

function validateAddressLine1(elem) {
	var address_line_1 = $(elem).val();
	if (address_line_1.length == 0) {
		$(elem).after('<span class="error">Addressline 1 is required</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem, false);
	}
}

function validateAddressLine2(elem) {
	var address_line_2 = $(elem).val();
	if (address_line_2.length == 0) {
		$(elem).after('<span class="error">Addressline 2 is required</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem, false);
	}
}

function validateState(elem) {
	var state = $(elem).val();
	if (state == null || state.length == 0) {
		$(elem).after('<span class="error">Select state</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem, false);
	}
}

function validateDistrict(elem) {
	var district = $(elem).val();
	if (district == null || district.length == 0) {
		$(elem).after('<span class="error">Select district</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem, false);
	}
}

function validatePoliceStation(elem) {
	var policeStation = $(elem).val();
	if (policeStation == null || policeStation.length == 0) {
		$(elem).after('<span class="error">Select Police Station</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem, false);
	}
}

function validateAmount(elem, amountType){
	var regEx = /^\d+$/;
	var amount = $(elem).val();
	if(!regEx.test(amount)) {
		$(elem).after('<span class="error">Enter '+amountType+'</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem, false);
	}
}

function validateResident(elem){
	var resident = $(elem).val();
	if (resident.length == 0) {
		$(elem).after('<span class="error">Please select one</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem, false);
	}
}

function validateDateField(elem){
	var dateField = $(elem).val();
	if (dateField.length == 0) {
		$(elem).parent().append('<span class="error">Please choose a date</span>');
		addRemoveErrorClass(elem, true);
		errorInForm = true;
	} else {
		addRemoveErrorClass(elem, false);
	}
}

function addRemoveErrorClass(elem, flag) {
	if (flag) {
		$(elem).addClass('form-field-content-error');
	} else {
		$(elem).removeClass('form-field-content-error');
	}	
}

function showErrorOrPreviewModal(){
	if(errorInForm) {
		$("#errorModal").modal('show');
		$("#previewModal").modal('hide');
	} else {
		$("#errorModal").modal('hide');
		$("#previewModal").modal('show');
	}
}

function navBarClick(id){
	$(".fight-right-content").hide();
	$("#"+id).show();
	
	if(id == "my-assigned-task") {
		populateCaseProcessing();
	}
}

function highLightDropDownClass(elem) {
	$(".sidebar-dropdown-toggle").removeClass("sidebar-dropdown-toggle-active");
	$(elem).addClass("sidebar-dropdown-toggle-active");
}