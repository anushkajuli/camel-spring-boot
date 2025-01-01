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
package org.apache.camel.component.mllp.springboot;

import org.apache.camel.ExchangePattern;
import org.apache.camel.component.mllp.MllpComponent;
import org.apache.camel.component.mllp.MllpConfiguration;
import org.apache.camel.component.mllp.MllpIdleTimeoutStrategy;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.support.jsse.SSLContextParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Communicate with external systems using the MLLP protocol.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.mllp")
public class MllpComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the mllp component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Enable/Disable the automatic generation of a MLLP Acknowledgement MLLP
     * Consumers only
     */
    private Boolean autoAck = true;
    /**
     * Sets the default charset to use
     */
    private String charsetName;
    /**
     * Sets the default configuration to use when creating MLLP endpoints. The
     * option is a org.apache.camel.component.mllp.MllpConfiguration type.
     */
    private MllpConfiguration configuration;
    /**
     * Enable/Disable the automatic generation of message headers from the HL7
     * Message MLLP Consumers only
     */
    private Boolean hl7Headers = true;
    /**
     * Enable/Disable strict compliance to the MLLP standard. The MLLP standard
     * specifies START_OF_BLOCKhl7 payloadEND_OF_BLOCKEND_OF_DATA, however, some
     * systems do not send the final END_OF_DATA byte. This setting controls
     * whether or not the final END_OF_DATA byte is required or optional.
     */
    private Boolean requireEndOfData = true;
    /**
     * Enable/Disable converting the payload to a String. If enabled, HL7
     * Payloads received from external systems will be validated converted to a
     * String. If the charsetName property is set, that character set will be
     * used for the conversion. If the charsetName property is not set, the
     * value of MSH-18 will be used to determine th appropriate character set.
     * If MSH-18 is not set, then the default ISO-8859-1 character set will be
     * use.
     */
    private Boolean stringPayload = true;
    /**
     * Enable/Disable the validation of HL7 Payloads If enabled, HL7 Payloads
     * received from external systems will be validated (see
     * Hl7Util.generateInvalidPayloadExceptionMessage for details on the
     * validation). If and invalid payload is detected, a
     * MllpInvalidMessageException (for consumers) or a
     * MllpInvalidAcknowledgementException will be thrown.
     */
    private Boolean validatePayload = false;
    /**
     * Timeout (in milliseconds) while waiting for a TCP connection TCP Server
     * Only
     */
    private Integer acceptTimeout = 60000;
    /**
     * The maximum queue length for incoming connection indications (a request
     * to connect) is set to the backlog parameter. If a connection indication
     * arrives when the queue is full, the connection is refused.
     */
    private Integer backlog = 5;
    /**
     * TCP Server Only - The number of milliseconds to wait between bind
     * attempts
     */
    private Integer bindRetryInterval = 5000;
    /**
     * TCP Server Only - The number of milliseconds to retry binding to a server
     * port
     */
    private Integer bindTimeout = 30000;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to
     * receive incoming messages, or the likes, will now be processed as a
     * message and handled by the routing Error Handler. If disabled, the
     * consumer will use the org.apache.camel.spi.ExceptionHandler to deal with
     * exceptions by logging them at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = true;
    /**
     * TCP Server Only - Allow the endpoint to start before the TCP ServerSocket
     * is bound. In some environments, it may be desirable to allow the endpoint
     * to start before the TCP ServerSocket is bound.
     */
    private Boolean lenientBind = false;
    /**
     * The maximum number of concurrent MLLP Consumer connections that will be
     * allowed. If a new connection is received and the maximum is number are
     * already established, the new connection will be reset immediately.
     */
    private Integer maxConcurrentConsumers = 5;
    /**
     * Enable/disable the SO_REUSEADDR socket option.
     */
    private Boolean reuseAddress = false;
    /**
     * Sets the exchange pattern when the consumer creates an exchange.
     */
    private ExchangePattern exchangePattern = ExchangePattern.InOut;
    /**
     * Timeout (in milliseconds) for establishing for a TCP connection TCP
     * Client only
     */
    private Integer connectTimeout = 30000;
    /**
     * decide what action to take when idle timeout occurs. Possible values are
     * : RESET: set SO_LINGER to 0 and reset the socket CLOSE: close the socket
     * gracefully default is RESET.
     */
    private MllpIdleTimeoutStrategy idleTimeoutStrategy = MllpIdleTimeoutStrategy.RESET;
    /**
     * Enable/disable the SO_KEEPALIVE socket option.
     */
    private Boolean keepAlive = true;
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
     * Enable/disable the TCP_NODELAY socket option.
     */
    private Boolean tcpNoDelay = true;
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
     * Set the default character set to use for byte to/from String conversions.
     */
    private String defaultCharset = "ISO-8859-1";
    /**
     * Whether to log PHI
     */
    private Boolean logPhi = true;
    /**
     * Set the maximum number of bytes of PHI that will be logged in a log
     * entry.
     */
    private Integer logPhiMaxBytes = 5120;
    /**
     * Maximum buffer size used when receiving or sending data over the wire.
     */
    private Integer maxBufferSize = 1073741824;
    /**
     * Minimum buffer size used when receiving or sending data over the wire.
     */
    private Integer minBufferSize = 2048;
    /**
     * The SO_TIMEOUT value (in milliseconds) used after the start of an MLLP
     * frame has been received
     */
    private Integer readTimeout = 5000;
    /**
     * Sets the SO_RCVBUF option to the specified value (in bytes)
     */
    private Integer receiveBufferSize = 8192;
    /**
     * The SO_TIMEOUT value (in milliseconds) used when waiting for the start of
     * an MLLP frame
     */
    private Integer receiveTimeout = 15000;
    /**
     * Sets the SO_SNDBUF option to the specified value (in bytes)
     */
    private Integer sendBufferSize = 8192;
    /**
     * Sets the SSLContextParameters for securing TCP connections. If set, the
     * MLLP component will use SSL/TLS for securing both producer and consumer
     * TCP connections. This allows the configuration of trust stores, key
     * stores, protocols, and other SSL/TLS settings. If not set, the MLLP
     * component will use plain TCP communication. The option is a
     * org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private SSLContextParameters sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * The approximate idle time allowed before the Client TCP Connection will
     * be reset. A null value or a value less than or equal to zero will disable
     * the idle timeout.
     */
    private Integer idleTimeout;

    public Boolean getAutoAck() {
        return autoAck;
    }

    public void setAutoAck(Boolean autoAck) {
        this.autoAck = autoAck;
    }

    public String getCharsetName() {
        return charsetName;
    }

    public void setCharsetName(String charsetName) {
        this.charsetName = charsetName;
    }

    public MllpConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(MllpConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getHl7Headers() {
        return hl7Headers;
    }

    public void setHl7Headers(Boolean hl7Headers) {
        this.hl7Headers = hl7Headers;
    }

    public Boolean getRequireEndOfData() {
        return requireEndOfData;
    }

    public void setRequireEndOfData(Boolean requireEndOfData) {
        this.requireEndOfData = requireEndOfData;
    }

    public Boolean getStringPayload() {
        return stringPayload;
    }

    public void setStringPayload(Boolean stringPayload) {
        this.stringPayload = stringPayload;
    }

    public Boolean getValidatePayload() {
        return validatePayload;
    }

    public void setValidatePayload(Boolean validatePayload) {
        this.validatePayload = validatePayload;
    }

    public Integer getAcceptTimeout() {
        return acceptTimeout;
    }

    public void setAcceptTimeout(Integer acceptTimeout) {
        this.acceptTimeout = acceptTimeout;
    }

    public Integer getBacklog() {
        return backlog;
    }

    public void setBacklog(Integer backlog) {
        this.backlog = backlog;
    }

    public Integer getBindRetryInterval() {
        return bindRetryInterval;
    }

    public void setBindRetryInterval(Integer bindRetryInterval) {
        this.bindRetryInterval = bindRetryInterval;
    }

    public Integer getBindTimeout() {
        return bindTimeout;
    }

    public void setBindTimeout(Integer bindTimeout) {
        this.bindTimeout = bindTimeout;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getLenientBind() {
        return lenientBind;
    }

    public void setLenientBind(Boolean lenientBind) {
        this.lenientBind = lenientBind;
    }

    public Integer getMaxConcurrentConsumers() {
        return maxConcurrentConsumers;
    }

    public void setMaxConcurrentConsumers(Integer maxConcurrentConsumers) {
        this.maxConcurrentConsumers = maxConcurrentConsumers;
    }

    public Boolean getReuseAddress() {
        return reuseAddress;
    }

    public void setReuseAddress(Boolean reuseAddress) {
        this.reuseAddress = reuseAddress;
    }

    public ExchangePattern getExchangePattern() {
        return exchangePattern;
    }

    public void setExchangePattern(ExchangePattern exchangePattern) {
        this.exchangePattern = exchangePattern;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public MllpIdleTimeoutStrategy getIdleTimeoutStrategy() {
        return idleTimeoutStrategy;
    }

    public void setIdleTimeoutStrategy(
            MllpIdleTimeoutStrategy idleTimeoutStrategy) {
        this.idleTimeoutStrategy = idleTimeoutStrategy;
    }

    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getTcpNoDelay() {
        return tcpNoDelay;
    }

    public void setTcpNoDelay(Boolean tcpNoDelay) {
        this.tcpNoDelay = tcpNoDelay;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public String getDefaultCharset() {
        return defaultCharset;
    }

    public void setDefaultCharset(String defaultCharset) {
        this.defaultCharset = defaultCharset;
    }

    public Boolean getLogPhi() {
        return logPhi;
    }

    public void setLogPhi(Boolean logPhi) {
        this.logPhi = logPhi;
    }

    public Integer getLogPhiMaxBytes() {
        return logPhiMaxBytes;
    }

    public void setLogPhiMaxBytes(Integer logPhiMaxBytes) {
        this.logPhiMaxBytes = logPhiMaxBytes;
    }

    public Integer getMaxBufferSize() {
        return maxBufferSize;
    }

    public void setMaxBufferSize(Integer maxBufferSize) {
        this.maxBufferSize = maxBufferSize;
    }

    public Integer getMinBufferSize() {
        return minBufferSize;
    }

    public void setMinBufferSize(Integer minBufferSize) {
        this.minBufferSize = minBufferSize;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Integer getReceiveBufferSize() {
        return receiveBufferSize;
    }

    public void setReceiveBufferSize(Integer receiveBufferSize) {
        this.receiveBufferSize = receiveBufferSize;
    }

    public Integer getReceiveTimeout() {
        return receiveTimeout;
    }

    public void setReceiveTimeout(Integer receiveTimeout) {
        this.receiveTimeout = receiveTimeout;
    }

    public Integer getSendBufferSize() {
        return sendBufferSize;
    }

    public void setSendBufferSize(Integer sendBufferSize) {
        this.sendBufferSize = sendBufferSize;
    }

    public SSLContextParameters getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(
            SSLContextParameters sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }
}