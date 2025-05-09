package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.l6v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class j2n<T extends l6v> extends u22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699195);
    }

    public static /* synthetic */ Object ipc$super(j2n j2nVar, String str, Object... objArr) {
        if (str.hashCode() == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/events/ProxyUltronSubscriber");
    }

    public abstract T A();

    @Override // tb.u22, tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        super.t(b8vVar);
        A().c(b8vVar);
    }
}
