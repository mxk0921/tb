package com.taobao.android.pissarro.external;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Image implements Parcelable, Comparable<Image> {
    public static final Parcelable.Creator<Image> CREATOR = new a();
    private String coverPath;
    private String coverUrl;
    private int duration;
    private String fileId;
    private int height;
    private String mediaType;
    private String path;
    private String resourceUrl;
    private int sequence;
    private int width;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<Image> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Image createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Image) ipChange.ipc$dispatch("6b2701e2", new Object[]{this, parcel});
            }
            Image image = new Image();
            image.setPath(parcel.readString());
            image.setResourceUrl(parcel.readString());
            image.setCoverPath(parcel.readString());
            image.setCoverUrl(parcel.readString());
            image.setMediaType(parcel.readString());
            image.setWidth(parcel.readInt());
            image.setHeight(parcel.readInt());
            image.setDuration(parcel.readInt());
            image.setSequence(parcel.readInt());
            image.setFileId(parcel.readString());
            return image;
        }

        /* renamed from: b */
        public Image[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Image[]) ipChange.ipc$dispatch("236f34b", new Object[]{this, new Integer(i)});
            }
            return new Image[i];
        }
    }

    static {
        t2o.a(623902772);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCoverPath() {
        return this.coverPath;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getFileId() {
        return this.fileId;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getPath() {
        return this.path;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public int getSequence() {
        return this.sequence;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCoverPath(String str) {
        this.coverPath = str;
    }

    public void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMediaType(String str) {
        this.mediaType = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "Image{path='" + this.path + "', resourceUrl='" + this.resourceUrl + "', coverPath='" + this.coverPath + "', coverUrl='" + this.coverUrl + "', width=" + this.width + ", height=" + this.height + ", mediaType='" + this.mediaType + "', duration=" + this.duration + ", fileId=" + this.fileId + ", sequence=" + this.sequence + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.resourceUrl);
        parcel.writeString(this.coverPath);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.mediaType);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.sequence);
        parcel.writeString(this.fileId);
    }

    public int compareTo(Image image) {
        return this.sequence - image.sequence;
    }
}
