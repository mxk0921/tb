package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p8 extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHAIN_STORAGE_SET_KEY = "-672072475718291693";

    static {
        t2o.a(336592941);
    }

    public static /* synthetic */ Object ipc$super(p8 p8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/AKChainStorageSetAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        String i = n8Var.i("key");
        if (TextUtils.isEmpty(i)) {
            return new b8(new a8(10007, "KEY 入参为空"), false);
        }
        Object a2 = n8Var.a("value");
        if ("1.0".equals(n8Var.j())) {
            k8Var.b().put(i, a2);
        } else if (!h4g.c(i, k8Var.b(), a2)) {
            return new b8(new a8(10007, "更新数据出错"), false);
        }
        return new f8();
    }
}
