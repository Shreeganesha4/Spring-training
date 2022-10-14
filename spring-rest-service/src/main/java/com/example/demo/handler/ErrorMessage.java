package com.example.demo.handler;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@AllArgsConstructor
@NoArgsConstructor
@Data

@FieldDefaults(level=AccessLevel.PRIVATE)
public class ErrorMessage {
	
	String cause;
	LocalDateTime dateTime;
	String message;

}
