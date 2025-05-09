package com.taobao.themis.open.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/themis/open/utils/ApPathType;", "", "(Ljava/lang/String;I)V", "AP_PATH_TYPE_USR", "AP_PATH_TYPE_TEMP", "AP_PATH_TYPE_NETWORK", "AP_PATH_TYPE_PKG", "AP_PATH_TYPE_UNKNOWN", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ApPathType extends Enum<ApPathType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ApPathType AP_PATH_TYPE_USR = new ApPathType("AP_PATH_TYPE_USR", 0);
    public static final ApPathType AP_PATH_TYPE_TEMP = new ApPathType("AP_PATH_TYPE_TEMP", 1);
    public static final ApPathType AP_PATH_TYPE_NETWORK = new ApPathType("AP_PATH_TYPE_NETWORK", 2);
    public static final ApPathType AP_PATH_TYPE_PKG = new ApPathType("AP_PATH_TYPE_PKG", 3);
    public static final ApPathType AP_PATH_TYPE_UNKNOWN = new ApPathType("AP_PATH_TYPE_UNKNOWN", 4);
    private static final /* synthetic */ ApPathType[] $VALUES = $values();

    private static final /* synthetic */ ApPathType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ApPathType[]) ipChange.ipc$dispatch("e2980dfa", new Object[0]) : new ApPathType[]{AP_PATH_TYPE_USR, AP_PATH_TYPE_TEMP, AP_PATH_TYPE_NETWORK, AP_PATH_TYPE_PKG, AP_PATH_TYPE_UNKNOWN};
    }

    private ApPathType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(ApPathType apPathType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/utils/ApPathType");
    }

    public static ApPathType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("dae8def", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(ApPathType.class, str);
        }
        return (ApPathType) valueOf;
    }

    public static ApPathType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("7022589e", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (ApPathType[]) clone;
    }
}
