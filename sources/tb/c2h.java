package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c2h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378529);
    }

    public static boolean a(DinamicXEngine dinamicXEngine, String str, DXRootView dXRootView, JSONObject jSONObject) {
        rv5 r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd6f59b5", new Object[]{dinamicXEngine, str, dXRootView, jSONObject})).booleanValue();
        }
        if (dinamicXEngine == null || (r = dinamicXEngine.r(str, dXRootView, jSONObject, null, null)) == null || r.h() != 0) {
            return false;
        }
        return true;
    }
}
