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
 * The persistent class for the user_rec_tbl database table.
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="user_rec_tbl")
@NamedQuery(name="UserRecTbl.findAll", query="SELECT u FROM UserRecTbl u")
public class UserRecTbl implements Serializable {
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

	//uni-directional many-to-one association to UsrTbl
	@ManyToOne
	@JoinColumn(name="user_id")
	private UsrTbl usrTbl;

	//uni-directional many-to-one association to RecItemTbl
	@ManyToOne
	@JoinColumn(name="rec_item_id")
	private RecItemTbl recItemTbl;

}