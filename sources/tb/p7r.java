package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.aspect.error.adjust")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class p7r extends us {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837479);
    }

    public static /* synthetic */ Object ipc$super(p7r p7rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/aspect/TBBuyAdjustOrderErrorExtension");
    }

    public final boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("988b7c39", new Object[]{this})).booleanValue();
        }
        AURAGlobalData B = B();
        io0 io0Var = (io0) B.get("aliBuyGlobalDataStreamResponseProcessor", io0.class);
        if (io0Var != null) {
            return io0Var.v(L().c(), B);
        }
        ck.g().f("streamExceptionProcessor is null !!", ck.b.b().l("TBBuyAdjustOrderErrorExtension").a());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    @Override // tb.wab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(tb.mi r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p7r.b(tb.mi):void");
    }
}
