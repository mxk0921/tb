package com.etao.feimagesearch.newresult.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpV2Presenter$assembleSearchPageResult$aiWidgetState$1 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IrpV2Presenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpV2Presenter$assembleSearchPageResult$aiWidgetState$1(IrpV2Presenter irpV2Presenter) {
        super(1);
        this.this$0 = irpV2Presenter;
    }

    public static /* synthetic */ Object ipc$super(IrpV2Presenter$assembleSearchPageResult$aiWidgetState$1 irpV2Presenter$assembleSearchPageResult$aiWidgetState$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/base/IrpV2Presenter$assembleSearchPageResult$aiWidgetState$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else {
            this.this$0.G().e1(z);
        }
    }
}
