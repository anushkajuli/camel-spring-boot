/**
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
package org.apache.camel.processor.loadbalancer;

import java.util.List;

import org.apache.camel.Processor;

/**
 * A strategy for load balancing across a number of {@link Processor} instances
 *
 * @version $Revision$
 */
public interface LoadBalancer extends Processor {

    // TODO: Should leverage AsyncProcessor

    /**
     * Adds a new processor to the load balancer
     *
     * @param processor the processor to be added to the load balancer
     */
    void addProcessor(Processor processor);

    /**
     * Removes the given processor from the load balancer
     *
     * @param processor the processor to be removed from the load balancer
     */
    void removeProcessor(Processor processor);

    /**
     * Returns the current processors available to this load balancer
     *
     * @return the processors available
     */
    List<Processor> getProcessors();
}
