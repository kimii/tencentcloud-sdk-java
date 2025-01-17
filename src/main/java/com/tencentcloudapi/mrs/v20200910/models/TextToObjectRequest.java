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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToObjectRequest extends AbstractModel{

    /**
    * 报告文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 报告类型，目前支持12（检查报告单），15（病理报告），218（诊断证明）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为False，则Type字段不能为0，否则无法输出结果。
    */
    @SerializedName("IsUsedClassify")
    @Expose
    private Boolean IsUsedClassify;

    /**
     * Get 报告文本 
     * @return Text 报告文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 报告文本
     * @param Text 报告文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 报告类型，目前支持12（检查报告单），15（病理报告），218（诊断证明）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果） 
     * @return Type 报告类型，目前支持12（检查报告单），15（病理报告），218（诊断证明）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 报告类型，目前支持12（检查报告单），15（病理报告），218（诊断证明）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果）
     * @param Type 报告类型，目前支持12（检查报告单），15（病理报告），218（诊断证明）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为False，则Type字段不能为0，否则无法输出结果。 
     * @return IsUsedClassify 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为False，则Type字段不能为0，否则无法输出结果。
     */
    public Boolean getIsUsedClassify() {
        return this.IsUsedClassify;
    }

    /**
     * Set 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为False，则Type字段不能为0，否则无法输出结果。
     * @param IsUsedClassify 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为False，则Type字段不能为0，否则无法输出结果。
     */
    public void setIsUsedClassify(Boolean IsUsedClassify) {
        this.IsUsedClassify = IsUsedClassify;
    }

    public TextToObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToObjectRequest(TextToObjectRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsUsedClassify != null) {
            this.IsUsedClassify = new Boolean(source.IsUsedClassify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsUsedClassify", this.IsUsedClassify);

    }
}

