package com.easyaccounting.expense.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the rec_item_tbl database table.
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="rec_item_tbl")
@NamedQuery(name="RecItemTbl.findAll", query="SELECT r FROM RecItemTbl r")
public class RecItemTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_item_id")
	private int recItemId;

	private byte active;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="rec_item_code")
	private String recItemCode;

	@Column(name="rec_item_desc")
	private String recItemDesc;

	@Column(name="rec_item_name")
	private String recItemName;

	@Column(name="updated_on")
	private Timestamp updatedOn;

}