package com.easyaccounting.expense.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the exp_item_tbl database table.
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="exp_item_tbl")
@NamedQuery(name="ExpItemTbl.findAll", query="SELECT e FROM ExpItemTbl e")
public class ExpItemTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="exp_item_id")
	private int expItemId;

	private byte active;

	@Column(name="created_on")
	private Timestamp createdOn;
	
	private int depth;
	
	@ManyToOne
	@JoinColumn(name="parent_id", referencedColumnName="exp_item_id")
	private ExpItemTbl expItemTbl;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_desc")
	private String itemDesc;

	@Column(name="item_name")
	private String itemName;

	@Column(name="updated_on")
	private Timestamp updatedOn;

	

}