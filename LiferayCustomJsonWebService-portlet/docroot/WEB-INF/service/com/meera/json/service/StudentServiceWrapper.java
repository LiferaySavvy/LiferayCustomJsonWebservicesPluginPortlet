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

package com.meera.json.service;

/**
 * <p>
 * This class is a wrapper for {@link StudentService}.
 * </p>
 *
 * @author    meera
 * @see       StudentService
 * @generated
 */
public class StudentServiceWrapper implements StudentService {
	public StudentServiceWrapper(StudentService studentService) {
		_studentService = studentService;
	}

	public com.meera.json.model.Student getStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentService.getStudent(studentId);
	}

	public StudentService getWrappedStudentService() {
		return _studentService;
	}

	private StudentService _studentService;
}