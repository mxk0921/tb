package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bgt implements aqc, afc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809293);
        t2o.a(729809291);
        t2o.a(486539297);
    }

    @Override // tb.afc
    public void a(String str, String str2, String str3, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efba424f", new Object[]{this, str, str2, str3, view, jSONObject});
            return;
        }
        try {
            if (mve.a("disableBxMapInterface", false)) {
                tpv.w(str, str2, str3, view, fqv.b(jSONObject));
            } else {
                tpv.v(str, str2, str3, view, fqv.a(jSONObject), new String[0]);
            }
        } catch (Throwable th) {
            fve.c("TbDefaultBx", "TbDefaultBx commitDisAppear ", th);
        }
    }

    @Override // tb.afc
    public void b(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ffa5ff", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        try {
            if (mve.a("disableBxMapInterface", false)) {
                tpv.e(str, str2, str3, fqv.b(jSONObject));
            } else {
                tpv.d(str, str2, str3, fqv.a(jSONObject), new String[0]);
            }
        } catch (Throwable th) {
            fve.c("TbDefaultBx", "TbDefaultBx commitTap ", th);
        }
    }

    @Override // tb.afc
    public void c(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43afb", new Object[]{this, str, str2, new Float(f), new Float(f2), list, map});
        } else {
            tpv.i(str, str2, f, f2, list, map);
        }
    }

    @Override // tb.afc
    public void d(String str, String str2, String str3, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44a37af", new Object[]{this, str, str2, str3, view, jSONObject});
            return;
        }
        try {
            if (mve.a("disableBxMapInterface", false)) {
                tpv.u(str, str2, str3, view, fqv.b(jSONObject));
            } else {
                tpv.t(str, str2, str3, view, fqv.a(jSONObject), new String[0]);
            }
        } catch (Throwable th) {
            fve.c("TbDefaultBx", "TbDefaultBx commitAppear ", th);
        }
    }

    @Override // tb.afc
    public void e(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ba419b", new Object[]{this, str, str2, new Float(f), new Float(f2), list, map});
        } else {
            tpv.h(str, str2, f, f2, list, map);
        }
    }

    @Override // tb.afc
    public void f(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664eee42", new Object[]{this, str, str2, new Float(f), new Float(f2), list, map});
        } else {
            tpv.g(str, str2, f, f2, list, map);
        }
    }

    public void g(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564b847", new Object[]{this, str, str2, obj, strArr});
            return;
        }
        try {
            tpv.b(str, str2, obj, strArr);
        } catch (Throwable th) {
            fve.c("TbDefaultBx", "TbDefaultBx commitEnter ", th);
        }
    }

    public void h(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb1ffe", new Object[]{this, str, str2, str3, obj, strArr});
            return;
        }
        try {
            tpv.c(str, str2, str3, obj, strArr);
        } catch (Throwable th) {
            fve.c("TbDefaultBx", "TbDefaultBx commitLeave ", th);
        }
    }

    public void i(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce026f82", new Object[]{this, str, str2, str3, strArr});
            return;
        }
        try {
            tpv.f(str, str2, str3, strArr);
        } catch (Throwable th) {
            fve.c("TbDefaultBx", "TbDefaultBx commitRequest ", th);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc96f9ad", new Object[]{this});
            return;
        }
        try {
            tpv.s();
        } catch (Throwable th) {
            fve.c("TbDefaultBx", "TbDefaultBx push ", th);
        }
    }
}
