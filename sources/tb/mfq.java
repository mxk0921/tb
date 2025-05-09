package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class mfq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_SSR = "mtop_ssr";

    public static void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0976f1", new Object[]{obj, str});
        } else {
            b(obj, str, "");
        }
    }

    public static void b(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3703267b", new Object[]{obj, str, str2});
        } else if (obj != null) {
            try {
                if (obj instanceof gz8) {
                    StringBuilder sb = new StringBuilder("module=mtop_ssr,stage=");
                    sb.append(str);
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(",content=");
                        sb.append(str2);
                    }
                    ((gz8) obj).A(sb.toString());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3f77f1", new Object[]{obj, str});
        } else {
            b(obj, "bizFinish", str);
        }
    }

    public static void d(i7j i7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3212b068", new Object[]{i7jVar});
            return;
        }
        i7jVar.F = System.currentTimeMillis();
        a(i7jVar.S, "bizReqProcessStart");
    }

    public static void e(i7j i7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c529ad0b", new Object[]{i7jVar});
            return;
        }
        zzc a2 = ktj.a();
        if (a2 != null) {
            a2.b().b(i7jVar.T);
        }
    }

    public static void f(i7j i7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c28730", new Object[]{i7jVar});
            return;
        }
        zzc a2 = ktj.a();
        if (a2 != null) {
            a2.b().a(i7jVar.T);
        }
    }

    public static void g(i7j i7jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709f365d", new Object[]{i7jVar, str});
            return;
        }
        i7jVar.E = System.currentTimeMillis();
        Object obj = i7jVar.S;
        b(obj, "bizReqStart", "api=" + str);
    }

    public static void h(i7j i7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaba611", new Object[]{i7jVar});
            return;
        }
        i7jVar.H = System.currentTimeMillis();
        a(i7jVar.S, "bizRspCbDispatch");
    }

    public static void i(i7j i7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a42eaa", new Object[]{i7jVar});
            return;
        }
        i7jVar.J = System.currentTimeMillis();
        a(i7jVar.S, "bizRspCbEnd");
    }

    public static void j(i7j i7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c086c603", new Object[]{i7jVar});
            return;
        }
        i7jVar.I = System.currentTimeMillis();
        a(i7jVar.S, "bizRspCbStart");
    }

    public static void k(i7j i7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6fcb17", new Object[]{i7jVar});
            return;
        }
        i7jVar.G = System.currentTimeMillis();
        a(i7jVar.S, "bizRspProcessStart");
    }
}
