package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class cvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cvr INSTANCE = new cvr();

    static {
        t2o.a(815792591);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("449b46e8", new Object[]{this, str});
        }
        ckf.g(str, "switchKey");
        String e = TBRevisionSwitchManager.c().e(str);
        return e == null ? "" : e;
    }

    public final String b() {
        a3w queryCurrentVersionInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e5608aa", new Object[]{this});
        }
        t1c t1cVar = (t1c) n78.a(t1c.class);
        if (t1cVar == null || (queryCurrentVersionInfo = t1cVar.queryCurrentVersionInfo()) == null || (str = queryCurrentVersionInfo.c) == null) {
            return "";
        }
        return str;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2526050b", new Object[]{this})).booleanValue();
        }
        if (!rv6.a()) {
            return ckf.b("1", a("elderHome"));
        }
        boolean b = b1p.INSTANCE.b(j3p.g());
        if (!b) {
            return ckf.b("1", a("elderHome"));
        }
        return b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f55ca781", new Object[]{this})).booleanValue();
        }
        if (o4p.e()) {
            return false;
        }
        try {
            t1c t1cVar = (t1c) n78.a(t1c.class);
            if (t1cVar == null) {
                return false;
            }
            return t1cVar.isSpecifyVersionCode("goodprice_version");
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef4fa74", new Object[]{this})).booleanValue();
        }
        if (rv6.a()) {
            boolean c = b1p.INSTANCE.c(j3p.g());
            if (c) {
                return c;
            }
            if (!ckf.b("1", a("evo_search_optimize")) || !o4p.g2()) {
                return false;
            }
        } else if (!ckf.b("1", a("evo_search_optimize")) || !o4p.g2()) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("528271ac", new Object[]{this})).booleanValue();
        }
        if (!c() || !e()) {
            return false;
        }
        return true;
    }

    public final boolean g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7aa5c4c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (rv6.a()) {
            boolean d = b1p.INSTANCE.d(j3p.g());
            if (d) {
                return d;
            }
            if (o4p.k2() && c() && z) {
                return true;
            }
        } else if (o4p.k2() && c() && z) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3faeb27c", new Object[]{this})).booleanValue();
        }
        t1c t1cVar = (t1c) n78.a(t1c.class);
        if (t1cVar != null) {
            return t1cVar.isSpecifyVersionCode("children_version");
        }
        return false;
    }
}
