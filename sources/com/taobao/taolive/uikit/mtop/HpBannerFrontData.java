package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class HpBannerFrontData implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<HpBannerFrontData> CREATOR = new a();
    public static final String TYPE_LIVE = "LIVE";
    public static final String TYPE_PIC = "PIC";
    public LiveInfoItem liveVideoDo;
    public String pic;
    public String picUrl;
    public String scm;
    public String spm;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<HpBannerFrontData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public HpBannerFrontData createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HpBannerFrontData) ipChange.ipc$dispatch("7399c0af", new Object[]{this, parcel});
            }
            return new HpBannerFrontData(parcel);
        }

        /* renamed from: b */
        public HpBannerFrontData[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HpBannerFrontData[]) ipChange.ipc$dispatch("e10548e6", new Object[]{this, new Integer(i)});
            }
            return new HpBannerFrontData[i];
        }
    }

    static {
        t2o.a(779093618);
        t2o.a(589299906);
    }

    public HpBannerFrontData() {
        this.type = "";
        this.pic = "";
        this.picUrl = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.pic);
        parcel.writeString(this.picUrl);
        parcel.writeParcelable(this.liveVideoDo, i);
    }

    public HpBannerFrontData(Parcel parcel) {
        this.type = "";
        this.pic = "";
        this.picUrl = "";
        this.type = parcel.readString();
        this.pic = parcel.readString();
        this.picUrl = parcel.readString();
        this.liveVideoDo = (LiveInfoItem) parcel.readParcelable(LiveInfoItem.class.getClassLoader());
    }
}
