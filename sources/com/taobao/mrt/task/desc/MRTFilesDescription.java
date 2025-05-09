package com.taobao.mrt.task.desc;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Objects;
import tb.mqh;
import tb.nqh;
import tb.t2o;
import tb.vs3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MRTFilesDescription extends MRTResourceDescription {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> files;

    static {
        t2o.a(577765430);
    }

    public MRTFilesDescription(Map<String, String> map, String str, String str2, MRTTaskDescription mRTTaskDescription) {
        super(str, str2, mRTTaskDescription);
        this.files = map;
        this.resourceRootDirectory = mqh.c;
        this.resourceName = this.associatedTask.name;
        this.resourceMask = MRTResourceDescription.MRTResourceFiles;
        this.resourceOperation = new nqh(this);
        this.resourceType = "resource";
    }

    public static /* synthetic */ Object ipc$super(MRTFilesDescription mRTFilesDescription, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/task/desc/MRTFilesDescription");
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
        MRTFilesDescription mRTFilesDescription = (MRTFilesDescription) obj;
        if (!Objects.equals(this.resourceName, mRTFilesDescription.resourceName) || !Objects.equals(this.fmd5, mRTFilesDescription.fmd5) || !Objects.equals(this.furl, mRTFilesDescription.furl)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.mrt.task.desc.MRTResourceDescription
    public String getValidationMD5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d738e3aa", new Object[]{this});
        }
        return null;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(this.resourceName, this.fmd5, this.furl);
    }

    public JSONObject toJSONObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e5b411a9", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.files != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(this.files);
            jSONObject.put(vs3.FILES_DIR_NAME, (Object) jSONObject2);
        }
        jSONObject.put("furl", (Object) this.furl);
        jSONObject.put("fmd5", (Object) this.fmd5);
        return jSONObject;
    }
}
