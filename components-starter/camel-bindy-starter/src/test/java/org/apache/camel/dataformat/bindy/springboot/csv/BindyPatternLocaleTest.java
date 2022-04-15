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
package org.apache.camel.dataformat.bindy.springboot.csv;

import java.util.Locale;

import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.dataformat.bindy.model.padding.Unity;
import org.apache.camel.spring.boot.CamelAutoConfiguration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.DirtiesContext;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;


@DirtiesContext
@CamelSpringBootTest
@SpringBootTest(
    classes = {
        CamelAutoConfiguration.class,
        BindyPatternLocaleTest.class,
        BindyPatternLocaleTest.TestConfiguration.class
    }
)
public class BindyPatternLocaleTest {

    @Autowired
    ProducerTemplate template;
    
    @EndpointInject("mock:marshal")
    MockEndpoint mock;
    
    private Locale origLocale;

    @BeforeEach
    public void setLanguage() {
        origLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    public void restoreLanguage() {
        Locale.setDefault(origLocale);
    }

    @Test
    public void testMarshalling1() throws Exception {
        mock.reset();
        mock.expectedMessageCount(1);
        mock.expectedBodiesReceived("050,010\r\n");

        Unity unity = new Unity();
        unity.setMandant(50f);
        unity.setReceiver(10f);
        template.sendBody("direct:marshal", unity);

        mock.assertIsSatisfied();
    }

    @Test
    public void testMarshalling2() throws Exception {
        mock.reset();
        mock.expectedMessageCount(1);
        mock.expectedBodiesReceived("080,001\r\n");

        Unity unity = new Unity();
        unity.setMandant(80f);
        unity.setReceiver(1f);
        template.sendBody("direct:marshal", unity);

        mock.assertIsSatisfied();
    }

    @Test
    public void testMarshalling3() throws Exception {
        mock.reset();
        mock.expectedMessageCount(1);
        mock.expectedBodiesReceived("000,000\r\n");

        Unity unity = new Unity();
        unity.setMandant(0f);
        unity.setReceiver(0f);
        template.sendBody("direct:marshal", unity);

        mock.assertIsSatisfied();
    }

    
    // *************************************
    // Config
    // *************************************

    @Configuration
    public static class TestConfiguration {

        @Bean
        public RouteBuilder routeBuilder() {
            return new RouteBuilder() {
                @Override
                public void configure() {
                    BindyCsvDataFormat bindy = new BindyCsvDataFormat(Unity.class);

                    // As recommended, when we use @Datafield Pattern we must
                    // specify the default locale
                    bindy.setLocale("default");

                    from("direct:marshal").marshal(bindy).to("mock:marshal");
                }
            };
        }
    }
    
    

}