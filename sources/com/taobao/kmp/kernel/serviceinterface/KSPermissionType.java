package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPermissionType;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "RECORD_AUDIO", "ACCESS_FINE_LOCATION", "WRITE_CALENDAR", "NFC", "READ_EXTERNAL_STORAGE", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPermissionType extends Enum<KSPermissionType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSPermissionType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSPermissionType RECORD_AUDIO = new KSPermissionType("RECORD_AUDIO", 0, "RECORD_AUDIO");
    public static final KSPermissionType ACCESS_FINE_LOCATION = new KSPermissionType("ACCESS_FINE_LOCATION", 1, "ACCESS_FINE_LOCATION");
    public static final KSPermissionType WRITE_CALENDAR = new KSPermissionType("WRITE_CALENDAR", 2, "WRITE_CALENDAR");
    public static final KSPermissionType NFC = new KSPermissionType("NFC", 3, "NFC");
    public static final KSPermissionType READ_EXTERNAL_STORAGE = new KSPermissionType("READ_EXTERNAL_STORAGE", 4, "READ_EXTERNAL_STORAGE");

    private static final /* synthetic */ KSPermissionType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSPermissionType[]) ipChange.ipc$dispatch("8591bcf7", new Object[0]) : new KSPermissionType[]{RECORD_AUDIO, ACCESS_FINE_LOCATION, WRITE_CALENDAR, NFC, READ_EXTERNAL_STORAGE};
    }

    static {
        KSPermissionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KSPermissionType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSPermissionType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSPermissionType kSPermissionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSPermissionType");
    }

    public static KSPermissionType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPermissionType) ipChange.ipc$dispatch("3c5bb2ec", new Object[]{str});
        }
        return (KSPermissionType) Enum.valueOf(KSPermissionType.class, str);
    }

    public static KSPermissionType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPermissionType[]) ipChange.ipc$dispatch("861a3f9b", new Object[0]);
        }
        return (KSPermissionType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
