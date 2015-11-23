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

package com.meera.json.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import com.meera.json.model.Student;

import java.util.List;

/**
 * @author    meera
 * @generated
 */
public class StudentJSONSerializer {
	public static JSONObject toJSONObject(Student model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("studentId", model.getStudentId());
		jsonObj.put("studentName", model.getStudentName());

		return jsonObj;
	}

	public static JSONArray toJSONArray(com.meera.json.model.Student[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Student model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(com.meera.json.model.Student[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Student[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.meera.json.model.Student> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Student model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}