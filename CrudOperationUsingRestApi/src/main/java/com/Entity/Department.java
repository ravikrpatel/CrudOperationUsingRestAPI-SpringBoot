package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Depart")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int departId;
	private String departName;
	private String departCourse;
	private String departEmpname;
	

}
