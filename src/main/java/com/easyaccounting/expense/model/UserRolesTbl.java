package com.easyaccounting.expense.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
 * The persistent class for the user_roles_tbl database table.
 * Maps user to roles he is assigned like admin or user
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="user_roles_tbl")
@NamedQuery(name="UserRolesTbl.findAll", query="SELECT u FROM UserRolesTbl u")
public class UserRolesTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mapping_id")
	private int mappingId;

	//uni-directional many-to-one association to UsrTbl
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="user_id")
	private UsrTbl usrTbl;

	//uni-directional many-to-one association to RoleTbl
	@ManyToOne
	@JoinColumn(name="role_id")
	private RoleTbl roleTbl;

}