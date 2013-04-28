package edu.ie.alvaro.reflection;

import java.lang.reflect.Field;

public class Bean {

	private String field1;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Field[] fields;
		
		sb.append("Class name: ").append(this.getClass().getName()).append('\n');
		fields = this.getClass().getDeclaredFields();
		
		for (Field field: fields) {
			sb.append("Field name: ").append(field.getName()).append('\n');
		}
		
		return sb.toString();
	}
}
