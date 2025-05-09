package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import anetwork.channel.Header;
import anetwork.channel.Param;
import anetwork.channel.Request;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ParcelableRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableRequest> CREATOR = new Parcelable.Creator<ParcelableRequest>() { // from class: anetwork.channel.aidl.ParcelableRequest.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableRequest createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ParcelableRequest) ipChange.ipc$dispatch("68ad4aad", new Object[]{this, parcel}) : ParcelableRequest.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableRequest[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ParcelableRequest[]) ipChange.ipc$dispatch("6983f9e4", new Object[]{this, new Integer(i)}) : new ParcelableRequest[i];
        }
    };
    private static final String TAG = "anet.ParcelableRequest";
    public boolean allowRedirect;
    public String bizId;
    public BodyEntry bodyEntry;
    public String charset;
    public int connectTimeout;
    public Map<String, String> extProperties;
    public Map<String, String> headers;
    public String method;
    public Map<String, String> params;
    public int readTimeout;
    public Request request;
    public int retryTime;
    public String seqNo;
    public String url;

    static {
        t2o.a(607126006);
    }

    public ParcelableRequest(Request request) {
        this.headers = null;
        this.params = null;
        this.request = request;
        if (request != null) {
            this.url = request.getUrlString();
            this.retryTime = request.getRetryTime();
            this.charset = request.getCharset();
            this.allowRedirect = request.getFollowRedirects();
            this.method = request.getMethod();
            List<Header> headers = request.getHeaders();
            if (headers != null) {
                this.headers = new HashMap();
                for (Header header : headers) {
                    this.headers.put(header.getName(), header.getValue());
                }
            }
            List<Param> params = request.getParams();
            if (params != null) {
                this.params = new HashMap();
                for (Param param : params) {
                    this.params.put(param.getKey(), param.getValue());
                }
            }
            this.bodyEntry = request.getBodyEntry();
            this.connectTimeout = request.getConnectTimeout();
            this.readTimeout = request.getReadTimeout();
            this.bizId = request.getBizId();
            this.seqNo = request.getSeqNo();
            this.extProperties = request.getExtProperties();
        }
    }

    public static ParcelableRequest readFromParcel(Parcel parcel) {
        ParcelableRequest parcelableRequest = new ParcelableRequest();
        try {
            parcelableRequest.retryTime = parcel.readInt();
            parcelableRequest.url = parcel.readString();
            parcelableRequest.charset = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            parcelableRequest.allowRedirect = z;
            parcelableRequest.method = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.headers = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            if (parcel.readInt() != 0) {
                parcelableRequest.params = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            parcelableRequest.bodyEntry = (BodyEntry) parcel.readParcelable(ParcelableRequest.class.getClassLoader());
            parcelableRequest.connectTimeout = parcel.readInt();
            parcelableRequest.readTimeout = parcel.readInt();
            parcelableRequest.bizId = parcel.readString();
            parcelableRequest.seqNo = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.extProperties = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
        } catch (Throwable th) {
            ALog.w(TAG, "[readFromParcel]", null, th, new Object[0]);
        }
        return parcelableRequest;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getExtProperty(String str) {
        Map<String, String> map = this.extProperties;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        Request request = this.request;
        if (request != null) {
            try {
                parcel.writeInt(request.getRetryTime());
                parcel.writeString(this.url);
                parcel.writeString(this.request.getCharset());
                int i4 = 1;
                parcel.writeInt(this.request.getFollowRedirects() ? 1 : 0);
                parcel.writeString(this.request.getMethod());
                if (this.headers == null) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                parcel.writeInt(i2);
                Map<String, String> map = this.headers;
                if (map != null) {
                    parcel.writeMap(map);
                }
                if (this.params == null) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                parcel.writeInt(i3);
                Map<String, String> map2 = this.params;
                if (map2 != null) {
                    parcel.writeMap(map2);
                }
                parcel.writeParcelable(this.bodyEntry, 0);
                parcel.writeInt(this.request.getConnectTimeout());
                parcel.writeInt(this.request.getReadTimeout());
                parcel.writeString(this.request.getBizId());
                parcel.writeString(this.request.getSeqNo());
                Map<String, String> extProperties = this.request.getExtProperties();
                if (extProperties == null) {
                    i4 = 0;
                }
                parcel.writeInt(i4);
                if (extProperties != null) {
                    parcel.writeMap(extProperties);
                }
            } catch (Throwable th) {
                ALog.w(TAG, "[writeToParcel]", null, th, new Object[0]);
            }
        }
    }

    public ParcelableRequest() {
        this.headers = null;
        this.params = null;
    }
}
