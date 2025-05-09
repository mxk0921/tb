package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class izl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Boolean f21664a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f21665a;

        public a(Context context) {
            this.f21665a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            qzl d = com.taobao.runtimepermission.a.d(this.f21665a, "TB_SHOPPING_PROCESS", new String[]{p78.ACCESS_FINE_LOCATION});
            if (d == null || (iArr = d.b) == null || iArr.length <= 0 || iArr[0] != 0) {
                rbb g = ck.g();
                g.e("PermissionRequestcheckBizPermissionDemo: denied with msg " + d.c[0]);
                izl.a(Boolean.FALSE);
                return;
            }
            izl.a(Boolean.TRUE);
        }
    }

    static {
        t2o.a(708837512);
    }

    public static /* synthetic */ Boolean a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f0a618b1", new Object[]{bool});
        }
        f21664a = bool;
        return bool;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c996e", new Object[]{context});
        } else {
            dn.h(new a(context));
        }
    }

    public static boolean b(Context context) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b4bd04b", new Object[]{context})).booleanValue();
        }
        if ("true".equals(y8r.g("enablePermissionRequest", "true"))) {
            if (f21664a != null) {
                c(context);
                return f21664a.booleanValue();
            }
            qzl d = com.taobao.runtimepermission.a.d(context, "TB_SHOPPING_PROCESS", new String[]{p78.ACCESS_FINE_LOCATION});
            if (d != null && (iArr = d.b) != null && iArr.length > 0 && iArr[0] == 0) {
                return true;
            }
            rbb g = ck.g();
            g.e("PermissionRequestcheckBizPermissionDemo: denied with msg " + d.c[0]);
        }
        return false;
    }
}
