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
 * The persistent class for the user_exp_tbl database table.
 * Stores user expense - primary table 
 * secondary table where more details about this expense is stored is ExpDetail
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="user_exp_tbl")
@NamedQuery(name="UserExpTbl.findAll", query="SELECT u FROM UserExpTbl u")
public class UserExpTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_item_id")
	private int userItemId;

	private byte active;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="updated_on")
	private Timestamp updatedOn;

	@ManyToOne
	@JoinColumn(name="user_id")
	private UsrTbl usrTbl;

	@ManyToOne
	@JoinColumn(name="exp_item_id")
	private ExpItemTbl expItemTbl;

}