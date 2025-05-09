package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bw3 extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261312);
    }

    public static bw3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bw3) ipChange.ipc$dispatch("964ecc3a", new Object[0]);
        }
        return new bw3();
    }

    public static /* synthetic */ Object ipc$super(bw3 bw3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/CloseFloatRateMessage");
    }
}
