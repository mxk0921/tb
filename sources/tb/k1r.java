package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static l55 b() {
        try {
            return (l55) xh4.m.newInstance();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static n55 c(onf onfVar, m55 m55Var) {
        if (xh4.l == null) {
            return new wqa();
        }
        if (a(onfVar.b, m55Var)) {
            try {
                return (n55) xh4.l.newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        }
        return new wqa();
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d200168f", new Object[0])).intValue();
        }
        rx3 rx3Var = xh4.j;
        if (rx3Var == null) {
            return 32768;
        }
        String a2 = ((sx3) rx3Var).a("dl_buffersize");
        if (TextUtils.isEmpty(a2) || !TextUtils.isDigitsOnly(a2)) {
            return 32768;
        }
        return Integer.valueOf(a2).intValue();
    }

    public static boolean a(long j, m55 m55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbcf67e", new Object[]{new Long(j), m55Var})).booleanValue();
        }
        rx3 rx3Var = xh4.j;
        if (rx3Var == null) {
            return true;
        }
        boolean equals = "".equals(((sx3) rx3Var).a("dlconnection_anet"));
        String a2 = ((sx3) xh4.j).a("sizeSwitch_anet");
        boolean equals2 = "".equals(((sx3) xh4.j).a("lastUseHuc_anet"));
        int intValue = (TextUtils.isEmpty(a2) || !TextUtils.isDigitsOnly(a2)) ? 0 : Integer.valueOf(a2).intValue();
        if (equals && (0 == j || j > intValue)) {
            if (equals2) {
                return true;
            }
            if (!m55Var.e() && !m55Var.f()) {
                return true;
            }
        }
        return false;
    }
}
