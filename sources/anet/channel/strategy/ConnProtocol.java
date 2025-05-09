package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.strategy.StrategyResultParser;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConnProtocol implements Serializable, Parcelable {
    private static final long serialVersionUID = -3523201990674557001L;
    final int isHttp;
    final int isHttp3;
    public final String name;
    public final String protocol;
    public final String publicKey;
    public final String rtt;
    private static Map<String, ConnProtocol> protocolMap = new HashMap();
    public static final ConnProtocol HTTP = valueOf("http", null, null);
    public static final ConnProtocol HTTPS = valueOf("https", null, null);
    public static final Parcelable.Creator<ConnProtocol> CREATOR = new Parcelable.Creator<ConnProtocol>() { // from class: anet.channel.strategy.ConnProtocol.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnProtocol createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ConnProtocol) ipChange.ipc$dispatch("b421b2ad", new Object[]{this, parcel}) : new ConnProtocol(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnProtocol[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ConnProtocol[]) ipChange.ipc$dispatch("ad2a1d16", new Object[]{this, new Integer(i)}) : new ConnProtocol[i];
        }
    };

    public ConnProtocol(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == 1) {
            this.protocol = parcel.readString();
            this.rtt = parcel.readString();
            this.publicKey = parcel.readString();
            this.name = parcel.readString();
            this.isHttp = parcel.readInt();
            this.isHttp3 = parcel.readInt();
            return;
        }
        throw new IllegalArgumentException("ConnProtocol Unsupported Parcelable version: " + readInt);
    }

    private static String buildName(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append("_");
            sb.append(str2);
        } else {
            sb.append("_0rtt");
        }
        sb.append("_");
        sb.append(str3);
        return sb.toString();
    }

    public static ConnProtocol valueOf(StrategyResultParser.Aisles aisles) {
        if (aisles == null) {
            return null;
        }
        return valueOf(aisles.protocol, aisles.rtt, aisles.publicKey);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ConnProtocol)) {
            return false;
        }
        return this.name.equals(((ConnProtocol) obj).name);
    }

    public int hashCode() {
        int hashCode = 527 + this.protocol.hashCode();
        String str = this.rtt;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.publicKey;
        if (str2 != null) {
            return (hashCode * 31) + str2.hashCode();
        }
        return hashCode;
    }

    public String toString() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeString(this.protocol);
        parcel.writeString(this.rtt);
        parcel.writeString(this.publicKey);
        parcel.writeString(this.name);
        parcel.writeInt(this.isHttp);
        parcel.writeInt(this.isHttp3);
    }

    public static ConnProtocol valueOf(StrategyResultParser.ChannelAttribute channelAttribute) {
        if (channelAttribute == null) {
            return null;
        }
        return valueOf(channelAttribute.protocol, channelAttribute.rtt, channelAttribute.publicKey);
    }

    @Deprecated
    public static ConnProtocol valueOf(String str, String str2, String str3, @Deprecated boolean z) {
        return valueOf(str, str2, str3);
    }

    static {
        t2o.a(607125831);
    }

    public static ConnProtocol valueOf(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String buildName = buildName(str, str2, str3);
        synchronized (protocolMap) {
            try {
                if (protocolMap.containsKey(buildName)) {
                    return protocolMap.get(buildName);
                }
                ConnProtocol connProtocol = new ConnProtocol(buildName, str, str2, str3);
                protocolMap.put(buildName, connProtocol);
                return connProtocol;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ConnProtocol(String str, String str2, String str3, String str4) {
        this.name = str;
        this.protocol = str2;
        this.rtt = str3;
        this.publicKey = str4;
        int i = 1;
        this.isHttp = ("http".equalsIgnoreCase(str2) || "https".equalsIgnoreCase(str2)) ? 1 : 0;
        if (!ConnType.HTTP3.equalsIgnoreCase(str2) && !ConnType.HTTP3_1RTT.equalsIgnoreCase(str2) && !ConnType.HTTP3_PLAIN.equalsIgnoreCase(str2)) {
            i = 0;
        }
        this.isHttp3 = i;
    }
}
