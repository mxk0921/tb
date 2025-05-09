package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ljm extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POSTMSG_KEY = "5213810857266851316";

    static {
        t2o.a(336592965);
    }

    public static /* synthetic */ Object ipc$super(ljm ljmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/PostMsgAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        y7 a2 = k8Var.a();
        if (a2 == null) {
            return new b8(new a8(cdw.T_BORDER_WIDTH, "引擎为空"), true);
        }
        a2.d().b(n8Var.i("action"), n8Var.g("data"));
        return new f8();
    }
}
