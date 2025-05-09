package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class nay<T> extends l5y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final m8y<T> c;

    static {
        t2o.a(628097457);
    }

    public nay(m8y<T> m8yVar) {
        this.c = m8yVar;
    }

    public static /* synthetic */ Object ipc$super(nay nayVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/l");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else {
            this.c.a(r9yVar);
        }
    }
}
