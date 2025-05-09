package com.taobao.update.instantpatch.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InstantUpdateInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String baseVersion;
    public boolean beta;
    public boolean channelProcNeedRestart;
    public String contentBase64;
    public String httpsUrl;
    public String md5;
    public String name;
    public String patchUrl;
    public String patchVersion;
    public String priority;
    public boolean rollback;
    public String size;
    public String type;

    static {
        t2o.a(952107030);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstantUpdateInfo instantUpdateInfo = (InstantUpdateInfo) obj;
        if (this.patchUrl.equals(instantUpdateInfo.patchUrl) && this.size.equals(instantUpdateInfo.size) && this.priority.equals(instantUpdateInfo.priority) && this.baseVersion.equals(instantUpdateInfo.baseVersion) && this.httpsUrl.equals(instantUpdateInfo.httpsUrl) && this.type.equals(instantUpdateInfo.type) && this.patchVersion.equals(instantUpdateInfo.patchVersion)) {
            return this.md5.equals(instantUpdateInfo.md5);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((((((((this.patchUrl.hashCode() * 31) + this.size.hashCode()) * 31) + this.priority.hashCode()) * 31) + this.baseVersion.hashCode()) * 31) + this.httpsUrl.hashCode()) * 31) + this.type.hashCode()) * 31) + this.patchVersion.hashCode()) * 31) + this.md5.hashCode();
    }

    public static InstantUpdateInfo create(JSONObject jSONObject) {
        String str;
        String str2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantUpdateInfo) ipChange.ipc$dispatch("cc3d89fb", new Object[]{jSONObject});
        }
        InstantUpdateInfo instantUpdateInfo = new InstantUpdateInfo();
        if (jSONObject == null) {
            return instantUpdateInfo;
        }
        instantUpdateInfo.channelProcNeedRestart = jSONObject.containsKey("channelProcNeedRestart") ? Boolean.parseBoolean(jSONObject.getString("channelProcNeedRestart")) : false;
        if (jSONObject.containsKey("rollback")) {
            instantUpdateInfo.rollback = true;
            return instantUpdateInfo;
        }
        if (jSONObject.containsKey("beta")) {
            z = Boolean.valueOf(jSONObject.getString("beta")).booleanValue();
        }
        instantUpdateInfo.beta = z;
        String str3 = "";
        if (jSONObject.containsKey("httpsUrl")) {
            instantUpdateInfo.patchUrl = jSONObject.getString("httpsUrl");
            instantUpdateInfo.httpsUrl = jSONObject.getString("httpsUrl");
        } else if (jSONObject.containsKey("patchUrl")) {
            instantUpdateInfo.patchUrl = jSONObject.getString("patchUrl");
            instantUpdateInfo.httpsUrl = str3;
        } else {
            instantUpdateInfo.patchUrl = str3;
            instantUpdateInfo.httpsUrl = str3;
        }
        instantUpdateInfo.contentBase64 = jSONObject.containsKey("contentBase64") ? jSONObject.getString("contentBase64") : str3;
        instantUpdateInfo.size = jSONObject.containsKey("size") ? jSONObject.getString("size") : str3;
        if (jSONObject.containsKey("priority")) {
            str = jSONObject.getString("priority");
        } else {
            str = "0";
        }
        instantUpdateInfo.priority = str;
        instantUpdateInfo.baseVersion = jSONObject.containsKey("baseVersion") ? jSONObject.getString("baseVersion") : str3;
        instantUpdateInfo.type = jSONObject.containsKey("type") ? jSONObject.getString("type") : str3;
        instantUpdateInfo.patchVersion = jSONObject.containsKey("patchVersion") ? jSONObject.getString("patchVersion") : str3;
        if (jSONObject.containsKey("md5")) {
            str3 = jSONObject.getString("md5");
        }
        instantUpdateInfo.md5 = str3;
        if (jSONObject.containsKey("name")) {
            str2 = jSONObject.getString("name");
        } else {
            str2 = instantUpdateInfo.baseVersion + "@" + instantUpdateInfo.baseVersion + ".ipatch";
        }
        instantUpdateInfo.name = str2;
        return instantUpdateInfo;
    }
}
