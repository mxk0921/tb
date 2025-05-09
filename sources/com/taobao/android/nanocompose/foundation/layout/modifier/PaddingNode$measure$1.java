package com.taobao.android.nanocompose.foundation.layout.modifier;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.pdz;
import tb.qjz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PaddingNode$measure$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ pdz $$receiver;
    public final /* synthetic */ qjz $placeable;
    public final /* synthetic */ PaddingNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingNode$measure$1(PaddingNode paddingNode, qjz qjzVar, pdz pdzVar) {
        super(0);
        this.this$0 = paddingNode;
        this.$placeable = qjzVar;
        this.$$receiver = pdzVar;
    }

    public static /* synthetic */ Object ipc$super(PaddingNode$measure$1 paddingNode$measure$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/modifier/PaddingNode$measure$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.this$0.q()) {
            this.$placeable.r(this.$$receiver.f(this.this$0.r()), this.$$receiver.f(this.this$0.s()));
        } else {
            this.$placeable.m(this.$$receiver.f(this.this$0.r()), this.$$receiver.f(this.this$0.s()));
        }
    }
}
