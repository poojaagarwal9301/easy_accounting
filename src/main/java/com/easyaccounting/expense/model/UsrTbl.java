package com.easyaccounting.expense.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the usr_tbl database table.
 * Stores detail for the user of application
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="usr_tbl")
@NamedQuery(name="UsrTbl.findAll", query="SELECT u FROM UsrTbl u")
public class UsrTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	private byte active;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="updated_on")
	private Timestamp updatedOn;

}