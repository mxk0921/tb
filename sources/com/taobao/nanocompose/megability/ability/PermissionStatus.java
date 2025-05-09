package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/PermissionStatus;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "AUTHORIZED", "PARTIAL_AUTHORIZED", "DENIED", "BIZ_DENIED", "ROLLBACK", "UNSUPPORTED", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PermissionStatus extends Enum<PermissionStatus> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PermissionStatus[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final PermissionStatus AUTHORIZED = new PermissionStatus("AUTHORIZED", 0, "AUTHORIZED");
    public static final PermissionStatus PARTIAL_AUTHORIZED = new PermissionStatus("PARTIAL_AUTHORIZED", 1, "PARTIAL_AUTHORIZED");
    public static final PermissionStatus DENIED = new PermissionStatus("DENIED", 2, "DENIED");
    public static final PermissionStatus BIZ_DENIED = new PermissionStatus("BIZ_DENIED", 3, "BIZ_DENIED");
    public static final PermissionStatus ROLLBACK = new PermissionStatus("ROLLBACK", 4, "ROLLBACK");
    public static final PermissionStatus UNSUPPORTED = new PermissionStatus("UNSUPPORTED", 5, "UNSUPPORTED");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361830);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ PermissionStatus[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PermissionStatus[]) ipChange.ipc$dispatch("24f373ab", new Object[0]) : new PermissionStatus[]{AUTHORIZED, PARTIAL_AUTHORIZED, DENIED, BIZ_DENIED, ROLLBACK, UNSUPPORTED};
    }

    static {
        PermissionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PermissionStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<PermissionStatus> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PermissionStatus permissionStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/PermissionStatus");
    }

    public static PermissionStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionStatus) ipChange.ipc$dispatch("7d58bd96", new Object[]{str});
        }
        return (PermissionStatus) Enum.valueOf(PermissionStatus.class, str);
    }

    public static PermissionStatus[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionStatus[]) ipChange.ipc$dispatch("32ce3e87", new Object[0]);
        }
        return (PermissionStatus[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
