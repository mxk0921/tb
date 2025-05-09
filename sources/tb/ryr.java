package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.tao.flexbox.layoutmanager.usertracker.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ryr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f27682a = ryr.class.getSimpleName();
    public static long b;
    public static long c;

    static {
        t2o.a(468713856);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd4e54f0", new Object[0])).longValue();
        }
        return c - b;
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48462d2", new Object[]{context, str, str2});
            return;
        }
        String str3 = f27682a;
        ir9.a(str3, "【onSubTaskBegin】context: " + context + ", name: " + str2);
        if (context != null) {
            if (TextUtils.equals(str2, s0j.GG_VIDEOTAB_VIDEO_PLAY)) {
                b = System.currentTimeMillis();
            }
            if (context instanceof Activity) {
                vxm vxmVar = vxm.b;
                vxmVar.a((Activity) context).v(str2);
                vxmVar.e().v(str2);
            } else if (context instanceof Application) {
                vxm.b.e().v(str2);
            }
        } else {
            ir9.b(str3, "【onSubTaskBegin】context is null");
        }
        a.p().t(str, str2);
    }

    public static void c(Context context, String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2dc9aa", new Object[]{context, str, str2, str3, map});
            return;
        }
        JSONObject jSONObject = null;
        HashMap hashMap = map != null ? new HashMap(map) : null;
        if (context == null) {
            if (FluidSDK.isDebug()) {
                String str4 = f27682a;
                ir9.a(str4, "【onSubTaskFail】context: " + context + ", name: " + str2 + ", subProperties: " + JSON.toJSONString(hashMap));
            }
            if (context instanceof Activity) {
                vxm vxmVar = vxm.b;
                vxmVar.a((Activity) context).p(str2, str3, hashMap);
                vxmVar.e().p(str2, str3, hashMap);
            } else if (context instanceof Application) {
                vxm.b.e().p(str2, str3, hashMap);
            }
        } else {
            ir9.b(f27682a, "【onSubTaskFail】context is null");
        }
        a p = a.p();
        if (hashMap != null) {
            jSONObject = new JSONObject(hashMap);
        }
        p.u(str, str2, str3, jSONObject);
    }

    public static void d(Context context, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9394ff4d", new Object[]{context, str, str2, map});
            return;
        }
        JSONObject jSONObject = null;
        HashMap hashMap = map != null ? new HashMap(map) : null;
        if (context != null) {
            if (FluidSDK.isDebug()) {
                String str3 = f27682a;
                ir9.a(str3, "【onSubTaskSuccess】context: " + context + ", name: " + str2 + ", subProperties: " + JSON.toJSONString(hashMap));
            }
            if (TextUtils.equals(str2, s0j.GG_VIDEOTAB_VIDEO_PLAY)) {
                c = System.currentTimeMillis();
            }
            if (context instanceof Activity) {
                vxm vxmVar = vxm.b;
                vxmVar.a((Activity) context).e(str2, hashMap);
                vxmVar.e().e(str2, hashMap);
            } else if (context instanceof Application) {
                vxm.b.e().e(str2, hashMap);
            }
        } else {
            ir9.b(f27682a, "【onSubTaskSuccess】context is null");
        }
        a p = a.p();
        if (hashMap != null) {
            jSONObject = new JSONObject(hashMap);
        }
        p.v(str, str2, jSONObject);
    }
}
