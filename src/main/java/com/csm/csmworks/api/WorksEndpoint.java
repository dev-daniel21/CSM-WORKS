package com.csm.csmworks.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("works")
@RequiredArgsConstructor
class WorksEndpoint {

    private final WorksEndpointService worksEndpointService;

    @PostMapping("/addConstructionSite")
    void addConstructionSite(@RequestParam String name) {

        worksEndpointService.addConstructionSite(name);
    }

    @PostMapping("/addWorks")
    void addWorks(@RequestBody AddWorksRequest request) {

        worksEndpointService.addWorks(request);
    }


    @PostMapping("/addContractor")
    void addContractor(@RequestBody AddContractorRequest request) {

        worksEndpointService.addContractor(request);
    }

    // get all construction site

    // get all works

    // get all contractors


}
