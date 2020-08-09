package com.easyaccounting.expense.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * The persistent class for the exp_details database table.
 * 
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="exp_details")
@NamedQuery(name="ExpDetail.findAll", query="SELECT e FROM ExpDetail e")
@Data
public class ExpDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="exp_id")
	private int expId;

	private byte active;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Temporal(TemporalType.DATE)
	@Column(name="due_date")
	private Date dueDate;

	@Column(name="exp_amount")
	private BigDecimal expAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="exp_description")
	private String expDescription;

	@Temporal(TemporalType.DATE)
	@Column(name="submission_date")
	private Date submissionDate;

	@Column(name="updated_on")
	private Timestamp updatedOn;

	//uni-directional many-to-one association to UsrTbl
	@ManyToOne
	@JoinColumn(name="user_id")
	private UsrTbl usrTbl;

	//uni-directional many-to-one association to UserExpTbl
	@ManyToOne
	@JoinColumn(name="user_item_id")
	private UserExpTbl userExpTbl;


}