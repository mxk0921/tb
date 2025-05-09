package com.taobao.android.nanocompose.foundation.layout.modifier;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.qjz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class SizeNode$measure$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ qjz $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeNode$measure$1(qjz qjzVar) {
        super(0);
        this.$placeable = qjzVar;
    }

    public static /* synthetic */ Object ipc$super(SizeNode$measure$1 sizeNode$measure$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/modifier/SizeNode$measure$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.$placeable.r(0, 0);
        }
    }
}
