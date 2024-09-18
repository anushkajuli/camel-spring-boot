/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.jetty12.springboot;

import java.util.LinkedHashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.stereotype.Component;

/**
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Configuration(proxyBeanMethods = false)
@ConfigurationPropertiesBinding
@Component
public class JettyHttpComponentConverter12 implements GenericConverter {

    @Autowired
    private ApplicationContext applicationContext;

    public Set<ConvertiblePair> getConvertibleTypes() {
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, org.eclipse.jetty.util.thread.ThreadPool.class));
        answer.add(new ConvertiblePair(String.class, org.eclipse.jetty.server.handler.ErrorHandler.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.http.common.HttpBinding.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.http.common.HttpConfiguration.class));
        answer.add(new ConvertiblePair(String.class, org.eclipse.jetty.jmx.MBeanContainer.class));
        answer.add(new ConvertiblePair(String.class, org.eclipse.jetty.server.RequestLog.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.spi.HeaderFilterStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.support.jsse.SSLContextParameters.class));
        return answer;
    }

    public Object convert(
            Object source,
            TypeDescriptor sourceType,
            TypeDescriptor targetType) {
        if (source == null) {
            return null;
        }
        String ref = source.toString();
        if (!ref.startsWith("#")) {
            return null;
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.eclipse.jetty.util.thread.ThreadPool": return applicationContext.getBean(ref, org.eclipse.jetty.util.thread.ThreadPool.class);
            case "org.eclipse.jetty.server.handler.ErrorHandler": return applicationContext.getBean(ref, org.eclipse.jetty.server.handler.ErrorHandler.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.eclipse.jetty.jmx.MBeanContainer": return applicationContext.getBean(ref, org.eclipse.jetty.jmx.MBeanContainer.class);
            case "org.eclipse.jetty.server.RequestLog": return applicationContext.getBean(ref, org.eclipse.jetty.server.RequestLog.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
    }
}