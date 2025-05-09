package com.taobao.android.weex;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.b;
import com.taobao.android.weex.config.WeexInstanceConfig;
import tb.c8x;
import tb.d5x;
import tb.dwh;
import tb.j6x;
import tb.n9x;
import tb.t2o;
import tb.t5x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final a INST;

    static {
        a aVar;
        t2o.a(982515729);
        try {
            IpChange ipChange = WeexFactoryImpl.$ipChange;
            aVar = (a) WeexFactoryImpl.class.newInstance();
        } catch (Throwable th) {
            Log.e(dwh.TAG, "WeexFactory Init failed", th);
            aVar = null;
        }
        INST = aVar;
    }

    public static a getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d431cfd7", new Object[0]);
        }
        return INST;
    }

    public abstract WeexInstance createInstance(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig);

    public abstract t5x createInstanceAsync(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig);

    public abstract void destroyPreInstanceWithUrl(String str);

    public abstract c8x getDownloader();

    public abstract d5x getEngine();

    public abstract WeexInstance getPreInstance(Context context, String str);

    public abstract n9x getValueFactory();

    public abstract b.a preCreateInstance(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, WeexInstanceConfig weexInstanceConfig, j6x j6xVar);
}
