/**
 * Copyright (C) 2015 Cambridge Systematics, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.admin.service.bundle.task;

import com.conveyal.gtfs.model.InvalidValue;

public class InvalidValueHelper {

   
  public static String getCsvHeader() {
    return "affectedEntity,affectedField,affectedEntityId,problemType,problemDescription,problemData";
  }
  
  public static String getCsv(InvalidValue iv) {
    StringBuffer buff = new StringBuffer();
    buff.append(iv.affectedEntity);
    buff.append(",");
    buff.append(iv.affectedField);
    buff.append(",");
    buff.append(iv.affectedEntityId);
    buff.append(",");
    buff.append(iv.problemType);
    buff.append(",");
    buff.append(iv.problemDescription);
    buff.append(",");
    buff.append(iv.problemData);
    return buff.toString();
  }
  
}
