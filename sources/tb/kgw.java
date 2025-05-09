package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792592);
        new AtomicInteger(1);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ed9c66f", new Object[0])).intValue();
        }
        return View.generateViewId();
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f84c52e", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ((Globals.getApplication().getResources().getConfiguration().uiMode & 48) == 32) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b25f153", new Object[]{view});
        } else if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }
}
