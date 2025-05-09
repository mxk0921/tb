package com.taobao.themis.open.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/open/utils/LocalPathType;", "", "(Ljava/lang/String;I)V", "LOCAL_PATH_TYPE_USR", "LOCAL_PATH_TYPE_TEMP", "LOCAL_PATH_TYPE_UNKNOWN", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class LocalPathType extends Enum<LocalPathType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LocalPathType LOCAL_PATH_TYPE_USR = new LocalPathType("LOCAL_PATH_TYPE_USR", 0);
    public static final LocalPathType LOCAL_PATH_TYPE_TEMP = new LocalPathType("LOCAL_PATH_TYPE_TEMP", 1);
    public static final LocalPathType LOCAL_PATH_TYPE_UNKNOWN = new LocalPathType("LOCAL_PATH_TYPE_UNKNOWN", 2);
    private static final /* synthetic */ LocalPathType[] $VALUES = $values();

    private static final /* synthetic */ LocalPathType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocalPathType[]) ipChange.ipc$dispatch("fbb81a84", new Object[0]) : new LocalPathType[]{LOCAL_PATH_TYPE_USR, LOCAL_PATH_TYPE_TEMP, LOCAL_PATH_TYPE_UNKNOWN};
    }

    private LocalPathType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(LocalPathType localPathType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/utils/LocalPathType");
    }

    public static LocalPathType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("2b0c9a6f", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(LocalPathType.class, str);
        }
        return (LocalPathType) valueOf;
    }

    public static LocalPathType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("2bdc1d60", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (LocalPathType[]) clone;
    }
}
