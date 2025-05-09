package com.taobao.interact.publish.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ImageSnapshot implements Parcelable, Comparable<ImageSnapshot> {
    public static final Parcelable.Creator<ImageSnapshot> CREATOR = new a();
    private long imageId;
    private boolean isJumpCameraActivity;
    private String path;
    private int sequence;
    private ArrayList<Long> stickerIds;
    private String thumbnails;
    private long time;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<ImageSnapshot> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ImageSnapshot createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageSnapshot) ipChange.ipc$dispatch("c88e2b48", new Object[]{this, parcel});
            }
            ImageSnapshot imageSnapshot = new ImageSnapshot();
            imageSnapshot.path = parcel.readString();
            imageSnapshot.thumbnails = parcel.readString();
            imageSnapshot.imageId = parcel.readLong();
            imageSnapshot.stickerIds = parcel.readArrayList(Long.class.getClassLoader());
            return imageSnapshot;
        }

        /* renamed from: b */
        public ImageSnapshot[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageSnapshot[]) ipChange.ipc$dispatch("8a054031", new Object[]{this, new Integer(i)});
            }
            return new ImageSnapshot[i];
        }
    }

    public ImageSnapshot() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageSnapshot) {
            return this.path.equals(((ImageSnapshot) obj).path);
        }
        return super.equals(obj);
    }

    public long getImageId() {
        return this.imageId;
    }

    public String getPath() {
        return this.path;
    }

    public int getSequence() {
        return this.sequence;
    }

    public ArrayList<Long> getStickerIds() {
        return this.stickerIds;
    }

    public String getThumbnails() {
        return this.thumbnails;
    }

    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public boolean isJumpCameraActivity() {
        return this.isJumpCameraActivity;
    }

    public void setImageId(long j) {
        this.imageId = j;
    }

    public void setJumpCameraActivity(boolean z) {
        this.isJumpCameraActivity = z;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public void setStickerIds(ArrayList<Long> arrayList) {
        this.stickerIds = arrayList;
    }

    public void setThumbnails(String str) {
        this.thumbnails = str;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return "ImageSnapshot [path=" + this.path + ", thumbnails=" + this.thumbnails + ", imageId=" + this.imageId + ", sequence=" + this.sequence + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.thumbnails);
        parcel.writeLong(this.imageId);
        parcel.writeList(this.stickerIds);
    }

    public ImageSnapshot(String str, long j) {
        this.path = str;
        this.imageId = j;
    }

    public int compareTo(ImageSnapshot imageSnapshot) {
        return this.sequence - imageSnapshot.sequence;
    }
}
