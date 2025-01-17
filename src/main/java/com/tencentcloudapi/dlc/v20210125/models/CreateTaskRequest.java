/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskRequest extends AbstractModel{

    /**
    * 计算任务，该参数中包含任务类型及其相关配置信息
    */
    @SerializedName("Task")
    @Expose
    private Task Task;

    /**
    * 数据库名称。任务在执行前均会USE该数据库， 除了首次建库时，其他情况建议均添加上。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
     * Get 计算任务，该参数中包含任务类型及其相关配置信息 
     * @return Task 计算任务，该参数中包含任务类型及其相关配置信息
     */
    public Task getTask() {
        return this.Task;
    }

    /**
     * Set 计算任务，该参数中包含任务类型及其相关配置信息
     * @param Task 计算任务，该参数中包含任务类型及其相关配置信息
     */
    public void setTask(Task Task) {
        this.Task = Task;
    }

    /**
     * Get 数据库名称。任务在执行前均会USE该数据库， 除了首次建库时，其他情况建议均添加上。 
     * @return DatabaseName 数据库名称。任务在执行前均会USE该数据库， 除了首次建库时，其他情况建议均添加上。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称。任务在执行前均会USE该数据库， 除了首次建库时，其他情况建议均添加上。
     * @param DatabaseName 数据库名称。任务在执行前均会USE该数据库， 除了首次建库时，其他情况建议均添加上。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    public CreateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskRequest(CreateTaskRequest source) {
        if (source.Task != null) {
            this.Task = new Task(source.Task);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);

    }
}

