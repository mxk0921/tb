package tb;

import android.app.Activity;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x3x implements jce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31129a = false;

    static {
        t2o.a(980418670);
        t2o.a(982516048);
    }

    @Override // tb.jce
    public Rect a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("5350f7b3", new Object[]{this, activity});
        }
        if (!f31129a) {
            try {
                if (!TBDeviceUtils.p(activity)) {
                    if (TBDeviceUtils.P(activity)) {
                    }
                }
                return rhx.a(activity);
            } catch (Throwable th) {
                dwh.e(dwh.m(th));
                if (th instanceof NoClassDefFoundError) {
                    f31129a = true;
                }
            }
        }
        return new Rect(0, 0, nxh.f(activity), nxh.d(activity));
    }
}
