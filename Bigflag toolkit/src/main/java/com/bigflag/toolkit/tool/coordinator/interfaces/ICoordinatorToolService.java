/**
 * 
 */
package com.bigflag.toolkit.tool.coordinator.interfaces;

import java.util.List;

import com.bigflag.toolkit.tool.coordinator.beans.BaseCoordinatorConfigBean;

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
 *		   mail:     34223022@qq.com<br>
 *         Create at:2017年9月21日 下午1:21:08
 */
public interface ICoordinatorToolService {
	public boolean isInit();
	public boolean connectServer(BaseCoordinatorConfigBean configBean);
	public byte[] getNodeData(String nodePath,boolean repeatedWatchChange, OnDataWatchNodeChanged onDataWatchNodeChanged);
	public List<String> getNodeChildren(String nodePath,boolean repeatedWatchChange, OnDataWatchNodeChanged onDataWatchNodeChanged);
	public boolean existNode(String nodePath,boolean repeatedWatchChange, OnDataWatchNodeChanged onDataWatchNodeChanged);
	public boolean removePath(String nodePath);
	public boolean createPersistentPath(String nodePath,byte[] data,boolean isSequential);
	public boolean createEphemeralPath(String nodePath,byte[] data,boolean isSequential);
	public boolean setData(String nodePath,byte[] data);
	
	
	public interface OnDataWatchNodeChanged
	{
		public void processNodeChange(int eventType,String nodePath);
	}
}
