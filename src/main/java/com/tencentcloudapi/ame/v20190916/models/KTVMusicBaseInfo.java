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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVMusicBaseInfo extends AbstractModel{

    /**
    * 歌曲 Id
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 歌曲名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 演唱者列表
    */
    @SerializedName("SingerSet")
    @Expose
    private String [] SingerSet;

    /**
    * 作词者列表
    */
    @SerializedName("LyricistSet")
    @Expose
    private String [] LyricistSet;

    /**
    * 作曲者列表
    */
    @SerializedName("ComposerSet")
    @Expose
    private String [] ComposerSet;

    /**
    * 标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
     * Get 歌曲 Id 
     * @return MusicId 歌曲 Id
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 歌曲 Id
     * @param MusicId 歌曲 Id
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get 歌曲名称 
     * @return Name 歌曲名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 歌曲名称
     * @param Name 歌曲名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 演唱者列表 
     * @return SingerSet 演唱者列表
     */
    public String [] getSingerSet() {
        return this.SingerSet;
    }

    /**
     * Set 演唱者列表
     * @param SingerSet 演唱者列表
     */
    public void setSingerSet(String [] SingerSet) {
        this.SingerSet = SingerSet;
    }

    /**
     * Get 作词者列表 
     * @return LyricistSet 作词者列表
     */
    public String [] getLyricistSet() {
        return this.LyricistSet;
    }

    /**
     * Set 作词者列表
     * @param LyricistSet 作词者列表
     */
    public void setLyricistSet(String [] LyricistSet) {
        this.LyricistSet = LyricistSet;
    }

    /**
     * Get 作曲者列表 
     * @return ComposerSet 作曲者列表
     */
    public String [] getComposerSet() {
        return this.ComposerSet;
    }

    /**
     * Set 作曲者列表
     * @param ComposerSet 作曲者列表
     */
    public void setComposerSet(String [] ComposerSet) {
        this.ComposerSet = ComposerSet;
    }

    /**
     * Get 标签列表 
     * @return TagSet 标签列表
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表
     * @param TagSet 标签列表
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    public KTVMusicBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMusicBaseInfo(KTVMusicBaseInfo source) {
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SingerSet != null) {
            this.SingerSet = new String[source.SingerSet.length];
            for (int i = 0; i < source.SingerSet.length; i++) {
                this.SingerSet[i] = new String(source.SingerSet[i]);
            }
        }
        if (source.LyricistSet != null) {
            this.LyricistSet = new String[source.LyricistSet.length];
            for (int i = 0; i < source.LyricistSet.length; i++) {
                this.LyricistSet[i] = new String(source.LyricistSet[i]);
            }
        }
        if (source.ComposerSet != null) {
            this.ComposerSet = new String[source.ComposerSet.length];
            for (int i = 0; i < source.ComposerSet.length; i++) {
                this.ComposerSet[i] = new String(source.ComposerSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SingerSet.", this.SingerSet);
        this.setParamArraySimple(map, prefix + "LyricistSet.", this.LyricistSet);
        this.setParamArraySimple(map, prefix + "ComposerSet.", this.ComposerSet);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);

    }
}

