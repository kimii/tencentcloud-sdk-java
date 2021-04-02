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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpStatusMap extends AbstractModel{

    /**
    * http2xx状态码
    */
    @SerializedName("Http2xx")
    @Expose
    private Float [] Http2xx;

    /**
    * http3xx状态码
    */
    @SerializedName("Http3xx")
    @Expose
    private Float [] Http3xx;

    /**
    * http404状态码
    */
    @SerializedName("Http404")
    @Expose
    private Float [] Http404;

    /**
    * http4xx状态码
    */
    @SerializedName("Http4xx")
    @Expose
    private Float [] Http4xx;

    /**
    * http5xx状态码
    */
    @SerializedName("Http5xx")
    @Expose
    private Float [] Http5xx;

    /**
    * http2xx回源状态码
    */
    @SerializedName("SourceHttp2xx")
    @Expose
    private Float [] SourceHttp2xx;

    /**
    * http3xx回源状态码
    */
    @SerializedName("SourceHttp3xx")
    @Expose
    private Float [] SourceHttp3xx;

    /**
    * http404回源状态码
    */
    @SerializedName("SourceHttp404")
    @Expose
    private Float [] SourceHttp404;

    /**
    * http4xx回源状态码
    */
    @SerializedName("SourceHttp4xx")
    @Expose
    private Float [] SourceHttp4xx;

    /**
    * http5xx回源状态码
    */
    @SerializedName("SourceHttp5xx")
    @Expose
    private Float [] SourceHttp5xx;

    /**
     * Get http2xx状态码 
     * @return Http2xx http2xx状态码
     */
    public Float [] getHttp2xx() {
        return this.Http2xx;
    }

    /**
     * Set http2xx状态码
     * @param Http2xx http2xx状态码
     */
    public void setHttp2xx(Float [] Http2xx) {
        this.Http2xx = Http2xx;
    }

    /**
     * Get http3xx状态码 
     * @return Http3xx http3xx状态码
     */
    public Float [] getHttp3xx() {
        return this.Http3xx;
    }

    /**
     * Set http3xx状态码
     * @param Http3xx http3xx状态码
     */
    public void setHttp3xx(Float [] Http3xx) {
        this.Http3xx = Http3xx;
    }

    /**
     * Get http404状态码 
     * @return Http404 http404状态码
     */
    public Float [] getHttp404() {
        return this.Http404;
    }

    /**
     * Set http404状态码
     * @param Http404 http404状态码
     */
    public void setHttp404(Float [] Http404) {
        this.Http404 = Http404;
    }

    /**
     * Get http4xx状态码 
     * @return Http4xx http4xx状态码
     */
    public Float [] getHttp4xx() {
        return this.Http4xx;
    }

    /**
     * Set http4xx状态码
     * @param Http4xx http4xx状态码
     */
    public void setHttp4xx(Float [] Http4xx) {
        this.Http4xx = Http4xx;
    }

    /**
     * Get http5xx状态码 
     * @return Http5xx http5xx状态码
     */
    public Float [] getHttp5xx() {
        return this.Http5xx;
    }

    /**
     * Set http5xx状态码
     * @param Http5xx http5xx状态码
     */
    public void setHttp5xx(Float [] Http5xx) {
        this.Http5xx = Http5xx;
    }

    /**
     * Get http2xx回源状态码 
     * @return SourceHttp2xx http2xx回源状态码
     */
    public Float [] getSourceHttp2xx() {
        return this.SourceHttp2xx;
    }

    /**
     * Set http2xx回源状态码
     * @param SourceHttp2xx http2xx回源状态码
     */
    public void setSourceHttp2xx(Float [] SourceHttp2xx) {
        this.SourceHttp2xx = SourceHttp2xx;
    }

    /**
     * Get http3xx回源状态码 
     * @return SourceHttp3xx http3xx回源状态码
     */
    public Float [] getSourceHttp3xx() {
        return this.SourceHttp3xx;
    }

    /**
     * Set http3xx回源状态码
     * @param SourceHttp3xx http3xx回源状态码
     */
    public void setSourceHttp3xx(Float [] SourceHttp3xx) {
        this.SourceHttp3xx = SourceHttp3xx;
    }

    /**
     * Get http404回源状态码 
     * @return SourceHttp404 http404回源状态码
     */
    public Float [] getSourceHttp404() {
        return this.SourceHttp404;
    }

    /**
     * Set http404回源状态码
     * @param SourceHttp404 http404回源状态码
     */
    public void setSourceHttp404(Float [] SourceHttp404) {
        this.SourceHttp404 = SourceHttp404;
    }

    /**
     * Get http4xx回源状态码 
     * @return SourceHttp4xx http4xx回源状态码
     */
    public Float [] getSourceHttp4xx() {
        return this.SourceHttp4xx;
    }

    /**
     * Set http4xx回源状态码
     * @param SourceHttp4xx http4xx回源状态码
     */
    public void setSourceHttp4xx(Float [] SourceHttp4xx) {
        this.SourceHttp4xx = SourceHttp4xx;
    }

    /**
     * Get http5xx回源状态码 
     * @return SourceHttp5xx http5xx回源状态码
     */
    public Float [] getSourceHttp5xx() {
        return this.SourceHttp5xx;
    }

    /**
     * Set http5xx回源状态码
     * @param SourceHttp5xx http5xx回源状态码
     */
    public void setSourceHttp5xx(Float [] SourceHttp5xx) {
        this.SourceHttp5xx = SourceHttp5xx;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Http2xx.", this.Http2xx);
        this.setParamArraySimple(map, prefix + "Http3xx.", this.Http3xx);
        this.setParamArraySimple(map, prefix + "Http404.", this.Http404);
        this.setParamArraySimple(map, prefix + "Http4xx.", this.Http4xx);
        this.setParamArraySimple(map, prefix + "Http5xx.", this.Http5xx);
        this.setParamArraySimple(map, prefix + "SourceHttp2xx.", this.SourceHttp2xx);
        this.setParamArraySimple(map, prefix + "SourceHttp3xx.", this.SourceHttp3xx);
        this.setParamArraySimple(map, prefix + "SourceHttp404.", this.SourceHttp404);
        this.setParamArraySimple(map, prefix + "SourceHttp4xx.", this.SourceHttp4xx);
        this.setParamArraySimple(map, prefix + "SourceHttp5xx.", this.SourceHttp5xx);

    }
}

