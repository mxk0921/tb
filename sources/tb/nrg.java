package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nrg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final owu f24905a = new owu("umbrella_trace2");
    public final boolean b;

    public nrg() {
        String str;
        this.b = false;
        try {
            boolean exists = new File("/data/local/tmp/.com_taobao_taobao_umbrella_switcher").exists();
            this.b = exists;
            if (exists) {
                str = "存在";
            } else {
                str = "不存在";
            }
            Log.e("umbrella", "/data/local/tmp/.com_taobao_taobao_umbrella_switcher ".concat(str));
        } catch (Throwable th) {
            Log.e("umbrella", th.getMessage());
        }
    }

    public final int a(double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("836081d", new Object[]{this, new Double(d), str})).intValue();
        }
        double c = this.f24905a.c(str, -1.0d);
        if (c == -1.0d) {
            return 2;
        }
        if (d > c) {
            return 1;
        }
        return 0;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcd295b8", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean c() {
        Boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fed14fd", new Object[]{this})).booleanValue();
        }
        if (!b() && (b = this.f24905a.b("enableFeedback")) != null) {
            return b.booleanValue();
        }
        return true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ae15d0", new Object[]{this})).booleanValue();
        }
        if (b()) {
            return true;
        }
        Boolean b = this.f24905a.b("enableLogcat");
        if (b == null) {
            return false;
        }
        return b.booleanValue();
    }

    public boolean e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6901877", new Object[]{this, str, str2, str3})).booleanValue();
        }
        return j(false, "DC_" + str, "DC_ANY");
    }

    public final boolean f(double d, double d2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("212a5f3c", new Object[]{this, new Double(d), new Double(d2), strArr})).booleanValue();
        }
        if (!(strArr == null || strArr.length == 0)) {
            for (String str : strArr) {
                int a2 = a(d, str);
                if (2 != a2) {
                    if (1 == a2) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (d > d2) {
            return true;
        }
        return false;
    }

    public boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9641f77", new Object[]{this, str, str2})).booleanValue();
        }
        if (b()) {
            return false;
        }
        return j(false, "G_" + str, "G_ANY");
    }

    public boolean h(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e6d213", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (b()) {
            return false;
        }
        double random = Math.random();
        if (byu.b(str4)) {
            return f(random, vu3.b.GEO_NOT_SUPPORT, "CF_" + str, "E_" + str4, "CF_ANY");
        }
        return f(random, vu3.b.GEO_NOT_SUPPORT, "CS_" + str, "CS_ANY");
    }

    public boolean i(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0af55ee", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (b()) {
            return false;
        }
        double random = Math.random();
        return f(random, vu3.b.GEO_NOT_SUPPORT, "I_" + str, "I_ANY");
    }

    public final boolean j(boolean z, String... strArr) {
        Boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3588c5df", new Object[]{this, new Boolean(z), strArr})).booleanValue();
        }
        if (strArr == null || strArr.length == 0) {
            return z;
        }
        for (String str : strArr) {
            if (!byu.a(str) && (b = this.f24905a.b(str)) != null) {
                return b.booleanValue();
            }
        }
        return z;
    }
}
