package com.csm.csmworks.api;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddWorksRequest {

    String constructionSiteName;
    String buildingName;
    String worksType;
    String contractor;

}
