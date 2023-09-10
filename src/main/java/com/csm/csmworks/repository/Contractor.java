package com.csm.csmworks.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor
public class Contractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "works_type")
    private WorksTypes worksTypes;

    public Contractor(String name, WorksTypes worksType) {
        this.name = name;
        this.worksTypes = worksType;
    }

}
