package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o8 extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHAIN_STORAGE_REMOVE_KEY = "6114190708471994712";

    static {
        t2o.a(336592940);
    }

    public static /* synthetic */ Object ipc$super(o8 o8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/AKChainStorageRemoveAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        String i = n8Var.i("key");
        if (TextUtils.isEmpty(i)) {
            return new b8(new a8(10008, "KEY 入参为空"), false);
        }
        k8Var.b().remove(i);
        return new f8();
    }
}
