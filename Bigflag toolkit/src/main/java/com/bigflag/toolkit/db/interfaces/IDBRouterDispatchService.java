/**
 * 
 */
package com.bigflag.toolkit.db.interfaces;

import com.bigflag.toolkit.db.beans.BaseDBBean;
import com.bigflag.toolkit.db.beans.BaseSQLQueryRouteInfo;

/***
 * This is the db router service to dispatch sql query request to different 
 * DB servers for distributed database archi
 * 
 * <br><br><br>
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
 *         Create at:2017年9月21日 下午1:30:04
 */
public interface IDBRouterDispatchService {
	public BaseSQLQueryRouteInfo findRouteInfo(BaseDBBean baseDBBean);
}
