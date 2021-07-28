package one.digitalinnovation.personapi.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
	
	@JsonProperty("Home")
	HOME(),
	@JsonProperty("Mobile")
	MOBILE(),
	@JsonProperty("Commercial")
	COMMERCIAL();
	
	
}
