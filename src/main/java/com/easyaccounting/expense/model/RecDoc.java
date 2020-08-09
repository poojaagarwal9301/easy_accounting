package com.easyaccounting.expense.model;

import java.io.Serializable;
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
 * The persistent class for the rec_doc database table.
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="rec_doc")
@NamedQuery(name="RecDoc.findAll", query="SELECT r FROM RecDoc r")
public class RecDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_doc_id")
	private int recDocId;

	private byte active;

	@Column(name="rec_doc_desc")
	private int recDocDesc;

	@Temporal(TemporalType.DATE)
	@Column(name="rec_doc_name")
	private Date recDocName;

	@Column(name="rec_doc_path")
	private String recDocPath;

	//uni-directional many-to-one association to RecDetail
	@ManyToOne
	@JoinColumn(name="rec_id")
	private RecDetail recDetail;


}