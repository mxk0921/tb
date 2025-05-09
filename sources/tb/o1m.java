package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o1m extends xct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(919601209);
    }

    public static /* synthetic */ Object ipc$super(o1m o1mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/adapter/impl/PhenixTask");
    }

    public final void b(p1m p1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebeabc4", new Object[]{this, p1mVar});
        }
    }
}
