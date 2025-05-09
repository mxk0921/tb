package com.alibaba.poplayer.trigger;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FutureEvent implements Serializable, Parcelable {
    public static final Parcelable.Creator<FutureEvent> CREATOR = new a();
    private String param;
    private long popEndTimeStamp;
    private String popPageParamContains;
    private String[] popPageUris;
    private String uri;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<FutureEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public FutureEvent createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FutureEvent) ipChange.ipc$dispatch("2bfa591c", new Object[]{this, parcel});
            }
            return new FutureEvent(parcel);
        }

        /* renamed from: b */
        public FutureEvent[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FutureEvent[]) ipChange.ipc$dispatch("45f990c5", new Object[]{this, new Integer(i)});
            }
            return new FutureEvent[i];
        }
    }

    static {
        t2o.a(626000011);
    }

    public FutureEvent(String str, String str2, String[] strArr, String str3, long j) {
        this.uri = str;
        this.param = str2;
        this.popPageUris = strArr;
        this.popPageParamContains = str3;
        this.popEndTimeStamp = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FutureEvent) {
            FutureEvent futureEvent = (FutureEvent) obj;
            if (!TextUtils.isEmpty(this.uri) && !TextUtils.isEmpty(this.param)) {
                if (!this.uri.equals(futureEvent.uri) || !this.param.equals(futureEvent.param)) {
                    return false;
                }
                return true;
            }
        }
        return super.equals(obj);
    }

    public String getParam() {
        return this.param;
    }

    public long getPopEndTimeStamp() {
        return this.popEndTimeStamp;
    }

    public String getPopPageParamContains() {
        return this.popPageParamContains;
    }

    public String[] getPopPageUris() {
        return this.popPageUris;
    }

    public String getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.param);
        parcel.writeStringArray(this.popPageUris);
        parcel.writeString(this.popPageParamContains);
        parcel.writeLong(this.popEndTimeStamp);
    }

    public FutureEvent(Parcel parcel) {
        this.uri = parcel.readString();
        this.param = parcel.readString();
        this.popPageUris = parcel.createStringArray();
        this.popPageParamContains = parcel.readString();
        this.popEndTimeStamp = parcel.readLong();
    }
}
