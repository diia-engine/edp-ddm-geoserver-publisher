/*
 * Copyright 2023 EPAM Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.digital.data.platform.geoserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"@key", "$"})
public class MetadataEntry {
    private String atKey;
    private String value;

    public MetadataEntry() {
    }

    public MetadataEntry atKey(String atKey) {
        this.atKey = atKey;
        return this;
    }

    @JsonProperty("@key")
    @JsonInclude(Include.USE_DEFAULTS)
    public String getAtKey() {
        return this.atKey;
    }

    public void setAtKey(String atKey) {
        this.atKey = atKey;
    }

    public MetadataEntry value(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("$")
    @JsonInclude(Include.USE_DEFAULTS)
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
