package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static lfc f28984a;

    static {
        t2o.a(486539292);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbed7594", new Object[]{str, str2, str3, str4, str5, map});
        } else {
            c(str, str2, str3, str4, str5, map);
        }
    }

    public static void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        lfc lfcVar = f28984a;
        if (lfcVar == null) {
            fve.f("InfoFlowUmbrella", "commitFailure gUmbrella == null");
            return;
        }
        try {
            lfcVar.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
        } catch (Throwable th) {
            fve.c("InfoFlowUmbrella", "commitFailure error", th);
        }
    }

    public static void c(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        lfc lfcVar = f28984a;
        if (lfcVar == null) {
            fve.f("InfoFlowUmbrella", "commitSuccess gUmbrella == null");
            return;
        }
        try {
            lfcVar.commitSuccess(str, str2, str3, str4, str5, map);
        } catch (Throwable th) {
            fve.c("InfoFlowUmbrella", "commitSuccess error", th);
        }
    }

    public static void d(lfc lfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d5c107", new Object[]{lfcVar});
        } else {
            f28984a = lfcVar;
        }
    }
}
