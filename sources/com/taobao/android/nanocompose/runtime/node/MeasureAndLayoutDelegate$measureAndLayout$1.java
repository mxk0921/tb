package com.taobao.android.nanocompose.runtime.node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.d1a;
import tb.waz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MeasureAndLayoutDelegate$measureAndLayout$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$BooleanRef $rootNodeResized;
    public final /* synthetic */ MeasureAndLayoutDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasureAndLayoutDelegate$measureAndLayout$1(MeasureAndLayoutDelegate measureAndLayoutDelegate, Ref$BooleanRef ref$BooleanRef) {
        super(0);
        this.this$0 = measureAndLayoutDelegate;
        this.$rootNodeResized = ref$BooleanRef;
    }

    public static /* synthetic */ Object ipc$super(MeasureAndLayoutDelegate$measureAndLayout$1 measureAndLayoutDelegate$measureAndLayout$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/node/MeasureAndLayoutDelegate$measureAndLayout$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!this.this$0.b().isEmpty()) {
            Iterator<waz> it = this.this$0.b().iterator();
            while (it.hasNext()) {
                waz next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    boolean j = MeasureAndLayoutDelegate.j(this.this$0, next, false, 2, null);
                    if (next == this.this$0.c() && j) {
                        this.$rootNodeResized.element = true;
                    }
                }
            }
            this.this$0.b().clear();
        }
    }
}
