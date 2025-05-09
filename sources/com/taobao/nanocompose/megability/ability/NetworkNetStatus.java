package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/NetworkNetStatus;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "_2G", "_3G", "_4G", "_5G", "WiFi", "NoNetwork", "NETWORK_UNKNOWN", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class NetworkNetStatus extends Enum<NetworkNetStatus> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ NetworkNetStatus[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final NetworkNetStatus _2G = new NetworkNetStatus("_2G", 0, "2G");
    public static final NetworkNetStatus _3G = new NetworkNetStatus("_3G", 1, "3G");
    public static final NetworkNetStatus _4G = new NetworkNetStatus("_4G", 2, "4G");
    public static final NetworkNetStatus _5G = new NetworkNetStatus("_5G", 3, "5G");
    public static final NetworkNetStatus WiFi = new NetworkNetStatus("WiFi", 4, "WiFi");
    public static final NetworkNetStatus NoNetwork = new NetworkNetStatus("NoNetwork", 5, "NoNetwork");
    public static final NetworkNetStatus NETWORK_UNKNOWN = new NetworkNetStatus("NETWORK_UNKNOWN", 6, "NETWORK_UNKNOWN");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361786);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ NetworkNetStatus[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkNetStatus[]) ipChange.ipc$dispatch("d31720eb", new Object[0]) : new NetworkNetStatus[]{_2G, _3G, _4G, _5G, WiFi, NoNetwork, NETWORK_UNKNOWN};
    }

    static {
        NetworkNetStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private NetworkNetStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<NetworkNetStatus> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(NetworkNetStatus networkNetStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/NetworkNetStatus");
    }

    public static NetworkNetStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkNetStatus) ipChange.ipc$dispatch("2b7c6ad6", new Object[]{str});
        }
        return (NetworkNetStatus) Enum.valueOf(NetworkNetStatus.class, str);
    }

    public static NetworkNetStatus[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkNetStatus[]) ipChange.ipc$dispatch("e0f1ebc7", new Object[0]);
        }
        return (NetworkNetStatus[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
