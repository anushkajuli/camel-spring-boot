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
package org.apache.camel.component.lucene.springboot;

import java.io.File;
import java.net.URI;
import javax.annotation.Generated;
import org.apache.camel.component.lucene.LuceneOperation;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.util.Version;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * To insert or query from Apache Lucene databases.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.lucene")
public class LuceneComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the lucene component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use a shared lucene configuration
     */
    private LuceneConfigurationNestedConfiguration config;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public LuceneConfigurationNestedConfiguration getConfig() {
        return config;
    }

    public void setConfig(LuceneConfigurationNestedConfiguration config) {
        this.config = config;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class LuceneConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.lucene.LuceneConfiguration.class;
        /**
         * An Analyzer builds TokenStreams, which analyze text. It thus
         * represents a policy for extracting index terms from text. The value
         * for analyzer can be any class that extends the abstract class
         * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
         * analyzers out of the box
         */
        private Analyzer analyzer;
        private String authority;
        /**
         * The URL to the lucene server
         */
        private String host;
        /**
         * A file system directory in which index files are created upon
         * analysis of the document by the specified analyzer
         */
        private File indexDir;
        private Version luceneVersion;
        /**
         * An integer value that limits the result set of the search operation
         */
        private Integer maxHits;
        /**
         * Operation to do such as insert or query.
         */
        private LuceneOperation operation;
        /**
         * An optional directory containing files to be used to be analyzed and
         * added to the index at producer startup.
         */
        private File srcDir;
        private URI uri;

        public Analyzer getAnalyzer() {
            return analyzer;
        }

        public void setAnalyzer(Analyzer analyzer) {
            this.analyzer = analyzer;
        }

        public String getAuthority() {
            return authority;
        }

        public void setAuthority(String authority) {
            this.authority = authority;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public File getIndexDir() {
            return indexDir;
        }

        public void setIndexDir(File indexDir) {
            this.indexDir = indexDir;
        }

        public Version getLuceneVersion() {
            return luceneVersion;
        }

        public void setLuceneVersion(Version luceneVersion) {
            this.luceneVersion = luceneVersion;
        }

        public Integer getMaxHits() {
            return maxHits;
        }

        public void setMaxHits(Integer maxHits) {
            this.maxHits = maxHits;
        }

        public LuceneOperation getOperation() {
            return operation;
        }

        public void setOperation(LuceneOperation operation) {
            this.operation = operation;
        }

        public File getSrcDir() {
            return srcDir;
        }

        public void setSrcDir(File srcDir) {
            this.srcDir = srcDir;
        }

        public URI getUri() {
            return uri;
        }

        public void setUri(URI uri) {
            this.uri = uri;
        }
    }
}