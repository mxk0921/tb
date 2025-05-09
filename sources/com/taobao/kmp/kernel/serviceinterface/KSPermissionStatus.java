package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPermissionStatus;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "AUTHORIZED", "PARTIAL_AUTHORIZED", "DENIED", "BIZ_DENIED", "ROLLBACK", "UNSUPPORTED", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPermissionStatus extends Enum<KSPermissionStatus> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSPermissionStatus[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSPermissionStatus AUTHORIZED = new KSPermissionStatus("AUTHORIZED", 0, "AUTHORIZED");
    public static final KSPermissionStatus PARTIAL_AUTHORIZED = new KSPermissionStatus("PARTIAL_AUTHORIZED", 1, "PARTIAL_AUTHORIZED");
    public static final KSPermissionStatus DENIED = new KSPermissionStatus("DENIED", 2, "DENIED");
    public static final KSPermissionStatus BIZ_DENIED = new KSPermissionStatus("BIZ_DENIED", 3, "BIZ_DENIED");
    public static final KSPermissionStatus ROLLBACK = new KSPermissionStatus("ROLLBACK", 4, "ROLLBACK");
    public static final KSPermissionStatus UNSUPPORTED = new KSPermissionStatus("UNSUPPORTED", 5, "UNSUPPORTED");

    private static final /* synthetic */ KSPermissionStatus[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSPermissionStatus[]) ipChange.ipc$dispatch("29dc3dbf", new Object[0]) : new KSPermissionStatus[]{AUTHORIZED, PARTIAL_AUTHORIZED, DENIED, BIZ_DENIED, ROLLBACK, UNSUPPORTED};
    }

    static {
        KSPermissionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KSPermissionStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSPermissionStatus> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSPermissionStatus kSPermissionStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSPermissionStatus");
    }

    public static KSPermissionStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPermissionStatus) ipChange.ipc$dispatch("56008a74", new Object[]{str});
        }
        return (KSPermissionStatus) Enum.valueOf(KSPermissionStatus.class, str);
    }

    public static KSPermissionStatus[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPermissionStatus[]) ipChange.ipc$dispatch("2a4ea763", new Object[0]);
        }
        return (KSPermissionStatus[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
