package src.com.fightright.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class District implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("id")
	long id;
	
	@JsonProperty("state_id")
	long state_fk;

	@JsonProperty("name")
	String name;

}
