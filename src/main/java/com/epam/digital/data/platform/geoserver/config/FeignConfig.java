/*
 * Copyright 2023 EPAM Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.digital.data.platform.geoserver.config;

import com.epam.digital.data.platform.geoserver.client.GeoserverFeignClient;
import com.epam.digital.data.platform.geoserver.config.properties.GeoserverConfigProperties;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The class represents a configuration for feign client.
 */
@Configuration
@EnableFeignClients(basePackageClasses = GeoserverFeignClient.class)
public class FeignConfig {

  @Bean
  public BasicAuthRequestInterceptor basicAuthRequestInterceptor(
      GeoserverConfigProperties geoserverConfigProperties) {
    return new BasicAuthRequestInterceptor(
        geoserverConfigProperties.getLogin(), geoserverConfigProperties.getPassword());
  }
}
