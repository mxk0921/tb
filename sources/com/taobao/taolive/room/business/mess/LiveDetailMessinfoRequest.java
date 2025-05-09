package com.taobao.taolive.room.business.mess;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.j5m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveDetailMessinfoRequest implements INetDataObject, Parcelable, Cloneable {
    public static final Parcelable.Creator<LiveDetailMessinfoRequest> CREATOR = new a();
    private String API_NAME;
    private boolean NEED_ECODE;
    private boolean NEED_SESSION;
    private String VERSION;
    public String accountStays;
    public String creatorId;
    public String liveId;
    public long n;
    public long s;
    public String serviceVersion;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<LiveDetailMessinfoRequest> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public LiveDetailMessinfoRequest createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveDetailMessinfoRequest) ipChange.ipc$dispatch("8b5c7164", new Object[]{this, parcel});
            }
            return new LiveDetailMessinfoRequest(parcel);
        }

        /* renamed from: b */
        public LiveDetailMessinfoRequest[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveDetailMessinfoRequest[]) ipChange.ipc$dispatch("5536ab9b", new Object[]{this, new Integer(i)});
            }
            return new LiveDetailMessinfoRequest[i];
        }
    }

    static {
        t2o.a(779092821);
        t2o.a(806355930);
    }

    public LiveDetailMessinfoRequest() {
        this.API_NAME = "mtop.mediaplatform.livedetail.messinfo";
        this.VERSION = "2.0";
        this.NEED_ECODE = false;
        this.NEED_SESSION = false;
        this.creatorId = null;
        this.serviceVersion = j5m.API_VERSION;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.API_NAME);
        parcel.writeString(this.VERSION);
        parcel.writeByte(this.NEED_ECODE ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.NEED_SESSION ? (byte) 1 : (byte) 0);
        parcel.writeString(this.creatorId);
        parcel.writeString(this.type);
        parcel.writeString(this.liveId);
        parcel.writeLong(this.s);
        parcel.writeLong(this.n);
        parcel.writeString(this.accountStays);
    }

    public LiveDetailMessinfoRequest(Parcel parcel) {
        this.API_NAME = "mtop.mediaplatform.livedetail.messinfo";
        this.VERSION = "2.0";
        boolean z = false;
        this.NEED_ECODE = false;
        this.NEED_SESSION = false;
        this.creatorId = null;
        this.serviceVersion = j5m.API_VERSION;
        this.API_NAME = parcel.readString();
        this.VERSION = parcel.readString();
        this.NEED_ECODE = parcel.readByte() != 0;
        this.NEED_SESSION = parcel.readByte() != 0 ? true : z;
        this.creatorId = parcel.readString();
        this.type = parcel.readString();
        this.liveId = parcel.readString();
        this.s = parcel.readLong();
        this.n = parcel.readLong();
        this.accountStays = parcel.readString();
    }
}
