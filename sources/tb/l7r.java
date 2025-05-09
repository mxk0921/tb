package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l7r extends u1<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438757);
        t2o.a(1002438794);
    }

    public l7r() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(l7r l7rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBBase64Service");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.d();
    }

    public l7r(asb asbVar) {
        super(asbVar);
    }

    public /* synthetic */ l7r(asb asbVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : asbVar);
    }
}
