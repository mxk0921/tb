package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class apr extends u1<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438767);
        t2o.a(1002438837);
    }

    public apr() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(apr aprVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBMemKVStorage");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.l();
    }

    public apr(asb asbVar) {
        super(asbVar);
    }

    public /* synthetic */ apr(asb asbVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : asbVar);
    }
}
