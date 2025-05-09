package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.lpm_android.LpmProxy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qpv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355618);
    }

    public final void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd14e21", new Object[]{this, str, obj});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().pageDisAppear(str, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1680de1", new Object[]{this, str, str2, str3, map});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().track4Click(str, str2, str3, map);
            }
        } catch (Exception unused) {
        }
    }

    public final void c(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcc299a", new Object[]{this, str, str2, str3, map});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().track4Show(str, str2, str3, map);
            }
        } catch (Exception unused) {
        }
    }

    public final void d(String str, String str2, Integer num, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541e3f87", new Object[]{this, str, str2, num, str3, str4, str5, map});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().trackCustom(str, str2, num, str3, str4, str5, map);
            }
        } catch (Exception unused) {
        }
    }

    public final void e(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbf9ca4", new Object[]{this, str, str2, str3, map});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().trackCustom(str, str2, str3, map);
            }
        } catch (Exception unused) {
        }
    }

    public final void f(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabed450", new Object[]{this, str, str2, map});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().trackPage(str, str2, map);
            }
        } catch (Exception unused) {
        }
    }

    public final void g(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8446b49a", new Object[]{this, str, obj, str2});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().updatePageName(str, obj, str2);
            }
        } catch (Exception unused) {
        }
    }

    public final void h(String str, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24bc50d", new Object[]{this, str, obj, map});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().updatePageProperties(str, obj, map);
            }
        } catch (Exception unused) {
        }
    }
}
