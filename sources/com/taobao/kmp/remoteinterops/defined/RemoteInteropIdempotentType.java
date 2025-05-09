package com.taobao.kmp.remoteinterops.defined;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/kmp/remoteinterops/defined/RemoteInteropIdempotentType;", "", "<init>", "(Ljava/lang/String;I)V", "NULL", "PROCESS", "FUNCTION", "remote-interops_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RemoteInteropIdempotentType extends Enum<RemoteInteropIdempotentType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ RemoteInteropIdempotentType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RemoteInteropIdempotentType NULL = new RemoteInteropIdempotentType("NULL", 0);
    public static final RemoteInteropIdempotentType PROCESS = new RemoteInteropIdempotentType("PROCESS", 1);
    public static final RemoteInteropIdempotentType FUNCTION = new RemoteInteropIdempotentType("FUNCTION", 2);

    private static final /* synthetic */ RemoteInteropIdempotentType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteInteropIdempotentType[]) ipChange.ipc$dispatch("fabff550", new Object[0]) : new RemoteInteropIdempotentType[]{NULL, PROCESS, FUNCTION};
    }

    static {
        RemoteInteropIdempotentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RemoteInteropIdempotentType(String str, int i) {
    }

    public static fg8<RemoteInteropIdempotentType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(RemoteInteropIdempotentType remoteInteropIdempotentType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/remoteinterops/defined/RemoteInteropIdempotentType");
    }

    public static RemoteInteropIdempotentType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropIdempotentType) ipChange.ipc$dispatch("e83abd05", new Object[]{str});
        }
        return (RemoteInteropIdempotentType) Enum.valueOf(RemoteInteropIdempotentType.class, str);
    }

    public static RemoteInteropIdempotentType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropIdempotentType[]) ipChange.ipc$dispatch("76907af4", new Object[0]);
        }
        return (RemoteInteropIdempotentType[]) $VALUES.clone();
    }
}
