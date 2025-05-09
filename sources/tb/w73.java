package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w73 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093417);
    }

    public static void a(v73 v73Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80405d42", new Object[]{v73Var, str});
        } else if (v73Var != null) {
            v73Var.v(str);
            long currentTimeMillis = System.currentTimeMillis();
            v73Var.u(currentTimeMillis);
            d(v73Var, "firstFrameRendered", "pageBizDisplayTime:" + currentTimeMillis);
        }
    }

    public static void b(v73 v73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f83ac5c", new Object[]{v73Var});
        } else if (v73Var != null) {
            v73Var.k(null, "onSpanFinishCardAnalysisUtils,onSpanFinish");
            v73Var.p("succeed");
        }
    }

    public static void c(v73 v73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccee379", new Object[]{v73Var});
        } else if (v73Var != null) {
            v73Var.k(null, "onSpanStartCardAnalysisUtils,onSpanStart");
            v73Var.q();
        }
    }

    public static void d(v73 v73Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef2f6b1", new Object[]{v73Var, str, str2});
        } else if (v73Var != null) {
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            v73Var.c(null, str);
        }
    }

    public static void e(v73 v73Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f838981", new Object[]{v73Var, new Boolean(z)});
        } else if (v73Var != null) {
            v73Var.k(null, "CardAnalysisUtils,hasPreload:" + z);
            v73Var.w(z);
        }
    }
}
