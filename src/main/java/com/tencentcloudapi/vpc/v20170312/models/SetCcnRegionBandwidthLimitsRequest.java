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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCcnRegionBandwidthLimitsRequest  extends AbstractModel{

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网（CCN）各地域出带宽上限。
    */
    @SerializedName("CcnRegionBandwidthLimits")
    @Expose
    private CcnRegionBandwidthLimit [] CcnRegionBandwidthLimits;

    /**
     * 获取CCN实例ID。形如：ccn-f49l6u0z。
     * @return CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * 设置CCN实例ID。形如：ccn-f49l6u0z。
     * @param CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * 获取云联网（CCN）各地域出带宽上限。
     * @return CcnRegionBandwidthLimits 云联网（CCN）各地域出带宽上限。
     */
    public CcnRegionBandwidthLimit [] getCcnRegionBandwidthLimits() {
        return this.CcnRegionBandwidthLimits;
    }

    /**
     * 设置云联网（CCN）各地域出带宽上限。
     * @param CcnRegionBandwidthLimits 云联网（CCN）各地域出带宽上限。
     */
    public void setCcnRegionBandwidthLimits(CcnRegionBandwidthLimit [] CcnRegionBandwidthLimits) {
        this.CcnRegionBandwidthLimits = CcnRegionBandwidthLimits;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "CcnRegionBandwidthLimits.", this.CcnRegionBandwidthLimits);

    }
}

