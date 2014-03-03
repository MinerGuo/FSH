package com.iac.vcb.market.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "miner_test")
public class TestDBEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7797631880559599138L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	@JsonProperty(value = "ID")
	private Integer id;

	@Column(name = "value")
	@JsonProperty(value = "Value")
	private String value;

	
	//非数据库字段，非json输出
	@Transient
	@JsonIgnore
	private String randStr = "this is random string";

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

	public String getRandStr() {
		return randStr;
	}

	public void setRandStr(String randStr) {
		this.randStr = randStr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return id + "[" + value + "]";
	}
}
