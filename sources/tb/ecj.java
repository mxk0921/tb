package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ecj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571213);
    }

    public static void a(nwi nwiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78b5d6f", new Object[]{nwiVar, new Integer(i)});
            return;
        }
        try {
            JSONObject c = nwiVar.d().c();
            o4v.b(c);
            HashMap hashMap = new HashMap();
            hashMap.put("__INTERACT_TYPE__", String.valueOf(i));
            dg0.b(c, nwiVar.h(), hashMap);
        } catch (Throwable th) {
            jgh.b("MunionUtil", "bigPopEnd", th);
        }
    }

    public static void b(nwi nwiVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a794da", new Object[]{nwiVar, new Boolean(z)});
            return;
        }
        if (z) {
            i = 9;
        } else {
            i = 10;
        }
        c(nwiVar, i);
    }

    public static void c(nwi nwiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bba54a", new Object[]{nwiVar, new Integer(i)});
            return;
        }
        try {
            JSONObject k = nwiVar.d().k();
            o4v.b(k);
            HashMap hashMap = new HashMap();
            hashMap.put("__INTERACT_TYPE__", String.valueOf(i));
            dg0.b(k, nwiVar.h(), hashMap);
            if (9 == i) {
                String c = u5v.b().c();
                if (TextUtils.isEmpty(c)) {
                    jgh.a("MunionUtil", "onInteractSuccess, return, TextUtils.isEmpty(popIndexId), popIndexId = " + c);
                    return;
                }
                String i2 = n4q.i(c);
                jgh.a("MunionUtil", "onInteractSuccess, finish, PopNativeApi.notifyPopToChangeImg popIndex= " + c + "result= " + i2);
            }
        } catch (Throwable th) {
            jgh.b("MunionUtil", "interactExposure", th);
        }
    }

    public static void d(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d621f3", new Object[]{nwiVar});
            return;
        }
        try {
            JSONObject j = nwiVar.d().j();
            o4v.b(j);
            dg0.a(j, nwiVar.h());
        } catch (Throwable th) {
            jgh.b("MunionUtil", "interactExposure", th);
        }
    }

    public static void e(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc90a89f", new Object[]{nwiVar});
            return;
        }
        try {
            JSONObject b = nwiVar.d().b();
            o4v.b(b);
            dg0.a(b, nwiVar.h());
        } catch (Throwable th) {
            jgh.b("MunionUtil", "interactExposure", th);
        }
    }

    public static void f(nwi nwiVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcab60ec", new Object[]{nwiVar, str, new Integer(i)});
        } else if (nwiVar != null) {
            jgh.a("MunionUtil", "recordLoadFail:" + str);
            a(nwiVar, i);
            i4v.h(nwiVar, str);
        }
    }
}
