/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response.
 */
public class QueryFailure {
    /**
     * Error definition.
     */
    @JsonProperty(value = "error")
    private QueryFailureError error;

    /**
     * Get error definition.
     *
     * @return the error value
     */
    public QueryFailureError error() {
        return this.error;
    }

    /**
     * Set error definition.
     *
     * @param error the error value to set
     * @return the QueryFailure object itself.
     */
    public QueryFailure withError(QueryFailureError error) {
        this.error = error;
        return this;
    }

}
