// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract for entries that can be listed from Directory.
 */
@JacksonXmlRootElement(localName = "Entries")
@Fluent
@JsonDeserialize(using = CustomFileAndDirectoryListingDeserializer.class)
public final class FilesAndDirectoriesListSegment {
    /*
     * The directoryItems property.
     */
    @JsonProperty("Directory")
    private List<DirectoryItem> directoryItems = new ArrayList<>();

    /*
     * The fileItems property.
     */
    @JsonProperty("File")
    private List<FileItem> fileItems = new ArrayList<>();

    /**
     * Get the directoryItems property: The directoryItems property.
     *
     * @return the directoryItems value.
     */
    public List<DirectoryItem> getDirectoryItems() {
        return this.directoryItems;
    }

    /**
     * Set the directoryItems property: The directoryItems property.
     *
     * @param directoryItems the directoryItems value to set.
     * @return the FilesAndDirectoriesListSegment object itself.
     */
    public FilesAndDirectoriesListSegment setDirectoryItems(List<DirectoryItem> directoryItems) {
        this.directoryItems = directoryItems;
        return this;
    }

    /**
     * Get the fileItems property: The fileItems property.
     *
     * @return the fileItems value.
     */
    public List<FileItem> getFileItems() {
        return this.fileItems;
    }

    /**
     * Set the fileItems property: The fileItems property.
     *
     * @param fileItems the fileItems value to set.
     * @return the FilesAndDirectoriesListSegment object itself.
     */
    public FilesAndDirectoriesListSegment setFileItems(List<FileItem> fileItems) {
        this.fileItems = fileItems;
        return this;
    }
}
