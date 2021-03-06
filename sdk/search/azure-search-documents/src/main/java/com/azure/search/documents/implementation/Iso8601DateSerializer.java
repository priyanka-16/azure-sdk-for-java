// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Custom serializer to serialize {@link java.util.Date} to Iso8601 standard date format "yyyy-MM-dd'T'hh:mm:ss.SSS'Z'".
 */
final class Iso8601DateSerializer extends JsonSerializer<Date> {

    /**
     * Gets a module wrapping this serializer as an adapter for the Jackson
     * ObjectMapper.
     *
     * @return a simple module to be plugged onto Jackson ObjectMapper.
     */
    public static SimpleModule getModule() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Date.class, new Iso8601DateSerializer());
        return module;
    }

    /**
     * Serializes the date value to service accepted iso8601 format with UTC time zone.
     *
     * @param dateValue The {@link java.util.Date} value.
     * @param gen Generator used to output resulting Json content
     * @param serializers Provider that can be used to get serializers for serializing Objects value contains, if any.
     * @throws IOException Throws exception when the dateValue cannot convert to json content.
     */
    @Override
    public void serialize(Date dateValue, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        String dateString = dateValue.toInstant().atOffset(ZoneOffset.UTC)
            .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        gen.writeString(dateString);
    }
}
