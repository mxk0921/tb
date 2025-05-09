package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ew3 extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261313);
    }

    public static ew3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ew3) ipChange.ipc$dispatch("a2e10bea", new Object[0]);
        }
        return new ew3();
    }

    public static /* synthetic */ Object ipc$super(ew3 ew3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/CloseMultiPopDialogMessage");
    }
}
