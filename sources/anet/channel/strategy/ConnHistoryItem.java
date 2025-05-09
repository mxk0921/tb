package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.strategy.utils.SerialLruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.m;
import tb.t2o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConnHistoryItem implements Serializable, Parcelable {
    private static final int BAN_THRESHOLD = 3;
    private static final int BAN_TIME = 300000;
    public static final Parcelable.Creator<ConnHistoryItem> CREATOR = new Parcelable.Creator<ConnHistoryItem>() { // from class: anet.channel.strategy.ConnHistoryItem.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnHistoryItem createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ConnHistoryItem) ipChange.ipc$dispatch("9dc22d0a", new Object[]{this, parcel}) : new ConnHistoryItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnHistoryItem[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ConnHistoryItem[]) ipChange.ipc$dispatch("d8193e01", new Object[]{this, new Integer(i)}) : new ConnHistoryItem[i];
        }
    };
    private static final long UPDATE_INTERVAL = 10000;
    private static final long VALID_PERIOD = 86400000;
    private static final long serialVersionUID = 5245740801355223771L;
    public Map<Integer, ConnHistoryItem> fgHistoryItemMap;
    public Map<Integer, ConnHistoryItem> forceCellHistoryItemMap;
    byte history;
    long lastFail;
    long lastSuccess;
    public Map<Integer, ConnHistoryItem> proxyHistoryItemMap;

    static {
        t2o.a(607125829);
    }

    public ConnHistoryItem() {
        this.proxyHistoryItemMap = null;
        this.forceCellHistoryItemMap = null;
        this.fgHistoryItemMap = null;
        this.history = (byte) 0;
        this.lastSuccess = 0L;
        this.lastFail = 0L;
    }

    public int countFail() {
        int i = 0;
        for (int i2 = this.history & 255; i2 > 0; i2 >>= 1) {
            i += i2 & 1;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isExpire() {
        long j = this.lastSuccess;
        long j2 = this.lastFail;
        if (j <= j2) {
            j = j2;
        }
        if (j == 0 || System.currentTimeMillis() - j <= 86400000) {
            return false;
        }
        return true;
    }

    public boolean isExpireStrategy() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.lastFail;
        if (j == 0 || j <= this.lastSuccess) {
            return false;
        }
        if (currentTimeMillis - j <= m.CONFIG_TRACK_1022_INTERVAL_TIME || shouldBan()) {
            return true;
        }
        return false;
    }

    public boolean isUsed() {
        if (this.lastFail == 0 && this.lastSuccess == 0) {
            return false;
        }
        return true;
    }

    public boolean latestFail() {
        if ((this.history & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean shouldBan() {
        if (countFail() >= 3 && System.currentTimeMillis() - this.lastFail <= 300000) {
            return true;
        }
        return false;
    }

    public void update(boolean z) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            j = this.lastSuccess;
        } else {
            j = this.lastFail;
        }
        if (currentTimeMillis - j > 10000) {
            this.history = (byte) ((this.history << 1) | (!z ? 1 : 0));
            if (z) {
                this.lastSuccess = currentTimeMillis;
            } else {
                this.lastFail = currentTimeMillis;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeByte(this.history);
        parcel.writeLong(this.lastSuccess);
        parcel.writeLong(this.lastFail);
        parcel.writeMap(this.proxyHistoryItemMap);
        parcel.writeMap(this.forceCellHistoryItemMap);
        parcel.writeMap(this.fgHistoryItemMap);
    }

    public ConnHistoryItem(Parcel parcel) {
        this.proxyHistoryItemMap = null;
        this.forceCellHistoryItemMap = null;
        this.fgHistoryItemMap = null;
        this.history = (byte) 0;
        this.lastSuccess = 0L;
        this.lastFail = 0L;
        int readInt = parcel.readInt();
        if (readInt == 1) {
            this.history = parcel.readByte();
            this.lastSuccess = parcel.readLong();
            this.lastFail = parcel.readLong();
            if (this.proxyHistoryItemMap == null) {
                this.proxyHistoryItemMap = new SerialLruCache(5);
            }
            parcel.readMap(this.proxyHistoryItemMap, ConnHistoryItem.class.getClassLoader());
            if (this.forceCellHistoryItemMap == null) {
                this.forceCellHistoryItemMap = new SerialLruCache(5);
            }
            parcel.readMap(this.forceCellHistoryItemMap, ConnHistoryItem.class.getClassLoader());
            if (this.fgHistoryItemMap == null) {
                this.fgHistoryItemMap = new SerialLruCache(5);
            }
            parcel.readMap(this.fgHistoryItemMap, ConnHistoryItem.class.getClassLoader());
            return;
        }
        throw new IllegalArgumentException("ConnHistoryItem Unsupported Parcelable version: " + readInt);
    }
}
