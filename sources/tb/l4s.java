package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l4s INSTANCE = new l4s();

    /* renamed from: a  reason: collision with root package name */
    public static final String f23110a = "[TBFavoriteNew]";

    static {
        t2o.a(1007681596);
    }

    public static final xhv d(String str, String str2, leh lehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f4fbb1e7", new Object[]{str, str2, lehVar});
        }
        ckf.g(lehVar, "$this$error");
        lehVar.g(str);
        lehVar.h(str2);
        return xhv.INSTANCE;
    }

    public static final xhv f(String str, leh lehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("554c7ef8", new Object[]{str, lehVar});
        }
        ckf.g(lehVar, "$this$error");
        lehVar.h(str);
        return xhv.INSTANCE;
    }

    public final void c(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
        } else {
            ldh.INSTANCE.l(f23110a, new g1a() { // from class: tb.k4s
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv d;
                    d = l4s.d(str, str2, (leh) obj);
                    return d;
                }
            });
        }
    }

    public final void e(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfc8bf", new Object[]{this, str});
        } else {
            ldh.INSTANCE.l(f23110a, new g1a() { // from class: tb.j4s
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv f;
                    f = l4s.f(str, (leh) obj);
                    return f;
                }
            });
        }
    }
}
