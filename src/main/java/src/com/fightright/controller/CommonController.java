package src.com.fightright.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import src.com.fightright.model.CaseProcessing;
import src.com.fightright.model.CaseProcessingResponse;
import src.com.fightright.model.District;
import src.com.fightright.model.PoliceStation;
import src.com.fightright.model.State;
import src.com.fightright.service.IFightRightService;

@RestController
@RequestMapping("/")
public class CommonController {

	@Autowired
	IFightRightService fightRightService;
	
	@GetMapping("/getAllStates")
	@ResponseBody
	List<State> getAllStates() {
		return fightRightService.getAllStates();
	}
	
	@GetMapping("/getAllDistricts")
	@ResponseBody
	List<District> getAllDistricts() {
		return fightRightService.getAllDistricts();
	}
	
	@GetMapping("/getAllPoliceStations")
	@ResponseBody
	List<PoliceStation> getAllPoliceStations() {
		return fightRightService.getAllPoliceStations();
	}
	
	@GetMapping("/getAllPoliceStationsByDistrict")
	@ResponseBody
	List<PoliceStation> getAllPoliceStations(@RequestParam long id) {
		return fightRightService.getAllPoliceStations(id);
	}
	
	@GetMapping("/getAllDistrictsByState")
	@ResponseBody
	List<District> getAllDistricts(@RequestParam long id) {
		return fightRightService.getAllDistricts(id);
	}
	
	@PostMapping("/addCaseProcessing")
	@ResponseBody
	CaseProcessingResponse addCaseProcessing(@RequestBody CaseProcessing caseProcessing) {
		return fightRightService.addCaseProcessing(caseProcessing);
	}
	
	@GetMapping("/getCaseProcessing")
	@ResponseBody
	List<CaseProcessing> getCaseProcessing() {
		return fightRightService.getAllCaseProcessing();
	}


}
