package com.taobao.android.pissarro.album.entities;

import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nxv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MediaImage implements Parcelable {
    public static final Parcelable.Creator<MediaImage> CREATOR = new a();
    private String displayName;
    private String id;
    private boolean isEdited;
    private String mimeType;
    private String path;
    private int sequence;
    private long size;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<MediaImage> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public MediaImage createFromParcel(Parcel parcel) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaImage) ipChange.ipc$dispatch("c73931f8", new Object[]{this, parcel});
            }
            MediaImage mediaImage = new MediaImage();
            mediaImage.id = parcel.readString();
            mediaImage.path = parcel.readString();
            mediaImage.size = parcel.readLong();
            mediaImage.displayName = parcel.readString();
            if (parcel.readInt() != 1) {
                z = false;
            }
            mediaImage.isEdited = z;
            mediaImage.mimeType = parcel.readString();
            mediaImage.sequence = parcel.readInt();
            return mediaImage;
        }

        /* renamed from: b */
        public MediaImage[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaImage[]) ipChange.ipc$dispatch("e55574ef", new Object[]{this, new Integer(i)});
            }
            return new MediaImage[i];
        }
    }

    static {
        t2o.a(623902751);
    }

    public MediaImage() {
    }

    public static MediaImage valueOf(Cursor cursor) {
        String string;
        String string2 = cursor.getString(cursor.getColumnIndex("_id"));
        if (nxv.a()) {
            string = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, string2).toString();
        } else {
            string = cursor.getString(cursor.getColumnIndex("_data"));
        }
        return new MediaImage(string2, string, cursor.getLong(cursor.getColumnIndex("_size")), cursor.getString(cursor.getColumnIndex("_display_name")), cursor.getString(cursor.getColumnIndex("mime_type")));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.id;
        String str2 = ((MediaImage) obj).id;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getId() {
        return this.id;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getPath() {
        return this.path;
    }

    public int getSequence() {
        return this.sequence;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isEdited() {
        return this.isEdited;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setEdited(boolean z) {
        this.isEdited = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.path);
        parcel.writeLong(this.size);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.isEdited ? 1 : 0);
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.sequence);
    }

    public MediaImage(String str, String str2, long j, String str3, String str4) {
        this.displayName = str3;
        this.id = str;
        this.path = str2;
        this.size = j;
        this.mimeType = str4;
    }
}
