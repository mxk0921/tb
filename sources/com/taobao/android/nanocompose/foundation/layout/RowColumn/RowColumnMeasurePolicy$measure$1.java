package com.taobao.android.nanocompose.foundation.layout.RowColumn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bmz;
import tb.d1a;
import tb.pdz;
import tb.xhv;
import tb.zlz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RowColumnMeasurePolicy$measure$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ pdz $$receiver;
    public final /* synthetic */ zlz $measureResult;
    public final /* synthetic */ bmz $rowColumnMeasureHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowColumnMeasurePolicy$measure$1(bmz bmzVar, zlz zlzVar, pdz pdzVar) {
        super(0);
        this.$rowColumnMeasureHelper = bmzVar;
        this.$measureResult = zlzVar;
        this.$$receiver = pdzVar;
    }

    public static /* synthetic */ Object ipc$super(RowColumnMeasurePolicy$measure$1 rowColumnMeasurePolicy$measure$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/RowColumnMeasurePolicy$measure$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.$rowColumnMeasureHelper.f(this.$measureResult, 0, this.$$receiver.getLayoutDirection());
        }
    }
}
