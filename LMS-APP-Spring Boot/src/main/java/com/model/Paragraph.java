package com.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "paragraph")
public class Paragraph {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
   @ManyToOne
   @JoinColumn(name = "section_id")
   private Section section;
    private String paragraphContent;
    private boolean completed=false;

}