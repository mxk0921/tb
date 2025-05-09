package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ng8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_FREE_MEM = 700;
    public static final int DEFAULT_THRESHOLD_MEM = 200;
    public static final int DEFAULT_TOTAL_MEM = -1;
    public static final int TIRAMISU = 33;

    /* renamed from: a  reason: collision with root package name */
    public static final long f24712a = 1048576;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f24713a = -1;
        public long b = 700;
        public long c = 200;

        static {
            t2o.a(511705602);
        }
    }

    static {
        t2o.a(511705601);
    }

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f7dec1bc", new Object[]{context});
        }
        a aVar = new a();
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            long j2 = f24712a;
            aVar.f24713a = j / j2;
            aVar.b = memoryInfo.availMem / j2;
            aVar.c = memoryInfo.threshold / j2;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return aVar;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e967840", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bad3c6be", new Object[0])).booleanValue();
        }
        String J = eag.J();
        if (J == null || !J.contains(String.valueOf(Build.VERSION.SDK_INT))) {
            return false;
        }
        return true;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("744005f", new Object[]{context})).booleanValue();
        }
        if (!eag.D() || cr2.c(context) > eag.k()) {
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de93f1ce", new Object[]{context})).booleanValue();
        }
        if (!g(context) || c()) {
            return false;
        }
        return true;
    }

    public static boolean f() {
        EnvModeEnum envModeEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d0d00bb", new Object[0])).booleanValue();
        }
        MtopConfig mtopConfig = Mtop.instance(null).getMtopConfig();
        if (mtopConfig == null || (envModeEnum = mtopConfig.envMode) == null || envModeEnum != EnvModeEnum.ONLINE) {
            return false;
        }
        return true;
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("103f612d", new Object[]{context})).booleanValue();
        }
        if (j(context) >= 29) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1245640a", new Object[]{context})).booleanValue();
        }
        if (j(context) >= 33) {
            return true;
        }
        return false;
    }

    public static int j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ade11bc5", new Object[]{context})).intValue();
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void i(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f26af4", new Object[]{str, context});
            return;
        }
        a a2 = a(context);
        odg.c(str, "printEnvMemInfo:  totalMem=" + a2.f24713a + " freeMem=" + a2.b + " thredhodMem=" + a2.c);
    }
}
