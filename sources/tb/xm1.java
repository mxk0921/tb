package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xm1 extends dn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FATIGUE = "fatigue";
    public static final xm1 c = new xm1();

    static {
        t2o.a(404750418);
    }

    public static xm1 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xm1) ipChange.ipc$dispatch("4b9b01ed", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ Object ipc$super(xm1 xm1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/BRSpUtils");
    }

    @Override // tb.dn1
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "behavir";
    }
}
