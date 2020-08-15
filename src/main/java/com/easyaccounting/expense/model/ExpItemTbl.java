package com.easyaccounting.expense.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the exp_item_tbl database table.
 * Lists all types of expenses
 * 
 */
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
	@JoinColumn(name="parent_id")
	private ExpItemTbl parentExpense;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_desc")
	private String itemDesc;

	@Column(name="item_name")
	private String itemName;

	@Column(name="updated_on")
	private Timestamp updatedOn;
	
	@OneToMany(mappedBy="parentExpense")
	private Set<ExpItemTbl> subordinates = new HashSet<ExpItemTbl>();
	
	public ExpItemTbl() {
		
	}

	public int getExpItemId() {
		return expItemId;
	}

	public void setExpItemId(int expItemId) {
		this.expItemId = expItemId;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public ExpItemTbl getParentExpense() {
		return parentExpense;
	}

	public void setParentExpense(ExpItemTbl parentExpense) {
		this.parentExpense = parentExpense;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Timestamp getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	

	

}