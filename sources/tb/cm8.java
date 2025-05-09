package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class cm8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(507510790);
    }

    public static final <T> T a(T t, g1a<? super Throwable, xhv> g1aVar, d1a<? extends T> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("80959d21", new Object[]{t, g1aVar, d1aVar});
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        try {
            return (T) d1aVar.invoke();
        } catch (Throwable th) {
            if (g1aVar != null) {
                g1aVar.invoke(th);
                return t;
            }
            keg.d(6, "Extension.ERROR", "tryWith exception" + Log.getStackTraceString(th));
            return t;
        }
    }

    public static /* synthetic */ Object b(Object obj, g1a g1aVar, d1a d1aVar, int i, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3109cd01", new Object[]{obj, g1aVar, d1aVar, new Integer(i), obj2});
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            g1aVar = null;
        }
        return a(obj, g1aVar, d1aVar);
    }
}
