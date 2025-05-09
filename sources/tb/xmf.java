package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class xmf extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ umf c;

    public xmf(umf umfVar) {
        this.c = umfVar;
    }

    public static /* synthetic */ Object ipc$super(xmf xmfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/IrpScanLoadingWidget$startScanAnimation$1");
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        umf.l0(this.c);
        umf.m0(this.c);
    }
}
