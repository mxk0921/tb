package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ykl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f32150a;

    static {
        t2o.a(157286732);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5614a8ae", new Object[0])).booleanValue();
        }
        Boolean bool = f32150a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (TBDeviceUtils.p(Globals.getApplication()) || TBDeviceUtils.P(Globals.getApplication())) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f32150a = valueOf;
        return valueOf.booleanValue();
    }
}
