package com.taobao.android.nanocompose.foundation.layout.RowColumn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.can;
import tb.ckf;
import tb.u1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Arrangement$spacedBy$3 extends Lambda implements u1a<Integer, LayoutDirection, Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ can.c $alignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Arrangement$spacedBy$3(can.c cVar) {
        super(2);
        this.$alignment = cVar;
    }

    public static /* synthetic */ Object ipc$super(Arrangement$spacedBy$3 arrangement$spacedBy$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/Arrangement$spacedBy$3");
    }

    public final int invoke(int i, LayoutDirection layoutDirection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fef28f9d", new Object[]{this, new Integer(i), layoutDirection})).intValue();
        }
        ckf.g(layoutDirection, "$noName_1");
        return this.$alignment.a(0, i);
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
        return Integer.valueOf(invoke(num.intValue(), layoutDirection));
    }
}
