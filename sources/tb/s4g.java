package tb;

import android.app.Activity;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s4g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27790a = false;

    static {
        t2o.a(806355857);
    }

    public static boolean a(Activity activity, ResultReceiver resultReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da6f4a0c", new Object[]{activity, resultReceiver})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        f27790a = false;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        } else {
            currentFocus = new View(activity);
        }
        return ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0, resultReceiver);
    }

    public static boolean b(View view, ResultReceiver resultReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b111992c", new Object[]{view, resultReceiver})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        f27790a = false;
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0, resultReceiver);
    }

    public static boolean c(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d59b6980", new Object[]{view, new Integer(i)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        try {
            view.requestFocus();
            f27790a = true;
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, i);
        } catch (Exception e) {
            f27790a = false;
            q0h.a("KeyboardUtils", "showKeyboard exp = " + e.getMessage());
            return false;
        }
    }
}
