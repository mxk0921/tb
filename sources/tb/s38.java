package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809134);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d914a3e", new Object[]{jSONObject, jSONObject2, str});
        } else if (jSONObject != null && jSONObject2 != null && (jSONObject3 = jSONObject.getJSONObject("args")) != null && TextUtils.equals("1", jSONObject3.getString(jtv.S_ARGS_IS_CLIENT_CACHE)) && (jSONObject4 = jSONObject2.getJSONObject(str)) != null) {
            JSONObject jSONObject5 = jSONObject4.getJSONObject("args");
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
                jSONObject2.put("args", (Object) jSONObject5);
            }
            jSONObject5.put(jtv.S_ARGS_IS_CLIENT_CACHE, "1");
        }
    }

    public static void c(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44ac74d", new Object[]{dXRuntimeContext, jSONObject});
        } else {
            a(dXRuntimeContext.i(), jSONObject, "clickParam");
        }
    }

    public static void d(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b477595", new Object[]{dXRuntimeContext, jSONObject});
        } else {
            a(dXRuntimeContext.i(), jSONObject, i2b.TRACK_EXPOSURE_PARAM);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da62ed8", new Object[0]);
            return;
        }
        DinamicXEngine.H0(true);
        tl7.g(true);
    }

    public static Context f(View view) {
        z6d c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f0cd53a1", new Object[]{view});
        }
        Context context = view.getContext();
        if (!(context instanceof Activity) || !((Activity) context).isDestroyed() || (c = h2b.a().c()) == null || c.k1() == null) {
            return context;
        }
        return c.k1();
    }
}
