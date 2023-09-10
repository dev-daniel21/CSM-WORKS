package com.csm.csmworks.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public
class WorksRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "construction_site")
    private String constructionSite;

    @Column(name = "building_name")
    private String buildingName;

    @Enumerated(EnumType.STRING)
    @Column(name = "works_type")
    private WorksTypes worksType;

    @Column(name = "contractor")
    private String contractor;

    public WorksRegistry(String constructionSite, String buildingName, WorksTypes worksType, String contractor) {
        this.constructionSite = constructionSite;
        this.buildingName = buildingName;
        this.worksType = worksType;
        this.contractor = contractor;
    }

}
