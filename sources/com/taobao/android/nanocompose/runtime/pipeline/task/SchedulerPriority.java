package com.taobao.android.nanocompose.runtime.pipeline.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class SchedulerPriority extends Enum<SchedulerPriority> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;
    public static final SchedulerPriority UserInteractive = new SchedulerPriority("UserInteractive", 0, 0);
    public static final SchedulerPriority High = new SchedulerPriority("High", 1, 1);
    public static final SchedulerPriority Default = new SchedulerPriority("Default", 2, 2);
    public static final SchedulerPriority Background = new SchedulerPriority("Background", 3, 3);
    public static final SchedulerPriority Idle = new SchedulerPriority("Idle", 4, 4);
    private static final /* synthetic */ SchedulerPriority[] $VALUES = $values();

    private static final /* synthetic */ SchedulerPriority[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SchedulerPriority[]) ipChange.ipc$dispatch("8807ae5a", new Object[0]) : new SchedulerPriority[]{UserInteractive, High, Default, Background, Idle};
    }

    private SchedulerPriority(String str, int i, int i2) {
        this.value = i2;
    }

    public static /* synthetic */ Object ipc$super(SchedulerPriority schedulerPriority, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/task/SchedulerPriority");
    }

    public static SchedulerPriority valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("c00e6fc5", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(SchedulerPriority.class, str);
        }
        return (SchedulerPriority) valueOf;
    }

    public static SchedulerPriority[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("fa9d0f36", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (SchedulerPriority[]) clone;
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
