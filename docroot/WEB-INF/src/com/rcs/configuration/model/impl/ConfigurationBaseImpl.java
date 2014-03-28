/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rcs.configuration.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.rcs.configuration.model.Configuration;
import com.rcs.configuration.service.ConfigurationLocalServiceUtil;

/**
 * The extended model base implementation for the Configuration service. Represents a row in the &quot;configuration_Configuration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ConfigurationImpl}.
 * </p>
 *
 * @author rotterdamcs
 * @see ConfigurationImpl
 * @see com.rcs.configuration.model.Configuration
 * @generated
 */
public abstract class ConfigurationBaseImpl extends ConfigurationModelImpl
	implements Configuration {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a configuration model instance should use the {@link Configuration} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConfigurationLocalServiceUtil.addConfiguration(this);
		}
		else {
			ConfigurationLocalServiceUtil.updateConfiguration(this);
		}
	}
}