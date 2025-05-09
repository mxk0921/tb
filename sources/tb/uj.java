package tb;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691960);
    }

    public static void a(View view) {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc85cb82", new Object[]{view});
        } else if (view != null) {
            Context context = view.getContext();
            try {
                View findFocus = view.findFocus();
                if (findFocus != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
                    inputMethodManager.hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
                    findFocus.clearFocus();
                }
            } catch (Exception e) {
                ck.g().b("AURAKeyboardUtil", MspEventTypes.ACTION_STRING_HIDE_KEYBOARD, e.getMessage());
            }
        }
    }
}
