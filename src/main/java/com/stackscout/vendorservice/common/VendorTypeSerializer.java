package com.stackscout.vendorservice.common;

import com.fasterxml.jackson.databind.util.StdConverter;

public class VendorTypeSerializer extends StdConverter<VendorType, String>
{
    @Override
    public String convert( VendorType vendorType )
    {
        return vendorType.toString();
    }
}
