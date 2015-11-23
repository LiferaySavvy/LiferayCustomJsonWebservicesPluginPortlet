/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.meera.json.service.impl;

import com.meera.json.service.StudentLocalServiceUtil;
import com.meera.json.service.base.StudentServiceBaseImpl;

/**
 * The implementation of the student remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.meera.json.service.StudentService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.meera.json.service.StudentServiceUtil} to access the student remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author meera
 * @see com.meera.json.service.base.StudentServiceBaseImpl
 * @see com.meera.json.service.StudentServiceUtil
 */
public class StudentServiceImpl extends StudentServiceBaseImpl {
	
	public com.meera.json.model.Student getStudent(long studentId)
	throws com.liferay.portal.kernel.exception.PortalException,
		com.liferay.portal.kernel.exception.SystemException {
	return StudentLocalServiceUtil.getStudent(studentId);
}
}