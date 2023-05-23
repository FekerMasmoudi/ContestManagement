package tn.soretras.contestmanagement.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ContestField {
	
	// Primary Key
				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				
				//define a cloumns of entity contestfield
				@Column 
				private int id;
				
				@Column
				private String name;
				
				@Column
				private String type;
				
				@Column
				private boolean mandatory;
				
				@Column
				private int reference;
				
				@Column
				private String fopconstraint;
				
				@Column 
				private String fvalue;
				
				@Column
				private String sopconstraint;
				
				@Column
				private String svalue;
				
				//define a foreign key
				@ManyToOne(optional=false)
				@JoinColumn(name="idcontest", referencedColumnName="id")
				private Contest contest;
				
				//define a getters and setters
				public int getId() {
					return id;
				}

				public void setId(int id) {
					this.id = id;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public boolean isMandatory() {
					return mandatory;
				}

				public void setMandatory(boolean mandatory) {
					this.mandatory = mandatory;
				}

				public int getReference() {
					return reference;
				}

				public void setReference(int reference) {
					this.reference = reference;
				}

				public String getFopconstraint() {
					return fopconstraint;
				}

				public void setFopconstraint(String fopconstraint) {
					this.fopconstraint = fopconstraint;
				}

				public String getFvalue() {
					return fvalue;
				}

				public void setFvalue(String fvalue) {
					this.fvalue = fvalue;
				}

				public String getSopconstraint() {
					return sopconstraint;
				}

				public void setSopconstraint(String sopconstraint) {
					this.sopconstraint = sopconstraint;
				}

				public String getSvalue() {
					return svalue;
				}

				public void setSvalue(String svalue) {
					this.svalue = svalue;
				}

				public Contest getContest() {
					return contest;
				}

				public void setContest(Contest contest) {
					this.contest = contest;
				}
				
				//generate method toString()
				@Override
				public String toString() {
					return "ContestField [id=" + id + ", name=" + name + ", type=" + type + ", mandatory=" + mandatory
							+ ", reference=" + reference + ", fopconstraint=" + fopconstraint + ", fvalue=" + fvalue
							+ ", sopconstraint=" + sopconstraint + ", svalue=" + svalue + ", contest=" + contest + "]";
				}

}
