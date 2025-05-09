package tb;

import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ee3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PV_FEATURE = "enter.page";
    public static final String KEY_PV_VERSION = "1.0";
    public static final String TAG = "CartUndowngradeSubscriber";

    static {
        t2o.a(478150785);
    }

    public static /* synthetic */ Object ipc$super(ee3 ee3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartUndowngradeSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        UmbrellaTracker.commitSuccessStability(KEY_PV_FEATURE, TAG, "1.0", c9x.CART_BIZ_NAME, null, null);
    }
}
