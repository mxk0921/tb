package com.taobao.android.nanocompose.foundation.layout.box;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.a0z;
import tb.d1a;
import tb.ldz;
import tb.pdz;
import tb.qjz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BoxMeasurePolicy$measure$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ pdz $$receiver;
    public final /* synthetic */ int $boxHeight;
    public final /* synthetic */ int $boxWidth;
    public final /* synthetic */ ldz $measurable;
    public final /* synthetic */ qjz $placeable;
    public final /* synthetic */ BoxMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxMeasurePolicy$measure$2(qjz qjzVar, ldz ldzVar, pdz pdzVar, int i, int i2, BoxMeasurePolicy boxMeasurePolicy) {
        super(0);
        this.$placeable = qjzVar;
        this.$measurable = ldzVar;
        this.$$receiver = pdzVar;
        this.$boxWidth = i;
        this.$boxHeight = i2;
        this.this$0 = boxMeasurePolicy;
    }

    public static /* synthetic */ Object ipc$super(BoxMeasurePolicy$measure$2 boxMeasurePolicy$measure$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/box/BoxMeasurePolicy$measure$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            a0z.b(this.$placeable, this.$measurable, this.$$receiver.getLayoutDirection(), this.$boxWidth, this.$boxHeight, BoxMeasurePolicy.b(this.this$0));
        }
    }
}
