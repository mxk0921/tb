package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class k6y<T> extends kux<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final vxx<? super sxx> d;
    public final fux e;

    static {
        t2o.a(628097447);
    }

    public k6y(l5y<T> l5yVar, vxx<? super sxx> vxxVar, fux fuxVar) {
        super(l5yVar);
        this.d = vxxVar;
        this.e = fuxVar;
    }

    public static /* synthetic */ Object ipc$super(k6y k6yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/f");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else {
            this.c.a(new h4y(r9yVar, this.d, this.e));
        }
    }
}
