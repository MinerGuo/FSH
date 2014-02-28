package com.iac.vcb.market.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "miner_test")
public class TestDBEntity implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7797631880559599138L;

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment") 
	@Column(name = "id")
	private Integer id;

	@Column(name = "value")
	private String value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return id + "[" + value + "]";
	}
}
