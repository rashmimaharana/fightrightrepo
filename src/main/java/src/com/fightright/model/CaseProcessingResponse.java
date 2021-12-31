package src.com.fightright.model;

import java.io.Serializable;

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
public class CaseProcessingResponse implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@JsonProperty("message")
	String message;

	@JsonProperty("status")
	String status;

}
