package com.csm.csmworks.api;

import com.csm.csmworks.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorksEndpointService {

    private final ConstructionSiteRepository constructionSiteRepository;

    private final WorksRegistryRepository worksRegistryRepository;

    private final ContractorRepository contractorRepository;

    public void addConstructionSite(String name) {
        constructionSiteRepository.save(new ConstructionSite(name));
    }

    public void addWorks(AddWorksRequest request) {
        worksRegistryRepository.save(new WorksRegistry(
                request.constructionSiteName,
                request.buildingName,
                WorksTypes.valueOf(request.worksType.toUpperCase()),
                request.contractor));
    }

    public void addContractor(AddContractorRequest request) {
        contractorRepository.save(new Contractor(request.name, request.worksType));
    }


}
