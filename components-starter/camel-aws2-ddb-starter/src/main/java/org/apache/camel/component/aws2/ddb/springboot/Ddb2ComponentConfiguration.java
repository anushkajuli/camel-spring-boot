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
package org.apache.camel.component.aws2.ddb.springboot;

import org.apache.camel.component.aws2.ddb.Ddb2Component;
import org.apache.camel.component.aws2.ddb.Ddb2Configuration;
import org.apache.camel.component.aws2.ddb.Ddb2Operations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import software.amazon.awssdk.core.Protocol;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

/**
 * Store and retrieve data from AWS DynamoDB service using AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.aws2-ddb")
public class Ddb2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws2-ddb component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the AmazonDynamoDB as the client. The option is a
     * software.amazon.awssdk.services.dynamodb.DynamoDbClient type.
     */
    private DynamoDbClient amazonDDBClient;
    /**
     * The component configuration. The option is a
     * org.apache.camel.component.aws2.ddb.Ddb2Configuration type.
     */
    private Ddb2Configuration configuration;
    /**
     * Determines whether or not strong consistency should be enforced when data
     * is read.
     */
    private Boolean consistentRead = false;
    /**
     * Set whether the initial Describe table operation in the DDB Endpoint must
     * be done, or not.
     */
    private Boolean enabledInitialDescribeTable = true;
    /**
     * Attribute name when creating table
     */
    private String keyAttributeName;
    /**
     * Attribute type when creating table
     */
    private String keyAttributeType;
    /**
     * The key scalar type, it can be S (String), N (Number) and B (Bytes)
     */
    private String keyScalarType;
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
     * What operation to perform
     */
    private Ddb2Operations operation = Ddb2Operations.PutItem;
    /**
     * Set the need for overidding the endpoint. This option needs to be used in
     * combination with uriEndpointOverride option
     */
    private Boolean overrideEndpoint = false;
    /**
     * If using a profile credentials provider this parameter will set the
     * profile name
     */
    private String profileCredentialsName;
    /**
     * To define a proxy host when instantiating the DDB client
     */
    private String proxyHost;
    /**
     * The region in which DynamoDB client needs to work. When using this
     * parameter, the configuration will expect the lowercase name of the region
     * (for example ap-east-1) You'll need to use the name Region.EU_WEST_1.id()
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the DDB client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * The provisioned throughput to reserve for reading resources from your
     * table
     */
    private Long readCapacity;
    /**
     * The region in which DDB client needs to work
     */
    private String region;
    /**
     * If we want to trust all certificates in case of overriding the endpoint
     */
    private Boolean trustAllCertificates = false;
    /**
     * Set the overriding uri endpoint. This option needs to be used in
     * combination with overrideEndpoint option
     */
    private String uriEndpointOverride;
    /**
     * Set whether the S3 client should expect to load credentials through a
     * default credentials provider or to expect static credentials to be passed
     * in.
     */
    private Boolean useDefaultCredentialsProvider = false;
    /**
     * Set whether the DDB client should expect to load credentials through a
     * profile credentials provider.
     */
    private Boolean useProfileCredentialsProvider = false;
    /**
     * The provisioned throughput to reserved for writing resources to your
     * table
     */
    private Long writeCapacity;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;

    public DynamoDbClient getAmazonDDBClient() {
        return amazonDDBClient;
    }

    public void setAmazonDDBClient(DynamoDbClient amazonDDBClient) {
        this.amazonDDBClient = amazonDDBClient;
    }

    public Ddb2Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Ddb2Configuration configuration) {
        this.configuration = configuration;
    }

    public Boolean getConsistentRead() {
        return consistentRead;
    }

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    public Boolean getEnabledInitialDescribeTable() {
        return enabledInitialDescribeTable;
    }

    public void setEnabledInitialDescribeTable(
            Boolean enabledInitialDescribeTable) {
        this.enabledInitialDescribeTable = enabledInitialDescribeTable;
    }

    public String getKeyAttributeName() {
        return keyAttributeName;
    }

    public void setKeyAttributeName(String keyAttributeName) {
        this.keyAttributeName = keyAttributeName;
    }

    public String getKeyAttributeType() {
        return keyAttributeType;
    }

    public void setKeyAttributeType(String keyAttributeType) {
        this.keyAttributeType = keyAttributeType;
    }

    public String getKeyScalarType() {
        return keyScalarType;
    }

    public void setKeyScalarType(String keyScalarType) {
        this.keyScalarType = keyScalarType;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Ddb2Operations getOperation() {
        return operation;
    }

    public void setOperation(Ddb2Operations operation) {
        this.operation = operation;
    }

    public Boolean getOverrideEndpoint() {
        return overrideEndpoint;
    }

    public void setOverrideEndpoint(Boolean overrideEndpoint) {
        this.overrideEndpoint = overrideEndpoint;
    }

    public String getProfileCredentialsName() {
        return profileCredentialsName;
    }

    public void setProfileCredentialsName(String profileCredentialsName) {
        this.profileCredentialsName = profileCredentialsName;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    public Long getReadCapacity() {
        return readCapacity;
    }

    public void setReadCapacity(Long readCapacity) {
        this.readCapacity = readCapacity;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getTrustAllCertificates() {
        return trustAllCertificates;
    }

    public void setTrustAllCertificates(Boolean trustAllCertificates) {
        this.trustAllCertificates = trustAllCertificates;
    }

    public String getUriEndpointOverride() {
        return uriEndpointOverride;
    }

    public void setUriEndpointOverride(String uriEndpointOverride) {
        this.uriEndpointOverride = uriEndpointOverride;
    }

    public Boolean getUseDefaultCredentialsProvider() {
        return useDefaultCredentialsProvider;
    }

    public void setUseDefaultCredentialsProvider(
            Boolean useDefaultCredentialsProvider) {
        this.useDefaultCredentialsProvider = useDefaultCredentialsProvider;
    }

    public Boolean getUseProfileCredentialsProvider() {
        return useProfileCredentialsProvider;
    }

    public void setUseProfileCredentialsProvider(
            Boolean useProfileCredentialsProvider) {
        this.useProfileCredentialsProvider = useProfileCredentialsProvider;
    }

    public Long getWriteCapacity() {
        return writeCapacity;
    }

    public void setWriteCapacity(Long writeCapacity) {
        this.writeCapacity = writeCapacity;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}