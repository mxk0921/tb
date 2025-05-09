package com.alibaba.android.umbrella.trace;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UmbrellaInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> args;
    @JSONField(name = "sceneName")
    public String childBizName;
    public String featureType;
    public String invokePage;
    public String invokePageUrl;
    @JSONField(name = "bizName")
    public String mainBizName;
    public String samplingRate;
    @JSONField(name = "serviceId")
    public String tagId;
    @JSONField(name = "version")
    public String tagVersion;
    public String umbVersion;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f2394a;
        public String b;
        public final String c;
        public final String d;
        public final String e;
        public String f;
        public Map<String, String> g;

        public b(String str, String str2, String str3, String str4, String str5) {
            this.f2394a = str;
            this.b = str2;
            this.e = str3;
            this.c = str4;
            this.d = str5;
        }

        public UmbrellaInfo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UmbrellaInfo) ipChange.ipc$dispatch("64d1dfe0", new Object[]{this});
            }
            UmbrellaInfo umbrellaInfo = new UmbrellaInfo();
            umbrellaInfo.tagId = this.f2394a;
            umbrellaInfo.tagVersion = this.b;
            umbrellaInfo.mainBizName = this.c;
            umbrellaInfo.childBizName = this.d;
            umbrellaInfo.featureType = this.e;
            umbrellaInfo.samplingRate = null;
            umbrellaInfo.invokePage = null;
            umbrellaInfo.invokePageUrl = null;
            umbrellaInfo.args = this.g;
            umbrellaInfo.umbVersion = this.f;
            return umbrellaInfo;
        }

        public b b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("911c81ee", new Object[]{this, map});
            }
            if (map == null) {
                return this;
            }
            if (this.g == null) {
                this.g = new HashMap();
            }
            this.g.putAll(map);
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d8b53499", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7ee89b7f", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }

    private UmbrellaInfo() {
    }
}
