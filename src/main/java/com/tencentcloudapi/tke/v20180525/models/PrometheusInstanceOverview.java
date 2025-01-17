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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstanceOverview extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 实例子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例当前的状态
prepare_env = 初始化环境
install_suit = 安装组件
running = 运行中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * COS桶存储
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例vpcId 
     * @return VpcId 实例vpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例vpcId
     * @param VpcId 实例vpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 实例子网Id 
     * @return SubnetId 实例子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 实例子网Id
     * @param SubnetId 实例子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例当前的状态
prepare_env = 初始化环境
install_suit = 安装组件
running = 运行中 
     * @return Status 实例当前的状态
prepare_env = 初始化环境
install_suit = 安装组件
running = 运行中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例当前的状态
prepare_env = 初始化环境
install_suit = 安装组件
running = 运行中
     * @param Status 实例当前的状态
prepare_env = 初始化环境
install_suit = 安装组件
running = 运行中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get COS桶存储 
     * @return COSBucket COS桶存储
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set COS桶存储
     * @param COSBucket COS桶存储
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    public PrometheusInstanceOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstanceOverview(PrometheusInstanceOverview source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.COSBucket != null) {
            this.COSBucket = new String(source.COSBucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);

    }
}

