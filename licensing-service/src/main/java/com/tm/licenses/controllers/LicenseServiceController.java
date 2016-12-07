package com.tm.licenses.controllers;

import com.tm.licenses.config.ServiceConfig;
import com.tm.licenses.model.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @Autowired
    ServiceConfig config;



    @RequestMapping(value="/{licenseId}", method=RequestMethod.GET)
    public License getLicenses(
        @PathVariable("organizationId") String organizationId,
        @PathVariable("licenseId") String licenseId
    ) {
        License l = new License()
            .withId(licenseId)
            .withProductName("Teleco")
            .withLicenseType("Seat")
            .withOrganizationId("TestOrg");

        return l.withComment(config.getExampleProperty());

    }
}