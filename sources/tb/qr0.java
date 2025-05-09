package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qr0 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final pr0 j;
    public final lfb k;

    static {
        t2o.a(442499193);
    }

    public qr0(pr0 pr0Var, lfb lfbVar) {
        if (cjz.a()) {
            SkuLogUtils.x("AliXSkuHandlerWrapper_init");
        }
        this.j = pr0Var;
        this.k = lfbVar;
    }

    public static /* synthetic */ Object ipc$super(qr0 qr0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/handler/AliXSkuHandlerWrapper");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        lfb lfbVar = this.k;
        if (lfbVar != null) {
            lfbVar.a(new v2q(b8vVar, this), this.j);
        }
    }
}
