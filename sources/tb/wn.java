package tb;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740658);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbdd879e", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager == null) {
                return false;
            }
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (!isEnabled || !isTouchExplorationEnabled) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
