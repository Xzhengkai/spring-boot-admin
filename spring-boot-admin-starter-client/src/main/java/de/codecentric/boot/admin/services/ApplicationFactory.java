/*
 * Copyright 201 6the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.codecentric.boot.admin.services;

import de.codecentric.boot.admin.model.Application;

/**
 * Classes implementing this interface are responsible for creating an {@link Application} class
 * which is used to register at the admin server.
 *
 * @author Johannes Edmeier
 */
public interface ApplicationFactory {
	/**
	 * @return {@link Application} instance;
	 */
	Application createApplication();

}