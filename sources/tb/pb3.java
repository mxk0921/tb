package tb;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int sMaxCheckCount = vav.e(c9x.CART_BIZ_NAME, "maxCheckCountOfImageTracker", 3);

    /* renamed from: a  reason: collision with root package name */
    public static int f25993a = 0;
    public static int b = 0;
    public static boolean c = false;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1abf2b70", new Object[0])).booleanValue();
        }
        if (f25993a >= Math.min(sMaxCheckCount, b)) {
            return true;
        }
        return false;
    }

    public static void b(Context context, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af03ea9", new Object[]{context, str, view});
        } else if (context != null && str != null) {
            if (context instanceof bew) {
                context = ((bew) context).b();
            }
            if (context != null) {
                c = true;
                try {
                    if (a()) {
                        e("loadFinish");
                        z9v.u(context).B(na3.sStageLoadImage, false, null);
                    } else {
                        f25993a++;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void c(Context context, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd87ca18", new Object[]{context, str});
        } else if (context != null && str != null && (i = b) < sMaxCheckCount) {
            b = i + 1;
        }
    }

    public static void d(Context context, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cdd8f8", new Object[]{context, recyclerView});
        } else {
            f(context, recyclerView);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9407d367", new Object[]{str});
        }
    }

    public static boolean f(Context context, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93786bea", new Object[]{context, recyclerView})).booleanValue();
        }
        if (!c) {
            e("noItemImage");
            return false;
        } else if (context == null || recyclerView == null) {
            e("null");
            return false;
        } else if (a()) {
            e("alreadyFinish");
            return false;
        } else {
            z9v.u(context).D(na3.sStageLoadImage, "apmClientContainerRender");
            return true;
        }
    }

    static {
        t2o.a(479199495);
    }
}
