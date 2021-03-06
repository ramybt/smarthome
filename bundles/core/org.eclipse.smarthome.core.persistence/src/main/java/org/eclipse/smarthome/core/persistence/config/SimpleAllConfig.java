/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.core.persistence.config;

/**
 * This class represents the configuration that stand for "using all items".
 *
 * @author Markus Rathgeb - Initial contribution and API
 */
public class SimpleAllConfig extends SimpleConfig {

    @Override
    public String toString() {
        return String.format("%s []", getClass().getSimpleName());
    }

}
