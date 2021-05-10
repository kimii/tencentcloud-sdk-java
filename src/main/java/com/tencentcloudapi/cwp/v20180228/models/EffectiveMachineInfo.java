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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EffectiveMachineInfo extends AbstractModel{

    /**
    * 机器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachinePublicIp")
    @Expose
    private String MachinePublicIp;

    /**
    * 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachinePrivateIp")
    @Expose
    private String MachinePrivateIp;

    /**
    * 机器标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineTag")
    @Expose
    private MachineTag [] MachineTag;

    /**
    * 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 机器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineName 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineName 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachinePublicIp 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachinePublicIp() {
        return this.MachinePublicIp;
    }

    /**
     * Set 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachinePublicIp 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachinePublicIp(String MachinePublicIp) {
        this.MachinePublicIp = MachinePublicIp;
    }

    /**
     * Get 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachinePrivateIp 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachinePrivateIp() {
        return this.MachinePrivateIp;
    }

    /**
     * Set 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachinePrivateIp 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachinePrivateIp(String MachinePrivateIp) {
        this.MachinePrivateIp = MachinePrivateIp;
    }

    /**
     * Get 机器标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineTag 机器标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineTag [] getMachineTag() {
        return this.MachineTag;
    }

    /**
     * Set 机器标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineTag 机器标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineTag(MachineTag [] MachineTag) {
        this.MachineTag = MachineTag;
    }

    /**
     * Get 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuid 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuid 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachinePublicIp", this.MachinePublicIp);
        this.setParamSimple(map, prefix + "MachinePrivateIp", this.MachinePrivateIp);
        this.setParamArrayObj(map, prefix + "MachineTag.", this.MachineTag);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}
