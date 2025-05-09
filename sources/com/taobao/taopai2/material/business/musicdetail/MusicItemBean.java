package com.taobao.taopai2.material.business.musicdetail;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MusicItemBean implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicItemBean> CREATOR = new a();
    public static final int VENDOR_TYPE_XIAMI = 10;
    public String artists;
    public String audioId;
    public String dataFrom;
    public boolean directUseRefrain;
    public String downloadUrl;
    public long duration;
    public String filePath;
    public List<String> iconUrls;
    public String id;
    public boolean liked;
    public String listenUrl;
    public String logoUrl;
    public String name;
    public long refrainEndTime;
    public String refrainSource;
    public long refrainStartTime;
    public String soundId;
    public String subName;
    public int vendorType;
    public String waveformUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<MusicItemBean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public MusicItemBean createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MusicItemBean) ipChange.ipc$dispatch("2506f04c", new Object[]{this, parcel});
            }
            return new MusicItemBean(parcel);
        }

        /* renamed from: b */
        public MusicItemBean[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MusicItemBean[]) ipChange.ipc$dispatch("c8711335", new Object[]{this, new Integer(i)});
            }
            return new MusicItemBean[i];
        }
    }

    static {
        t2o.a(782237872);
    }

    public MusicItemBean() {
        this.dataFrom = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.artists);
        parcel.writeLong(this.duration);
        parcel.writeByte(this.liked ? (byte) 1 : (byte) 0);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.name);
        parcel.writeInt(this.vendorType);
        parcel.writeString(this.filePath);
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.listenUrl);
        parcel.writeString(this.subName);
        parcel.writeString(this.waveformUrl);
        parcel.writeStringList(this.iconUrls);
        parcel.writeLong(this.refrainStartTime);
        parcel.writeLong(this.refrainEndTime);
        parcel.writeByte(this.directUseRefrain ? (byte) 1 : (byte) 0);
        parcel.writeString(this.dataFrom);
        parcel.writeString(this.audioId);
    }

    public MusicItemBean(Parcel parcel) {
        this.dataFrom = "";
        this.id = parcel.readString();
        this.artists = parcel.readString();
        this.duration = parcel.readLong();
        boolean z = false;
        this.liked = parcel.readByte() != 0;
        this.logoUrl = parcel.readString();
        this.name = parcel.readString();
        this.vendorType = parcel.readInt();
        this.filePath = parcel.readString();
        this.downloadUrl = parcel.readString();
        this.listenUrl = parcel.readString();
        this.subName = parcel.readString();
        this.waveformUrl = parcel.readString();
        this.iconUrls = parcel.createStringArrayList();
        this.refrainStartTime = parcel.readLong();
        this.refrainEndTime = parcel.readLong();
        this.directUseRefrain = parcel.readByte() != 0 ? true : z;
        this.dataFrom = parcel.readString();
        this.audioId = parcel.readString();
    }
}
