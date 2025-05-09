package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ovg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static nvg f25686a;

    public static void a(x0s x0sVar, koq koqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3874419", new Object[]{x0sVar, koqVar});
        } else if (njo.f(x0sVar.g())) {
            f25686a = new nvg(x0sVar, koqVar);
            TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.ALL, f25686a);
            hj9.b();
        }
    }

    public static void b(x0s x0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f57e22", new Object[]{x0sVar});
        } else if (njo.f(x0sVar.g())) {
            TCrashSDK.instance().removeOnFileCreatedListener(UncaughtCrashType.ALL, f25686a);
            nvg nvgVar = f25686a;
            if (nvgVar != null) {
                nvgVar.b();
            }
            f25686a = null;
            hj9.c();
        }
    }
}
