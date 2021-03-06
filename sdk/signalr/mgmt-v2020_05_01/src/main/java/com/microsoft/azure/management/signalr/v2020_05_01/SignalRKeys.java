/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.signalr.v2020_05_01.implementation.SignalRManager;
import com.microsoft.azure.management.signalr.v2020_05_01.implementation.SignalRKeysInner;

/**
 * Type representing SignalRKeys.
 */
public interface SignalRKeys extends HasInner<SignalRKeysInner>, HasManager<SignalRManager> {
    /**
     * @return the primaryConnectionString value.
     */
    String primaryConnectionString();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the secondaryConnectionString value.
     */
    String secondaryConnectionString();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

}
