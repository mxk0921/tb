package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ProxyStrategy implements Serializable, Parcelable {
    public static final Parcelable.Creator<ProxyStrategy> CREATOR = new Parcelable.Creator<ProxyStrategy>() { // from class: anet.channel.strategy.ProxyStrategy.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProxyStrategy createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ProxyStrategy) ipChange.ipc$dispatch("9e9bcb44", new Object[]{this, parcel}) : new ProxyStrategy(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProxyStrategy[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ProxyStrategy[]) ipChange.ipc$dispatch("c6a0adfb", new Object[]{this, new Integer(i)}) : new ProxyStrategy[i];
        }
    };
    private static final long serialVersionUID = -9024837279783197261L;
    public ConnHistoryItem connHistoryItem;
    public volatile String ip;
    public volatile int port;
    public volatile String protocol;
    public volatile int status;

    static {
        t2o.a(607125844);
    }

    public ProxyStrategy(Parcel parcel) {
        this.status = -1;
        this.connHistoryItem = new ConnHistoryItem();
        int readInt = parcel.readInt();
        if (readInt == 1) {
            this.ip = parcel.readString();
            this.protocol = parcel.readString();
            this.port = parcel.readInt();
            this.status = parcel.readInt();
            this.connHistoryItem = (ConnHistoryItem) parcel.readParcelable(ConnHistoryItem.class.getClassLoader());
            return;
        }
        throw new IllegalArgumentException("ProxyStrategy Unsupported Parcelable version: " + readInt);
    }

    public static ProxyStrategy create(String str, int i, String str2) {
        return new ProxyStrategy(str, i, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProxyStrategy)) {
            return false;
        }
        ProxyStrategy proxyStrategy = (ProxyStrategy) obj;
        if (this.port != proxyStrategy.port || !this.ip.equals(proxyStrategy.ip) || !this.protocol.equals(proxyStrategy.protocol)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
    }

    public String toString() {
        return "{" + this.ip + ' ' + this.port + ' ' + this.protocol + " historyFail=" + this.connHistoryItem.countFail() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeString(this.ip);
        parcel.writeString(this.protocol);
        parcel.writeInt(this.port);
        parcel.writeInt(this.status);
        parcel.writeParcelable(this.connHistoryItem, i);
    }

    private ProxyStrategy(String str, int i, String str2) {
        this.status = -1;
        this.connHistoryItem = new ConnHistoryItem();
        this.ip = str;
        this.port = i;
        this.protocol = str2;
    }
}
