package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class w7y<T> extends jux<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097429);
    }

    public w7y(jzx<T> jzxVar) {
        super(jzxVar);
    }

    public static /* synthetic */ Object ipc$super(w7y w7yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/g");
    }

    @Override // tb.jzx
    public void l(cyx<? super T> cyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dee43b", new Object[]{this, cyxVar});
        } else {
            this.b.j(new q5y(cyxVar));
        }
    }
}
