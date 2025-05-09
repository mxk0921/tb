package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jw3 extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261314);
    }

    public static jw3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jw3) ipChange.ipc$dispatch("99dbc758", new Object[0]);
        }
        return new jw3();
    }

    public static /* synthetic */ Object ipc$super(jw3 jw3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/CloseRateMessage");
    }
}
