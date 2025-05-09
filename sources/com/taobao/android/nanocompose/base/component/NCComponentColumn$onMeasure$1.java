package com.taobao.android.nanocompose.base.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.haz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCComponentColumn$onMeasure$1 extends Lambda implements g1a<haz, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NCComponentColumn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCComponentColumn$onMeasure$1(NCComponentColumn nCComponentColumn) {
        super(1);
        this.this$0 = nCComponentColumn;
    }

    public static /* synthetic */ Object ipc$super(NCComponentColumn$onMeasure$1 nCComponentColumn$onMeasure$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/base/component/NCComponentColumn$onMeasure$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(haz hazVar) {
        m316invokeZri3P70(hazVar.i());
        return xhv.INSTANCE;
    }

    /* renamed from: invoke-Zri3P70  reason: not valid java name */
    public final void m316invokeZri3P70(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc1050b", new Object[]{this, new Long(j)});
        } else {
            NCComponentColumn.access$setMeasuredDimension(this.this$0, haz.f(j), haz.e(j));
        }
    }
}
