package com.taobao.kmp.kernel.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/kmp/kernel/common/LogUtilsLevel;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOG_DEBUG", "LOG_INFO", "LOG_WARN", "LOG_ERROR", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class LogUtilsLevel extends Enum<LogUtilsLevel> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ LogUtilsLevel[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;
    public static final LogUtilsLevel LOG_DEBUG = new LogUtilsLevel("LOG_DEBUG", 0, 1);
    public static final LogUtilsLevel LOG_INFO = new LogUtilsLevel("LOG_INFO", 1, 2);
    public static final LogUtilsLevel LOG_WARN = new LogUtilsLevel("LOG_WARN", 2, 3);
    public static final LogUtilsLevel LOG_ERROR = new LogUtilsLevel("LOG_ERROR", 3, 4);

    private static final /* synthetic */ LogUtilsLevel[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogUtilsLevel[]) ipChange.ipc$dispatch("e1e81e30", new Object[0]) : new LogUtilsLevel[]{LOG_DEBUG, LOG_INFO, LOG_WARN, LOG_ERROR};
    }

    static {
        LogUtilsLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private LogUtilsLevel(String str, int i, int i2) {
        this.value = i2;
    }

    public static fg8<LogUtilsLevel> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(LogUtilsLevel logUtilsLevel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/common/LogUtilsLevel");
    }

    public static LogUtilsLevel valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogUtilsLevel) ipChange.ipc$dispatch("113c9e1b", new Object[]{str});
        }
        return (LogUtilsLevel) Enum.valueOf(LogUtilsLevel.class, str);
    }

    public static LogUtilsLevel[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogUtilsLevel[]) ipChange.ipc$dispatch("120c210c", new Object[0]);
        }
        return (LogUtilsLevel[]) $VALUES.clone();
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
