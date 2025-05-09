package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkResponse implements Response, Parcelable {
    public static final Parcelable.Creator<NetworkResponse> CREATOR = new Parcelable.Creator<NetworkResponse>() { // from class: anetwork.channel.aidl.NetworkResponse.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkResponse createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NetworkResponse) ipChange.ipc$dispatch("afcf2e2a", new Object[]{this, parcel}) : NetworkResponse.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkResponse[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NetworkResponse[]) ipChange.ipc$dispatch("ea263f21", new Object[]{this, new Integer(i)}) : new NetworkResponse[i];
        }
    };
    private static final String TAG = "anet.NetworkResponse";
    byte[] bytedata;
    private Map<String, List<String>> connHeadFields;
    private String desc;
    private Throwable error;
    private StatisticData statisticData;
    int statusCode;

    static {
        t2o.a(607125988);
        t2o.a(607125977);
    }

    public NetworkResponse() {
    }

    public static NetworkResponse readFromParcel(Parcel parcel) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            networkResponse.statusCode = parcel.readInt();
            networkResponse.desc = parcel.readString();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                networkResponse.bytedata = bArr;
                parcel.readByteArray(bArr);
            }
            networkResponse.connHeadFields = parcel.readHashMap(NetworkResponse.class.getClassLoader());
            networkResponse.statisticData = (StatisticData) parcel.readSerializable();
        } catch (Exception e) {
            ALog.w(TAG, "[readFromParcel]", null, e, new Object[0]);
        }
        return networkResponse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anetwork.channel.Response
    public byte[] getBytedata() {
        return this.bytedata;
    }

    @Override // anetwork.channel.Response
    public Map<String, List<String>> getConnHeadFields() {
        return this.connHeadFields;
    }

    @Override // anetwork.channel.Response
    public String getDesc() {
        return this.desc;
    }

    @Override // anetwork.channel.Response
    public Throwable getError() {
        return this.error;
    }

    @Override // anetwork.channel.Response
    public StatisticData getStatisticData() {
        return this.statisticData;
    }

    @Override // anetwork.channel.Response
    public int getStatusCode() {
        return this.statusCode;
    }

    public void setBytedata(byte[] bArr) {
        this.bytedata = bArr;
    }

    public void setConnHeadFields(Map<String, List<String>> map) {
        this.connHeadFields = map;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setError(Throwable th) {
        this.error = th;
    }

    public void setStatisticData(StatisticData statisticData) {
        this.statisticData = statisticData;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
        this.desc = ErrorConstant.getErrMsg(i);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NetworkResponse [statusCode=");
        sb.append(this.statusCode);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", connHeadFields=");
        sb.append(this.connHeadFields);
        sb.append(", bytedata=");
        byte[] bArr = this.bytedata;
        if (bArr != null) {
            str = new String(bArr);
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", statisticData=");
        sb.append(this.statisticData);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.statusCode);
        parcel.writeString(this.desc);
        byte[] bArr = this.bytedata;
        if (bArr != null) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeByteArray(this.bytedata);
        }
        parcel.writeMap(this.connHeadFields);
        StatisticData statisticData = this.statisticData;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    public NetworkResponse(int i) {
        this.statusCode = i;
        this.desc = ErrorConstant.getErrMsg(i);
    }
}
