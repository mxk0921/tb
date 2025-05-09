package com.taobao.nanocompose.megability.annotation;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/nanocompose/megability/annotation/ReturnTypeMode;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "CUSTOM", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ReturnTypeMode extends Enum<ReturnTypeMode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ ReturnTypeMode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ReturnTypeMode NORMAL = new ReturnTypeMode("NORMAL", 0);
    public static final ReturnTypeMode CUSTOM = new ReturnTypeMode("CUSTOM", 1);

    private static final /* synthetic */ ReturnTypeMode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReturnTypeMode[]) ipChange.ipc$dispatch("cd3e3898", new Object[0]) : new ReturnTypeMode[]{NORMAL, CUSTOM};
    }

    static {
        ReturnTypeMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ReturnTypeMode(String str, int i) {
    }

    public static fg8<ReturnTypeMode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(ReturnTypeMode returnTypeMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/annotation/ReturnTypeMode");
    }

    public static ReturnTypeMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReturnTypeMode) ipChange.ipc$dispatch("81822c0d", new Object[]{str});
        }
        return (ReturnTypeMode) Enum.valueOf(ReturnTypeMode.class, str);
    }

    public static ReturnTypeMode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReturnTypeMode[]) ipChange.ipc$dispatch("7abcc93c", new Object[0]);
        }
        return (ReturnTypeMode[]) $VALUES.clone();
    }
}
