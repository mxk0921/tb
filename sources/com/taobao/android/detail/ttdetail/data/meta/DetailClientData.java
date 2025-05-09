package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "detailClientData")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailClientData extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailClientData";
    public JSONObject detailClientOpt;
    private final int instanceCount;
    public JSONObject optimizeMap;

    static {
        t2o.a(912261668);
    }

    public DetailClientData(JSONObject jSONObject) {
        super(jSONObject);
        this.optimizeMap = jSONObject.getJSONObject("optimizeMap");
        this.instanceCount = parseInstanceCount(jSONObject);
        this.detailClientOpt = jSONObject.getJSONObject("detailClientOpt");
    }

    public static /* synthetic */ Object ipc$super(DetailClientData detailClientData, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/DetailClientData");
    }

    private int parseInstanceCount(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2b32a15", new Object[]{this, jSONObject})).intValue();
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("detailInstance");
            if (jSONObject2 != null) {
                return jSONObject2.getIntValue("instanceCount");
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int getInstanceCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76f5203e", new Object[]{this})).intValue();
        }
        return this.instanceCount;
    }

    public boolean isGuessYouLikeServerless() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4426310", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.detailClientOpt;
        if (jSONObject == null || !jSONObject.getBooleanValue("guessYouLikeServerless")) {
            return false;
        }
        return true;
    }
}
