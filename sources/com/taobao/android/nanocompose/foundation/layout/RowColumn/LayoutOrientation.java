package com.taobao.android.nanocompose.foundation.layout.RowColumn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LayoutOrientation extends Enum<LayoutOrientation> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LayoutOrientation Horizontal = new LayoutOrientation("Horizontal", 0);
    public static final LayoutOrientation Vertical = new LayoutOrientation("Vertical", 1);
    private static final /* synthetic */ LayoutOrientation[] $VALUES = $values();

    private static final /* synthetic */ LayoutOrientation[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutOrientation[]) ipChange.ipc$dispatch("45c47b67", new Object[0]) : new LayoutOrientation[]{Horizontal, Vertical};
    }

    private LayoutOrientation(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(LayoutOrientation layoutOrientation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/LayoutOrientation");
    }

    public static LayoutOrientation valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("90314092", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(LayoutOrientation.class, str);
        }
        return (LayoutOrientation) valueOf;
    }

    public static LayoutOrientation[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("80acc743", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (LayoutOrientation[]) clone;
    }
}
