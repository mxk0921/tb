package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z7r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f32593a;

    public static boolean a(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5b6e48", new Object[]{context})).booleanValue();
        }
        if (f32593a != null) {
            if (TBDeviceUtils.p(context) || TBDeviceUtils.P(context)) {
                z = true;
            } else {
                z = false;
            }
            f32593a = Boolean.valueOf(z);
        }
        Boolean bool = f32593a;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
