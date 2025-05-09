package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c9q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705654);
    }

    public static void a(Context context) {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb05698", new Object[]{context});
        } else if (context != null && (inputMethodManager = (InputMethodManager) context.getApplicationContext().getSystemService("input_method")) != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    public static final void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f366248d", new Object[]{view});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean c(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efd4c842", new Object[]{activity, view})).booleanValue();
        }
        if (activity == null || view == null) {
            return false;
        }
        int e = vwo.e(activity) + vwo.g(activity);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (rect.bottom <= e * 0.75f) {
            return true;
        }
        return false;
    }

    public static final void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd7648", new Object[]{view});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 0);
        }
    }
}
