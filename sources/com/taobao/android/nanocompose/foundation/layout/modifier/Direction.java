package com.taobao.android.nanocompose.foundation.layout.modifier;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Direction extends Enum<Direction> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Direction Vertical = new Direction("Vertical", 0);
    public static final Direction Horizontal = new Direction("Horizontal", 1);
    public static final Direction Both = new Direction("Both", 2);
    private static final /* synthetic */ Direction[] $VALUES = $values();

    private static final /* synthetic */ Direction[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Direction[]) ipChange.ipc$dispatch("d660d9c1", new Object[0]) : new Direction[]{Vertical, Horizontal, Both};
    }

    private Direction(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(Direction direction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/modifier/Direction");
    }

    public static Direction valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("50488836", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(Direction.class, str);
        }
        return (Direction) valueOf;
    }

    public static Direction[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("a0268665", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (Direction[]) clone;
    }
}
