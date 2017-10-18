/**
 * 
 */
package com.bigflag.toolkit.tool.coordinator.beans;
/***
 * 
 * Copyright 2017-2027 the original author or authors.
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
 *
 * @author Eric,Liu<br> 
 *   mail:     34223022@qq.com<br>
 *         Create at:2017��9��21�� ����1:22:10
 */
public final class BaseCoordinatorConfigBean {
	private final String connectUrl;
	private final int timeout;


	public String getConnectUrl(){
		return this.connectUrl;
	}

	public int getTimeout(){
		return this.timeout;
	}

	private BaseCoordinatorConfigBean(Builder builder) {
		super();
		this.connectUrl = builder.connectUrl;
		this.timeout = builder.timeout;
	}

	public static class Builder{
		private String connectUrl;
		private int timeout;
	

		public Builder connectUrl(String connectUrl){
			this.connectUrl=connectUrl;
			return this;
		}	

		public Builder timeout(int timeout){
			this.timeout=timeout;
			return this;
		}

		public BaseCoordinatorConfigBean build(){
			return new BaseCoordinatorConfigBean(this);
		}
	}

}