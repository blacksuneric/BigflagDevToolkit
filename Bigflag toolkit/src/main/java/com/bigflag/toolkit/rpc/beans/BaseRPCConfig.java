/**
 * 
 */
package com.bigflag.toolkit.rpc.beans;
/**
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
 *         Create at:2017��10��14�� ����8:44:52
 */
public class BaseRPCConfig {
	private final String esbURL;
	private final int timeout;
	private final String esbServiceRootPath;


	public String getEsbURL(){
		return this.esbURL;
	}

	public int getTimeout(){
		return this.timeout;
	}
	

	public String getEsbServiceRootPath() {
		return esbServiceRootPath;
	}

	private BaseRPCConfig(Builder builder) {
		super();
		this.esbURL = builder.esbURL;
		this.timeout = builder.timeout;
		this.esbServiceRootPath=builder.esbServiceRootPath;
	}

	public static class Builder{
		private String esbURL;
		private int timeout;
		private String esbServiceRootPath;
	
		public Builder(String esbServiceRootPath)
		{
			this.esbServiceRootPath=esbServiceRootPath;
		}

		public Builder esbURL(String esbURL){
			this.esbURL=esbURL;
			return this;
		}	

		public Builder timeout(int timeout){
			this.timeout=timeout;
			return this;
		}

		public BaseRPCConfig build(){
			return new BaseRPCConfig(this);
		}
	}

}