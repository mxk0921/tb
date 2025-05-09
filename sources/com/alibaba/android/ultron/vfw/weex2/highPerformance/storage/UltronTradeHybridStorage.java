package com.alibaba.android.ultron.vfw.weex2.highPerformance.storage;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronTradeHybridStorage extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mExpireDuration;
    private long mGenerateTimestamp;
    private String mKey;

    static {
        t2o.a(157286892);
    }

    public UltronTradeHybridStorage(String str, JSONObject jSONObject, long j) {
        this.mGenerateTimestamp = 0L;
        this.mKey = str;
        this.mExpireDuration = j;
        this.mGenerateTimestamp = System.currentTimeMillis();
        if (jSONObject != null) {
            putAll(jSONObject);
        }
    }

    public static /* synthetic */ Object ipc$super(UltronTradeHybridStorage ultronTradeHybridStorage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/storage/UltronTradeHybridStorage");
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.mKey;
    }

    public boolean isExpired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue();
        }
        if (System.currentTimeMillis() - this.mGenerateTimestamp > this.mExpireDuration) {
            return true;
        }
        return false;
    }

    public void update(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90396420", new Object[]{this, jSONObject});
            return;
        }
        clear();
        if (jSONObject != null) {
            putAll(jSONObject);
        }
        this.mGenerateTimestamp = System.currentTimeMillis();
    }

    public void update(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f396a4", new Object[]{this, jSONObject, new Long(j)});
            return;
        }
        update(jSONObject);
        this.mExpireDuration = j;
    }
}
