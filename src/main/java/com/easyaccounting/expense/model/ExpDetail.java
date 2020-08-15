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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the exp_details database table.
 * Stores details about expense paid or to be paid
 * 
 */
@Entity
@Table(name="exp_details")
@NamedQuery(name="ExpDetail.findAll", query="SELECT e FROM ExpDetail e")
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
	
	@Column(name="exp_name")
	private String expName;
	
	@Column(name="is_paid", columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isPaid = false;
	
	@Column(name="paid_by")
	private String paidBy;
	
	@Column(name="paid_to")
	private String paidTo;
	
	@Column(name="pay_trans_number")
	private String payTransNumber;
	
	@Column(name="partial_amt_left")
	private BigDecimal partialAmtLeft;
	
	@Column(name="partially_paid", columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean partiallyPaid = false;
	
	@Column(name="partial_paid_amt")
	private BigDecimal partialPaidAmt;
	
	@Temporal(TemporalType.DATE)
	@Column(name="submission_date")
	private Date submissionDate;

	@Column(name="updated_on")
	private Timestamp updatedOn;

	@ManyToOne
	@JoinColumn(name="user_id")
	private UsrTbl usrTbl;

	@OneToOne
	@JoinColumn(name="user_item_id")
	private UserExpTbl userExpTbl;

	public ExpDetail() {
	}

	public int getExpId() {
		return expId;
	}

	public void setExpId(int expId) {
		this.expId = expId;
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

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getExpAmount() {
		return expAmount;
	}

	public void setExpAmount(BigDecimal expAmount) {
		this.expAmount = expAmount;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getExpDescription() {
		return expDescription;
	}

	public void setExpDescription(String expDescription) {
		this.expDescription = expDescription;
	}

	public String getExpName() {
		return expName;
	}

	public void setExpName(String expName) {
		this.expName = expName;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public String getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
	}

	public String getPaidTo() {
		return paidTo;
	}

	public void setPaidTo(String paidTo) {
		this.paidTo = paidTo;
	}

	public String getPayTransNumber() {
		return payTransNumber;
	}

	public void setPayTransNumber(String payTransNumber) {
		this.payTransNumber = payTransNumber;
	}

	public BigDecimal getPartialAmtLeft() {
		return partialAmtLeft;
	}

	public void setPartialAmtLeft(BigDecimal partialAmtLeft) {
		this.partialAmtLeft = partialAmtLeft;
	}

	public boolean isPartiallyPaid() {
		return partiallyPaid;
	}

	public void setPartiallyPaid(boolean partiallyPaid) {
		this.partiallyPaid = partiallyPaid;
	}

	public BigDecimal getPartialPaidAmt() {
		return partialPaidAmt;
	}

	public void setPartialPaidAmt(BigDecimal partialPaidAmt) {
		this.partialPaidAmt = partialPaidAmt;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Timestamp getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public UsrTbl getUsrTbl() {
		return usrTbl;
	}

	public void setUsrTbl(UsrTbl usrTbl) {
		this.usrTbl = usrTbl;
	}

	public UserExpTbl getUserExpTbl() {
		return userExpTbl;
	}

	public void setUserExpTbl(UserExpTbl userExpTbl) {
		this.userExpTbl = userExpTbl;
	}
	
	
	
	


}