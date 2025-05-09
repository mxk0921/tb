package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ParcelableHeader implements Parcelable {
    public static Parcelable.Creator<ParcelableHeader> CREATOR = new Parcelable.Creator<ParcelableHeader>() { // from class: anetwork.channel.aidl.ParcelableHeader.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableHeader createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ParcelableHeader) ipChange.ipc$dispatch("a3f1c0d", new Object[]{this, parcel}) : ParcelableHeader.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableHeader[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ParcelableHeader[]) ipChange.ipc$dispatch("1aca29f6", new Object[]{this, new Integer(i)}) : new ParcelableHeader[i];
        }
    };
    private static final String TAG = "anet.ParcelableHeader";
    public Map<String, List<String>> header;
    public int responseCode;

    static {
        t2o.a(607125998);
    }

    public ParcelableHeader(int i, Map<String, List<String>> map) {
        this.header = map;
        this.responseCode = i;
    }

    public static ParcelableHeader readFromParcel(Parcel parcel) {
        ParcelableHeader parcelableHeader = new ParcelableHeader();
        try {
            if (parcel.readInt() == 1) {
                parcelableHeader.header = parcel.readHashMap(ParcelableHeader.class.getClassLoader());
            }
            parcelableHeader.responseCode = parcel.readInt();
        } catch (Throwable th) {
            ALog.e(TAG, "[readFromParcel]", null, th, new Object[0]);
        }
        return parcelableHeader;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, List<String>> getHeader() {
        return this.header;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String toString() {
        return "ParcelableResponseHeader [responseCode=" + this.responseCode + ", header=" + this.header + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.header != null) {
            parcel.writeInt(1);
            parcel.writeMap(this.header);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.responseCode);
    }

    public ParcelableHeader() {
    }
}
