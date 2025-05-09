package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static afc f20243a;

    static {
        t2o.a(486539279);
    }

    public static void a(String str, String str2, String str3, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44a37af", new Object[]{str, str2, str3, view, jSONObject});
            return;
        }
        afc afcVar = f20243a;
        if (afcVar == null) {
            fve.f("InfoFlowBx", "commitAppear gInfoFlowBx == null");
            return;
        }
        try {
            afcVar.d(str, str2, str3, view, jSONObject);
        } catch (Throwable th) {
            fve.c("InfoFlowBx", "commitAppear error", th);
        }
    }

    public static void b(String str, String str2, String str3, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efba424f", new Object[]{str, str2, str3, view, jSONObject});
            return;
        }
        afc afcVar = f20243a;
        if (afcVar == null) {
            fve.f("InfoFlowBx", "commitDisAppear gInfoFlowBx == null");
            return;
        }
        try {
            afcVar.a(str, str2, str3, view, jSONObject);
        } catch (Throwable th) {
            fve.c("InfoFlowBx", "commitDisAppear error", th);
        }
    }

    public static void c(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664eee42", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
            return;
        }
        afc afcVar = f20243a;
        if (afcVar == null) {
            fve.f("InfoFlowBx", "commitScrollEnd gInfoFlowBx == null");
            return;
        }
        try {
            afcVar.f(str, str2, f, f2, list, map);
        } catch (Throwable th) {
            fve.c("InfoFlowBx", "commitScrollEnd error", th);
        }
    }

    public static void d(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ba419b", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
            return;
        }
        afc afcVar = f20243a;
        if (afcVar == null) {
            fve.f("InfoFlowBx", "commitScrollStart gInfoFlowBx == null");
            return;
        }
        try {
            afcVar.e(str, str2, f, f2, list, map);
        } catch (Throwable th) {
            fve.c("InfoFlowBx", "commitScrollStart error", th);
        }
    }

    public static void e(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43afb", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
            return;
        }
        afc afcVar = f20243a;
        if (afcVar == null) {
            fve.f("InfoFlowBx", "commitScrolling gInfoFlowBx == null");
            return;
        }
        try {
            afcVar.c(str, str2, f, f2, list, map);
        } catch (Throwable th) {
            fve.c("InfoFlowBx", "commitScrolling error", th);
        }
    }

    public static void f(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ffa5ff", new Object[]{str, str2, str3, jSONObject});
            return;
        }
        afc afcVar = f20243a;
        if (afcVar == null) {
            fve.f("InfoFlowBx", "commitTap gInfoFlowBx == null");
            return;
        }
        try {
            afcVar.b(str, str2, str3, jSONObject);
        } catch (Throwable th) {
            fve.c("InfoFlowBx", "commitTap error", th);
        }
    }

    public static void g(afc afcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87664907", new Object[]{afcVar});
        } else {
            f20243a = afcVar;
        }
    }
}
