package com.taobao.android.weex;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.config.WeexInstanceConfig;
import tb.c8x;
import tb.d5x;
import tb.n9x;
import tb.t2o;
import tb.t5x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(982515748);
        }

        public a(boolean z, String str) {
        }
    }

    static {
        t2o.a(982515747);
    }

    public static WeexInstance a(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("29953435", new Object[]{context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig});
        }
        return com.taobao.android.weex.a.getInstance().createInstance(context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig);
    }

    public static t5x b(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("ee4e4d90", new Object[]{context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig});
        }
        return com.taobao.android.weex.a.getInstance().createInstanceAsync(context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig);
    }

    public static c8x c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8x) ipChange.ipc$dispatch("759ec54d", new Object[0]);
        }
        return com.taobao.android.weex.a.getInstance().getDownloader();
    }

    public static d5x d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d5x) ipChange.ipc$dispatch("428007e", new Object[0]);
        }
        return com.taobao.android.weex.a.getInstance().getEngine();
    }

    public static n9x e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n9x) ipChange.ipc$dispatch("aafed8b8", new Object[0]);
        }
        return com.taobao.android.weex.a.getInstance().getValueFactory();
    }
}
