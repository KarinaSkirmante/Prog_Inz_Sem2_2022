package lv.venta.demo.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Subject {
        
        @Setter(value=AccessLevel.NONE)
        @Column(name="IdSubj")
    	@Id
    	@GeneratedValue(strategy=GenerationType.AUTO)
        private int idSubj;
        
        @Column(name="CP")
        private int CP;
        
        @Column(name="Title")
        private String title;
         
        
             
        @OneToOne
        @JoinColumn(name="IdProf")
        private Professor professor;
        
        @OneToMany(mappedBy="subject")
        @ToString.Exclude
        private Collection<Grade> grades;
        
        
        public Subject(String title, int CP, Professor professor) {
                this.title =        title;
                this.CP =                CP;
                this.professor =         professor;
        }
}

