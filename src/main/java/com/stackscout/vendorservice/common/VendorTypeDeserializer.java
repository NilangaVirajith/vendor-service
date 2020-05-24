package com.stackscout.vendorservice.common;

import com.fasterxml.jackson.databind.util.StdConverter;

public class VendorTypeDeserializer extends StdConverter<String,VendorType>
{
    @Override
    public VendorType convert( String s )
    {
        return VendorType.valueOf( s );
    }
}
