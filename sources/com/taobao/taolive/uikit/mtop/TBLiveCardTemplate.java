package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveCardTemplate implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<TBLiveCardTemplate> CREATOR = new a();
    public String name4Android;
    public String url4Android;
    public String version4Android;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TBLiveCardTemplate createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLiveCardTemplate) ipChange.ipc$dispatch("fcf6cfe4", new Object[]{this, parcel});
            }
            return new TBLiveCardTemplate(parcel);
        }

        /* renamed from: b */
        public TBLiveCardTemplate[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLiveCardTemplate[]) ipChange.ipc$dispatch("3cfc4e8d", new Object[]{this, new Integer(i)});
            }
            return new TBLiveCardTemplate[i];
        }
    }

    static {
        t2o.a(779093638);
        t2o.a(589299906);
    }

    public TBLiveCardTemplate() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name4Android);
        parcel.writeString(this.url4Android);
        parcel.writeString(this.version4Android);
    }

    public TBLiveCardTemplate(Parcel parcel) {
        this.name4Android = parcel.readString();
        this.url4Android = parcel.readString();
        this.version4Android = parcel.readString();
    }
}
