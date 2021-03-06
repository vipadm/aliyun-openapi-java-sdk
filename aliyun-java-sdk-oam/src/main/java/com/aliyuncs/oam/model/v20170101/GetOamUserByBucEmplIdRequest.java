/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.oam.model.v20170101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetOamUserByBucEmplIdRequest extends RpcAcsRequest<GetOamUserByBucEmplIdResponse> {
	   

	private String bucEmplId;
	public GetOamUserByBucEmplIdRequest() {
		super("Oam", "2017-01-01", "GetOamUserByBucEmplId");
		setMethod(MethodType.POST);
	}

	public String getBucEmplId() {
		return this.bucEmplId;
	}

	public void setBucEmplId(String bucEmplId) {
		this.bucEmplId = bucEmplId;
		if(bucEmplId != null){
			putQueryParameter("BucEmplId", bucEmplId);
		}
	}

	@Override
	public Class<GetOamUserByBucEmplIdResponse> getResponseClass() {
		return GetOamUserByBucEmplIdResponse.class;
	}

}
