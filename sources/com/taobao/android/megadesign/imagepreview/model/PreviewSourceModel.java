package com.taobao.android.megadesign.imagepreview.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreviewSourceModel implements Parcelable {
    public static final Parcelable.Creator<PreviewSourceModel> CREATOR = new a();
    private String pictureURL;
    private String type;
    private String videoId;
    private String videoURL;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Parcelable.Creator<PreviewSourceModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public PreviewSourceModel createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PreviewSourceModel) ipChange.ipc$dispatch("1f6c8a86", new Object[]{this, parcel});
            }
            return new PreviewSourceModel(parcel);
        }

        /* renamed from: b */
        public PreviewSourceModel[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PreviewSourceModel[]) ipChange.ipc$dispatch("a0a0d13d", new Object[]{this, new Integer(i)});
            }
            return new PreviewSourceModel[i];
        }
    }

    public PreviewSourceModel(String str, String str2, String str3) {
        this.type = str;
        this.pictureURL = str2;
        this.videoURL = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPictureURL() {
        return this.pictureURL;
    }

    public String getType() {
        return this.type;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public String getVideoURL() {
        return this.videoURL;
    }

    public void setPictureURL(String str) {
        this.pictureURL = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVideoId(String str) {
        this.videoId = str;
    }

    public void setVideoURL(String str) {
        this.videoURL = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.pictureURL);
        parcel.writeString(this.videoURL);
        parcel.writeString(this.videoId);
    }

    public PreviewSourceModel(String str, String str2, String str3, String str4) {
        this.type = str;
        this.pictureURL = str2;
        this.videoURL = str3;
        this.videoId = str4;
    }

    public PreviewSourceModel(Parcel parcel) {
        this.type = parcel.readString();
        this.pictureURL = parcel.readString();
        this.videoURL = parcel.readString();
        this.videoId = parcel.readString();
    }
}
