package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/MEMKVStorageError;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "INVALIDATED_TTL", "DATA_EXPIRED_OR_NOT_EXIST", "LRU_OVERSIZE", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MEMKVStorageError extends Enum<MEMKVStorageError> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ MEMKVStorageError[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final MEMKVStorageError INVALIDATED_TTL = new MEMKVStorageError("INVALIDATED_TTL", 0, "INVALIDATED_TTL");
    public static final MEMKVStorageError DATA_EXPIRED_OR_NOT_EXIST = new MEMKVStorageError("DATA_EXPIRED_OR_NOT_EXIST", 1, "DATA_EXPIRED_OR_NOT_EXIST");
    public static final MEMKVStorageError LRU_OVERSIZE = new MEMKVStorageError("LRU_OVERSIZE", 2, "LRU_OVERSIZE");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361742);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ MEMKVStorageError[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MEMKVStorageError[]) ipChange.ipc$dispatch("a81eef9d", new Object[0]) : new MEMKVStorageError[]{INVALIDATED_TTL, DATA_EXPIRED_OR_NOT_EXIST, LRU_OVERSIZE};
    }

    static {
        MEMKVStorageError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MEMKVStorageError(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<MEMKVStorageError> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(MEMKVStorageError mEMKVStorageError, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/MEMKVStorageError");
    }

    public static MEMKVStorageError valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MEMKVStorageError) ipChange.ipc$dispatch("5c62e312", new Object[]{str});
        }
        return (MEMKVStorageError) Enum.valueOf(MEMKVStorageError.class, str);
    }

    public static MEMKVStorageError[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MEMKVStorageError[]) ipChange.ipc$dispatch("559d8041", new Object[0]);
        }
        return (MEMKVStorageError[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
