package tb;

import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u4g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29134a;

    public static boolean a(View view, ResultReceiver resultReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b111992c", new Object[]{view, resultReceiver})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0, resultReceiver);
    }

    public static boolean b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d59b6980", new Object[]{view, new Integer(i)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.requestFocus();
        f29134a = true;
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, i);
    }
}
