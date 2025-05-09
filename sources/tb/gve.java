package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ffc f20256a;

    static {
        t2o.a(486539288);
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b447c2dd", new Object[]{str, str2, map});
            return;
        }
        ffc ffcVar = f20256a;
        if (ffcVar == null) {
            fve.f("InfoFlowMessiah", "commitLog gMessiah == null");
            return;
        }
        try {
            ffcVar.b(str, str2, map);
        } catch (Throwable th) {
            fve.c("InfoFlowMessiah", "commitLog error", th);
        }
    }

    public static void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4d6487", new Object[]{str, str2, map});
            return;
        }
        ffc ffcVar = f20256a;
        if (ffcVar == null) {
            fve.f("InfoFlowMessiah", "commitMonitor gMessiah == null");
            return;
        }
        try {
            ffcVar.a(str, str2, map);
        } catch (Throwable th) {
            fve.c("InfoFlowMessiah", "commitMonitor error", th);
        }
    }

    public static void c(ffc ffcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787d8bf5", new Object[]{ffcVar});
        } else {
            f20256a = ffcVar;
        }
    }
}
