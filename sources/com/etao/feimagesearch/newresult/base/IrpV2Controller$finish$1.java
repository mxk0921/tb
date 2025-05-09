package com.etao.feimagesearch.newresult.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.iqv;
import tb.lg4;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpV2Controller$finish$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IrpV2Controller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpV2Controller$finish$1(IrpV2Controller irpV2Controller) {
        super(0);
        this.this$0 = irpV2Controller;
    }

    public static /* synthetic */ Object ipc$super(IrpV2Controller$finish$1 irpV2Controller$finish$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/base/IrpV2Controller$finish$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        this.this$0.b().b();
        this.this$0.b().a(true, false);
        String str = iqv.KEY_LAST_TIME;
        IrpDatasource n = IrpV2Controller.n(this.this$0);
        if (n == null) {
            ckf.y("irpDatasource");
            throw null;
        } else if (!n.L()) {
            lg4.i4();
        }
    }
}
