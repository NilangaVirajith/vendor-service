package com.stackscout.vendorservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.stackscout.vendorservice.common.VendorTypeSerializer;
import com.stackscout.vendorservice.common.VendorType;
import com.stackscout.vendorservice.common.VendorTypeDeserializer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "vendor")
public class Vendor
{
    @Id
    @JsonProperty
    private Integer id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String contactPerson;

    @JsonProperty
    private String contactNo;

    @JsonProperty
    private String email;

    @JsonDeserialize( converter = VendorTypeDeserializer.class )
    @JsonSerialize( converter = VendorTypeSerializer.class )
    private VendorType vendorType;
}
