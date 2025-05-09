package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class lmb extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public kmb j;
    public zxb k;

    static {
        t2o.a(479199244);
    }

    public static /* synthetic */ Object ipc$super(lmb lmbVar, String str, Object... objArr) {
        if (str.hashCode() == -1427218546) {
            super.a((lcu) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/ICartSubscriber");
    }

    @Override // tb.l12, tb.qtd
    public void a(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaee5f8e", new Object[]{this, lcuVar});
            return;
        }
        kmb kmbVar = (kmb) lcuVar.f();
        this.j = kmbVar;
        this.k = kmbVar.d();
        super.a(lcuVar);
    }
}
