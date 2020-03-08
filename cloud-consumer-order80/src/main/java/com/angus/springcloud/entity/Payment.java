package com.angus.springcloud.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author angus
 * @create 2020-03-07 15:07
 */
@Entity
@Data
public class Payment implements Serializable {
	private static final long serialVersionUID = 451692081860554665L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String serial;

}
