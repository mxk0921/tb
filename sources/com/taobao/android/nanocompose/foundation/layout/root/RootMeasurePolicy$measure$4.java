package com.taobao.android.nanocompose.foundation.layout.root;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.qjz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RootMeasurePolicy$measure$4 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ List<qjz> $placeableList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RootMeasurePolicy$measure$4(List<? extends qjz> list) {
        super(0);
        this.$placeableList = list;
    }

    public static /* synthetic */ Object ipc$super(RootMeasurePolicy$measure$4 rootMeasurePolicy$measure$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/root/RootMeasurePolicy$measure$4");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        List<qjz> list = this.$placeableList;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                list.get(i).r(0, 0);
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
