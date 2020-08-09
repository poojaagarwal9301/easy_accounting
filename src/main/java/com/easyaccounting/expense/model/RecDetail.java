package com.easyaccounting.expense.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the rec_details database table.
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="rec_details")
@NamedQuery(name="RecDetail.findAll", query="SELECT r FROM RecDetail r")
public class RecDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_id")
	private int recId;

	private byte active;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="rec_description")
	private String recDescription;

	@Temporal(TemporalType.DATE)
	@Column(name="rec_generation_date")
	private Date recGenerationDate;

	@Column(name="updated_on")
	private Timestamp updatedOn;

	//uni-directional many-to-one association to UsrTbl
	@ManyToOne
	@JoinColumn(name="user_id")
	private UsrTbl usrTbl;

	//uni-directional many-to-one association to UserRecTbl
	@ManyToOne
	@JoinColumn(name="user_item_id")
	private UserRecTbl userRecTbl;

}