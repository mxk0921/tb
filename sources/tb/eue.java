package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static zec f18818a;

    static {
        t2o.a(486539278);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        zec zecVar = f18818a;
        if (zecVar == null) {
            fve.f("InfoFlowAppEnv", "getApplication gInfoFlowAppEnv == null");
            return null;
        }
        try {
            return zecVar.getApplication();
        } catch (Throwable th) {
            fve.c("InfoFlowAppEnv", "getApplication error", th);
            return null;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        zec zecVar = f18818a;
        if (zecVar == null) {
            fve.f("InfoFlowAppEnv", "isDebug gInfoFlowAppEnv == null");
            return false;
        }
        try {
            return zecVar.isDebug();
        } catch (Throwable th) {
            fve.c("InfoFlowAppEnv", "isDebug error", th);
            return true;
        }
    }

    public static void c(zec zecVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a08e47", new Object[]{zecVar});
        } else {
            f18818a = zecVar;
        }
    }
}
