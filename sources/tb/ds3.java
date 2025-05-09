package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.StringUtils;
import com.taobao.atools.StaticHook;
import com.ut.device.UTDevice;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ds3 implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "CipherOptimize";
    public static volatile ds3 c;
    public static boolean d = false;
    public static Boolean e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18037a = false;
    public boolean b = false;

    static {
        t2o.a(962592818);
        t2o.a(962592825);
    }

    public ds3() {
        x2r.f().i(KEY, this);
        a(KEY, x2r.f().e(KEY));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d65a60", new Object[0])).booleanValue();
        }
        if (e == null) {
            try {
                e = Boolean.valueOf(StaticHook.c());
            } catch (Throwable unused) {
                e = Boolean.FALSE;
            }
            nhh.f("CipherOptimizeConfigListener", "atoolsSupport", e);
        }
        return e.booleanValue();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c89f84", new Object[0]);
            return;
        }
        nhh.i("CipherOptimizeConfigListener", "forceDisable");
        d = true;
    }

    public static synchronized ds3 d() {
        synchronized (ds3.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ds3) ipChange.ipc$dispatch("7a8133ee", new Object[0]);
            }
            if (c == null) {
                c = new ds3();
            }
            return c;
        }
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else {
            g(str2);
        }
    }

    public synchronized boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        } else if (d) {
            return false;
        } else {
            if (!b()) {
                return false;
            }
            if (u51.l(vyp.i().g())) {
                return f();
            }
            return this.b;
        }
    }

    public final void h(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f52c69a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                if (Math.abs(StringUtils.hashCode(UTDevice.getUtdid(vyp.i().g()))) % 10000 >= Integer.parseInt(str)) {
                    z = false;
                }
                this.b = z;
            } catch (Throwable unused) {
                this.b = false;
            }
        } else {
            this.b = false;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1752004f", new Object[]{this})).booleanValue();
        }
        if (this.f18037a) {
            nhh.f("CipherOptimizeConfigListener", "bEnable", Boolean.valueOf(this.b));
            return this.b;
        }
        String a2 = iaq.a(vyp.i().g(), KEY);
        nhh.f("CipherOptimizeConfigListener", "modSp", a2);
        h(a2);
        nhh.f("CipherOptimizeConfigListener", "bEnable", Boolean.valueOf(this.b));
        this.f18037a = true;
        return this.b;
    }

    public final synchronized void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("CipherOptimizeConfigListener", "parseConfig value", str);
        if (!TextUtils.isEmpty(str)) {
            String a2 = iaq.a(vyp.i().g(), KEY);
            nhh.f("CipherOptimizeConfigListener", "modSp", a2);
            h(a2);
            nhh.f("CipherOptimizeConfigListener", "bEnable", Boolean.valueOf(this.b));
            if (!str.equalsIgnoreCase(a2)) {
                iaq.b(vyp.i().g(), KEY, str);
            }
        }
    }
}
