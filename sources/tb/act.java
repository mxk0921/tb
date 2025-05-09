package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.a;
import java.util.UUID;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class act {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f15666a;
    public static String b;
    public static String c;
    public static boolean d = true;
    public static boolean e = false;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7025e1f7", new Object[0]);
        } else {
            f15666a = UUID.randomUUID().toString();
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26095428", new Object[0]);
        }
        if (TextUtils.isEmpty(c)) {
            return "source_blank";
        }
        return c;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e69425aa", new Object[0]);
        }
        if (TextUtils.isEmpty(b)) {
            return "source_blank";
        }
        return b;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[0]);
        }
        if (TextUtils.isEmpty(f15666a)) {
            a();
        }
        return f15666a;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d0d00bb", new Object[0])).booleanValue();
        }
        return d;
    }

    public static boolean f(Context context) {
        EnvModeEnum envModeEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309bf6f5", new Object[]{context})).booleanValue();
        }
        MtopConfig mtopConfig = Mtop.instance((String) null, context).getMtopConfig();
        if (mtopConfig == null || (envModeEnum = mtopConfig.envMode) == null || envModeEnum != EnvModeEnum.ONLINE) {
            return false;
        }
        return true;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[0])).booleanValue();
        }
        return e;
    }

    public static void i(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933e562d", new Object[]{context, str, str2});
            return;
        }
        c = str;
        b = str2;
        ztl.k(context);
        mj3.b(context);
        d = f(context);
    }

    public static void j(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baab2d93", new Object[]{context, str, str2});
            return;
        }
        i(context, str, str2);
        a();
        if (bct.f()) {
            dsm.c().e(context);
        }
        h(context);
        cct.a(str, str2, e);
    }

    public static boolean h(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13436d15", new Object[]{context})).booleanValue();
        }
        if (v.a().b(context, a.TAOPAI_FEATURE) == 1) {
            z = true;
        }
        e = z;
        return z;
    }

    static {
        t2o.a(782237720);
        try {
            System.loadLibrary("taopai_data_core");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
