package tb;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class due {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static yec f18072a;

    static {
        t2o.a(486539277);
    }

    public static void a(Application application, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0e0026", new Object[]{application, str, str2, str3, map});
            return;
        }
        yec yecVar = f18072a;
        if (yecVar == null) {
            fve.e("InfoFlowAliMaMa", "commit  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            yecVar.a(application, str, str2, str3, map);
        } catch (Throwable th) {
            fve.c("InfoFlowAliMaMa", "commit error", th);
        }
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435bd8fb", new Object[]{jSONObject});
            return;
        }
        yec yecVar = f18072a;
        if (yecVar == null) {
            fve.e("InfoFlowAliMaMa", "commitAdvClickEvent  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            yecVar.d(jSONObject);
        } catch (Throwable th) {
            fve.c("InfoFlowAliMaMa", "commitAdvClickEvent error", th);
        }
    }

    public static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6bb7ef", new Object[]{jSONObject});
            return;
        }
        yec yecVar = f18072a;
        if (yecVar == null) {
            fve.e("InfoFlowAliMaMa", "commitAdvExposeEvent  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            yecVar.c(jSONObject);
        } catch (Throwable th) {
            fve.c("InfoFlowAliMaMa", "commitAdvExposeEvent error", th);
        }
    }

    public static void d(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6011d732", new Object[]{str, str2, str3, map});
            return;
        }
        yec yecVar = f18072a;
        if (yecVar == null) {
            fve.e("InfoFlowAliMaMa", "commitIfsArrayClick  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            yecVar.e(str, str2, str3, map);
        } catch (Throwable th) {
            fve.c("InfoFlowAliMaMa", "commitIfsArrayClick error", th);
        }
    }

    public static void e(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff0f85f", new Object[]{str, str2, str3, map});
            return;
        }
        yec yecVar = f18072a;
        if (yecVar == null) {
            fve.e("InfoFlowAliMaMa", "commitIfsArrayExposure  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            yecVar.b(str, str2, str3, map);
        } catch (Throwable th) {
            fve.c("InfoFlowAliMaMa", "commitIfsArrayExposure error", th);
        }
    }

    public static void f(yec yecVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976ac719", new Object[]{yecVar});
        } else {
            f18072a = yecVar;
        }
    }
}
