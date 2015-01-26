/*
 * Copyright 2014 Janith Bandara, This source is a part of Audit4j - 
 * An open-source audit platform for Enterprise java platform.
 * http://audit4j.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.audit4j.handler.db;

/**
 * The Enum ConnectionType
 *
 * @author <a href="mailto:janith3000@gmail.com">Janith Bandara</a>
 */
public enum ConnectionType {

    /** The single. */
    SINGLE, /** The pooled. */
 POOLED, /** The jndi. */
 JNDI;
}
