package com.taobao.android.nanocompose.foundation.layout.RowColumn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LayoutDirection extends Enum<LayoutDirection> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LayoutDirection Ltr = new LayoutDirection("Ltr", 0);
    public static final LayoutDirection Rtl = new LayoutDirection("Rtl", 1);
    private static final /* synthetic */ LayoutDirection[] $VALUES = $values();

    private static final /* synthetic */ LayoutDirection[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutDirection[]) ipChange.ipc$dispatch("b2732e98", new Object[0]) : new LayoutDirection[]{Ltr, Rtl};
    }

    private LayoutDirection(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(LayoutDirection layoutDirection, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/LayoutDirection");
    }

    public static LayoutDirection valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("1d154283", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(LayoutDirection.class, str);
        }
        return (LayoutDirection) valueOf;
    }

    public static LayoutDirection[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("2774c174", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (LayoutDirection[]) clone;
    }
}
