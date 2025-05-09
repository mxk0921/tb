package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSNetworkNetStatus;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "_2G", "_3G", "_4G", "_5G", "WiFi", "NoNetwork", "NETWORK_UNKNOWN", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSNetworkNetStatus extends Enum<KSNetworkNetStatus> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSNetworkNetStatus[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSNetworkNetStatus _2G = new KSNetworkNetStatus("_2G", 0, "2G");
    public static final KSNetworkNetStatus _3G = new KSNetworkNetStatus("_3G", 1, "3G");
    public static final KSNetworkNetStatus _4G = new KSNetworkNetStatus("_4G", 2, "4G");
    public static final KSNetworkNetStatus _5G = new KSNetworkNetStatus("_5G", 3, "5G");
    public static final KSNetworkNetStatus WiFi = new KSNetworkNetStatus("WiFi", 4, "WiFi");
    public static final KSNetworkNetStatus NoNetwork = new KSNetworkNetStatus("NoNetwork", 5, "NoNetwork");
    public static final KSNetworkNetStatus NETWORK_UNKNOWN = new KSNetworkNetStatus("NETWORK_UNKNOWN", 6, "NETWORK_UNKNOWN");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438897);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ KSNetworkNetStatus[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSNetworkNetStatus[]) ipChange.ipc$dispatch("d7ffeaff", new Object[0]) : new KSNetworkNetStatus[]{_2G, _3G, _4G, _5G, WiFi, NoNetwork, NETWORK_UNKNOWN};
    }

    static {
        KSNetworkNetStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private KSNetworkNetStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSNetworkNetStatus> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSNetworkNetStatus kSNetworkNetStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSNetworkNetStatus");
    }

    public static KSNetworkNetStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSNetworkNetStatus) ipChange.ipc$dispatch("42437b4", new Object[]{str});
        }
        return (KSNetworkNetStatus) Enum.valueOf(KSNetworkNetStatus.class, str);
    }

    public static KSNetworkNetStatus[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSNetworkNetStatus[]) ipChange.ipc$dispatch("d87254a3", new Object[0]);
        }
        return (KSNetworkNetStatus[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
