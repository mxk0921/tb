package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DefaultProgressEvent implements NetworkEvent.ProgressEvent, Parcelable {
    public static final Parcelable.Creator<DefaultProgressEvent> CREATOR = new Parcelable.Creator<DefaultProgressEvent>() { // from class: anetwork.channel.aidl.DefaultProgressEvent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultProgressEvent createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DefaultProgressEvent) ipChange.ipc$dispatch("6280e831", new Object[]{this, parcel}) : DefaultProgressEvent.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultProgressEvent[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DefaultProgressEvent[]) ipChange.ipc$dispatch("f990d99a", new Object[]{this, new Integer(i)}) : new DefaultProgressEvent[i];
        }
    };
    private static final String TAG = "anet.DefaultProgressEvent";
    Object context;
    int fragmentIndex;
    int index;
    byte[] out;
    int size;
    int total;

    static {
        t2o.a(607125983);
        t2o.a(607125972);
    }

    public DefaultProgressEvent() {
    }

    public static DefaultProgressEvent readFromParcel(Parcel parcel) {
        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent();
        try {
            defaultProgressEvent.index = parcel.readInt();
            defaultProgressEvent.size = parcel.readInt();
            defaultProgressEvent.total = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                defaultProgressEvent.out = bArr;
            }
            defaultProgressEvent.fragmentIndex = parcel.readInt();
        } catch (Exception unused) {
        }
        return defaultProgressEvent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public byte[] getBytedata() {
        return this.out;
    }

    public Object getContext() {
        return this.context;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public String getDesc() {
        return "";
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getFragmentIndex() {
        return this.fragmentIndex;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getIndex() {
        return this.index;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getSize() {
        return this.size;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getTotal() {
        return this.total;
    }

    public void setContext(Object obj) {
        this.context = obj;
    }

    public String toString() {
        return "DefaultProgressEvent [index=" + this.index + ", size=" + this.size + ", total=" + this.total + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.index);
        parcel.writeInt(this.size);
        parcel.writeInt(this.total);
        byte[] bArr = this.out;
        if (bArr != null) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeByteArray(this.out);
        parcel.writeInt(this.fragmentIndex);
    }

    public DefaultProgressEvent(int i, int i2, int i3, byte[] bArr) {
        this.index = i;
        this.size = i2;
        this.total = i3;
        this.out = bArr;
    }

    public DefaultProgressEvent(int i, int i2, int i3, byte[] bArr, int i4) {
        this.index = i;
        this.size = i2;
        this.total = i3;
        this.out = bArr;
        this.fragmentIndex = i4;
    }
}
