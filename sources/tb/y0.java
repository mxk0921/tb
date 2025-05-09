package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f31750a;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bc11aca", new Object[]{str})).booleanValue();
        }
        if (f31750a) {
            try {
                boolean isFeatureOpened = ABGlobal.isFeatureOpened(a.g, str);
                OLog.i("ABUtil", "isFeatureOpened", ru1.FEATURE_NAME, str, "opened", Boolean.valueOf(isFeatureOpened));
                return isFeatureOpened;
            } catch (Throwable th) {
                OLog.e("ABUtil", "isFeatureOpened", th, new Object[0]);
            }
        }
        return false;
    }

    static {
        t2o.a(613417110);
        f31750a = false;
        try {
            f31750a = true;
        } catch (Exception unused) {
            f31750a = false;
            OLog.e("ABUtil", "", "mABValid", false);
        }
    }
}
