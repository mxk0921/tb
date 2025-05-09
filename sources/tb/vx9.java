package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vx9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<ux9> f30312a;

    static {
        t2o.a(806355853);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc810acf", new Object[]{str})).booleanValue();
        }
        WeakReference<ux9> weakReference = f30312a;
        if (weakReference == null || weakReference.get() == null || f30312a.get().i == null) {
            return false;
        }
        return f30312a.get().i.equals(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{str});
        } else if (str == null) {
            v2s.o().A().c("FrameContextUtils", "setCurFrameContext clear liveContextKey = null");
        } else {
            WeakReference<ux9> weakReference = f30312a;
            if (weakReference == null) {
                v2s.o().A().c("FrameContextUtils", "setCurFrameContext clear mCurFrameContextWeakReference == null");
            } else if (weakReference.get() == null) {
                bir.a("FrameContextUtils", "setCurFrameContext clear mCurFrameContextWeakReference.get() == null");
                f30312a = null;
            } else if (!str.equals(f30312a.get().p())) {
                bir.a("FrameContextUtils", "setCurFrameContext clear equals liveContextKey = ".concat(str));
            } else {
                bir.a("FrameContextUtils", "setCurFrameContext clear success liveContextKey = ".concat(str));
                f30312a = null;
            }
        }
    }

    public static ux9 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("dc328a3d", new Object[0]);
        }
        WeakReference<ux9> weakReference = f30312a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return f30312a.get();
    }

    public static ux9 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("df3e9fab", new Object[0]);
        }
        WeakReference<ux9> weakReference = f30312a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1504e21", new Object[0]);
        }
        if (d() != null) {
            return d().C();
        }
        return null;
    }

    public static cv1 f(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cv1) ipChange.ipc$dispatch("6f0fb942", new Object[]{ux9Var});
        }
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.j();
    }

    public static void g(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d171fcf", new Object[]{ux9Var});
        } else if (ux9Var == null) {
            bir.a("FrameContextUtils", "setCurFrameContext null");
        } else {
            f30312a = new WeakReference<>(ux9Var);
            if (ux9Var.j() != null) {
                ux9Var.j().C(ux9Var.p());
            }
            bir.a("FrameContextUtils", "setCurFrameContext liveContextKey = " + ux9Var.p());
        }
    }
}
