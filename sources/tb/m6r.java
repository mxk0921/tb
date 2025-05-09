package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class m6r extends u1<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438756);
        t2o.a(1002438792);
    }

    public m6r() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(m6r m6rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBAppMonitorService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.c();
    }

    public /* synthetic */ m6r(asb asbVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : asbVar);
    }

    public m6r(asb asbVar) {
        super(asbVar);
    }
}
