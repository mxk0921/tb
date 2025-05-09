package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rib;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rt7 extends du {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(736100408);
    }

    public rt7(qh2 qh2Var, lh2 lh2Var, a29 a29Var, xiq xiqVar, rib.a aVar) {
        super(qh2Var, lh2Var, a29Var, xiqVar, aVar);
    }

    public static /* synthetic */ Object ipc$super(rt7 rt7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/arch/flow/state/lifestate/DownLoadState");
    }

    @Override // tb.du
    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc60f4f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        tm1.a("2ARCH_DownLoadState", "handle: ");
        this.b.e(this.c, i2);
    }

    @Override // tb.jsd
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 105;
    }
}
