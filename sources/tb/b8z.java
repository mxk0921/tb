package tb;

import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b8z {
    public static final String KEY_DISABLE_SYNC_PROP_WITH_SKU = "disableSyncPropWithSku";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16258a;

    static {
        t2o.a(912261537);
    }

    public b8z(JSONObject jSONObject) {
        boolean z;
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString(KEY_DISABLE_SYNC_PROP_WITH_SKU))) {
            z = false;
        } else {
            z = true;
        }
        this.f16258a = z;
    }
}
