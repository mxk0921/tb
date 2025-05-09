package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class QualitySelectItem implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<QualitySelectItem> CREATOR = new a();
    public String artpUrl;
    public String auth_key;
    public String definition;
    public String flvUrl;
    public String h265Url;
    public String hlsUrl;
    public String name;
    public String wholeH265ArtpUrl;
    public String wholeH265FlvUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<QualitySelectItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public QualitySelectItem createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QualitySelectItem) ipChange.ipc$dispatch("a3f8a380", new Object[]{this, parcel});
            }
            return new QualitySelectItem(parcel);
        }

        /* renamed from: b */
        public QualitySelectItem[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QualitySelectItem[]) ipChange.ipc$dispatch("11642bb7", new Object[]{this, new Integer(i)});
            }
            return new QualitySelectItem[i];
        }
    }

    static {
        t2o.a(779093634);
        t2o.a(589299906);
    }

    public QualitySelectItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.flvUrl);
        parcel.writeString(this.h265Url);
        parcel.writeString(this.artpUrl);
        parcel.writeString(this.hlsUrl);
        parcel.writeString(this.auth_key);
        parcel.writeString(this.wholeH265FlvUrl);
        parcel.writeString(this.wholeH265ArtpUrl);
        parcel.writeString(this.definition);
    }

    public QualitySelectItem(Parcel parcel) {
        this.name = parcel.readString();
        this.flvUrl = parcel.readString();
        this.h265Url = parcel.readString();
        this.artpUrl = parcel.readString();
        this.hlsUrl = parcel.readString();
        this.auth_key = parcel.readString();
        this.wholeH265FlvUrl = parcel.readString();
        this.wholeH265ArtpUrl = parcel.readString();
        this.definition = parcel.readString();
    }
}
