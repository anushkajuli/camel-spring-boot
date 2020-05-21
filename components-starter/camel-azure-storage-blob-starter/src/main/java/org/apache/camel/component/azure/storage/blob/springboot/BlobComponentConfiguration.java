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
package org.apache.camel.component.azure.storage.blob.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.azure.storage.blob.BlobComponent;
import org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition;
import org.apache.camel.component.azure.storage.blob.BlobType;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Store and retrieve blobs from Azure Storage Blob Service using SDK v12.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.azure-storage-blob")
public class BlobComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the azure-storage-blob component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * The blob name, required for consumer. However on producer, is only
     * required for the operations on the blob level
     */
    private String blobName;
    /**
     * Set the blob offset for the upload or download operations, default is 0
     */
    private Long blobOffset = 0L;
    /**
     * The blob type in order to initiate the appropriate settings for each blob
     * type
     */
    private BlobType blobType = BlobType.blockblob;
    /**
     * Close the stream after read or keep it open, default is true
     */
    private Boolean closeStreamAfterRead = true;
    /**
     * The component configurations. The option is a
     * org.apache.camel.component.azure.storage.blob.BlobConfiguration type.
     */
    private String configuration;
    /**
     * StorageSharedKeyCredential can be injected to create the azure client,
     * this holds the important authentication information. The option is a
     * com.azure.storage.common.StorageSharedKeyCredential type.
     */
    private String credentials;
    /**
     * How many bytes to include in the range. Must be greater than or equal to
     * 0 if specified.
     */
    private Long dataCount;
    /**
     * The file directory where the downloaded blobs will be saved to, this can
     * be used in both, producer and consumer
     */
    private String fileDir;
    /**
     * Specifies the maximum number of additional HTTP Get requests that will be
     * made while reading the data from a response body.
     */
    private Integer maxRetryRequests = 0;
    /**
     * Client to a storage account. This client does not hold any state about a
     * particular storage account but is instead a convenient way of sending off
     * appropriate requests to the resource on the service. It may also be used
     * to construct URLs to blobs and containers. This client contains
     * operations on a service account. Operations on a container are available
     * on BlobContainerClient through getBlobContainerClient(String), and
     * operations on a blob are available on BlobClient through
     * getBlobContainerClient(String).getBlobClient(String). The option is a
     * com.azure.storage.blob.BlobServiceClient type.
     */
    private String serviceClient;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Close the stream after write or keep it open, default is true
     */
    private Boolean closeStreamAfterWrite = true;
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
     * The blob operation that can be used with this component on the producer
     */
    private BlobOperationsDefinition operation = BlobOperationsDefinition.listBlobContainers;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Access key for the associated azure account name to be used for
     * authentication with azure blob services
     */
    private String accessKey;

    public String getBlobName() {
        return blobName;
    }

    public void setBlobName(String blobName) {
        this.blobName = blobName;
    }

    public Long getBlobOffset() {
        return blobOffset;
    }

    public void setBlobOffset(Long blobOffset) {
        this.blobOffset = blobOffset;
    }

    public BlobType getBlobType() {
        return blobType;
    }

    public void setBlobType(BlobType blobType) {
        this.blobType = blobType;
    }

    public Boolean getCloseStreamAfterRead() {
        return closeStreamAfterRead;
    }

    public void setCloseStreamAfterRead(Boolean closeStreamAfterRead) {
        this.closeStreamAfterRead = closeStreamAfterRead;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public Long getDataCount() {
        return dataCount;
    }

    public void setDataCount(Long dataCount) {
        this.dataCount = dataCount;
    }

    public String getFileDir() {
        return fileDir;
    }

    public void setFileDir(String fileDir) {
        this.fileDir = fileDir;
    }

    public Integer getMaxRetryRequests() {
        return maxRetryRequests;
    }

    public void setMaxRetryRequests(Integer maxRetryRequests) {
        this.maxRetryRequests = maxRetryRequests;
    }

    public String getServiceClient() {
        return serviceClient;
    }

    public void setServiceClient(String serviceClient) {
        this.serviceClient = serviceClient;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getCloseStreamAfterWrite() {
        return closeStreamAfterWrite;
    }

    public void setCloseStreamAfterWrite(Boolean closeStreamAfterWrite) {
        this.closeStreamAfterWrite = closeStreamAfterWrite;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public BlobOperationsDefinition getOperation() {
        return operation;
    }

    public void setOperation(BlobOperationsDefinition operation) {
        this.operation = operation;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }
}