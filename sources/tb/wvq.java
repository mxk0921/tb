package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wvq extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBEMSG_KEY = "5073668281949529077";

    static {
        t2o.a(336592966);
    }

    public static /* synthetic */ Object ipc$super(wvq wvqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/SubscribeMsgAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        y7 a2 = k8Var.a();
        if (a2 == null) {
            return new b8(new a8(10013, "引擎为空"), true);
        }
        if (vwf.b(n8Var.h(), "replace", false)) {
            a2.d().c(n8Var.i("action"));
        }
        a2.d().a(n8Var.i("action"), new hr.a(u8Var, k8Var, "true".equals(n8Var.i("receiveOnce"))));
        return new f8();
    }
}
