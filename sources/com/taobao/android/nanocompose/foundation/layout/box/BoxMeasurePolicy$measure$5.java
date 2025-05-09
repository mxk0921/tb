package com.taobao.android.nanocompose.foundation.layout.box;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import tb.a0z;
import tb.d1a;
import tb.ldz;
import tb.pdz;
import tb.qjz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BoxMeasurePolicy$measure$5 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ pdz $$receiver;
    public final /* synthetic */ Ref$IntRef $boxHeight;
    public final /* synthetic */ Ref$IntRef $boxWidth;
    public final /* synthetic */ List<ldz> $measurables;
    public final /* synthetic */ qjz[] $placeables;
    public final /* synthetic */ BoxMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxMeasurePolicy$measure$5(qjz[] qjzVarArr, List<? extends ldz> list, pdz pdzVar, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, BoxMeasurePolicy boxMeasurePolicy) {
        super(0);
        this.$placeables = qjzVarArr;
        this.$measurables = list;
        this.$$receiver = pdzVar;
        this.$boxWidth = ref$IntRef;
        this.$boxHeight = ref$IntRef2;
        this.this$0 = boxMeasurePolicy;
    }

    public static /* synthetic */ Object ipc$super(BoxMeasurePolicy$measure$5 boxMeasurePolicy$measure$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/box/BoxMeasurePolicy$measure$5");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        qjz[] qjzVarArr = this.$placeables;
        List<ldz> list = this.$measurables;
        pdz pdzVar = this.$$receiver;
        Ref$IntRef ref$IntRef = this.$boxWidth;
        Ref$IntRef ref$IntRef2 = this.$boxHeight;
        BoxMeasurePolicy boxMeasurePolicy = this.this$0;
        int i = 0;
        for (qjz qjzVar : qjzVarArr) {
            i++;
            if (qjzVar != null) {
                a0z.b(qjzVar, list.get(i), pdzVar.getLayoutDirection(), ref$IntRef.element, ref$IntRef2.element, BoxMeasurePolicy.b(boxMeasurePolicy));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.foundation.layout.Placeable");
            }
        }
    }
}
