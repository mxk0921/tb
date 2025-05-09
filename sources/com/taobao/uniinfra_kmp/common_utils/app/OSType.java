package com.taobao.uniinfra_kmp.common_utils.app;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/app/OSType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "HARMONY", "iOS", "ANDROID", "WINDOWS", "MACOS", "common_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class OSType extends Enum<OSType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OSType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final OSType UNKNOWN = new OSType("UNKNOWN", 0);
    public static final OSType HARMONY = new OSType("HARMONY", 1);
    public static final OSType iOS = new OSType("iOS", 2);
    public static final OSType ANDROID = new OSType("ANDROID", 3);
    public static final OSType WINDOWS = new OSType("WINDOWS", 4);
    public static final OSType MACOS = new OSType("MACOS", 5);

    private static final /* synthetic */ OSType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OSType[]) ipChange.ipc$dispatch("e5057624", new Object[0]) : new OSType[]{UNKNOWN, HARMONY, iOS, ANDROID, WINDOWS, MACOS};
    }

    static {
        OSType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OSType(String str, int i) {
    }

    public static fg8<OSType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OSType oSType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uniinfra_kmp/common_utils/app/OSType");
    }

    public static OSType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OSType) ipChange.ipc$dispatch("72ab3119", new Object[]{str});
        }
        return (OSType) Enum.valueOf(OSType.class, str);
    }

    public static OSType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OSType[]) ipChange.ipc$dispatch("c7cdcc8", new Object[0]);
        }
        return (OSType[]) $VALUES.clone();
    }
}
