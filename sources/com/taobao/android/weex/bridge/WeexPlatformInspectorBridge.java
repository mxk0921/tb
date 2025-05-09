package com.taobao.android.weex.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import java.io.Serializable;
import org.json.JSONObject;
import tb.a5x;
import tb.t2o;
import tb.v7x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexPlatformInspectorBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InspectorBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements a5x.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9917a;

        public a(long j) {
            this.f9917a = j;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b73db65", new Object[]{this, jSONObject});
            } else {
                WeexPlatformInspectorBridge.access$000(this.f9917a, jSONObject);
            }
        }
    }

    static {
        t2o.a(982515838);
    }

    public static /* synthetic */ void access$000(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6061b1", new Object[]{new Long(j), jSONObject});
        } else {
            callbackDOMStorageResultNative(j, jSONObject);
        }
    }

    private static native void callbackDOMStorageResultNative(long j, JSONObject jSONObject);

    public static void getDOMStorageItems(WeexInstanceImpl weexInstanceImpl, String str, boolean z, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b512546", new Object[]{weexInstanceImpl, str, new Boolean(z), str2, new Long(j)});
        } else {
            a5x.a(str, z, new a(j));
        }
    }

    public static JSONObject getProcedure(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("25615ef0", new Object[]{weexInstanceImpl});
        }
        return v7x.b(weexInstanceImpl);
    }
}
