package com.angus.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2020-03-07 18:09:54
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