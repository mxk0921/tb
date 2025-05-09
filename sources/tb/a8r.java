package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f15602a = null;

    static {
        t2o.a(708837561);
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4082ae", new Object[]{activity});
        } else {
            d7r.a(activity);
        }
    }

    public static boolean b(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5b6e48", new Object[]{context})).booleanValue();
        }
        if (f15602a != null) {
            if (TBDeviceUtils.p(context) || TBDeviceUtils.P(context)) {
                z = true;
            } else {
                z = false;
            }
            f15602a = Boolean.valueOf(z);
        }
        Boolean bool = f15602a;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
