package com.easyaccounting.expense.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the rec_rel_tbl database table.
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="rec_rel_tbl")
@NamedQuery(name="RecRelTbl.findAll", query="SELECT r FROM RecRelTbl r")
public class RecRelTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_map_id")
	private int recMapId;

	private int depth;

	//uni-directional many-to-one association to RecItemTbl
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ancestor_id", referencedColumnName="rec_item_id"),
		@JoinColumn(name="descendant_id", referencedColumnName="rec_item_id")
		})
	private RecItemTbl recItemTbl;

}