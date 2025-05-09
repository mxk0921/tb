package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m0z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322000);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c6bab67", new Object[]{context})).booleanValue();
        }
        if (context instanceof Activity) {
            return nz0.a((Activity) context);
        }
        return false;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25c3f789", new Object[]{context})).booleanValue();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (context instanceof BaseActivity) {
                ((BaseActivity) context).disableFinishAnimationOnce();
            }
            if (nz0.b(activity)) {
                activity.overridePendingTransition(0, 0);
                return true;
            }
        }
        return false;
    }
}
